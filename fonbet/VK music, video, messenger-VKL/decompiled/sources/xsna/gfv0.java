package xsna;

import android.view.View;
import com.vk.api.generated.calls.dto.CallsShortCredentialsDto;
import com.vk.api.generated.messages.dto.MessagesGetCallPreviewResponseDto;
import com.vk.log.L;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vk.voip.ui.qr.ui.VoipQrCodeScannerFragment;
import com.vk.voip.ui.qr.ui.a;
import com.vk.voip.ui.share.link.pager.view.b;
import com.vk.voip.ui.share.link.pager.view.c;
import xsna.f6x0;
import xsna.giw0;
import xsna.taw0;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class gfv0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gfv0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ymf0 ymf0Var = (ymf0) obj2;
                Reef reef = (Reef) obj;
                if (reef != null) {
                    reef.a(new ReefEvent.d(ymf0Var));
                }
                break;
            case 1:
                wwv0 wwv0Var = (wwv0) obj2;
                Integer num = (Integer) obj;
                wwv0Var.q = num;
                wwv0Var.a.pl(num);
                break;
            case 2:
                ((qaw0) obj2).T((taw0.b.C3735b) obj);
                break;
            case 3:
                ((Integer) obj).intValue();
                break;
            case 4:
                Throwable th = (Throwable) obj;
                L.i(th);
                ((zhw0) obj2).T(new giw0.b(th));
                break;
            case 5:
                ((nrw0) obj2).q(xcw0.y.a);
                break;
            case 6:
                int i2 = VoipQrCodeScannerFragment.W;
                ((VoipQrCodeScannerFragment) obj2).fo((a.e) obj);
                break;
            case 7:
                qxw0 qxw0Var = (qxw0) obj2;
                break;
            case 8:
                com.vk.voip.ui.share.link.pager.view.b bVar = (com.vk.voip.ui.share.link.pager.view.b) obj2;
                MessagesGetCallPreviewResponseDto messagesGetCallPreviewResponseDto = (MessagesGetCallPreviewResponseDto) obj;
                String j = messagesGetCallPreviewResponseDto.j();
                if (j == null) {
                    j = "";
                }
                CallsShortCredentialsDto i3 = messagesGetCallPreviewResponseDto.i();
                bVar.g = new b.a(new c.a(j), i3 != null ? new c.b(i3.d(), i3.e()) : null);
                bVar.c();
                break;
            default:
                f6x0 f6x0Var = (f6x0) obj2;
                f6x0.b bVar2 = (f6x0.b) obj;
                bwt0.p0(f6x0Var.j, bVar2 == f6x0.b.LOADING);
                View view = f6x0Var.d;
                f6x0.b bVar3 = f6x0.b.VMOJI_PRESENT;
                bwt0.p0(view, bVar2 == bVar3 || bVar2 == f6x0.b.NO_VMOJI);
                bwt0.p0(f6x0Var.g, bVar2 == f6x0.b.NO_VMOJI);
                bwt0.p0(f6x0Var.h, bVar2 == bVar3);
                bwt0.p0(f6x0Var.i, bVar2 == bVar3);
                bwt0.p0(f6x0Var.k, bVar2 == bVar3);
                break;
        }
        return s3q0.a;
    }
}
