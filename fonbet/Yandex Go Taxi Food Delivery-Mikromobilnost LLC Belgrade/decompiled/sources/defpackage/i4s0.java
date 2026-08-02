package defpackage;

import java.util.function.Consumer;
import ru.yandex.taxi.shortcuts.ui.shortcutview.f;

/* loaded from: classes6.dex */
public final /* synthetic */ class i4s0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ i4s0(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        f fVar = this.b;
        e6v e6vVar = (e6v) obj;
        switch (i) {
            case 0:
                fVar.Mg(e6vVar);
                break;
            default:
                fVar.Mg(e6vVar);
                break;
        }
    }
}
