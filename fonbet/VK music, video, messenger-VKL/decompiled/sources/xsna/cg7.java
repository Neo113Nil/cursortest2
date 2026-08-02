package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.usersstore.blockstore.deletereceiver.BlockstoreDeleteReceiver;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class cg7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ cg7(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    break;
                } else {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.i, new Object[]{"[Blockstore] clearAll complete"});
                    }
                    Intent intent = new Intent("com.vk.blockstore.action.deleteall");
                    int i2 = BlockstoreDeleteReceiver.a;
                    context.sendBroadcast(intent, BlockstoreDeleteReceiver.a.a(context));
                    break;
                }
            default:
                Throwable th = (Throwable) obj;
                cvk.w(j03.g(context, th, R.string.error), false);
                L.i(th);
                break;
        }
        return s3q0.a;
    }
}
