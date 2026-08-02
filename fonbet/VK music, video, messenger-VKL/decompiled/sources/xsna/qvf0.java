package xsna;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class qvf0 {
    public final HashMap a = new HashMap();

    /* compiled from: com.google.mlkit:common@@18.7.0 */
    public static class a {
        public final f9e0 a;

        public a(@NonNull f9e0 f9e0Var) {
            this.a = f9e0Var;
        }
    }

    public qvf0(@NonNull Set<a> set) {
        for (a aVar : set) {
            HashMap hashMap = this.a;
            aVar.getClass();
            hashMap.put(snk.class, aVar.a);
        }
    }
}
