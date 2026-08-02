package com.yandex.messaging.internal.chat.domain;

import android.text.TextUtils;
import com.yandex.messaging.MessengerEnvironment;
import defpackage.clb1;
import defpackage.hww;
import defpackage.k4b;
import defpackage.ny61;
import defpackage.p220;
import defpackage.q220;
import defpackage.r1s;
import defpackage.vpr;
import defpackage.z83;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public b(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetChatLinkUseCase$run$$inlined$map$1$2$1 getChatLinkUseCase$run$$inlined$map$1$2$1;
        int i;
        String str;
        k4b k4bVar;
        if (continuation instanceof GetChatLinkUseCase$run$$inlined$map$1$2$1) {
            getChatLinkUseCase$run$$inlined$map$1$2$1 = (GetChatLinkUseCase$run$$inlined$map$1$2$1) continuation;
            int i2 = getChatLinkUseCase$run$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getChatLinkUseCase$run$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getChatLinkUseCase$run$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getChatLinkUseCase$run$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    hww hwwVar = (hww) obj;
                    if (hwwVar != null) {
                        r1s r1sVar = this.b.f;
                        String str2 = hwwVar.c;
                        String str3 = hwwVar.d;
                        r1sVar.getClass();
                        TextUtils.isEmpty(str2);
                        z83.i();
                        p220 p220Var = (p220) r1sVar.b;
                        MessengerEnvironment messengerEnvironment = (MessengerEnvironment) r1sVar.w;
                        String a = p220Var.a(messengerEnvironment);
                        if (a != null) {
                            boolean isEmpty = TextUtils.isEmpty(str3);
                            q220 q220Var = (q220) r1sVar.c;
                            if (isEmpty) {
                                q220Var.getClass();
                                str = String.format(clb1.d(messengerEnvironment) ? "https://%s/#/join/%s" : "https://%s/chat/#/join/%s", Arrays.copyOf(new Object[]{a, str2}, 2));
                            } else {
                                q220Var.getClass();
                                str = String.format("https://%s/chat/#/c/%s", Arrays.copyOf(new Object[]{a, str3}, 2));
                            }
                            k4bVar = str != null ? new k4b(hwwVar.b, str) : null;
                            getChatLinkUseCase$run$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(k4bVar, getChatLinkUseCase$run$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    str = null;
                    if (str != null) {
                    }
                    getChatLinkUseCase$run$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(k4bVar, getChatLinkUseCase$run$$inlined$map$1$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        getChatLinkUseCase$run$$inlined$map$1$2$1 = new GetChatLinkUseCase$run$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getChatLinkUseCase$run$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getChatLinkUseCase$run$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
