package defpackage;

/* loaded from: classes4.dex */
public final class jqy implements fw {
    public static final jqy b = new jqy(0);
    public final /* synthetic */ int a;

    public /* synthetic */ jqy(int i) {
        this.a = i;
    }

    @Override // defpackage.fw
    public final dw handler(kr krVar) {
        Object obj = null;
        switch (this.a) {
            case 0:
                if (krVar instanceof gqy) {
                    return drt.c;
                }
                return null;
            default:
                if (krVar instanceof yki0) {
                    return l36.B;
                }
                if (krVar instanceof ysi0) {
                    return l36.C;
                }
                if (krVar instanceof zyi0) {
                    return l36.F;
                }
                if (krVar instanceof x621) {
                    return l36.P;
                }
                if (krVar instanceof aiu) {
                    return new v4c(4, obj);
                }
                return null;
        }
    }

    @Override // defpackage.fw
    public final dw handler(kr krVar, klc klcVar) {
        switch (this.a) {
        }
        return handler(krVar);
    }
}
