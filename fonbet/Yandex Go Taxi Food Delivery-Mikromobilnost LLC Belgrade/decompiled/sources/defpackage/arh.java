package defpackage;

import androidx.compose.ui.node.u;

/* loaded from: classes10.dex */
public final class arh extends lqh implements fud, dr60 {
    public ac2 A;
    public final /* synthetic */ int c;
    public final h8w w;
    public final boolean x;
    public final float y;
    public final xfc z;

    public /* synthetic */ arh(h8w h8wVar, boolean z, float f, xfc xfcVar, int i) {
        this.c = i;
        this.w = h8wVar;
        this.x = z;
        this.y = f;
        this.z = xfcVar;
    }

    @Override // defpackage.dr60
    public final void e0() {
        switch (this.c) {
            case 0:
                u.e(this, new xqh(this, 0));
                break;
            case 1:
                u.e(this, new yqh(this, 0));
                break;
            default:
                u.e(this, new zqh(this, 0));
                break;
        }
    }

    @Override // defpackage.e530
    public final void onAttach() {
        switch (this.c) {
            case 0:
                u.e(this, new xqh(this, 0));
                break;
            case 1:
                u.e(this, new yqh(this, 0));
                break;
            default:
                u.e(this, new zqh(this, 0));
                break;
        }
    }
}
