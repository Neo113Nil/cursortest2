package xsna;

import android.util.Log;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.viewer.edit.presentation.feature.state.ClipEditSdkMviState;
import com.vk.clips.viewer.edit.presentation.feature.state.ImmutableClipState;
import com.vk.clips.viewer.edit.presentation.feature.state.coauthors.ClipsEditCoauthorsState;
import com.vk.clips.viewer.edit.presentation.feature.state.videoattach.ClipEditVideoAttachState;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ysc;
import xsna.zsc;

/* compiled from: ClipEditSdkMviTaskExecutor.kt */
@b6l(c = "com.vk.clips.viewer.edit.presentation.feature.executor.ClipEditSdkMviTaskExecutor$handleUpdateClip$1", f = "ClipEditSdkMviTaskExecutor.kt", l = {35, 41}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class jtc extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ ntc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtc(ntc ntcVar, spj<? super jtc> spjVar) {
        super(2, spjVar);
        this.this$0 = ntcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jtc(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jtc) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0111, code lost:
    
        if (r14 == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0113, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0049, code lost:
    
        if (r14 == r0) goto L49;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object f;
        String str;
        List list;
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.this$0.e(zsc.e.a);
            ntc ntcVar = this.this$0;
            tsc tscVar = ntcVar.g;
            String str2 = ((ClipEditSdkMviState) ntcVar.b.getCurrentState()).c;
            this.label = 1;
            f = tscVar.f(str2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                e = ((Result) obj).d();
                ntc ntcVar2 = this.this$0;
                if (!(e instanceof Result.Failure)) {
                    ImmutableClipState immutableClipState = (ImmutableClipState) e;
                    ntcVar2.c(new ysc.h(ImmutableClipState.a(((ClipEditSdkMviState) ntcVar2.b.getCurrentState()).i, immutableClipState.e, immutableClipState.f, immutableClipState.k, immutableClipState.l, immutableClipState.m, 4583)));
                }
                ntc ntcVar3 = this.this$0;
                Throwable a = Result.a(e);
                if (a != null) {
                    Log.e("MviLogger", "", a);
                    ntcVar3.getClass();
                    ntcVar3.e(zsc.c.a);
                    ntcVar3.e(zsc.h.a);
                }
                return s3q0.a;
            }
            kotlin.a.a(obj);
            f = ((Result) obj).d();
        }
        if (f instanceof Result.Failure) {
            ntc ntcVar4 = this.this$0;
            ntcVar4.getClass();
            ntcVar4.e(zsc.c.a);
            ntcVar4.e(zsc.h.a);
            return s3q0.a;
        }
        ClipEditVideoAttachState clipEditVideoAttachState = ((ClipEditSdkMviState) this.this$0.b.getCurrentState()).e;
        if (clipEditVideoAttachState.equals(ClipEditVideoAttachState.Disabled.b) || clipEditVideoAttachState.equals(ClipEditVideoAttachState.Empty.b)) {
            str = null;
        } else if (clipEditVideoAttachState instanceof ClipEditVideoAttachState.Loading) {
            str = ((ClipEditVideoAttachState.Loading) clipEditVideoAttachState).b;
        } else {
            if (!(clipEditVideoAttachState instanceof ClipEditVideoAttachState.Selected)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((ClipEditVideoAttachState.Selected) clipEditVideoAttachState).e;
        }
        ntc ntcVar5 = this.this$0;
        tsc tscVar2 = ntcVar5.g;
        ImmutableClipState immutableClipState2 = ((ClipEditSdkMviState) ntcVar5.b.getCurrentState()).i;
        String str3 = ((ClipEditSdkMviState) this.this$0.b.getCurrentState()).b;
        SdkClipOrdData sdkClipOrdData = ((ClipEditSdkMviState) this.this$0.b.getCurrentState()).d;
        ImmutableClipState.AttachedVideo attachedVideo = ((ClipEditSdkMviState) this.this$0.b.getCurrentState()).i.l;
        if (epx.f(attachedVideo != null ? attachedVideo.getId() : null, str)) {
            str = null;
        } else if (str == null) {
            str = "";
        }
        ImmutableClipState.AttachedVideo.RawId rawId = str != null ? new ImmutableClipState.AttachedVideo.RawId(str) : null;
        ClipsEditCoauthorsState clipsEditCoauthorsState = ((ClipEditSdkMviState) this.this$0.b.getCurrentState()).f;
        if (epx.f(clipsEditCoauthorsState, ClipsEditCoauthorsState.Disabled.b)) {
            list = EmptyList.b;
        } else {
            if (!(clipsEditCoauthorsState instanceof ClipsEditCoauthorsState.Enabled)) {
                throw new NoWhenBranchMatchedException();
            }
            list = ((ClipsEditCoauthorsState.Enabled) clipsEditCoauthorsState).b;
        }
        ImmutableClipState a2 = ImmutableClipState.a(immutableClipState2, str3, null, sdkClipOrdData, rawId, list, 4599);
        this.label = 2;
        e = tscVar2.e(a2, this);
    }
}
