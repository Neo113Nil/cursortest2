package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SubnavigationBarAppearance;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import xsna.cri;
import xsna.dt1;
import xsna.uum0;

/* compiled from: SubnavigationButton.kt */
/* loaded from: classes17.dex */
public interface uum0 {

    /* compiled from: SubnavigationButton.kt */
    public static final class a implements uum0 {
        public final jai a;

        public a() {
            throw null;
        }

        public a(int i) {
            this.a = oli.d;
        }

        @Override // xsna.uum0
        public final void a(final int i, androidx.compose.runtime.a aVar, final SubnavigationBarAppearance subnavigationBarAppearance, final SubnavigationButtonMode subnavigationButtonMode, final q630 q630Var) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(1663067783);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 3072) == 0) {
                i2 |= M.J(this) ? 2048 : 1024;
            }
            if (M.t(i2 & 1, (i2 & IronSourceError.ERROR_RV_LOAD_DURING_SHOW) != 1026)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1663067783, i2, -1, "com.vk.core.compose.component.subnavigation.SubnavigationButton.Right.Custom.Content (SubnavigationButton.kt:126)");
                }
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q630Var);
                cri.h7.getClass();
                LayoutNode.a aVar2 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar2);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                this.a.invoke(ra8.a, M, 6);
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new wzs() { // from class: xsna.tum0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        int I = ne7.I(i | 1);
                        uum0.a.this.a(I, (androidx.compose.runtime.a) obj, subnavigationBarAppearance, subnavigationButtonMode, q630Var);
                        return s3q0.a;
                    }
                };
            }
        }
    }

    /* compiled from: SubnavigationButton.kt */
    public static final class b implements uum0 {
        public final lg90 a;
        public final boolean b;

        public b(lg90 lg90Var, boolean z) {
            this.a = lg90Var;
            this.b = z;
        }

        @Override // xsna.uum0
        public final void a(int i, androidx.compose.runtime.a aVar, SubnavigationBarAppearance subnavigationBarAppearance, SubnavigationButtonMode subnavigationButtonMode, q630 q630Var) {
            q630 q630Var2;
            int i2;
            SubnavigationBarAppearance subnavigationBarAppearance2;
            SubnavigationButtonMode subnavigationButtonMode2;
            ColorFilter porterDuffColorFilter;
            androidx.compose.runtime.a M = aVar.M(-1692870961);
            if ((i & 6) == 0) {
                q630Var2 = q630Var;
                i2 = (M.J(q630Var2) ? 4 : 2) | i;
            } else {
                q630Var2 = q630Var;
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.o(subnavigationButtonMode.ordinal()) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.o(subnavigationBarAppearance.ordinal()) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= M.J(this) ? 2048 : 1024;
            }
            if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1692870961, i2, -1, "com.vk.core.compose.component.subnavigation.SubnavigationButton.Right.Icon.Content (SubnavigationButton.kt:34)");
                }
                float f = knv0.a;
                subnavigationBarAppearance2 = subnavigationBarAppearance;
                int i3 = i2;
                subnavigationButtonMode2 = subnavigationButtonMode;
                long a = knv0.a(this.b, subnavigationButtonMode2, subnavigationBarAppearance2, M);
                if (Build.VERSION.SDK_INT >= 29) {
                    se7.b();
                    porterDuffColorFilter = re7.b(f870.H(a), z42.a(5));
                } else {
                    porterDuffColorFilter = new PorterDuffColorFilter(f870.H(a), z42.b(5));
                }
                vjw.a(this.a, null, q630Var2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(a, 5, porterDuffColorFilter), M, 56 | ((i3 << 6) & 896), 56);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                subnavigationBarAppearance2 = subnavigationBarAppearance;
                subnavigationButtonMode2 = subnavigationButtonMode;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new nga(this, q630Var, subnavigationButtonMode2, subnavigationBarAppearance2, i, 1);
            }
        }
    }

    /* compiled from: SubnavigationButton.kt */
    public static final class c implements uum0 {
        public final lg90 a;
        public final boolean b;
        public final jai c;

        public c() {
            throw null;
        }

        public c(lg90 lg90Var, boolean z, jai jaiVar) {
            this.a = lg90Var;
            this.b = z;
            this.c = jaiVar;
        }

        @Override // xsna.uum0
        public final void a(int i, androidx.compose.runtime.a aVar, SubnavigationBarAppearance subnavigationBarAppearance, SubnavigationButtonMode subnavigationButtonMode, q630 q630Var) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(1655603814);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.o(subnavigationButtonMode.ordinal()) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.o(subnavigationBarAppearance.ordinal()) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= M.J(this) ? 2048 : 1024;
            }
            if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1655603814, i2, -1, "com.vk.core.compose.component.subnavigation.SubnavigationButton.Right.IconWithContent.Content (SubnavigationButton.kt:96)");
                }
                this.c.invoke(kai.c(-1154441055, new mrx(this, subnavigationButtonMode, subnavigationBarAppearance, q630Var), M), M, 6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new s5c(this, q630Var, subnavigationButtonMode, subnavigationBarAppearance, i);
            }
        }

        public final void b(int i, androidx.compose.runtime.a aVar, SubnavigationBarAppearance subnavigationBarAppearance, SubnavigationButtonMode subnavigationButtonMode, q630 q630Var) {
            SubnavigationButtonMode subnavigationButtonMode2;
            ColorFilter porterDuffColorFilter;
            androidx.compose.runtime.a M = aVar.M(-1116596547);
            int i2 = i | (M.o(subnavigationButtonMode.ordinal()) ? 4 : 2) | (M.o(subnavigationBarAppearance.ordinal()) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.J(this) ? 2048 : 1024);
            if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1116596547, i2, -1, "com.vk.core.compose.component.subnavigation.SubnavigationButton.Right.IconWithContent.IconContent (SubnavigationButton.kt:76)");
                }
                float f = knv0.a;
                subnavigationButtonMode2 = subnavigationButtonMode;
                long a = knv0.a(this.b, subnavigationButtonMode2, subnavigationBarAppearance, M);
                if (Build.VERSION.SDK_INT >= 29) {
                    se7.b();
                    porterDuffColorFilter = re7.b(f870.H(a), z42.a(5));
                } else {
                    porterDuffColorFilter = new PorterDuffColorFilter(f870.H(a), z42.b(5));
                }
                vjw.a(this.a, null, q630Var, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(a, 5, porterDuffColorFilter), M, 56 | (i2 & 896), 56);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                subnavigationButtonMode2 = subnavigationButtonMode;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new f95(i, 4, this, subnavigationButtonMode2, subnavigationBarAppearance, q630Var);
            }
        }
    }

    void a(int i, androidx.compose.runtime.a aVar, SubnavigationBarAppearance subnavigationBarAppearance, SubnavigationButtonMode subnavigationButtonMode, q630 q630Var);
}
