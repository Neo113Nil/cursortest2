package xsna;

import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.horizontal.HorizontalListItem$Size;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.profile.CommunityInternalMenu$Companion$MenuItemType;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import xsna.iev;
import xsna.iy5;
import xsna.jfv;
import xsna.phw;
import xsna.q630;
import xsna.xpv;
import xsna.xrh;
import xsna.z4h;

/* compiled from: CommunityInternalMenuItem.kt */
/* loaded from: classes5.dex */
public final class d5h extends jfv {
    public final o5h l;
    public final ul1 m;
    public final VkOnboardingComponent n;
    public WeakReference<RecyclerView> o;

    /* compiled from: CommunityInternalMenuItem.kt */
    @ozl
    public static final class a extends RecyclerView.Adapter<c> {
        public final List<z4h.a> c;
        public final ul1 d;

        public a(ArrayList arrayList, ul1 ul1Var) {
            this.c = arrayList;
            this.d = ul1Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return this.c.get(i).g.ordinal();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(c cVar, int i) {
            c cVar2 = cVar;
            cVar2.V5(this.c.get(i));
            ((wak0) cVar2.o).C(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final c onCreateViewHolder(ViewGroup viewGroup, int i) {
            ComposeView e = sv1.e(viewGroup.getContext());
            e.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            return new c(viewGroup, e, this.d);
        }
    }

    /* compiled from: CommunityInternalMenuItem.kt */
    public static final class b extends RecyclerView.Adapter<s5h> {
        public final List<z4h.a> c;
        public final boolean d;
        public final ul1 e;
        public final xrh.c.b f;

        public b(ArrayList arrayList, boolean z, ul1 ul1Var, xrh.c.b bVar) {
            this.c = arrayList;
            this.d = z;
            this.e = ul1Var;
            this.f = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return this.c.get(i).g.ordinal();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(s5h s5hVar, int i) {
            s5h s5hVar2 = s5hVar;
            s5hVar2.V5(this.c.get(i));
            ((wak0) s5hVar2.o).C(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final s5h onCreateViewHolder(ViewGroup viewGroup, int i) {
            ComposeView e = sv1.e(viewGroup.getContext());
            vq.b(-2, -2, e);
            int ordinal = CommunityInternalMenu$Companion$MenuItemType.ADMIN_GEAR.ordinal();
            ul1 ul1Var = this.e;
            if (i == ordinal) {
                return new h5h(viewGroup, e, true, ul1Var);
            }
            int ordinal2 = CommunityInternalMenu$Companion$MenuItemType.BUSINESS_APP.ordinal();
            boolean z = this.d;
            return i == ordinal2 ? new j5h(viewGroup, e, z, ul1Var) : new j5h(viewGroup, e, z, ul1Var);
        }
    }

    /* compiled from: CommunityInternalMenuItem.kt */
    @ozl
    public static final class c extends vif0<z4h.a> {
        public static final /* synthetic */ int t = 0;
        public final izs<CommunityProfileAction.CommunityInternalMenuAction, s3q0> n;
        public final rg50 o;
        public final wh50 p;
        public final wh50 q;
        public final wh50 r;
        public final rg50 s;

        /* compiled from: CommunityInternalMenuItem.kt */
        public static final class a implements iy5 {
            public final BadgeAlignment a = BadgeAlignment.TopRight;
            public final rg50 b;

            public a(int i) {
                this.b = androidx.compose.runtime.i.a(i);
            }

            @Override // xsna.m2k0
            public final long a(long j, boolean z, androidx.compose.runtime.a aVar, int i) {
                return iy5.a.b(this, j, z, aVar, i);
            }

            @Override // xsna.m2k0
            public final r5j0 b(long j, boolean z, androidx.compose.runtime.a aVar, int i) {
                iy5.a.e(i, aVar);
                return null;
            }

            @Override // xsna.m2k0
            public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
                q630 q630Var2;
                androidx.compose.runtime.a M = aVar.M(-320433815);
                int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
                if (M.t(i2 & 1, (i2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-320433815, i2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItem.ViewHolder.MenuItemBadgeCounter.invoke (CommunityInternalMenuItem.kt:416)");
                    }
                    q630Var2 = q630Var;
                    nou0.a(((wak0) this.b).getIntValue(), CounterSize.Small, CounterAppearance.Design.Neutral, q630Var2, CounterMode.Primary, false, M, ((i2 << 9) & 7168) | 25008, 32);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    q630Var2 = q630Var;
                    M.h();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new cg4(this, q630Var2, i, 2);
                }
            }

            @Override // xsna.m2k0
            public final long d(long j) {
                float f = xcv0.a;
                return xcv0.a(Math.min(uco.c(j), uco.b(j)));
            }

            @Override // xsna.iy5
            public final long e(float f, long j) {
                return iy5.a.a(this, j, f);
            }

            @Override // xsna.iy5
            public final long f(int i, long j, androidx.compose.runtime.a aVar) {
                return iy5.a.c(this, j, aVar, i);
            }

            @Override // xsna.iy5
            public final long g(int i, long j, androidx.compose.runtime.a aVar) {
                return iy5.a.d(this, j, aVar, i);
            }

            @Override // xsna.m2k0
            public final BadgeAlignment getAlignment() {
                return this.a;
            }
        }

        public c(ViewGroup viewGroup, ComposeView composeView, ul1 ul1Var) {
            super(composeView, viewGroup);
            this.n = ul1Var;
            this.o = androidx.compose.runtime.i.a(0);
            this.p = androidx.compose.runtime.k.b("");
            this.q = androidx.compose.runtime.k.b(null);
            this.r = androidx.compose.runtime.k.b(null);
            this.s = androidx.compose.runtime.i.a(0);
            composeView.setContent(new jai(-880558623, new om9(this, 2), true));
        }

        @Override // xsna.vif0
        public final void i6(z4h.a aVar) {
            ImageSize Cb;
            z4h.a aVar2 = aVar;
            String str = aVar2.c;
            if (str == null) {
                str = "";
            }
            ((zak0) this.p).setValue(str);
            Image image = aVar2.e;
            ((zak0) this.q).setValue((image == null || (Cb = image.Cb(iah0.a((float) 82), true, false)) == null) ? null : Cb.d.d);
            ((zak0) this.r).setValue(aVar2.b);
            ((wak0) this.s).C(aVar2.f);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:60:0x030e  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x031c  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x032d  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x033e  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x034d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void q6(int i, androidx.compose.runtime.a aVar) {
            androidx.compose.runtime.a aVar2;
            a.C0011a.C0012a c0012a;
            float f;
            androidx.compose.runtime.a aVar3;
            int i2;
            lg90 z0;
            efj a2;
            rep repVar;
            androidx.compose.runtime.a M = aVar.M(1232724766);
            int i3 = i | (M.y(this) ? 4 : 2);
            if (M.t(i3 & 1, (i3 & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1232724766, i3, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItem.ViewHolder.Content (CommunityInternalMenuItem.kt:276)");
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                if (x == c0012a2) {
                    x = bbk0.b(new trf(this, 3));
                    M.R(x);
                }
                mtk0 mtk0Var = (mtk0) x;
                float f2 = kqu0.r;
                q630 d = rte0.d(txj0.v(q630.a.a, (2 * f2) + 82.0f), vog0.a(cn70.c(4)));
                boolean y = M.y(this);
                Object x2 = M.x();
                if (y || x2 == c0012a2) {
                    e5h e5hVar = new e5h(0, this, c.class, "onClick", "onClick()V", 0);
                    M.R(e5hVar);
                    x2 = e5hVar;
                }
                fcy fcyVar = (fcy) x2;
                boolean y2 = M.y(this);
                Object x3 = M.x();
                if (y2 || x3 == c0012a2) {
                    f5h f5hVar = new f5h(0, this, c.class, "onLongClick", "onLongClick()V", 0);
                    M.R(f5hVar);
                    x3 = f5hVar;
                }
                fcy fcyVar2 = (fcy) x3;
                mlg0 a3 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
                Object x4 = M.x();
                if (x4 == c0012a2) {
                    x4 = ir.h(M);
                }
                q630 E = ahn.E(ojc.d(d, (sg50) x4, a3, false, null, (gzs) fcyVar2, (gzs) fcyVar, 444), "CommunityInternalMenuItem");
                HorizontalListItem$Size.WithPicture withPicture = HorizontalListItem$Size.WithPicture.Small;
                wh50 wh50Var = this.q;
                if (((String) ((zak0) wh50Var).getValue()) != null) {
                    M.K(2134074219);
                    c0012a = c0012a2;
                    f = f2;
                    i2 = -1;
                    a2 = phw.a.a(fwu0.l((String) ((zak0) wh50Var).getValue(), null, null, null, M, 0, 62), null, null, null, null, M, 196616, 30);
                    aVar3 = M;
                    aVar3.j();
                } else {
                    c0012a = c0012a2;
                    f = f2;
                    aVar3 = M;
                    i2 = -1;
                    aVar3.K(2134237682);
                    String str = (String) ((zak0) this.r).getValue();
                    int i4 = (i3 << 3) & 112;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-40455472, i4, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItem.ViewHolder.<get-icon> (CommunityInternalMenuItem.kt:389)");
                    }
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -1937264505:
                                if (str.equals("artist_page")) {
                                    aVar3.K(-222981478);
                                    qzu0.a.getClass();
                                    z0 = qzu0.P0(aVar3);
                                    aVar3.j();
                                    break;
                                }
                                break;
                            case -732377866:
                                if (str.equals("article")) {
                                    aVar3.K(-222997991);
                                    qzu0.a.getClass();
                                    z0 = qzu0.g(aVar3);
                                    aVar3.j();
                                    break;
                                }
                                break;
                            case 96801:
                                if (str.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                                    aVar3.K(-222979270);
                                    qzu0.a.getClass();
                                    z0 = qzu0.k1(aVar3);
                                    aVar3.j();
                                    break;
                                }
                                break;
                            case 3446944:
                                if (str.equals("post")) {
                                    aVar3.K(-223000326);
                                    qzu0.a.getClass();
                                    z0 = qzu0.U0(aVar3);
                                    aVar3.j();
                                    break;
                                }
                                break;
                            case 3599307:
                                if (str.equals("user")) {
                                    aVar3.K(-222977034);
                                    qzu0.a.getClass();
                                    z0 = qzu0.w1(aVar3);
                                    aVar3.j();
                                    break;
                                }
                                break;
                            case 96891546:
                                if (str.equals(NotificationCompat.CATEGORY_EVENT)) {
                                    aVar3.K(-222972713);
                                    qzu0.a.getClass();
                                    z0 = qzu0.z1(aVar3);
                                    aVar3.j();
                                    break;
                                }
                                break;
                            case 98629247:
                                if (str.equals("group")) {
                                    aVar3.K(-222974889);
                                    qzu0.a.getClass();
                                    z0 = qzu0.z1(aVar3);
                                    aVar3.j();
                                    break;
                                }
                                break;
                            case 106642994:
                                if (str.equals("photo")) {
                                    aVar3.K(-222993351);
                                    qzu0.a.getClass();
                                    z0 = qzu0.W(aVar3);
                                    aVar3.j();
                                    break;
                                }
                                break;
                            case 112202875:
                                if (str.equals("video")) {
                                    aVar3.K(-222991113);
                                    qzu0.a.getClass();
                                    z0 = qzu0.D1(aVar3);
                                    aVar3.j();
                                    break;
                                }
                                break;
                            case 284943683:
                                if (str.equals("market_cart")) {
                                    aVar3.K(-222970344);
                                    qzu0.a.getClass();
                                    z0 = qzu0.I0(aVar3);
                                    aVar3.j();
                                    break;
                                }
                                break;
                            case 285140278:
                                if (str.equals("market_item")) {
                                    aVar3.K(-222995560);
                                    qzu0.a.getClass();
                                    z0 = qzu0.I0(aVar3);
                                    aVar3.j();
                                    break;
                                }
                                break;
                            case 706951208:
                                if (str.equals("discussion")) {
                                    aVar3.K(-222988771);
                                    qzu0.a.getClass();
                                    z0 = qzu0.D(aVar3);
                                    aVar3.j();
                                    break;
                                }
                                break;
                            case 861720859:
                                if (str.equals("document")) {
                                    aVar3.K(-222986310);
                                    qzu0.a.getClass();
                                    z0 = qzu0.F(aVar3);
                                    aVar3.j();
                                    break;
                                }
                                break;
                            case 1879474642:
                                if (str.equals("playlist")) {
                                    aVar3.K(-222983942);
                                    qzu0.a.getClass();
                                    z0 = qzu0.e1(aVar3);
                                    aVar3.j();
                                    break;
                                }
                                break;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        iyk0 iyk0Var = rrv0.a;
                        ylu0 ylu0Var = (ylu0) aVar3.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.l().Q;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        a2 = xpv.a.a(z0, j, new rek0(ylu0Var2.getImage().b), aVar3, 24584, 8);
                        aVar3.j();
                    }
                    aVar3.K(-222969034);
                    qzu0.a.getClass();
                    z0 = qzu0.z0(aVar3);
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    iyk0 iyk0Var2 = rrv0.a;
                    ylu0 ylu0Var3 = (ylu0) aVar3.r(iyk0Var2);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    long j2 = ylu0Var3.l().Q;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    ylu0 ylu0Var22 = (ylu0) aVar3.r(iyk0Var2);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    a2 = xpv.a.a(z0, j2, new rek0(ylu0Var22.getImage().b), aVar3, 24584, 8);
                    aVar3.j();
                }
                PictureRadius pictureRadius = PictureRadius.Large;
                if (((Boolean) mtk0Var.getValue()).booleanValue()) {
                    aVar3.K(2134753305);
                    int intValue = ((wak0) this.s).getIntValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-874959858, 48, i2, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItem.ViewHolder.MenuItemBadgeCounter.Companion.invoke (CommunityInternalMenuItem.kt:429)");
                    }
                    Object x5 = aVar3.x();
                    if (x5 == c0012a) {
                        x5 = new a(intValue);
                        aVar3.R(x5);
                    }
                    a aVar4 = (a) x5;
                    ((wak0) aVar4.b).C(intValue);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar3.j();
                    repVar = aVar4;
                } else {
                    aVar3.K(2134833130);
                    aVar3.j();
                    repVar = rep.a;
                }
                androidx.compose.runtime.a aVar5 = aVar3;
                azu0.b(withPicture, HorizontalListItem$VisualContent.e.a(a2, 1.4642857f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pictureRadius, repVar, aVar5, 3072, 4), iev.c.a((String) ((zak0) this.p).getValue(), null, 1, null, aVar5, 24576, 45), E, new gev(new uco(byc0.b(82.0f, 56.0f)), new u890(f, f, f, kqu0.t), new u890(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 8), aVar5, 6, 0);
                aVar2 = aVar5;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.d = new com.vk.movika.tools.controls.seekbar.q(this, i, 5);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d5h(o5h o5hVar, ul1 ul1Var, VkOnboardingComponent vkOnboardingComponent, boolean z) {
        super(-45, z ? new b(r0, o5hVar.d, ul1Var, o5hVar.e) : new a(r0, ul1Var), new v7(20));
        ArrayList arrayList = o5hVar.b;
        this.l = o5hVar;
        this.m = ul1Var;
        this.n = vkOnboardingComponent;
        this.k = new b5h(this, 0);
    }

    @Override // xsna.jfv, xsna.we6
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final jfv.a a(ViewGroup viewGroup) {
        this.m.invoke(new CommunityProfileAction.CommunityInternalMenuAction(CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.VIEW, null, null));
        jfv.a aVar = new jfv.a(viewGroup);
        bwt0.Z(R.attr.vk_ui_background_content, aVar.itemView);
        this.o = new WeakReference<>(aVar.n);
        return aVar;
    }
}
