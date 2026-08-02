package defpackage;

import android.view.View;
import com.yandex.go.payments.shared.protection.SharedPaymentProtectionView;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.transition.b;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.zalogin.l;

/* loaded from: classes13.dex */
public final class gor0 extends b implements bor0 {
    public final dor0 c;
    public final SharedPaymentProtectionView w;

    public gor0(dor0 dor0Var, SharedPaymentProtectionView sharedPaymentProtectionView) {
        this.c = dor0Var;
        this.w = sharedPaymentProtectionView;
        final int i = 0;
        sharedPaymentProtectionView.setLaterClickListener(new oxf0(this) { // from class: for0
            public final /* synthetic */ gor0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                gor0 gor0Var = this.b;
                switch (i2) {
                    case 0:
                        gor0Var.c.x.onDismiss();
                        break;
                    case 1:
                        dor0 dor0Var2 = gor0Var.c;
                        uor0 uor0Var = dor0Var2.w;
                        ((l) uor0Var.a.f.get()).a(Events$Zalogin$LinkageContext.SHARED_PAYMENT, new mmp0(13, dor0Var2));
                        break;
                    default:
                        gor0Var.c.w.a.d();
                        break;
                }
            }
        });
        final int i2 = 1;
        sharedPaymentProtectionView.setLinkAccountClickListener(new oxf0(this) { // from class: for0
            public final /* synthetic */ gor0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                gor0 gor0Var = this.b;
                switch (i22) {
                    case 0:
                        gor0Var.c.x.onDismiss();
                        break;
                    case 1:
                        dor0 dor0Var2 = gor0Var.c;
                        uor0 uor0Var = dor0Var2.w;
                        ((l) uor0Var.a.f.get()).a(Events$Zalogin$LinkageContext.SHARED_PAYMENT, new mmp0(13, dor0Var2));
                        break;
                    default:
                        gor0Var.c.w.a.d();
                        break;
                }
            }
        });
        sharedPaymentProtectionView.setOnTouchOutsideListener(new mmp0(14, this));
        final int i3 = 2;
        sharedPaymentProtectionView.setOnBackPressListener(new oxf0(this) { // from class: for0
            public final /* synthetic */ gor0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                gor0 gor0Var = this.b;
                switch (i22) {
                    case 0:
                        gor0Var.c.x.onDismiss();
                        break;
                    case 1:
                        dor0 dor0Var2 = gor0Var.c;
                        uor0 uor0Var = dor0Var2.w;
                        ((l) uor0Var.a.f.get()).a(Events$Zalogin$LinkageContext.SHARED_PAYMENT, new mmp0(13, dor0Var2));
                        break;
                    default:
                        gor0Var.c.w.a.d();
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.transition.b
    /* renamed from: N3 */
    public final ModalView h() {
        return this.w;
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final View h() {
        return this.w;
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void requestFocus() {
        this.w.requestFocus();
    }
}
