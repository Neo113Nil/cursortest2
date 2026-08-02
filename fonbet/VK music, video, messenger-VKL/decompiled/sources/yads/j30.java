package yads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes10.dex */
public abstract class j30 {
    public static u30 a(mp2 mp2Var, String str, qm2 qm2Var, int i) {
        t30 t30Var = new t30();
        t30Var.a = qm2Var.a(str);
        t30Var.d = qm2Var.a;
        t30Var.e = qm2Var.b;
        String c = mp2Var.c();
        if (c == null) {
            c = qm2Var.a(((uo) mp2Var.b.get(0)).a).toString();
        }
        return t30Var.a(c).a(i).a();
    }

    /* JADX WARN: Finally extract failed */
    public static hu a(p30 p30Var, int i, mp2 mp2Var) {
        nq0 tx0Var;
        p30 p30Var2;
        if (mp2Var.e == null) {
            return null;
        }
        nx0 nx0Var = mp2Var.a;
        String str = nx0Var.l;
        if (str != null && (str.startsWith("video/webm") || str.startsWith(MimeTypes.AUDIO_WEBM))) {
            tx0Var = new ak1();
        } else {
            tx0Var = new tx0();
        }
        ar arVar = new ar(tx0Var, i, nx0Var);
        try {
            qm2 qm2Var = (qm2) ni.a(mp2Var.f());
            qm2 e = mp2Var.e();
            if (e != null) {
                qm2 a = qm2Var.a(e, ((uo) mp2Var.b.get(0)).a);
                if (a == null) {
                    p30Var2 = p30Var;
                    new u61(p30Var2, a(mp2Var, ((uo) mp2Var.b.get(0)).a, qm2Var, 0), mp2Var.a, 0, null, arVar).a();
                } else {
                    p30Var2 = p30Var;
                    e = a;
                }
                new u61(p30Var2, a(mp2Var, ((uo) mp2Var.b.get(0)).a, e, 0), mp2Var.a, 0, null, arVar).a();
            }
            arVar.c();
            return arVar.b();
        } catch (Throwable th) {
            arVar.c();
            throw th;
        }
    }
}
