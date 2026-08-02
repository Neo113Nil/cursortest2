package defpackage;

import com.yandex.go.scooters.offers.v2.data.model.ScootersBookState$Booking$Type;
import com.yandex.go.scooters.offers.v2.domain.e;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a6n0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ a6n0(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        a3n0 a3n0Var;
        Object value2;
        a3n0 a3n0Var2;
        Object value3;
        a3n0 a3n0Var3;
        Object value4;
        a3n0 a3n0Var4;
        int i = this.a;
        s2n0 s2n0Var = s2n0.a;
        zy11 zy11Var = zy11.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                ((com.yandex.go.scooters.misc.attention.data.e) eVar.g).d.g(((b4p0) obj).h);
                break;
            case 1:
                Object value5 = ((Result) obj).getValue();
                ajo0 ajo0Var = (ajo0) (value5 instanceof Result.Failure ? null : value5);
                if (ajo0Var != null) {
                    b3n0 b3n0Var = eVar.f;
                    if (!ajo0Var.d()) {
                        if (!ajo0Var.b()) {
                            if (!ajo0Var.c()) {
                                if (ajo0Var.a()) {
                                    b3n0Var.c(w2n0.a);
                                    break;
                                }
                            } else {
                                b3n0Var.c(v2n0.a);
                                break;
                            }
                        } else {
                            b3n0Var.c(new u2n0(s3b1.k(ajo0Var)));
                            break;
                        }
                    } else {
                        r0 r0Var = b3n0Var.a;
                        do {
                            value2 = r0Var.getValue();
                            a3n0Var2 = (a3n0) value2;
                            if (a3n0Var2 instanceof y2n0) {
                                a3n0Var2 = s2n0Var;
                            }
                        } while (!r0Var.k(value2, a3n0Var2));
                    }
                } else {
                    r0 r0Var2 = eVar.f.a;
                    do {
                        value = r0Var2.getValue();
                        a3n0Var = (a3n0) value;
                        if (a3n0Var instanceof y2n0) {
                            a3n0Var = s2n0Var;
                        }
                    } while (!r0Var2.k(value, a3n0Var));
                }
                break;
            case 2:
                Object value6 = ((Result) obj).getValue();
                if (value6 instanceof Result.Failure) {
                    value6 = null;
                }
                if (value6 instanceof joo0) {
                    b3n0 b3n0Var2 = eVar.f;
                    ScootersBookState$Booking$Type scootersBookState$Booking$Type = ScootersBookState$Booking$Type.PACKAGE_PURCHASE;
                    r0 r0Var3 = b3n0Var2.a;
                    r2n0 r2n0Var = new r2n0(scootersBookState$Booking$Type);
                    r0Var3.getClass();
                    r0Var3.m(null, r2n0Var);
                    break;
                } else {
                    r0 r0Var4 = eVar.f.a;
                    do {
                        value3 = r0Var4.getValue();
                        a3n0Var3 = (a3n0) value3;
                        if ((a3n0Var3 instanceof r2n0) && ((r2n0) a3n0Var3).a == ScootersBookState$Booking$Type.PACKAGE_PURCHASE) {
                            a3n0Var3 = s2n0Var;
                        }
                    } while (!r0Var4.k(value3, a3n0Var3));
                }
                break;
            default:
                if (((myo0) obj) instanceof lyo0) {
                    r0 r0Var5 = eVar.f.a;
                    r0Var5.getClass();
                    r0Var5.m(null, z2n0.a);
                    break;
                } else {
                    r0 r0Var6 = eVar.f.a;
                    do {
                        value4 = r0Var6.getValue();
                        a3n0Var4 = (a3n0) value4;
                        if (a3n0Var4 instanceof z2n0) {
                            a3n0Var4 = s2n0Var;
                        }
                    } while (!r0Var6.k(value4, a3n0Var4));
                }
        }
        return zy11Var;
    }
}
