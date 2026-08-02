package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.navigation.NavigationBarItemView;
import com.yandex.go.scooters.qr.ui.ScootersQrCameraPreview;
import com.yandex.go.scooters.qr.ui.ScootersQrModalView;
import com.yandex.go.scooters.qr.ui.e;
import ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;

/* loaded from: classes10.dex */
public final class hl7 implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;

    public hl7(RecyclerView recyclerView, int i) {
        this.a = 6;
        this.b = i;
        this.c = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        ScootersQrCameraPreview scootersQrCameraPreview;
        ScootersQrCameraPreview scootersQrCameraPreview2;
        View content;
        e eVar;
        View content2;
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                vuj0 vuj0Var = ((dp11) obj).a;
                if (vuj0Var != null) {
                    vuj0Var.b(i2);
                    break;
                }
                break;
            case 1:
                DeliveryContactsModalView deliveryContactsModalView = (DeliveryContactsModalView) obj;
                DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).i.focusInput();
                DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).i.setSelection(i2);
                AnimatedListItemInputComponent animatedListItemInputComponent = DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).i;
                animatedListItemInputComponent.post(new xd2(animatedListItemInputComponent, 1));
                break;
            case 2:
                recyclerView = ((MaterialCalendar) obj).recyclerView;
                recyclerView.smoothScrollToPosition(i2);
                break;
            case 3:
                ((NavigationBarItemView) obj).updateActiveIndicatorLayoutParams(i2);
                break;
            case 4:
                View view = (View) obj;
                if (view.isAttachedToWindow()) {
                    ((RecyclerView) view).scrollToPosition(i2);
                    break;
                }
                break;
            case 5:
                ScootersQrModalView scootersQrModalView = (ScootersQrModalView) obj;
                scootersQrCameraPreview = scootersQrModalView.qrCameraPreview;
                scootersQrCameraPreview2 = scootersQrModalView.qrCameraPreview;
                ViewGroup.LayoutParams layoutParams = scootersQrCameraPreview2.getLayoutParams();
                content = scootersQrModalView.getContent();
                layoutParams.height = content.getMeasuredHeight();
                scootersQrCameraPreview.setLayoutParams(layoutParams);
                eVar = scootersQrModalView.scootersQrPresenter;
                content2 = scootersQrModalView.getContent();
                eVar.C.Fg(new Rect(0, 0, i2, content2.getMeasuredHeight() - tje.u(64, scootersQrModalView.getContext())));
                break;
            case 6:
                ((RecyclerView) obj).smoothScrollToPosition(i2);
                break;
            default:
                ((jy81) obj).g(i2);
                break;
        }
    }

    public /* synthetic */ hl7(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
