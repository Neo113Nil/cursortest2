package com.yandex.passport.internal.ui.domik;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.ClientToken;
import defpackage.wwg;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0015R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/CredentialManagerDomikResult;", "Lcom/yandex/passport/internal/ui/domik/DomikResult;", "domikResult", "", URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, "<init>", "(Lcom/yandex/passport/internal/ui/domik/DomikResult;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/yandex/passport/internal/ui/domik/DomikResult;", "getDomikResult", "()Lcom/yandex/passport/internal/ui/domik/DomikResult;", "Ljava/lang/String;", "getPassword", "()Ljava/lang/String;", "Lcom/yandex/passport/internal/ModernAccount;", "getModernAccount", "()Lcom/yandex/passport/internal/ModernAccount;", "modernAccount", "Lcom/yandex/passport/internal/entities/ClientToken;", "getClientToken", "()Lcom/yandex/passport/internal/entities/ClientToken;", "clientToken", "Lcom/yandex/passport/api/PassportLoginAction;", "getLoginAction", "()Lcom/yandex/passport/api/PassportLoginAction;", "loginAction", "Lcom/yandex/passport/internal/ui/c;", "getAdditionalActionResponse-CR7-YV8", "additionalActionResponse", "Ljava/util/EnumSet;", "Lcom/yandex/passport/internal/ui/domik/FinishRegistrationActivities;", "getSkipFinishRegistrationActivities", "()Ljava/util/EnumSet;", "skipFinishRegistrationActivities", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialManagerDomikResult implements DomikResult {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CredentialManagerDomikResult> CREATOR = new Creator();
    private final DomikResult domikResult;
    private final String password;

    public CredentialManagerDomikResult(DomikResult domikResult, String str) {
        this.domikResult = domikResult;
        this.password = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.yandex.passport.internal.ui.domik.DomikResult
    /* renamed from: getAdditionalActionResponse-CR7-YV8, reason: not valid java name */
    public String getAdditionalActionResponse() {
        return this.domikResult.getAdditionalActionResponse();
    }

    @Override // com.yandex.passport.internal.ui.domik.DomikResult
    public ClientToken getClientToken() {
        return this.domikResult.getClientToken();
    }

    public final DomikResult getDomikResult() {
        return this.domikResult;
    }

    @Override // com.yandex.passport.internal.ui.domik.DomikResult
    public PassportLoginAction getLoginAction() {
        return this.domikResult.getLoginAction();
    }

    @Override // com.yandex.passport.internal.ui.domik.DomikResult
    public ModernAccount getModernAccount() {
        return this.domikResult.getModernAccount();
    }

    public final String getPassword() {
        return this.password;
    }

    @Override // com.yandex.passport.internal.ui.domik.DomikResult
    public EnumSet<FinishRegistrationActivities> getSkipFinishRegistrationActivities() {
        return this.domikResult.getSkipFinishRegistrationActivities();
    }

    @Override // com.yandex.passport.internal.ui.domik.DomikResult
    public Bundle toBundle() {
        return wwg.g(new Pair("domik-result", this));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.domikResult, flags);
        dest.writeString(this.password);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CredentialManagerDomikResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CredentialManagerDomikResult createFromParcel(Parcel parcel) {
            return new CredentialManagerDomikResult((DomikResult) parcel.readParcelable(CredentialManagerDomikResult.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CredentialManagerDomikResult[] newArray(int i) {
            return new CredentialManagerDomikResult[i];
        }
    }
}
