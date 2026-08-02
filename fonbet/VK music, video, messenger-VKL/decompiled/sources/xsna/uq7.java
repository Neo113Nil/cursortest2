package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.notifications.core.item.a;
import com.vk.video.playlist.playlistscreen.ui.view.PlaylistButtonsStyle;
import xsna.jto0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uq7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ uq7(BookingMaster bookingMaster, q630 q630Var, com.vk.core.compose.component.cell.content.o oVar, int i, int i2) {
        this.b = 0;
        this.e = bookingMaster;
        this.c = q630Var;
        this.f = oVar;
        this.d = i2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                vq7.a((BookingMaster) this.e, (q630) this.c, (com.vk.core.compose.component.cell.content.o) this.f, (androidx.compose.runtime.a) obj, ne7.I(1), this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                c870.a((a.C1441a) this.e, (izs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                u7b0.f((w7b0) this.e, (PlaylistButtonsStyle) this.c, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.f1) this.e).a((q9g) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((jto0) this.e).e((jto0.b) this.c, (i0b0) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ uq7(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = obj2;
        this.f = izsVar;
        this.d = i;
    }

    public /* synthetic */ uq7(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = q630Var;
        this.d = i;
    }
}
