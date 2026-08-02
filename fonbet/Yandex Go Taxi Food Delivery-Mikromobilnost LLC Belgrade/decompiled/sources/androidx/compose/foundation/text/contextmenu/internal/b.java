package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.j;
import defpackage.aly0;
import defpackage.ily0;
import defpackage.n3t0;
import defpackage.oc2;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes10.dex */
public final class b implements ily0 {
    public final View a;
    public final tls b;
    public final sls c;
    public final j d = new j();
    public final n3t0 e = new n3t0(new oc2(this, 0));
    public final oc2 f = new oc2(this, 1);
    public final oc2 g = new oc2(this, 2);
    public ActionMode h;
    public a i;
    public Runnable j;

    public b(View view, tls tlsVar, sls slsVar) {
        this.a = view;
        this.b = tlsVar;
        this.c = slsVar;
    }

    @Override // defpackage.ily0
    public final Object a(aly0 aly0Var, SuspendLambda suspendLambda) {
        Object b = this.d.b(MutatePriority.Default, new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this, aly0Var, null), suspendLambda);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }
}
