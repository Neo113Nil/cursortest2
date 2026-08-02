package xsna;

import com.vk.httpexecutor.api.exceptions.NetworkFallbackHostException;
import com.vk.knet.cornet.CronetHttpLogger$DebugType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.wjy;

/* compiled from: CronetHttpLogger.kt */
/* loaded from: classes.dex */
public final class qek {
    public final Object a;
    public final Object b;

    public qek(wjy.e eVar, sw1 sw1Var) {
        this.a = eVar;
        this.b = new AtomicBoolean(false);
    }

    public void a(CronetHttpLogger$DebugType cronetHttpLogger$DebugType, Object... objArr) {
        if (((Set) this.b).contains(cronetHttpLogger$DebugType)) {
            rjv rjvVar = (rjv) this.a;
            rmk0 rmk0Var = new rmk0(2);
            rmk0Var.a(cronetHttpLogger$DebugType);
            rmk0Var.b(objArr);
            ArrayList<Object> arrayList = rmk0Var.a;
            rjvVar.c(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    public void b(Object... objArr) {
        ((rjv) this.a).b(Arrays.copyOf(objArr, objArr.length));
    }

    public void c(Object... objArr) {
        ((rjv) this.a).a(Arrays.copyOf(objArr, objArr.length));
    }

    public void d(Exception exc) {
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"FallbackCondition reached for host "});
            }
            ((wjy.e) this.a).invoke(new NetworkFallbackHostException(exc));
        }
    }

    public qek(fky fkyVar, Set set) {
        this.a = fkyVar;
        this.b = set;
    }
}
