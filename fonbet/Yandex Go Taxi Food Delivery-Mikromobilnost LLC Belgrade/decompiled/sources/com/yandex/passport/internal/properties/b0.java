package com.yandex.passport.internal.properties;

import com.yandex.passport.api.PassportIdentifierHintVariant;
import com.yandex.passport.api.k3;
import com.yandex.passport.api.u1;

/* loaded from: classes8.dex */
public final class b0 {
    public static VisualProperties a(k3 k3Var) {
        boolean isNoReturnToHost = k3Var.isNoReturnToHost();
        boolean isSkipButtonShown = k3Var.isSkipButtonShown();
        boolean blockBackButton = k3Var.getBlockBackButton();
        PassportIdentifierHintVariant identifierHintVariant = k3Var.getIdentifierHintVariant();
        boolean isSocialAuthorizationEnabled = k3Var.isSocialAuthorizationEnabled();
        String usernameMessage = k3Var.getUsernameMessage();
        String authMessage = k3Var.getAuthMessage();
        String registrationMessage = k3Var.getRegistrationMessage();
        String deleteAccountMessage = k3Var.getDeleteAccountMessage();
        boolean isPreferPhonishAuth = k3Var.isPreferPhonishAuth();
        boolean isChoosingAnotherAccountOnReloginButtonHidden = k3Var.isChoosingAnotherAccountOnReloginButtonHidden();
        String customLogoText = k3Var.getCustomLogoText();
        AccountListProperties v = com.yandex.passport.internal.util.p.v(k3Var.getAccountListProperties());
        u1 progressProperties = k3Var.getProgressProperties();
        ProgressPropertiesImpl.Companion.getClass();
        return new VisualProperties(isNoReturnToHost, isSkipButtonShown, blockBackButton, identifierHintVariant, isSocialAuthorizationEnabled, authMessage, usernameMessage, registrationMessage, deleteAccountMessage, isPreferPhonishAuth, isChoosingAnotherAccountOnReloginButtonHidden, customLogoText, v, m.b(progressProperties), k3Var.isShowBackgroundAfterAuth(), k3Var.isReloginEditable());
    }
}
