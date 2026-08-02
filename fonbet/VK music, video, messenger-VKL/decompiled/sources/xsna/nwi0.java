package xsna;

import com.vk.voip.OKVoipEngine;

/* compiled from: SessionRoomsFeature.kt */
/* loaded from: classes7.dex */
public final class nwi0 implements OKVoipEngine.a {
    public final /* synthetic */ mwi0 a;

    public nwi0(mwi0 mwi0Var) {
        this.a = mwi0Var;
    }

    @Override // com.vk.voip.OKVoipEngine.a
    public final void a(boolean z) {
        if (z) {
            mwi0 mwi0Var = this.a;
            mwi0Var.W(mwi0Var.f.isMeCreatorOrAdmin());
        }
    }

    @Override // com.vk.voip.OKVoipEngine.a
    public final void b(String str, boolean z) {
        if (z) {
            mwi0 mwi0Var = this.a;
            mwi0Var.W(mwi0Var.f.isMeCreatorOrAdmin());
        }
    }
}
