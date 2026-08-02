package xsna;

import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.libvideo.design.view.video.VideoView;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ImBridgeOnSpanLongPressListener.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class wxv extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wxv(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((uxv) this.receiver).c();
                break;
            case 1:
                d3a0 d3a0Var = (d3a0) this.receiver;
                SignUpRouter signUpRouter = d3a0Var.n;
                SignUpRouter signUpRouter2 = signUpRouter != null ? signUpRouter : null;
                String str = d3a0Var.x;
                SignUpDataHolder signUpDataHolder = d3a0Var.p;
                SignUpRouter.a.a(signUpRouter2, str, null, null, (signUpDataHolder != null ? signUpDataHolder : null).I, 6);
                break;
            default:
                ((VideoView) this.receiver).x();
                break;
        }
        return s3q0.a;
    }
}
