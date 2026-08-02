package com.yandex.messaging.internal.menu;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.v;
import defpackage.c3b;
import defpackage.d3b;
import defpackage.e3b;
import defpackage.f3b;
import defpackage.io9;
import defpackage.j3b;
import defpackage.jqr;
import defpackage.lqo;
import defpackage.mrb;
import defpackage.mvg;
import defpackage.n1f;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.qff;
import defpackage.r96;
import defpackage.sk7;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.tz10;
import defpackage.v4t;
import defpackage.wls;
import defpackage.wwg0;
import defpackage.x22;
import defpackage.x6t;
import defpackage.zf6;
import defpackage.zrm;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.menu.ChatHolderDialogMenuViewController$showChatMenu$1", f = "ChatHolderDialogMenuViewController.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatHolderDialogMenuViewController$showChatMenu$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    final /* synthetic */ String $source;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHolderDialogMenuViewController$showChatMenu$1(c cVar, ChatRequest chatRequest, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$chatRequest = chatRequest;
        this.$source = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatHolderDialogMenuViewController$showChatMenu$1(this.this$0, this.$chatRequest, this.$source, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatHolderDialogMenuViewController$showChatMenu$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object y;
        zy11 zy11Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            ChatRequest chatRequest = this.$chatRequest;
            this.label = 1;
            y = e.y(e.l(cVar.g.a(chatRequest), cVar.h.a(new v4t(chatRequest)), cVar.i.a(zy11Var2), cVar.n.a(), new m0(cVar.j.a(chatRequest), new qff(e.d(cVar.q.a.a), 0), new ChatHolderDialogMenuViewController$getDataAsync$2(3, null)), new ChatHolderDialogMenuViewController$getDataAsync$3(cVar, chatRequest, null)), this);
            if (y == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            y = obj;
        }
        final f3b f3bVar = (f3b) y;
        c cVar2 = this.this$0;
        io9 io9Var = cVar2.p;
        j3b j3bVar = f3bVar.b;
        boolean z = f3bVar.i;
        boolean z2 = f3bVar.f;
        boolean z3 = f3bVar.d;
        boolean z4 = f3bVar.k;
        boolean z5 = f3bVar.j;
        boolean z6 = f3bVar.l;
        String str = j3bVar.b;
        String str2 = this.$source;
        io9Var.getClass();
        sk7 sk7Var = new sk7(15, (Object) io9Var, (Object) str2, str);
        ((x22) io9Var.a).f("chat menu opened", "chat id", str, "source", str2);
        cVar2.t = sk7Var;
        c3b c3bVar = this.this$0.c;
        BottomSheetDialog bottomSheetDialog = c3bVar.c;
        bottomSheetDialog.show();
        c3bVar.d.removeAllViews();
        int i2 = 1;
        bottomSheetDialog.setOnDismissListener(new zf6(i2, c3bVar));
        this.this$0.c.e.setText(f3bVar.g);
        c cVar3 = this.this$0;
        cVar3.c.g = new e3b(cVar3, i2);
        cVar3.o.getClass();
        c cVar4 = this.this$0;
        cVar4.getClass();
        if (!z6 && !z4 && f3bVar.e && z3) {
            cVar4.c.a(z2 ? oyh0.chatlist_menu_pin_channel : oyh0.chatlist_menu_pin, wwg0.msg_ic_pin, null, new d3b(cVar4, f3bVar, 10));
        }
        c cVar5 = this.this$0;
        if (cVar5.s.a(tz10.O)) {
            zy11Var = zy11Var2;
            cVar5.c.a(oyh0.add_to_folder_btn_text, wwg0.msg_ic_folder, Integer.valueOf(wwg0.msg_ic_chevron_right), new d3b(cVar5, f3bVar, 11));
        } else {
            zy11Var = zy11Var2;
        }
        c cVar6 = this.this$0;
        cVar6.getClass();
        if (!z6 && z4 && z3) {
            cVar6.c.a(z2 ? oyh0.chatlist_menu_unpin_channel : oyh0.chatlist_menu_unpin, wwg0.msg_ic_unpin, null, new d3b(cVar6, f3bVar, 9));
        }
        c cVar7 = this.this$0;
        lqo lqoVar = cVar7.s;
        r96 r96Var = tz10.G;
        if (lqoVar.a(r96Var) && j3bVar.P) {
            cVar7.c.a(oyh0.menu_mark_unread, wwg0.msg_ic_unread, null, new d3b(cVar7, f3bVar, 2));
        }
        c cVar8 = this.this$0;
        if (cVar8.s.a(r96Var) && j3bVar.Q) {
            cVar8.c.a(oyh0.menu_mark_read, wwg0.msg_ic_mark_read, null, new d3b(cVar8, f3bVar, 8));
        }
        c cVar9 = this.this$0;
        if (cVar9.e.a && !z6 && z4 && z3) {
            cVar9.c.a(oyh0.chat_menu_reorder_pins, wwg0.msg_ic_reorder_pin, null, new e3b(cVar9, 0));
        }
        c cVar10 = this.this$0;
        cVar10.getClass();
        if (!z6 && !z && !z5) {
            cVar10.c.a(oyh0.chatlist_menu_mute_on, wwg0.msg_ic_notification_off, null, new d3b(cVar10, f3bVar, 1));
        }
        c cVar11 = this.this$0;
        cVar11.getClass();
        if (!z6 && z && !z5) {
            cVar11.c.a(oyh0.chatlist_menu_mute_off, wwg0.msg_ic_notification_on, null, new d3b(cVar11, f3bVar, 7));
        }
        final c cVar12 = this.this$0;
        cVar12.getClass();
        if (!z6 && f3bVar.c) {
            cVar12.c.a(oyh0.update_chat_organization_title, wwg0.msg_ic_update_chat_organization, null, new sls() { // from class: com.yandex.messaging.internal.menu.b
                @Override // defpackage.sls
                public final Object invoke() {
                    final c cVar13 = c.this;
                    zrm zrmVar = cVar13.l;
                    v vVar = (v) zrmVar.b;
                    zy11 zy11Var3 = zy11.a;
                    e.H(cVar13.c.b, new jqr(new n1f(21, vVar.a(zy11Var3), zrmVar), new ChatHolderDialogMenuViewController$addUpdateOrganization$1$1(cVar13, null), 3));
                    mrb mrbVar = new mrb(cVar13.a, cVar13.f);
                    final f3b f3bVar2 = f3bVar;
                    mrbVar.b = new tls() { // from class: com.yandex.messaging.internal.menu.a
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            long longValue = ((Long) obj2).longValue();
                            c cVar14 = c.this;
                            tje.N(cVar14.c.b, null, null, new ChatHolderDialogMenuViewController$addUpdateOrganization$1$2$1(cVar14, f3bVar2, longValue, null), 3);
                            return zy11.a;
                        }
                    };
                    mrbVar.a.show();
                    return zy11Var3;
                }
            });
        }
        if (j3bVar.C && !z5) {
            c cVar13 = this.this$0;
            cVar13.getClass();
            String str3 = j3bVar.e;
            if (str3 != null) {
                e.H(cVar13.c.b, new jqr(cVar13.r.a(new x6t(str3)), new ChatHolderDialogMenuViewController$addDisplayedUserStatus$1(cVar13, null), 3));
            }
        }
        c cVar14 = this.this$0;
        cVar14.getClass();
        if (!z6 && !z5 && f3bVar.h != null) {
            cVar14.c.a(oyh0.chat_menu_contact_info, wwg0.msg_ic_contact_info, null, new d3b(cVar14, f3bVar, 5));
        }
        c cVar15 = this.this$0;
        cVar15.getClass();
        if (f3bVar.m && !z5) {
            cVar15.c.b(z2 ? oyh0.exit_channel_chat_menu_item : oyh0.chatlist_menu_exit, wwg0.msg_ic_chat_exit, new d3b(cVar15, f3bVar, 0));
        }
        c cVar16 = this.this$0;
        cVar16.getClass();
        if (!z6 && f3bVar.n && !z5) {
            cVar16.c.b(oyh0.chatlist_menu_clear_chat_history, wwg0.msg_ic_delete, new d3b(cVar16, f3bVar, 6));
        }
        return zy11Var;
    }
}
