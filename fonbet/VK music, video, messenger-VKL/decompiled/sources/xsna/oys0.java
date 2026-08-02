package xsna;

import android.content.Context;
import com.vk.libvideo.autoplay.background.notification.VideoNotificationAction;
import java.util.ArrayList;

/* compiled from: VideoNotificationFactory.kt */
/* loaded from: classes2.dex */
public final class oys0 {
    public final Context a;

    public oys0(Context context) {
        this.a = context;
    }

    public static ArrayList a(xss0 xss0Var) {
        int i = xss0Var.b;
        ArrayList arrayList = new ArrayList();
        if (xss0Var.a(8L) && i == 7) {
            arrayList.add(VideoNotificationAction.SEEK_BACKWARD_DISABLED);
        } else if (xss0Var.a(8L)) {
            arrayList.add(VideoNotificationAction.SEEK_BACKWARD);
        }
        if (xss0Var.a(2L) && i == 6) {
            arrayList.add(VideoNotificationAction.PAUSE);
        } else if (xss0Var.a(2L) && i == 3) {
            arrayList.add(VideoNotificationAction.PAUSE);
        } else if (xss0Var.a(4L) && xss0Var.b()) {
            arrayList.add(VideoNotificationAction.REPLAY);
        } else if (xss0Var.a(4L) && i == 7) {
            arrayList.add(VideoNotificationAction.PLAY);
        } else if (xss0Var.a(4L) && i == 2) {
            arrayList.add(VideoNotificationAction.PLAY);
        }
        if (xss0Var.a(64L) && xss0Var.b()) {
            arrayList.add(VideoNotificationAction.SEEK_FORWARD_DISABLED);
        } else if (xss0Var.a(64L) && i == 7) {
            arrayList.add(VideoNotificationAction.SEEK_FORWARD_DISABLED);
        } else if (xss0Var.a(64L)) {
            arrayList.add(VideoNotificationAction.SEEK_FORWARD);
        }
        arrayList.add(VideoNotificationAction.CLOSE);
        return arrayList;
    }
}
