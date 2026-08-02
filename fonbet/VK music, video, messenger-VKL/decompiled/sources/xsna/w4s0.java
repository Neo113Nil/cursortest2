package xsna;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.vk.core.apps.BuildInfo;
import com.vk.libvideo.autoplay.background.service.VideoBackgroundService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VideoBackgroundServiceConnection.kt */
/* loaded from: classes2.dex */
public final class w4s0 extends com.vk.core.service.a<VideoBackgroundService> {
    public final p69 i;
    public final CopyOnWriteArraySet<y4s0> j;
    public final b k;
    public Integer l;
    public Notification m;
    public boolean n;

    /* compiled from: VideoBackgroundServiceConnection.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            boolean z;
            w4s0 w4s0Var = (w4s0) this.receiver;
            w4s0Var.getClass();
            if (Build.VERSION.SDK_INT >= 31) {
                c63 c63Var = c63.a;
                if (!c63.f && w4s0Var.e() == null) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: VideoBackgroundServiceConnection.kt */
    public static final class b implements y4s0 {
        public b() {
        }

        @Override // xsna.y4s0
        public final void onTaskRemoved() {
            Iterator<T> it = w4s0.this.j.iterator();
            while (it.hasNext()) {
                ((y4s0) it.next()).onTaskRemoved();
            }
        }
    }

    public w4s0() {
        super(null, BuildInfo.q());
        this.i = new p69(this, 11);
        this.j = new CopyOnWriteArraySet<>();
        this.k = new b();
    }

    @Override // com.vk.core.service.a
    public final Intent b() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new Intent(context, (Class<?>) VideoBackgroundService.class);
    }

    @Override // com.vk.core.service.a
    public final Intent c() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new Intent(context, (Class<?>) VideoBackgroundService.class);
    }

    @Override // com.vk.core.service.a
    public final Class<VideoBackgroundService> f() {
        return VideoBackgroundService.class;
    }

    @Override // com.vk.core.service.a
    public final void g() {
        VideoBackgroundService e = e();
        Integer num = this.l;
        Notification notification = this.m;
        if (e == null || num == null || notification == null) {
            return;
        }
        this.l = null;
        this.m = null;
        boolean l = e.l(num.intValue(), notification, new a(0, this, w4s0.class, "canShowNotification", "canShowNotification()Z", 0));
        this.n = l;
        if (l) {
            e.e = this.k;
        }
    }

    @Override // com.vk.core.service.a
    public final void i() {
        this.l = null;
        this.m = null;
    }

    public final void j(boolean z) {
        VideoBackgroundService e = e();
        if (e != null) {
            e.k();
            e.stopForeground(z);
        }
        VideoBackgroundService e2 = e();
        if (e2 != null) {
            e2.e = null;
        }
        if (z) {
            this.n = false;
            p69 p69Var = this.i;
            pro0.d(p69Var);
            i0q0.d(3000L, p69Var);
        }
    }
}
