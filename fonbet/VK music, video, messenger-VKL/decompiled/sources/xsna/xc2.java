package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.uc2;

/* compiled from: AndroidTextContextMenuToolbarProvider.android.kt */
@b6l(c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", f = "AndroidTextContextMenuToolbarProvider.android.kt", l = {182}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class xc2 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ wco0 $dataProvider;
    int label;
    final /* synthetic */ uc2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc2(uc2 uc2Var, wco0 wco0Var, spj<? super xc2> spjVar) {
        super(1, spjVar);
        this.this$0 = uc2Var;
        this.$dataProvider = wco0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new xc2(this.this$0, this.$dataProvider, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((xc2) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [xsna.nbo0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        nbo0 invoke;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                uc2.b bVar = new uc2.b();
                uc2 uc2Var = this.this$0;
                wco0 wco0Var = this.$dataProvider;
                uc2Var.getClass();
                uc2.a aVar = new uc2.a(bVar, new com.vk.movika.sdk.base.ui.k(1, uc2Var, wco0Var), new com.vk.movika.sdk.base.ui.l(2, uc2Var, wco0Var), uc2Var.a);
                izs<nbo0, nbo0> izsVar = uc2Var.b;
                if (izsVar != null && (invoke = izsVar.invoke(aVar)) != 0) {
                    aVar = invoke;
                }
                Looper myLooper = Looper.myLooper();
                Handler handler = this.this$0.a.getHandler();
                if (myLooper != (handler != null ? handler.getLooper() : null)) {
                    uc2 uc2Var2 = this.this$0;
                    vc2 vc2Var = uc2Var2.i;
                    if (vc2Var == null) {
                        vc2Var = new vc2(uc2Var2, aVar, bVar, 0);
                        uc2Var2.i = vc2Var;
                    }
                    uc2Var2.a.post(vc2Var);
                } else {
                    uc2 uc2Var3 = this.this$0;
                    ActionMode startActionMode = uc2Var3.a.startActionMode(new hsr(aVar), 1);
                    if (startActionMode == null) {
                        return s3q0.a;
                    }
                    uc2Var3.h = startActionMode;
                }
                this.label = 1;
                Object a = bVar.a.a(this);
                if (a != coroutineSingletons) {
                    a = s3q0.a;
                }
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.this$0.e.a();
            Looper myLooper2 = Looper.myLooper();
            Handler handler2 = this.this$0.a.getHandler();
            if (myLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                uc2 uc2Var4 = this.this$0;
                Runnable runnable = uc2Var4.j;
                if (runnable == null) {
                    runnable = new wc2(uc2Var4, 0);
                    uc2Var4.j = runnable;
                }
                uc2Var4.a.post(runnable);
            } else {
                ActionMode actionMode = this.this$0.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
            }
            uc2 uc2Var5 = this.this$0;
            vc2 vc2Var2 = uc2Var5.i;
            if (vc2Var2 != null) {
                uc2Var5.a.removeCallbacks(vc2Var2);
            }
            this.this$0.h = null;
            return s3q0.a;
        } catch (Throwable th) {
            this.this$0.e.a();
            Looper myLooper3 = Looper.myLooper();
            Handler handler3 = this.this$0.a.getHandler();
            if (myLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                uc2 uc2Var6 = this.this$0;
                Runnable runnable2 = uc2Var6.j;
                if (runnable2 == null) {
                    runnable2 = new wc2(uc2Var6, 0);
                    uc2Var6.j = runnable2;
                }
                uc2Var6.a.post(runnable2);
            } else {
                ActionMode actionMode2 = this.this$0.h;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
            }
            uc2 uc2Var7 = this.this$0;
            vc2 vc2Var3 = uc2Var7.i;
            if (vc2Var3 != null) {
                uc2Var7.a.removeCallbacks(vc2Var3);
            }
            this.this$0.h = null;
            throw th;
        }
    }
}
