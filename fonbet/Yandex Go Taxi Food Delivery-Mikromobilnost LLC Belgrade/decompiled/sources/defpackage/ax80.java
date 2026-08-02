package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import com.yandex.messaging.internal.entities.EmptyMessageData;
import com.yandex.messaging.internal.entities.ForwardMessageRef;
import com.yandex.messaging.internal.entities.MediaMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.TextMessageData;
import java.util.List;
import java.util.UUID;

/* loaded from: classes15.dex */
public final class ax80 {
    public static yw80 a(ax80 ax80Var, yw80 yw80Var, List list, g720 g720Var, boolean z) {
        boolean z2 = yw80Var.j;
        ax80Var.getClass();
        MessageData messageData = yw80Var.b;
        z83.h(null, messageData instanceof MediaMessageData);
        return new yw80(yw80Var.a, (MessageData) ((MediaMessageData) messageData).a(new zw80(list)), yw80Var.c, null, null, yw80Var.f, yw80Var.g, g720Var, z, z2, null, yw80Var.l);
    }

    public static yw80 b(MessageData messageData, uw80[] uw80VarArr, ForwardMessageRef[] forwardMessageRefArr, g720 g720Var, boolean z, boolean z2, String[] strArr, CustomPayload customPayload, String str) {
        String uuid = UUID.randomUUID().toString();
        tje.e();
        return new yw80(uuid, messageData, customPayload, uw80VarArr, null, strArr, forwardMessageRefArr, g720Var, z, z2, null, str);
    }

    public static yw80 c(osa0 osa0Var) {
        String str = osa0Var.c;
        MessageData messageData = osa0Var.f;
        CustomPayload customPayload = osa0Var.l;
        uw80[] a = osa0Var.a();
        String str2 = osa0Var.k;
        String[] strArr = osa0Var.m;
        ForwardMessageRef[] forwardMessageRefArr = osa0Var.p;
        int i = g720.c;
        return new yw80(str, messageData, customPayload, a, str2, strArr, forwardMessageRefArr, glb1.b(osa0Var.o), osa0Var.q, osa0Var.s, osa0Var.r, osa0Var.t);
    }

    public static yw80 d(String str, boolean z, String[] strArr, ForwardMessageRef[] forwardMessageRefArr, g720 g720Var, boolean z2, boolean z3, CustomPayload customPayload, String str2, String str3) {
        tje.e();
        if ((str == null || str.length() == 0) && (forwardMessageRefArr == null || forwardMessageRefArr.length == 0)) {
            return null;
        }
        MessageData emptyMessageData = (str == null || str.length() == 0) ? new EmptyMessageData() : new TextMessageData(0, str);
        if (z) {
            emptyMessageData.urlPreviewDisabled = Boolean.TRUE;
        }
        String uuid = UUID.randomUUID().toString();
        tje.e();
        return new yw80(uuid, emptyMessageData, customPayload, null, null, strArr, forwardMessageRefArr, g720Var, z2, z3, str2, str3);
    }

    public static yw80 e(ax80 ax80Var, TextMessageData textMessageData, CustomPayload customPayload, String[] strArr, ForwardMessageRef[] forwardMessageRefArr, g720 g720Var, boolean z, String str) {
        ax80Var.getClass();
        String uuid = UUID.randomUUID().toString();
        tje.e();
        return new yw80(uuid, textMessageData, customPayload, null, null, strArr, forwardMessageRefArr, g720Var, z, false, null, str);
    }

    public static yw80 f(TextMessageData textMessageData, g720 g720Var, Object obj) {
        CustomPayload customPayload;
        if (obj != null) {
            customPayload = new CustomPayload();
            customPayload.setCallbackData(obj);
        } else {
            customPayload = null;
        }
        CustomPayload customPayload2 = customPayload;
        String uuid = UUID.randomUUID().toString();
        tje.e();
        return new yw80(uuid, textMessageData, customPayload2, null, null, null, null, g720Var, false, false, null, null);
    }
}
