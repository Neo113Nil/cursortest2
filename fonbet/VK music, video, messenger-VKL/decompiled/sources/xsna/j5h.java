package xsna;

import android.os.Build;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.horizontal.HorizontalListItem$Size;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.profile.CommunityInternalMenu$Companion$MenuItemType;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cri;
import xsna.dt1;
import xsna.iev;
import xsna.iy5;
import xsna.j5h;
import xsna.j5h.c;
import xsna.j5h.d;
import xsna.j5h.e;
import xsna.j5h.f;
import xsna.j5h.g;
import xsna.q630;
import xsna.wkj;
import xsna.z4h;

/* compiled from: CommunityInternalMenuItemHolder.kt */
/* loaded from: classes5.dex */
public final class j5h extends s5h {
    public static final /* synthetic */ int w = 0;
    public final wh50 s;
    public final wh50 t;
    public final rg50 u;
    public final wh50 v;

    /* compiled from: CommunityInternalMenuItemHolder.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(j5h j5hVar) {
            return ((z4h.a) j5hVar.m).g == CommunityInternalMenu$Companion$MenuItemType.BUSINESS_APP;
        }
    }

    /* compiled from: CommunityInternalMenuItemHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((j5h) this.receiver).onClick();
            return s3q0.a;
        }
    }

    /* compiled from: CommunityInternalMenuItemHolder.kt */
    public static final class c implements znj {
        public final /* synthetic */ long c;

        public c(long j) {
            this.c = j;
        }

