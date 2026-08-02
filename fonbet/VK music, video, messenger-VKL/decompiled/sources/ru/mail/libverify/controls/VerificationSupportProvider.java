package ru.mail.libverify.controls;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import ru.mail.verify.core.api.UncaughtExceptionListener;
import ru.mail.verify.core.utils.LogReceiver;

/* loaded from: classes9.dex */
public interface VerificationSupportProvider {
    @Nullable
    String[] getAllowedPermissions();

    @Nullable
    String getAlreadyExistingProfileDataJson();

    @Nullable
    UncaughtExceptionListener getExceptionListener();

    long getIvrTimeoutDefault();

    @Nullable
    LogReceiver getLogReceiver();

    @NonNull
    SharedPreferences getPreferences();

    int getSmsCodeLengthDefault();

    @Nullable
    Map<String, String> getSmsCodeTemplatesDefault();

    @NonNull
    String getVerificationService();

    boolean isSmsCodeNumericDefault();
}
