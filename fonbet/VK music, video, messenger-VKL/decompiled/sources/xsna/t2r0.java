package xsna;

import com.google.crypto.tink.proto.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import xsna.biy;

/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class t2r0 {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName(C.UTF8_NAME);
    }

    public static biy a(com.google.crypto.tink.proto.a aVar) {
        biy.b t = biy.t();
        t.p(aVar.v());
        for (a.c cVar : aVar.u()) {
            biy.c.a v = biy.c.v();
            v.r(cVar.u().v());
            v.q(cVar.x());
            v.p(cVar.w());
            v.o(cVar.v());
            t.o(v.j());
        }
        return t.j();
    }
}
