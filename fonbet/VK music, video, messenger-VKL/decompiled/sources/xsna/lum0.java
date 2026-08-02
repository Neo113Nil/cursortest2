package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonAppearance;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonSize;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.lum0;
import xsna.q630;

/* compiled from: VkSubnavigationBar.kt */
/* loaded from: classes17.dex */
public abstract class lum0 {

    /* compiled from: VkSubnavigationBar.kt */
    public static final class a {
        public final SubnavigationButtonSize a;
        public final SubnavigationButtonMode b;
        public final SubnavigationButtonAppearance c;
        public final boolean d;
        public final String e;
        public final boolean f;

        public a(SubnavigationButtonSize subnavigationButtonSize, SubnavigationButtonMode subnavigationButtonMode, SubnavigationButtonAppearance subnavigationButtonAppearance, boolean z, String str, boolean z2) {
            this.a = subnavigationButtonSize;
            this.b = subnavigationButtonMode;
            this.c = subnavigationButtonAppearance;
            this.d = z;
            this.e = str;
            this.f = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && this.f == aVar.f;
        }

        public final int hashCode() {
            int b = qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
            String str = this.e;
            return Boolean.hashCode(this.f) + ((b + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ButtonLook(size=");
            sb.append(this.a);
            sb.append(", mode=");
            sb.append(this.b);
            sb.append(", appearance=");
            sb.append(this.c);
            sb.append(", isActive=");
            sb.append(this.d);
            sb.append(", label=");
            sb.append(this.e);
            sb.append(", isEnabled=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: VkSubnavigationBar.kt */
    public static final class b {
        public static final void a(final a aVar, final gzs gzsVar, final q630 q630Var, final lg90 lg90Var, final uum0 uum0Var, final Integer num, final lum0 lum0Var, androidx.compose.runtime.a aVar2, final int i) {
            int i2;
            lum0 lum0Var2;
            androidx.compose.runtime.a M = aVar2.M(11618842);
            if ((i & 6) == 0) {
                i2 = (M.J(aVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.y(gzsVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(q630Var) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= (i & 4096) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 2048 : 1024;
            }
            int i3 = i2 | 24576;
            if ((196608 & i) == 0) {
                i3 |= (262144 & i) == 0 ? M.J(uum0Var) : M.y(uum0Var) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                i3 |= M.J(num) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            if ((12582912 & i) == 0) {
                lum0Var2 = lum0Var;
                i3 |= M.J(lum0Var2) ? 8388608 : 4194304;
            } else {
                lum0Var2 = lum0Var;
            }
            if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(11618842, i3, -1, "com.vk.core.compose.component.subnavigation.SubnavigationBarScope.ComposeDefaultImpls.VkSubnavigationButtonInternal$default (VkSubnavigationBar.kt:-1)");
                }
                lum0Var2.b(aVar, gzsVar, q630Var, lg90Var, uum0Var, num, M, (i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | 4096 | (i3 & 7168) | 32768 | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new wzs() { // from class: xsna.mum0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        lum0.b.a(lum0.a.this, gzsVar, q630Var, lg90Var, uum0Var, num, lum0Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                        return s3q0.a;
                    }
                };
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final SubnavigationButtonSize subnavigationButtonSize, final SubnavigationButtonMode subnavigationButtonMode, final boolean z, final gzs<s3q0> gzsVar, q630 q630Var, SubnavigationButtonAppearance subnavigationButtonAppearance, final String str, lg90 lg90Var, uum0 uum0Var, Integer num, boolean z2, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        uum0 uum0Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final boolean z3;
        final uum0 uum0Var3;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final SubnavigationButtonAppearance subnavigationButtonAppearance2;
        final lg90 lg90Var2;
        final Integer num2;
        androidx.compose.runtime.f s;
        int i16;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(1934049248);
        if ((i & 6) == 0) {
            i4 = (M.o(subnavigationButtonSize.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= M.o(subnavigationButtonMode.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= M.l(z) ? 256 : 128;
        }
        int i17 = i4 | (M.y(gzsVar) ? 2048 : 1024);
        int i18 = i3 & 16;
        if (i18 != 0) {
            i17 |= 24576;
        } else if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i17 |= M.J(q630Var2) ? 16384 : 8192;
            i5 = i3 & 32;
            int i19 = 196608;
            if (i5 == 0) {
                if ((196608 & i) == 0) {
                    i19 = M.o(subnavigationButtonAppearance == null ? -1 : subnavigationButtonAppearance.ordinal()) ? 131072 : 65536;
                }
                int i20 = i17 | (M.J(str) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
                i6 = i3 & 128;
                if (i6 != 0) {
                    i7 = 12582912;
                } else {
                    i7 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 8388608 : 4194304;
                }
                int i21 = i20 | i7;
                i8 = i3 & 256;
                if (i8 != 0) {
                    i9 = i21 | 100663296;
                    uum0Var2 = uum0Var;
                } else {
                    uum0Var2 = uum0Var;
                    i9 = i21 | (M.J(uum0Var2) ? 67108864 : 33554432);
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                    i11 = i9 | 805306368;
                } else {
                    i11 = i9 | (M.J(num) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
                }
                i12 = i3 & 1024;
                if (i12 != 0) {
                    i14 = i2 | 6;
                    i13 = i12;
                } else if ((i2 & 6) == 0) {
                    i13 = i12;
                    i14 = i2 | (M.l(z2) ? 4 : 2);
                } else {
                    i13 = i12;
                    i14 = i2;
                }
                if ((i2 & 48) == 0) {
                    i14 |= M.J(this) ? 32 : 16;
                }
                i15 = i14;
                if (M.t(i11 & 1, (i11 & 306783379) == 306783378 || (i15 & 19) != 18)) {
                    if (i18 != 0) {
                        q630Var4 = q630.a.a;
                        i16 = 18;
                    } else {
                        i16 = 18;
                        q630Var4 = q630Var2;
                    }
                    SubnavigationButtonAppearance subnavigationButtonAppearance3 = i5 != 0 ? SubnavigationButtonAppearance.Inherit : subnavigationButtonAppearance;
                    lg90 lg90Var3 = i6 != 0 ? null : lg90Var;
                    uum0 uum0Var4 = i8 != 0 ? null : uum0Var2;
                    Integer num3 = i10 != 0 ? null : num;
                    boolean z4 = i13 != 0 ? true : z2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1934049248, i11, i15, "com.vk.core.compose.component.subnavigation.SubnavigationBarScope.VkSubnavigationButton (VkSubnavigationBar.kt:79)");
                    }
                    int i22 = ((i11 >> 6) & 1008) | 4096 | ((i11 >> 12) & 7168);
                    int i23 = i11 >> 9;
                    b.a(new a(subnavigationButtonSize, subnavigationButtonMode, subnavigationButtonAppearance3, z, str, z4), gzsVar, q630Var4, lg90Var3, uum0Var4, num3, this, M, (i23 & 3670016) | i22 | (458752 & i23) | ((i15 << i16) & 29360128));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    uum0Var3 = uum0Var4;
                    num2 = num3;
                    aVar2 = M;
                    subnavigationButtonAppearance2 = subnavigationButtonAppearance3;
                    z3 = z4;
                    q630Var3 = q630Var4;
                    lg90Var2 = lg90Var3;
                } else {
                    M.h();
                    z3 = z2;
                    uum0Var3 = uum0Var2;
                    aVar2 = M;
                    q630Var3 = q630Var2;
                    subnavigationButtonAppearance2 = subnavigationButtonAppearance;
                    lg90Var2 = lg90Var;
                    num2 = num;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.kum0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(i | 1);
                            int I2 = ne7.I(i2);
                            lum0.this.a(subnavigationButtonSize, subnavigationButtonMode, z, gzsVar, q630Var3, subnavigationButtonAppearance2, str, lg90Var2, uum0Var3, num2, z3, (androidx.compose.runtime.a) obj, I, I2, i3);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i17 |= i19;
            int i202 = i17 | (M.J(str) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            int i212 = i202 | i7;
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i15 = i14;
            if (M.t(i11 & 1, (i11 & 306783379) == 306783378 || (i15 & 19) != 18)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 32;
        int i192 = 196608;
        if (i5 == 0) {
        }
        i17 |= i192;
        int i2022 = i17 | (M.J(str) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        int i2122 = i2022 | i7;
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i15 = i14;
        if (M.t(i11 & 1, (i11 & 306783379) == 306783378 || (i15 & 19) != 18)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    public abstract void b(a aVar, gzs gzsVar, q630 q630Var, lg90 lg90Var, uum0 uum0Var, Integer num, androidx.compose.runtime.a aVar2, int i);
}
