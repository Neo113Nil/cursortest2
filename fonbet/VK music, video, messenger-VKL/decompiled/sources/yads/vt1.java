package yads;

import xsna.go9;

/* loaded from: classes10.dex */
public final class vt1 implements wt1 {
    public final h03 a(nx0 nx0Var) {
        String str = nx0Var.m;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new ng();
                case "application/x-icy":
                    return new p21();
                case "application/id3":
                    return new w21(null);
                case "application/x-emsg":
                    return new ym0();
                case "application/x-scte35":
                    return new o33();
            }
        }
        throw new IllegalArgumentException(go9.b("Attempted to create decoder for unsupported MIME type: ", str));
    }
}
