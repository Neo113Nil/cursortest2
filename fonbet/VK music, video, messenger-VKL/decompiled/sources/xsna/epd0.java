package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: ProductImage.kt */
/* loaded from: classes18.dex */
public final class epd0 {
    /* JADX WARN: Removed duplicated region for block: B:100:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final Object obj, final int i, final int i2, q630 q630Var, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        int i5;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        qow qowVar;
        ColorFilter porterDuffColorFilter;
        String str;
        androidx.compose.runtime.a M = aVar.M(2121076471);
        if ((i3 & 6) == 0) {
            i5 = (M.J(obj) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= M.o(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= M.o(i2) ? 256 : 128;
        }
        int i6 = i4 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            q630Var2 = q630Var;
            i5 |= M.J(q630Var2) ? 2048 : 1024;
            if ((i3 & 24576) == 0) {
                i5 |= M.l(z) ? 16384 : 8192;
            }
            if ((196608 & i3) == 0) {
                i5 |= M.l(z2) ? 131072 : 65536;
            }
            if (M.t(i5 & 1, (74899 & i5) == 74898)) {
                aVar2 = M;
                aVar2.h();
                q630Var3 = q630Var2;
            } else {
                q630 q630Var4 = i6 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2121076471, i5, -1, "com.vk.ecomm.design.compose.tile.impl.image.ProductImage (ProductImage.kt:106)");
                }
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z) {
                    M.K(1430545243);
                    Object x = M.x();
                    if (x == c0012a) {
                        qow qowVar2 = new qow(new jwx(2, 8));
                        M.R(qowVar2);
                        x = qowVar2;
                    }
                    T t = ((qow) x).a;
                    M.j();
                    qowVar = new qow(t);
                } else {
                    M.K(1430628198);
                    M.j();
                    qowVar = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                cw5 background = ylu0Var.getBackground();
                qow qowVar3 = qowVar;
                long c = l5g.c(14, background.g, 0.64f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long c2 = l5g.c(14, ylu0Var2.l().F0, 0.05f);
                boolean z3 = (458752 & i5) == 131072;
                Object x2 = M.x();
                if (z3 || x2 == c0012a) {
                    if (z2) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            se7.b();
                            porterDuffColorFilter = re7.b(f870.H(c), z42.a(3));
                        } else {
                            porterDuffColorFilter = new PorterDuffColorFilter(f870.H(c), z42.b(3));
                        }
                        x2 = new oe7(c, 3, porterDuffColorFilter);
                    } else {
                        x2 = l52.a(new PorterDuffColorFilter(f870.H(c2), PorterDuff.Mode.SRC_OVER));
                    }
                    M.R(x2);
                }
                final d6g d6gVar = (d6g) x2;
                if (z) {
                    str = ixj0.n(((Image) obj).b);
                } else {
                    ImageSize imageSize = (ImageSize) ixj0.c(((Image) obj).b, i, i2);
                    str = imageSize != null ? imageSize.d.d : null;
                }
                jai c3 = kai.c(-343367224, new a0t() { // from class: xsna.cpd0
                    @Override // xsna.a0t
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i7;
                        qa8 qa8Var = (qa8) obj2;
                        lg90 lg90Var = (lg90) obj4;
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                        int intValue = ((Integer) obj6).intValue();
                        if ((intValue & 6) == 0) {
                            i7 = (aVar3.J(qa8Var) ? 4 : 2) | intValue;
                        } else {
                            i7 = intValue;
                        }
                        if ((intValue & 384) == 0) {
                            i7 |= (intValue & 512) == 0 ? aVar3.J(lg90Var) : aVar3.y(lg90Var) ? 256 : 128;
                        }
                        if (aVar3.t(i7 & 1, (i7 & 1155) != 1154)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-343367224, i7, -1, "com.vk.ecomm.design.compose.tile.impl.image.ProductImage.<anonymous> (ProductImage.kt:134)");
                            }
                            dt1.a.getClass();
                            ty6 ty6Var = dt1.a.f;
                            q630.a aVar4 = q630.a.a;
                            androidx.compose.runtime.a aVar5 = aVar3;
                            vjw.a(lg90Var, null, ahn.E(qa8Var.b(aVar4, ty6Var), "product_main_image"), ty6Var, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d6g.this, aVar5, 27704 | ((i7 >> 6) & 14), 32);
                            if (z) {
                                aVar5.K(1359522683);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1573898770, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-HideOutlineShadowMedium48> (VkSdkIcons.kt:1062)");
                                }
                                lg90 a = pg90.a(R.drawable.vk_icon_hide_outline_shadow_medium_48, 0, aVar5);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var3 = (ylu0) aVar5.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                pzu0.b(a, null, ahn.E(qa8Var.b(txj0.q(aVar4, 48), ty6Var), "product_image_restricted_icon"), ylu0Var3.getIcon().c, aVar5, 56, 0);
                                aVar5 = aVar5;
                            } else {
                                aVar5.K(1354641082);
                            }
                            aVar5.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, M);
                int i7 = ((i5 >> 9) & 14) | 100663296;
                aVar2 = M;
                q630 q630Var5 = q630Var4;
                fwu0.c(q630Var5, null, str, null, null, null, qowVar3, c3, aVar2, i7, 186);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var5;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.dpd0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        epd0.a(obj, i, i2, q630Var3, z, z2, (androidx.compose.runtime.a) obj2, ne7.I(i3 | 1), i4);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i3 & 24576) == 0) {
        }
        if ((196608 & i3) == 0) {
        }
        if (M.t(i5 & 1, (74899 & i5) == 74898)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void b(Object obj, q630 q630Var, boolean z, boolean z2, final pco pcoVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Object obj2;
        boolean z3;
        final boolean z4;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-637162241);
        if ((i & 6) == 0) {
            i2 = (M.J(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        int i3 = i2 | (M.l(z) ? 256 : 128) | (M.l(z2) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i3 |= M.J(pcoVar) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-637162241, i3, -1, "com.vk.ecomm.design.compose.tile.impl.image.ProductImage (ProductImage.kt:45)");
            }
            if (pcoVar != null) {
                M.K(2055351720);
                int i4 = (i3 & 14) | ((i3 >> 9) & 112);
                int i5 = i3 << 3;
                obj2 = obj;
                c(obj2, pcoVar.b, q630Var, z, z2, M, i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344));
                q630Var2 = q630Var;
                z4 = z;
                z3 = z2;
                M = M;
                M.j();
            } else {
                obj2 = obj;
                z3 = z2;
                z4 = z;
                q630Var2 = q630Var;
                M.K(2055447789);
                d(obj2, q630Var2, z4, z3, M, i3 & 8190);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            obj2 = obj;
            z3 = z2;
            z4 = z;
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final Object obj3 = obj2;
            final boolean z5 = z3;
            s.d = new wzs() { // from class: xsna.zod0
                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    epd0.b(obj3, q630Var2, z4, z5, pcoVar, (androidx.compose.runtime.a) obj4, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final Object obj, final float f, final q630 q630Var, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        Object obj2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1542259864);
        if ((i & 6) == 0) {
            obj2 = obj;
            i2 = (M.J(obj2) ? 4 : 2) | i;
        } else {
            obj2 = obj;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z2) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1542259864, i2, -1, "com.vk.ecomm.design.compose.tile.impl.image.ProductImageWithDefinedWidth (ProductImage.kt:60)");
            }
            int I0 = (int) ((azl) M.r(uvi.h)).I0(f);
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            a(obj2, I0, (int) (I0 / 0.8317f), sua.d(0.8317f, q630Var, false), z, z2, M, i3 | (57344 & i4) | (i4 & 458752), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.apd0
                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    epd0.c(obj, f, q630Var, z, z2, (androidx.compose.runtime.a) obj3, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final Object obj, q630 q630Var, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(769950625);
        if ((i & 6) == 0) {
            i2 = (M.J(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(769950625, i2, -1, "com.vk.ecomm.design.compose.tile.impl.image.ProductImageWithUndefinedWidth (ProductImage.kt:79)");
            }
            ua8.a(sua.d(0.8317f, txj0.f(q630Var, 1.0f), false), null, false, kai.c(2018131447, new yzs() { // from class: xsna.bpd0
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    va8 va8Var = (va8) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(2018131447, intValue, -1, "com.vk.ecomm.design.compose.tile.impl.image.ProductImageWithUndefinedWidth.<anonymous> (ProductImage.kt:85)");
                        }
                        epd0.a(obj, o6j.i(va8Var.f()), o6j.j(va8Var.f()), null, z, z2, aVar2, 0, 8);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new df4(obj, q630Var, z, z2, i);
        }
    }
}
