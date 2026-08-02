package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class k1n implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1n b;

    public /* synthetic */ k1n(d1n d1nVar, int i) {
        this.a = i;
        this.b = d1nVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d1n d1nVar = this.b;
        switch (i) {
            case 0:
                d1nVar.render((o0n) obj);
                break;
            default:
                d1nVar.md((Drawable) obj);
                break;
        }
        return zy11Var;
    }
}
