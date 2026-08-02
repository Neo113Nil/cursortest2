package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* compiled from: EpisodeVisualizerBars.kt */
/* loaded from: classes2.dex */
public final class ltp {
    public static final void a(final boolean z, final boolean z2, q630 q630Var, long j, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        final long j2;
        Object jtpVar;
        List list;
        androidx.compose.runtime.a M = aVar.M(1659910435);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.l(z2) ? 32 : 16) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            long j3 = l5g.d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1659910435, i2, -1, "com.vk.libvideo.bottomsheet.episode.compose.EpisodeVisualizerBars (EpisodeVisualizerBars.kt:57)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            Object obj = x;
            if (x == c0012a) {
                ArrayList arrayList = new ArrayList(3);
                for (int i3 = 0; i3 < 3; i3++) {
                    arrayList.add(qf2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
                M.R(arrayList);
                obj = arrayList;
            }
            List list2 = (List) obj;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new Random();
                M.R(x2);
            }
            Random random = (Random) x2;
            Boolean valueOf = Boolean.valueOf(z);
            int i4 = i2 & 14;
            boolean y = (i4 == 4) | M.y(list2) | M.y(random) | ((i2 & 112) == 32);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                list = list2;
                jtpVar = new jtp(z, list, random, z2, null);
                M.R(jtpVar);
            } else {
                jtpVar = x3;
                list = list2;
            }
            bap.g(valueOf, (wzs) jtpVar, M, i4);
            boolean y2 = M.y(list);
            Object x4 = M.x();
            if (y2 || x4 == c0012a) {
                x4 = new sjb(list, j3, 1);
                M.R(x4);
            }
            q630Var2 = q630Var;
            xa4.i(6, M, (izs) x4, q630Var2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j2 = j3;
        } else {
            q630Var2 = q630Var;
            M.h();
            j2 = j;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, z2, q630Var2, j2, i) { // from class: xsna.itp
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ long e;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(385);
                    ltp.a(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }
}
