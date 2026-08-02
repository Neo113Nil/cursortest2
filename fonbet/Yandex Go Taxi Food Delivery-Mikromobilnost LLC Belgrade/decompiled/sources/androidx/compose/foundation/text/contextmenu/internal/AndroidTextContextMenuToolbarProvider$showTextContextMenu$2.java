package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import defpackage.aly0;
import defpackage.jg;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pc2;
import defpackage.pjy0;
import defpackage.rc2;
import defpackage.sc2;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", f = "AndroidTextContextMenuToolbarProvider.android.kt", l = {182}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class AndroidTextContextMenuToolbarProvider$showTextContextMenu$2 extends SuspendLambda implements tls {
    final /* synthetic */ aly0 $dataProvider;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(b bVar, aly0 aly0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$dataProvider = aly0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this.this$0, this.$dataProvider, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AndroidTextContextMenuToolbarProvider$showTextContextMenu$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [androidx.compose.foundation.text.contextmenu.internal.a] */
    /* JADX WARN: Type inference failed for: r1v18, types: [pjy0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? r1;
        Looper myLooper;
        Handler handler;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                final sc2 sc2Var = new sc2();
                b bVar = this.this$0;
                aly0 aly0Var = this.$dataProvider;
                bVar.getClass();
                final rc2 rc2Var = new rc2(sc2Var, new pc2(bVar, aly0Var, 0), new pc2(bVar, aly0Var, 1), bVar.a);
                tls tlsVar = bVar.b;
                if (tlsVar != null && (r1 = (pjy0) tlsVar.invoke(rc2Var)) != 0) {
                    rc2Var = r1;
                }
                Looper myLooper2 = Looper.myLooper();
                Handler handler2 = this.this$0.a.getHandler();
                Looper looper = handler2 != null ? handler2.getLooper() : null;
                final b bVar2 = this.this$0;
                if (myLooper2 != looper) {
                    a aVar = bVar2.i;
                    a aVar2 = aVar;
                    if (aVar == null) {
                        ?? r12 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                b bVar3 = b.this;
                                ActionMode startActionMode = bVar3.a.startActionMode(new FloatingTextActionModeCallback(rc2Var), 1);
                                jl40.l(bVar3.h, startActionMode);
                                if (startActionMode == null) {
                                    sc2Var.close();
                                }
                            }
                        };
                        bVar2.i = r12;
                        aVar2 = r12;
                    }
                    bVar2.a.post(aVar2);
                } else {
                    ActionMode startActionMode = bVar2.a.startActionMode(new FloatingTextActionModeCallback(rc2Var), 1);
                    if (startActionMode == null) {
                        return zy11Var;
                    }
                    bVar2.h = startActionMode;
                }
                this.label = 1;
                kotlinx.coroutines.channels.a aVar3 = sc2Var.a;
                aVar3.getClass();
                Object J = kotlinx.coroutines.channels.a.J(aVar3, this);
                if (J != coroutineSingletons) {
                    J = zy11Var;
                }
                if (J == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            Looper looper2 = handler != null ? handler.getLooper() : null;
            b bVar3 = this.this$0;
            if (myLooper != looper2) {
                Runnable runnable = bVar3.j;
                if (runnable == null) {
                    runnable = new jg(17, bVar3);
                    bVar3.j = runnable;
                }
                bVar3.a.post(runnable);
            } else {
                ActionMode actionMode = bVar3.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
            }
            b bVar4 = this.this$0;
            a aVar4 = bVar4.i;
            if (aVar4 != null) {
                bVar4.a.removeCallbacks(aVar4);
            }
            this.this$0.h = null;
            return zy11Var;
        } finally {
            this.this$0.e.a();
            Looper myLooper3 = Looper.myLooper();
            Handler handler3 = this.this$0.a.getHandler();
            Looper looper3 = handler3 != null ? handler3.getLooper() : null;
            b bVar5 = this.this$0;
            if (myLooper3 != looper3) {
                Runnable runnable2 = bVar5.j;
                if (runnable2 == null) {
                    runnable2 = new jg(17, bVar5);
                    bVar5.j = runnable2;
                }
                bVar5.a.post(runnable2);
            } else {
                ActionMode actionMode2 = bVar5.h;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
            }
            b bVar6 = this.this$0;
            a aVar5 = bVar6.i;
            if (aVar5 != null) {
                bVar6.a.removeCallbacks(aVar5);
            }
            this.this$0.h = null;
        }
    }
}
