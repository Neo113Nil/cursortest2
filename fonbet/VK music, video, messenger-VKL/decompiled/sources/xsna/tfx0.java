package xsna;

import com.vk.superapp.bridges.SuperappUiRouterBridge;

/* compiled from: WebAppUiRouterBridge.kt */
/* loaded from: classes7.dex */
public final class tfx0 implements SuperappUiRouterBridge.c {
    public final /* synthetic */ dcn a;

    public tfx0(dcn dcnVar) {
        this.a = dcnVar;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.c
    public final void dismiss() {
        dcn dcnVar = this.a;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
    }
}
