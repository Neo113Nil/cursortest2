package com.yandex.go.screenshot_screencast_tracker.impl;

import android.net.Uri;
import defpackage.fgp0;
import defpackage.jgp0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri uri, Continuation continuation) {
        ScreenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1 screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1;
        int i;
        Iterator it;
        if (continuation instanceof ScreenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1) {
            screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1 = (ScreenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1) continuation;
            int i2 = screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1.label = i2 - Integer.MIN_VALUE;
                Object obj = screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = ((Iterable) this.a.e.get()).iterator();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1.L$2;
                    uri = (Uri) screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1.L$0;
                    kotlin.b.b(obj);
                }
                while (it.hasNext()) {
                    fgp0 fgp0Var = (fgp0) it.next();
                    screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1.L$0 = uri;
                    screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1.L$1 = null;
                    screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1.L$2 = it;
                    screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1.L$3 = null;
                    screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1.L$4 = null;
                    screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1.label = 1;
                    if (fgp0Var.a(uri, screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1 = new ScreenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1(this, continuation);
        Object obj2 = screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = screenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    @Override // defpackage.vpr
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((jgp0) obj).b(), continuation);
    }
}
