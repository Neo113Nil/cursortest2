package com.ybsdk.common.repositiories.supportchat;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.ChatMetadata;
import com.ybsdk.network.dto.ChatShort;
import com.ybsdk.network.dto.SupportChatResponse;
import defpackage.ny61;
import defpackage.tje;
import defpackage.uza;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public static final String b;
    public final Api a;

    static {
        byte[] bArr = tje.b2;
        byte[] bArr2 = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        b = new String(bArr2, uza.a);
    }

    public a(Api api) {
        this.a = api;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SupportChatRepository$hasUnreadMessages$1 supportChatRepository$hasUnreadMessages$1;
        int i;
        Object c;
        ChatMetadata metadata;
        Integer newMessages;
        if (continuationImpl instanceof SupportChatRepository$hasUnreadMessages$1) {
            supportChatRepository$hasUnreadMessages$1 = (SupportChatRepository$hasUnreadMessages$1) continuationImpl;
            int i2 = supportChatRepository$hasUnreadMessages$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                supportChatRepository$hasUnreadMessages$1.label = i2 - Integer.MIN_VALUE;
                Object obj = supportChatRepository$hasUnreadMessages$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportChatRepository$hasUnreadMessages$1.label;
                if (i != 0) {
                    b.b(obj);
                    SupportChatRepository$hasUnreadMessages$2 supportChatRepository$hasUnreadMessages$2 = new SupportChatRepository$hasUnreadMessages$2(this, null);
                    supportChatRepository$hasUnreadMessages$1.label = 1;
                    c = c.c(supportChatRepository$hasUnreadMessages$2, supportChatRepository$hasUnreadMessages$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                ChatShort chatShort = (ChatShort) kotlin.collections.a.R(((SupportChatResponse) c).getOpened());
                return Boolean.valueOf(((chatShort == null || (metadata = chatShort.getMetadata()) == null || (newMessages = metadata.getNewMessages()) == null) ? 0 : newMessages.intValue()) > 0);
            }
        }
        supportChatRepository$hasUnreadMessages$1 = new SupportChatRepository$hasUnreadMessages$1(this, continuationImpl);
        Object obj2 = supportChatRepository$hasUnreadMessages$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportChatRepository$hasUnreadMessages$1.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }
}
