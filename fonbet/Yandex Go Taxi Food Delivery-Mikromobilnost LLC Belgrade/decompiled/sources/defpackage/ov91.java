package defpackage;

import com.google.android.gms.internal.play_billing.p;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ov91 implements Cloneable {
    public static void a(int i, List list) {
        String j = oyr.j(list.size() - i, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(j);
            }
            list.remove(size);
        }
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract g5a1 clone();

    public abstract p c();
}
