package xsna;

import android.content.res.Resources;
import android.util.TypedValue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: AttributesResolver.kt */
/* loaded from: classes18.dex */
public abstract class s94 {
    public final HashSet<Integer> a;
    public final HashMap<Resources.Theme, HashMap<Integer, String>> b = new HashMap<>();

    public s94(HashSet<Integer> hashSet) {
        this.a = hashSet;
    }

    public final HashMap<Integer, String> a(Resources.Theme theme) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        Iterator<Integer> it = this.a.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(intValue, typedValue, true);
            try {
                hashMap.put(Integer.valueOf(typedValue.data), theme.getResources().getResourceName(intValue));
            } catch (Throwable unused) {
                s3q0 s3q0Var = s3q0.a;
            }
        }
        return hashMap;
    }
}
