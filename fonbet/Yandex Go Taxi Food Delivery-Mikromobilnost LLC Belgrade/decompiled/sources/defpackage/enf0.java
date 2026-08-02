package defpackage;

import com.yandex.go.promocodes.base.impl.ui.share.PromoCodeSharingModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class enf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PromoCodeSharingModalView b;

    public /* synthetic */ enf0(PromoCodeSharingModalView promoCodeSharingModalView, int i) {
        this.a = i;
        this.b = promoCodeSharingModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PromoCodeSharingModalView promoCodeSharingModalView = this.b;
        switch (i) {
            case 0:
                promoCodeSharingModalView.forceApplyInsets();
                break;
            default:
                promoCodeSharingModalView.forceApplyInsets();
                break;
        }
    }
}
