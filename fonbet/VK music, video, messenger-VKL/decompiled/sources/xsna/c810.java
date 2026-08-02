package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.products_multipicker.api.MarketMultiPickerSource;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.tzp0;

/* compiled from: MarketMultiPickerBottomSheet.kt */
/* loaded from: classes18.dex */
public final class c810 extends tl50<f810, c910, z710> {
    public static final /* synthetic */ int o1 = 0;
    public zl20 i1;
    public mgz j1;
    public f910 k1;
    public izs<? super na10, s3q0> l1;
    public final Object m1;
    public final Object n1;

    /* compiled from: MarketMultiPickerBottomSheet.kt */
    public static final class a extends dw20.b {
        public static final tzp0.c.a p = new tzp0.c.a(new C2647a(), false);
        public final int e;
        public final List<MultipickerProduct> f;
        public final boolean g;
        public final UserId h;
        public final boolean i;
        public final Integer j;
        public final MarketMultiPickerSource k;
        public zl20 l;
        public String m;
        public izs<? super na10, s3q0> n;
        public mgz o;

        /* compiled from: MarketMultiPickerBottomSheet.kt */
        /* renamed from: xsna.c810$a$a, reason: collision with other inner class name */
        public static final class C2647a implements m0q0 {
            @Override // xsna.m0q0
            public final void y(UiTrackingScreen uiTrackingScreen) {
                uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEMS_MULTIPICKER;
            }
        }

        /* compiled from: MarketMultiPickerBottomSheet.kt */
        public static final class b implements fcn {
            @Override // xsna.fcn
            public final boolean M4() {
                return true;
            }

            @Override // xsna.fcn
            public final boolean N8() {
                return false;
            }

            @Override // xsna.fcn
            public final void b(boolean z) {
                b(false);
            }

            @Override // xsna.fcn
            public final void dismiss() {
                b(false);
            }

            @Override // xsna.fcn
            public final boolean v6() {
                return false;
            }
        }

        public a(Context context, int i, List<MultipickerProduct> list, boolean z, UserId userId, boolean z2, Integer num, MarketMultiPickerSource marketMultiPickerSource) {
            super(context, p);
            this.e = i;
            this.f = list;
            this.g = z;
            this.h = userId;
            this.i = z2;
            this.j = num;
            this.k = marketMultiPickerSource;
            c(new ts90(1.0f, 2));
            q0(false);
            F0(true);
            x(0);
            m0(0);
            B(iah0.a(12), true, false);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            c810 c810Var = new c810();
            Context context = this.c;
            c810Var.i1 = this.l;
            c810Var.j1 = this.o;
            c810Var.l1 = this.n;
            Pair pair = new Pair("key_max_attach_count", Integer.valueOf(this.e));
            Pair pair2 = new Pair("key_attached_items", p4g.q(this.f));
            Pair pair3 = new Pair("key_max_count_message", this.m);
            Pair pair4 = new Pair("key_current_group_id", this.h);
            Pair pair5 = new Pair("key_is_using_public_only_groups", Boolean.valueOf(this.g));
            Pair pair6 = new Pair("shouldMeasureTechStats", Boolean.valueOf(this.n != null));
            Pair pair7 = new Pair("key_show_product_rating_or_owner", Boolean.valueOf(this.i));
            Pair pair8 = new Pair("key_posting_session_id", this.j);
            MarketMultiPickerSource marketMultiPickerSource = this.k;
            c810Var.setArguments(yfb.b(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("key_posting_ref_source", marketMultiPickerSource != null ? marketMultiPickerSource.name() : null)));
            b bVar = new b();
            ComponentCallbacks2 h = context != null ? e3m.h(context) : null;
            ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
            ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
            d0(new ag1(7, Y, bVar));
            a0(new com.vk.movika.sdk.android.defaultplayer.container.e(14, Y, bVar));
            return c810Var;
        }
    }

