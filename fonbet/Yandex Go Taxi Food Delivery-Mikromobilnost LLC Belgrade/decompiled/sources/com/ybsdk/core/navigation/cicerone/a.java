package com.ybsdk.core.navigation.cicerone;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import defpackage.w511;

/* loaded from: classes2.dex */
public abstract class a {
    public static final boolean a(OpenScreenRequirement openScreenRequirement) {
        if ((openScreenRequirement instanceof OpenScreenRequirement.WithYbSession) || (openScreenRequirement instanceof OpenScreenRequirement.WithBuidOrBankSessionNotRegisteredUser)) {
            return false;
        }
        if (openScreenRequirement instanceof OpenScreenRequirement.WithBuid) {
            return true;
        }
        if ((openScreenRequirement instanceof OpenScreenRequirement.WithUid) || (openScreenRequirement instanceof OpenScreenRequirement.WithoutRequirements)) {
            return false;
        }
        w511.b();
        return false;
    }

    public static final boolean b(OpenScreenRequirement openScreenRequirement) {
        if ((openScreenRequirement instanceof OpenScreenRequirement.WithYbSession) || (openScreenRequirement instanceof OpenScreenRequirement.WithBuidOrBankSessionNotRegisteredUser) || (openScreenRequirement instanceof OpenScreenRequirement.WithBuid) || (openScreenRequirement instanceof OpenScreenRequirement.WithUid)) {
            return true;
        }
        if (openScreenRequirement instanceof OpenScreenRequirement.WithoutRequirements) {
            return false;
        }
        w511.b();
        return false;
    }

    public static final boolean c(OpenScreenRequirement openScreenRequirement) {
        if ((openScreenRequirement instanceof OpenScreenRequirement.WithYbSession) || (openScreenRequirement instanceof OpenScreenRequirement.WithBuidOrBankSessionNotRegisteredUser) || (openScreenRequirement instanceof OpenScreenRequirement.WithBuid)) {
            return true;
        }
        if ((openScreenRequirement instanceof OpenScreenRequirement.WithUid) || (openScreenRequirement instanceof OpenScreenRequirement.WithoutRequirements)) {
            return false;
        }
        w511.b();
        return false;
    }
}
