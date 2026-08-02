package com.yandex.passport.internal.social.esia;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties;", "Landroid/os/Parcelable;", WebViewActivity.KEY_ENVIRONMENT, "Lcom/yandex/passport/common/core/Environment;", "getEnvironment", "()Lcom/yandex/passport/common/core/Environment;", "appTheme", "Lcom/yandex/passport/common/ui/AppTheme;", "getAppTheme", "()Lcom/yandex/passport/common/ui/AppTheme;", "UserAwareRequest", "UserUnknownRequest", "Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties$UserAwareRequest;", "Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties$UserUnknownRequest;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface EsiaInternalBindProperties extends Parcelable {
    AppTheme getAppTheme();

    Environment getEnvironment();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b+\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u001cR \u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties$UserAwareRequest;", "Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties;", "Lcom/yandex/passport/common/core/Uid;", "uid", "", ClidProvider.APPLICATION, "consumer", "scope", "Lcom/yandex/passport/common/ui/AppTheme;", "appTheme", "<init>", "(Lcom/yandex/passport/common/core/Uid;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/passport/common/ui/AppTheme;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/common/core/Uid;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/yandex/passport/common/ui/AppTheme;", "copy", "(Lcom/yandex/passport/common/core/Uid;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/passport/common/ui/AppTheme;)Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties$UserAwareRequest;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/common/core/Uid;", "getUid", "Ljava/lang/String;", "getApplication", "getConsumer", "getScope", "Lcom/yandex/passport/common/ui/AppTheme;", "getAppTheme", "Lcom/yandex/passport/common/core/Environment;", WebViewActivity.KEY_ENVIRONMENT, "Lcom/yandex/passport/common/core/Environment;", "getEnvironment", "()Lcom/yandex/passport/common/core/Environment;", "getEnvironment$annotations", "()V", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserAwareRequest implements EsiaInternalBindProperties {
        public static final int $stable = Uid.$stable;
        public static final Parcelable.Creator<UserAwareRequest> CREATOR = new Creator();
        private final AppTheme appTheme;
        private final String application;
        private final String consumer;
        private final Environment environment;
        private final String scope;
        private final Uid uid;

        public UserAwareRequest(Uid uid, String str, String str2, String str3, AppTheme appTheme) {
            this.uid = uid;
            this.application = str;
            this.consumer = str2;
            this.scope = str3;
            this.appTheme = appTheme;
            this.environment = uid.getEnvironment();
        }

        public static /* synthetic */ UserAwareRequest copy$default(UserAwareRequest userAwareRequest, Uid uid, String str, String str2, String str3, AppTheme appTheme, int i, Object obj) {
            if ((i & 1) != 0) {
                uid = userAwareRequest.uid;
            }
            if ((i & 2) != 0) {
                str = userAwareRequest.application;
            }
            if ((i & 4) != 0) {
                str2 = userAwareRequest.consumer;
            }
            if ((i & 8) != 0) {
                str3 = userAwareRequest.scope;
            }
            if ((i & 16) != 0) {
                appTheme = userAwareRequest.appTheme;
            }
            AppTheme appTheme2 = appTheme;
            String str4 = str2;
            return userAwareRequest.copy(uid, str, str4, str3, appTheme2);
        }

        public static /* synthetic */ void getEnvironment$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final Uid getUid() {
            return this.uid;
        }

        /* renamed from: component2, reason: from getter */
        public final String getApplication() {
            return this.application;
        }

        /* renamed from: component3, reason: from getter */
        public final String getConsumer() {
            return this.consumer;
        }

        /* renamed from: component4, reason: from getter */
        public final String getScope() {
            return this.scope;
        }

        /* renamed from: component5, reason: from getter */
        public final AppTheme getAppTheme() {
            return this.appTheme;
        }

        public final UserAwareRequest copy(Uid uid, String application, String consumer, String scope, AppTheme appTheme) {
            return new UserAwareRequest(uid, application, consumer, scope, appTheme);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserAwareRequest)) {
                return false;
            }
            UserAwareRequest userAwareRequest = (UserAwareRequest) other;
            return jl40.l(this.uid, userAwareRequest.uid) && jl40.l(this.application, userAwareRequest.application) && jl40.l(this.consumer, userAwareRequest.consumer) && jl40.l(this.scope, userAwareRequest.scope) && this.appTheme == userAwareRequest.appTheme;
        }

        @Override // com.yandex.passport.internal.social.esia.EsiaInternalBindProperties
        public AppTheme getAppTheme() {
            return this.appTheme;
        }

        public final String getApplication() {
            return this.application;
        }

        public final String getConsumer() {
            return this.consumer;
        }

        @Override // com.yandex.passport.internal.social.esia.EsiaInternalBindProperties
        public Environment getEnvironment() {
            return this.environment;
        }

        public final String getScope() {
            return this.scope;
        }

        public final Uid getUid() {
            return this.uid;
        }

        public int hashCode() {
            return this.appTheme.hashCode() + unr0.b(unr0.b(unr0.b(this.uid.hashCode() * 31, 31, this.application), 31, this.consumer), 31, this.scope);
        }

        public String toString() {
            return "UserAwareRequest(uid=" + this.uid + ", application=" + this.application + ", consumer=" + this.consumer + ", scope=" + this.scope + ", appTheme=" + this.appTheme + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.uid, flags);
            dest.writeString(this.application);
            dest.writeString(this.consumer);
            dest.writeString(this.scope);
            dest.writeString(this.appTheme.name());
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UserAwareRequest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserAwareRequest createFromParcel(Parcel parcel) {
                return new UserAwareRequest((Uid) parcel.readParcelable(UserAwareRequest.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), AppTheme.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserAwareRequest[] newArray(int i) {
                return new UserAwareRequest[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties$UserUnknownRequest;", "Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties;", "", "socialUrl", "Lcom/yandex/passport/common/core/Environment;", WebViewActivity.KEY_ENVIRONMENT, "Lcom/yandex/passport/common/ui/AppTheme;", "appTheme", "<init>", "(Ljava/lang/String;Lcom/yandex/passport/common/core/Environment;Lcom/yandex/passport/common/ui/AppTheme;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/passport/common/core/Environment;", "component3", "()Lcom/yandex/passport/common/ui/AppTheme;", "copy", "(Ljava/lang/String;Lcom/yandex/passport/common/core/Environment;Lcom/yandex/passport/common/ui/AppTheme;)Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties$UserUnknownRequest;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSocialUrl", "Lcom/yandex/passport/common/core/Environment;", "getEnvironment", "Lcom/yandex/passport/common/ui/AppTheme;", "getAppTheme", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserUnknownRequest implements EsiaInternalBindProperties {
        public static final int $stable = 0;
        public static final Parcelable.Creator<UserUnknownRequest> CREATOR = new Creator();
        private final AppTheme appTheme;
        private final Environment environment;
        private final String socialUrl;

        public UserUnknownRequest(String str, Environment environment, AppTheme appTheme) {
            this.socialUrl = str;
            this.environment = environment;
            this.appTheme = appTheme;
        }

        public static /* synthetic */ UserUnknownRequest copy$default(UserUnknownRequest userUnknownRequest, String str, Environment environment, AppTheme appTheme, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userUnknownRequest.socialUrl;
            }
            if ((i & 2) != 0) {
                environment = userUnknownRequest.environment;
            }
            if ((i & 4) != 0) {
                appTheme = userUnknownRequest.appTheme;
            }
            return userUnknownRequest.copy(str, environment, appTheme);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSocialUrl() {
            return this.socialUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final Environment getEnvironment() {
            return this.environment;
        }

        /* renamed from: component3, reason: from getter */
        public final AppTheme getAppTheme() {
            return this.appTheme;
        }

        public final UserUnknownRequest copy(String socialUrl, Environment environment, AppTheme appTheme) {
            return new UserUnknownRequest(socialUrl, environment, appTheme);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserUnknownRequest)) {
                return false;
            }
            UserUnknownRequest userUnknownRequest = (UserUnknownRequest) other;
            return jl40.l(this.socialUrl, userUnknownRequest.socialUrl) && this.environment == userUnknownRequest.environment && this.appTheme == userUnknownRequest.appTheme;
        }

        @Override // com.yandex.passport.internal.social.esia.EsiaInternalBindProperties
        public AppTheme getAppTheme() {
            return this.appTheme;
        }

        @Override // com.yandex.passport.internal.social.esia.EsiaInternalBindProperties
        public Environment getEnvironment() {
            return this.environment;
        }

        public final String getSocialUrl() {
            return this.socialUrl;
        }

        public int hashCode() {
            return this.appTheme.hashCode() + ((this.environment.hashCode() + (this.socialUrl.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "UserUnknownRequest(socialUrl=" + this.socialUrl + ", environment=" + this.environment + ", appTheme=" + this.appTheme + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.socialUrl);
            dest.writeParcelable(this.environment, flags);
            dest.writeString(this.appTheme.name());
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UserUnknownRequest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserUnknownRequest createFromParcel(Parcel parcel) {
                return new UserUnknownRequest(parcel.readString(), (Environment) parcel.readParcelable(UserUnknownRequest.class.getClassLoader()), AppTheme.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserUnknownRequest[] newArray(int i) {
                return new UserUnknownRequest[i];
            }
        }
    }
}
