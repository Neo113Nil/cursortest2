package com.yandex.passport.internal.ui.bouncer.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/BouncerStateSnapshot;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/properties/LoginProperties;", "loginProperties", "Lcom/yandex/passport/internal/ui/bouncer/model/BouncerUiState$SocialAction;", "socialAction", "<init>", "(Lcom/yandex/passport/internal/properties/LoginProperties;Lcom/yandex/passport/internal/ui/bouncer/model/BouncerUiState$SocialAction;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/internal/properties/LoginProperties;", "component2", "()Lcom/yandex/passport/internal/ui/bouncer/model/BouncerUiState$SocialAction;", "copy", "(Lcom/yandex/passport/internal/properties/LoginProperties;Lcom/yandex/passport/internal/ui/bouncer/model/BouncerUiState$SocialAction;)Lcom/yandex/passport/internal/ui/bouncer/model/BouncerStateSnapshot;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/internal/properties/LoginProperties;", "getLoginProperties", "Lcom/yandex/passport/internal/ui/bouncer/model/BouncerUiState$SocialAction;", "getSocialAction", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BouncerStateSnapshot implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BouncerStateSnapshot> CREATOR = new Creator();
    private final LoginProperties loginProperties;
    private final BouncerUiState$SocialAction socialAction;

    public BouncerStateSnapshot(LoginProperties loginProperties, BouncerUiState$SocialAction bouncerUiState$SocialAction) {
        this.loginProperties = loginProperties;
        this.socialAction = bouncerUiState$SocialAction;
    }

    public static /* synthetic */ BouncerStateSnapshot copy$default(BouncerStateSnapshot bouncerStateSnapshot, LoginProperties loginProperties, BouncerUiState$SocialAction bouncerUiState$SocialAction, int i, Object obj) {
        if ((i & 1) != 0) {
            loginProperties = bouncerStateSnapshot.loginProperties;
        }
        if ((i & 2) != 0) {
            bouncerUiState$SocialAction = bouncerStateSnapshot.socialAction;
        }
        return bouncerStateSnapshot.copy(loginProperties, bouncerUiState$SocialAction);
    }

    /* renamed from: component1, reason: from getter */
    public final LoginProperties getLoginProperties() {
        return this.loginProperties;
    }

    /* renamed from: component2, reason: from getter */
    public final BouncerUiState$SocialAction getSocialAction() {
        return this.socialAction;
    }

    public final BouncerStateSnapshot copy(LoginProperties loginProperties, BouncerUiState$SocialAction socialAction) {
        return new BouncerStateSnapshot(loginProperties, socialAction);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BouncerStateSnapshot)) {
            return false;
        }
        BouncerStateSnapshot bouncerStateSnapshot = (BouncerStateSnapshot) other;
        return jl40.l(this.loginProperties, bouncerStateSnapshot.loginProperties) && jl40.l(this.socialAction, bouncerStateSnapshot.socialAction);
    }

    public final LoginProperties getLoginProperties() {
        return this.loginProperties;
    }

    public final BouncerUiState$SocialAction getSocialAction() {
        return this.socialAction;
    }

    public int hashCode() {
        return this.socialAction.hashCode() + (this.loginProperties.hashCode() * 31);
    }

    public String toString() {
        return "BouncerStateSnapshot(loginProperties=" + this.loginProperties + ", socialAction=" + this.socialAction + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.loginProperties.writeToParcel(dest, flags);
        this.socialAction.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BouncerStateSnapshot> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BouncerStateSnapshot createFromParcel(Parcel parcel) {
            return new BouncerStateSnapshot(LoginProperties.CREATOR.createFromParcel(parcel), BouncerUiState$SocialAction.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BouncerStateSnapshot[] newArray(int i) {
            return new BouncerStateSnapshot[i];
        }
    }
}
