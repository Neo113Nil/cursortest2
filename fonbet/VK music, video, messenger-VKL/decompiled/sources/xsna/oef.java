package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.upload.vk.ui.impl.fragment.utils.resulter.ActivityResultType;
import com.vk.dto.clips.model.ClipsEditorNextButtonState;
import com.vk.dto.clips.model.ClipsEditorSessionParams;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.vyd;

/* compiled from: ClipsUploadEditorFeatureHandler.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.handlers.ClipsUploadEditorFeatureHandler$openEditor$1", f = "ClipsUploadEditorFeatureHandler.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class oef extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $creationSessionId;
    int label;
    final /* synthetic */ pef this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oef(pef pefVar, int i, spj<? super oef> spjVar) {
        super(2, spjVar);
        this.this$0 = pefVar;
        this.$creationSessionId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new oef(this.this$0, this.$creationSessionId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((oef) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            mud mudVar = this.this$0.c;
            this.label = 1;
            obj = mudVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        vyd.a aVar = new vyd.a(8, new Integer(this.$creationSessionId), ((ClipsDraftVk) obj).b.b);
        dhr0.a.getClass();
        ((vyd) this.this$0.e.getValue()).b(this.this$0.a, aVar, new vyd.c(dhr0.u().c, 8, new Integer(ActivityResultType.Editor.ordinal())), new ClipsEditorSessionParams(null, true, true, false, ClipsEditorNextButtonState.Ready, true, 1, null));
        return s3q0.a;
    }
}
