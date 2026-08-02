package xsna;

import one.video.player.error.OneVideoRendererException;

/* compiled from: RendererErrorResolver.kt */
/* loaded from: classes8.dex */
public final class xyf0 {
    public final vw3 a;

    public xyf0(vw3 vw3Var) {
        this.a = vw3Var;
    }

    public static String a(OneVideoRendererException oneVideoRendererException) {
        String d = oneVideoRendererException.d();
        if (d == null) {
            return "";
        }
        int length = d.length();
        for (int i = 0; i < length; i++) {
            if (d.charAt(i) == ',') {
                return d.substring(0, i);
            }
        }
        return d;
    }
}
