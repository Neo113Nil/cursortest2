package androidx.core.app;

import android.app.Notification;
import android.graphics.drawable.Icon;
import defpackage.ny61;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class i0 {
    public static void a(Notification.ProgressStyle progressStyle, int i) {
        progressStyle.setProgress(i);
    }

    public static void b(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    public static void c(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setProgressIndeterminate(z);
    }

    public static void d(Notification.ProgressStyle progressStyle, List<Object> list) {
        Iterator<Object> it = list.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                throw null;
            }
            ny61.u();
        }
    }

    public static void e(Notification.ProgressStyle progressStyle, List<j0> list) {
        for (j0 j0Var : list) {
            progressStyle.addProgressSegment(new Notification.ProgressStyle.Segment(j0Var.a).setColor(j0Var.b).setId(0));
        }
    }

    public static void f(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    public static void g(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    public static void h(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setStyledByProgress(z);
    }
}
