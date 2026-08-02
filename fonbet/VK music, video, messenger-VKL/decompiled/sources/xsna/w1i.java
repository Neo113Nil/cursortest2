package xsna;

import com.vk.dto.user.UserNameType;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommunitySettingsActionsModalBottomSheet.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class w1i extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1i(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((k1i) this.receiver).d();
                return s3q0.a;
            case 1:
                ((icb0) this.receiver).h();
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((g950) this.receiver).c());
            default:
                mqw0 mqw0Var = (mqw0) this.receiver;
                mqw0 mqw0Var2 = mqw0.a;
                mqw0Var.getClass();
                return Boolean.valueOf(o25.a().i().P == UserNameType.CONTACT);
        }
    }
}
