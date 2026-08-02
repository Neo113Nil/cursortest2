package defpackage;

import java.util.Comparator;
import ru.yandex.taxi.communications.api.dto.Story;

/* loaded from: classes6.dex */
public final class inu0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Boolean.valueOf(((Story) obj).k).compareTo(Boolean.valueOf(((Story) obj2).k));
    }
}
