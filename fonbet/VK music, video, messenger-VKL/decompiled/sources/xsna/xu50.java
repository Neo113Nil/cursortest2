package xsna;

import com.vk.api.generated.narratives.dto.NarrativesNarrativeDto;
import com.vk.dto.narratives.Narrative;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: NarrativesMapper.kt */
/* loaded from: classes3.dex */
public final class xu50 {
    public static Narrative a(NarrativesNarrativeDto narrativesNarrativeDto, List list, List list2) {
        LinkedHashMap a = b590.a(new b590(), null, list, list2, 3);
        new j2r0();
        LinkedHashMap b = j2r0.b(list);
        new dqu();
        return f370.F(narrativesNarrativeDto, a, b, dqu.b(list2));
    }

    public static ArrayList b(List list, List list2, List list3) {
        List list4 = list3;
        ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(a((NarrativesNarrativeDto) it.next(), list, list2));
        }
        return arrayList;
    }
}
