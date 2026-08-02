package xsna;

import com.vk.design.demo.presentation.nav.ScreenKey;
import java.util.Collections;
import java.util.List;

/* compiled from: DesignDemoState.kt */
/* loaded from: classes18.dex */
public final class x3m implements km50 {
    public final List<ScreenKey> b;

    public x3m() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x3m) && epx.f(this.b, ((x3m) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("DesignDemoState(screensStack="), this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x3m(List<? extends ScreenKey> list) {
        this.b = list;
    }

    public x3m(int i) {
        this((List<? extends ScreenKey>) Collections.singletonList(ScreenKey.Main));
    }
}
