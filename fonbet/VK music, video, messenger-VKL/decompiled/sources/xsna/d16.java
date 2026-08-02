package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* compiled from: Banner.kt */
/* loaded from: classes17.dex */
public abstract class d16 {
    public final wh50 a = androidx.compose.runtime.k.b(Banner$BackgroundMode.Auto);

    /* compiled from: Banner.kt */
    public interface a {

        /* compiled from: Banner.kt */
        /* renamed from: xsna.d16$a$a, reason: collision with other inner class name */
        public static final class C2697a {
            public static zp8 a(ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, ButtonSize buttonSize, String str, lg90 lg90Var, l5g l5gVar, pco pcoVar, lg90 lg90Var2, l5g l5gVar2, pco pcoVar2, String str2, SemanticsConfiguration semanticsConfiguration, gzs gzsVar, androidx.compose.runtime.a aVar, int i, int i2, int i3) {
                String str3;
                ButtonSize buttonSize2 = (i3 & 4) != 0 ? ButtonSize.Medium : buttonSize;
                lg90 lg90Var3 = (i3 & 16) != 0 ? null : lg90Var;
                l5g l5gVar3 = (i3 & 32) != 0 ? null : l5gVar;
                pco pcoVar3 = (i3 & 64) != 0 ? null : pcoVar;
                lg90 lg90Var4 = (i3 & 256) != 0 ? null : lg90Var2;
                l5g l5gVar4 = (i3 & 512) != 0 ? null : l5gVar2;
                pco pcoVar4 = (i3 & 1024) != 0 ? null : pcoVar2;
                String str4 = (i3 & 2048) != 0 ? null : str2;
                SemanticsConfiguration semanticsConfiguration2 = (i3 & 4096) != 0 ? null : semanticsConfiguration;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-635734645, i, i2, "com.vk.core.compose.component.banner.Banner.Middle.Button.Companion.invoke (Banner.kt:210)");
                }
                int i4 = i << 3;
                int i5 = ((i2 >> 12) & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | SQLiteDatabase.OPEN_PRIVATECACHE | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | 1073741824 | (i4 & 1879048192);
                int i6 = i2 << 3;
                int i7 = ((i >> 27) & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1402498629, i5, i7, "com.vk.core.compose.component.banner.remember (ButtonImpl.kt:86)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    str3 = str;
                    x = new zp8(str3, str4, buttonStyle, buttonAppearance, buttonSize2, lg90Var3, l5gVar3, pcoVar3, null, lg90Var4, l5gVar4, pcoVar4, semanticsConfiguration2, gzsVar);
                    aVar.R(x);
                } else {
                    str3 = str;
                }
                zp8 zp8Var = (zp8) x;
                ((zak0) zp8Var.a).setValue(str3);
                ((zak0) zp8Var.d).setValue(str3);
                ((zak0) zp8Var.f).setValue(buttonStyle);
                ((zak0) zp8Var.e).setValue(buttonSize2);
                ((zak0) zp8Var.g).setValue(buttonAppearance);
                ((zak0) zp8Var.h).setValue(lg90Var3);
                ((zak0) zp8Var.i).setValue(l5gVar3);
                ((zak0) zp8Var.j).setValue(pcoVar3);
                ((zak0) zp8Var.k).setValue(null);
                ((zak0) zp8Var.l).setValue(lg90Var4);
                ((zak0) zp8Var.m).setValue(l5gVar4);
                ((zak0) zp8Var.n).setValue(pcoVar4);
                ((zak0) zp8Var.b).setValue(semanticsConfiguration2);
                ((zak0) zp8Var.c).setValue(gzsVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return zp8Var;
            }
        }

        void a(int i, androidx.compose.runtime.a aVar);
    }

