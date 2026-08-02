package xsna;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: CommunityChannelItem.kt */
/* loaded from: classes5.dex */
public final class jug extends we6 {
    public final kug g;
    public final wpg h;
    public final int i = -237;

    /* compiled from: CommunityChannelItem.kt */
    public final class a extends vif0<jug> {
        @Override // xsna.vif0
        public final void i6(jug jugVar) {
            jug jugVar2 = jugVar;
            View view = this.itemView;
            eug eugVar = view instanceof eug ? (eug) view : null;
            if (eugVar != null) {
                eugVar.D(jugVar2.g);
            }
        }
    }

    public jug(kug kugVar, wpg wpgVar) {
        this.g = kugVar;
        this.h = wpgVar;
    }

    @Override // xsna.we6
    public final vif0<jug> a(ViewGroup viewGroup) {
        eug eugVar = new eug(viewGroup.getContext());
        eugVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        eugVar.setTag("CommunityChannelBlock");
        a aVar = new a(eugVar);
        View view = aVar.itemView;
        eug eugVar2 = view instanceof eug ? (eug) view : null;
        if (eugVar2 != null) {
            eugVar2.setOnOpenUrl(this.h);
        }
        return aVar;
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
