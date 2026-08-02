package xsna;

import com.vk.log.L;

/* compiled from: ExtraFileLoggerImpl.kt */
/* loaded from: classes3.dex */
public final class igq implements com.vk.log.b {
    public final String a;
    public final qky b;
    public final bpn0 c;

    public igq(qi80 qi80Var, jar jarVar, String str, qky qkyVar) {
        this.a = str;
        this.b = qkyVar;
        this.c = new bpn0(new hgq(jarVar, this, qi80Var, 0));
    }

    @Override // com.vk.log.b
    public final void a(L.LogType logType, String str, Throwable th, boolean z, izs<? super String, String> izsVar) {
        if (((Boolean) this.b.invoke()).booleanValue()) {
            ((uar) this.c.getValue()).a(logType, i5s.a(new StringBuilder(), this.a, ": "), izsVar.invoke(str), th, z);
        }
    }

    @Override // com.vk.log.b
    public final void release() {
        ((uar) this.c.getValue()).c();
    }
}
