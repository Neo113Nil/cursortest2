package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.widgets.common.ErrorView;

/* loaded from: classes3.dex */
public final class j161 implements zo31 {
    public final ConstraintLayout a;
    public final TextView b;
    public final AppCompatImageButton c;
    public final DivSkeletonsView d;
    public final ErrorView e;
    public final AppCompatEditText f;
    public final RecyclerView g;

    public j161(ConstraintLayout constraintLayout, TextView textView, AppCompatImageButton appCompatImageButton, DivSkeletonsView divSkeletonsView, ErrorView errorView, AppCompatEditText appCompatEditText, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = appCompatImageButton;
        this.d = divSkeletonsView;
        this.e = errorView;
        this.f = appCompatEditText;
        this.g = recyclerView;
    }

    public static j161 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(nnh0.ybsdk_fragment_merchant_offers_search, viewGroup, false);
        int i = fbh0.merchantOffersSearchCancelButton;
        TextView textView = (TextView) cma1.O(i, inflate);
        if (textView != null) {
            i = fbh0.merchantOffersSearchClearButton;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) cma1.O(i, inflate);
            if (appCompatImageButton != null) {
                i = fbh0.merchantOffersSearchDivkitShimmerView;
                DivSkeletonsView divSkeletonsView = (DivSkeletonsView) cma1.O(i, inflate);
                if (divSkeletonsView != null) {
                    i = fbh0.merchantOffersSearchErrorView;
                    ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                    if (errorView != null) {
                        i = fbh0.merchantOffersSearchQueryInput;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) cma1.O(i, inflate);
                        if (appCompatEditText != null) {
                            i = fbh0.merchantOffersSearchQueryInputLayout;
                            if (((FrameLayout) cma1.O(i, inflate)) != null) {
                                i = fbh0.merchantOffersSearchResultRecycler;
                                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                if (recyclerView != null) {
                                    return new j161((ConstraintLayout) inflate, textView, appCompatImageButton, divSkeletonsView, errorView, appCompatEditText, recyclerView);
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
