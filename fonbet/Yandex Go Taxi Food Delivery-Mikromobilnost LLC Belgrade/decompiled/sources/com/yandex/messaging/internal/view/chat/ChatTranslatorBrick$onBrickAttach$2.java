package com.yandex.messaging.internal.view.chat;

import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.widget.EmojiTextView;
import defpackage.ai91;
import defpackage.l7b;
import defpackage.m2y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.sz01;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "lang", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.ChatTranslatorBrick$onBrickAttach$2", f = "ChatTranslatorBrick.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatTranslatorBrick$onBrickAttach$2 extends SuspendLambda implements wls {
    final /* synthetic */ sz01 $config;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTranslatorBrick$onBrickAttach$2(e eVar, sz01 sz01Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$config = sz01Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatTranslatorBrick$onBrickAttach$2 chatTranslatorBrick$onBrickAttach$2 = new ChatTranslatorBrick$onBrickAttach$2(this.this$0, this.$config, continuation);
        chatTranslatorBrick$onBrickAttach$2.L$0 = obj;
        return chatTranslatorBrick$onBrickAttach$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatTranslatorBrick$onBrickAttach$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            e eVar = this.this$0;
            m2y m2yVar = eVar.A;
            if (((EmojiTextView) m2yVar.e).getVisibility() != 0) {
                ai91.f((EmojiTextView) m2yVar.e, false);
                final ConstraintLayout constraintLayout = (ConstraintLayout) m2yVar.c;
                final l7b l7bVar = new l7b(5, eVar);
                constraintLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.messaging.extension.view.ViewExtensionsKt$onPreDrawUntil$1
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        if (!((Boolean) sls.this.invoke()).booleanValue()) {
                            return true;
                        }
                        constraintLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                        return true;
                    }
                });
            }
            e eVar2 = this.this$0;
            String str2 = this.$config.a;
            this.label = 1;
            if (e.q(eVar2, str, str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
