package xsna;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.mjf;

/* compiled from: ClipsUploadInitFullExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadInitFullExecutor$execute$2", f = "ClipsUploadInitFullExecutor.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ngf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mjf.d $task;
    int label;
    final /* synthetic */ ogf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ngf(ogf ogfVar, mjf.d dVar, spj<? super ngf> spjVar) {
        super(2, spjVar);
        this.this$0 = ogfVar;
        this.$task = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ngf(this.this$0, this.$task, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ngf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v8 com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData, still in use, count: 2, list:
          (r12v8 com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData) from 0x020a: MOVE (r21v1 com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData) = (r12v8 com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData) (LINE:523)
          (r12v8 com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData) from 0x0205: MOVE (r21v4 com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData) = (r12v8 com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData) (LINE:518)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r56) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.ngf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
