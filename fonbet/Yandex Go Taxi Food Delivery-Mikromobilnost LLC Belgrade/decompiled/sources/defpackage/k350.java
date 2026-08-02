package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.settings.main.NativeMenuState;
import ru.yandex.taxi.settings.main.j;

/* loaded from: classes10.dex */
public final class k350 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ k350(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                jVar.getClass();
                int i2 = l350.a[((NativeMenuState) obj).ordinal()];
                if (i2 == 1) {
                    jVar.n = false;
                    break;
                } else if (i2 == 2) {
                    jVar.n = false;
                    jVar.a.post(jVar.p);
                    break;
                } else if (i2 != 3 && i2 != 4) {
                    w511.b();
                    break;
                }
                break;
            default:
                jVar.g();
                break;
        }
        return zy11Var;
    }
}
