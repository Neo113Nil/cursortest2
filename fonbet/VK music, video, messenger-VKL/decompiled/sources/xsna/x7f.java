package xsna;

import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.log.L;
import com.vk.voip.ui.sessionrooms.view.SessionRoomIndicatorView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class x7f implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ x7f(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                L.i((Throwable) obj);
                gzsVar.invoke();
                break;
            case 1:
                if (((ModalActionSheetListItem) obj).a == 0) {
                    gzsVar.invoke();
                }
                break;
            default:
                int i2 = SessionRoomIndicatorView.f;
                gzsVar.invoke();
                break;
        }
        return s3q0.a;
    }
}
