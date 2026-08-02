package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import xsna.fi20;
import xsna.ni20;

/* compiled from: MetadataRenderer.java */
/* loaded from: classes12.dex */
public final class wi20 extends androidx.media3.exoplayer.a implements Handler.Callback {
    public long A;

    @Nullable
    public fi20 B;
    public long C;
    public final ni20.a t;
    public final ui20 u;

    @Nullable
    public final Handler v;
    public final qi20 w;

    @Nullable
    public b920 x;
    public boolean y;
    public boolean z;

    public wi20(ui20 ui20Var, @Nullable Looper looper) {
        super(5);
        this.u = ui20Var;
        this.v = looper == null ? null : new Handler(looper, this);
        this.t = ni20.a;
        this.w = new qi20(1);
        this.C = C.TIME_UNSET;
    }

    public final void C(fi20 fi20Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            fi20.a[] aVarArr = fi20Var.a;
            if (i >= aVarArr.length) {
                return;
            }
            androidx.media3.common.a b = aVarArr[i].b();
            if (b != null) {
                ni20.a aVar = this.t;
                if (aVar.b(b)) {
                    b920 a = aVar.a(b);
                    byte[] a2 = aVarArr[i].a();
                    a2.getClass();
                    qi20 qi20Var = this.w;
                    qi20Var.c();
                    qi20Var.e(a2.length);
                    ByteBuffer byteBuffer = qi20Var.e;
                    String str = y2r0.a;
                    byteBuffer.put(a2);
                    qi20Var.h();
                    fi20 j = a.j(qi20Var);
                    if (j != null) {
                        C(j, arrayList);
                    }
                    i++;
                }
            }
            arrayList.add(aVarArr[i]);
            i++;
        }
    }

    public final long D(long j) {
        fxc0.z(j != C.TIME_UNSET);
        fxc0.z(this.C != C.TIME_UNSET);
        return j - this.C;
    }

    @Override // androidx.media3.exoplayer.k
    public final int a(androidx.media3.common.a aVar) {
        if (this.t.b(aVar)) {
            return androidx.media3.exoplayer.k.f(aVar.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return androidx.media3.exoplayer.k.f(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.j, androidx.media3.exoplayer.k
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        this.u.k((fi20) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.j
    public final boolean isEnded() {
        return this.z;
    }

    @Override // androidx.media3.exoplayer.j
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.j
    public final void render(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.y && this.B == null) {
                qi20 qi20Var = this.w;
                qi20Var.c();
                w8s w8sVar = this.d;
                w8sVar.a();
                int B = B(w8sVar, qi20Var, 0);
                if (B == -4) {
                    if (qi20Var.b(4)) {
                        this.y = true;
                    } else if (qi20Var.g >= this.m) {
                        qi20Var.j = this.A;
                        qi20Var.h();
                        b920 b920Var = this.x;
                        String str = y2r0.a;
                        fi20 j3 = b920Var.j(qi20Var);
                        if (j3 != null) {
                            ArrayList arrayList = new ArrayList(j3.a.length);
                            C(j3, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.B = new fi20(D(qi20Var.g), (fi20.a[]) arrayList.toArray(new fi20.a[0]));
                            }
                        }
                    }
                } else if (B == -5) {
                    androidx.media3.common.a aVar = w8sVar.b;
                    aVar.getClass();
                    this.A = aVar.s;
                }
            }
            fi20 fi20Var = this.B;
            if (fi20Var == null || fi20Var.b > D(j)) {
                z = false;
            } else {
                fi20 fi20Var2 = this.B;
                Handler handler = this.v;
                if (handler != null) {
                    handler.obtainMessage(1, fi20Var2).sendToTarget();
                } else {
                    this.u.k(fi20Var2);
                }
                this.B = null;
                z = true;
            }
            if (this.y && this.B == null) {
                this.z = true;
            }
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void s() {
        this.B = null;
        this.x = null;
        this.C = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.a
    public final void u(long j, boolean z, boolean z2) {
        this.B = null;
        this.y = false;
        this.z = false;
    }

    @Override // androidx.media3.exoplayer.a
    public final void z(androidx.media3.common.a[] aVarArr, long j, long j2, i.b bVar) {
        this.x = this.t.a(aVarArr[0]);
        fi20 fi20Var = this.B;
        if (fi20Var != null) {
            long j3 = fi20Var.b;
            long j4 = (this.C + j3) - j2;
            if (j3 != j4) {
                fi20Var = new fi20(j4, fi20Var.a);
            }
            this.B = fi20Var;
        }
        this.C = j2;
    }
}
