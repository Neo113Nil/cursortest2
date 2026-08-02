package xsna;

import com.vk.channels.impl.channel_screen.AppChannelFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AppChannelFragment.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class a23 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a23(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((AppChannelFragment) this.receiver).finish();
                return s3q0.a;
            case 1:
                d3b.a((d3b) this.receiver);
                return s3q0.a;
            case 2:
                i9b.a((i9b) this.receiver);
                return s3q0.a;
            case 3:
                ((ddr) this.receiver).onCancel();
                return s3q0.a;
            default:
                ((com.vk.core.utils.newtork.b) this.receiver).getClass();
                return Boolean.valueOf(com.vk.core.utils.newtork.b.d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a23(Object obj, int i) {
        super(0, obj, AppChannelFragment.class, "finish", "finish()V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(0, obj, i9b.class, "disableNotifications", "disableNotifications()V", 0);
                break;
            case 3:
            default:
                break;
            case 4:
                super(0, obj, com.vk.core.utils.newtork.b.class, "isConnected", "isConnected()Z", 0);
                break;
        }
    }
}
