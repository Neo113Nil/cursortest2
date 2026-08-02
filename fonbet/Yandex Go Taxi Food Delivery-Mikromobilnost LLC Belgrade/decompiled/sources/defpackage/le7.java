package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class le7 implements ofy0 {
    public final nlv a;

    public le7(nlv nlvVar, rms rmsVar) {
        this.a = nlvVar;
    }

    @Override // defpackage.ofy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hex get(String str) {
        hex hexVar = (hex) this.a.a.get(str);
        if (hexVar != null) {
            return hexVar;
        }
        return null;
    }

    public final void c(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.a.a.put((String) entry.getKey(), (hex) entry.getValue());
        }
    }
}
