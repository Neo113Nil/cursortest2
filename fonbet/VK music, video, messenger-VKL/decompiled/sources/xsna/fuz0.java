package xsna;

import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class fuz0 extends kj01 {
    public String g;
    public HashSet h;
    public zk3 i;
    public Long j;
    public Long k;

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final java.util.ArrayList o(java.lang.String r45, java.util.List r46, java.util.List r47, java.lang.Long r48, java.lang.Long r49) {
        /*
            Method dump skipped, instructions count: 2933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.fuz0.o(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hq01 p(Integer num) {
        if (this.i.containsKey(num)) {
            return (hq01) this.i.get(num);
        }
        hq01 hq01Var = new hq01(this, this.g);
        this.i.put(num, hq01Var);
        return hq01Var;
    }

    @Override // xsna.kj01
    public final void n() {
    }
}
