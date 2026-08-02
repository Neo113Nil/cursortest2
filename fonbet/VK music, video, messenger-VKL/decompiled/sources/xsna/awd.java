package xsna;

import com.vk.catalog2.feature.music.ui.holder.MusicPlaceholderVh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class awd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ awd(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                com.vk.clips.editor.state.model.a aVar = (com.vk.clips.editor.state.model.a) obj;
                return aVar.i(aVar.c.get(i2 + 1).j);
            default:
                tgi0 tgi0Var = (tgi0) obj;
                qcy<Object>[] qcyVarArr = MusicPlaceholderVh.o;
                qgi0.r(tgi0Var, "MusicUiHolderPlaceholderImage");
                String valueOf = String.valueOf(i2);
                sgi0<String> sgi0Var = k7e0.b;
                qcy<Object> qcyVar = k7e0.a[0];
                sgi0Var.getClass();
                tgi0Var.a(sgi0Var, valueOf);
                return s3q0.a;
        }
    }
}
