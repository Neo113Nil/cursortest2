package yads;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import xsna.aoq0;

/* loaded from: classes10.dex */
public final class ar implements qq0, fu {
    public static final du k = new aoq0(7);
    public static final hh2 l = new hh2();
    public final nq0 b;
    public final int c;
    public final nx0 d;
    public final SparseArray e = new SparseArray();
    public boolean f;
    public eu g;
    public long h;
    public zx2 i;
    public nx0[] j;

    public ar(nq0 nq0Var, int i, nx0 nx0Var) {
        this.b = nq0Var;
        this.c = i;
        this.d = nx0Var;
    }

    @Override // yads.qq0
    public final void a() {
        nx0[] nx0VarArr = new nx0[this.e.size()];
        for (int i = 0; i < this.e.size(); i++) {
            nx0 nx0Var = ((zq) this.e.valueAt(i)).d;
            if (nx0Var == null) {
                throw new IllegalStateException();
            }
            nx0VarArr[i] = nx0Var;
        }
        this.j = nx0VarArr;
    }

    public final hu b() {
        zx2 zx2Var = this.i;
        if (zx2Var instanceof hu) {
            return (hu) zx2Var;
        }
        return null;
    }

    public final void c() {
        this.b.release();
    }

    public final void a(eu euVar, long j, long j2) {
        q83 bl0Var;
        this.g = euVar;
        this.h = j2;
        if (!this.f) {
            this.b.a(this);
            if (j != C.TIME_UNSET) {
                this.b.seek(0L, j);
            }
            this.f = true;
            return;
        }
        nq0 nq0Var = this.b;
        if (j == C.TIME_UNSET) {
            j = 0;
        }
        nq0Var.seek(0L, j);
        for (int i = 0; i < this.e.size(); i++) {
            zq zqVar = (zq) this.e.valueAt(i);
            if (euVar == null) {
                zqVar.e = zqVar.c;
            } else {
                zqVar.f = j2;
                int i2 = zqVar.a;
                lo loVar = (lo) euVar;
                int i3 = 0;
                while (true) {
                    int[] iArr = loVar.a;
                    if (i3 < iArr.length) {
                        if (i2 == iArr[i3]) {
                            bl0Var = loVar.b[i3];
                            break;
                        }
                        i3++;
                    } else {
                        ji1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                        bl0Var = new bl0();
                        break;
                    }
                }
                zqVar.e = bl0Var;
                nx0 nx0Var = zqVar.d;
                if (nx0Var != null) {
                    bl0Var.a(nx0Var);
                }
            }
        }
    }

    public static fu a(int i, nx0 nx0Var, boolean z, List list, q83 q83Var, zf2 zf2Var) {
        nq0 tx0Var;
        String str = nx0Var.l;
        if (iu1.e(str)) {
            return null;
        }
        if (str == null || (!str.startsWith("video/webm") && !str.startsWith(MimeTypes.AUDIO_WEBM) && !str.startsWith(MimeTypes.APPLICATION_WEBM) && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
            tx0Var = new tx0(z ? 4 : 0, list, q83Var);
        } else {
            tx0Var = new ak1(new jd0(), 1);
        }
        return new ar(tx0Var, i, nx0Var);
    }

    @Override // yads.qq0
    public final void a(zx2 zx2Var) {
        this.i = zx2Var;
    }

    @Override // yads.qq0
    public final q83 a(int i, int i2) {
        q83 bl0Var;
        zq zqVar = (zq) this.e.get(i);
        if (zqVar != null) {
            return zqVar;
        }
        if (this.j == null) {
            zq zqVar2 = new zq(i, i2, i2 == this.c ? this.d : null);
            eu euVar = this.g;
            long j = this.h;
            if (euVar == null) {
                zqVar2.e = zqVar2.c;
            } else {
                zqVar2.f = j;
                lo loVar = (lo) euVar;
                int i3 = 0;
                while (true) {
                    int[] iArr = loVar.a;
                    if (i3 < iArr.length) {
                        if (i2 == iArr[i3]) {
                            bl0Var = loVar.b[i3];
                            break;
                        }
                        i3++;
                    } else {
                        ji1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                        bl0Var = new bl0();
                        break;
                    }
                }
                zqVar2.e = bl0Var;
                nx0 nx0Var = zqVar2.d;
                if (nx0Var != null) {
                    bl0Var.a(nx0Var);
                }
            }
            this.e.put(i, zqVar2);
            return zqVar2;
        }
        throw new IllegalStateException();
    }
}
