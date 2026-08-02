package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import java.util.Comparator;
import java.util.LinkedHashMap;

/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public final class ti8 implements Comparator {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ti8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                UserId userId = ((Group) obj2).c;
                UserId userId2 = (UserId) this.c;
                return jw5.b(Boolean.valueOf(epx.f(userId, userId2)), Boolean.valueOf(epx.f(((Group) obj).c, userId2)));
            default:
                int intValue = ((Number) obj).intValue();
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                return jw5.b((Integer) linkedHashMap.get(Integer.valueOf(intValue)), (Integer) linkedHashMap.get(Integer.valueOf(((Number) obj2).intValue())));
        }
    }
}
