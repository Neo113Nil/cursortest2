package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.input.InputSelect$State;
import xsna.b6u0;

/* compiled from: FormField.kt */
/* loaded from: classes17.dex */
public abstract class g8s {
    public final wh50 a = androidx.compose.runtime.k.b(Boolean.FALSE);
    public final wh50 b = cq.f(0);

    /* compiled from: FormField.kt */
    public static abstract class a extends g8s {
    }

    /* compiled from: FormField.kt */
    public static abstract class b extends g8s {

        /* compiled from: FormField.kt */
        public static final class a {
            public static u2x a(s2x s2xVar, InputSelect$State inputSelect$State, boolean z, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
                if ((i2 & 2) != 0) {
                    inputSelect$State = InputSelect$State.Default;
                }
                if ((i2 & 4) != 0) {
                    z = true;
                }
                if ((i2 & 8) != 0) {
                    aVar = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1128653548, i, -1, "com.vk.core.compose.component.form.FormField.Content.Input.Companion.invoke (FormField.kt:167)");
                }
                int i3 = (i >> 12) & 14;
                int i4 = i << 3;
                int i5 = (i4 & 57344) | i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1973391806, i5, -1, "com.vk.core.compose.component.form.remember (InputSelectImpl.kt:56)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    x = new u2x(s2xVar, inputSelect$State, z, aVar);
                    aVar2.R(x);
                }
                u2x u2xVar = (u2x) x;
                ((zak0) u2xVar.c).setValue(s2xVar);
                ((zak0) u2xVar.d).setValue(inputSelect$State);
                ((zak0) u2xVar.e).setValue(Boolean.valueOf(z));
                ((zak0) u2xVar.f).setValue(aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return u2xVar;
            }
        }
    }

    /* compiled from: FormField.kt */
    public static abstract class c extends g8s {
    }

    /* compiled from: FormField.kt */
    public static abstract class d extends g8s {

        /* compiled from: FormField.kt */
        public static abstract class a extends d {

            /* compiled from: FormField.kt */
            /* renamed from: xsna.g8s$d$a$a, reason: collision with other inner class name */
            public static final class C2927a {
                public static e0c a(int i, int i2, androidx.compose.runtime.a aVar, gzs gzsVar, boolean z) {
                    String str = (i2 & 8) != 0 ? null : "Subtitle";
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1818209204, i, -1, "com.vk.core.compose.component.form.FormField.Content.SelectionControls.CheckBox.Companion.invoke (FormField.kt:205)");
                    }
                    int i3 = ((i << 3) & 57344) | 438;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1345657450, i3, -1, "com.vk.core.compose.component.form.remember (CheckBoxImpl.kt:56)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new e0c(str, gzsVar, z);
                        aVar.R(x);
                    }
                    e0c e0cVar = (e0c) x;
                    ((zak0) e0cVar.c).setValue("Title");
                    ((zak0) e0cVar.d).setValue(gzsVar);
                    ((zak0) e0cVar.e).setValue(Boolean.valueOf(z));
                    ((zak0) e0cVar.f).setValue(str);
                    ((zak0) e0cVar.g).setValue(true);
                    ((zak0) e0cVar.h).setValue(false);
                    ((zak0) e0cVar.i).setValue(null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return e0cVar;
                }
            }
        }
    }

    /* compiled from: FormField.kt */
    public static abstract class e extends g8s {

        /* compiled from: FormField.kt */
        public static final class a {
            public static ybo0 a(tho0 tho0Var, izs izsVar, String str, InputSelect$State inputSelect$State, int i, int i2, boolean z, rgy rgyVar, uey ueyVar, izs izsVar2, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i3, int i4, int i5) {
                izs izsVar3;
                boolean z2;
                boolean z3;
                long j;
                long j2;
                frv0 frv0Var;
                rgy rgyVar2;
                uey ueyVar2;
                sg50 sg50Var;
                izs izsVar4;
                String str2 = (i5 & 4) != 0 ? null : str;
                InputSelect$State inputSelect$State2 = (i5 & 8) != 0 ? InputSelect$State.Default : inputSelect$State;
                int i6 = (i5 & 16) != 0 ? 1 : i;
                int i7 = (i5 & 32) != 0 ? Integer.MAX_VALUE : i2;
                boolean z4 = (i5 & 64) != 0 ? true : z;
                boolean z5 = (i5 & 128) == 0;
                rgy rgyVar3 = (i5 & 256) != 0 ? rgy.e : rgyVar;
                uey ueyVar3 = (i5 & 512) != 0 ? uey.d : ueyVar;
                Object x = aVar2.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = ir.h(aVar2);
                }
                sg50 sg50Var2 = (sg50) x;
                if ((i5 & 4096) != 0) {
                    Object x2 = aVar2.x();
                    if (x2 == c0012a) {
                        x2 = new fj1(25);
                        aVar2.R(x2);
                    }
                    izsVar3 = (izs) x2;
                } else {
                    izsVar3 = izsVar2;
                }
                com.vk.core.compose.component.semantics.a aVar3 = (i5 & 8192) != 0 ? null : aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-641902203, i3, i4, "com.vk.core.compose.component.form.FormField.Content.TextArea.Companion.invoke (FormField.kt:106)");
                }
                int i8 = i3 << 3;
                int i9 = (i8 & 234881024) | (i8 & 112) | 6 | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (i8 & 3670016) | (29360128 & i8);
                int i10 = ((i3 >> 18) & 8064) | ((i4 << 12) & 3670016);
                s1v.k();
                on20 on20Var = on20.a;
                long u = sd9.u(aVar2);
                s1v.k();
                long p = sd9.p(aVar2);
                s1v.k();
                frv0 f = on20Var.f(aVar2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-786539334, i9, i10, "com.vk.core.compose.component.form.remember (TextAreaImpl.kt:117)");
                }
                Object x3 = aVar2.x();
                a6u0 a6u0Var = b6u0.a.a;
                if (x3 == c0012a) {
                    ybo0 ybo0Var = new ybo0(tho0Var, izsVar, str2, inputSelect$State2, i6, i7, z4, z5, u, p, f, rgyVar3, ueyVar3, a6u0Var, sg50Var2, izsVar3, aVar3);
                    z2 = z4;
                    z3 = z5;
                    j = u;
                    j2 = p;
                    frv0Var = f;
                    rgyVar2 = rgyVar3;
                    ueyVar2 = ueyVar3;
                    sg50Var = sg50Var2;
                    izsVar4 = izsVar3;
                    aVar2.R(ybo0Var);
                    x3 = ybo0Var;
                } else {
                    z2 = z4;
                    z3 = z5;
                    j = u;
                    j2 = p;
                    frv0Var = f;
                    rgyVar2 = rgyVar3;
                    ueyVar2 = ueyVar3;
                    sg50Var = sg50Var2;
                    izsVar4 = izsVar3;
                }
                ybo0 ybo0Var2 = (ybo0) x3;
                ((zak0) ybo0Var2.c).setValue(tho0Var);
                ((zak0) ybo0Var2.d).setValue(izsVar);
                ((zak0) ybo0Var2.e).setValue(str2);
                ((zak0) ybo0Var2.f).setValue(inputSelect$State2);
                ((wak0) ybo0Var2.g).C(i6);
                ((wak0) ybo0Var2.h).C(i7);
                ((zak0) ybo0Var2.i).setValue(Boolean.valueOf(z2));
                ((zak0) ybo0Var2.j).setValue(Boolean.valueOf(z3));
                ((zak0) ybo0Var2.k).setValue(new l5g(j));
                ((zak0) ybo0Var2.l).setValue(new l5g(j2));
                ((zak0) ybo0Var2.m).setValue(frv0Var);
                ((zak0) ybo0Var2.n).setValue(rgyVar2);
                ((zak0) ybo0Var2.o).setValue(ueyVar2);
                ((zak0) ybo0Var2.p).setValue(a6u0Var);
                ((zak0) ybo0Var2.q).setValue(sg50Var);
                ((zak0) ybo0Var2.r).setValue(izsVar4);
                ((zak0) ybo0Var2.s).setValue(aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return ybo0Var2;
            }
        }
    }

    public abstract void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
