package defpackage;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.yandex.go.yb.domain.u;
import okio.ByteString;

/* loaded from: classes.dex */
public final class jpb implements quu, iy60 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public jpb(ByteString byteString) {
        this.a = 1;
        this.c = byteString;
        this.b = byteString.h();
    }

    @Override // defpackage.quu
    public void a(oq6 oq6Var) {
        oq6Var.N0((ByteString) this.c);
    }

    public void b(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        jpb jpbVar = (jpb) this.c;
        if (jpbVar != null) {
            jpbVar.b(i - 64);
        }
    }

    public int c(int i) {
        jpb jpbVar = (jpb) this.c;
        if (jpbVar == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + jpbVar.c(i - 64);
    }

    public void d() {
        if (((jpb) this.c) == null) {
            this.c = new jpb();
        }
    }

    public boolean e(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        d();
        return ((jpb) this.c).e(i - 64);
    }

    public void f(int i, boolean z) {
        if (i >= 64) {
            d();
            ((jpb) this.c).f(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            i(i);
        } else {
            b(i);
        }
        if (z2 || ((jpb) this.c) != null) {
            d();
            ((jpb) this.c).f(0, z2);
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            d();
            return ((jpb) this.c).g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        jpb jpbVar = (jpb) this.c;
        if (jpbVar != null) {
            if (jpbVar.e(0)) {
                i(63);
            }
            ((jpb) this.c).g(0);
        }
        return z;
    }

    @Override // defpackage.quu
    public long getContentLength() {
        return this.b;
    }

    @Override // defpackage.quu
    public String getContentType() {
        return "application/json";
    }

    public void h() {
        this.b = 0L;
        jpb jpbVar = (jpb) this.c;
        if (jpbVar != null) {
            jpbVar.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            d();
            ((jpb) this.c).i(i - 64);
        }
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        ConnectionResult connectionResult;
        eh91 eh91Var = (eh91) this.c;
        long j = this.b;
        Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
        if ((exc instanceof ApiException) && (connectionResult = ((ApiException) exc).a().getConnectionResult()) != null && connectionResult.getErrorCode() == 24) {
            eh91Var.b.set(j);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((jpb) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((jpb) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jpb(eh91 eh91Var, long j) {
        this.a = 6;
        this.c = eh91Var;
        this.b = j;
    }

    public jpb(kl40 kl40Var) {
        this.a = 7;
        cvw.l(kl40Var);
        this.c = kl40Var;
    }

    public jpb(jci0 jci0Var) {
        this.a = 4;
        this.c = jci0Var;
        this.b = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public jpb(u uVar) {
        this.a = 2;
        this.b = SystemClock.uptimeMillis();
        this.c = uVar;
    }

    public /* synthetic */ jpb(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    public jpb() {
        this.a = 0;
        this.b = 0L;
    }
}
