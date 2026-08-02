package xsna;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import one.video.player.model.FrameSize;

/* compiled from: FilteringDashManifestParser.kt */
/* loaded from: classes3.dex */
public final class efr extends wsk {
    public final int g;
    public final afl0 h;

    public efr(int i, afl0 afl0Var) {
        this.g = i;
        this.h = afl0Var;
    }

    @Override // xsna.wsk, androidx.media3.exoplayer.upstream.c.a
    /* renamed from: d */
    public final rsk a(Uri uri, InputStream inputStream) {
        afl0 afl0Var;
        boolean z;
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        rsk a = super.a(uri, inputStream);
        afl0 afl0Var2 = this.h;
        if (afl0Var2 == null) {
            return a;
        }
        sr10 sr10Var = dy2.a;
        boolean f = epx.f(sr10Var != null ? sr10Var.g() : null, Boolean.TRUE);
        int size = a.m.size();
        int i3 = 0;
        while (i3 < size) {
            List<cj0> list = a.b(i3).c;
            int size2 = list.size();
            int i4 = 0;
            while (i4 < size2) {
                List<e7g0> list2 = list.get(i4).c;
                final oq2 oq2Var = new oq2((byte) 0, 3);
                for (e7g0 e7g0Var : j5g.D0(new Comparator() { // from class: xsna.dfr
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((Number) oq2.this.invoke(obj, obj2)).intValue();
                    }
                }, list2)) {
                    androidx.media3.common.a aVar = e7g0Var.b;
                    int i5 = i3;
                    long floatValue = (long) (((Number) afl0Var2.invoke()).floatValue() * 0.6f);
                    int i6 = aVar.j;
                    afl0Var = afl0Var2;
                    int i7 = aVar.u;
                    int i8 = aVar.v;
                    z = f;
                    i = size;
                    if (floatValue >= i6 && Math.max(i8, i7) <= this.g && (!z || Integer.min(i8, i7) <= FrameSize._480p.getHeight())) {
                        i2 = i5;
                        arrayList.add(new StreamKey(i2, i4, list2.indexOf(e7g0Var)));
                        break;
                    }
                    afl0Var2 = afl0Var;
                    i3 = i5;
                    f = z;
                    size = i;
                }
                afl0Var = afl0Var2;
                z = f;
                i = size;
                i2 = i3;
                i4++;
                afl0Var2 = afl0Var;
                i3 = i2;
                f = z;
                size = i;
            }
            i3++;
        }
        return a.copy(arrayList);
    }
}
