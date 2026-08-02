package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VideoMusicMixInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class oxs0 implements nxs0 {
    public final rxs0 a;

    /* compiled from: VideoMusicMixInteractorImpl.kt */
    @b6l(c = "com.vk.video.music.impl.domain.VideoMusicMixInteractorImpl", f = "VideoMusicMixInteractorImpl.kt", l = {12}, m = "getVideoMusicMix-gIAlu-s")
    public static final class a extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object a = oxs0.this.a(null, this);
            return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
        }
    }

    public oxs0(rxs0 rxs0Var) {
        this.a = rxs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.nxs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, spj<? super Result<mxs0>> spjVar) {
        a aVar;
        int i;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                Integer num = new Integer(1);
                aVar.L$0 = null;
                aVar.label = 1;
                Object a2 = this.a.a(num, str, aVar);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i == 0) {
        }
    }
}
