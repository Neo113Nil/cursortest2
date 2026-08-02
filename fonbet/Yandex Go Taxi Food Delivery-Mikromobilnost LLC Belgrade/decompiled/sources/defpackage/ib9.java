package defpackage;

import com.yandex.go.places.models.data.entities.network.actions.ChangeModalStateAction;

/* loaded from: classes13.dex */
public final class ib9 implements dw {
    public final cx7 a;

    public ib9(cx7 cx7Var) {
        this.a = cx7Var;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        this.a.invoke(((ChangeModalStateAction) krVar).a);
    }
}
