package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public final class bon implements bms {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ dfl0 w;
    public final /* synthetic */ z9m x;
    public final /* synthetic */ tls y;
    public final /* synthetic */ int z;

    public bon(List list, int i, int i2, dfl0 dfl0Var, z9m z9mVar, tls tlsVar, int i3, boolean z) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.w = dfl0Var;
        this.x = z9mVar;
        this.y = tlsVar;
        this.z = i3;
        this.A = z;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5;
        u4y u4yVar = (u4y) obj;
        final int intValue = ((Number) obj2).intValue();
        fid fidVar = (fid) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((bts) fidVar).k(u4yVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= fidVar.c(intValue) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(i & 1, (i & 147) != 146);
        zy11 zy11Var = zy11.a;
        if (!V) {
            btsVar.Y();
            return zy11Var;
        }
        Object obj6 = this.a.get(intValue);
        int i2 = i & HProv.PP_DELETE_SAVED_PASSWD;
        afl0 afl0Var = (afl0) obj6;
        btsVar.e0(1271831713);
        int i3 = this.b;
        boolean z = intValue == 0 && i3 == 0;
        boolean z2 = intValue == this.c - 1;
        dfl0 dfl0Var = this.w;
        ju2 ju2Var = z ? dfl0Var.d.a : z2 ? dfl0Var.d.c : dfl0Var.d.b;
        String str = dfl0Var.f;
        final z9m z9mVar = this.x;
        z9mVar.getClass();
        is8 is8Var = new is8(z9mVar, intValue, 2);
        c530 c530Var = c530.a;
        f530 y = eja1.y(c530Var, is8Var);
        if (z9mVar.b.getIntValue() == intValue) {
            y = d.a(s1a1.g(y, 1.0f), new zvi(18, z9mVar));
        }
        f530 f530Var = y;
        int i4 = i2 >> 3;
        int i5 = i4 & 14;
        oz40 n = f.n(Integer.valueOf(intValue), btsVar);
        boolean k = btsVar.k(z9mVar) | btsVar.k(n);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (k || Q == o430Var) {
            Q = new y9m(0, z9mVar, n);
            btsVar.o0(Q);
        }
        f530 a = exw0.a(c530Var, zy11Var, (PointerInputEventHandler) Q);
        mzi0 mzi0Var = dfl0Var.e;
        int size = ((bpl0) z9mVar.a.getValue()).a.size();
        boolean c = (((i5 ^ 6) > 4 && btsVar.c(intValue)) || (i4 & 6) == 4) | btsVar.c(size) | btsVar.k(mzi0Var);
        Object Q2 = btsVar.Q();
        if (c || Q2 == o430Var) {
            if (size <= 1 || intValue < 0 || intValue >= size) {
                obj5 = EmptyList.a;
            } else {
                ListBuilder a2 = rcc.a();
                if (intValue > 0) {
                    final int i6 = 0;
                    a2.add(new nif(new sls() { // from class: v9m
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i7 = i6;
                            int i8 = intValue;
                            z9m z9mVar2 = z9mVar;
                            switch (i7) {
                                case 0:
                                    z9mVar2.c(i8, 0);
                                    break;
                                case 1:
                                    z9mVar2.c(i8, i8 - 1);
                                    break;
                                default:
                                    z9mVar2.c(i8, i8 + 1);
                                    break;
                            }
                            return Boolean.TRUE;
                        }
                    }, mzi0Var.a));
                    final int i7 = 1;
                    a2.add(new nif(new sls() { // from class: v9m
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i72 = i7;
                            int i8 = intValue;
                            z9m z9mVar2 = z9mVar;
                            switch (i72) {
                                case 0:
                                    z9mVar2.c(i8, 0);
                                    break;
                                case 1:
                                    z9mVar2.c(i8, i8 - 1);
                                    break;
                                default:
                                    z9mVar2.c(i8, i8 + 1);
                                    break;
                            }
                            return Boolean.TRUE;
                        }
                    }, mzi0Var.b));
                }
                if (intValue < size - 1) {
                    final int i8 = 2;
                    a2.add(new nif(new sls() { // from class: v9m
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i72 = i8;
                            int i82 = intValue;
                            z9m z9mVar2 = z9mVar;
                            switch (i72) {
                                case 0:
                                    z9mVar2.c(i82, 0);
                                    break;
                                case 1:
                                    z9mVar2.c(i82, i82 - 1);
                                    break;
                                default:
                                    z9mVar2.c(i82, i82 + 1);
                                    break;
                            }
                            return Boolean.TRUE;
                        }
                    }, mzi0Var.c));
                    a2.add(new nif(new w9m(z9mVar, intValue, size, 0), mzi0Var.d));
                }
                obj5 = a2.j();
            }
            Q2 = obj5;
            btsVar.o0(Q2);
        }
        i4a1.b(afl0Var, ju2Var, str, this.y, intValue + i3, this.z, afl0Var.g, f530Var, a, this.A, (List) Q2, btsVar, 0, 0);
        i4a1.c(!z2, btsVar, 0);
        btsVar.t(false);
        return zy11Var;
    }
}
