package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.coowners.presentation.util.PostInfoData;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.ee60;
import xsna.mk50;

/* compiled from: NewsfeedCoownersListBottomSheet.kt */
/* loaded from: classes17.dex */
public final class ge60 extends tl50<he60, oe60, ee60> {
    public static final /* synthetic */ int l1 = 0;
    public ne60 i1;
    public final Object j1;
    public final Object k1;

    /* compiled from: NewsfeedCoownersListBottomSheet.kt */
    public static final class a extends kmu0 {
        public final PostInfoData h;
        public final NewsfeedCoowners i;

        public a(Context context, PostInfoData postInfoData, NewsfeedCoowners newsfeedCoowners) {
            super(context, tzp0.a(null, 3));
            this.h = postInfoData;
            this.i = newsfeedCoowners;
            F0(true);
            J();
            n0(0);
            o0(0);
            p0(0);
            m0(0);
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ge60 ge60Var = new ge60();
            ge60Var.setArguments(yfb.b(new Pair("arg_post_info_data", this.h), new Pair("arg_coowners", this.i)));
            return ge60Var;
        }
    }

    public ge60() {
        q010 q010Var = new q010(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j1 = msy.a(lazyThreadSafetyMode, q010Var);
        this.k1 = msy.a(lazyThreadSafetyMode, new nwk(this, 26));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        ne60 ne60Var = new ne60(requireContext(), this, new fe60(this, 0), new w620(this, 6));
        this.i1 = ne60Var;
        return new mk50.c(ne60Var.c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        oe60 oe60Var = (oe60) ao50Var;
        ne60 ne60Var = this.i1;
        if (ne60Var != null) {
            ne60Var.f(oe60Var, new tw4(1, this, ge60.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 11));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((he60) vk50Var).g.a(new whe(1, this, ge60.class, "handleSideEffect", "handleSideEffect(Lcom/vk/coowners/presentation/bottomsheet/NewsfeedCoownersListSideEffect;)V", 0, 10), this);
    }

    @Override // xsna.dw20, androidx.fragment.app.d
    public final int vn() {
        return R.style.NewsFeedCoownersListBottomSheetStyle;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Object parcelable3;
        Object parcelable4;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelable4 = bundle.getParcelable("arg_post_info_data", PostInfoData.class);
            parcelable = (Parcelable) parcelable4;
        } else {
            Parcelable parcelable5 = bundle.getParcelable("arg_post_info_data");
            if (!(parcelable5 instanceof PostInfoData)) {
                parcelable5 = null;
            }
            parcelable = (PostInfoData) parcelable5;
        }
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        PostInfoData postInfoData = (PostInfoData) parcelable;
        if (i >= 33) {
            parcelable3 = bundle.getParcelable("arg_coowners", NewsfeedCoowners.class);
            parcelable2 = (Parcelable) parcelable3;
        } else {
            Parcelable parcelable6 = bundle.getParcelable("arg_coowners");
            parcelable2 = (NewsfeedCoowners) (parcelable6 instanceof NewsfeedCoowners ? parcelable6 : null);
        }
        if (parcelable2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        NewsfeedCoowners newsfeedCoowners = (NewsfeedCoowners) parcelable2;
        List<NewsfeedCoowners.CoownerStatus> list = newsfeedCoowners.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            NewsfeedCoowners.CoownerStatus coownerStatus = (NewsfeedCoowners.CoownerStatus) obj;
            if (!coownerStatus.e && !epx.f(coownerStatus.b.b, ((b25) this.k1.getValue()).c())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((NewsfeedCoowners.CoownerStatus) it.next()).b.b.b));
        }
        return new he60(new ee60.b(newsfeedCoowners), new ke60(new me60(postInfoData, newsfeedCoowners, arrayList2), new se60(new pe60(requireContext(), new zq70()))), new p2r());
    }
}
