package xsna;

import com.vk.api.generated.apps.dto.AppsSearchResponseDto;
import java.util.Collection;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bbv0;
import xsna.chs;

/* compiled from: BindNewCardPresenter.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class j37 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j37(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                h37 h37Var = (h37) this.receiver;
                h37Var.i.un();
                bbv0.g.getClass();
                bbv0.a.c((Throwable) obj);
                h37Var.k();
                return s3q0.a;
            case 1:
                return ((of20) this.receiver).b((Collection) obj);
            case 2:
                chs chsVar = (chs) obj;
                ygk ygkVar = (ygk) this.receiver;
                ygkVar.getClass();
                ((zak0) ygkVar.j).setValue(Boolean.valueOf((chsVar instanceof chs.a) || (chsVar instanceof chs.e)));
                return s3q0.a;
            case 3:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 4:
                Throwable th = (Throwable) obj;
                xam xamVar = (xam) this.receiver;
                f9w f9wVar = xam.y;
                xamVar.getClass();
                xam.y.a(th);
                xamVar.t.e = th;
                xamVar.e1();
                return s3q0.a;
            case 5:
                com.vk.im.ui.components.viewcontrollers.dialog_header.info.b bVar = (com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) this.receiver;
                int i = com.vk.im.ui.components.viewcontrollers.dialog_header.info.b.O;
                bVar.C((u8m) obj);
                return s3q0.a;
            case 6:
                return ((q73) this.receiver).g((AppsSearchResponseDto) obj);
            case 7:
                ((p5z) this.receiver).getClass();
                return Boolean.FALSE;
            case 8:
                vgg vggVar = (vgg) obj;
                im90 im90Var = (im90) this.receiver;
                im90Var.getClass();
                vggVar.d(new k75(12, vggVar.a, im90Var));
                return s3q0.a;
            case 9:
                ((gwa0) this.receiver).b(((Number) obj).longValue());
                return s3q0.a;
            case 10:
                ((bmm0) this.receiver).a((Throwable) obj);
                return s3q0.a;
            default:
                return new Result(dmx0.a((dmx0) this.receiver, (String) obj));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j37(Object obj, int i) {
        super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(1, obj, xam.class, "onUpdateAllByCacheError", "onUpdateAllByCacheError(Ljava/lang/Throwable;)V", 0);
                break;
            case 7:
                super(1, obj, p5z.class, "openPollSticker", "openPollSticker(Lcom/vk/dto/stories/model/clickable/ClickablePoll;)Z", 0);
                break;
            case 11:
                super(1, obj, dmx0.class, "makeNetworkCall", "makeNetworkCall-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;", 0);
                break;
            default:
                break;
        }
    }
}
