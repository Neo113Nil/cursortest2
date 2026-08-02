package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.ui.graphics.layer.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class i5y implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ b c;

    public /* synthetic */ i5y(a aVar, b bVar, int i) {
        this.a = i;
        this.b = aVar;
        this.c = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.c;
        a aVar = this.b;
        androidx.compose.animation.core.a aVar2 = (androidx.compose.animation.core.a) obj;
        switch (i) {
            case 0:
                aVar.g(((Number) aVar2.e()).floatValue());
                bVar.c.invoke();
                break;
            default:
                aVar.g(((Number) aVar2.e()).floatValue());
                bVar.c.invoke();
                break;
        }
        return zy11Var;
    }
}
