package defpackage;

import com.yandex.go.pin.api.v1.Pin$State;
import ru.yandex.taxi.preorder.source.j;

/* loaded from: classes6.dex */
public final class aht0 implements ktb0 {
    public final /* synthetic */ j a;

    public aht0(j jVar) {
        this.a = jVar;
    }

    @Override // defpackage.ktb0
    public final void R3(Pin$State pin$State) {
        j jVar = this.a;
        if (pin$State != jVar.f) {
            jVar.f = pin$State;
            jVar.c(false);
        }
    }
}
