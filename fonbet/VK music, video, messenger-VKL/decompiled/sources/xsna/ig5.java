package xsna;

import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.ivm.autoenhance.AutoEnhanceMessage$Source;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.bg5;

/* compiled from: AutoEnhanceViewModel.kt */
/* loaded from: classes4.dex */
public final class ig5 extends vy1 {
    public dg5 c;

    /* compiled from: AutoEnhanceViewModel.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EditorMessage.Source.values().length];
            try {
                iArr[EditorMessage.Source.UserInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AutoEnhanceViewModel.kt */
    @b6l(c = "com.vk.photo.editor.features.auto.AutoEnhanceViewModel$initStore$1", f = "AutoEnhanceViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<EditorState, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = ig5.this.new b(spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(EditorState editorState, spj<? super s3q0> spjVar) {
            return ((b) create(editorState, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            EditorState editorState = (EditorState) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            ig5.this.getClass();
            g5p g5pVar = editorState.b.get(hg5.a);
            ag5 ag5Var = g5pVar instanceof ag5 ? (ag5) g5pVar : null;
            if (ag5Var != null) {
                ig5 ig5Var = ig5.this;
                EditorMessage.Source source = editorState.e;
                dg5 dg5Var = ig5Var.c;
                (dg5Var != null ? dg5Var : null).a.d(new bg5.a(ag5Var.a, a.$EnumSwitchMapping$0[source.ordinal()] == 1 ? AutoEnhanceMessage$Source.UserInput : AutoEnhanceMessage$Source.Synthetic));
            }
            return s3q0.a;
        }
    }

    public final void i(com.vk.photo.editor.ivm.d dVar) {
        this.c = new dg5(new lg5(new cg5(0)));
        this.b = dVar;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(dVar.b, new b(null));
        rvf t = fai.t(this);
        bdn bdnVar = bdn.a;
        rsr.s(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, zvj.g(t, wgl.c));
    }
}
