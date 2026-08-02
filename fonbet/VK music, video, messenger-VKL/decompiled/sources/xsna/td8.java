package xsna;

import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BroadcastConfigFragment.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class td8 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((BroadcastConfigFragment) this.receiver).tn();
                return s3q0.a;
            case 1:
                x4i x4iVar = (x4i) this.receiver;
                x4iVar.h = true;
                if (x4iVar.d.k) {
                    x4iVar.C(false);
                    x4iVar.g(true);
                }
                return s3q0.a;
            case 2:
                mxt mxtVar = (mxt) this.receiver;
                String str = null;
                mxtVar.d.e(new Responses$ClientError(str, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), defpackage.j0.b("VKWebAppGetWorkouts", mxtVar.b), 1, null));
                return s3q0.a;
            case 3:
                ((ze00) this.receiver).getClass();
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.J().f();
            default:
                return Boolean.valueOf(((io.reactivex.rxjava3.core.r) this.receiver).h());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td8(Object obj, int i) {
        super(0, obj, mxt.class, "sendPermissionsDeniedEvent", "sendPermissionsDeniedEvent()V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(0, obj, ze00.class, "getCurrentCallUserId", "getCurrentCallUserId()Lcom/vk/dto/common/id/UserId;", 0);
                break;
            default:
                break;
        }
    }
}
