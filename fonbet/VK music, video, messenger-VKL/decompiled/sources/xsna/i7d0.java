package xsna;

import androidx.compose.runtime.a;

/* compiled from: PrimaryBlock.kt */
/* loaded from: classes17.dex */
public interface i7d0 {

    /* compiled from: PrimaryBlock.kt */
    public static abstract class a implements i7d0 {

        /* compiled from: PrimaryBlock.kt */
        /* renamed from: xsna.i7d0$a$a, reason: collision with other inner class name */
        public static final class C3034a {
            public static q7d0 a(String str, String str2, gzs gzsVar, androidx.compose.runtime.a aVar) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1773205146, 24576, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlock.Content.Empty.Companion.invoke (PrimaryBlock.kt:237)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(981771028, 6, -1, "com.vk.community.design.compose.primaryblock.remember (PrimaryBlockEmptyContentImpl.kt:67)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new q7d0(str, str2, gzsVar);
                    aVar.R(x);
                }
                q7d0 q7d0Var = (q7d0) x;
                ((zak0) q7d0Var.b).setValue(str);
                ((zak0) q7d0Var.c).setValue(str2);
                ((zak0) q7d0Var.d).setValue(gzsVar);
                ((zak0) q7d0Var.e).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return q7d0Var;
            }
        }
    }

    /* compiled from: PrimaryBlock.kt */
    public static abstract class b implements i7d0 {

        /* compiled from: PrimaryBlock.kt */
        public static final class a {
            public static kwp a(String str, String str2, gzs gzsVar, androidx.compose.runtime.a aVar) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-813016348, 24576, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlock.Content.Error.Companion.invoke (PrimaryBlock.kt:255)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-327757504, 6, -1, "com.vk.community.design.compose.primaryblock.remember (ErrorPrimaryBlockContentImpl.kt:71)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new kwp(str, str2, gzsVar);
                    aVar.R(x);
                }
                kwp kwpVar = (kwp) x;
                ((zak0) kwpVar.b).setValue(str);
                ((zak0) kwpVar.c).setValue(str2);
                ((zak0) kwpVar.d).setValue(gzsVar);
                ((zak0) kwpVar.e).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return kwpVar;
            }
        }
    }

    void a(int i, androidx.compose.runtime.a aVar);
}
