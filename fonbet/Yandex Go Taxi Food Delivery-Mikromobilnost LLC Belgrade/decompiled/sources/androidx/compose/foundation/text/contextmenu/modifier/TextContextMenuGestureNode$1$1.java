package androidx.compose.foundation.text.contextmenu.modifier;

import defpackage.dly0;
import defpackage.ely0;
import defpackage.ily0;
import defpackage.jly0;
import defpackage.npb1;
import defpackage.tje;
import defpackage.tls;
import defpackage.wu60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class TextContextMenuGestureNode$1$1 extends FunctionReferenceImpl implements tls {
    public final void i(long j) {
        ely0 ely0Var = (ely0) this.receiver;
        ely0Var.getClass();
        ily0 ily0Var = (ily0) npb1.c(ely0Var, jly0.a);
        if (ily0Var == null) {
            return;
        }
        tje.N(ely0Var.getCoroutineScope(), null, null, new TextContextMenuGestureNode$tryShowContextMenu$1(ely0Var, j, ily0Var, new dly0(ely0Var, j), null), 3);
    }

    @Override // defpackage.tls
    public final /* synthetic */ Object invoke(Object obj) {
        i(((wu60) obj).a);
        return zy11.a;
    }
}
