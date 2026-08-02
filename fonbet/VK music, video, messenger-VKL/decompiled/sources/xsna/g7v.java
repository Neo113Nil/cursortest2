package xsna;

import com.vk.im.engine.models.users.User;
import java.util.Comparator;
import java.util.Map;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class g7v<T> implements Comparator {
    public final /* synthetic */ Map b;

    public g7v(Map map) {
        this.b = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Long valueOf = Long.valueOf(((User) t).b);
        Map map = this.b;
        return jw5.b((Integer) map.get(valueOf), (Integer) map.get(Long.valueOf(((User) t2).b)));
    }
}
