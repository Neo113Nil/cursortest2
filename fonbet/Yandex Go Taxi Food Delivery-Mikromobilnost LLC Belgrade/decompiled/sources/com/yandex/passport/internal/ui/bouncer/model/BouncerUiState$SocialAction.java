package com.yandex.passport.internal.ui.bouncer.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"com/yandex/passport/internal/ui/bouncer/model/BouncerUiState$SocialAction", "Lcom/yandex/passport/internal/ui/bouncer/model/c2;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/ui/bouncer/model/SocialContentData;", Constants.KEY_DATA, "<init>", "(Lcom/yandex/passport/internal/ui/bouncer/model/SocialContentData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/internal/ui/bouncer/model/SocialContentData;", "Lcom/yandex/passport/internal/ui/bouncer/model/BouncerUiState$SocialAction;", "copy", "(Lcom/yandex/passport/internal/ui/bouncer/model/SocialContentData;)Lcom/yandex/passport/internal/ui/bouncer/model/BouncerUiState$SocialAction;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/internal/ui/bouncer/model/SocialContentData;", "getData", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BouncerUiState$SocialAction implements c2, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BouncerUiState$SocialAction> CREATOR = new Creator();
    private final SocialContentData data;

    public BouncerUiState$SocialAction(SocialContentData socialContentData) {
        this.data = socialContentData;
    }

    public static /* synthetic */ BouncerUiState$SocialAction copy$default(BouncerUiState$SocialAction bouncerUiState$SocialAction, SocialContentData socialContentData, int i, Object obj) {
        if ((i & 1) != 0) {
            socialContentData = bouncerUiState$SocialAction.data;
        }
        return bouncerUiState$SocialAction.copy(socialContentData);
    }

    /* renamed from: component1, reason: from getter */
    public final SocialContentData getData() {
        return this.data;
    }

    public final BouncerUiState$SocialAction copy(SocialContentData data) {
        return new BouncerUiState$SocialAction(data);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BouncerUiState$SocialAction) && jl40.l(this.data, ((BouncerUiState$SocialAction) other).data);
    }

    public final SocialContentData getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "SocialAction(data=" + this.data + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.data, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BouncerUiState$SocialAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BouncerUiState$SocialAction createFromParcel(Parcel parcel) {
            return new BouncerUiState$SocialAction((SocialContentData) parcel.readParcelable(BouncerUiState$SocialAction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BouncerUiState$SocialAction[] newArray(int i) {
            return new BouncerUiState$SocialAction[i];
        }
    }
}
