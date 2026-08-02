package ru.mail.libverify.l0;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public final class d {
    private final AtomicReference<b> a = new AtomicReference<>(b.UNKNOWN);

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.HAS_INSTALLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.INITIALIZING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.NO_INSTALLATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.RESETTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        UNKNOWN,
        NO_INSTALLATION,
        INITIALIZING,
        RESETTING,
        HAS_INSTALLATION
    }

    public final boolean a(@NonNull File file) {
        b bVar = this.a.get();
        FileLog.v("InstallationHelper", "state %s", this.a);
        int i = a.a[bVar.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return true;
            }
            if (i == 4 || i == 5) {
                return false;
            }
            throw new IllegalStateException("Undefined state");
        }
        try {
            if (file.exists()) {
                AtomicReference<b> atomicReference = this.a;
                b bVar2 = b.UNKNOWN;
                b bVar3 = b.HAS_INSTALLATION;
                while (!atomicReference.compareAndSet(bVar2, bVar3) && atomicReference.get() == bVar2) {
                }
                return true;
            }
            AtomicReference<b> atomicReference2 = this.a;
            b bVar4 = b.UNKNOWN;
            b bVar5 = b.NO_INSTALLATION;
            while (!atomicReference2.compareAndSet(bVar4, bVar5) && atomicReference2.get() == bVar4) {
            }
            return false;
        } catch (Throwable th) {
            FileLog.e("InstallationHelper", "failed to check installation file", th);
            return false;
        }
    }

    public final void a(@NonNull b bVar) {
        this.a.set(bVar);
    }
}
