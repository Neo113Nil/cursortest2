package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportIdentifierHintVariant;
import com.yandex.passport.api.k3;
import com.yandex.passport.api.u1;
import com.yandex.passport.internal.properties.AccountListProperties;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0081\b\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002RSB±\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b-\u0010+J\u0012\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b.\u0010+J\u0010\u0010/\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b/\u0010$J\u0010\u00100\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b0\u0010$J\u0012\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b1\u0010+J\u0010\u00102\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b6\u0010$J\u0010\u00107\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b7\u0010$Jº\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b:\u0010+J\u0010\u0010;\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b;\u0010\"J\u001a\u0010>\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\b\u0004\u0010$R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\b\u0005\u0010$R\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010$R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010(R\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\b\t\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bF\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bG\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bH\u0010+R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\b\u000f\u0010$R\u001a\u0010\u0010\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\b\u0010\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bI\u0010+R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bK\u00103R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bM\u00105R\u001a\u0010\u0016\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010@\u001a\u0004\b\u0016\u0010$R\u001a\u0010\u0017\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010@\u001a\u0004\b\u0017\u0010$R\u001a\u0010N\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\bO\u0010P\u001a\u0004\bN\u0010$¨\u0006T"}, d2 = {"Lcom/yandex/passport/internal/properties/VisualProperties;", "Lcom/yandex/passport/api/k3;", "Landroid/os/Parcelable;", "", "isNoReturnToHost", "isSkipButtonShown", "blockBackButton", "Lcom/yandex/passport/api/PassportIdentifierHintVariant;", "identifierHintVariant", "isSocialAuthorizationEnabled", "", "authMessage", "usernameMessage", "registrationMessage", "deleteAccountMessage", "isPreferPhonishAuth", "isChoosingAnotherAccountOnReloginButtonHidden", "customLogoText", "Lcom/yandex/passport/internal/properties/AccountListProperties;", "accountListProperties", "Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;", "progressProperties", "isShowBackgroundAfterAuth", "isReloginEditable", "<init>", "(ZZZLcom/yandex/passport/api/PassportIdentifierHintVariant;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/yandex/passport/internal/properties/AccountListProperties;Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "component3", "component4", "()Lcom/yandex/passport/api/PassportIdentifierHintVariant;", "component5", "component6", "()Ljava/lang/String;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Lcom/yandex/passport/internal/properties/AccountListProperties;", "component14", "()Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;", "component15", "component16", "copy", "(ZZZLcom/yandex/passport/api/PassportIdentifierHintVariant;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/yandex/passport/internal/properties/AccountListProperties;Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;ZZ)Lcom/yandex/passport/internal/properties/VisualProperties;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getBlockBackButton", "Lcom/yandex/passport/api/PassportIdentifierHintVariant;", "getIdentifierHintVariant", "Ljava/lang/String;", "getAuthMessage", "getUsernameMessage", "getRegistrationMessage", "getDeleteAccountMessage", "getCustomLogoText", "Lcom/yandex/passport/internal/properties/AccountListProperties;", "getAccountListProperties", "Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;", "getProgressProperties", "isBackButtonHidden", "isBackButtonHidden$annotations", "()V", "Companion", "a", "com/yandex/passport/internal/properties/b0", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class VisualProperties implements k3, Parcelable {
    public static final int $stable = 0;
    private final AccountListProperties accountListProperties;
    private final String authMessage;
    private final boolean blockBackButton;
    private final String customLogoText;
    private final String deleteAccountMessage;
    private final PassportIdentifierHintVariant identifierHintVariant;
    private final boolean isChoosingAnotherAccountOnReloginButtonHidden;
    private final boolean isNoReturnToHost;
    private final boolean isPreferPhonishAuth;
    private final boolean isReloginEditable;
    private final boolean isShowBackgroundAfterAuth;
    private final boolean isSkipButtonShown;
    private final boolean isSocialAuthorizationEnabled;
    private final ProgressPropertiesImpl progressProperties;
    private final String registrationMessage;
    private final String usernameMessage;
    public static final b0 Companion = new b0();
    public static final Parcelable.Creator<VisualProperties> CREATOR = new Creator();

    public static final class a implements k3 {
        public String A;
        public String B;
        public boolean C;
        public boolean D;
        public String E;
        public com.yandex.passport.api.j F;
        public u1 G;
        public boolean H;
        public boolean I;
        public boolean a;
        public boolean b;
        public boolean c;
        public PassportIdentifierHintVariant w = PassportIdentifierHintVariant.LOGIN_OR_PHONE;
        public boolean x = true;
        public String y;
        public String z;

        public a() {
            AccountListProperties.Companion.getClass();
            this.F = com.yandex.passport.internal.util.p.v(new AccountListProperties.a());
            ProgressPropertiesImpl.Companion.getClass();
            this.G = m.a();
            this.I = true;
        }

        public final void a(VisualProperties visualProperties) {
            if (visualProperties != null) {
                this.a = visualProperties.isNoReturnToHost();
                this.b = visualProperties.isSkipButtonShown();
                this.c = visualProperties.getBlockBackButton();
                this.w = visualProperties.getIdentifierHintVariant();
                this.x = visualProperties.isSocialAuthorizationEnabled();
                this.y = visualProperties.getAuthMessage();
                this.z = visualProperties.getUsernameMessage();
                this.A = visualProperties.getRegistrationMessage();
                this.B = visualProperties.getDeleteAccountMessage();
                this.C = visualProperties.isPreferPhonishAuth();
                this.D = visualProperties.isChoosingAnotherAccountOnReloginButtonHidden();
                this.E = visualProperties.getCustomLogoText();
                this.F = visualProperties.getAccountListProperties();
                this.G = visualProperties.getProgressProperties();
                this.H = visualProperties.isShowBackgroundAfterAuth();
                this.I = visualProperties.isReloginEditable();
            }
        }

        @Override // com.yandex.passport.api.k3
        public final com.yandex.passport.api.j getAccountListProperties() {
            return this.F;
        }

        @Override // com.yandex.passport.api.k3
        public final String getAuthMessage() {
            return this.y;
        }

        @Override // com.yandex.passport.api.k3
        public final boolean getBlockBackButton() {
            return this.c;
        }

        @Override // com.yandex.passport.api.k3
        public final String getCustomLogoText() {
            return this.E;
        }

        @Override // com.yandex.passport.api.k3
        public final String getDeleteAccountMessage() {
            return this.B;
        }

        @Override // com.yandex.passport.api.k3
        public final PassportIdentifierHintVariant getIdentifierHintVariant() {
            return this.w;
        }

        @Override // com.yandex.passport.api.k3
        public final u1 getProgressProperties() {
            return this.G;
        }

        @Override // com.yandex.passport.api.k3
        public final String getRegistrationMessage() {
            return this.A;
        }

        @Override // com.yandex.passport.api.k3
        public final String getUsernameMessage() {
            return this.z;
        }

        @Override // com.yandex.passport.api.k3
        public final boolean isChoosingAnotherAccountOnReloginButtonHidden() {
            return this.D;
        }

        @Override // com.yandex.passport.api.k3
        public final boolean isNoReturnToHost() {
            return this.a;
        }

        @Override // com.yandex.passport.api.k3
        public final boolean isPreferPhonishAuth() {
            return this.C;
        }

        @Override // com.yandex.passport.api.k3
        public final boolean isReloginEditable() {
            return this.I;
        }

        @Override // com.yandex.passport.api.k3
        public final boolean isShowBackgroundAfterAuth() {
            return this.H;
        }

        @Override // com.yandex.passport.api.k3
        public final boolean isSkipButtonShown() {
            return this.b;
        }

        @Override // com.yandex.passport.api.k3
        public final boolean isSocialAuthorizationEnabled() {
            return this.x;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VisualProperties(boolean z, boolean z2, boolean z3, PassportIdentifierHintVariant passportIdentifierHintVariant, boolean z4, String str, String str2, String str3, String str4, boolean z5, boolean z6, String str5, AccountListProperties accountListProperties, ProgressPropertiesImpl progressPropertiesImpl, boolean z7, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r9, r15, r2, (i & 16384) != 0 ? false : z7, (i & 32768) != 0 ? true : z8);
        AccountListProperties accountListProperties2;
        ProgressPropertiesImpl progressPropertiesImpl2;
        boolean z9 = (i & 1) != 0 ? false : z;
        boolean z10 = (i & 2) != 0 ? false : z2;
        boolean z11 = (i & 4) != 0 ? false : z3;
        PassportIdentifierHintVariant passportIdentifierHintVariant2 = (i & 8) != 0 ? PassportIdentifierHintVariant.LOGIN_OR_PHONE : passportIdentifierHintVariant;
        boolean z12 = (i & 16) != 0 ? true : z4;
        String str6 = (i & 32) != 0 ? null : str;
        String str7 = (i & 64) != 0 ? null : str2;
        String str8 = (i & 128) != 0 ? null : str3;
        String str9 = (i & 256) != 0 ? null : str4;
        boolean z13 = (i & 512) != 0 ? false : z5;
        boolean z14 = (i & 1024) != 0 ? false : z6;
        String str10 = (i & 2048) == 0 ? str5 : null;
        if ((i & 4096) != 0) {
            AccountListProperties.Companion.getClass();
            accountListProperties2 = com.yandex.passport.internal.util.p.v(new AccountListProperties.a());
        } else {
            accountListProperties2 = accountListProperties;
        }
        if ((i & 8192) != 0) {
            ProgressPropertiesImpl.Companion.getClass();
            progressPropertiesImpl2 = m.a();
        } else {
            progressPropertiesImpl2 = progressPropertiesImpl;
        }
    }

    @jxi
    public static /* synthetic */ void isBackButtonHidden$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsNoReturnToHost() {
        return this.isNoReturnToHost;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsPreferPhonishAuth() {
        return this.isPreferPhonishAuth;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsChoosingAnotherAccountOnReloginButtonHidden() {
        return this.isChoosingAnotherAccountOnReloginButtonHidden;
    }

    /* renamed from: component12, reason: from getter */
    public final String getCustomLogoText() {
        return this.customLogoText;
    }

    /* renamed from: component13, reason: from getter */
    public final AccountListProperties getAccountListProperties() {
        return this.accountListProperties;
    }

    /* renamed from: component14, reason: from getter */
    public final ProgressPropertiesImpl getProgressProperties() {
        return this.progressProperties;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsShowBackgroundAfterAuth() {
        return this.isShowBackgroundAfterAuth;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsReloginEditable() {
        return this.isReloginEditable;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSkipButtonShown() {
        return this.isSkipButtonShown;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getBlockBackButton() {
        return this.blockBackButton;
    }

    /* renamed from: component4, reason: from getter */
    public final PassportIdentifierHintVariant getIdentifierHintVariant() {
        return this.identifierHintVariant;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSocialAuthorizationEnabled() {
        return this.isSocialAuthorizationEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAuthMessage() {
        return this.authMessage;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUsernameMessage() {
        return this.usernameMessage;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRegistrationMessage() {
        return this.registrationMessage;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDeleteAccountMessage() {
        return this.deleteAccountMessage;
    }

    public final VisualProperties copy(boolean isNoReturnToHost, boolean isSkipButtonShown, boolean blockBackButton, PassportIdentifierHintVariant identifierHintVariant, boolean isSocialAuthorizationEnabled, String authMessage, String usernameMessage, String registrationMessage, String deleteAccountMessage, boolean isPreferPhonishAuth, boolean isChoosingAnotherAccountOnReloginButtonHidden, String customLogoText, AccountListProperties accountListProperties, ProgressPropertiesImpl progressProperties, boolean isShowBackgroundAfterAuth, boolean isReloginEditable) {
        return new VisualProperties(isNoReturnToHost, isSkipButtonShown, blockBackButton, identifierHintVariant, isSocialAuthorizationEnabled, authMessage, usernameMessage, registrationMessage, deleteAccountMessage, isPreferPhonishAuth, isChoosingAnotherAccountOnReloginButtonHidden, customLogoText, accountListProperties, progressProperties, isShowBackgroundAfterAuth, isReloginEditable);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisualProperties)) {
            return false;
        }
        VisualProperties visualProperties = (VisualProperties) other;
        return this.isNoReturnToHost == visualProperties.isNoReturnToHost && this.isSkipButtonShown == visualProperties.isSkipButtonShown && this.blockBackButton == visualProperties.blockBackButton && this.identifierHintVariant == visualProperties.identifierHintVariant && this.isSocialAuthorizationEnabled == visualProperties.isSocialAuthorizationEnabled && jl40.l(this.authMessage, visualProperties.authMessage) && jl40.l(this.usernameMessage, visualProperties.usernameMessage) && jl40.l(this.registrationMessage, visualProperties.registrationMessage) && jl40.l(this.deleteAccountMessage, visualProperties.deleteAccountMessage) && this.isPreferPhonishAuth == visualProperties.isPreferPhonishAuth && this.isChoosingAnotherAccountOnReloginButtonHidden == visualProperties.isChoosingAnotherAccountOnReloginButtonHidden && jl40.l(this.customLogoText, visualProperties.customLogoText) && jl40.l(this.accountListProperties, visualProperties.accountListProperties) && jl40.l(this.progressProperties, visualProperties.progressProperties) && this.isShowBackgroundAfterAuth == visualProperties.isShowBackgroundAfterAuth && this.isReloginEditable == visualProperties.isReloginEditable;
    }

    @Override // com.yandex.passport.api.k3
    public String getAuthMessage() {
        return this.authMessage;
    }

    @Override // com.yandex.passport.api.k3
    public boolean getBlockBackButton() {
        return this.blockBackButton;
    }

    @Override // com.yandex.passport.api.k3
    public String getCustomLogoText() {
        return this.customLogoText;
    }

    @Override // com.yandex.passport.api.k3
    public String getDeleteAccountMessage() {
        return this.deleteAccountMessage;
    }

    @Override // com.yandex.passport.api.k3
    public PassportIdentifierHintVariant getIdentifierHintVariant() {
        return this.identifierHintVariant;
    }

    @Override // com.yandex.passport.api.k3
    public String getRegistrationMessage() {
        return this.registrationMessage;
    }

    @Override // com.yandex.passport.api.k3
    public String getUsernameMessage() {
        return this.usernameMessage;
    }

    public int hashCode() {
        int e = unr0.e((this.identifierHintVariant.hashCode() + unr0.e(unr0.e(Boolean.hashCode(this.isNoReturnToHost) * 31, 31, this.isSkipButtonShown), 31, this.blockBackButton)) * 31, 31, this.isSocialAuthorizationEnabled);
        String str = this.authMessage;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.usernameMessage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.registrationMessage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deleteAccountMessage;
        int e2 = unr0.e(unr0.e((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.isPreferPhonishAuth), 31, this.isChoosingAnotherAccountOnReloginButtonHidden);
        String str5 = this.customLogoText;
        return Boolean.hashCode(this.isReloginEditable) + unr0.e((this.progressProperties.hashCode() + ((this.accountListProperties.hashCode() + ((e2 + (str5 != null ? str5.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.isShowBackgroundAfterAuth);
    }

    public boolean isBackButtonHidden() {
        return isNoReturnToHost();
    }

    @Override // com.yandex.passport.api.k3
    public boolean isChoosingAnotherAccountOnReloginButtonHidden() {
        return this.isChoosingAnotherAccountOnReloginButtonHidden;
    }

    @Override // com.yandex.passport.api.k3
    public boolean isNoReturnToHost() {
        return this.isNoReturnToHost;
    }

    @Override // com.yandex.passport.api.k3
    public boolean isPreferPhonishAuth() {
        return this.isPreferPhonishAuth;
    }

    @Override // com.yandex.passport.api.k3
    public boolean isReloginEditable() {
        return this.isReloginEditable;
    }

    @Override // com.yandex.passport.api.k3
    public boolean isShowBackgroundAfterAuth() {
        return this.isShowBackgroundAfterAuth;
    }

    @Override // com.yandex.passport.api.k3
    public boolean isSkipButtonShown() {
        return this.isSkipButtonShown;
    }

    @Override // com.yandex.passport.api.k3
    public boolean isSocialAuthorizationEnabled() {
        return this.isSocialAuthorizationEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VisualProperties(isNoReturnToHost=");
        sb.append(this.isNoReturnToHost);
        sb.append(", isSkipButtonShown=");
        sb.append(this.isSkipButtonShown);
        sb.append(", blockBackButton=");
        sb.append(this.blockBackButton);
        sb.append(", identifierHintVariant=");
        sb.append(this.identifierHintVariant);
        sb.append(", isSocialAuthorizationEnabled=");
        sb.append(this.isSocialAuthorizationEnabled);
        sb.append(", authMessage=");
        sb.append(this.authMessage);
        sb.append(", usernameMessage=");
        sb.append(this.usernameMessage);
        sb.append(", registrationMessage=");
        sb.append(this.registrationMessage);
        sb.append(", deleteAccountMessage=");
        sb.append(this.deleteAccountMessage);
        sb.append(", isPreferPhonishAuth=");
        sb.append(this.isPreferPhonishAuth);
        sb.append(", isChoosingAnotherAccountOnReloginButtonHidden=");
        sb.append(this.isChoosingAnotherAccountOnReloginButtonHidden);
        sb.append(", customLogoText=");
        sb.append(this.customLogoText);
        sb.append(", accountListProperties=");
        sb.append(this.accountListProperties);
        sb.append(", progressProperties=");
        sb.append(this.progressProperties);
        sb.append(", isShowBackgroundAfterAuth=");
        sb.append(this.isShowBackgroundAfterAuth);
        sb.append(", isReloginEditable=");
        return unr0.u(sb, this.isReloginEditable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.isNoReturnToHost ? 1 : 0);
        dest.writeInt(this.isSkipButtonShown ? 1 : 0);
        dest.writeInt(this.blockBackButton ? 1 : 0);
        dest.writeString(this.identifierHintVariant.name());
        dest.writeInt(this.isSocialAuthorizationEnabled ? 1 : 0);
        dest.writeString(this.authMessage);
        dest.writeString(this.usernameMessage);
        dest.writeString(this.registrationMessage);
        dest.writeString(this.deleteAccountMessage);
        dest.writeInt(this.isPreferPhonishAuth ? 1 : 0);
        dest.writeInt(this.isChoosingAnotherAccountOnReloginButtonHidden ? 1 : 0);
        dest.writeString(this.customLogoText);
        this.accountListProperties.writeToParcel(dest, flags);
        this.progressProperties.writeToParcel(dest, flags);
        dest.writeInt(this.isShowBackgroundAfterAuth ? 1 : 0);
        dest.writeInt(this.isReloginEditable ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VisualProperties> {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.yandex.passport.internal.properties.VisualProperties createFromParcel(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VisualProperties[] newArray(int i) {
            return new VisualProperties[i];
        }
    }

    @Override // com.yandex.passport.api.k3
    public AccountListProperties getAccountListProperties() {
        return this.accountListProperties;
    }

    @Override // com.yandex.passport.api.k3
    public ProgressPropertiesImpl getProgressProperties() {
        return this.progressProperties;
    }

    public VisualProperties(boolean z, boolean z2, boolean z3, PassportIdentifierHintVariant passportIdentifierHintVariant, boolean z4, String str, String str2, String str3, String str4, boolean z5, boolean z6, String str5, AccountListProperties accountListProperties, ProgressPropertiesImpl progressPropertiesImpl, boolean z7, boolean z8) {
        this.isNoReturnToHost = z;
        this.isSkipButtonShown = z2;
        this.blockBackButton = z3;
        this.identifierHintVariant = passportIdentifierHintVariant;
        this.isSocialAuthorizationEnabled = z4;
        this.authMessage = str;
        this.usernameMessage = str2;
        this.registrationMessage = str3;
        this.deleteAccountMessage = str4;
        this.isPreferPhonishAuth = z5;
        this.isChoosingAnotherAccountOnReloginButtonHidden = z6;
        this.customLogoText = str5;
        this.accountListProperties = accountListProperties;
        this.progressProperties = progressPropertiesImpl;
        this.isShowBackgroundAfterAuth = z7;
        this.isReloginEditable = z8;
    }

    public VisualProperties() {
        this(false, false, false, null, false, null, null, null, null, false, false, null, null, null, false, false, 65535, null);
    }
}
