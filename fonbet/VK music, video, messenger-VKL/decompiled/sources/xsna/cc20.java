package xsna;

import android.os.Bundle;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.money.MoneyTransferPagerFragment;
import com.vk.sharing.core.SharingActivity;
import com.vkontakte.android.R;
import xsna.svq0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class cc20 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cc20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r7v15, types: [com.vk.pushes.PushAwareActivity, xsna.l4o0$b] */
    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((o8) obj2).invoke(obj);
                break;
            case 1:
                int i2 = MoneyTransferPagerFragment.w0;
                ((ugm) obj2).invoke(obj);
                break;
            case 2:
                ((ugm) obj2).invoke(obj);
                break;
            case 3:
                ((weg) obj2).invoke(obj);
                break;
            case 4:
                ((ugm) obj2).invoke(obj);
                break;
            case 5:
                ((nv2) obj2).invoke(obj);
                break;
            case 6:
                ((ugm) obj2).invoke(obj);
                break;
            case 7:
                ((rq60) obj2).c(new yo60.g.a((Throwable) obj));
                break;
            case 8:
                ((or50) obj2).invoke(obj);
                break;
            case 9:
                ((or50) obj2).invoke(obj);
                break;
            case 10:
                ((fju) obj2).invoke(obj);
                break;
            case 11:
                ((jy5) obj2).invoke(obj);
                break;
            case 12:
                ((mz80) obj2).invoke(obj);
                break;
            case 13:
                ((q69) obj2).invoke(obj);
                break;
            case 14:
                ((mz80) obj2).invoke(obj);
                break;
            case 15:
                ((c3v) obj2).invoke(obj);
                break;
            case 16:
                ((mz80) obj2).invoke(obj);
                break;
            case 17:
                ((or50) obj2).invoke(obj);
                break;
            case 18:
                ((fju) obj2).invoke(obj);
                break;
            case 19:
                ((jy5) obj2).invoke(obj);
                break;
            case 20:
                ((cae) obj2).invoke(obj);
                break;
            case 21:
                SharingActivity sharingActivity = (SharingActivity) obj2;
                nbj0 nbj0Var = (nbj0) obj;
                Bundle bundle = SharingActivity.n0;
                if (nbj0Var instanceof gcj0) {
                    gcj0 gcj0Var = (gcj0) nbj0Var;
                    Throwable th = gcj0Var.a;
                    Long l = gcj0Var.b;
                    VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
                    cvk.w(vKApiExecutionException != null ? (vKApiExecutionException.s() != 7 || vKApiExecutionException.x()) ? vKApiExecutionException.s() == 979 ? sharingActivity.getString(R.string.sharing_disabled_for_miniapp) : j03.g(sharingActivity.i, gcj0Var.a, R.string.sharing_job_call_message_toast_fail) : sharingActivity.getString(R.string.vkim_error_send_message_denied) : j03.g(sharingActivity.i, th, R.string.sharing_job_call_message_toast_fail), false);
                    if (l != null) {
                        sharingActivity.b2(new UserId(l.longValue()));
                        break;
                    }
                }
                break;
            case 22:
                ((or50) obj2).invoke(obj);
                break;
            case 23:
                ((or50) obj2).invoke(obj);
                break;
            case 24:
                ((c3v) obj2).invoke(obj);
                break;
            case 25:
                ((or50) obj2).invoke(obj);
                break;
            case 26:
                ((c3v) obj2).invoke(obj);
                break;
            case 27:
                ?? r7 = ((l4o0) obj2).h;
                if (r7 != 0) {
                    r7.b1();
                    break;
                }
                break;
            case 28:
                ((or50) obj2).invoke(obj);
                break;
            default:
                zvq0 zvq0Var = (zvq0) obj2;
                Throwable th2 = (Throwable) obj;
                if (((dwq0) zvq0Var.b.getCurrentState()).q.b.a.isEmpty()) {
                    zvq0Var.c(svq0.b.n.a);
                }
                zvq0Var.t();
                L.e(th2);
                com.vk.metrics.eventtracking.b.a.a(th2);
                break;
        }
    }
}
