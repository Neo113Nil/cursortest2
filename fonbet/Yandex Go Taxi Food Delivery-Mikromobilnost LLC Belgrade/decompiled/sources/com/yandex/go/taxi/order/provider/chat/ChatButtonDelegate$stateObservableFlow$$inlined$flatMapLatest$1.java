package com.yandex.go.taxi.order.provider.chat;

import com.yandex.messenger.websdk.api.Cancelable;
import defpackage.g1b;
import defpackage.g92;
import defpackage.h1b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.z221;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.provider.chat.ChatButtonDelegate$stateObservableFlow$$inlined$flatMapLatest$1", f = "ChatButtonDelegate.kt", l = {220, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class ChatButtonDelegate$stateObservableFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatButtonDelegate$stateObservableFlow$$inlined$flatMapLatest$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChatButtonDelegate$stateObservableFlow$$inlined$flatMapLatest$1 chatButtonDelegate$stateObservableFlow$$inlined$flatMapLatest$1 = new ChatButtonDelegate$stateObservableFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        chatButtonDelegate$stateObservableFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        chatButtonDelegate$stateObservableFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return chatButtonDelegate$stateObservableFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009a, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r9, r0, r8) == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r9 == r2) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DriveState driveState;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 2;
        if (i == 0) {
            kotlin.b.b(obj);
            g1b g1bVar = (g1b) obj2;
            boolean z = g1bVar.c;
            String str = g1bVar.d;
            if (z && ((driveState = g1bVar.b) == DriveState.DRIVING || driveState == DriveState.WAITING || driveState == DriveState.TRANSPORTING)) {
                c cVar = this.this$0;
                String str2 = g1bVar.a;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                obj = c.a(cVar, str2, str, this);
            } else {
                z221 z221Var = this.this$0.b;
                if (str == null) {
                    str = "";
                }
                ru.yandex.taxi.messenger.unreadcount.a aVar = (ru.yandex.taxi.messenger.unreadcount.a) z221Var.e.remove(str);
                if (aVar != null) {
                    aVar.c = true;
                    aVar.e.a(null);
                    Cancelable cancelable = aVar.d;
                    if (cancelable != null) {
                        cancelable.cancel();
                    }
                    aVar.d = null;
                }
                obj = new g92(i2, h1b.d);
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
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
