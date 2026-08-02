package xsna;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: SearchDatabaseFeature.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class dph0 extends AdaptedFunctionReference implements izs<uph0<Object>, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(uph0<Object> uph0Var) {
        eph0 eph0Var = (eph0) this.receiver;
        uph0[] uph0VarArr = {uph0Var};
        eph0Var.getClass();
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        com.vk.mvi.core.internal.executors.a.c(new hn9(25, uph0VarArr, eph0Var));
        return s3q0.a;
    }
}
