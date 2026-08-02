package xsna;

import com.vk.voip.VoipCallActivity;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BaseAuthPresenter.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class u66 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u66(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((com.vk.auth.main.e) this.receiver).d();
                break;
            case 1:
                ((bbp) this.receiver).m = false;
                break;
            default:
                VoipCallActivity voipCallActivity = (VoipCallActivity) this.receiver;
                int i = VoipCallActivity.P;
                voipCallActivity.d2();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u66(Object obj) {
        super(0, obj, VoipCallActivity.class, "showCallParticipants", "showCallParticipants()V", 0);
        this.b = 2;
    }
}
