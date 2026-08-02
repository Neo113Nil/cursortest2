package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.video.ui.upload.api.router.AttachedClipsResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.x44;

/* compiled from: AttachedClipsInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.attachedclips.presentation.feature.store.AttachedClipsInlineActor$saveItselfAndExit$2", f = "AttachedClipsInlineActor.kt", l = {360}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class k54 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List<VideoFile> $attachedClips;
    final /* synthetic */ int $videoId;
    int label;
    final /* synthetic */ h54 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k54(h54 h54Var, int i, List<? extends VideoFile> list, spj<? super k54> spjVar) {
        super(2, spjVar);
        this.this$0 = h54Var;
        this.$videoId = i;
        this.$attachedClips = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new k54(this.this$0, this.$videoId, this.$attachedClips, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((k54) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            h54 h54Var = this.this$0;
            q54 q54Var = h54Var.d;
            int i2 = this.$videoId;
            UserId userId = h54Var.c.b;
            List<VideoFile> list = this.$attachedClips;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((VideoFile) it.next()).a1());
            }
            this.label = 1;
            b = q54Var.b(i2, userId, arrayList, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            b = ((Result) obj).d();
        }
        List<VideoFile> list2 = this.$attachedClips;
        h54 h54Var2 = this.this$0;
        if (!(b instanceof Result.Failure)) {
            if (list2.size() > 1) {
                h54Var2.c(x44.c.d.a);
            } else if (list2.size() == 1) {
                h54Var2.c(x44.c.e.a);
            } else {
                h54Var2.c(x44.c.a.a);
            }
            h54Var2.c(new x44.a(new AttachedClipsResult(list2)));
        }
        h54 h54Var3 = this.this$0;
        List<VideoFile> list3 = this.$attachedClips;
        Throwable a = Result.a(b);
        if (a != null) {
            if (h03.a(a)) {
            } else if (list3.size() > 1) {
                com.vk.metrics.eventtracking.b.a.a(a);
            } else if (list3.size() == 1) {
                com.vk.metrics.eventtracking.b.a.a(a);
            } else {
                com.vk.metrics.eventtracking.b.a.a(a);
            }
        }
        return s3q0.a;
    }
}
