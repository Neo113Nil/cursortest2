package com.yandex.go.screenshot_screencast_tracker.impl.trackers;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Process;
import android.provider.MediaStore;
import defpackage.ate0;
import defpackage.csf0;
import defpackage.czo0;
import defpackage.ffx;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hst;
import defpackage.i3y;
import defpackage.jgp0;
import defpackage.jst;
import defpackage.jx81;
import defpackage.ngp0;
import defpackage.tt2;
import defpackage.uyj;
import java.util.Objects;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class h {
    public final Context a;
    public final Activity b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final tt2 f;
    public final hbp0 g = new hbp0(new czo0(14), "ScreenshotTracker", null);
    public final n0 h;
    public final n0 i;
    public final i3y j;

    public h(Context context, Activity activity, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, tt2 tt2Var) {
        this.a = context;
        this.b = activity;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = h3yVar3;
        this.f = tt2Var;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.h = ffx.b(0, 1, bufferOverflow);
        this.i = ffx.b(0, 1, bufferOverflow);
        this.j = kotlin.a.b(LazyThreadSafetyMode.NONE, new csf0(22, this));
    }

    public static final void a(h hVar, Uri uri) {
        hVar.getClass();
        hst hstVar = jst.e;
        Objects.toString(uri);
        hstVar.getClass();
        ((ngp0) hVar.d.get()).a(((com.yandex.go.navigation.screen.c) hVar.e.get()).b());
        hVar.i.g(jgp0.a(uri));
    }

    public final void b() {
        Context context = this.a;
        context.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, (ScreenshotTracker$contentObserver$2$1) this.j.getValue());
        hbp0 hbp0Var = this.g;
        hbp0Var.a();
        if (jx81.g()) {
            if (context.checkPermission("android.permission.DETECT_SCREEN_CAPTURE", Process.myPid(), Process.myUid()) == 0) {
                kotlinx.coroutines.flow.b g = kotlinx.coroutines.flow.e.g(new ScreenshotTracker$start$$inlined$simpleCallbackApiToFlow$1(new ate0(10, this), null));
                this.f.getClass();
                com.yandex.go.coroutines.b.g(hbp0Var, uyj.a, null, new ScreenshotTracker$start$1(g, this, null), 2);
                return;
            }
            jst.e.h("ScreenshotTracker", "No DETECT_SCREEN_CAPTURE permission for Android 15+", new IllegalStateException());
        }
        com.yandex.go.coroutines.b.g(hbp0Var, null, null, new ScreenshotTracker$start$2(this, null), 3);
    }
}
