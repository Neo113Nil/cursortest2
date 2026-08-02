package defpackage;

import java.util.HashSet;

/* loaded from: classes5.dex */
public final /* synthetic */ class cxt implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ HashSet b;

    public /* synthetic */ cxt(int i, HashSet hashSet) {
        this.a = i;
        this.b = hashSet;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean contains;
        boolean contains2;
        int i = this.a;
        HashSet hashSet = this.b;
        switch (i) {
            case 0:
                contains = hashSet.contains(((am31) obj).a);
                break;
            case 1:
                contains2 = hashSet.contains(((b580) obj).a);
                contains = !contains2;
                break;
            default:
                contains2 = hashSet.contains(((v7v0) obj).o);
                contains = !contains2;
                break;
        }
        return Boolean.valueOf(contains);
    }
}
