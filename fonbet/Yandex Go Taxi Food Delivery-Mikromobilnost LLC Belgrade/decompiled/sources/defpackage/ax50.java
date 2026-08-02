package defpackage;

import com.yandex.pulse.metrics.NetworkChangeDetector;

/* loaded from: classes8.dex */
public final class ax50 {
    public final NetworkChangeDetector a;
    public boolean b;
    public int c;
    public boolean d;

    public ax50(NetworkChangeDetector networkChangeDetector) {
        this.a = networkChangeDetector;
        int lastConnectionType = networkChangeDetector.getLastConnectionType();
        this.c = lastConnectionType;
        this.d = lastConnectionType != 0;
    }
}
