package xsna;

import com.vk.video.ui.upload.impl.publish.presentation.description.feature.entity.DescriptionState;

/* compiled from: DescriptionViewStateMapper.kt */
/* loaded from: classes7.dex */
public final class v2m implements izs<DescriptionState, u2m> {
    public static final v2m b = new v2m();

    @Override // xsna.izs
    public final u2m invoke(DescriptionState descriptionState) {
        DescriptionState descriptionState2 = descriptionState;
        String str = descriptionState2.c;
        bpn0 bpn0Var = descriptionState2.f;
        return new u2m(str, ((Boolean) bpn0Var.getValue()).booleanValue(), ((Boolean) bpn0Var.getValue()).booleanValue() && ((Boolean) descriptionState2.e.getValue()).booleanValue(), descriptionState2.d);
    }
}
