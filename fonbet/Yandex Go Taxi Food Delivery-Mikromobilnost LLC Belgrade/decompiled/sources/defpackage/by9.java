package defpackage;

/* loaded from: classes12.dex */
public final class by9 extends py9 {
    public final String b;
    public final tls c;

    public by9(String str, tls tlsVar) {
        this.b = str;
        this.c = tlsVar;
    }

    @Override // defpackage.py9
    public final cy9 b(Throwable th) {
        if (!((Boolean) this.c.invoke(th)).booleanValue()) {
            return null;
        }
        oeu O = s8o.O(th);
        return new cy9(6, this.b, O != null ? O.a("X-YaTraceId") : null, null, null);
    }
}
