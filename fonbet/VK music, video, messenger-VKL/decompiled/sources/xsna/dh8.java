package xsna;

import com.vk.api.generated.apps.dto.AppsGetEmbeddedUrlResponseDto;
import com.vk.dto.common.id.UserId;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: BroadcastManagementFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class dh8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                hh8 hh8Var = (hh8) obj;
                eh8 eh8Var = (eh8) this.receiver;
                synchronized (eh8Var) {
                    if (eh8Var.d) {
                        eh8Var.a.onNext(hh8Var);
                    }
                }
                return s3q0.a;
            case 1:
                ((Boolean) obj).booleanValue();
                zam zamVar = ((xam) this.receiver).u;
                if (zamVar != null) {
                    zamVar.b();
                }
                return s3q0.a;
            case 2:
                Throwable th = (Throwable) obj;
                mem memVar = (mem) this.receiver;
                memVar.r.l = false;
                memVar.b1();
                if (memVar.s != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 3:
                return Boolean.valueOf(((md6) this.receiver).m.containsKey((UserId) obj));
            case 4:
                ((bo90) this.receiver).T((no90) obj);
                return s3q0.a;
            case 5:
                cs90.h((cs90) this.receiver, (tr90) obj);
                return s3q0.a;
            case 6:
                ((xgx0) this.receiver).getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 7:
                AppsGetEmbeddedUrlResponseDto appsGetEmbeddedUrlResponseDto = (AppsGetEmbeddedUrlResponseDto) obj;
                ((q73) this.receiver).getClass();
                return new nex0(appsGetEmbeddedUrlResponseDto.e(), appsGetEmbeddedUrlResponseDto.d());
            default:
                return cxx0.n((cxx0) this.receiver, (String) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh8(Object obj, int i) {
        super(1, obj, xam.class, "onInvokeCallbackSuccess", "onInvokeCallbackSuccess(Z)V", 0);
        this.b = i;
        switch (i) {
            case 5:
                super(1, obj, cs90.class, "handlePayOperationResponse", "handlePayOperationResponse(Lcom/vk/superapp/vkpay/checkout/api/dto/domain/PayOperation;)V", 0);
                break;
            case 6:
                super(1, obj, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
