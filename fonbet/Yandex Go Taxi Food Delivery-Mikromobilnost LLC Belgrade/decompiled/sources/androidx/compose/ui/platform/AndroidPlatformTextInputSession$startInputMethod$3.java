package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import defpackage.aa41;
import defpackage.dvw;
import defpackage.gwc0;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vpy0;
import defpackage.wls;
import defpackage.wz40;
import defpackage.xpy0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/l;", "methodSession", "", "<anonymous>", "(Landroidx/compose/ui/platform/l;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class AndroidPlatformTextInputSession$startInputMethod$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.this$0, continuation);
        androidPlatformTextInputSession$startInputMethod$3.L$0 = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidPlatformTextInputSession$startInputMethod$3) create((l) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            final l lVar = (l) this.L$0;
            final d dVar = this.this$0;
            this.L$0 = lVar;
            this.L$1 = dVar;
            this.label = 1;
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            vpy0 vpy0Var = dVar.b;
            gwc0 gwc0Var = vpy0Var.a;
            gwc0Var.d();
            vpy0Var.b.set(new xpy0(vpy0Var, gwc0Var));
            j18Var.w(new tls() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    l lVar2 = l.this;
                    synchronized (lVar2.c) {
                        try {
                            lVar2.e = true;
                            wz40 wz40Var = lVar2.d;
                            Object[] objArr = wz40Var.a;
                            int i2 = wz40Var.c;
                            for (int i3 = 0; i3 < i2; i3++) {
                                NullableInputConnectionWrapper nullableInputConnectionWrapper = (NullableInputConnectionWrapper) ((aa41) objArr[i3]).get();
                                if (nullableInputConnectionWrapper != null) {
                                    nullableInputConnectionWrapper.disposeDelegate();
                                }
                            }
                            lVar2.d.g();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    vpy0 vpy0Var2 = dVar.b;
                    vpy0Var2.b.set(null);
                    vpy0Var2.a.a();
                    return zy11.a;
                }
            });
            if (j18Var.s() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.A();
        return null;
    }
}