    /* compiled from: Banner.kt */
    public static final class b {
        public static xl20 a(String str, String str2, c cVar, a aVar, a aVar2, a aVar3, wzs wzsVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar4, int i, int i2) {
            mzo0 a;
            s0n0 a2;
            String str3 = (i2 & 1) != 0 ? null : str;
            String str4 = (i2 & 2) != 0 ? null : str2;
            c cVar2 = (i2 & 4) != 0 ? null : cVar;
            a aVar5 = (i2 & 8) != 0 ? null : aVar;
            a aVar6 = (i2 & 16) != 0 ? null : aVar2;
            a aVar7 = (i2 & 32) != 0 ? null : aVar3;
            wzs wzsVar2 = (i2 & 64) != 0 ? null : wzsVar;
            SemanticsConfiguration semanticsConfiguration2 = (i2 & 128) != 0 ? null : semanticsConfiguration;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2085963784, i, -1, "com.vk.core.compose.component.banner.Banner.Middle.Companion.invoke (Banner.kt:282)");
            }
            if (str3 == null) {
                aVar4.K(-934218540);
                aVar4.j();
                a = null;
            } else {
                aVar4.K(-934218539);
                us2 e = ws2.e(str3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1367078979, 24576, -1, "com.vk.core.compose.component.banner.Banner.Middle.Title.Companion.invoke (Banner.kt:69)");
                }
                a = nzo0.a(e, Integer.MAX_VALUE, aVar4, 6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
            }
            if (str4 == null) {
                aVar4.K(-934153967);
                aVar4.j();
                a2 = null;
            } else {
                aVar4.K(-934153966);
                us2 e2 = ws2.e(str4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(412463819, 24576, -1, "com.vk.core.compose.component.banner.Banner.Middle.Subtitle.Companion.invoke (Banner.kt:105)");
                }
                a2 = t0n0.a(e2, Integer.MAX_VALUE, aVar4, 6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
            }
            a aVar8 = aVar7;
            mzo0 mzo0Var = a;
            c cVar3 = cVar2;
            xl20 b = b(mzo0Var, a2, cVar3, aVar5, aVar6, aVar8, wzsVar2, semanticsConfiguration2, aVar4, i & 268435328, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return b;
        }

        public static xl20 b(mzo0 mzo0Var, s0n0 s0n0Var, c cVar, a aVar, a aVar2, a aVar3, wzs wzsVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar4, int i, int i2) {
            c cVar2 = (i2 & 4) != 0 ? null : cVar;
            a aVar5 = (i2 & 16) != 0 ? null : aVar2;
            a aVar6 = (i2 & 32) != 0 ? null : aVar3;
            wzs wzsVar2 = (i2 & 64) != 0 ? null : wzsVar;
            SemanticsConfiguration semanticsConfiguration2 = (i2 & 128) != 0 ? null : semanticsConfiguration;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1582754460, i, -1, "com.vk.core.compose.component.banner.Banner.Middle.Companion.invoke (Banner.kt:240)");
            }
            int i3 = ((i << 3) & 29360128) | 6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1031113933, i3, -1, "com.vk.core.compose.component.banner.remember (MiddleImpl.kt:88)");
            }
            Object x = aVar4.x();
            if (x == a.C0011a.a) {
                xl20 xl20Var = new xl20(mzo0Var, s0n0Var, cVar2, aVar, aVar5, aVar6, wzsVar2, semanticsConfiguration2);
                aVar4.R(xl20Var);
                x = xl20Var;
            }
            xl20 xl20Var2 = (xl20) x;
            ((zak0) xl20Var2.b).setValue(mzo0Var);
            ((zak0) xl20Var2.c).setValue(s0n0Var);
            ((zak0) xl20Var2.d).setValue(cVar2);
            ((zak0) xl20Var2.e).setValue(aVar);
            ((zak0) xl20Var2.f).setValue(aVar5);
            ((zak0) xl20Var2.g).setValue(aVar6);
            ((zak0) xl20Var2.h).setValue(wzsVar2);
            ((zak0) xl20Var2.i).setValue(semanticsConfiguration2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return xl20Var2;
        }
    }

    /* compiled from: Banner.kt */
    public static abstract class c {
        public final wh50 a = androidx.compose.runtime.k.b(Banner$BackgroundMode.Auto);

        /* compiled from: Banner.kt */
        public static abstract class a extends c {

            /* compiled from: Banner.kt */
            /* renamed from: xsna.d16$c$a$a, reason: collision with other inner class name */
            public static final class C2698a {
                public static e8q a(us2 us2Var, boolean z, gzs gzsVar, String str, int i, String str2, long j, long j2, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i2, int i3) {
                    gzs gzsVar2;
                    long j3;
                    long j4;
                    long j5;
                    com.vk.core.compose.component.semantics.a aVar3;
                    int i4 = (i3 & 16) != 0 ? 2 : i;
                    String str3 = (i3 & 32) != 0 ? null : str2;
                    int i5 = i3 & 128;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (i5 != 0) {
                        Object x = aVar2.x();
                        if (x == c0012a) {
                            x = new d4(3);
                            aVar2.R(x);
                        }
                        gzsVar2 = (gzs) x;
                    } else {
                        gzsVar2 = null;
                    }
                    if ((i3 & 256) != 0) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j3 = ylu0Var.getText().f;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & 512) != 0) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j4 = ylu0Var2.getText().f;
                    } else {
                        j4 = j2;
                    }
                    com.vk.core.compose.component.semantics.a aVar4 = (i3 & 1024) != 0 ? null : aVar;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1488566734, i2, 48, "com.vk.core.compose.component.banner.Banner.Middle.Description.Expandable.Companion.invoke (Banner.kt:170)");
                    }
                    int i6 = i2 << 3;
                    int i7 = (i6 & 29360128) | (i6 & 7168) | 6 | (57344 & i6) | (458752 & i6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1413605436, i7, 0, "com.vk.core.compose.component.banner.remember (ExpandableDescriptionImpl.kt:78)");
                    }
                    Object x2 = aVar2.x();
                    if (x2 == c0012a) {
                        e8q e8qVar = new e8q(us2Var, z, gzsVar, str, i4, str3, false, gzsVar2, j3, j4, aVar4);
                        j5 = j4;
                        aVar3 = aVar4;
                        aVar2.R(e8qVar);
                        x2 = e8qVar;
                    } else {
                        j5 = j4;
                        aVar3 = aVar4;
                    }
                    e8q e8qVar2 = (e8q) x2;
                    ((zak0) e8qVar2.b).setValue(us2Var);
                    ((zak0) e8qVar2.c).setValue(Boolean.valueOf(z));
                    ((zak0) e8qVar2.d).setValue(gzsVar);
                    ((zak0) e8qVar2.e).setValue(str);
                    ((wak0) e8qVar2.f).C(i4);
                    ((zak0) e8qVar2.g).setValue(str3);
                    ((zak0) e8qVar2.h).setValue(false);
                    ((zak0) e8qVar2.i).setValue(gzsVar2);
                    ((zak0) e8qVar2.j).setValue(new l5g(j3));
                    ((zak0) e8qVar2.k).setValue(new l5g(j5));
                    ((zak0) e8qVar2.l).setValue(aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return e8qVar2;
                }
            }
        }

        /* compiled from: Banner.kt */
        public static abstract class b extends c {

            /* compiled from: Banner.kt */
            public static final class a {
                public static vsa0 a(String str, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2) {
                    if ((i2 & 2) != 0) {
                        semanticsConfiguration = null;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1334713105, i, -1, "com.vk.core.compose.component.banner.Banner.Middle.Description.Plain.Companion.invoke (Banner.kt:141)");
                    }
                    us2 b = ws2.b(str, aVar, i & 14);
                    int i3 = i & 1008;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-560998021, i3, -1, "com.vk.core.compose.component.banner.Banner.Middle.Description.Plain.Companion.invoke (Banner.kt:150)");
                    }
                    int i4 = ((i3 << 3) & 896) | ((i3 >> 6) & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1001814625, i4, -1, "com.vk.core.compose.component.banner.remember (PlainDescriptionImpl.kt:38)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new vsa0(b, semanticsConfiguration);
                        aVar.R(x);
                    }
                    vsa0 vsa0Var = (vsa0) x;
                    ((zak0) vsa0Var.b).setValue(b);
                    ((zak0) vsa0Var.c).setValue(semanticsConfiguration);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return vsa0Var;
                }
            }
        }

        public abstract void a(int i, androidx.compose.runtime.a aVar);
    }

    /* compiled from: Banner.kt */
    public static abstract class d {
        public final wh50 a = androidx.compose.runtime.k.b(Banner$BackgroundMode.Auto);

        /* compiled from: Banner.kt */
        public static final class a {
            public static s0n0 a(String str, androidx.compose.runtime.a aVar) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-582326057, 24624, -1, "com.vk.core.compose.component.banner.Banner.Middle.Subtitle.Companion.invoke (Banner.kt:118)");
                }
                s0n0 a = t0n0.a(ws2.e(str), 2, aVar, 3078);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return a;
            }
        }

        public abstract void a(int i, androidx.compose.runtime.a aVar);
    }

    /* compiled from: Banner.kt */
    public static abstract class e {
        public final wh50 a = androidx.compose.runtime.k.b(Banner$BackgroundMode.Auto);

        /* compiled from: Banner.kt */
        public static final class a {
            public static mzo0 a(String str, androidx.compose.runtime.a aVar) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(289744719, 24624, -1, "com.vk.core.compose.component.banner.Banner.Middle.Title.Companion.invoke (Banner.kt:82)");
                }
                mzo0 a = nzo0.a(ws2.e(str), 1, aVar, 3078);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return a;
            }
        }

        public abstract void a(int i, androidx.compose.runtime.a aVar);
    }

    public abstract void a(int i, androidx.compose.runtime.a aVar);
}
