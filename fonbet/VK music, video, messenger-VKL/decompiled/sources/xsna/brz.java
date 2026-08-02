package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Loaded.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.LoadedKt$Loaded$2$1", f = "Loaded.kt", l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class brz extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ xvy $lazyListState;
    final /* synthetic */ boolean $scrollToTitle;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brz(boolean z, xvy xvyVar, spj<? super brz> spjVar) {
        super(2, spjVar);
        this.$scrollToTitle = z;
        this.$lazyListState = xvyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new brz(this.$scrollToTitle, this.$lazyListState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((brz) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$scrollToTitle) {
                Iterator<T> it = this.$lazyListState.j().f().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (epx.f(((xuy) obj2).getKey(), "ITEM_KEY_TITLE")) {
                        break;
                    }
                }
                xuy xuyVar = (xuy) obj2;
                if (xuyVar == null) {
                    return s3q0.a;
                }
                xvy xvyVar = this.$lazyListState;
                int index = xuyVar.getIndex();
                this.L$0 = null;
                this.label = 1;
                if (xvyVar.f(index, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
