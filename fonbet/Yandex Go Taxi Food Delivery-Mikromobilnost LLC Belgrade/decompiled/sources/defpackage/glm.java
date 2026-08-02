package defpackage;

import com.yandex.go.navigator.complete_route.CancelMode;
import com.yandex.go.navigator.driving.x;

/* loaded from: classes12.dex */
public final class glm implements sy60 {
    public final /* synthetic */ mlm a;

    public glm(mlm mlmVar) {
        this.a = mlmVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        mlm mlmVar = this.a;
        dlm dlmVar = (dlm) mlmVar.x;
        if (dlmVar == null || !dlmVar.b) {
            mlmVar.r(new qu(9));
        } else {
            mlmVar.A((m950) mlmVar.O.get(), CancelMode.KEEP_NAVIGATOR_IN_BACKGROUND, new x(mlmVar));
        }
    }
}
