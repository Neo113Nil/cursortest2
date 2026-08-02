package defpackage;

import android.os.SystemClock;

/* loaded from: classes10.dex */
public class dl40 implements el40 {
    public final long a;
    public long b;

    public /* synthetic */ dl40(int i) {
        this(300L);
    }

    @Override // defpackage.el40
    public final long getLastClickOnItemTimestamp() {
        return this.b;
    }

    @Override // defpackage.el40
    public boolean satisfiesClickDelay() {
        return SystemClock.uptimeMillis() - this.b >= this.a;
    }

    @Override // defpackage.el40
    public final void updateLastClickOnItemTimestamp() {
        this.b = SystemClock.uptimeMillis();
    }

    public dl40() {
        this(0);
    }

    public dl40(long j) {
        this.a = j;
    }
}
