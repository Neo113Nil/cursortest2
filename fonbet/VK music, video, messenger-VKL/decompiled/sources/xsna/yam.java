package xsna;

import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DialogBarComponent.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class yam extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yam(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
        this.b = 1;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                edw.k(edw.a, ((xam) this.receiver).i, R.string.vkim_enable_private_message_notifications_snackbar_desc);
                return s3q0.a;
            case 1:
                com.vk.newsfeed.common.recycler.holders.b bVar = (com.vk.newsfeed.common.recycler.holders.b) this.receiver;
                int i = com.vk.newsfeed.common.recycler.holders.b.Q;
                bVar.B6();
                return s3q0.a;
            default:
                l1r0 l1r0Var = (l1r0) this.receiver;
                synchronized (l1r0Var) {
                    l1r0Var.d = false;
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yam(Object obj, int i) {
        super(0, obj, xam.class, "showInAppPushEnabledSnackbar", "showInAppPushEnabledSnackbar()V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(0, obj, l1r0.class, "doOnUnsubscribe", "doOnUnsubscribe()V", 0);
                break;
            default:
                break;
        }
    }
}
