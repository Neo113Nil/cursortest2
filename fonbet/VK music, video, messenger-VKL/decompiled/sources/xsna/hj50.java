package xsna;

import xsna.fi20;

/* compiled from: MuxerUtil.java */
/* loaded from: classes12.dex */
public final class hj50 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r0.b <= 4294967295L) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(fi20.a aVar) {
        int i;
        if (!(aVar instanceof xf30) && !(aVar instanceof vf30)) {
            if (aVar instanceof yf30) {
                yf30 yf30Var = (yf30) aVar;
                if (yf30Var.a <= 4294967295L) {
                }
            }
            if ((!(aVar instanceof vo10) || ((i = ((vo10) aVar).d) != 1 && i != 23)) && !(aVar instanceof l4y0)) {
                return false;
            }
        }
        return true;
    }
}
