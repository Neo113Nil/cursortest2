package com.ybsdk.feature.deeplink.api;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0000HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b)\u0010(Jd\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b/\u0010\u001aJ\u001a\u00102\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010&R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010(R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bB\u0010(¨\u0006C"}, d2 = {"Lcom/ybsdk/feature/deeplink/api/Deeplink;", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "action", "fallback", "Lcom/ybsdk/feature/deeplink/api/DeeplinkNavigation;", "navigation", "Lcom/ybsdk/feature/deeplink/api/DeeplinkNavigationAnimation;", "navigationAnimation", "Landroid/net/Uri;", "parsedUri", "Lcom/ybsdk/feature/deeplink/api/DeeplinkSource;", "source", "", "renewSession", "pinRequired", "<init>", "(Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;Lcom/ybsdk/feature/deeplink/api/Deeplink;Lcom/ybsdk/feature/deeplink/api/DeeplinkNavigation;Lcom/ybsdk/feature/deeplink/api/DeeplinkNavigationAnimation;Landroid/net/Uri;Lcom/ybsdk/feature/deeplink/api/DeeplinkSource;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "component2", "()Lcom/ybsdk/feature/deeplink/api/Deeplink;", "component3", "()Lcom/ybsdk/feature/deeplink/api/DeeplinkNavigation;", "component4", "()Lcom/ybsdk/feature/deeplink/api/DeeplinkNavigationAnimation;", "component5", "()Landroid/net/Uri;", "component6", "()Lcom/ybsdk/feature/deeplink/api/DeeplinkSource;", "component7", "()Z", "component8", "copy", "(Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;Lcom/ybsdk/feature/deeplink/api/Deeplink;Lcom/ybsdk/feature/deeplink/api/DeeplinkNavigation;Lcom/ybsdk/feature/deeplink/api/DeeplinkNavigationAnimation;Landroid/net/Uri;Lcom/ybsdk/feature/deeplink/api/DeeplinkSource;ZZ)Lcom/ybsdk/feature/deeplink/api/Deeplink;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "getAction", "Lcom/ybsdk/feature/deeplink/api/Deeplink;", "getFallback", "Lcom/ybsdk/feature/deeplink/api/DeeplinkNavigation;", "getNavigation", "Lcom/ybsdk/feature/deeplink/api/DeeplinkNavigationAnimation;", "getNavigationAnimation", "Landroid/net/Uri;", "getParsedUri", "Lcom/ybsdk/feature/deeplink/api/DeeplinkSource;", "getSource", "Z", "getRenewSession", "getPinRequired", "feature-deeplink-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Deeplink implements Parcelable {
    public static final Parcelable.Creator<Deeplink> CREATOR = new Creator();
    private final BaseDeeplinkAction action;
    private final Deeplink fallback;
    private final DeeplinkNavigation navigation;
    private final DeeplinkNavigationAnimation navigationAnimation;
    private final Uri parsedUri;
    private final boolean pinRequired;
    private final boolean renewSession;
    private final DeeplinkSource source;

    public /* synthetic */ Deeplink(BaseDeeplinkAction baseDeeplinkAction, Deeplink deeplink, DeeplinkNavigation deeplinkNavigation, DeeplinkNavigationAnimation deeplinkNavigationAnimation, Uri uri, DeeplinkSource deeplinkSource, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseDeeplinkAction, (i & 2) != 0 ? null : deeplink, (i & 4) != 0 ? DeeplinkNavigation.Add.INSTANCE : deeplinkNavigation, (i & 8) != 0 ? null : deeplinkNavigationAnimation, (i & 16) != 0 ? baseDeeplinkAction.getDeeplinkUri() : uri, (i & 32) != 0 ? DeeplinkSource.UNSPECIFIED : deeplinkSource, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2);
    }

    public static /* synthetic */ Deeplink copy$default(Deeplink deeplink, BaseDeeplinkAction baseDeeplinkAction, Deeplink deeplink2, DeeplinkNavigation deeplinkNavigation, DeeplinkNavigationAnimation deeplinkNavigationAnimation, Uri uri, DeeplinkSource deeplinkSource, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            baseDeeplinkAction = deeplink.action;
        }
        if ((i & 2) != 0) {
            deeplink2 = deeplink.fallback;
        }
        if ((i & 4) != 0) {
            deeplinkNavigation = deeplink.navigation;
        }
        if ((i & 8) != 0) {
            deeplinkNavigationAnimation = deeplink.navigationAnimation;
        }
        if ((i & 16) != 0) {
            uri = deeplink.parsedUri;
        }
        if ((i & 32) != 0) {
            deeplinkSource = deeplink.source;
        }
        if ((i & 64) != 0) {
            z = deeplink.renewSession;
        }
        if ((i & 128) != 0) {
            z2 = deeplink.pinRequired;
        }
        boolean z3 = z;
        boolean z4 = z2;
        Uri uri2 = uri;
        DeeplinkSource deeplinkSource2 = deeplinkSource;
        return deeplink.copy(baseDeeplinkAction, deeplink2, deeplinkNavigation, deeplinkNavigationAnimation, uri2, deeplinkSource2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final BaseDeeplinkAction getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final Deeplink getFallback() {
        return this.fallback;
    }

    /* renamed from: component3, reason: from getter */
    public final DeeplinkNavigation getNavigation() {
        return this.navigation;
    }

    /* renamed from: component4, reason: from getter */
    public final DeeplinkNavigationAnimation getNavigationAnimation() {
        return this.navigationAnimation;
    }

    /* renamed from: component5, reason: from getter */
    public final Uri getParsedUri() {
        return this.parsedUri;
    }

    /* renamed from: component6, reason: from getter */
    public final DeeplinkSource getSource() {
        return this.source;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getRenewSession() {
        return this.renewSession;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getPinRequired() {
        return this.pinRequired;
    }

    public final Deeplink copy(BaseDeeplinkAction action, Deeplink fallback, DeeplinkNavigation navigation, DeeplinkNavigationAnimation navigationAnimation, Uri parsedUri, DeeplinkSource source, boolean renewSession, boolean pinRequired) {
        return new Deeplink(action, fallback, navigation, navigationAnimation, parsedUri, source, renewSession, pinRequired);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Deeplink)) {
            return false;
        }
        Deeplink deeplink = (Deeplink) other;
        return jl40.l(this.action, deeplink.action) && jl40.l(this.fallback, deeplink.fallback) && jl40.l(this.navigation, deeplink.navigation) && jl40.l(this.navigationAnimation, deeplink.navigationAnimation) && jl40.l(this.parsedUri, deeplink.parsedUri) && this.source == deeplink.source && this.renewSession == deeplink.renewSession && this.pinRequired == deeplink.pinRequired;
    }

    public final BaseDeeplinkAction getAction() {
        return this.action;
    }

    public final Deeplink getFallback() {
        return this.fallback;
    }

    public final DeeplinkNavigation getNavigation() {
        return this.navigation;
    }

    public final DeeplinkNavigationAnimation getNavigationAnimation() {
        return this.navigationAnimation;
    }

    public final Uri getParsedUri() {
        return this.parsedUri;
    }

    public final boolean getPinRequired() {
        return this.pinRequired;
    }

    public final boolean getRenewSession() {
        return this.renewSession;
    }

    public final DeeplinkSource getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        Deeplink deeplink = this.fallback;
        int hashCode2 = (this.navigation.hashCode() + ((hashCode + (deeplink == null ? 0 : deeplink.hashCode())) * 31)) * 31;
        DeeplinkNavigationAnimation deeplinkNavigationAnimation = this.navigationAnimation;
        return Boolean.hashCode(this.pinRequired) + unr0.e((this.source.hashCode() + ((this.parsedUri.hashCode() + ((hashCode2 + (deeplinkNavigationAnimation != null ? deeplinkNavigationAnimation.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.renewSession);
    }

    public String toString() {
        BaseDeeplinkAction baseDeeplinkAction = this.action;
        Deeplink deeplink = this.fallback;
        DeeplinkNavigation deeplinkNavigation = this.navigation;
        DeeplinkNavigationAnimation deeplinkNavigationAnimation = this.navigationAnimation;
        Uri uri = this.parsedUri;
        DeeplinkSource deeplinkSource = this.source;
        boolean z = this.renewSession;
        boolean z2 = this.pinRequired;
        StringBuilder sb = new StringBuilder("Deeplink(action=");
        sb.append(baseDeeplinkAction);
        sb.append(", fallback=");
        sb.append(deeplink);
        sb.append(", navigation=");
        sb.append(deeplinkNavigation);
        sb.append(", navigationAnimation=");
        sb.append(deeplinkNavigationAnimation);
        sb.append(", parsedUri=");
        sb.append(uri);
        sb.append(", source=");
        sb.append(deeplinkSource);
        sb.append(", renewSession=");
        return smw0.k(", pinRequired=", Extension.C_BRAKE, sb, z, z2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.action, flags);
        Deeplink deeplink = this.fallback;
        if (deeplink == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            deeplink.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.navigation, flags);
        dest.writeParcelable(this.navigationAnimation, flags);
        dest.writeParcelable(this.parsedUri, flags);
        dest.writeString(this.source.name());
        dest.writeInt(this.renewSession ? 1 : 0);
        dest.writeInt(this.pinRequired ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Deeplink> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Deeplink createFromParcel(Parcel parcel) {
            boolean z;
            BaseDeeplinkAction baseDeeplinkAction = (BaseDeeplinkAction) parcel.readParcelable(Deeplink.class.getClassLoader());
            Deeplink createFromParcel = parcel.readInt() == 0 ? null : Deeplink.CREATOR.createFromParcel(parcel);
            DeeplinkNavigation deeplinkNavigation = (DeeplinkNavigation) parcel.readParcelable(Deeplink.class.getClassLoader());
            DeeplinkNavigationAnimation deeplinkNavigationAnimation = (DeeplinkNavigationAnimation) parcel.readParcelable(Deeplink.class.getClassLoader());
            Uri uri = (Uri) parcel.readParcelable(Deeplink.class.getClassLoader());
            DeeplinkSource valueOf = DeeplinkSource.valueOf(parcel.readString());
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new Deeplink(baseDeeplinkAction, createFromParcel, deeplinkNavigation, deeplinkNavigationAnimation, uri, valueOf, z2, parcel.readInt() == 0 ? z : true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Deeplink[] newArray(int i) {
            return new Deeplink[i];
        }
    }

    public Deeplink(BaseDeeplinkAction baseDeeplinkAction, Deeplink deeplink, DeeplinkNavigation deeplinkNavigation, DeeplinkNavigationAnimation deeplinkNavigationAnimation, Uri uri, DeeplinkSource deeplinkSource, boolean z, boolean z2) {
        this.action = baseDeeplinkAction;
        this.fallback = deeplink;
        this.navigation = deeplinkNavigation;
        this.navigationAnimation = deeplinkNavigationAnimation;
        this.parsedUri = uri;
        this.source = deeplinkSource;
        this.renewSession = z;
        this.pinRequired = z2;
    }
}
