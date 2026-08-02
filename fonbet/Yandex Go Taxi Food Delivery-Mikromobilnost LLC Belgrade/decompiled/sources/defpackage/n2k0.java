package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class n2k0 {
    public final HashMap a = new HashMap();
    public final LinkedHashMap b = new LinkedHashMap();

    public final View a(m3k m3kVar) {
        kmo kmoVar;
        int c = m3kVar.c();
        Integer valueOf = Integer.valueOf(c);
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = 0;
            linkedHashMap.put(valueOf, obj);
        }
        int intValue = ((Number) obj).intValue();
        LinkedList linkedList = (LinkedList) this.a.get(Integer.valueOf(c));
        if (linkedList == null || (kmoVar = (kmo) a.S(intValue, linkedList)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(c), Integer.valueOf(intValue + 1));
        ViewParent parent = kmoVar.c().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(kmoVar.c());
        }
        return kmoVar.c();
    }
}
