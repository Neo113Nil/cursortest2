package defpackage;

import com.yandex.go.splash.data.dto.DynamicSplash;
import java.util.Comparator;

/* loaded from: classes8.dex */
public final class k9n implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return uvc.b(((DynamicSplash) obj2).f.getF(), ((DynamicSplash) obj).f.getF());
    }
}
