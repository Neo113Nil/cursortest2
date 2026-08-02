package xsna;

import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tasks.Task;
import com.vk.superapp.api.exceptions.AuthException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class r45 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ r45(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th instanceof AuthException.NeedSilentAuthException) {
                    th = AuthException.NeedSilentAuthException.a((AuthException.NeedSilentAuthException) th, this.c);
                }
                return io.reactivex.rxjava3.core.q.H(th);
            case 1:
                return Boolean.valueOf(((String) obj).equals(this.c));
            case 2:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM photo_params where media_key = ?");
                try {
                    V0.D3(1, str);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th2) {
                    V0.close();
                    throw th2;
                }
            case 3:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            default:
                Task task = (Task) obj;
                while (!task.isComplete()) {
                }
                if (!task.isSuccessful()) {
                    throw new IllegalStateException(air.b(')', "Unable to check token status (token ", this.c));
                }
                TokenStatus tokenStatus = (TokenStatus) task.getResult();
                return Boolean.valueOf(tokenStatus == null || tokenStatus.c != 15003);
        }
    }
}
