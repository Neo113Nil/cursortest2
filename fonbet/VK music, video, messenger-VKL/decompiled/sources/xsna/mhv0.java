package xsna;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.vk.auth.oauth.parcelable.AuthCodeResult;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.eo70;

/* compiled from: VkSberVerificationProvider.kt */
/* loaded from: classes4.dex */
public final class mhv0 implements gnr0 {
    public ahg a;

    /* compiled from: VkSberVerificationProvider.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((Activity) this.receiver).finish();
            return s3q0.a;
        }
    }

    @Override // xsna.do70
    public final boolean a(int i, int i2, Intent intent, izs<? super eo70, s3q0> izsVar) {
        AuthCodeResult authCodeResult;
        if (i == 114097) {
            Object obj = null;
            if (i2 == -1 && intent != null && (authCodeResult = (AuthCodeResult) intent.getParcelableExtra("SBER_AUTH_CODE_RESULT")) != null) {
                obj = new eo70.e(authCodeResult.b, authCodeResult.c, authCodeResult.d, authCodeResult.e, null);
            }
            if (i2 == 0 && intent != null && intent.getBooleanExtra("force_closure", false)) {
                obj = eo70.b.a;
            }
            if (obj == null) {
                obj = new eo70.a();
            }
            izsVar.invoke(obj);
            if (i2 == -1) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.do70
    public final void b(Activity activity, Bundle bundle) {
        ea0.a(activity, new sgt0(b2v.a(this.a, activity, new ptl0(activity, 19), new a(0, activity, Activity.class, "finish", "finish()V", 0)), 6));
    }

    @Override // xsna.gnr0
    public final void c(com.vk.superapp.verification.account.d dVar, Bundle bundle) {
        ahg a2 = chg.a(dVar.requireContext());
        this.a = a2;
        b2v.a(a2, dVar.requireContext(), new cis0(3, dVar, bundle), new rqs0(this, dVar));
    }
}
