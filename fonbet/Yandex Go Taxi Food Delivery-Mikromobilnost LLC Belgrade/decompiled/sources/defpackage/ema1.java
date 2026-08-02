package defpackage;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class ema1 {
    public static final er91 a = new Comparator() { // from class: er91
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            er91 er91Var = ema1.a;
            return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
        }
    };
}
