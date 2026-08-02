package ru.mail.libverify.requests;

import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
final class b implements Gsonable, ru.mail.libverify.j0.l {

    @NonNull
    final String applicationId;

    @NonNull
    final String code;

    @NonNull
    final VerificationApi.VerificationSource codeSource;

    @NonNull
    final String verificationUrl;

    public b(@NonNull String str, @NonNull String str2, @NonNull VerificationApi.VerificationSource verificationSource, @NonNull String str3) {
        this.verificationUrl = str;
        this.code = str2;
        this.applicationId = str3;
        this.codeSource = verificationSource;
    }

    @Override // ru.mail.libverify.j0.l
    @NonNull
    public final String getId() {
        return "attempt_" + this.verificationUrl + BundleUtil.UNDERLINE_TAG + this.code + BundleUtil.UNDERLINE_TAG + this.codeSource + BundleUtil.UNDERLINE_TAG + this.applicationId;
    }

    private b() {
        this.verificationUrl = "";
        this.code = "";
        this.applicationId = "";
        this.codeSource = VerificationApi.VerificationSource.UNKNOWN;
    }
}
