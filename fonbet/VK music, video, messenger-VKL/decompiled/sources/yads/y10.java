package yads;

import com.huawei.hms.hihealth.data.DeviceInfo;
import kotlin.coroutines.d;
import xsna.pvj;
import xsna.s3q0;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class y10 implements pvj {
    public final sm0 b;

    public y10(sm0 sm0Var) {
        this.b = sm0Var;
    }

    @Override // kotlin.coroutines.d
    public final Object fold(Object obj, wzs wzsVar) {
        return wzsVar.invoke(obj, this);
    }

    @Override // kotlin.coroutines.d
    public final d.b get(d.c cVar) {
        return d.b.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public final d.c getKey() {
        return pvj.a.b;
    }

    @Override // xsna.pvj
    public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
        try {
            String message = th.getMessage();
            if (message == null) {
                message = DeviceInfo.STR_TYPE_UNKNOWN;
            }
            this.b.reportError(message, th);
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(d.c cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return d.a.a(this, dVar);
    }
}
