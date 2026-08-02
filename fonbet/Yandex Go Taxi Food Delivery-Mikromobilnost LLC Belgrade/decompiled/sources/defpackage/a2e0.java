package defpackage;

/* loaded from: classes13.dex */
public final class a2e0 {
    public final String a;
    public final /* synthetic */ b2e0 b;
    public final /* synthetic */ long c;

    public a2e0(String str, b2e0 b2e0Var, long j) {
        this.b = b2e0Var;
        this.c = j;
        this.a = str;
    }

    public final boolean a(Object obj) {
        tls tlsVar = this.b.b;
        if (tlsVar == null) {
            tlsVar = null;
        }
        return ((Boolean) tlsVar.invoke(obj)).booleanValue();
    }
}
