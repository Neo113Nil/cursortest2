package xsna;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.offline.DownloadRequest;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import xsna.npl;

/* compiled from: VideoCacheManager.kt */
/* loaded from: classes8.dex */
public final class y7s0 implements DownloadHelper.a {
    public final /* synthetic */ k7s0 a;
    public final /* synthetic */ v7s0 b;
    public final /* synthetic */ ay8 c;
    public final /* synthetic */ DownloadHelper d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    public y7s0(k7s0 k7s0Var, v7s0 v7s0Var, ay8 ay8Var, DownloadHelper downloadHelper, int i, String str) {
        this.a = k7s0Var;
        this.b = v7s0Var;
        this.c = ay8Var;
        this.d = downloadHelper;
        this.e = i;
        this.f = str;
    }

    @Override // androidx.media3.exoplayer.offline.DownloadHelper.a
    public final void a(DownloadHelper downloadHelper, boolean z) {
        qlt0 qlt0Var;
        int i;
        androidx.media3.common.a aVar;
        androidx.media3.exoplayer.offline.c cVar = this.a.f;
        int i2 = downloadHelper.i();
        v7s0 v7s0Var = this.b;
        int i3 = 0;
        if (i2 > 0 && z) {
            qlt0 qlt0Var2 = new qlt0(v7s0Var.a, downloadHelper);
            npl.d.a aVar2 = new npl.d.a();
            downloadHelper.e();
            qfp0 qfp0Var = downloadHelper.m[0];
            int i4 = qfp0Var.a;
            int i5 = 0;
            while (i5 < i4) {
                pfp0 a = qfp0Var.a(i5);
                int i6 = a.a;
                if (i6 <= 0) {
                    qlt0Var = qlt0Var2;
                    i = i3;
                } else {
                    androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[i6];
                    for (int i7 = i3; i7 < i6; i7++) {
                        aVarArr[i7] = a.d[i7];
                    }
                    if (i6 > 1) {
                        jw5.A(aVarArr, new drt(4));
                    }
                    Long l = qlt0Var2.a;
                    if (l != null) {
                        int i8 = i3;
                        while (true) {
                            if (i8 >= i6) {
                                qlt0Var = qlt0Var2;
                                i = i3;
                                aVar = null;
                                break;
                            }
                            androidx.media3.common.a aVar3 = aVarArr[i8];
                            i = i3;
                            qlt0Var = qlt0Var2;
                            if (aVar3.j <= l.longValue()) {
                                aVar = aVar3;
                                break;
                            } else {
                                i8++;
                                qlt0Var2 = qlt0Var;
                                i3 = i;
                            }
                        }
                        if (aVar == null) {
                            aVar = (androidx.media3.common.a) rl3.b0(aVarArr);
                        }
                    } else {
                        qlt0Var = qlt0Var2;
                        i = i3;
                        aVar = aVarArr[i6 / 2];
                    }
                    zgp0 zgp0Var = new zgp0(a, ImmutableList.p(Integer.valueOf(a.a(aVar))));
                    aVar2.w.put(zgp0Var.a, zgp0Var);
                }
                i5++;
                qlt0Var2 = qlt0Var;
                i3 = i;
            }
            int i9 = i3;
            downloadHelper.e();
            for (int i10 = i9; i10 < downloadHelper.e.size(); i10++) {
                downloadHelper.o[i9][i10].clear();
            }
            npl.d dVar = new npl.d(aVar2);
            try {
                downloadHelper.e();
                downloadHelper.c(i9, dVar);
            } catch (ExoPlaybackException e) {
                throw new IllegalStateException(e);
            }
        }
        DownloadRequest a2 = downloadHelper.f(this.c.d, null).a();
        if (cVar != null) {
            cVar.a(a2, 0);
        }
        if (cVar != null) {
            cVar.g(false);
        }
        this.d.k();
        v7s0Var.f.set(false);
        v7s0Var.i();
    }

    @Override // androidx.media3.exoplayer.offline.DownloadHelper.a
    public final void b(IOException iOException) {
        v7s0 v7s0Var = this.b;
        int i = this.e;
        if (i <= 0) {
            v7s0Var.f.set(false);
            v7s0Var.i();
        } else {
            new u7s0(v7s0Var, this.c, this.f, this.a, i - 1).run();
        }
    }
}
