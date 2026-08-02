package xsna;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: UploadCompressStrategy.kt */
/* loaded from: classes6.dex */
public abstract class kaq0 {
    public static final AtomicInteger b = new AtomicInteger();
    public final int a = b.getAndIncrement() % 10;
}
