package androidx.compose.foundation.text.contextmenu.modifier;

import defpackage.dly0;
import defpackage.ely0;
import defpackage.ily0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1", f = "TextContextMenuGesturesModifier.kt", l = {HProv.PP_SET_PIN, 108}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TextContextMenuGestureNode$tryShowContextMenu$1 extends SuspendLambda implements wls {
    final /* synthetic */ dly0 $dataProvider;
    final /* synthetic */ long $localClickOffset;
    final /* synthetic */ ily0 $provider;
    int label;
    final /* synthetic */ ely0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextContextMenuGestureNode$tryShowContextMenu$1(ely0 ely0Var, long j, ily0 ily0Var, dly0 dly0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ely0Var;
        this.$localClickOffset = j;
        this.$provider = ily0Var;
        this.$dataProvider = dly0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextContextMenuGestureNode$tryShowContextMenu$1(this.this$0, this.$localClickOffset, this.$provider, this.$dataProvider, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TextContextMenuGestureNode$tryShowContextMenu$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r7.a(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r7.invoke(r1, r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wls wlsVar = this.this$0.c;
            if (wlsVar != null) {
                wu60 wu60Var = new wu60(this.$localClickOffset);
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ily0 ily0Var = this.$provider;
        dly0 dly0Var = this.$dataProvider;
        this.label = 2;
    }
}
