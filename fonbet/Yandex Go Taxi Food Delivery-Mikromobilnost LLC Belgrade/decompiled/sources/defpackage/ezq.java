package defpackage;

import com.yandex.messaging.activity.MessengerRequestCode;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.mediaviewer.DocViewerArgs;
import com.yandex.messaging.mediaviewer.MediaViewerInfo;
import com.yandex.messaging.mediaviewer.MediaViewerMessageActions;
import com.yandex.messaging.mediaviewer.VideoViewerArgs;

/* loaded from: classes15.dex */
public final class ezq {
    public final sfl0 a;
    public final zg10 b;

    public ezq(sfl0 sfl0Var, zg10 zg10Var) {
        this.a = sfl0Var;
        this.b = zg10Var;
    }

    public static void a(ezq ezqVar, LocalMessageRef localMessageRef, j3b j3bVar, String str, String str2, String str3, Integer num, MediaViewerMessageActions mediaViewerMessageActions, sls slsVar) {
        MessengerRequestCode messengerRequestCode = MessengerRequestCode.CAMERA;
        sfl0 sfl0Var = ezqVar.a;
        zg10 zg10Var = ezqVar.b;
        if (j3bVar == null || str3 == null || num == null) {
            slsVar.invoke();
            return;
        }
        if (zg10Var.b(j3bVar, str3, num.intValue())) {
            new VideoViewerArgs(new MediaViewerInfo(str, str2, localMessageRef, j3bVar.b, str3, num, null), mediaViewerMessageActions);
            sfl0Var.getClass();
        } else if (!zg10Var.a(j3bVar, str3, num.intValue())) {
            slsVar.invoke();
        } else {
            new DocViewerArgs(new MediaViewerInfo(str, str2, localMessageRef, j3bVar.b, str3, num, null), mediaViewerMessageActions);
            sfl0Var.getClass();
        }
    }
}
