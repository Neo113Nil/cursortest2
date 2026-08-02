package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.BadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: TopBar.kt */
/* loaded from: classes17.dex */
public interface f7p0 {

    /* compiled from: TopBar.kt */
    public static final class a implements f7p0 {
        public final wh50 a;
        public final wh50 b;

        public a(BadgeAppearance badgeAppearance, SemanticsConfiguration semanticsConfiguration) {
            this.a = androidx.compose.runtime.k.b(badgeAppearance);
            this.b = androidx.compose.runtime.k.b(semanticsConfiguration);
        }

        @Override // xsna.f7p0
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-1703559368);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            int i3 = i2 | (M.J(this) ? 32 : 16);
            if (M.t(i3 & 1, (i3 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1703559368, i3, -1, "com.vk.core.compose.component.topbar.TopBar.TopMarker.Badge.Content (TopBar.kt:1956)");
                }
                float f = 6;
                rdu0.a(s200.H(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.b).getValue()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9), (BadgeAppearance) ((zak0) this.a).getValue(), M, 0, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new sy9(this, q630Var, i, 5);
            }
        }
    }

    /* compiled from: TopBar.kt */
    public static final class b implements f7p0 {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;
        public final wh50 g;
        public final wh50 h;
        public final wh50 j;
        public final wh50 f = androidx.compose.runtime.k.b(null);
        public final wh50 i = androidx.compose.runtime.k.b(Boolean.FALSE);

        /* compiled from: TopBar.kt */
        public static final class a {
            public static b a(ContentBadgeSize contentBadgeSize, ContentBadgeMode contentBadgeMode, ContentBadgeAppearance contentBadgeAppearance, lg90 lg90Var, l5g l5gVar, lg90 lg90Var2, l5g l5gVar2, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1952166573, 2101248, 6, "com.vk.core.compose.component.topbar.TopBar.TopMarker.ContentBadge.Companion.invoke (TopBar.kt:2073)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    b bVar = new b(contentBadgeSize, contentBadgeMode, contentBadgeAppearance, lg90Var, l5gVar, lg90Var2, l5gVar2, semanticsConfiguration);
                    aVar.R(bVar);
                    x = bVar;
                }
                b bVar2 = (b) x;
                ((zak0) bVar2.a).setValue(contentBadgeSize);
                ((zak0) bVar2.b).setValue(contentBadgeAppearance);
                ((zak0) bVar2.c).setValue(contentBadgeMode);
                ((zak0) bVar2.d).setValue(lg90Var);
                ((zak0) bVar2.e).setValue(l5gVar);
                ((zak0) bVar2.f).setValue(null);
                ((zak0) bVar2.g).setValue(lg90Var2);
                ((zak0) bVar2.h).setValue(l5gVar2);
                ((zak0) bVar2.i).setValue(false);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return bVar2;
            }
        }

        public b(ContentBadgeSize contentBadgeSize, ContentBadgeMode contentBadgeMode, ContentBadgeAppearance contentBadgeAppearance, lg90 lg90Var, l5g l5gVar, lg90 lg90Var2, l5g l5gVar2, SemanticsConfiguration semanticsConfiguration) {
            this.a = androidx.compose.runtime.k.b(contentBadgeSize);
            this.b = androidx.compose.runtime.k.b(contentBadgeAppearance);
            this.c = androidx.compose.runtime.k.b(contentBadgeMode);
            this.d = androidx.compose.runtime.k.b(lg90Var);
            this.e = androidx.compose.runtime.k.b(l5gVar);
            this.g = androidx.compose.runtime.k.b(lg90Var2);
            this.h = androidx.compose.runtime.k.b(l5gVar2);
            this.j = androidx.compose.runtime.k.b(semanticsConfiguration);
        }

        @Override // xsna.f7p0
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(-910164197);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            int i3 = i2 | (M.J(this) ? 32 : 16);
            if (M.t(i3 & 1, (i3 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-910164197, i3, -1, "com.vk.core.compose.component.topbar.TopBar.TopMarker.ContentBadge.Content (TopBar.kt:2043)");
                }
                float f = 2;
                aVar2 = M;
                rnu0.c((ContentBadgeSize) ((zak0) this.a).getValue(), (ContentBadgeMode) ((zak0) this.c).getValue(), (ContentBadgeAppearance) ((zak0) this.b).getValue(), s200.H(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.j).getValue()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9), (lg90) ((zak0) this.d).getValue(), (l5g) ((zak0) this.e).getValue(), (String) ((zak0) this.f).getValue(), null, (lg90) ((zak0) this.g).getValue(), (l5g) ((zak0) this.h).getValue(), ((Boolean) ((zak0) this.i).getValue()).booleanValue(), null, false, null, aVar2, 134250496, 0, 14464);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.d = new js8(this, q630Var, i, 3);
            }
        }
    }

    /* compiled from: TopBar.kt */
    public static final class c implements f7p0 {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d;

        /* compiled from: TopBar.kt */
        public static final class a {
            public static c a(int i, CounterAppearance counterAppearance, CounterMode counterMode, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i2, int i3) {
                if ((i3 & 2) != 0) {
                    counterAppearance = CounterAppearance.Design.AccentRed;
                }
                if ((i3 & 4) != 0) {
                    counterMode = CounterMode.Primary;
                }
                if ((i3 & 8) != 0) {
                    semanticsConfiguration = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1186200420, i2, -1, "com.vk.core.compose.component.topbar.TopBar.TopMarker.Counter.Companion.invoke (TopBar.kt:2009)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new c(i, counterAppearance, counterMode, semanticsConfiguration);
                    aVar.R(x);
                }
                c cVar = (c) x;
                ((zak0) cVar.a).setValue(Integer.valueOf(i));
                ((zak0) cVar.b).setValue(counterAppearance);
                ((zak0) cVar.c).setValue(counterMode);
                ((zak0) cVar.d).setValue(semanticsConfiguration);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return cVar;
            }
        }

        public c(int i, CounterAppearance counterAppearance, CounterMode counterMode, SemanticsConfiguration semanticsConfiguration) {
            this.a = androidx.compose.runtime.k.b(Integer.valueOf(i));
            this.b = androidx.compose.runtime.k.b(counterAppearance);
            this.c = androidx.compose.runtime.k.b(counterMode);
            this.d = androidx.compose.runtime.k.b(semanticsConfiguration);
        }

        @Override // xsna.f7p0
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(995719103);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            int i3 = i2 | (M.J(this) ? 32 : 16);
            if (M.t(i3 & 1, (i3 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(995719103, i3, -1, "com.vk.core.compose.component.topbar.TopBar.TopMarker.Counter.Content (TopBar.kt:1990)");
                }
                nou0.a(((Number) ((zak0) this.a).getValue()).intValue(), CounterSize.Small, (CounterAppearance) ((zak0) this.b).getValue(), s200.H(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.d).getValue()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9), (CounterMode) ((zak0) this.c).getValue(), false, M, 48, 32);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new qz5(this, q630Var, i, 6);
            }
        }
    }

    void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