        @Override // xsna.znj
        public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
            znj znjVar2;
            androidx.compose.runtime.a M = aVar.M(-1379303549);
            int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1379303549, i2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemHolder.ContextMenu.<anonymous>.<anonymous>.<no name provided>.Content (CommunityInternalMenuItemHolder.kt:248)");
                }
                j5h j5hVar = j5h.this;
                boolean y = M.y(j5hVar);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new defpackage.k(j5hVar, 22);
                    M.R(x);
                }
                qzu0.a.getClass();
                znjVar2 = znjVar;
                aou0.d(znjVar2, (gzs) x, null, null, false, znk0.B(qzu0.f(M), this.c, 0L, M, 196616, 28), nzo.d(3072, 6, M, d370.N(R.string.open, 0, M), false), null, M, i2 & 14, 78);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                znjVar2 = znjVar;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new og4(this, znjVar2, i, 2);
            }
        }
    }

    /* compiled from: CommunityInternalMenuItemHolder.kt */
    public static final class d implements znj {
        public final /* synthetic */ long c;

        public d(long j) {
            this.c = j;
        }

        @Override // xsna.znj
        public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
            znj znjVar2;
            androidx.compose.runtime.a M = aVar.M(-620829140);
            int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-620829140, i2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemHolder.ContextMenu.<anonymous>.<anonymous>.<no name provided>.Content (CommunityInternalMenuItemHolder.kt:260)");
                }
                j5h j5hVar = j5h.this;
                boolean y = M.y(j5hVar);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new ac(j5hVar, 24);
                    M.R(x);
                }
                qzu0.a.getClass();
                znjVar2 = znjVar;
                aou0.d(znjVar2, (gzs) x, null, null, false, znk0.B(qzu0.X0(M), this.c, 0L, M, 196616, 28), nzo.d(3072, 6, M, d370.N(R.string.community_menu_option_edit, 0, M), false), null, M, i2 & 14, 78);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                znjVar2 = znjVar;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new sg4(this, znjVar2, i, 1);
            }
        }
    }

    /* compiled from: CommunityInternalMenuItemHolder.kt */
    public static final class e implements znj {
        public final /* synthetic */ long c;

        public e(long j) {
            this.c = j;
        }

        @Override // xsna.znj
        public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
            znj znjVar2;
            androidx.compose.runtime.a M = aVar.M(-422096522);
            int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-422096522, i2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemHolder.ContextMenu.<anonymous>.<anonymous>.<no name provided>.Content (CommunityInternalMenuItemHolder.kt:278)");
                }
                j5h j5hVar = j5h.this;
                boolean y = M.y(j5hVar);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new g5(j5hVar, 28);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1793268258, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ViewOutline24> (VkSdkIcons.kt:3744)");
                }
                lg90 b = or.b(M, 1843695429, R.drawable.vk_icon_view_outline_24, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                znjVar2 = znjVar;
                aou0.d(znjVar2, gzsVar, null, null, false, znk0.B(b, this.c, 0L, M, 196616, 28), nzo.d(3072, 6, M, d370.N(R.string.community_menu_option_show_app, 0, M), false), null, M, i2 & 14, 78);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                znjVar2 = znjVar;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new fza(this, znjVar2, i, 2);
            }
        }
    }

    /* compiled from: CommunityInternalMenuItemHolder.kt */
    public static final class f implements znj {
        public final /* synthetic */ long c;

        public f(long j) {
            this.c = j;
        }

        @Override // xsna.znj
        public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
            znj znjVar2;
            androidx.compose.runtime.a M = aVar.M(-662891571);
            int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-662891571, i2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemHolder.ContextMenu.<anonymous>.<anonymous>.<no name provided>.Content (CommunityInternalMenuItemHolder.kt:291)");
                }
                j5h j5hVar = j5h.this;
                boolean y = M.y(j5hVar);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new k5h(j5hVar, 0);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1178006300, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-HideOutline24> (VkSdkIcons.kt:1052)");
                }
                lg90 b = or.b(M, 192266879, R.drawable.vk_icon_hide_outline_24, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                znjVar2 = znjVar;
                aou0.d(znjVar2, gzsVar, null, null, false, znk0.B(b, this.c, 0L, M, 196616, 28), nzo.d(3072, 6, M, d370.N(R.string.community_menu_option_hide_app, 0, M), false), null, M, i2 & 14, 78);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                znjVar2 = znjVar;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new xd0(this, znjVar2, i, 2);
            }
        }
    }

    /* compiled from: CommunityInternalMenuItemHolder.kt */
    public static final class g implements znj {
        public g() {
        }

        @Override // xsna.znj
        public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
            znj znjVar2;
            androidx.compose.runtime.a M = aVar.M(317321567);
            int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(317321567, i2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemHolder.ContextMenu.<anonymous>.<anonymous>.<no name provided>.Content (CommunityInternalMenuItemHolder.kt:306)");
                }
                j5h j5hVar = j5h.this;
                boolean y = M.y(j5hVar);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new yh(j5hVar, 28);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                qzu0.a.getClass();
                lg90 B = qzu0.B(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                znjVar2 = znjVar;
                aou0.d(znjVar2, gzsVar, null, null, false, znk0.B(B, ylu0Var.getIcon().h, 0L, M, 196616, 28), nzo.d(3072, 2, M, d370.N(R.string.community_menu_option_remove, 0, M), false), null, M, i2 & 14, 78);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                znjVar2 = znjVar;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new zd0(this, znjVar2, i, 1);
            }
        }
    }

    /* compiled from: CommunityInternalMenuItemHolder.kt */
    public static final class h implements efj {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d = androidx.compose.runtime.k.b(null);
        public final wh50 e;
        public final wh50 f;

        public h(lg90 lg90Var, long j, rek0 rek0Var, boolean z, boolean z2) {
            this.a = androidx.compose.runtime.k.b(lg90Var);
            this.b = zy60.d(j);
            this.c = androidx.compose.runtime.k.b(rek0Var);
            this.e = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.f = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        }

        @Override // xsna.efj
        public final void a(final int i, long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
            int i2;
            q630 g;
            final long j2 = j;
            androidx.compose.runtime.a M = aVar.M(1163848082);
            if ((i & 6) == 0) {
                i2 = (M.p(j2) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(q630Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1163848082, i2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemHolder.HideableIconContent.invoke (CommunityInternalMenuItemHolder.kt:515)");
                }
                M.K(-1072125688);
                M.j();
                M.K(1766540304);
                q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.d).getValue());
                wh50 wh50Var = this.c;
                yk8 yk8Var = (yk8) ((zak0) wh50Var).getValue();
                q630.a aVar2 = q630.a.a;
                if (yk8Var != null && (g = b.g(hr80.l(aVar2, yk8Var, null, 6))) != null) {
                    b = g;
                }
                yk8 yk8Var2 = (yk8) ((zak0) wh50Var).getValue();
                e.a aVar3 = androidx.compose.ui.graphics.e.a;
                if (yk8Var2 == null) {
                    b = b.g(hr80.m(aVar2, xcv0.c(0, M), aVar3));
                }
                M.j();
                q630 d = txj0.d(b, 1.0f);
                dt1.a.getClass();
                ty6 ty6Var = dt1.a.f;
                cp10 d2 = ja8.d(ty6Var, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, d);
                cri.h7.getClass();
                LayoutNode.a aVar4 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar4);
                } else {
                    M.f();
                }
                cri.a.c cVar = cri.a.f;
                k9q0.w(M, d2, cVar);
                cri.a.e eVar = cri.a.e;
                k9q0.w(M, D, eVar);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar = cri.a.g;
                k9q0.w(M, valueOf, bVar);
                cri.a.C2678a c2678a = cri.a.h;
                k9q0.t(M, c2678a);
                cri.a.d dVar = cri.a.d;
                k9q0.w(M, c, dVar);
                boolean booleanValue = ((Boolean) ((zak0) this.e).getValue()).booleanValue();
                wh50 wh50Var2 = this.b;
                wh50 wh50Var3 = this.a;
                if (booleanValue) {
                    M.K(814026454);
                    if (Build.VERSION.SDK_INT >= 31) {
                        M.K(814061887);
                        long j3 = wlb0.h(M).j().b;
                        lg90 lg90Var = (lg90) ((zak0) wh50Var3).getValue();
                        int i3 = i2 & 14;
                        q630 c2 = jcr.c(txj0.r(xcv0.d(i3, j2), aVar2), 2.0f);
                        boolean p = M.p(j3);
                        Object x = M.x();
                        if (p || x == a.C0011a.a) {
                            x = new l5h(j3, 0);
                            M.R(x);
                        }
                        pzu0.b(lg90Var, null, bu00.f(c2, (izs) x), ((l5g) ((zak0) wh50Var2).getValue()).a, M, 56, 0);
                        qzu0.a.getClass();
                        pzu0.b(qzu0.f0(M), null, ahn.E(txj0.r(xcv0.d(i3, j2), aVar2), "CommunityInternalHiddenBusinessAppMark"), wlb0.h(M).getIcon().c, M, 56, 0);
                        M.j();
                    } else {
                        M.K(815354959);
                        q630 u = txj0.u(aVar2, uco.c(j2), uco.b(j2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                        cp10 d3 = ja8.d(ty6Var, false);
                        int hashCode2 = Long.hashCode(n34.n(M));
                        sy90 D2 = M.D();
                        q630 c3 = qri.c(M, u);
                        if (M.N() == null) {
                            n34.r();
                            throw null;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar4);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, d3, cVar);
                        k9q0.w(M, D2, eVar);
                        ur.d(hashCode2, M, bVar, M, c2678a);
                        k9q0.w(M, c3, dVar);
                        ja8.a(hr80.m(txj0.s(aVar2, uco.c(j), uco.b(j)), wlb0.h(M).getBackground().x, aVar3), M, 0);
                        q630 E = ahn.E(ra8.a.b(aVar2, ty6Var), "CommunityInternalHiddenBusinessAppMark");
                        qzu0.a.getClass();
                        pzu0.b(qzu0.f0(M), null, E, wlb0.h(M).getIcon().l, M, 56, 0);
                        M.G();
                        M.j();
                    }
                    M.j();
                    j2 = j;
                } else {
                    M.K(816471920);
                    j2 = j;
                    pzu0.b((lg90) ((zak0) wh50Var3).getValue(), null, txj0.r(xcv0.d(i2 & 14, j2), aVar2), ((l5g) ((zak0) wh50Var2).getValue()).a, M, 56, 0);
                    M.j();
                }
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new wzs() { // from class: xsna.m5h
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        int I = ne7.I(i | 1);
                        j5h.h.this.a(I, j2, (androidx.compose.runtime.a) obj, q630Var);
                        return s3q0.a;
                    }
                };
            }
        }
    }

    /* compiled from: CommunityInternalMenuItemHolder.kt */
    public static final class i implements efj {
        public final wh50 a;
        public final wh50 b = androidx.compose.runtime.k.b(null);
        public final wh50 c = androidx.compose.runtime.k.b(null);
        public final wh50 d = androidx.compose.runtime.k.b(null);
        public final wh50 e = androidx.compose.runtime.k.b(wkj.a.b);
        public final wh50 f;
        public final wh50 g;

        public i(lg90 lg90Var, boolean z, boolean z2) {
            this.a = androidx.compose.runtime.k.b(lg90Var);
            this.f = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.g = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        }

        @Override // xsna.efj
        public final void a(int i, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
            int i2;
            q630 g;
            androidx.compose.runtime.a M = aVar.M(1049332614);
            if ((i & 6) == 0) {
                i2 = (M.p(j) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(q630Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1049332614, i2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemHolder.HideableImageContent.invoke (CommunityInternalMenuItemHolder.kt:382)");
                }
                M.K(1896591252);
                M.j();
                q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.d).getValue());
                yk8 yk8Var = (yk8) ((zak0) this.c).getValue();
                q630.a aVar2 = q630.a.a;
                if (yk8Var != null && (g = b.g(hr80.l(aVar2, yk8Var, null, 6))) != null) {
                    b = g;
                }
                q630 d = txj0.d(b, 1.0f);
                dt1.a.getClass();
                ty6 ty6Var = dt1.a.f;
                cp10 d2 = ja8.d(ty6Var, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, d);
                cri.h7.getClass();
                LayoutNode.a aVar3 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar3);
                } else {
                    M.f();
                }
                cri.a.c cVar = cri.a.f;
                k9q0.w(M, d2, cVar);
                cri.a.e eVar = cri.a.e;
                k9q0.w(M, D, eVar);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar = cri.a.g;
                k9q0.w(M, valueOf, bVar);
                cri.a.C2678a c2678a = cri.a.h;
                k9q0.t(M, c2678a);
                cri.a.d dVar = cri.a.d;
                k9q0.w(M, c, dVar);
                boolean booleanValue = ((Boolean) ((zak0) this.f).getValue()).booleanValue();
                wh50 wh50Var = this.e;
                wh50 wh50Var2 = this.a;
                if (booleanValue) {
                    M.K(253756302);
                    if (Build.VERSION.SDK_INT >= 31) {
                        M.K(253791735);
                        long j2 = wlb0.h(M).j().b;
                        lg90 lg90Var = (lg90) ((zak0) wh50Var2).getValue();
                        q630 c2 = jcr.c(txj0.d(aVar2, 1.0f), 2.0f);
                        boolean p = M.p(j2);
                        Object x = M.x();
                        if (p || x == a.C0011a.a) {
                            x = new gk2(j2, 1);
                            M.R(x);
                        }
                        int i3 = i2;
                        vjw.a(lg90Var, null, bu00.f(c2, (izs) x), null, (wkj) ((zak0) wh50Var).getValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (d6g) ((zak0) this.b).getValue(), M, 56, 40);
                        qzu0.a.getClass();
                        lg90 f0 = qzu0.f0(M);
                        q630 E = ahn.E(txj0.r(xcv0.d(i3 & 14, j), aVar2), "CommunityInternalHiddenBusinessAppMark");
                        long j3 = wlb0.h(M).getIcon().c;
                        M = M;
                        pzu0.b(f0, null, E, j3, M, 56, 0);
                        M.j();
                    } else {
                        M.K(254969487);
                        q630 u = txj0.u(aVar2, uco.c(j), uco.b(j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                        cp10 d3 = ja8.d(ty6Var, false);
                        int hashCode2 = Long.hashCode(n34.n(M));
                        sy90 D2 = M.D();
                        q630 c3 = qri.c(M, u);
                        if (M.N() == null) {
                            n34.r();
                            throw null;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar3);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, d3, cVar);
                        k9q0.w(M, D2, eVar);
                        ur.d(hashCode2, M, bVar, M, c2678a);
                        k9q0.w(M, c3, dVar);
                        ja8.a(hr80.m(txj0.s(aVar2, uco.c(j), uco.b(j)), wlb0.h(M).getBackground().x, androidx.compose.ui.graphics.e.a), M, 0);
                        q630 E2 = ahn.E(ra8.a.b(aVar2, ty6Var), "CommunityInternalHiddenBusinessAppMark");
                        qzu0.a.getClass();
                        pzu0.b(qzu0.f0(M), null, E2, wlb0.h(M).getIcon().l, M, 56, 0);
                        M.G();
                        M.j();
                    }
                    M.j();
                } else {
                    M.K(256084774);
                    vjw.a((lg90) ((zak0) wh50Var2).getValue(), null, txj0.d(aVar2, 1.0f), null, (wkj) ((zak0) wh50Var).getValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 440, 104);
                    M = M;
                    M.j();
                }
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new n5h(this, j, q630Var, i, 0);
            }
        }
    }

    /* compiled from: CommunityInternalMenuItemHolder.kt */
    public static final class j implements iy5 {
        public final BadgeAlignment a = BadgeAlignment.TopRight;
        public final rg50 b;

        public j(int i) {
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
            androidx.compose.runtime.a M = aVar.M(1479787792);
            int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1479787792, i2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemHolder.MenuItemBadgeCounter.invoke (CommunityInternalMenuItemHolder.kt:339)");
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
                s.d = new uqc(this, q630Var2, i, 1);
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

    public j5h(ViewGroup viewGroup, ComposeView composeView, boolean z, ul1 ul1Var) {
        super(viewGroup, composeView, z, ul1Var);
        this.s = androidx.compose.runtime.k.b("");
        this.t = androidx.compose.runtime.k.b(null);
        this.u = androidx.compose.runtime.i.a(0);
        this.v = androidx.compose.runtime.k.b(Boolean.FALSE);
    }

    public final boolean D6() {
        return ((Boolean) ((zak0) this.v).getValue()).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03d8  */
    @Override // xsna.s5h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s6(int i2, androidx.compose.runtime.a aVar) {
        int i3;
        ImageSize Cb;
        float f2;
        j5h j5hVar;
        float f3;
        a.C0011a.C0012a c0012a;
        int i4;
        lg90 z0;
        Object x;
        rek0 rek0Var;
        long j2;
        lg90 lg90Var;
        h hVar;
        q630 q630Var;
        rep repVar;
        j5h j5hVar2 = this;
        androidx.compose.runtime.a M = aVar.M(1588033083);
        int i5 = i2 | (M.y(j5hVar2) ? 4 : 2);
        if (M.t(i5 & 1, (i5 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1588033083, i5, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemHolder.Content (CommunityInternalMenuItemHolder.kt:102)");
            }
            Object x2 = M.x();
            int i6 = 7;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x2 == c0012a2) {
                x2 = bbk0.b(new z4f(j5hVar2, i6));
                M.R(x2);
            }
            mtk0 mtk0Var = (mtk0) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-170449335, 6, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuDefaults.defaults (CommunityInternalMenuDefaults.kt:21)");
            }
            a5h a5hVar = a5h.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a5h a5hVar2 = a5h.a;
            float f4 = a5h.d;
            int i7 = (int) f4;
            boolean J = M.J(((z4h.a) j5hVar2.m).e) | M.o(i7);
            Object x3 = M.x();
            if (J || x3 == c0012a2) {
                Image image = ((z4h.a) j5hVar2.m).e;
                x3 = (image == null || (Cb = image.Cb(iah0.a((float) i7), true, false)) == null) ? null : Cb.d.d;
                M.R(x3);
            }
            String str = (String) x3;
            M.K(29416358);
            M.K(1386426843);
            a5hVar2.getClass();
            float f5 = (a5h.e * 2) + f4;
            q630.a aVar2 = q630.a.a;
            q630 d2 = rte0.d(txj0.v(aVar2, f5), vog0.a(cn70.c(16)));
            if (j5hVar2.v6()) {
                d2 = d2.g(hr80.l(aVar2, new rek0(a5hVar2.c(M)), null, 6));
            }
            q630 q630Var2 = d2;
            M.j();
            boolean y = M.y(j5hVar2);
            Object x4 = M.x();
            if (y || x4 == c0012a2) {
                f2 = f4;
                j5hVar = this;
                b bVar = new b(0, j5hVar, j5h.class, "onClick", "onClick()V", 0);
                M.R(bVar);
                x4 = bVar;
            } else {
                f2 = f4;
                j5hVar = j5hVar2;
            }
            fcy fcyVar = (fcy) x4;
            mlg0 a2 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
            Object x5 = M.x();
            if (x5 == c0012a2) {
                x5 = ir.h(M);
            }
            q630 E = ahn.E(ojc.d(q630Var2, (sg50) x5, a2, false, null, null, (gzs) fcyVar, IronSourceError.ERROR_CODE_INIT_FAILED), a.a(j5hVar) ? "CommunityInternalMenuBusinessAppItem" : "CommunityInternalMenuRegularItem");
            HorizontalListItem$Size.WithPicture withPicture = HorizontalListItem$Size.WithPicture.Small;
            if (str != null) {
                M.K(30147524);
                c0012a = c0012a2;
                f3 = f2;
                i4 = -1;
                lg90 l = fwu0.l(str, null, null, null, M, 0, 62);
                boolean z = a.a(j5hVar) && j5hVar.D6();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1681320392, 12582920, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemHolder.HideableImageContent.Companion.invoke (CommunityInternalMenuItemHolder.kt:476)");
                }
                Object x6 = M.x();
                if (x6 == c0012a) {
                    x6 = new i(l, z, false);
                    M.R(x6);
                }
                i iVar = (i) x6;
                ((zak0) iVar.a).setValue(l);
                ((zak0) iVar.c).setValue(null);
                ((zak0) iVar.e).setValue(wkj.a.b);
                ((zak0) iVar.b).setValue(null);
                ((zak0) iVar.d).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                hVar = iVar;
            } else {
                f3 = f2;
                c0012a = c0012a2;
                i4 = -1;
                M.K(30384395);
                String str2 = (String) ((zak0) j5hVar.t).getValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1247701283, 48, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuDefaults.<get-icon> (CommunityInternalMenuDefaults.kt:111)");
                }
                M.K(1622309528);
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1937264505:
                            if (str2.equals("artist_page")) {
                                M.K(745089773);
                                qzu0.a.getClass();
                                z0 = qzu0.P0(M);
                                M.j();
                                break;
                            }
                            break;
                        case -732377866:
                            if (str2.equals("article")) {
                                M.K(745073260);
                                qzu0.a.getClass();
                                z0 = qzu0.g(M);
                                M.j();
                                break;
                            }
                            break;
                        case 96801:
                            if (str2.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                                M.K(745091981);
                                qzu0.a.getClass();
                                z0 = qzu0.k1(M);
                                M.j();
                                break;
                            }
                            break;
                        case 3446944:
                            if (str2.equals("post")) {
                                M.K(745070925);
                                qzu0.a.getClass();
                                z0 = qzu0.U0(M);
                                M.j();
                                break;
                            }
                            break;
                        case 3599307:
                            if (str2.equals("user")) {
                                M.K(745094217);
                                qzu0.a.getClass();
                                z0 = qzu0.w1(M);
                                M.j();
                                break;
                            }
                            break;
                        case 96891546:
                            if (str2.equals(NotificationCompat.CATEGORY_EVENT)) {
                                M.K(745098538);
                                qzu0.a.getClass();
                                z0 = qzu0.z1(M);
                                M.j();
                                break;
                            }
                            break;
                        case 98629247:
                            if (str2.equals("group")) {
                                M.K(745096362);
                                qzu0.a.getClass();
                                z0 = qzu0.z1(M);
                                M.j();
                                break;
                            }
                            break;
                        case 106642994:
                            if (str2.equals("photo")) {
                                M.K(745077900);
                                qzu0.a.getClass();
                                z0 = qzu0.W(M);
                                M.j();
                                break;
                            }
                            break;
                        case 112202875:
                            if (str2.equals("video")) {
                                M.K(745080138);
                                qzu0.a.getClass();
                                z0 = qzu0.D1(M);
                                M.j();
                                break;
                            }
                            break;
                        case 284943683:
                            if (str2.equals("market_cart")) {
                                M.K(745100907);
                                qzu0.a.getClass();
                                z0 = qzu0.I0(M);
                                M.j();
                                break;
                            }
                            break;
                        case 285140278:
                            if (str2.equals("market_item")) {
                                M.K(745075691);
                                qzu0.a.getClass();
                                z0 = qzu0.I0(M);
                                M.j();
                                break;
                            }
                            break;
                        case 706951208:
                            if (str2.equals("discussion")) {
                                M.K(745082480);
                                qzu0.a.getClass();
                                z0 = qzu0.D(M);
                                M.j();
                                break;
                            }
                            break;
                        case 861720859:
                            if (str2.equals("document")) {
                                M.K(745084941);
                                qzu0.a.getClass();
                                z0 = qzu0.F(M);
                                M.j();
                                break;
                            }
                            break;
                        case 1879474642:
                            if (str2.equals("playlist")) {
                                M.K(745087309);
                                qzu0.a.getClass();
                                z0 = qzu0.e1(M);
                                M.j();
                                break;
                            }
                            break;
                    }
                    lg90 lg90Var2 = z0;
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j3 = ylu0Var.l().Q;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    rek0 rek0Var2 = new rek0(ylu0Var2.getImage().b);
                    boolean z2 = !a.a(j5hVar) && j5hVar.D6();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(516903617, 1572872, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemHolder.HideableIconContent.Companion.invoke (CommunityInternalMenuItemHolder.kt:616)");
                    }
                    x = M.x();
                    if (x != c0012a) {
                        x = new h(lg90Var2, j3, rek0Var2, z2, false);
                        lg90Var = lg90Var2;
                        j2 = j3;
                        rek0Var = rek0Var2;
                        M.R(x);
                    } else {
                        rek0Var = rek0Var2;
                        j2 = j3;
                        lg90Var = lg90Var2;
                    }
                    hVar = (h) x;
                    ((zak0) hVar.a).setValue(lg90Var);
                    ((zak0) hVar.c).setValue(rek0Var);
                    ((zak0) hVar.b).setValue(new l5g(j2));
                    ((zak0) hVar.d).setValue(null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                }
                M.K(745102217);
                qzu0.a.getClass();
                z0 = qzu0.z0(M);
                M.j();
                lg90 lg90Var22 = z0;
                M.j();
                if (androidx.compose.runtime.b.d()) {
                }
                if (androidx.compose.runtime.b.d()) {
                }
                iyk0 iyk0Var2 = rrv0.a;
                ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                }
                long j32 = ylu0Var3.l().Q;
                if (androidx.compose.runtime.b.d()) {
                }
                ylu0 ylu0Var22 = (ylu0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                }
                rek0 rek0Var22 = new rek0(ylu0Var22.getImage().b);
                if (a.a(j5hVar)) {
                }
                if (androidx.compose.runtime.b.d()) {
                }
                x = M.x();
                if (x != c0012a) {
                }
                hVar = (h) x;
                ((zak0) hVar.a).setValue(lg90Var);
                ((zak0) hVar.c).setValue(rek0Var);
                ((zak0) hVar.b).setValue(new l5g(j2));
                ((zak0) hVar.d).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                }
                M.j();
            }
            float f6 = a5h.c;
            float f7 = f3 / f6;
            PictureRadius pictureRadius = PictureRadius.Large;
            if (((Boolean) mtk0Var.getValue()).booleanValue()) {
                M.K(30953276);
                int intValue = ((wak0) j5hVar.u).getIntValue();
                if (androidx.compose.runtime.b.d()) {
                    q630Var = E;
                    androidx.compose.runtime.b.f(893015883, 48, i4, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemHolder.MenuItemBadgeCounter.Companion.invoke (CommunityInternalMenuItemHolder.kt:352)");
                } else {
                    q630Var = E;
                }
                Object x7 = M.x();
                if (x7 == c0012a) {
                    x7 = new j(intValue);
                    M.R(x7);
                }
                j jVar = (j) x7;
                ((wak0) jVar.b).C(intValue);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                repVar = jVar;
            } else {
                q630Var = E;
                M.K(31033101);
                M.j();
                repVar = rep.a;
            }
            t9g0 a3 = HorizontalListItem$VisualContent.e.a(hVar, f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pictureRadius, repVar, M, 3072, 4);
            String str3 = (String) ((zak0) j5hVar.s).getValue();
            Object x8 = M.x();
            if (x8 == c0012a) {
                x8 = new g54(14);
                M.R(x8);
            }
            azu0.b(withPicture, a3, iev.c.a(str3, null, 1, com.vk.core.compose.component.semantics.b.a(null, (izs) x8, 3), M, 24576, 13), q630Var, new gev(new uco(byc0.b(f3, f6)), a5h.f, new u890(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 8), M, 6, 0);
            M = M;
            M.j();
            j5hVar2 = j5hVar;
            i3 = 3;
            j5hVar2.q6(CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.DELETE_ITEM, d370.N(R.string.community_menu_alert_delete_item_title, 0, M), d370.N(R.string.community_menu_alert_delete_item_text, 0, M), d370.N(R.string.delete, 0, M), null, M, ((i5 << 15) & 458752) | 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i3 = 3;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.sdk.android.defaultplayer.control.n(j5hVar2, i2, i3);
        }
    }

    @Override // xsna.s5h
    public final void t6(dt1 dt1Var, boolean z, long j2, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i2) {
        aVar.K(-1844638466);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1844638466, i2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemHolder.ContextMenu (CommunityInternalMenuItemHolder.kt:237)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-170449335, 6, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuDefaults.defaults (CommunityInternalMenuDefaults.kt:21)");
        }
        a5h a5hVar = a5h.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        final long b2 = a5h.a.b(aVar);
        q630 E = ahn.E(q630.a.a, a.a(this) ? "CommunityInternalMenuBusinessAppItemContextMenu" : "CommunityInternalMenuRegularItemContextMenu");
        boolean y = aVar.y(this) | aVar.p(b2) | aVar.l(false);
        Object x = aVar.x();
        if (y || x == a.C0011a.a) {
            x = new izs() { // from class: xsna.i5h
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    aoj aojVar = (aoj) obj;
                    j5h j5hVar = j5h.this;
                    long j3 = b2;
                    aojVar.a(j5hVar.new c(j3));
                    aojVar.a(j5hVar.new d(j3));
                    int i3 = j5h.w;
                    if (j5h.a.a(j5hVar)) {
                        aojVar.b();
                        if (j5hVar.D6()) {
                            aojVar.a(j5hVar.new e(j3));
                        } else {
                            aojVar.a(j5hVar.new f(j3));
                        }
                    } else {
                        aojVar.b();
                        aojVar.a(j5hVar.new g());
                    }
                    return s3q0.a;
                }
            };
            aVar.R(x);
        }
        aou0.g(z, gzsVar, E, dt1Var, j2, null, null, (izs) x, aVar, ((i2 >> 3) & 14) | ((i2 >> 6) & 112) | ((i2 << 9) & 7168) | ((i2 << 6) & 57344), 224);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    @Override // xsna.s5h, xsna.vif0
    /* renamed from: x6 */
    public final void i6(z4h.a aVar) {
        super.i6(aVar);
        String str = aVar.c;
        if (str == null) {
            str = "";
        }
        ((zak0) this.s).setValue(str);
        ((zak0) this.t).setValue(aVar.b);
        ((wak0) this.u).C(aVar.f);
        ((zak0) this.v).setValue(Boolean.valueOf(aVar.h));
    }
}
