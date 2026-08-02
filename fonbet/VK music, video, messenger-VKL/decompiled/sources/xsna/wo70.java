package xsna;

import android.content.Intent;
import com.vk.auth.verification.otp.OTPCheckFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OTPCheckFragment.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class wo70 extends FunctionReferenceImpl implements wzs<Intent, Integer, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(Intent intent, Integer num) {
        int intValue = num.intValue();
        ((OTPCheckFragment) this.receiver).startActivityForResult(intent, intValue);
        return s3q0.a;
    }
}
