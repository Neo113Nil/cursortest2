package xsna;

import com.vk.media.player.video.view.SimpleVideoView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class px5 implements SimpleVideoView.k, h9l {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ px5(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.vk.media.player.video.view.SimpleVideoView.k
    public void p0(Integer num) {
        izs izsVar = (izs) this.b;
        qx5 qx5Var = (qx5) this.c;
        if (izsVar != null) {
            izsVar.invoke(qx5Var);
        }
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new i2j0((ie7) this.b, (mh70) this.c);
    }
}
