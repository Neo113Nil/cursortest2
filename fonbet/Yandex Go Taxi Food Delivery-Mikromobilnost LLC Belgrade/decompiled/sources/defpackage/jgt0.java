package defpackage;

import com.yandex.go.preorder.mode.SourcePointMode;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.e;

/* loaded from: classes6.dex */
public final class jgt0 {
    public final r0 a;
    public final r0 b;

    public jgt0(e eVar) {
        r0 c = bvf0.c(eVar.f() ? SourcePointMode.PIN_ABSENCE : SourcePointMode.POINT);
        this.a = c;
        this.b = c;
    }

    public final SourcePointMode a() {
        return (SourcePointMode) this.a.getValue();
    }

    public final r0 b() {
        return this.b;
    }
}
