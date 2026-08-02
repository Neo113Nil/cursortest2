package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.a;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class hjl0 implements xe10 {
    public final iil0 A;
    public we10 B;
    public ImmutableList C;
    public IOException D;
    public RtspMediaSource$RtspPlaybackException E;
    public long F;
    public long G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public boolean O;
    public final au1 a;
    public final Handler b = tw21.n(null);
    public final ngg c;
    public final bjl0 w;
    public final ArrayList x;
    public final ArrayList y;
    public final ndl0 z;

    public hjl0(au1 au1Var, iil0 iil0Var, Uri uri, ndl0 ndl0Var, String str, SocketFactory socketFactory) {
        this.a = au1Var;
        this.A = iil0Var;
        this.z = ndl0Var;
        ngg nggVar = new ngg(1, this);
        this.c = nggVar;
        this.w = new bjl0(nggVar, nggVar, str, uri, socketFactory);
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.G = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.H = -9223372036854775807L;
    }

    public static void a(hjl0 hjl0Var) {
        ArrayList arrayList = hjl0Var.x;
        hjl0Var.I = true;
        for (int i = 0; i < arrayList.size(); i++) {
            hjl0Var.I &= ((gjl0) arrayList.get(i)).d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(hjl0 hjl0Var) {
        ArrayList arrayList = hjl0Var.x;
        if (hjl0Var.K || hjl0Var.L) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((gjl0) arrayList.get(i)).c.s() == null) {
                return;
            }
        }
        hjl0Var.L = true;
        ImmutableList l = ImmutableList.l(arrayList);
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i2 = 0; i2 < l.size(); i2++) {
            uyl0 uyl0Var = ((gjl0) l.get(i2)).c;
            String num = Integer.toString(i2);
            a s = uyl0Var.s();
            s.getClass();
            aVar.a(new xzz0(num, s));
        }
        hjl0Var.C = aVar.g();
        we10 we10Var = hjl0Var.B;
        we10Var.getClass();
        we10Var.onPrepared(hjl0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(hjl0 hjl0Var) {
        ArrayList arrayList = hjl0Var.y;
        ArrayList arrayList2 = hjl0Var.x;
        hjl0Var.O = true;
        bjl0 bjl0Var = hjl0Var.w;
        bjl0Var.getClass();
        try {
            bjl0Var.close();
            njl0 njl0Var = new njl0(new o8g0(bjl0Var));
            bjl0Var.B = njl0Var;
            njl0Var.a(bjl0Var.d(bjl0Var.A));
            bjl0Var.D = null;
            bjl0Var.J = false;
            bjl0Var.G = null;
        } catch (IOException e) {
            bjl0Var.b.c(new RtspMediaSource$RtspPlaybackException(e));
        }
        iil0 d = hjl0Var.A.d();
        if (d == null) {
            hjl0Var.E = new RtspMediaSource$RtspPlaybackException("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList2.size(); i++) {
            gjl0 gjl0Var = (gjl0) arrayList2.get(i);
            boolean z = gjl0Var.d;
            fjl0 fjl0Var = gjl0Var.a;
            if (z) {
                arrayList3.add(gjl0Var);
            } else {
                gjl0 gjl0Var2 = new gjl0(hjl0Var, fjl0Var.a, i, d);
                arrayList3.add(gjl0Var2);
                fjl0 fjl0Var2 = gjl0Var2.a;
                gjl0Var2.b.g(fjl0Var2.b, hjl0Var.c, 0);
                if (arrayList.contains(fjl0Var)) {
                    arrayList4.add(fjl0Var2);
                }
            }
        }
        ImmutableList l = ImmutableList.l(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        arrayList.clear();
        arrayList.addAll(arrayList4);
        for (int i2 = 0; i2 < l.size(); i2++) {
            ((gjl0) l.get(i2)).a();
        }
    }

    @Override // defpackage.xe10
    public final long c(long j, g7q0 g7q0Var) {
        return j;
    }

    @Override // defpackage.xe10
    public final long e(long j) {
        if (g() == 0 && !this.O) {
            this.H = j;
            return j;
        }
        s(j, false);
        this.F = j;
        if (m()) {
            bjl0 bjl0Var = this.w;
            int i = bjl0Var.H;
            if (i != 1) {
                if (i != 2) {
                    ny61.k();
                    return 0L;
                }
                this.G = j;
                bjl0Var.e(j);
                return j;
            }
        } else {
            ArrayList arrayList = this.x;
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (((gjl0) arrayList.get(i2)).c.C(j, false)) {
                    i2++;
                } else {
                    this.G = j;
                    if (this.I) {
                        for (int i3 = 0; i3 < this.x.size(); i3++) {
                            gjl0 gjl0Var = (gjl0) this.x.get(i3);
                            d6z.x(gjl0Var.d);
                            gjl0Var.d = false;
                            a(gjl0Var.f);
                            gjl0Var.b.g(gjl0Var.a.b, gjl0Var.f.c, 0);
                        }
                        boolean z = this.O;
                        bjl0 bjl0Var2 = this.w;
                        if (z) {
                            bjl0Var2.k(tw21.l0(j));
                        } else {
                            bjl0Var2.e(j);
                        }
                    } else {
                        this.w.e(j);
                    }
                    for (int i4 = 0; i4 < this.x.size(); i4++) {
                        gjl0 gjl0Var2 = (gjl0) this.x.get(i4);
                        if (!gjl0Var2.d) {
                            lil0 lil0Var = gjl0Var2.a.b.A;
                            lil0Var.getClass();
                            synchronized (lil0Var.e) {
                                lil0Var.k = true;
                            }
                            gjl0Var2.c.A(false);
                            gjl0Var2.c.t = j;
                        }
                    }
                }
            }
        }
        return j;
    }

    @Override // defpackage.xe10
    public final long f() {
        if (!this.J) {
            return -9223372036854775807L;
        }
        this.J = false;
        return 0L;
    }

    @Override // defpackage.urq0
    public final long g() {
        if (!this.I) {
            ArrayList arrayList = this.x;
            if (!arrayList.isEmpty()) {
                long j = this.F;
                if (j != -9223372036854775807L) {
                    return j;
                }
                boolean z = true;
                long j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                for (int i = 0; i < arrayList.size(); i++) {
                    gjl0 gjl0Var = (gjl0) arrayList.get(i);
                    if (!gjl0Var.d) {
                        j2 = Math.min(j2, gjl0Var.c.n());
                        z = false;
                    }
                }
                if (z || j2 == Long.MIN_VALUE) {
                    return 0L;
                }
                return j2;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.xe10
    public final yzz0 getTrackGroups() {
        d6z.x(this.L);
        ImmutableList immutableList = this.C;
        immutableList.getClass();
        return new yzz0((xzz0[]) immutableList.toArray(new xzz0[0]));
    }

    @Override // defpackage.urq0
    public final void h(long j) {
    }

    @Override // defpackage.urq0
    public final long i() {
        return g();
    }

    @Override // defpackage.urq0
    public final boolean isLoading() {
        if (this.I) {
            return false;
        }
        int i = this.w.H;
        return i == 2 || i == 1;
    }

    @Override // defpackage.xe10
    public final void j() {
        IOException iOException = this.D;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // defpackage.xe10
    public final long k(loo[] looVarArr, boolean[] zArr, xyl0[] xyl0VarArr, boolean[] zArr2, long j) {
        ArrayList arrayList;
        for (int i = 0; i < looVarArr.length; i++) {
            if (xyl0VarArr[i] != null && (looVarArr[i] == null || !zArr[i])) {
                xyl0VarArr[i] = null;
            }
        }
        ArrayList arrayList2 = this.y;
        arrayList2.clear();
        int i2 = 0;
        while (true) {
            int length = looVarArr.length;
            arrayList = this.x;
            if (i2 >= length) {
                break;
            }
            loo looVar = looVarArr[i2];
            if (looVar != null) {
                xzz0 trackGroup = looVar.getTrackGroup();
                ImmutableList immutableList = this.C;
                immutableList.getClass();
                int indexOf = immutableList.indexOf(trackGroup);
                gjl0 gjl0Var = (gjl0) arrayList.get(indexOf);
                gjl0Var.getClass();
                arrayList2.add(gjl0Var.a);
                if (this.C.contains(trackGroup) && xyl0VarArr[i2] == null) {
                    xyl0VarArr[i2] = new we6(this, indexOf, 10);
                    zArr2[i2] = true;
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            gjl0 gjl0Var2 = (gjl0) arrayList.get(i3);
            if (!arrayList2.contains(gjl0Var2.a)) {
                gjl0Var2.a();
            }
        }
        this.M = true;
        if (j != 0) {
            this.F = j;
            this.G = j;
            this.H = j;
        }
        o();
        return j;
    }

    @Override // defpackage.xe10
    public final void l(we10 we10Var, long j) {
        bjl0 bjl0Var = this.w;
        this.B = we10Var;
        try {
            bjl0Var.getClass();
            try {
                bjl0Var.B.a(bjl0Var.d(bjl0Var.A));
                o3 o3Var = bjl0Var.z;
                o3Var.K(o3Var.t(4, bjl0Var.D, ImmutableMap.f(), bjl0Var.A));
            } catch (IOException e) {
                tw21.g(bjl0Var.B);
                throw e;
            }
        } catch (IOException e2) {
            this.D = e2;
            tw21.g(bjl0Var);
        }
    }

    public final boolean m() {
        return this.G != -9223372036854775807L;
    }

    @Override // defpackage.urq0
    public final boolean n(xzy xzyVar) {
        return isLoading();
    }

    public final void o() {
        ArrayList arrayList;
        boolean z = true;
        int i = 0;
        while (true) {
            arrayList = this.y;
            if (i >= arrayList.size()) {
                break;
            }
            z &= ((fjl0) arrayList.get(i)).c != null;
            i++;
        }
        if (z && this.M) {
            bjl0 bjl0Var = this.w;
            bjl0Var.x.addAll(arrayList);
            bjl0Var.c();
        }
    }

    @Override // defpackage.xe10
    public final void s(long j, boolean z) {
        if (m()) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i >= arrayList.size()) {
                return;
            }
            gjl0 gjl0Var = (gjl0) arrayList.get(i);
            if (!gjl0Var.d) {
                gjl0Var.c.g(j, z, true);
            }
            i++;
        }
    }
}
