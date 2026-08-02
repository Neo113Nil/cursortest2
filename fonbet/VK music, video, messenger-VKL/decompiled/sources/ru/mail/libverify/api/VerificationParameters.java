package ru.mail.libverify.api;

import ru.mail.verify.core.utils.Gsonable;
import xsna.epx;
import xsna.qoy;

/* loaded from: classes9.dex */
public final class VerificationParameters implements Gsonable {

    @ru.mail.libverify.q0.b("isCallInEnabled")
    private boolean callInEnabled;

    @ru.mail.libverify.q0.b("isCallUIEnabled")
    private Boolean callUIEnabled;
    private String externalId;
    private boolean messengerEnabled;
    private boolean callEnabled = true;
    private boolean mobileIdEnabled = true;
    private boolean pushEnabled = true;
    private boolean smsEnabled = true;

    @ru.mail.libverify.q0.b("isStateChangeOnErrorEnabled")
    private boolean stateChangeOnErrorEnabled = true;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!VerificationParameters.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        VerificationParameters verificationParameters = (VerificationParameters) obj;
        return epx.f(this.externalId, verificationParameters.externalId) && epx.f(this.callUIEnabled, verificationParameters.callUIEnabled) && this.callInEnabled == verificationParameters.callInEnabled && this.callEnabled == verificationParameters.callEnabled && this.mobileIdEnabled == verificationParameters.mobileIdEnabled && this.pushEnabled == verificationParameters.pushEnabled && this.smsEnabled == verificationParameters.smsEnabled && this.stateChangeOnErrorEnabled == verificationParameters.stateChangeOnErrorEnabled && this.messengerEnabled == verificationParameters.messengerEnabled;
    }

    public final boolean getCallEnabled() {
        return this.callEnabled;
    }

    public final boolean getCallInEnabled() {
        return this.callInEnabled;
    }

    public final Boolean getCallUIEnabled() {
        return this.callUIEnabled;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final boolean getMessengerEnabled() {
        return this.messengerEnabled;
    }

    public final boolean getMobileIdEnabled() {
        return this.mobileIdEnabled;
    }

    public final boolean getPushEnabled() {
        return this.pushEnabled;
    }

    public final boolean getSmsEnabled() {
        return this.smsEnabled;
    }

    public final boolean getStateChangeOnErrorEnabled() {
        return this.stateChangeOnErrorEnabled;
    }

    public int hashCode() {
        String str = this.externalId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.callUIEnabled;
        return Boolean.hashCode(this.messengerEnabled) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.callInEnabled), 31, this.callEnabled), 31, this.mobileIdEnabled), 31, this.pushEnabled), 31, this.smsEnabled), 31, this.stateChangeOnErrorEnabled);
    }

    public final VerificationParameters setCallInEnabled(Boolean bool) {
        this.callInEnabled = epx.f(bool, Boolean.TRUE);
        return this;
    }

    public final VerificationParameters setCallUIEnabled(Boolean bool) {
        this.callUIEnabled = bool;
        return this;
    }

    public final VerificationParameters setExternalId(String str) {
        this.externalId = str;
        return this;
    }

    public final VerificationParameters setMessengerEnabled(Boolean bool) {
        this.messengerEnabled = epx.f(bool, Boolean.TRUE);
        return this;
    }

    public final VerificationParameters setRoutes(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.callInEnabled = z2;
        this.callUIEnabled = Boolean.valueOf(z);
        this.mobileIdEnabled = z3;
        this.smsEnabled = z4;
        this.callEnabled = z5;
        this.pushEnabled = z6;
        this.messengerEnabled = z7;
        return this;
    }

    public final VerificationParameters setStateChangeOnError(boolean z) {
        this.stateChangeOnErrorEnabled = z;
        return this;
    }
}
