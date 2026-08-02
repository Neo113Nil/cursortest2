package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import xsna.t9e0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ajv implements wzs {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        it80 it80Var = (it80) obj;
        String str = (String) obj2;
        if (drm0.N(str)) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"Certs source: FB"});
            }
            return t9e0.a.a((String) it80Var.a);
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{"Certs source: Studilka"});
        }
        return t9e0.a.a(str);
    }
}
