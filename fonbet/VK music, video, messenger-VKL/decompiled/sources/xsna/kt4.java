package xsna;

import android.view.ViewGroup;
import com.vk.dto.user.UserNameType;
import com.vk.newsfeed.impl.writebar.overlay.WriteBarOverlayFragment;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AudioPlaylistHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class kt4 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kt4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (Boolean) ((mcy) this.receiver).get();
            case 1:
                qx4 qx4Var = (qx4) this.receiver;
                cvk.w(qx4Var.b.getString(R.string.common_network_error), false);
                qx4Var.f.invoke(26);
                return s3q0.a;
            case 2:
                ((uxv) this.receiver).c();
                return s3q0.a;
            case 3:
                return (Boolean) ((mcy) this.receiver).get();
            case 4:
                mqw0 mqw0Var = (mqw0) this.receiver;
                mqw0 mqw0Var2 = mqw0.a;
                mqw0Var.getClass();
                return Boolean.valueOf(o25.a().i().P == UserNameType.CONTACT);
            default:
                WriteBarOverlayFragment writeBarOverlayFragment = (WriteBarOverlayFragment) this.receiver;
                ViewGroup viewGroup = writeBarOverlayFragment.V;
                if (viewGroup != null) {
                    dnp0 dnp0Var = new dnp0();
                    dnp0Var.a(new l1y0(writeBarOverlayFragment));
                    dnp0Var.c(new a0k0(80));
                    dnp0Var.e(200L);
                    dnp0Var.g(0);
                    zmp0.a(viewGroup, dnp0Var);
                    viewGroup.setVisibility(0);
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt4(Object obj, int i) {
        super(0, obj, qx4.class, "displayErrorAndStop", "displayErrorAndStop()V", 0);
        this.b = i;
        switch (i) {
            case 5:
                super(0, obj, WriteBarOverlayFragment.class, "showAnimated", "showAnimated()V", 0);
                break;
            default:
                break;
        }
    }
}
