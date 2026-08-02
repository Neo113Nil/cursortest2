package xsna;

import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;

/* compiled from: AlertDialogCreatorUtils.kt */
/* loaded from: classes15.dex */
public final class qr1 implements SuperappUiRouterBridge.d {
    public final /* synthetic */ gzs<s3q0> a;
    public final /* synthetic */ gzs<s3q0> b;

    public qr1(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        this.a = gzsVar;
        this.b = gzsVar2;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.d
    public final void a(VkAlertData.a aVar) {
        this.a.invoke();
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.d
    public final void onDismiss() {
        this.b.invoke();
    }
}
