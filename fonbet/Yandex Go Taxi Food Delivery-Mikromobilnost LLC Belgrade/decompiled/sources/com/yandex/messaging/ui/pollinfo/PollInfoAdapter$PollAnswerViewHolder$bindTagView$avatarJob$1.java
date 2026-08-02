package com.yandex.messaging.ui.pollinfo;

import android.view.View;
import android.widget.ImageView;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import defpackage.ad7;
import defpackage.e9h0;
import defpackage.g020;
import defpackage.hb4;
import defpackage.kjs0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.pollinfo.PollInfoAdapter$PollAnswerViewHolder$bindTagView$avatarJob$1", f = "PollInfoAdapter.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PollInfoAdapter$PollAnswerViewHolder$bindTagView$avatarJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $name;
    final /* synthetic */ View $this_bindTagView;
    final /* synthetic */ ReducedUserInfo $userInfo;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollInfoAdapter$PollAnswerViewHolder$bindTagView$avatarJob$1(View view, a aVar, ReducedUserInfo reducedUserInfo, String str, Continuation continuation) {
        super(2, continuation);
        this.$this_bindTagView = view;
        this.this$0 = aVar;
        this.$userInfo = reducedUserInfo;
        this.$name = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PollInfoAdapter$PollAnswerViewHolder$bindTagView$avatarJob$1(this.$this_bindTagView, this.this$0, this.$userInfo, this.$name, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PollInfoAdapter$PollAnswerViewHolder$bindTagView$avatarJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ImageView imageView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ImageView imageView2 = (ImageView) this.$this_bindTagView.findViewById(e9h0.user_tag_avatar);
            com.yandex.messaging.internal.avatar.a aVar = this.this$0.a;
            String str = this.$userInfo.avatarId;
            int b = kjs0.b(28);
            String str2 = this.$name;
            if (str2 == null) {
                str2 = "";
            }
            g020 g020Var = new g020(com.yandex.messaging.internal.images.b.f(str), b, str2, this.$userInfo.userId, hb4.a);
            this.L$0 = imageView2;
            this.label = 1;
            Object b2 = aVar.b(g020Var, this);
            if (b2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = b2;
            imageView = imageView2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imageView = (ImageView) this.L$0;
            kotlin.b.b(obj);
        }
        imageView.setImageBitmap(((ad7) obj).a);
        return zy11.a;
    }
}
