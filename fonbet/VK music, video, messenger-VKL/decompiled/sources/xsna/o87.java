package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.a;
import com.vk.dto.common.AttachmentType;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import com.vk.music.playlist.display.domain.a;
import com.vk.music.stickyplayer.domain.PlayerContext;
import xsna.fd70;
import xsna.fja;
import xsna.hjl0;
import xsna.mbf;
import xsna.mr70;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class o87 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ o87(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(a.h.b);
                return s3q0.a;
            case 1:
                izsVar.invoke(fja.a.b);
                return s3q0.a;
            case 2:
                com.vk.voip.ui.c.b.getClass();
                izsVar.invoke(com.vk.voip.ui.c.j0());
                return s3q0.a;
            case 3:
                izsVar.invoke(mbf.c.w.a);
                return s3q0.a;
            case 4:
                izsVar.invoke(mqx.b);
                return s3q0.a;
            case 5:
                izsVar.invoke(a.b.C1340a.b);
                return s3q0.a;
            case 6:
                izsVar.invoke(new sx40.o0(PlayerContext.MINI_STANDALONE));
                return s3q0.a;
            case 7:
                if (!jjc.d().a()) {
                    izsVar.invoke(fd70.d.b);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 8:
                izsVar.invoke(mr70.a.b);
                return s3q0.a;
            case 9:
                izsVar.invoke(OrderListAction.b.b);
                return s3q0.a;
            case 10:
                izsVar.invoke(AttachmentType.BOOKING);
                return s3q0.a;
            case 11:
                return (d2h0) izsVar.invoke(new qb8(10));
            default:
                izsVar.invoke(hjl0.a.c.b);
                return s3q0.a;
        }
    }
}
