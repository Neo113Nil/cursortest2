package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.account.AccountInfo;
import com.vk.im.engine.models.account.SupportedLanguagesPair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: SupportedLanguagesGetCmd.kt */
/* loaded from: classes2.dex */
public final class ejn0 extends le6<Set<? extends fjn0>> {
    @Override // xsna.le6
    public final Set<? extends fjn0> e(w2w w2wVar) {
        AccountInfo accountInfo = (AccountInfo) ((xpp) w2wVar.J0(this, new vo(Source.ACTUAL, true)).await()).a();
        List<SupportedLanguagesPair> list = accountInfo != null ? accountInfo.D : null;
        List<SupportedLanguagesPair> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return EmptySet.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = ((SupportedLanguagesPair) obj).b;
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = s5a.a(str, linkedHashMap);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(new Locale(((SupportedLanguagesPair) it.next()).c));
            }
            linkedHashMap2.put(key, arrayList);
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            hashSet.add(new fjn0(new Locale((String) entry2.getKey()), (List) entry2.getValue()));
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return ejn0.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 1522830225;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "SupportedLanguagesGetCmd";
    }
}
