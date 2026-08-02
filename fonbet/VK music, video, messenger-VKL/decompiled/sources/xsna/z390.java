package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.Interceptor;
import okhttp3.l;
import okhttp3.p;
import xsna.y390;

/* compiled from: OverrideHostChipInterceptor.kt */
/* loaded from: classes.dex */
public final class z390 implements Interceptor, uz80 {
    @Override // xsna.uz80
    public final String getTag() {
        return "OverrideHostChip";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object, java.lang.String] */
    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        dsw<UserId, v390> dswVar = y390.a;
        v390 a = y390.a.a();
        if (a == null) {
            return aVar.a(aVar.request());
        }
        okhttp3.p request = aVar.request();
        okhttp3.l lVar = request.a;
        ?? r3 = lVar.d;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = r3;
        ?? b = v390.b(r3, a.c(a.a));
        ref$ObjectRef.element = b;
        if (!epx.f(b, r3) && BuildInfo.h()) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.LogType logType = L.LogType.d;
                StringBuilder a2 = t33.a("OverrideHostChip: host changed from ", r3, " to ");
                a2.append((String) ref$ObjectRef.element);
                L.u(l, logType, new Object[]{a2.toString()});
            }
        }
        if (r3.equals(ref$ObjectRef.element)) {
            return aVar.a(aVar.request());
        }
        p.a b2 = request.b();
        l.a f = lVar.f();
        f.d((String) ref$ObjectRef.element);
        b2.a = f.b();
        b2.h(cgv.class, new cgv(r3, (String) ref$ObjectRef.element));
        return aVar.a(b2.b());
    }
}
