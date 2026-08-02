package xsna;

import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import xsna.tsp0;

/* compiled from: SeiReader.java */
/* loaded from: classes12.dex */
public final class e6i0 {
    public final List<androidx.media3.common.a> a;
    public final rgp0[] b;
    public final f0g0 c = new f0g0(new jo3(this, 29));

    public e6i0(List list) {
        this.a = list;
        this.b = new rgp0[list.size()];
    }

    public final void a(rgq rgqVar, tsp0.c cVar) {
        int i = 0;
        while (true) {
            rgp0[] rgp0VarArr = this.b;
            if (i >= rgp0VarArr.length) {
                return;
            }
            cVar.a();
            cVar.b();
            rgp0 track = rgqVar.track(cVar.d, 3);
            androidx.media3.common.a aVar = this.a.get(i);
            String str = aVar.n;
            fxc0.o(str, "Invalid closed caption MIME type provided: %s", MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str));
            String str2 = aVar.a;
            if (str2 == null) {
                cVar.b();
                str2 = cVar.e;
            }
            a.C0043a c0043a = new a.C0043a();
            c0043a.a = str2;
            c0043a.l = io20.q("video/mp2t");
            c0043a.m = io20.q(str);
            c0043a.e = aVar.e;
            c0043a.d = aVar.d;
            c0043a.J = aVar.K;
            c0043a.p = aVar.q;
            zjh0.d(c0043a, track);
            rgp0VarArr[i] = track;
            i++;
        }
    }
}
