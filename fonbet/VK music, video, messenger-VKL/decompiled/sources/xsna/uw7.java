package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.d16;
import xsna.q630;
import xsna.us2;

/* compiled from: BookingServiceItemView.kt */
/* loaded from: classes18.dex */
public final class uw7 {
    public static final void a(final BookingServiceModel bookingServiceModel, final String str, final boolean z, q630 q630Var, boolean z2, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        final boolean z3;
        int i3;
        q630.a aVar2;
        boolean z4;
        kgq kgqVar;
        androidx.compose.runtime.a M = aVar.M(-332702804);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(bookingServiceModel) : M.y(bookingServiceModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        int i4 = i2 | 27648;
        if ((i & 196608) == 0) {
            i4 |= M.y(gzsVar) ? 131072 : 65536;
        }
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-332702804, i4, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingGroupServiceView (BookingServiceItemView.kt:155)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean z5 = bookingServiceModel.b == -1;
            q630.a aVar3 = q630.a.a;
            if (z5) {
                M.K(1235604289);
                beu0.a(d16.b.a(d370.N(R.string.booking_services_custom_category_empty_title, 0, M), d370.N(R.string.booking_services_custom_category_empty_subtitle, 0, M), null, null, null, null, null, null, M, 100663296, 252), s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), null, null, null, null, null, null, null, null, null, null, M, 0, 0, 4092);
                M = M;
                M.j();
                aVar2 = aVar3;
                z4 = true;
            } else {
                M.K(1236005243);
                us2 a = w7q.a(mri0.b(bookingServiceModel.k, context), bookingServiceModel.h);
                q630 c = ojc.c(ahn.E(aVar3, "service_cell"), !z, null, null, gzsVar, 14);
                if (z) {
                    c = c.g(o19.a(aVar3, 0.64f));
                }
                q630 q630Var3 = c;
                com.vk.core.compose.component.cell.content.u0 a2 = o.b.a.a(gzsVar, cq.b("service_chevron", null, 3), 0L, z, M, 196608 | ((i4 >> 15) & 14) | ((i4 << 6) & 57344), 10);
                com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(bookingServiceModel.c, null, null, 4, cq.b("service_name", null, 3), null, M, 12585984, 86);
                us2.b b = xga0.b(-1899760301, M);
                if (androidx.compose.runtime.b.d()) {
                    i3 = 0;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    i3 = 0;
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int m = b.m(new hik0(ylu0Var.getText().a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    int i5 = bookingServiceModel.e;
                    if (i5 <= 0) {
                        i5 = i3;
                    }
                    int i6 = bookingServiceModel.f;
                    if (i6 <= 0) {
                        i6 = i3;
                    }
                    b.g(mri0.c(context, new ft7(i5, i6), str));
                    s3q0 s3q0Var = s3q0.a;
                    b.k(m);
                    us2 n = b.n();
                    M.j();
                    int i7 = i3;
                    aVar2 = aVar3;
                    com.vk.core.compose.component.cell.content.h1 a4 = Cell$Middle.c.b.a(n, null, 0, 0, null, null, cq.b("service_price", null, 3), null, M, 805306368, 446);
                    us2 us2Var = (a.c.length() == 0 ? 1 : i7) != 0 ? null : a;
                    if (us2Var != null) {
                        z4 = true;
                        kgqVar = new kgq(us2Var, true, cq.b("service_description", null, 3));
                    } else {
                        z4 = true;
                        kgqVar = null;
                    }
                    wiu0.b(q630Var3, false, null, Cell$Middle.a.a(a3, a4, kgqVar, null, M, 196608, 24), a2, null, null, M, 0, 102);
                    M = M;
                    M.j();
                } catch (Throwable th) {
                    b.k(m);
                    throw th;
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z3 = z4;
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
            z3 = z2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.pw7
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uw7.a(BookingServiceModel.this, str, z, q630Var2, z3, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final BookingServiceModel bookingServiceModel, final String str, final q630 q630Var, final com.vk.core.compose.component.cell.content.o oVar, gzs gzsVar, boolean z, boolean z2, final boolean z3, float f, float f2, String str2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        com.vk.core.compose.component.cell.content.o oVar2;
        gzs gzsVar2;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        androidx.compose.runtime.a aVar2;
        final boolean z5;
        final float f3;
        final float f4;
        final boolean z6;
        final gzs gzsVar3;
        final String str3;
        androidx.compose.runtime.f s;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        int i13;
        String c;
        androidx.compose.runtime.a M = aVar.M(-245270986);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? M.J(bookingServiceModel) : M.y(bookingServiceModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            oVar2 = oVar;
            i3 |= M.J(oVar2) ? 2048 : 1024;
        } else {
            oVar2 = oVar;
        }
        int i14 = i2 & 16;
        if (i14 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            gzsVar2 = gzsVar;
            i3 |= M.y(gzsVar2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= M.l(z) ? 131072 : 65536;
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
                z4 = z2;
            } else {
                z4 = z2;
                if ((i & 1572864) == 0) {
                    i3 |= M.l(z4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
            }
            if ((i & 12582912) == 0) {
                i3 |= M.l(z3) ? 8388608 : 4194304;
            }
            i6 = i2 & 256;
            if (i6 == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= M.n(f) ? 67108864 : 33554432;
            }
            i7 = i2 & 512;
            if (i7 == 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i8 = i7;
                i3 |= M.n(f2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                i9 = i2 & 1024;
                if (i9 != 0) {
                    i11 = 6;
                    i10 = i9;
                } else {
                    i10 = i9;
                    i11 = M.J(str2) ? 4 : 2;
                }
                i12 = i11;
                if (M.t(i3 & 1, (i3 & 306783379) == 306783378 || (i12 & 3) != 2)) {
                    gzs gzsVar4 = i14 != 0 ? null : gzsVar2;
                    boolean z7 = i4 != 0 ? true : z;
                    if (i5 != 0) {
                        z4 = false;
                    }
                    float f5 = i6 != 0 ? 0 : f;
                    float f6 = i8 != 0 ? 0 : f2;
                    String str4 = i10 != 0 ? null : str2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-245270986, i3, i12, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServiceView (BookingServiceItemView.kt:49)");
                    }
                    Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                    M.K(517804546);
                    q630 E = ahn.E(q630Var, "service_cell");
                    q630.a aVar3 = q630.a.a;
                    if (z3) {
                        E = E.g(o19.a(aVar3, 0.64f));
                    }
                    if (z4) {
                        boolean z8 = (i3 & 57344) == 16384;
                        Object x = M.x();
                        if (z8 || x == a.C0011a.a) {
                            x = new sw7(0, gzsVar4);
                            M.R(x);
                        }
                        E = E.g(ojc.c(aVar3, false, null, null, (gzs) x, 15));
                    }
                    q630 q630Var2 = E;
                    M.j();
                    q630 H = s200.H(q630Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, 5);
                    com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(bookingServiceModel.c, null, null, 4, cq.b("service_name", null, 3), null, M, 12610560, 70);
                    us2.b b = xga0.b(517825217, M);
                    if (androidx.compose.runtime.b.d()) {
                        h1Var = a;
                        i13 = i3;
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    } else {
                        h1Var = a;
                        i13 = i3;
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    int m = b.m(new hik0(ylu0Var.getText().a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    if (str4 == null) {
                        try {
                            int i15 = bookingServiceModel.e;
                            if (i15 <= 0) {
                                i15 = 0;
                            }
                            int i16 = bookingServiceModel.f;
                            if (i16 <= 0) {
                                i16 = 0;
                            }
                            c = mri0.c(context, new ft7(i15, i16), str);
                        } catch (Throwable th) {
                            b.k(m);
                            throw th;
                        }
                    } else {
                        c = str4;
                    }
                    b.g(c);
                    s3q0 s3q0Var = s3q0.a;
                    b.k(m);
                    us2 n = b.n();
                    M.j();
                    wiu0.b(H, false, null, Cell$Middle.a.a(h1Var, Cell$Middle.c.b.a(n, null, 0, 0, null, null, cq.b("service_price", null, 3), null, M, 805306368, 446), new kgq(w7q.a(mri0.b(bookingServiceModel.k, context), bookingServiceModel.h), z7, cq.b("service_description", null, 3)), null, M, 196608, 24), oVar2, null, null, M, (i13 << 3) & 57344, 102);
                    aVar2 = M;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    gzsVar3 = gzsVar4;
                    z5 = z7;
                    z6 = z4;
                    f3 = f5;
                    f4 = f6;
                    str3 = str4;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    z5 = z;
                    f3 = f;
                    f4 = f2;
                    z6 = z4;
                    gzsVar3 = gzsVar2;
                    str3 = str2;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.tw7
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            uw7.b(BookingServiceModel.this, str, q630Var, oVar, gzsVar3, z5, z6, z3, f3, f4, str3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i8 = i7;
            i9 = i2 & 1024;
            if (i9 != 0) {
            }
            i12 = i11;
            if (M.t(i3 & 1, (i3 & 306783379) == 306783378 || (i12 & 3) != 2)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        gzsVar2 = gzsVar;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        i7 = i2 & 512;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i2 & 1024;
        if (i9 != 0) {
        }
        i12 = i11;
        if (M.t(i3 & 1, (i3 & 306783379) == 306783378 || (i12 & 3) != 2)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    public static final void c(final BookingServiceModel bookingServiceModel, final String str, final boolean z, final boolean z2, final q630 q630Var, boolean z3, final boolean z4, float f, float f2, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z5;
        final boolean z6;
        final float f3;
        final float f4;
        float f5;
        float f6;
        boolean z7;
        androidx.compose.runtime.a M = aVar.M(545117581);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(bookingServiceModel) : M.y(bookingServiceModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z5 = z;
            i2 |= M.l(z5) ? 256 : 128;
        } else {
            z5 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if ((i & 1572864) == 0) {
            i3 |= M.l(z4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i4 = i3 | 113246208;
        if ((805306368 & i) == 0) {
            i4 |= M.y(gzsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (M.t(i4 & 1, (306783379 & i4) != 306783378)) {
            float f7 = 0;
            float f8 = 0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(545117581, i4, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServiceViewSelectable (BookingServiceItemView.kt:113)");
            }
            if (bookingServiceModel.b == -1) {
                M.K(326921263);
                Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                beu0.a(d16.b.a(context.getString(R.string.booking_services_custom_category_empty_title), context.getString(R.string.booking_services_custom_category_empty_subtitle), null, null, null, null, null, null, M, 100663296, 252), s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var), null, null, null, null, null, null, null, null, null, null, M, 0, 0, 4092);
                M.j();
                f3 = f7;
                f6 = f8;
                z7 = true;
            } else {
                M.K(327326061);
                com.vk.core.compose.component.cell.content.b0 b0Var = null;
                if (z4) {
                    M.K(327637208);
                    boolean z8 = (i4 & 1879048192) == 536870912;
                    Object x = M.x();
                    if (z8 || x == a.C0011a.a) {
                        x = new qw7(0, gzsVar);
                        M.R(x);
                    }
                    f6 = f8;
                    f5 = f7;
                    b0Var = o.e.a.C0736a.a(z5, (gzs) x, false, cq.b("service_checkbox", null, 3), M, ((i4 >> 6) & 14) | 24576, 4);
                    M.j();
                } else {
                    f5 = f7;
                    f6 = f8;
                    M.K(327947920);
                    M.j();
                }
                int i5 = i4 << 3;
                f3 = f5;
                z7 = true;
                b(bookingServiceModel, str, q630Var, b0Var, gzsVar, true, true, z2, f3, f6, null, M, (234881024 & i5) | (i4 & 14) | 1572864 | (i4 & 112) | ((i4 >> 6) & 896) | ((i4 >> 15) & 57344) | (458752 & i4) | ((i4 << 12) & 29360128) | (i5 & 1879048192), 1024);
                M = M;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z6 = z7;
            f4 = f6;
        } else {
            M.h();
            z6 = z3;
            f3 = f;
            f4 = f2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rw7
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uw7.c(BookingServiceModel.this, str, z, z2, q630Var, z6, z4, f3, f4, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
