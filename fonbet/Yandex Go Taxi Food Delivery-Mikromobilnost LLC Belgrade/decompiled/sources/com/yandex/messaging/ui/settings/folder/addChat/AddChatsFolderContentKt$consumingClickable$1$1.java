package com.yandex.messaging.ui.settings.folder.addChat;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.wls;
import defpackage.zls;
import defpackage.zvd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.folder.addChat.AddChatsFolderContentKt$consumingClickable$1$1", f = "AddChatsFolderContent.kt", l = {633, 635}, m = "invokeSuspend")
/* loaded from: classes14.dex */
final class AddChatsFolderContentKt$consumingClickable$1$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ sls $onClick;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddChatsFolderContentKt$consumingClickable$1$1(sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$onClick = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddChatsFolderContentKt$consumingClickable$1$1 addChatsFolderContentKt$consumingClickable$1$1 = new AddChatsFolderContentKt$consumingClickable$1$1(this.$onClick, continuation);
        addChatsFolderContentKt$consumingClickable$1$1.L$0 = obj;
        return addChatsFolderContentKt$consumingClickable$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddChatsFolderContentKt$consumingClickable$1$1) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r6 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.input.pointer.f fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            this.L$0 = fVar;
            this.label = 1;
            obj = z.b(fVar, null, this, 2);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (((zvd0) obj) != null) {
                    this.$onClick.invoke();
                }
                return zy11.a;
            }
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            kotlin.b.b(obj);
        }
        ((zvd0) obj).a();
        this.L$0 = null;
        this.label = 2;
        zls zlsVar = z.a;
        obj = z.k(fVar, PointerEventPass.Main, this);
    }
}
