package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.feature.kyc.internal.screens.photo.views.CaptionButtonView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;

/* loaded from: classes3.dex */
public final class e761 implements zo31 {
    public final ConstraintLayout a;
    public final CaptionButtonView b;
    public final AppCompatImageView c;
    public final YbButtonViewGroup d;
    public final PreviewView e;
    public final ErrorView f;
    public final AppCompatImageView g;
    public final View h;
    public final AppCompatImageView i;
    public final FullscreenStatusView j;
    public final LinearLayout k;
    public final AppCompatImageView l;
    public final AppCompatTextView m;
    public final ToolbarView n;

    public e761(ConstraintLayout constraintLayout, CaptionButtonView captionButtonView, AppCompatImageView appCompatImageView, YbButtonViewGroup ybButtonViewGroup, PreviewView previewView, ErrorView errorView, AppCompatImageView appCompatImageView2, View view, AppCompatImageView appCompatImageView3, FullscreenStatusView fullscreenStatusView, LinearLayout linearLayout, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = captionButtonView;
        this.c = appCompatImageView;
        this.d = ybButtonViewGroup;
        this.e = previewView;
        this.f = errorView;
        this.g = appCompatImageView2;
        this.h = view;
        this.i = appCompatImageView3;
        this.j = fullscreenStatusView;
        this.k = linearLayout;
        this.l = appCompatImageView4;
        this.m = appCompatTextView;
        this.n = toolbarView;
    }

    public static e761 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(jnh0.ybsdk_screen_kyc_photo_v2, viewGroup, false);
        int i = cbh0.buttonCaption;
        CaptionButtonView captionButtonView = (CaptionButtonView) cma1.O(i, inflate);
        if (captionButtonView != null) {
            i = cbh0.buttonFlash;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
            if (appCompatImageView != null) {
                i = cbh0.buttons;
                YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i, inflate);
                if (ybButtonViewGroup != null) {
                    i = cbh0.cameraPreview;
                    PreviewView previewView = (PreviewView) cma1.O(i, inflate);
                    if (previewView != null) {
                        i = cbh0.errorView;
                        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                        if (errorView != null) {
                            i = cbh0.frame;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, inflate);
                            if (appCompatImageView2 != null && (O = cma1.O((i = cbh0.frontLight), inflate)) != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                i = cbh0.photoPreview;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) cma1.O(i, inflate);
                                if (appCompatImageView3 != null) {
                                    i = cbh0.statusView;
                                    FullscreenStatusView fullscreenStatusView = (FullscreenStatusView) cma1.O(i, inflate);
                                    if (fullscreenStatusView != null) {
                                        i = cbh0.tipContainer;
                                        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                                        if (linearLayout != null) {
                                            i = cbh0.tipIcon;
                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) cma1.O(i, inflate);
                                            if (appCompatImageView4 != null) {
                                                i = cbh0.tipText;
                                                AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                                                if (appCompatTextView != null) {
                                                    i = cbh0.toolbar;
                                                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                    if (toolbarView != null) {
                                                        return new e761(constraintLayout, captionButtonView, appCompatImageView, ybButtonViewGroup, previewView, errorView, appCompatImageView2, O, appCompatImageView3, fullscreenStatusView, linearLayout, appCompatImageView4, appCompatTextView, toolbarView);
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
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
