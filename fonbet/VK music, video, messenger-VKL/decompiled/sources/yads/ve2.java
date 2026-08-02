package yads;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.drm0;
import xsna.oxo0;
import xsna.spj;

/* loaded from: classes10.dex */
public final class ve2 {
    public final Context a;

    public ve2(Context context) {
        this.a = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(1:26))|11|(2:15|(1:17))|20))|28|6|7|(0)(0)|11|(3:13|15|(0)(0))|20) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, spj spjVar) {
        qe2 qe2Var;
        int i;
        AppSetIdInfo appSetIdInfo;
        String id;
        if (spjVar instanceof qe2) {
            qe2Var = (qe2) spjVar;
            int i2 = qe2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qe2Var.d = i2 - Integer.MIN_VALUE;
                Object obj = qe2Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qe2Var.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    te2 te2Var = new te2(this, null);
                    qe2Var.d = 1;
                    obj = oxo0.c(j, te2Var, qe2Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                appSetIdInfo = (AppSetIdInfo) obj;
                if (appSetIdInfo != null && (id = appSetIdInfo.getId()) != null) {
                    if (drm0.N(id)) {
                        return id;
                    }
                }
                return null;
            }
        }
        qe2Var = new qe2(this, spjVar);
        Object obj2 = qe2Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qe2Var.d;
        if (i != 0) {
        }
        appSetIdInfo = (AppSetIdInfo) obj2;
        if (appSetIdInfo != null) {
            if (drm0.N(id)) {
            }
        }
        return null;
    }
}
