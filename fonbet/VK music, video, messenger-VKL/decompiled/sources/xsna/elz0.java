package xsna;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class elz0 extends ilz0 {
    public final ArrayList c;
    public final /* synthetic */ jlz0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elz0(jlz0 jlz0Var, ArrayList arrayList) {
        super(jlz0Var);
        this.d = jlz0Var;
        this.c = arrayList;
    }

    @Override // xsna.ilz0
    public final void a() {
        Set set;
        jlz0 jlz0Var = this.d;
        amz0 amz0Var = jlz0Var.a;
        nlz0 nlz0Var = amz0Var.p;
        olc olcVar = jlz0Var.r;
        if (olcVar == null) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet(olcVar.b);
            Map map = olcVar.d;
            for (com.google.android.gms.common.api.a aVar : map.keySet()) {
                if (!amz0Var.i.containsKey(aVar.b)) {
                    ((vnz0) map.get(aVar)).getClass();
                    hashSet.addAll(null);
                }
            }
            set = hashSet;
        }
        nlz0Var.q = set;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((a.f) arrayList.get(i)).getRemoteService(jlz0Var.o, amz0Var.p.q);
        }
    }
}
