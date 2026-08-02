package xsna;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.y5j;

/* compiled from: ConstraintScopeCommon.kt */
/* loaded from: classes11.dex */
public abstract class dq6 implements jor0 {
    public final bv8 a;
    public final String b;

    public dq6(bv8 bv8Var, int i) {
        this.a = bv8Var;
        String str = "start";
        if (i != -2) {
            if (i == -1) {
                str = TtmlNode.END;
            } else if (i == 0) {
                str = TtmlNode.LEFT;
            } else if (i != 1) {
                Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
            } else {
                str = TtmlNode.RIGHT;
            }
        }
        this.b = str;
    }

    @Override // xsna.jor0
    public final void b(y5j.b bVar, float f, float f2) {
        int i = bVar.b;
        String str = "start";
        if (i != -2) {
            if (i == -1) {
                str = TtmlNode.END;
            } else if (i == 0) {
                str = TtmlNode.LEFT;
            } else if (i != 1) {
                Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
            } else {
                str = TtmlNode.RIGHT;
            }
        }
        wu8 wu8Var = new wu8(new char[0]);
        wu8Var.n(dv8.n(bVar.a.toString()));
        wu8Var.n(dv8.n(str));
        wu8Var.n(new av8(f));
        wu8Var.n(new av8(f2));
        this.a.z(this.b, wu8Var);
    }
}
