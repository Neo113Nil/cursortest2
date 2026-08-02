package com.google.android.gms.gcm;

import android.os.Looper;
import android.os.Messenger;
import defpackage.w53;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public class b {
    public static final /* synthetic */ int c = 0;
    public final Map a = Collections.synchronizedMap(new w53());
    public final LinkedBlockingQueue b = new LinkedBlockingQueue();

    static {
        new AtomicInteger(1);
    }

    public b() {
        new Messenger(new zzf(this, Looper.getMainLooper()));
    }
}
