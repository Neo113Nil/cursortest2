package xsna;

import com.vk.instantjobs.InstantJob;
import com.vk.mail.auth.contract.result.userblockstatus.MailBlockStatusError;
import org.json.JSONException;
import xsna.r7x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t45 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ t45(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MailBlockStatusError.CheckAccBlockRequestException checkAccBlockRequestException;
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th instanceof JSONException) {
                    checkAccBlockRequestException = new MailBlockStatusError.CheckAccBlockRequestException("parsing error!");
                } else {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    checkAccBlockRequestException = new MailBlockStatusError.CheckAccBlockRequestException(message);
                }
                return io.reactivex.rxjava3.core.q.H(checkAccBlockRequestException);
            default:
                return Boolean.valueOf(((r7x.a) obj).d(InstantJob.NotificationHideCondition.WHEN_UI_VISIBLE));
        }
    }
}
