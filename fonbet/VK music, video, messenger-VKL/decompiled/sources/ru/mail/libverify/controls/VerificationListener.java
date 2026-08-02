package ru.mail.libverify.controls;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;

/* loaded from: classes9.dex */
public interface VerificationListener {
    void OnCallInDescriptorChanged(@Nullable VerificationApi.CallInDescriptor callInDescriptor);

    void OnCallUIDescriptorChanged(@Nullable VerificationApi.CallUIDescriptor callUIDescriptor);

    void OnIsLastRouteChanged(boolean z);

    void OnMessengerDescriptorChanged(@Nullable VerificationApi.MessengerDescriptor messengerDescriptor);

    void OnMobileIdDescriptorChanged(@Nullable VerificationApi.MobileIdDescriptor mobileIdDescriptor);

    void onCompleted(@NonNull String str, @NonNull String str2, @NonNull String str3);

    void onCompletedWithUserId(@NonNull String str, @NonNull String str2, @NonNull String str3);

    void onError(VerificationApi.FailReason failReason);

    void onIvrCallCompleted();

    void onIvrCallError(VerificationApi.FailReason failReason);

    void onIvrTimeoutUpdated();

    void onPhoneNumberSearchResult(@NonNull String str);

    void onProgress(boolean z);

    void onSmsCodeReceived(@NonNull String str);

    void onStateChanged(VerificationController.State state);
}
