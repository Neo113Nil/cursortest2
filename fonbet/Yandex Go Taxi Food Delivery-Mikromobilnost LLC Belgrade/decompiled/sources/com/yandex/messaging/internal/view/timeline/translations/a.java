package com.yandex.messaging.internal.view.timeline.translations;

import androidx.lifecycle.p;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.translator.k;
import defpackage.ny61;
import defpackage.nz01;
import defpackage.pcb;
import defpackage.tga1;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy01;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ pcb b;
    public final /* synthetic */ String c;

    public a(vpr vprVar, pcb pcbVar, String str) {
        this.a = vprVar;
        this.b = pcbVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChatTranslatorViewController$onChatOpened$$inlined$map$1$2$1 chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        zy11 zy11Var;
        vpr vprVar;
        vpr vprVar2;
        if (continuation instanceof ChatTranslatorViewController$onChatOpened$$inlined$map$1$2$1) {
            chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1 = (ChatTranslatorViewController$onChatOpened$$inlined$map$1$2$1) continuation;
            int i2 = chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.label;
                zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    vprVar = this.a;
                    if (booleanValue) {
                        chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.L$0 = vprVar;
                        chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.label = 1;
                        pcb pcbVar = this.b;
                        ChatRequest chatRequest = pcbVar.a;
                        k kVar = pcbVar.b;
                        p pVar = pcbVar.l;
                        nz01 nz01Var = pcbVar.k;
                        if (tga1.d(nz01Var.b) || ((zy01) nz01Var.c.get()).c) {
                            kVar.e(chatRequest, this.c);
                        }
                        com.yandex.messaging.extension.flow.c.b(kotlinx.coroutines.flow.e.t(kVar.b(chatRequest)), pVar, new ChatTranslatorViewController$setupTranslation$2(pcbVar, null));
                        tje.N(pVar, null, null, new ChatTranslatorViewController$setupTranslation$3(pcbVar, null), 3);
                        tje.N(pVar, null, null, new ChatTranslatorViewController$setupTranslation$4(pcbVar, null), 3);
                        if (zy11Var != coroutineSingletons) {
                            vprVar2 = vprVar;
                        }
                    }
                    chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.L$0 = null;
                    chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.label = 2;
                    return vprVar.emit(zy11Var, chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj2);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vprVar2 = (vpr) chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.L$0;
                kotlin.b.b(obj2);
                vprVar = vprVar2;
                chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.L$0 = null;
                chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.label = 2;
                if (vprVar.emit(zy11Var, chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1) == coroutineSingletons) {
                }
            }
        }
        chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1 = new ChatTranslatorViewController$onChatOpened$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.label;
        zy11Var = zy11.a;
        if (i != 0) {
        }
        vprVar = vprVar2;
        chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.L$0 = null;
        chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1.label = 2;
        if (vprVar.emit(zy11Var, chatTranslatorViewController$onChatOpened$$inlined$map$1$2$1) == coroutineSingletons) {
        }
    }
}
