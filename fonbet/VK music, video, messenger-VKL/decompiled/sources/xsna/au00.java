package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonSize;

/* compiled from: MarketButtonSlot.kt */
/* loaded from: classes18.dex */
public abstract class au00 {
    public final wh50 a = androidx.compose.runtime.k.b(ButtonSize.Medium);
    public final wh50 b = androidx.compose.runtime.k.b(Boolean.TRUE);

    /* compiled from: MarketButtonSlot.kt */
    public static abstract class a extends au00 {

        /* compiled from: MarketButtonSlot.kt */
        /* renamed from: xsna.au00$a$a, reason: collision with other inner class name */
        public static final class C2574a {
            public static oqv a(lg90 lg90Var, androidx.compose.runtime.a aVar) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-186496268, 196616, -1, "com.vk.ecomm.design.compose.marketbutton.MarketButtonSlot.Icon.Companion.invoke (MarketButtonSlot.kt:47)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1875707139, 70, -1, "com.vk.ecomm.design.compose.marketbutton.remember (IconImpl.kt:63)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new oqv(lg90Var);
                    aVar.R(x);
                }
                oqv oqvVar = (oqv) x;
                ((zak0) oqvVar.c).setValue(lg90Var);
                ((zak0) oqvVar.d).setValue(null);
                ((zak0) oqvVar.e).setValue(null);
                ((zak0) oqvVar.f).setValue(null);
                ((zak0) oqvVar.g).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return oqvVar;
            }
        }
    }

    /* compiled from: MarketButtonSlot.kt */
    public static abstract class b extends au00 {

        /* compiled from: MarketButtonSlot.kt */
        public static final class a {
            public static sco0 a(String str, String str2, lg90 lg90Var, uco ucoVar, String str3, com.vk.core.compose.component.semantics.a aVar, com.vk.core.compose.component.semantics.a aVar2, androidx.compose.runtime.a aVar3, int i, int i2) {
                String str4 = (i2 & 2) != 0 ? null : str2;
                lg90 lg90Var2 = (i2 & 4) != 0 ? null : lg90Var;
                uco ucoVar2 = (i2 & 16) != 0 ? null : ucoVar;
                String str5 = (i2 & 32) != 0 ? null : str3;
                com.vk.core.compose.component.semantics.a aVar4 = (i2 & 64) != 0 ? null : aVar;
                com.vk.core.compose.component.semantics.a aVar5 = (i2 & 128) != 0 ? null : aVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1130133004, i, -1, "com.vk.ecomm.design.compose.marketbutton.MarketButtonSlot.TextContent.Companion.invoke (MarketButtonSlot.kt:71)");
                }
                int i3 = i << 3;
                int i4 = (i3 & 3670016) | (i3 & 112) | 6 | (i3 & 896) | 4096 | (i3 & 7168) | (458752 & i3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1989444273, i4, -1, "com.vk.ecomm.design.compose.marketbutton.remember (TextContentImpl.kt:122)");
                }
                Object x = aVar3.x();
                if (x == a.C0011a.a) {
                    sco0 sco0Var = new sco0(str, str4, lg90Var2, ucoVar2, str5, aVar4, aVar5);
                    aVar3.R(sco0Var);
                    x = sco0Var;
                }
                sco0 sco0Var2 = (sco0) x;
                ((zak0) sco0Var2.c).setValue(str);
                ((zak0) sco0Var2.d).setValue(str4);
                ((zak0) sco0Var2.e).setValue(lg90Var2);
                ((zak0) sco0Var2.f).setValue(null);
                ((zak0) sco0Var2.g).setValue(ucoVar2);
                ((zak0) sco0Var2.h).setValue(str5);
                ((zak0) sco0Var2.i).setValue(aVar4);
                ((zak0) sco0Var2.j).setValue(aVar5);
                ((zak0) sco0Var2.k).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return sco0Var2;
            }
        }
    }

    public abstract void a(lgu0 lgu0Var, androidx.compose.runtime.a aVar, int i);

    public final void b(ButtonSize buttonSize) {
        uh50 C;
        dak0 j = qak0.j();
        uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
        if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            dak0 j2 = C.j();
            try {
                ((zak0) this.a).setValue(buttonSize);
                ((zak0) this.b).setValue(Boolean.TRUE);
                s3q0 s3q0Var = s3q0.a;
                C.w().a();
            } finally {
                dak0.q(j2);
            }
        } finally {
        }
    }

    public final boolean c() {
        return ((Boolean) ((zak0) this.b).getValue()).booleanValue();
    }
}
