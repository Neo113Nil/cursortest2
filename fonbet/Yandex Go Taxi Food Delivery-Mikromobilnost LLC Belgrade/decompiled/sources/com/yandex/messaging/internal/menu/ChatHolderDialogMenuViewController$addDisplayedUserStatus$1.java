package com.yandex.messaging.internal.menu;

import android.widget.TextView;
import com.yandex.messaging.base.view.EmojiDrawable;
import com.yandex.messaging.domain.statuses.StatusIconType;
import defpackage.bob1;
import defpackage.c3b;
import defpackage.du21;
import defpackage.gu21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r0k;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr0k;", "it", "Lzy11;", "<anonymous>", "(Lr0k;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.menu.ChatHolderDialogMenuViewController$addDisplayedUserStatus$1", f = "ChatHolderDialogMenuViewController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatHolderDialogMenuViewController$addDisplayedUserStatus$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHolderDialogMenuViewController$addDisplayedUserStatus$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatHolderDialogMenuViewController$addDisplayedUserStatus$1 chatHolderDialogMenuViewController$addDisplayedUserStatus$1 = new ChatHolderDialogMenuViewController$addDisplayedUserStatus$1(this.this$0, continuation);
        chatHolderDialogMenuViewController$addDisplayedUserStatus$1.L$0 = obj;
        return chatHolderDialogMenuViewController$addDisplayedUserStatus$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChatHolderDialogMenuViewController$addDisplayedUserStatus$1 chatHolderDialogMenuViewController$addDisplayedUserStatus$1 = (ChatHolderDialogMenuViewController$addDisplayedUserStatus$1) create((r0k) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chatHolderDialogMenuViewController$addDisplayedUserStatus$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        gu21 gu21Var = ((r0k) this.L$0).a;
        du21 du21Var = gu21Var instanceof du21 ? (du21) gu21Var : null;
        c3b c3bVar = this.this$0.c;
        c3bVar.getClass();
        StatusIconType statusIconType = du21Var != null ? du21Var.f : null;
        TextView textView = c3bVar.e;
        if (statusIconType != null) {
            bob1.c(textView, statusIconType.getIconRes(), statusIconType.getColor(), 16);
        } else {
            String str = du21Var != null ? du21Var.d : null;
            bob1.d(textView, str != null ? new EmojiDrawable(str, textView.getTextSize() - 2.0f) : null, false);
        }
        c3b c3bVar2 = this.this$0.c;
        String str2 = du21Var != null ? du21Var.e : null;
        TextView textView2 = c3bVar2.f;
        textView2.setVisibility(str2 == null ? 8 : 0);
        textView2.setText(str2);
        return zy11.a;
    }
}
