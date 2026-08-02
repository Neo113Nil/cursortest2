package com.yandex.messaging.internal.view.input.channel;

import android.content.res.ColorStateList;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import com.yandex.messaging.base.rights.ChatRightsFlag;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.input.channel.a;
import defpackage.fxa1;
import defpackage.gvg0;
import defpackage.hi91;
import defpackage.j3b;
import defpackage.jng0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8b;
import defpackage.wbz0;
import defpackage.wls;
import defpackage.wwg0;
import defpackage.z83;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3b;", "it", "Lzy11;", "<anonymous>", "(Lj3b;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.input.channel.ChannelInput$onBrickAttach$1", f = "ChannelInput.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChannelInput$onBrickAttach$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelInput$onBrickAttach$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChannelInput$onBrickAttach$1 channelInput$onBrickAttach$1 = new ChannelInput$onBrickAttach$1(this.this$0, continuation);
        channelInput$onBrickAttach$1.L$0 = obj;
        return channelInput$onBrickAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChannelInput$onBrickAttach$1 channelInput$onBrickAttach$1 = (ChannelInput$onBrickAttach$1) create((j3b) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        channelInput$onBrickAttach$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        j3b j3bVar = (j3b) this.L$0;
        final a aVar = this.this$0;
        View view = aVar.N;
        ImageButton imageButton = aVar.M;
        aVar.O = j3bVar;
        String str = j3bVar.b;
        boolean z = j3bVar.n;
        z83.h(null, ChatNamespaces.b(str));
        ChatInputHeightState chatInputHeightState = aVar.F;
        chatInputHeightState.a(aVar.H.getDimensionPixelSize(gvg0.chat_input_button_height));
        View view2 = aVar.I;
        final int i = 0;
        view2.setVisibility(0);
        if (!j3bVar.l) {
            aVar.K.setVisibility(z ? 0 : 8);
            aVar.J.setVisibility(z ? 0 : 8);
            imageButton.setVisibility(z ? 0 : 8);
            aVar.L.setVisibility(z ? 8 : 0);
            wbz0 wbz0Var = s8b.c;
            int i2 = j3bVar.i;
            wbz0Var.getClass();
            s8b s8bVar = new s8b(i2);
            if (z) {
                hi91.g(new ChannelInput$onChatInfoAvailable$1(aVar, null), view);
                if (j3bVar.j) {
                    imageButton.setImageTintList(ColorStateList.valueOf(fxa1.c(jng0.messagingCommonIconsSecondaryColor, view2.getContext()).data));
                    imageButton.setImageResource(wwg0.msg_ic_notification_off);
                    imageButton.setOnClickListener(new View.OnClickListener() { // from class: hi9
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            int i3 = i;
                            a aVar2 = aVar;
                            switch (i3) {
                                case 0:
                                    k0b k0bVar = aVar2.G;
                                    k0bVar.getClass();
                                    tje.e();
                                    b00 b00Var = k0bVar.a;
                                    ((Handler) b00Var.a.get()).post(new qz(b00Var, k0bVar.b, 3));
                                    Toast.makeText(aVar2.a, oyh0.notifications_turned_on, 0).show();
                                    break;
                                default:
                                    k0b k0bVar2 = aVar2.G;
                                    k0bVar2.getClass();
                                    tje.e();
                                    b00 b00Var2 = k0bVar2.a;
                                    ((Handler) b00Var2.a.get()).post(new pz(b00Var2, k0bVar2.b, 1));
                                    Toast.makeText(aVar2.a, oyh0.notifications_turned_off, 0).show();
                                    break;
                            }
                        }
                    });
                } else {
                    imageButton.setImageTintList(ColorStateList.valueOf(fxa1.c(jng0.messagingCommonAccentTextColor, view2.getContext()).data));
                    imageButton.setImageResource(wwg0.msg_ic_notification_on);
                    final int i3 = 1;
                    imageButton.setOnClickListener(new View.OnClickListener() { // from class: hi9
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            int i32 = i3;
                            a aVar2 = aVar;
                            switch (i32) {
                                case 0:
                                    k0b k0bVar = aVar2.G;
                                    k0bVar.getClass();
                                    tje.e();
                                    b00 b00Var = k0bVar.a;
                                    ((Handler) b00Var.a.get()).post(new qz(b00Var, k0bVar.b, 3));
                                    Toast.makeText(aVar2.a, oyh0.notifications_turned_on, 0).show();
                                    break;
                                default:
                                    k0b k0bVar2 = aVar2.G;
                                    k0bVar2.getClass();
                                    tje.e();
                                    b00 b00Var2 = k0bVar2.a;
                                    ((Handler) b00Var2.a.get()).post(new pz(b00Var2, k0bVar2.b, 1));
                                    Toast.makeText(aVar2.a, oyh0.notifications_turned_off, 0).show();
                                    break;
                            }
                        }
                    });
                }
            } else if (s8bVar.f(ChatRightsFlag.Join)) {
                hi91.g(new ChannelInput$onChatInfoAvailable$4(aVar, null), view);
            } else {
                chatInputHeightState.a(0);
                view2.setVisibility(8);
            }
        }
        return zy11.a;
    }
}
