package defpackage;

import com.google.android.gms.internal.measurement.a1;
import java.util.List;

/* loaded from: classes.dex */
public abstract class eqa1 implements Cloneable {
    public static void a(int i, List list) {
        int size = list.size() - i;
        String q = b64.q(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(q);
            }
            list.remove(size2);
        }
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract kya1 clone();

    public abstract a1 c();
}
