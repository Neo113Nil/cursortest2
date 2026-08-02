package defpackage;

import java.util.ArrayList;
import java.util.function.IntConsumer;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes13.dex */
public final class ocl0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ pcl0 b;

    public /* synthetic */ ocl0(pcl0 pcl0Var, int i) {
        this.a = i;
        this.b = pcl0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        zfu0 zfu0Var;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        pcl0 pcl0Var = this.b;
        switch (i) {
            case 0:
                long j = ((s5w) obj).a;
                int i2 = (int) (j >> 32);
                int i3 = -1;
                if (i2 == 0) {
                    IntConsumer intConsumer = pcl0Var.c;
                    ddl0 ddl0Var = pcl0Var.b;
                    int i4 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    mdl0 mdl0Var = (mdl0) ddl0Var;
                    if (i4 < 0) {
                        mdl0Var.getClass();
                    } else if (i4 < ((ArrayList) mdl0Var.z).size() && ((zfu0Var = (zfu0) a.S(i4, (ArrayList) mdl0Var.z)) == null || !zfu0Var.c())) {
                        ArrayList<zfu0> arrayList = (ArrayList) mdl0Var.z;
                        int i5 = 0;
                        if (arrayList == null || !arrayList.isEmpty()) {
                            for (zfu0 zfu0Var2 : arrayList) {
                                if (zfu0Var2.d() || zfu0Var2.e()) {
                                    i5++;
                                    if (i5 < 0) {
                                        scc.l();
                                        throw null;
                                    }
                                }
                            }
                        }
                        i3 = i4 - i5;
                    }
                    intConsumer.accept(i3);
                } else if (i2 == -1) {
                    ((mdl0) pcl0Var.b).c((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                }
                return zy11Var;
            case 1:
                pcl0Var.D.g(new s5w(((s5w) obj).a));
                return zy11Var;
            default:
                pcl0Var.D.g(new s5w(((s5w) obj).a));
                return zy11Var;
        }
    }
}