    public c810() {
        s6y s6yVar = new s6y(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m1 = msy.a(lazyThreadSafetyMode, s6yVar);
        this.n1 = msy.a(lazyThreadSafetyMode, new gzv(this, 7));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        f910 f910Var = new f910(this, this.A0 == -1 ? requireContext() : new l7s(requireContext(), this.A0), this, new x4u(this, 6));
        this.k1 = f910Var;
        return new mk50.c(f910Var.f);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        TextView textView;
        int p;
        c910 c910Var = (c910) ao50Var;
        f910 f910Var = this.k1;
        if (f910Var != null) {
            f910Var.l = (VkSpinner) view.findViewById(R.id.progress);
            VKTabLayout vKTabLayout = (VKTabLayout) view.findViewById(R.id.tabs);
            vKTabLayout.f(new w540(vKTabLayout.getContext(), new q8(f910Var, 6)));
            f910Var.m = vKTabLayout;
            f910Var.k = (ViewPager) view.findViewById(R.id.viewpager);
            Context context = f910Var.c;
            TextView textView2 = null;
            View inflate = LayoutInflater.from(context).inflate(R.layout.products_multipicker_tab_selected_item, (ViewGroup) null, false);
            f910Var.h = inflate;
            f910Var.i = inflate != null ? (VkAvatar) inflate.findViewById(R.id.group_image) : null;
            View view2 = f910Var.h;
            if (view2 != null && (textView = (TextView) view2.findViewById(R.id.title)) != null) {
                f4m.p(-2, textView);
                int a2 = iah0.a(46);
                int a3 = iah0.a(24);
                if (fnj.d(view.getContext())) {
                    p = f910.D;
                } else {
                    boolean r = iah0.r(context);
                    Context context2 = view.getContext();
                    p = r ? iah0.p(context2) : iah0.z(context2);
                }
                textView.setMaxWidth(Math.abs(((p / 2) - a2) - a3));
                textView.setGravity(17);
                textView.setTextAlignment(1);
                textView2 = textView;
            }
            f910Var.j = textView2;
            ViewPager viewPager = f910Var.k;
            if (viewPager != null) {
                viewPager.setAdapter((k810) f910Var.x.getValue());
            }
            gm50.a.b(f910Var, c910Var.a, new hs00(f910Var, 3));
            gm50.a.b(f910Var, c910Var.b, new eiz(f910Var, 4));
            gm50.a.b(f910Var, c910Var.d, new qcl(f910Var, 26));
            gm50.a.b(f910Var, c910Var.c, new v4w(f910Var, 5));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((f810) vk50Var).n.a(new b810(this, 0), this);
    }

    @Override // xsna.tl50
    public final /* bridge */ /* synthetic */ void Yn(c910 c910Var, View view) {
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f910 f910Var = this.k1;
        if (f910Var != null) {
            Iterator it = f910Var.r.iterator();
            while (it.hasNext()) {
                la10 la10Var = (la10) it.next();
                int i = iah0.s(la10Var.getContext()) ? 2 : 3;
                RecyclerView recyclerView = la10Var.B;
                GridLayoutManager gridLayoutManager = la10Var.G;
                gridLayoutManager.setSpanCount(i);
                recyclerView.setLayoutManager(gridLayoutManager);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((wsd0) this.m1.getValue()).c(new fa00(this, 2));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((wsd0) this.m1.getValue()).b();
        ?? r0 = this.n1;
        a910 b = ((z810) r0.getValue()).b();
        if (b != null) {
            na10 na10Var = new na10(b.c, b.d);
            izs<? super na10, s3q0> izsVar = this.l1;
            if (izsVar != null) {
                izsVar.invoke(na10Var);
            }
        }
        ((z810) r0.getValue()).onDestroy();
        super.onDestroyView();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r7.getBoolean("shouldMeasureTechStats", false) == true) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        List list;
        boolean z;
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? arguments.getParcelableArrayList("key_attached_items", MultipickerProduct.class) : arguments.getParcelableArrayList("key_attached_items");
            if (parcelableArrayList != null) {
                list = j5g.O0(parcelableArrayList);
            }
        }
        list = EmptyList.b;
        List list2 = list;
        Bundle arguments2 = getArguments();
        int i = arguments2 != null ? arguments2.getInt("key_max_attach_count") : 10;
        Bundle arguments3 = getArguments();
        MarketMultiPickerSource marketMultiPickerSource = null;
        String string = arguments3 != null ? arguments3.getString("key_max_count_message") : null;
        Bundle arguments4 = getArguments();
        UserId userId = arguments4 != null ? (UserId) arguments4.getParcelable("key_current_group_id") : null;
        Bundle arguments5 = getArguments();
        boolean z2 = arguments5 != null ? arguments5.getBoolean("key_is_using_public_only_groups") : false;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            z = true;
        }
        z = false;
        Bundle arguments7 = getArguments();
        boolean z3 = arguments7 != null ? arguments7.getBoolean("key_show_product_rating_or_owner", false) : false;
        Bundle arguments8 = getArguments();
        Integer valueOf = arguments8 != null ? Integer.valueOf(arguments8.getInt("key_posting_session_id", 0)) : null;
        Bundle arguments9 = getArguments();
        String string2 = arguments9 != null ? arguments9.getString("key_posting_ref_source", null) : null;
        a910 a910Var = new a910(z, false, null, null);
        EmptySet emptySet = EmptySet.b;
        EmptyList emptyList = EmptyList.b;
        u810 u810Var = new u810(new y810(0, false, null, emptySet, emptyList, emptyList, 0, 0, new l810(0), "", false, false, null, null, true, emptyList, null, new l810(0), false, false, null, null, a910Var, 0));
        if (string2 != null) {
            MarketMultiPickerSource.Companion.getClass();
            Iterator<E> it = MarketMultiPickerSource.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((MarketMultiPickerSource) next).name(), string2)) {
                    marketMultiPickerSource = next;
                    break;
                }
            }
            marketMultiPickerSource = marketMultiPickerSource;
        }
        return new f810(list2, i, string, userId, z2, z3, new a810(valueOf, marketMultiPickerSource), u810Var);
    }
}
