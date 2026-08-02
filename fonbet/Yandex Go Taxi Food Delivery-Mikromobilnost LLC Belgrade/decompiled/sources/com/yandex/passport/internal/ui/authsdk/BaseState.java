package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ModernAccount;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.ReasonFlags;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/yandex/passport/internal/ui/authsdk/BaseState;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", ReasonFlags.UNUSED, "(Landroid/os/Parcel;)V", "Lcom/yandex/passport/internal/ui/authsdk/l;", "presenter", "next", "(Lcom/yandex/passport/internal/ui/authsdk/l;)Lcom/yandex/passport/internal/ui/authsdk/BaseState;", "", "describeContents", "()I", "Lcom/yandex/passport/internal/ModernAccount;", "getModernAccount", "()Lcom/yandex/passport/internal/ModernAccount;", "modernAccount", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseState implements Parcelable {
    public static final int $stable = 0;

    public BaseState() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ModernAccount getModernAccount() {
        return null;
    }

    public abstract BaseState next(l presenter);

    public BaseState(Parcel parcel) {
    }
}
