package com.yandex.passport.biometric.ui.verification;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.passport.common.ebs.BiometricAuthSdkProperties;
import defpackage.ds31;
import defpackage.eja1;
import defpackage.es31;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.tje;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.EbsCryptoSdk;
import ru.rt.ebs.cryptosdk.navigation.models.VerificationLauncher;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/biometric/ui/verification/BiometricAuthSdkActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "passport-biometric_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BiometricAuthSdkActivity extends AppCompatActivity {
    public static final /* synthetic */ int c = 0;
    public final es31 a = new es31(qoi0.a(e.class), new sls() { // from class: com.yandex.passport.biometric.ui.verification.BiometricAuthSdkActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return BiometricAuthSdkActivity.this.getViewModelStore();
        }
    }, new sls() { // from class: com.yandex.passport.biometric.ui.verification.BiometricAuthSdkActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return BiometricAuthSdkActivity.this.getDefaultViewModelProviderFactory();
        }
    }, new sls() { // from class: com.yandex.passport.biometric.ui.verification.BiometricAuthSdkActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return BiometricAuthSdkActivity.this.getDefaultViewModelCreationExtras();
        }
    });
    public final VerificationLauncher b = EbsCryptoSdk.createVerificationLauncher(getActivityResultRegistry(), this, new a(0, this));

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        eja1.s(this).b(new BiometricAuthSdkActivity$onCreate$1(this, null));
        if (bundle == null) {
            e eVar = (e) this.a.getValue();
            VerificationLauncher verificationLauncher = this.b;
            Bundle bundleExtra = getIntent().getBundleExtra("biometric_properties");
            if (bundleExtra == null) {
                ny61.r("No biometric_properties value in intent");
                return;
            }
            BiometricAuthSdkProperties.Companion.getClass();
            Parcelable parcelable = bundleExtra.getParcelable("biometric_auth_sdk_properties");
            if (parcelable != null) {
                tje.N(ds31.a(eVar), mdh.b, null, new BiometricAuthSdkViewModel$initialize$1(eVar, (BiometricAuthSdkProperties) parcelable, verificationLauncher, null), 2);
            } else {
                ny61.r("can't get required parcelable biometric_auth_sdk_properties");
            }
        }
    }
}
