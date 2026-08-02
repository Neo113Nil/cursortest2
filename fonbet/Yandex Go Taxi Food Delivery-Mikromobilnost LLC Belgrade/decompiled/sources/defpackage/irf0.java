package defpackage;

import com.yandex.go.promocodes.base.impl.ui.share.v1.PromocodeSharingView;

/* loaded from: classes13.dex */
public final /* synthetic */ class irf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PromocodeSharingView b;

    public /* synthetic */ irf0(PromocodeSharingView promocodeSharingView, int i) {
        this.a = i;
        this.b = promocodeSharingView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PromocodeSharingView promocodeSharingView = this.b;
        switch (i) {
            case 0:
                PromocodeSharingView.onAttachedToWindow$lambda$1(promocodeSharingView);
                break;
            case 1:
                PromocodeSharingView._init_$lambda$0(promocodeSharingView);
                break;
            default:
                PromocodeSharingView._init_$lambda$1(promocodeSharingView);
                break;
        }
    }
}
