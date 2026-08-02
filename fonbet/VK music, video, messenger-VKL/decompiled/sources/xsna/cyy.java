package xsna;

import android.opengl.GLES20;
import com.vk.photo.editor.gl.GlShaderId;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* compiled from: LazyUpdatableShader.kt */
/* loaded from: classes4.dex */
public final class cyy<T> {
    public final int a;
    public final GlShaderId b;
    public final izs<Integer, T> c;
    public final gzs<p0u> d;
    public final we0 e;
    public T f;
    public volatile boolean g = true;

    /* compiled from: LazyUpdatableShader.kt */
    @b6l(c = "com.vk.photo.editor.features.collage.gl.textures.LazyUpdatableShader$init$1", f = "LazyUpdatableShader.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<String, spj<? super s3q0>, Object> {
        int label;
        final /* synthetic */ cyy<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cyy<T> cyyVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = cyyVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(String str, spj<? super s3q0> spjVar) {
            return ((a) create(str, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.this$0.g = true;
            return s3q0.a;
        }
    }

    public cyy(int i, GlShaderId glShaderId, izs izsVar, gzs gzsVar, we0 we0Var) {
        this.a = i;
        this.b = glShaderId;
        this.c = izsVar;
        this.d = gzsVar;
        this.e = we0Var;
    }

    public final Object a() {
        if (this.f == null) {
            b();
        }
        if (this.g) {
            xh50<String> a2 = this.d.invoke().a(this.b);
            izs<Integer, T> izsVar = this.c;
            int i = this.a;
            String value = a2.getValue();
            int glCreateShader = GLES20.glCreateShader(i);
            GLES20.glShaderSource(glCreateShader, value);
            GLES20.glCompileShader(glCreateShader);
            this.f = izsVar.invoke(Integer.valueOf(glCreateShader));
            this.g = false;
        }
        return this.f;
    }

    public final void b() {
        xh50<String> a2 = this.d.invoke().a(this.b);
        String value = a2.getValue();
        int glCreateShader = GLES20.glCreateShader(this.a);
        GLES20.glShaderSource(glCreateShader, value);
        GLES20.glCompileShader(glCreateShader);
        this.f = this.c.invoke(Integer.valueOf(glCreateShader));
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(a2, new a(this, null)), (yvj) this.e.invoke());
    }
}
