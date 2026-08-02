package xsna;

import com.vk.libvideo.design.view.video.VideoView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AudioSnippetQueueComposite.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class rx4 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rx4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qx4 qx4Var = (qx4) this.receiver;
                cvk.w(qx4Var.b.getString(R.string.common_network_error), false);
                qx4Var.f.invoke(26);
                break;
            case 1:
                break;
            case 2:
                ((xxt) this.receiver).h();
                break;
            case 3:
                ((uxv) this.receiver).c();
                break;
            case 4:
                ((io.reactivex.rxjava3.core.r) this.receiver).onComplete();
                break;
            case 5:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                com.vk.registration.funnels.b.y();
                break;
            default:
                ((VideoView) this.receiver).k();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx4(Object obj, int i) {
        super(0, obj, qx4.class, "displayErrorAndStop", "displayErrorAndStop()V", 0);
        this.b = i;
        switch (i) {
            case 5:
                super(0, obj, com.vk.registration.funnels.b.class, "onWhiteLabelForgotPassword", "onWhiteLabelForgotPassword()V", 0);
                break;
            default:
                break;
        }
    }
}
