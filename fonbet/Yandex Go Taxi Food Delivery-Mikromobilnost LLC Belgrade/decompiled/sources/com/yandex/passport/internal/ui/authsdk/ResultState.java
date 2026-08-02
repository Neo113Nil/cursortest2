package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.ny61;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/passport/internal/ui/authsdk/ResultState;", "Lcom/yandex/passport/internal/ui/authsdk/BaseState;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/ui/authsdk/AuthSdkResultContainer;", TarifficatorScenarioActivity.RESULT_KEY, "<init>", "(Lcom/yandex/passport/internal/ui/authsdk/AuthSdkResultContainer;)V", "Lcom/yandex/passport/internal/ui/authsdk/l;", "presenter", "next", "(Lcom/yandex/passport/internal/ui/authsdk/l;)Lcom/yandex/passport/internal/ui/authsdk/BaseState;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/passport/internal/ui/authsdk/AuthSdkResultContainer;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultState extends BaseState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ResultState> CREATOR = new Creator();
    private final AuthSdkResultContainer result;

    public ResultState(AuthSdkResultContainer authSdkResultContainer) {
        this.result = authSdkResultContainer;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.BaseState
    public BaseState next(l presenter) {
        AuthSdkResultContainer authSdkResultContainer = this.result;
        ModernAccount e = presenter.C.a().e(authSdkResultContainer.getUid());
        if (e == null) {
            ny61.r("Token result received, but no account for given uid!");
            return null;
        }
        presenter.G.c(e, true);
        presenter.A.m(new k(authSdkResultContainer, 1));
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.result.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ResultState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResultState createFromParcel(Parcel parcel) {
            return new ResultState(AuthSdkResultContainer.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResultState[] newArray(int i) {
            return new ResultState[i];
        }
    }
}
