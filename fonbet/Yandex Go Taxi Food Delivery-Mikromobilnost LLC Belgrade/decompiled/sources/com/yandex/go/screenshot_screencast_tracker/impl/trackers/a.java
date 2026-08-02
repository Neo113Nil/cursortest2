package com.yandex.go.screenshot_screencast_tracker.impl.trackers;

import android.net.Uri;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ h a;

    public a(h hVar) {
        this.a = hVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Uri uri = (Uri) ((Pair) obj).getFirst();
        h hVar = this.a;
        hVar.f.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new ScreenshotTracker$start$1$7$1(hVar, uri, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
