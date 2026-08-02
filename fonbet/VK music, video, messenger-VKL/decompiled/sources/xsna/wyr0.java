package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VideoAdFreeSubscriptionInteractorImpl.kt */
/* loaded from: classes.dex */
public final class wyr0 implements vyr0 {
    public final zyr0 a;
    public boolean b;
    public yyr0 c;

    /* compiled from: VideoAdFreeSubscriptionInteractorImpl.kt */
    @b6l(c = "com.vk.libvideo.adfree.impl.domain.VideoAdFreeSubscriptionInteractorImpl", f = "VideoAdFreeSubscriptionInteractorImpl.kt", l = {21}, m = "getSubscriptionState-IoAF18A")
    /* loaded from: classes18.dex */
    public static final class a extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object b = wyr0.this.b(this);
            return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
        }
    }

    public wyr0(czr0 czr0Var) {
        this.a = czr0Var;
    }

    @Override // xsna.vyr0
    public final boolean a() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.vyr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(spj<? super Result<? extends dzr0>> spjVar) {
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
                aVar.label = 1;
                Object a2 = this.a.a(aVar);
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

    @Override // xsna.vyr0
    public final void c(yyr0 yyr0Var) {
        this.c = yyr0Var;
    }

    @Override // xsna.vyr0
    public final yyr0 d() {
        return this.c;
    }

    @Override // xsna.vyr0
    public final void e() {
        this.b = true;
    }
}
