package com.ybsdk.core.design.spoiler;

import com.ybsdk.core.design.spoiler.Spoiler;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "isSpoilerVisible", "", "kotlin.jvm.PlatformType", "newText", "Lzy11;", "<anonymous>", "(ZLjava/lang/CharSequence;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.design.spoiler.SpoilerTextView$onAttachedToWindow$1$1", f = "SpoilerTextView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SpoilerTextView$onAttachedToWindow$1$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $hidingBalanceString;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ SpoilerTextView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpoilerTextView$onAttachedToWindow$1$1(SpoilerTextView spoilerTextView, String str, Continuation continuation) {
        super(3, continuation);
        this.this$0 = spoilerTextView;
        this.$hidingBalanceString = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        SpoilerTextView$onAttachedToWindow$1$1 spoilerTextView$onAttachedToWindow$1$1 = new SpoilerTextView$onAttachedToWindow$1$1(this.this$0, this.$hidingBalanceString, (Continuation) obj3);
        spoilerTextView$onAttachedToWindow$1$1.Z$0 = booleanValue;
        spoilerTextView$onAttachedToWindow$1$1.L$0 = (CharSequence) obj2;
        return spoilerTextView$onAttachedToWindow$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tls tlsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = this.Z$0;
        CharSequence charSequence = (CharSequence) this.L$0;
        SpoilerTextView spoilerTextView = this.this$0;
        spoilerTextView.setSpoiler(Spoiler.a(spoilerTextView.getSpoiler(), z, null, null, null, 14));
        SpoilerTextView spoilerTextView2 = this.this$0;
        if (z && spoilerTextView2.getSpoiler().d == Spoiler.SpoilerEnable.ENABLED) {
            charSequence = this.$hidingBalanceString;
        }
        spoilerTextView2.setContentDescription(charSequence);
        tlsVar = this.this$0.changeVisibilityCallback;
        if (tlsVar == null) {
            return null;
        }
        tlsVar.invoke(Boolean.valueOf(z));
        return zy11.a;
    }
}
