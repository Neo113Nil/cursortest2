package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.a;
import com.google.android.gms.tasks.zzw;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes11.dex */
public final class o091 extends ust {
    public static final zm2 l = new zm2("Auth.Api.Identity.SignIn.API", new esw(7), new pm2());
    public final String k;

    public o091(Activity activity, h191 h191Var) {
        super(activity, activity, l, h191Var, sst.c);
        this.k = r091.a();
    }

    public final String e(Intent intent) {
        if (intent == null) {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra(ACSPConstants.STATUS);
        Status status = (Status) (byteArrayExtra == null ? null : hwa1.a(byteArrayExtra, creator));
        if (status == null) {
            throw new ApiException(Status.RESULT_CANCELED);
        }
        if (!status.isSuccess()) {
            throw new ApiException(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new ApiException(Status.RESULT_INTERNAL_ERROR);
    }

    public final zzw f(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        ysx0 a = zsx0.a();
        a.c = new Feature[]{q091.d};
        a.a = new a(this, getPhoneNumberHintIntentRequest, 1);
        a.d = 1653;
        return d(0, a.a());
    }

    public final SignInCredential g(Intent intent) {
        if (intent == null) {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra(ACSPConstants.STATUS);
        Status status = (Status) (byteArrayExtra == null ? null : hwa1.a(byteArrayExtra, creator));
        if (status == null) {
            throw new ApiException(Status.RESULT_CANCELED);
        }
        if (!status.isSuccess()) {
            throw new ApiException(status);
        }
        Parcelable.Creator<SignInCredential> creator2 = SignInCredential.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        SignInCredential signInCredential = (SignInCredential) (byteArrayExtra2 != null ? hwa1.a(byteArrayExtra2, creator2) : null);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new ApiException(Status.RESULT_INTERNAL_ERROR);
    }

    public o091(Context context, h191 h191Var) {
        super(context, null, l, h191Var, sst.c);
        this.k = r091.a();
    }
}
