package com.yandex.messaging.internal.urlpreview.impl;

import com.yandex.alicekit.core.views.EllipsizingTextView;
import com.yandex.images.FadingDrawable;
import com.yandex.messaging.core.net.entities.proto.message.LocalizedData;
import defpackage.ad7;
import defpackage.iv21;
import defpackage.mvg;
import defpackage.nh21;
import defpackage.ny61;
import defpackage.ph21;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.ye0;
import defpackage.zgv;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.urlpreview.impl.MessageUrlPreview$bindUserMessageJob$1", f = "MessageUrlPreview.kt", l = {197, 207, 210}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MessageUrlPreview$bindUserMessageJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ ph21 $userMessage;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageUrlPreview$bindUserMessageJob$1(ph21 ph21Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$userMessage = ph21Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessageUrlPreview$bindUserMessageJob$1(this.$userMessage, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageUrlPreview$bindUserMessageJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cb, code lost:
    
        if (r9 != r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003f, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        c cVar;
        Object k0;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str3 = this.$userMessage.B;
            if (str3 == null) {
                str = null;
                if (str == null && ((iv21) this.this$0.E.get()).c) {
                    LocalizedData a = this.this$0.F.a(this.$userMessage.A);
                    str = a == null ? a.getDisplayName() : null;
                }
                if (str == null) {
                    str = this.$userMessage.C;
                }
                this.this$0.J.setText(str);
                cVar = this.this$0;
                this.L$0 = str;
                this.L$1 = cVar;
                this.label = 2;
                cVar.getClass();
                k0 = tje.k0(uyj.a, new MessageUrlPreview$processMessageText$2(cVar, null), this);
                if (k0 != coroutineSingletons) {
                    str2 = str;
                    obj = k0;
                    EllipsizingTextView ellipsizingTextView = cVar.K;
                    ellipsizingTextView.setLastLinePadding(cVar.B);
                    ellipsizingTextView.setText((CharSequence) obj);
                    c cVar2 = this.this$0;
                    cVar2.L.setOnClickListener(new zgv(16, cVar2));
                    c cVar3 = this.this$0;
                    String str4 = ((nh21) ((ye0) cVar3.b)).x;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    obj = tje.k0(cVar3.y.d, new MessageUrlPreview$loadAvatarAsync$2(str4, cVar3, str2, null), this);
                }
                return coroutineSingletons;
            }
            com.yandex.messaging.internal.storage.contacts.a aVar = this.this$0.w;
            this.label = 1;
            obj = aVar.b(str3, this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                ad7 ad7Var = (ad7) obj;
                FadingDrawable.setBitmap(this.this$0.I, ad7Var.a, false, ad7Var.d);
                return zy11.a;
            }
            cVar = (c) this.L$1;
            str2 = (String) this.L$0;
            kotlin.b.b(obj);
            EllipsizingTextView ellipsizingTextView2 = cVar.K;
            ellipsizingTextView2.setLastLinePadding(cVar.B);
            ellipsizingTextView2.setText((CharSequence) obj);
            c cVar22 = this.this$0;
            cVar22.L.setOnClickListener(new zgv(16, cVar22));
            c cVar32 = this.this$0;
            String str42 = ((nh21) ((ye0) cVar32.b)).x;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            obj = tje.k0(cVar32.y.d, new MessageUrlPreview$loadAvatarAsync$2(str42, cVar32, str2, null), this);
        }
        str = (String) obj;
        if (str == null) {
            LocalizedData a2 = this.this$0.F.a(this.$userMessage.A);
            if (a2 == null) {
            }
        }
        if (str == null) {
        }
        this.this$0.J.setText(str);
        cVar = this.this$0;
        this.L$0 = str;
        this.L$1 = cVar;
        this.label = 2;
        cVar.getClass();
        k0 = tje.k0(uyj.a, new MessageUrlPreview$processMessageText$2(cVar, null), this);
        if (k0 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
