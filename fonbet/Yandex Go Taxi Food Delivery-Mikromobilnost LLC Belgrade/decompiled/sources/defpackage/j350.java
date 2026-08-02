package defpackage;

import ru.yandex.taxi.settings.main.NativeMenuRouterImpl$1$invokeSuspend$lambda$1$$inlined$safeCollectIn$1;
import ru.yandex.taxi.settings.main.NativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$safeCollectIn$1;
import ru.yandex.taxi.settings.main.i;
import ru.yandex.taxi.settings.main.j;

/* loaded from: classes10.dex */
public final /* synthetic */ class j350 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ j350(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                jVar.f();
                break;
            case 1:
                jVar.q = tje.N(jVar.f, null, null, new NativeMenuRouterImpl$1$invokeSuspend$lambda$1$$inlined$safeCollectIn$1(jVar.d.g, null, jVar), 3);
                break;
            case 2:
                pzt0 pzt0Var = jVar.r;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                jVar.r = tje.N(jVar.f, null, null, new NativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$safeCollectIn$1(new i(jVar.i.a.c(), jVar), null, jVar), 3);
                break;
            case 3:
                pzt0 pzt0Var2 = jVar.r;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
                jVar.r = null;
                break;
            default:
                pzt0 pzt0Var3 = jVar.q;
                if (pzt0Var3 != null) {
                    pzt0Var3.a(null);
                }
                jVar.q = null;
                break;
        }
    }
}
