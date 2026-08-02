package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.reporters.DropPlace;
import com.yandex.passport.internal.usecase.m1;
import java.io.IOException;
import kotlin.Metadata;
import org.json.JSONException;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/passport/internal/ui/authsdk/LoadPermissionsState;", "Lcom/yandex/passport/internal/ui/authsdk/BaseState;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/ModernAccount;", "modernAccount", "<init>", "(Lcom/yandex/passport/internal/ModernAccount;)V", "Lcom/yandex/passport/internal/ui/authsdk/l;", "presenter", "next", "(Lcom/yandex/passport/internal/ui/authsdk/l;)Lcom/yandex/passport/internal/ui/authsdk/BaseState;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/passport/internal/ModernAccount;", "getModernAccount", "()Lcom/yandex/passport/internal/ModernAccount;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoadPermissionsState extends BaseState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LoadPermissionsState> CREATOR = new Creator();
    private final ModernAccount modernAccount;

    public LoadPermissionsState(ModernAccount modernAccount) {
        this.modernAccount = modernAccount;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.BaseState
    public ModernAccount getModernAccount() {
        return this.modernAccount;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.BaseState
    public BaseState next(l presenter) {
        AuthSdkProperties authSdkProperties = presenter.I;
        try {
            return new WaitingAcceptState(presenter.a0().h(getModernAccount().getMasterToken(), authSdkProperties.getClientId(), authSdkProperties.getScopes(), (String) com.yandex.passport.internal.network.m.a(presenter.J, new m1(null, getModernAccount().getUid().getEnvironment())), authSdkProperties.getResponseType(), authSdkProperties.getCallerFingerprint(), authSdkProperties.getCallerAppId(), authSdkProperties.getTurboAppRedirectUri()), getModernAccount());
        } catch (InvalidTokenException unused) {
            presenter.D.d(getModernAccount(), DropPlace.AUTH_SDK_NATIVE);
            presenter.B.m(new com.yandex.passport.internal.ui.base.l(new com.yandex.passport.internal.ui.o(1, presenter, getModernAccount().getUid()), Constants.MINIMAL_ERROR_STATUS_CODE));
            return new WaitingAccountState(getModernAccount().getUid(), true);
        } catch (FailedResponseException e) {
            presenter.c0(e, getModernAccount());
            return null;
        } catch (IOException e2) {
            presenter.c0(e2, getModernAccount());
            return null;
        } catch (JSONException e3) {
            presenter.c0(e3, getModernAccount());
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.modernAccount.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LoadPermissionsState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoadPermissionsState createFromParcel(Parcel parcel) {
            return new LoadPermissionsState(ModernAccount.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoadPermissionsState[] newArray(int i) {
            return new LoadPermissionsState[i];
        }
    }
}
