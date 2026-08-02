package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class hix0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ gix0 b;

    public /* synthetic */ hix0(gix0 gix0Var, int i) {
        this.a = i;
        this.b = gix0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        gix0 gix0Var = this.b;
        switch (i) {
            case 0:
                rsn rsnVar = (rsn) obj;
                gix0Var.c9((uix0) rsnVar.a, (uix0) rsnVar.b);
                break;
            case 1:
                gix0Var.s1((ThemeType) obj);
                break;
            default:
                ((Boolean) obj).getClass();
                gix0Var.Mf();
                break;
        }
        return zy11Var;
    }
}
