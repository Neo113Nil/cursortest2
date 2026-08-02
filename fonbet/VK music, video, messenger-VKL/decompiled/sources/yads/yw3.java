package yads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class yw3 extends kx3 {
    public final HashSet c;
    public final JSONObject d;
    public final long e;

    public yw3(jx3 jx3Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(jx3Var);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
