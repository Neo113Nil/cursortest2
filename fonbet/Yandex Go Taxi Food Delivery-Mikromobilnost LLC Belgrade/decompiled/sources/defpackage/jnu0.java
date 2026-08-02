package defpackage;

import java.util.Comparator;
import ru.yandex.taxi.communications.api.dto.Story;

/* loaded from: classes14.dex */
public final class jnu0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((Story) obj2).h.a).compareTo(Integer.valueOf(((Story) obj).h.a));
    }
}
