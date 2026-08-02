package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.LoadingState;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.PlaceholderState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: StorefrontServicesPlaceholder.kt */
/* loaded from: classes18.dex */
public final class hol0 {

    /* compiled from: StorefrontServicesPlaceholder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlaceholderState.values().length];
            try {
                iArr[PlaceholderState.Services.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaceholderState.Album.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlaceholderState.Albums.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlaceholderState.Section.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlaceholderState.Search.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var, boolean z) {
        y48 y48Var;
        androidx.compose.runtime.a M = aVar.M(1971309406);
        int i2 = (M.l(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1971309406, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontAlbumPlaceholder (StorefrontServicesPlaceholder.kt:103)");
            }
            q630 m = hr80.m(txj0.d(q630Var, 1.0f), wlb0.h(M).getBackground().g, androidx.compose.ui.graphics.e.a);
            qzu0.a.getClass();
            int i3 = i2;
            lg90 e = qzu0.e(M);
            long j = wlb0.h(M).s() ? vcl0.a(M, 347776392, M).a : vcl0.a(M, 347777546, M).c;
            M.j();
            t8p0 a2 = csa0.a(e, j, 0L, null, null, M, 199688, 20);
            vl20 a3 = zra0.a.a(d370.N(R.string.storefront_album_placeholder_title, 0, M), null, d370.N(R.string.storefront_album_placeholder_description, 0, M), null, M, 196608, 26);
            if (z) {
                M.K(-2103483496);
                String N = d370.N(R.string.storefront_album_placeholder_button_text, 0, M);
                ButtonStyle buttonStyle = ButtonStyle.Primary;
                boolean z2 = (i3 & 896) == 256;
                Object x = M.x();
                if (z2 || x == a.C0011a.a) {
                    x = new d97(izsVar, 5);
                    M.R(x);
                }
                r48 a4 = wra0.a.C3954a.a(N, (gzs) x, null, buttonStyle, null, false, null, null, null, null, null, null, false, false, null, null, M, 3072, 12582912, 131060);
                M = M;
                y48 a5 = wra0.b.a(a4, null, null, M, 14);
                M.j();
                y48Var = a5;
            } else {
                M.K(-2103158369);
                M.j();
                y48Var = null;
            }
            ldv0.d(m, a2, a3, y48Var, null, null, false, M, 0, 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p4i0(i, izsVar, q630Var, z);
        }
    }

    public static final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-718831090);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-718831090, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontAlbumsPlaceholder (StorefrontServicesPlaceholder.kt:131)");
            }
            q630 m = hr80.m(txj0.d(q630Var, 1.0f), wlb0.h(M).getBackground().g, androidx.compose.ui.graphics.e.a);
            qzu0.a.getClass();
            lg90 e = qzu0.e(M);
            long j = wlb0.h(M).s() ? vcl0.a(M, 693069240, M).a : vcl0.a(M, 693070394, M).c;
            M.j();
            ldv0.d(m, csa0.a(e, j, 0L, null, null, M, 199688, 20), zra0.a.a(d370.N(R.string.storefront_albums_placeholder_title, 0, M), null, d370.N(R.string.storefront_albums_placeholder_description, 0, M), null, M, 196608, 26), null, null, null, false, M, 0, 120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new my5(q630Var, i, 2);
        }
    }

    public static final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-606118958);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-606118958, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontSearchPlaceholder (StorefrontServicesPlaceholder.kt:179)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ldv0.d(hr80.m(q630Var, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), null, zra0.a.a(null, null, d370.N(R.string.storefront_search_placeholder_description, 0, M), null, M, 196608, 27), null, null, null, false, M, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ny5(q630Var, i, 4);
        }
    }

    public static final void d(LoadingState loadingState, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-843840609);
        if ((i & 6) == 0) {
            i2 = (M.o(loadingState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-843840609, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontSectionPlaceholder (StorefrontServicesPlaceholder.kt:154)");
            }
            boolean z = loadingState == LoadingState.Refresh;
            boolean z2 = (i2 & 896) == 256;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new c97(izsVar, 7);
                M.R(x);
            }
            dge0.a(z, (gzs) x, txj0.d(q630Var, 1.0f), null, null, lli.a, M, 196608, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n1k(i, 3, (Object) loadingState, izsVar, q630Var);
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var, boolean z) {
        int i2;
        y48 y48Var;
        androidx.compose.runtime.a M = aVar.M(1263445561);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1263445561, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesPlaceholder (StorefrontServicesPlaceholder.kt:69)");
            }
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1566420062, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationBeauty88> (VkIcons.kt:3552)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_illustration_beauty_88, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            t8p0 a3 = csa0.a(a2, 0L, 0L, null, null, M, 199688, 22);
            vl20 a4 = zra0.a.a(d370.N(z ? R.string.storefront_services_admin_placeholder_title : R.string.storefront_services_user_placeholder_title, 0, M), null, d370.N(z ? R.string.storefront_services_admin_placeholder_description : R.string.storefront_services_user_placeholder_description, 0, M), null, M, 196608, 26);
            if (z) {
                M.K(-1785814668);
                String N = d370.N(R.string.storefront_services_admin_placeholder_button_text, 0, M);
                ButtonStyle buttonStyle = ButtonStyle.Primary;
                boolean z2 = (i2 & 896) == 256;
                Object x = M.x();
                if (z2 || x == a.C0011a.a) {
                    x = new cr0(izsVar, 9);
                    M.R(x);
                }
                r48 a5 = wra0.a.C3954a.a(N, (gzs) x, null, buttonStyle, null, false, null, null, null, null, null, null, false, false, null, null, M, 3072, 12582912, 131060);
                M = M;
                y48 a6 = wra0.b.a(a5, null, null, M, 14);
                M.j();
                y48Var = a6;
            } else {
                M.K(-1785480892);
                M.j();
                y48Var = null;
            }
            ldv0.d(q630Var, a3, a4, y48Var, null, null, false, M, (i2 >> 3) & 14, 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t7b0(z, q630Var, izsVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final PlaceholderState placeholderState, q630 q630Var, LoadingState loadingState, boolean z, r5j0 r5j0Var, final izs<? super wml0, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        r5j0 r5j0Var2;
        int i8;
        final LoadingState loadingState2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(764239499);
        if ((i & 6) == 0) {
            i3 = (M.o(placeholderState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i5 = i3 | 384;
            } else {
                i5 = i3 | (M.o(loadingState == null ? -1 : loadingState.ordinal()) ? 256 : 128);
            }
            i6 = i2 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i5 |= M.l(z2) ? 2048 : 1024;
                i7 = i2 & 16;
                if (i7 != 0) {
                    i8 = i5 | 24576;
                    r5j0Var2 = r5j0Var;
                } else {
                    r5j0Var2 = r5j0Var;
                    i8 = i5 | (M.J(r5j0Var2) ? 16384 : 8192);
                }
                if ((196608 & i) == 0) {
                    i8 |= M.y(izsVar) ? 131072 : 65536;
                }
                if (M.t(i8 & 1, (74899 & i8) != 74898)) {
                    if (i9 != 0) {
                        q630Var2 = q630.a.a;
                    }
                    LoadingState loadingState3 = i4 != 0 ? LoadingState.None : loadingState;
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i7 != 0) {
                        r5j0Var2 = androidx.compose.ui.graphics.e.a;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(764239499, i8, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesPlaceholder (StorefrontServicesPlaceholder.kt:37)");
                    }
                    int i10 = a.$EnumSwitchMapping$0[placeholderState.ordinal()];
                    if (i10 == 1) {
                        M.K(-162337729);
                        q630 d = txj0.d(q630Var2, 1.0f);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        e((i8 >> 9) & 896, M, izsVar, hr80.m(d, ylu0Var.getBackground().g, r5j0Var2), z2);
                        M.j();
                    } else if (i10 == 2) {
                        M.K(-161966597);
                        a((i8 & 112) | ((i8 >> 9) & 896), M, izsVar, q630Var2, z2);
                        M.j();
                    } else if (i10 == 3) {
                        M.K(-5218672);
                        b(q630Var2, M, (i8 >> 3) & 14);
                        M.j();
                    } else if (i10 == 4) {
                        M.K(-5216247);
                        d(loadingState3, q630Var2, izsVar, M, ((i8 >> 6) & 14) | (i8 & 112) | ((i8 >> 9) & 896));
                        M.j();
                    } else {
                        if (i10 != 5) {
                            throw alb0.c(-5238208, M);
                        }
                        M.K(-5213104);
                        c(q630Var2, M, (i8 >> 3) & 14);
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    loadingState2 = loadingState3;
                } else {
                    M.h();
                    loadingState2 = loadingState;
                }
                final q630 q630Var3 = q630Var2;
                final boolean z3 = z2;
                final r5j0 r5j0Var3 = r5j0Var2;
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.gol0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            hol0.f(PlaceholderState.this, q630Var3, loadingState2, z3, r5j0Var3, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            z2 = z;
            i7 = i2 & 16;
            if (i7 != 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (M.t(i8 & 1, (74899 & i8) != 74898)) {
            }
            final q630 q630Var32 = q630Var2;
            final boolean z32 = z2;
            final r5j0 r5j0Var32 = r5j0Var2;
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i2 & 16;
        if (i7 != 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (M.t(i8 & 1, (74899 & i8) != 74898)) {
        }
        final q630 q630Var322 = q630Var2;
        final boolean z322 = z2;
        final r5j0 r5j0Var322 = r5j0Var2;
        s = M.s();
        if (s != null) {
        }
    }
}
