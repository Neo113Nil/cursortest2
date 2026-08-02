package xsna;

import com.vk.photo.editor.domain.LowMemoryException;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o1t;

/* compiled from: GLCollageController.kt */
@b6l(c = "com.vk.photo.editor.features.collage.gl.GLCollageController$loadCgTextures$1", f = "GLCollageController.kt", l = {Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class i1t extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ o1t.a $config;
    Object L$0;
    int label;
    final /* synthetic */ l1t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1t(l1t l1tVar, o1t.a aVar, spj<? super i1t> spjVar) {
        super(2, spjVar);
        this.this$0 = l1tVar;
        this.$config = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new i1t(this.this$0, this.$config, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((i1t) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l1t l1tVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                this.this$0.l = null;
                l1t l1tVar2 = this.this$0;
                h2t h2tVar = l1tVar2.p;
                o1t.a aVar = this.$config;
                this.L$0 = l1tVar2;
                this.label = 1;
                Object b = h2tVar.b(aVar, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                l1tVar = l1tVar2;
                obj = b;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l1tVar = (l1t) this.L$0;
                kotlin.a.a(obj);
            }
            l1tVar.n = (o1t) obj;
            l1t l1tVar3 = this.this$0;
            com.vk.photo.editor.features.colorgrading.a aVar2 = l1tVar3.m;
            if (aVar2 != null) {
                utk0 utk0Var = l1tVar3.t;
                n1t a = l1t.a(aVar2, l1tVar3.n);
                utk0Var.getClass();
                utk0Var.i(null, a);
                l1tVar3.a.b();
            }
        } catch (LowMemoryException unused) {
            this.this$0.d.f();
        }
        return s3q0.a;
    }
}
