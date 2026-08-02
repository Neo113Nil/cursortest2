package com.yandex.passport.internal.ui.domik;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.ClientToken;
import defpackage.ny61;
import defpackage.vng;
import defpackage.wwg;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\n\u0010$\u0012\u0004\b'\u0010\u001d\u001a\u0004\b%\u0010&R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/DomikResultImpl;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/ui/domik/DomikResult;", "Lcom/yandex/passport/internal/ModernAccount;", "modernAccount", "Lcom/yandex/passport/internal/entities/ClientToken;", "clientToken", "Lcom/yandex/passport/api/PassportLoginAction;", "loginAction", "Lcom/yandex/passport/internal/ui/c;", "additionalActionResponse", "Ljava/util/EnumSet;", "Lcom/yandex/passport/internal/ui/domik/FinishRegistrationActivities;", "skipFinishRegistrationActivities", "<init>", "(Lcom/yandex/passport/internal/ModernAccount;Lcom/yandex/passport/internal/entities/ClientToken;Lcom/yandex/passport/api/PassportLoginAction;Ljava/lang/String;Ljava/util/EnumSet;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/yandex/passport/internal/ModernAccount;", "getModernAccount", "()Lcom/yandex/passport/internal/ModernAccount;", "getModernAccount$annotations", "()V", "Lcom/yandex/passport/internal/entities/ClientToken;", "getClientToken", "()Lcom/yandex/passport/internal/entities/ClientToken;", "Lcom/yandex/passport/api/PassportLoginAction;", "getLoginAction", "()Lcom/yandex/passport/api/PassportLoginAction;", "Ljava/lang/String;", "getAdditionalActionResponse-CR7-YV8", "()Ljava/lang/String;", "getAdditionalActionResponse-CR7-YV8$annotations", "Ljava/util/EnumSet;", "getSkipFinishRegistrationActivities", "()Ljava/util/EnumSet;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DomikResultImpl implements Parcelable, DomikResult {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DomikResultImpl> CREATOR = new Creator();
    private final String additionalActionResponse;
    private final ClientToken clientToken;
    private final PassportLoginAction loginAction;
    private final ModernAccount modernAccount;
    private final EnumSet<FinishRegistrationActivities> skipFinishRegistrationActivities;

    public /* synthetic */ DomikResultImpl(ModernAccount modernAccount, ClientToken clientToken, PassportLoginAction passportLoginAction, String str, EnumSet enumSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modernAccount, clientToken, passportLoginAction, (i & 8) != 0 ? null : str, (i & 16) != 0 ? EnumSet.noneOf(FinishRegistrationActivities.class) : enumSet, null);
    }

    /* renamed from: getAdditionalActionResponse-CR7-YV8$annotations, reason: not valid java name */
    public static /* synthetic */ void m318getAdditionalActionResponseCR7YV8$annotations() {
    }

    public static /* synthetic */ void getModernAccount$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.yandex.passport.internal.ui.domik.DomikResult
    /* renamed from: getAdditionalActionResponse-CR7-YV8, reason: from getter */
    public String getAdditionalActionResponse() {
        return this.additionalActionResponse;
    }

    @Override // com.yandex.passport.internal.ui.domik.DomikResult
    public ClientToken getClientToken() {
        return this.clientToken;
    }

    @Override // com.yandex.passport.internal.ui.domik.DomikResult
    public PassportLoginAction getLoginAction() {
        return this.loginAction;
    }

    @Override // com.yandex.passport.internal.ui.domik.DomikResult
    public ModernAccount getModernAccount() {
        return this.modernAccount;
    }

    @Override // com.yandex.passport.internal.ui.domik.DomikResult
    public EnumSet<FinishRegistrationActivities> getSkipFinishRegistrationActivities() {
        return this.skipFinishRegistrationActivities;
    }

    @Override // com.yandex.passport.internal.ui.domik.DomikResult
    public Bundle toBundle() {
        return wwg.g(new Pair("domik-result", this));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeBundle(wwg.g(new Pair("master-account", this.modernAccount)));
        ClientToken clientToken = this.clientToken;
        if (clientToken == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            clientToken.writeToParcel(dest, flags);
        }
        dest.writeString(this.loginAction.name());
        String str = this.additionalActionResponse;
        if (str == null) {
            str = null;
        }
        dest.writeString(str);
        dest.writeSerializable(this.skipFinishRegistrationActivities);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DomikResultImpl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DomikResultImpl createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(ModernAccount.class.getClassLoader());
            Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vng.u(readBundle, ModernAccount.class, "master-account") : readBundle.getParcelable("master-account");
            if (parcelable == null) {
                ny61.r("can't get required parcelable master-account");
                return null;
            }
            ModernAccount modernAccount = (ModernAccount) parcelable;
            ClientToken createFromParcel = parcel.readInt() == 0 ? null : ClientToken.CREATOR.createFromParcel(parcel);
            PassportLoginAction valueOf = PassportLoginAction.valueOf(parcel.readString());
            String readString = parcel.readString();
            if (readString == null) {
                readString = null;
            }
            return new DomikResultImpl(modernAccount, createFromParcel, valueOf, readString, (EnumSet) parcel.readSerializable(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DomikResultImpl[] newArray(int i) {
            return new DomikResultImpl[i];
        }
    }

    private DomikResultImpl(ModernAccount modernAccount, ClientToken clientToken, PassportLoginAction passportLoginAction, String str, EnumSet<FinishRegistrationActivities> enumSet) {
        this.modernAccount = modernAccount;
        this.clientToken = clientToken;
        this.loginAction = passportLoginAction;
        this.additionalActionResponse = str;
        this.skipFinishRegistrationActivities = enumSet;
    }

    public /* synthetic */ DomikResultImpl(ModernAccount modernAccount, ClientToken clientToken, PassportLoginAction passportLoginAction, String str, EnumSet enumSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(modernAccount, clientToken, passportLoginAction, str, enumSet);
    }
}
