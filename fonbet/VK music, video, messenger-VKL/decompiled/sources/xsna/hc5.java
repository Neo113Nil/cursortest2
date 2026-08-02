package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.mk50;

/* compiled from: AuthorSelectionBottomSheetMvi.kt */
/* loaded from: classes4.dex */
public final class hc5 extends tl50<ic5, zc5, ec5> {
    public static final /* synthetic */ qcy<Object>[] m1;
    public final nf3 i1 = new nf3();
    public wd3 j1;
    public mi10 k1;
    public t440 l1;

    /* compiled from: AuthorSelectionBottomSheetMvi.kt */
    public static final class a extends kmu0 {
        public final ArrayList h;
        public final PostingAuthorUiModel i;
        public final wd3 j;
        public final t440 k;

        public a(FragmentActivity fragmentActivity, ArrayList arrayList, PostingAuthorUiModel postingAuthorUiModel, wd3 wd3Var, t440 t440Var) {
            super(fragmentActivity, tzp0.a(null, 3));
            this.h = arrayList;
            this.i = postingAuthorUiModel;
            this.j = wd3Var;
            this.k = t440Var;
            x(0);
            u(0);
            cpo cpoVar = new cpo(false, 0, 7);
            cpoVar.d = 1.0f;
            c(cpoVar);
            s(m33.a(R.drawable.vk_icon_cancel_outline_28, fragmentActivity));
            v0(R.string.posting_author_selection_title);
            I(true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            hc5 hc5Var = new hc5();
            hc5Var.setArguments(yfb.b(new Pair("ARG_AUTHORS", new ArrayList(this.h)), new Pair("ARG_SELECTED_AUTHOR", this.i)));
            hc5Var.j1 = this.j;
            hc5Var.l1 = this.k;
            return hc5Var;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(hc5.class, "contentView", "getContentView()Lcom/vk/newsfeed/impl/items/posting/item/modals/feed_posting/feature/author_selection/AuthorSelectionView;", 0);
        fpf0.a.getClass();
        m1 = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        qc5 qc5Var = new qc5(requireContext(), this);
        vq.b(-1, -2, qc5Var.d);
        qcy<Object> qcyVar = m1[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = qc5Var;
        return new mk50.c(((qc5) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.dw20
    public final nw20 Fn(int i, Context context) {
        return new npi(context, i);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((qc5) this.i1.getValue(this, m1[0])).f((zc5) ao50Var, new pw4(1, this, hc5.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 1));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((ic5) vk50Var).g.a(new u8(this, 7), this);
    }

    @Override // xsna.dw20
    public final boolean a0() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return super.a0();
        }
        mi10 mi10Var = this.k1;
        return mi10Var != null ? ((Boolean) mi10Var.invoke(activity)).booleanValue() : super.a0();
    }

    @Override // xsna.dw20, androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        t440 t440Var;
        super.onCancel(dialogInterface);
        FragmentActivity activity = getActivity();
        if (activity == null || (t440Var = this.l1) == null) {
            return;
        }
        t440Var.invoke(activity);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        int i = Build.VERSION.SDK_INT;
        ArrayList parcelableArrayList = i >= 33 ? bundle.getParcelableArrayList("ARG_AUTHORS", PostingAuthorUiModel.class) : bundle.getParcelableArrayList("ARG_AUTHORS");
        if (parcelableArrayList == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i >= 33) {
            parcelable2 = bundle.getParcelable("ARG_SELECTED_AUTHOR", PostingAuthorUiModel.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("ARG_SELECTED_AUTHOR");
            if (!(parcelable3 instanceof PostingAuthorUiModel)) {
                parcelable3 = null;
            }
            parcelable = (PostingAuthorUiModel) parcelable3;
        }
        if (parcelable != null) {
            return new ic5(((NewsFeedComponent) m7m.d(this).a(fpf0.a(NewsFeedComponent.class))).De(), parcelableArrayList, (PostingAuthorUiModel) parcelable);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
