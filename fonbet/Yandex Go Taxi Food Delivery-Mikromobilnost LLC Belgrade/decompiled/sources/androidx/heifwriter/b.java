package androidx.heifwriter;

/* loaded from: classes10.dex */
public final class b {
    public final boolean a;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;
    public boolean g;
    public final /* synthetic */ HeifEncoder h;

    public b(HeifEncoder heifEncoder, boolean z) {
        this.h = heifEncoder;
        this.a = z;
    }

    public final void a() {
        if (this.g) {
            return;
        }
        long j = this.d;
        HeifEncoder heifEncoder = this.h;
        if (j < 0) {
            long j2 = this.b;
            if (j2 >= 0 && this.c >= j2) {
                long j3 = this.e;
                if (j3 < 0) {
                    heifEncoder.mHandler.post(new a(this));
                    this.g = true;
                    return;
                }
                this.d = j3;
            }
        }
        long j4 = this.d;
        if (j4 < 0 || j4 > this.f) {
            return;
        }
        heifEncoder.mHandler.post(new a(this));
        this.g = true;
    }

    public final synchronized void b(long j) {
        try {
            if (this.a) {
                if (this.b < 0) {
                    this.b = j;
                }
            } else if (this.d < 0) {
                this.d = j / 1000;
            }
            a();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:3:0x0001, B:10:0x0013, B:11:0x0018), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean c(long j, long j2) {
        boolean z;
        try {
            long j3 = this.b;
            if (j3 >= 0 && j > j3) {
                z = false;
                if (z) {
                    this.e = j2;
                }
                this.c = j;
                a();
            }
            z = true;
            if (z) {
            }
            this.c = j;
            a();
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }
}
