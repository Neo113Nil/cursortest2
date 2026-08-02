package xsna;

import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionModalInternalComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class e2m implements wb0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e2m(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i = this.b;
        return invoke((sj50) obj);
    }

    @Override // xsna.wb0
    /* renamed from: j */
    public final qj50 invoke(sj50 sj50Var) {
        switch (this.b) {
            case 0:
                return new y1m(((DescriptionModalInternalComponent) this.c).a.a, sj50Var);
            default:
                return new com.vk.mediapicker.impl.presentation.mvi.b((lt10) this.c, sj50Var);
        }
    }
}
