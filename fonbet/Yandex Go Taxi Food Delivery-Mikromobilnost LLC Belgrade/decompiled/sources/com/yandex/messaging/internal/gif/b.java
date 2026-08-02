package com.yandex.messaging.internal.gif;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.aht;
import defpackage.aj10;
import defpackage.che0;
import defpackage.g3r;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rgt;
import defpackage.szt0;
import defpackage.tse;
import defpackage.vgt;
import defpackage.vqc;
import defpackage.wpb1;
import defpackage.xgt;
import defpackage.ydz;
import defpackage.z83;
import defpackage.zy11;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b implements aht {
    public final Context a;
    public final tse b;
    public final vgt c;
    public final int d;
    public final int e;
    public final szt0 f;
    public final boolean g;
    public boolean h;
    public che0 i;
    public Bitmap j;
    public final int k;
    public final int l;
    public pzt0 m;

    public b(Context context, File file, tse tseVar, long j) {
        this.a = context;
        this.b = tseVar;
        ByteBuffer wrap = ByteBuffer.wrap(g3r.c(file));
        vgt b = new xgt().b(wrap);
        this.c = b;
        int i = b.f * b.g;
        this.d = i;
        this.e = b(b, j);
        szt0 szt0Var = new szt0(b);
        if (i <= 8294400) {
            int b2 = b(b, j);
            synchronized (szt0Var) {
                try {
                    if (b2 <= 0) {
                        throw new IllegalArgumentException("Sample size must be >=0, not: " + b2);
                    }
                    int highestOneBit = Integer.highestOneBit(b2);
                    szt0Var.o = 0;
                    szt0Var.j = -1;
                    ByteBuffer asReadOnlyBuffer = wrap.asReadOnlyBuffer();
                    szt0Var.c = asReadOnlyBuffer;
                    asReadOnlyBuffer.position(0);
                    szt0Var.c.order(ByteOrder.LITTLE_ENDIAN);
                    szt0Var.n = false;
                    Iterator it = szt0Var.k.e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((rgt) it.next()).g == 3) {
                            szt0Var.n = true;
                            break;
                        }
                    }
                    szt0Var.p = highestOneBit;
                    vgt vgtVar = szt0Var.k;
                    int i2 = vgtVar.f;
                    int i3 = i2 / highestOneBit;
                    szt0Var.r = i3;
                    int i4 = vgtVar.g;
                    int i5 = i4 / highestOneBit;
                    szt0Var.q = i5;
                    szt0Var.h = new byte[i2 * i4];
                    szt0Var.i = new int[i3 * i5];
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        szt0Var.t = Bitmap.Config.ARGB_8888;
        this.f = szt0Var;
        this.g = true;
        this.h = true;
        vgt vgtVar2 = this.c;
        this.k = vgtVar2.f;
        this.l = vgtVar2.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, ContinuationImpl continuationImpl) {
        PrecachingGifWrapper$awaitAvailableMemory$1 precachingGifWrapper$awaitAvailableMemory$1;
        int i;
        long j;
        bVar.getClass();
        if (continuationImpl instanceof PrecachingGifWrapper$awaitAvailableMemory$1) {
            precachingGifWrapper$awaitAvailableMemory$1 = (PrecachingGifWrapper$awaitAvailableMemory$1) continuationImpl;
            int i2 = precachingGifWrapper$awaitAvailableMemory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                precachingGifWrapper$awaitAvailableMemory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = precachingGifWrapper$awaitAvailableMemory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = precachingGifWrapper$awaitAvailableMemory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    szt0 szt0Var = bVar.f;
                    j = (int) (szt0Var.r * szt0Var.q * szt0Var.k.c * 1.2f);
                    if (ydz.a.a()) {
                        ydz.a();
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = precachingGifWrapper$awaitAvailableMemory$1.J$0;
                    bVar = (b) precachingGifWrapper$awaitAvailableMemory$1.L$0;
                    kotlin.b.b(obj);
                }
                while (kotlinx.coroutines.a.p(precachingGifWrapper$awaitAvailableMemory$1.get_context())) {
                    ActivityManager.MemoryInfo memoryInfo = aj10.a;
                    Context context = bVar.a;
                    ActivityManager.MemoryInfo memoryInfo2 = aj10.a;
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
                    if (!memoryInfo2.lowMemory && (memoryInfo2.availMem - memoryInfo2.threshold) - PlaybackStateCompat.ACTION_PREPARE_FROM_URI >= j) {
                        break;
                    }
                    long a = vqc.a(0, 0, 200, 7);
                    precachingGifWrapper$awaitAvailableMemory$1.L$0 = bVar;
                    precachingGifWrapper$awaitAvailableMemory$1.J$0 = j;
                    precachingGifWrapper$awaitAvailableMemory$1.label = 1;
                    if (wpb1.h(a, precachingGifWrapper$awaitAvailableMemory$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        precachingGifWrapper$awaitAvailableMemory$1 = new PrecachingGifWrapper$awaitAvailableMemory$1(bVar, continuationImpl);
        Object obj2 = precachingGifWrapper$awaitAvailableMemory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = precachingGifWrapper$awaitAvailableMemory$1.label;
        if (i != 0) {
        }
        while (kotlinx.coroutines.a.p(precachingGifWrapper$awaitAvailableMemory$1.get_context())) {
        }
        return zy11.a;
    }

    public static int b(vgt vgtVar, long j) {
        if (j <= 0) {
            z83.i();
            return 10;
        }
        int i = vgtVar.f * vgtVar.g * vgtVar.c;
        if (ydz.a.a()) {
            ydz.a();
        }
        long j2 = i;
        if (j2 <= j) {
            return 1;
        }
        return Math.max(1, ((int) (j2 / j)) + 1);
    }
}
