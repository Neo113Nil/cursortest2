package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.el50;

/* compiled from: MusicDownloadsSettingsInlineActor.kt */
@b6l(c = "com.vk.music.offline.ui.presentation.MusicDownloadsSettingsInlineActor$clearDownloads$1$1", f = "MusicDownloadsSettingsInlineActor.kt", l = {70, 70}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class bj40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ ej40 this$0;

    /* compiled from: MusicDownloadsSettingsInlineActor.kt */
    public static final /* synthetic */ class a implements lsr, g0t {
        public final /* synthetic */ ej40 b;

        public a(ej40 ej40Var) {
            this.b = ej40Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            long longValue = ((Number) obj).longValue();
            ej40 ej40Var = this.b;
            ej40Var.getClass();
            el50.a.b(ej40Var, new aj40(longValue));
            s3q0 s3q0Var = s3q0.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return s3q0Var;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lsr) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new AdaptedFunctionReference(2, this.b, ej40.class, "updateCurrentDownloadsSize", "updateCurrentDownloadsSize(J)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj40(ej40 ej40Var, spj<? super bj40> spjVar) {
        super(2, spjVar);
        this.this$0 = ej40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new bj40(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((bj40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (((xsna.ksr) r5).collect(r3, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            j850 j850Var = this.this$0.c;
            this.label = 1;
            obj = j850Var.b.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        a aVar = new a(this.this$0);
        this.label = 2;
    }
}
