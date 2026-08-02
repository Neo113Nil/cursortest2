package xsna;

import com.vk.auth.main.LibverifyListener;
import kotlin.NoWhenBranchMatchedException;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;

/* compiled from: LibverifyListenerWrapper.kt */
/* loaded from: classes15.dex */
public final class h3z implements VerificationApi.SmsCodeNotificationListener, VerificationListener {
    public final LibverifyListener a;

    public h3z(LibverifyListener libverifyListener) {
        this.a = libverifyListener;
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void OnCallInDescriptorChanged(VerificationApi.CallInDescriptor callInDescriptor) {
        this.a.h(callInDescriptor != null ? Integer.valueOf(callInDescriptor.getNumberTimeout()) : null, callInDescriptor != null ? callInDescriptor.getPhoneNumber() : null);
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void OnCallUIDescriptorChanged(VerificationApi.CallUIDescriptor callUIDescriptor) {
        this.a.a(callUIDescriptor != null ? Integer.valueOf(callUIDescriptor.getCodeLength()) : null, callUIDescriptor != null ? callUIDescriptor.getCallUiPhoneFragmentStart() : null);
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void OnMessengerDescriptorChanged(VerificationApi.MessengerDescriptor messengerDescriptor) {
        this.a.f(messengerDescriptor != null ? messengerDescriptor.getIconResource() : null, messengerDescriptor != null ? messengerDescriptor.getName() : null, messengerDescriptor != null ? messengerDescriptor.getId() : null);
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void OnMobileIdDescriptorChanged(VerificationApi.MobileIdDescriptor mobileIdDescriptor) {
        this.a.d(mobileIdDescriptor != null);
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void onCompleted(String str, String str2, String str3) {
        this.a.onCompleted(str, str2, str3);
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void onCompletedWithUserId(String str, String str2, String str3) {
        this.a.b(str2, str3);
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void onError(VerificationApi.FailReason failReason) {
        LibverifyListener.a aVar;
        String description = failReason.getDescription();
        if (description == null) {
            description = "";
        }
        switch (i3z.$EnumSwitchMapping$1[failReason.ordinal()]) {
            case 1:
                aVar = null;
                break;
            case 2:
                aVar = new LibverifyListener.a.b(description);
                break;
            case 3:
                aVar = new LibverifyListener.a.h(description);
                break;
            case 4:
                aVar = new LibverifyListener.a.f(description);
                break;
            case 5:
                aVar = new LibverifyListener.a.d(description);
                break;
            case 6:
                aVar = new LibverifyListener.a.g(description);
                break;
            case 7:
                aVar = new LibverifyListener.a.C0402a(description);
                break;
            case 8:
                aVar = new LibverifyListener.a.c(description);
                break;
            case 9:
                aVar = new LibverifyListener.a.e(description);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (aVar != null) {
            this.a.g(aVar);
        }
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void onIvrCallError(VerificationApi.FailReason failReason) {
        this.a.g(new LibverifyListener.a.d(""));
    }

    @Override // ru.mail.libverify.api.VerificationApi.SmsCodeNotificationListener
    public final void onNotification(String str) {
        this.a.onNotification(str);
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void onProgress(boolean z) {
        this.a.onProgress(z);
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void onStateChanged(VerificationController.State state) {
        LibverifyListener.State state2;
        int i = i3z.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            state2 = LibverifyListener.State.ENTER_PHONE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            state2 = LibverifyListener.State.ENTER_SMS_CODE;
        }
        this.a.c(state2);
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void onIvrCallCompleted() {
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void onIvrTimeoutUpdated() {
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void OnIsLastRouteChanged(boolean z) {
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void onPhoneNumberSearchResult(String str) {
    }

    @Override // ru.mail.libverify.controls.VerificationListener
    public final void onSmsCodeReceived(String str) {
    }
}
