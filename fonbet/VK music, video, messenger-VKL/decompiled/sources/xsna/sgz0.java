package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class sgz0 extends qhz0 {
    public final boolean e;

    public sgz0(String str, int i, int i2, c900 c900Var) {
        super(str);
        this.b = i;
        this.c = i2;
        this.e = !str.endsWith(".m3u8");
    }

    public static sgz0 a(int i, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        int i2 = 0;
        sgz0 sgz0Var = null;
        while (it.hasNext()) {
            sgz0 sgz0Var2 = (sgz0) it.next();
            int i3 = sgz0Var2.c;
            if (sgz0Var == null || ((i3 <= i && i2 > i) || ((i3 <= i && i3 > i2) || (i3 > i && i3 < i2)))) {
                sgz0Var = sgz0Var2;
                i2 = i3;
            }
        }
        gu8.c(null, "VideoData: Accepted videoData quality = " + i2 + TtmlNode.TAG_P);
        return sgz0Var;
    }
}
