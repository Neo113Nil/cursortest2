package defpackage;

import com.yandex.go.navigator.driving.DrivingModalView;
import com.yandex.go.taxi.order.cancel.similar.notification.a;
import com.yandex.go.taxi.order.change.driver.c;
import com.yandex.go.taxi.order.change.requirements.interactor.b;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class f08 implements xj60, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f08(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xj60
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a) obj).b.c("CancelSimilarOrdersItemNotification");
                break;
            case 1:
                ((com.yandex.go.taxi.order.change.destination.a) obj).b.c("ChangeOrderDestinationItemNotification");
                break;
            case 2:
                ((c) obj).b.c("ReorderItemNotification");
                break;
            case 3:
                ((b) obj).b.c("ChangeRequirementsNotification");
                break;
            case 4:
                DrivingModalView.removeNotifications$default((DrivingModalView) obj, false, 1, null);
                break;
            default:
                ((wip) obj).b.c("FavoriteNotification");
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof xj60) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof xj60) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof xj60) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof xj60) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof xj60) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof xj60) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new FunctionReferenceImpl(0, (a) obj, a.class, "hideNotification", "hideNotification()V", 0);
            case 1:
                return new FunctionReferenceImpl(0, (com.yandex.go.taxi.order.change.destination.a) obj, com.yandex.go.taxi.order.change.destination.a.class, "hideNotification", "hideNotification()V", 0);
            case 2:
                return new FunctionReferenceImpl(0, (c) obj, c.class, "hideNotification", "hideNotification()V", 0);
            case 3:
                return new FunctionReferenceImpl(0, (b) obj, b.class, "hideNotification", "hideNotification()V", 0);
            case 4:
                return new AdaptedFunctionReference(0, (DrivingModalView) obj, DrivingModalView.class, "removeNotifications", "removeNotifications(Z)V", 0);
            default:
                return new FunctionReferenceImpl(0, (wip) obj, wip.class, "closeNotification", "closeNotification()V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
