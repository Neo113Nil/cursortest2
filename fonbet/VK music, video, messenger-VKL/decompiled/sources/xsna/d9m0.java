package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a9m0;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.xn50;

/* compiled from: StoryPrivacyBottomSheet.kt */
/* loaded from: classes16.dex */
public final class d9m0 extends tl50<p9m0, lam0, a9m0> implements w8i {
    public static final /* synthetic */ int n1 = 0;
    public final zzs<StoryPrivacyType, StoryPrivacyType, List<UserId>, List<UserId>, s3q0> i1;
    public final gzs<s3q0> j1;
    public final bpn0 k1;
    public final bpn0 l1;
    public boolean m1;

    /* compiled from: StoryPrivacyBottomSheet.kt */
    public static final class a extends dw20.b {
        public final StoryPrivacyType e;
        public final StoryPrivacyType f;
        public final List<UserId> g;
        public final List<UserId> h;
        public final List<UserId> i;
        public final zzs<StoryPrivacyType, StoryPrivacyType, List<UserId>, List<UserId>, s3q0> j;
        public final com.vk.movika.sdk.base.flow.binding.j k;
        public final boolean l;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Context context, StoryPrivacyType storyPrivacyType, StoryPrivacyType storyPrivacyType2, List list, List list2, List list3, zzs zzsVar, com.vk.movika.sdk.base.flow.binding.j jVar, boolean z) {
            super((r0 == null || r0.intValue() != dhr0.u().c) ? new l7s(context, dhr0.u().c) : context, null);
            lpj lpjVar = context instanceof lpj ? (lpj) context : null;
            Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
            dhr0.a.getClass();
            this.e = storyPrivacyType;
            this.f = storyPrivacyType2;
            this.g = list;
            this.h = list2;
            this.i = list3;
            this.j = zzsVar;
            this.k = jVar;
            this.l = z;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            v0(R.string.story_privacy_title);
            B0(Integer.valueOf(cn70.b(14)));
            x0(Integer.valueOf(cn70.b(14)));
            A0(Integer.valueOf(R.style.VkUiTypography_DisplayTitle2));
            l(e3m.f(R.attr.vk_ui_background_content, this.c));
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            d9m0 d9m0Var = new d9m0(this.j, this.k);
            d9m0Var.setArguments(yfb.b(new Pair("SELECTED_PRIVACY_TYPE", this.e), new Pair("OLD_PRIVACY_TYPE", this.f), new Pair("BEST_FRIENDS", p4g.q(this.g)), new Pair("EXCLUDED_FRIENDS", p4g.q(this.h)), new Pair("INCLUDED_FRIENDS", p4g.q(this.i)), new Pair("WITH_CONFIRM_BUTTON", Boolean.valueOf(this.l))));
            return d9m0Var;
        }
    }

    public d9m0() {
        this(new ebi(1), new g2c0(7));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.layout_story_privacy);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        lam0 lam0Var = (lam0) ao50Var;
        this.e0 = new jgj(view, 0, 0, 62);
        Context requireContext = requireContext();
        lpj lpjVar = requireContext instanceof lpj ? (lpj) requireContext : null;
        Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
        dhr0.a.getClass();
        jam0 jam0Var = new jam0((valueOf != null && valueOf.intValue() == dhr0.u().c) ? requireContext : new l7s(requireContext, dhr0.u().c), this, view, this.m1, new emh0(this, 6));
        gm50.a.b(jam0Var, lam0Var.a, new pod0(jam0Var, 13));
        getFeature().j.a(new z8l0(this, 3), this);
        if (this.m1) {
            return;
        }
        Vn(new x550(this, 28));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> stringArrayListExtra;
        if (i2 != -1 || intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("chosen_friends_ids")) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(c5g.u(stringArrayListExtra, 10));
        Iterator<T> it = stringArrayListExtra.iterator();
        while (it.hasNext()) {
            arrayList.add(new UserId(Long.parseLong((String) it.next())));
        }
        if (i == 1000) {
            xn50.a.c(this, new a9m0.i(arrayList));
        } else {
            if (i != 1001) {
                return;
            }
            xn50.a.c(this, new a9m0.h((arrayList.isEmpty() && ((gpj0) this.l1.getValue()).d()) ? StoryPrivacyType.FRIENDS : arrayList.isEmpty() ? StoryPrivacyType.ALL : StoryPrivacyType.BEST_FRIENDS, arrayList));
        }
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        StoryPrivacyType storyPrivacyType = (StoryPrivacyType) bundle.getParcelable("SELECTED_PRIVACY_TYPE");
        bpn0 bpn0Var = this.l1;
        if (storyPrivacyType == null) {
            storyPrivacyType = ((gpj0) bpn0Var.getValue()).d() ? StoryPrivacyType.FRIENDS : StoryPrivacyType.ALL;
        }
        StoryPrivacyType storyPrivacyType2 = storyPrivacyType;
        StoryPrivacyType storyPrivacyType3 = (StoryPrivacyType) bundle.getParcelable("OLD_PRIVACY_TYPE");
        List parcelableArrayList = bundle.getParcelableArrayList("BEST_FRIENDS");
        if (parcelableArrayList == null) {
            parcelableArrayList = EmptyList.b;
        }
        List list = parcelableArrayList;
        List parcelableArrayList2 = bundle.getParcelableArrayList("EXCLUDED_FRIENDS");
        if (parcelableArrayList2 == null) {
            parcelableArrayList2 = EmptyList.b;
        }
        List list2 = parcelableArrayList2;
        List parcelableArrayList3 = bundle.getParcelableArrayList("INCLUDED_FRIENDS");
        if (parcelableArrayList3 == null) {
            parcelableArrayList3 = EmptyList.b;
        }
        List list3 = parcelableArrayList3;
        this.m1 = bundle.getBoolean("WITH_CONFIRM_BUTTON");
        return new p9m0(requireContext(), (gpj0) bpn0Var.getValue(), storyPrivacyType2, storyPrivacyType3, list, list2, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d9m0(zzs<? super StoryPrivacyType, ? super StoryPrivacyType, ? super List<UserId>, ? super List<UserId>, s3q0> zzsVar, gzs<s3q0> gzsVar) {
        this.i1 = zzsVar;
        this.j1 = gzsVar;
        this.k1 = new bpn0(new y3l0(this, 4));
        this.l1 = new bpn0(new c9m0(this, 0));
    }
}
