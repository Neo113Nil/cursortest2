package defpackage;

import androidx.compose.foundation.gestures.i;
import androidx.compose.foundation.lazy.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class nyx0 implements PointerInputEventHandler {
    public final /* synthetic */ b a;
    public final /* synthetic */ int b;
    public final /* synthetic */ oz40 c;
    public final /* synthetic */ yx40 d;
    public final /* synthetic */ tx40 e;
    public final /* synthetic */ wls f;

    public nyx0(b bVar, int i, oz40 oz40Var, yx40 yx40Var, tx40 tx40Var, wls wlsVar) {
        this.a = bVar;
        this.b = i;
        this.c = oz40Var;
        this.d = yx40Var;
        this.e = tx40Var;
        this.f = wlsVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        b bVar = this.a;
        int i = this.b;
        oz40 oz40Var = this.c;
        yx40 yx40Var = this.d;
        yya0 yya0Var = new yya0(bVar, i, oz40Var, yx40Var, 2);
        tx40 tx40Var = this.e;
        return i.g(hwd0Var, yya0Var, new myx0(tx40Var, 0), new myx0(tx40Var, 1), new t7a(bVar, this.f, tx40Var, oz40Var, yx40Var, 1), continuation);
    }
}
