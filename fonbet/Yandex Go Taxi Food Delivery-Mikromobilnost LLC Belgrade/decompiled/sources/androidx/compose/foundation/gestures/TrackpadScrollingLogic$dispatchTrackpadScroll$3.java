package androidx.compose.foundation.gestures;

import defpackage.bvf0;
import defpackage.clp0;
import defpackage.kjj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p801;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lclp0;", "Lzy11;", "<anonymous>", "(Lclp0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3", f = "TrackpadScrollingLogic.kt", l = {178}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TrackpadScrollingLogic$dispatchTrackpadScroll$3 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<p801> $targetScrollDelta;
    final /* synthetic */ y $this_dispatchTrackpadScroll;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackpadScrollingLogic$dispatchTrackpadScroll$3(a0 a0Var, y yVar, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(2, continuation);
        this.this$0 = a0Var;
        this.$this_dispatchTrackpadScroll = yVar;
        this.$targetScrollDelta = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackpadScrollingLogic$dispatchTrackpadScroll$3 trackpadScrollingLogic$dispatchTrackpadScroll$3 = new TrackpadScrollingLogic$dispatchTrackpadScroll$3(this.this$0, this.$this_dispatchTrackpadScroll, this.$targetScrollDelta, continuation);
        trackpadScrollingLogic$dispatchTrackpadScroll$3.L$0 = obj;
        return trackpadScrollingLogic$dispatchTrackpadScroll$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackpadScrollingLogic$dispatchTrackpadScroll$3) create((clp0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a9  */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, p801] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006e -> B:5:0x0071). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        clp0 clp0Var;
        Ref$ObjectRef<p801> ref$ObjectRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            clp0 clp0Var2 = (clp0) this.L$0;
            a0 a0Var = this.this$0;
            y yVar = this.$this_dispatchTrackpadScroll;
            float i2 = yVar.i(yVar.e(this.$targetScrollDelta.element.a));
            y yVar2 = a0Var.a;
            yVar2.g(yVar2.e(clp0Var2.a(1, yVar2.h(yVar2.d(i2)))));
            clp0Var = clp0Var2;
            ref$ObjectRef = this.$targetScrollDelta;
            if (!ref$ObjectRef.element.c) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            clp0Var = (clp0) this.L$0;
            kotlin.b.b(obj);
            T t = obj;
            ref$ObjectRef.element = t;
            a0 a0Var2 = this.this$0;
            p801 p801Var = this.$targetScrollDelta.element;
            kjj kjjVar = a0Var2.e;
            long j = p801Var.b;
            long j2 = p801Var.a;
            kjjVar.a.a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            kjjVar.b.a(Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), j);
            p801 e = a0.e(this.this$0.f);
            if (e != null) {
                a0 a0Var3 = this.this$0;
                Ref$ObjectRef<p801> ref$ObjectRef2 = this.$targetScrollDelta;
                kjj kjjVar2 = a0Var3.e;
                long j3 = e.b;
                long j4 = e.a;
                kjjVar2.a.a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                kjjVar2.b.a(Float.intBitsToFloat((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), j3);
                ref$ObjectRef2.element = ref$ObjectRef2.element.a(e);
            }
            a0 a0Var4 = this.this$0;
            y yVar3 = this.$this_dispatchTrackpadScroll;
            float i3 = yVar3.i(yVar3.e(this.$targetScrollDelta.element.a));
            y yVar4 = a0Var4.a;
            yVar4.g(yVar4.e(clp0Var.a(1, yVar4.h(yVar4.d(i3)))));
            ref$ObjectRef = this.$targetScrollDelta;
            if (!ref$ObjectRef.element.c) {
                kotlinx.coroutines.channels.a aVar = this.this$0.f;
                this.L$0 = clp0Var;
                this.L$1 = ref$ObjectRef;
                this.label = 1;
                Object n = bvf0.n(new NonTouchScrollingLogicKt$busyReceive$2(aVar, null), this);
                t = n;
                if (n == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef.element = t;
                a0 a0Var22 = this.this$0;
                p801 p801Var2 = this.$targetScrollDelta.element;
                kjj kjjVar3 = a0Var22.e;
                long j5 = p801Var2.b;
                long j22 = p801Var2.a;
                kjjVar3.a.a(Float.intBitsToFloat((int) (j22 >> 32)), j5);
                kjjVar3.b.a(Float.intBitsToFloat((int) (j22 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), j5);
                p801 e2 = a0.e(this.this$0.f);
                if (e2 != null) {
                }
                a0 a0Var42 = this.this$0;
                y yVar32 = this.$this_dispatchTrackpadScroll;
                float i32 = yVar32.i(yVar32.e(this.$targetScrollDelta.element.a));
                y yVar42 = a0Var42.a;
                yVar42.g(yVar42.e(clp0Var.a(1, yVar42.h(yVar42.d(i32)))));
                ref$ObjectRef = this.$targetScrollDelta;
                if (!ref$ObjectRef.element.c) {
                    return zy11.a;
                }
            }
        }
    }
}
