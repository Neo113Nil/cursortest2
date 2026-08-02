package xsna;

import androidx.compose.runtime.a;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: ModalCard.kt */
/* loaded from: classes17.dex */
public abstract class qy20 {

    /* compiled from: ModalCard.kt */
    public static abstract class a extends qy20 {

        /* compiled from: ModalCard.kt */
        /* renamed from: xsna.qy20$a$a, reason: collision with other inner class name */
        public static final class C3580a {
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v10, types: [xsna.rep] */
            /* JADX WARN: Type inference failed for: r9v4, types: [xsna.wep] */
            public static ry20 a(efj efjVar, float f, kpv kpvVar, a28 a28Var, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i) {
                efj efjVar2;
                float f2;
                kpv kpvVar2 = kpvVar;
                if ((i & 4) != 0) {
                    kpvVar2 = rep.a;
                }
                kpv kpvVar3 = kpvVar2;
                a28 a28Var2 = a28Var;
                if ((i & 8) != 0) {
                    a28Var2 = wep.a;
                }
                a28 a28Var3 = a28Var2;
                if ((i & 16) != 0) {
                    aVar = null;
                }
                com.vk.core.compose.component.semantics.a aVar3 = aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1077515525, 196656, -1, "com.vk.core.compose.component.modal.card.ModalCard.Top.Avatar.Companion.invoke (ModalCard.kt:54)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    efjVar2 = efjVar;
                    f2 = f;
                    ry20 ry20Var = new ry20(efjVar2, f2, kpvVar3, a28Var3, aVar3);
                    aVar2.R(ry20Var);
                    x = ry20Var;
                } else {
                    efjVar2 = efjVar;
                    f2 = f;
                }
                ry20 ry20Var2 = (ry20) x;
                ((zak0) ry20Var2.a).setValue(efjVar2);
                ((zak0) ry20Var2.b).setValue(new pco(f2));
                ((zak0) ry20Var2.c).setValue(kpvVar3);
                ((zak0) ry20Var2.d).setValue(a28Var3);
                ((zak0) ry20Var2.e).setValue(aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return ry20Var2;
            }
        }
    }

    /* compiled from: ModalCard.kt */
    public static final class b {
        public static final void a(q630 q630Var, qy20 qy20Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(1561502012);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(qy20Var) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1561502012, i2, -1, "com.vk.core.compose.component.modal.card.ModalCard.Top.ComposeDefaultImpls.Content$default (ModalCard.kt:-1)");
                }
                qy20Var.a(q630Var, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new n5c(q630Var, qy20Var, i);
            }
        }
    }

    /* compiled from: ModalCard.kt */
    public static abstract class c extends qy20 {

        /* compiled from: ModalCard.kt */
        public static final class a {
            public static vy20 a(lg90 lg90Var, long j, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i) {
                if ((i & 2) != 0) {
                    j = l5g.k;
                }
                if ((i & 4) != 0) {
                    aVar = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-486895301, 3080, -1, "com.vk.core.compose.component.modal.card.ModalCard.Top.Icon.Companion.invoke (ModalCard.kt:31)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    x = new vy20(lg90Var, j, aVar);
                    aVar2.R(x);
                }
                vy20 vy20Var = (vy20) x;
                ((zak0) vy20Var.a).setValue(lg90Var);
                ((zak0) vy20Var.b).setValue(new l5g(j));
                ((zak0) vy20Var.c).setValue(aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return vy20Var;
            }
        }
    }

    /* compiled from: ModalCard.kt */
    public static abstract class d extends qy20 {

        /* compiled from: ModalCard.kt */
        public static final class a {
            public static wy20 a(lg90 lg90Var, androidx.compose.runtime.a aVar, int i, int i2) {
                boolean z = (i2 & 2) != 0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2003942686, i, -1, "com.vk.core.compose.component.modal.card.ModalCard.Top.Image.Companion.invoke (ModalCard.kt:102)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new wy20(lg90Var, z);
                    aVar.R(x);
                }
                wy20 wy20Var = (wy20) x;
                ((zak0) wy20Var.b).setValue(lg90Var);
                ((zak0) wy20Var.c).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return wy20Var;
            }
        }

        public abstract boolean b();
    }

    /* compiled from: ModalCard.kt */
    public static abstract class e extends qy20 {
    }

    public abstract void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
