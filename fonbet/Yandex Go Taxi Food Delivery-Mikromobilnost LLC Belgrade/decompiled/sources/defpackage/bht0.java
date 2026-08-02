package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.preorder.source.j;

/* loaded from: classes6.dex */
public final /* synthetic */ class bht0 implements hhf, jms {
    public final /* synthetic */ j a;

    public bht0(j jVar) {
        this.a = jVar;
    }

    @Override // defpackage.hhf
    public final void a(Screen screen) {
        j jVar = this.a;
        if (jVar.g != screen) {
            jVar.g = screen;
            jVar.c(screen != Screen.MAIN);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof hhf) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, j.class, "handleScreenChange", "handleScreenChange(Lcom/yandex/go/navigation/screen/api/Screen;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
