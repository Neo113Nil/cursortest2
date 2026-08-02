package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.ybsdk.feature.kyc.internal.screens.photo.views.PunchHoleView;
import com.ybsdk.feature.kyc.internal.screens.photo.views.RotateLayout;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;

/* loaded from: classes3.dex */
public final class c761 implements zo31 {
    public final FrameLayout a;
    public final PreviewView b;
    public final d761 c;
    public final ErrorView d;
    public final View e;
    public final View f;
    public final RotateLayout g;
    public final FullscreenStatusView h;

    public c761(FrameLayout frameLayout, PreviewView previewView, d761 d761Var, ErrorView errorView, View view, View view2, RotateLayout rotateLayout, FullscreenStatusView fullscreenStatusView) {
        this.a = frameLayout;
        this.b = previewView;
        this.c = d761Var;
        this.d = errorView;
        this.e = view;
        this.f = view2;
        this.g = rotateLayout;
        this.h = fullscreenStatusView;
    }

    public static c761 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View O2;
        View O3;
        View O4;
        View O5;
        View inflate = layoutInflater.inflate(jnh0.ybsdk_screen_kyc_photo, viewGroup, false);
        int i = cbh0.cameraPreview;
        PreviewView previewView = (PreviewView) cma1.O(i, inflate);
        if (previewView != null && (O = cma1.O((i = cbh0.content), inflate)) != null) {
            int i2 = cbh0.buttonCaption;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, O);
            if (appCompatImageView != null) {
                i2 = cbh0.captionBlockFrameContainer;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i2, O);
                if (appCompatImageView2 != null) {
                    i2 = cbh0.captionBlockGuideline;
                    if (((Guideline) cma1.O(i2, O)) != null) {
                        i2 = cbh0.captionBlockPrompt;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i2, O);
                        if (appCompatTextView != null) {
                            i2 = cbh0.captionGroup;
                            Group group = (Group) cma1.O(i2, O);
                            if (group != null && (O2 = cma1.O((i2 = cbh0.gradient), O)) != null) {
                                i2 = cbh0.navigationBarSpace;
                                Space space = (Space) cma1.O(i2, O);
                                if (space != null) {
                                    i2 = cbh0.photoPreview;
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) cma1.O(i2, O);
                                    if (appCompatImageView3 != null && (O3 = cma1.O((i2 = cbh0.photoPreviewBackground), O)) != null) {
                                        i2 = cbh0.photoPreviewButtons;
                                        YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i2, O);
                                        if (ybButtonViewGroup != null) {
                                            i2 = cbh0.photoPreviewFrame;
                                            PunchHoleView punchHoleView = (PunchHoleView) cma1.O(i2, O);
                                            if (punchHoleView != null) {
                                                i2 = cbh0.photoPreviewGroup;
                                                Group group2 = (Group) cma1.O(i2, O);
                                                if (group2 != null) {
                                                    i2 = cbh0.photoPreviewText;
                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i2, O);
                                                    if (appCompatTextView2 != null) {
                                                        i2 = cbh0.toolbar;
                                                        ToolbarView toolbarView = (ToolbarView) cma1.O(i2, O);
                                                        if (toolbarView != null) {
                                                            d761 d761Var = new d761((ConstraintLayout) O, appCompatImageView, appCompatImageView2, appCompatTextView, group, O2, space, appCompatImageView3, O3, ybButtonViewGroup, punchHoleView, group2, appCompatTextView2, toolbarView);
                                                            i = cbh0.errorView;
                                                            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                                                            if (errorView != null && (O4 = cma1.O((i = cbh0.frontLight), inflate)) != null && (O5 = cma1.O((i = cbh0.overlay), inflate)) != null) {
                                                                i = cbh0.rotationableContainer;
                                                                RotateLayout rotateLayout = (RotateLayout) cma1.O(i, inflate);
                                                                if (rotateLayout != null) {
                                                                    i = cbh0.statusView;
                                                                    FullscreenStatusView fullscreenStatusView = (FullscreenStatusView) cma1.O(i, inflate);
                                                                    if (fullscreenStatusView != null) {
                                                                        return new c761((FrameLayout) inflate, previewView, d761Var, errorView, O4, O5, rotateLayout, fullscreenStatusView);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
            return null;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
