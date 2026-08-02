package xsna;

import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;

/* compiled from: BootstrapDns.kt */
/* loaded from: classes8.dex */
public final class h18 implements tsn, zmi0 {
    public Object b;
    public Object c;

    public /* synthetic */ h18(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.tsn
    public List a(String str) throws UnknownHostException {
        String str2 = (String) this.b;
        if (epx.f(str2, str)) {
            return (List) this.c;
        }
        throw new UnknownHostException(y57.a("BootstrapDns called for ", str, " instead of ", str2));
    }

    @Override // xsna.zmi0
    public KSerializer b(dcy dcyVar) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Class<?> a = ((pfc) dcyVar).a();
        Object obj = concurrentHashMap.get(a);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a, (obj = new mw8((KSerializer) ((izs) this.b).invoke(dcyVar))))) != null) {
            obj = putIfAbsent;
        }
        return ((mw8) obj).a;
    }

    public void c(yd80 yd80Var) {
        hd80 hd80Var;
        tcn tcnVar;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (!(linkedHashMap != null ? epx.f(linkedHashMap.remove(yd80Var), Boolean.TRUE) : false) || (hd80Var = (hd80) this.c) == null || (tcnVar = hd80Var.c) == null) {
            return;
        }
        tcnVar.invoke(yd80Var);
    }

    public boolean d(yd80 yd80Var) {
        Boolean bool;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (linkedHashMap == null || (bool = (Boolean) linkedHashMap.get(yd80Var)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public h18(izs izsVar) {
        this.b = izsVar;
        this.c = new ConcurrentHashMap();
    }
}
