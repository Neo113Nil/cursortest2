package com.ybsdk.feature.divkit.common.screen.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.div.state.db.StateEntry;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/divkit/common/screen/api/DivkitCommonScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", StateEntry.COLUMN_PATH, "", "getPath", "()Ljava/lang/String;", "skeletonId", "getSkeletonId", MetaDataField.SCREEN_FIELD, "getScreen", "screenConfig", "Lcom/ybsdk/feature/divkit/common/screen/api/DivkitScreenConfig;", "getScreenConfig", "()Lcom/ybsdk/feature/divkit/common/screen/api/DivkitScreenConfig;", "Default", "A3Requisites", "Lcom/ybsdk/feature/divkit/common/screen/api/DivkitCommonScreenParams$A3Requisites;", "Lcom/ybsdk/feature/divkit/common/screen/api/DivkitCommonScreenParams$Default;", "feature-divkit-common-screen-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DivkitCommonScreenParams extends ScreenParams {
    String getPath();

    String getScreen();

    DivkitScreenConfig getScreenConfig();

    String getSkeletonId();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015JF\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\u0015¨\u0006+"}, d2 = {"Lcom/ybsdk/feature/divkit/common/screen/api/DivkitCommonScreenParams$A3Requisites;", "Lcom/ybsdk/feature/divkit/common/screen/api/DivkitCommonScreenParams;", "", StateEntry.COLUMN_PATH, "skeletonId", MetaDataField.SCREEN_FIELD, "Lcom/ybsdk/feature/divkit/common/screen/api/DivkitScreenConfig;", "screenConfig", "invoiceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/divkit/common/screen/api/DivkitScreenConfig;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/ybsdk/feature/divkit/common/screen/api/DivkitScreenConfig;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/divkit/common/screen/api/DivkitScreenConfig;Ljava/lang/String;)Lcom/ybsdk/feature/divkit/common/screen/api/DivkitCommonScreenParams$A3Requisites;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "getSkeletonId", "getScreen", "Lcom/ybsdk/feature/divkit/common/screen/api/DivkitScreenConfig;", "getScreenConfig", "getInvoiceId", "feature-divkit-common-screen-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class A3Requisites implements DivkitCommonScreenParams {
        public static final Parcelable.Creator<A3Requisites> CREATOR = new Creator();
        private final String invoiceId;
        private final String path;
        private final String screen;
        private final DivkitScreenConfig screenConfig;
        private final String skeletonId;

        public A3Requisites(String str, String str2, String str3, DivkitScreenConfig divkitScreenConfig, String str4) {
            this.path = str;
            this.skeletonId = str2;
            this.screen = str3;
            this.screenConfig = divkitScreenConfig;
            this.invoiceId = str4;
        }

        public static /* synthetic */ A3Requisites copy$default(A3Requisites a3Requisites, String str, String str2, String str3, DivkitScreenConfig divkitScreenConfig, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = a3Requisites.path;
            }
            if ((i & 2) != 0) {
                str2 = a3Requisites.skeletonId;
            }
            if ((i & 4) != 0) {
                str3 = a3Requisites.screen;
            }
            if ((i & 8) != 0) {
                divkitScreenConfig = a3Requisites.screenConfig;
            }
            if ((i & 16) != 0) {
                str4 = a3Requisites.invoiceId;
            }
            String str5 = str4;
            String str6 = str3;
            return a3Requisites.copy(str, str2, str6, divkitScreenConfig, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSkeletonId() {
            return this.skeletonId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getScreen() {
            return this.screen;
        }

        /* renamed from: component4, reason: from getter */
        public final DivkitScreenConfig getScreenConfig() {
            return this.screenConfig;
        }

        /* renamed from: component5, reason: from getter */
        public final String getInvoiceId() {
            return this.invoiceId;
        }

        public final A3Requisites copy(String path, String skeletonId, String screen, DivkitScreenConfig screenConfig, String invoiceId) {
            return new A3Requisites(path, skeletonId, screen, screenConfig, invoiceId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof A3Requisites)) {
                return false;
            }
            A3Requisites a3Requisites = (A3Requisites) other;
            return jl40.l(this.path, a3Requisites.path) && jl40.l(this.skeletonId, a3Requisites.skeletonId) && jl40.l(this.screen, a3Requisites.screen) && jl40.l(this.screenConfig, a3Requisites.screenConfig) && jl40.l(this.invoiceId, a3Requisites.invoiceId);
        }

        public final String getInvoiceId() {
            return this.invoiceId;
        }

        @Override // com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams
        public String getPath() {
            return this.path;
        }

        @Override // com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams
        public String getScreen() {
            return this.screen;
        }

        @Override // com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams
        public DivkitScreenConfig getScreenConfig() {
            return this.screenConfig;
        }

        @Override // com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams
        public String getSkeletonId() {
            return this.skeletonId;
        }

        public int hashCode() {
            int hashCode = this.path.hashCode() * 31;
            String str = this.skeletonId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.screen;
            int hashCode3 = str2 != null ? str2.hashCode() : 0;
            return this.invoiceId.hashCode() + ((this.screenConfig.hashCode() + ((hashCode2 + hashCode3) * 31)) * 31);
        }

        public String toString() {
            String str = this.path;
            String str2 = this.skeletonId;
            String str3 = this.screen;
            DivkitScreenConfig divkitScreenConfig = this.screenConfig;
            String str4 = this.invoiceId;
            StringBuilder v = b64.v("A3Requisites(path=", str, ", skeletonId=", str2, ", screen=");
            v.append(str3);
            v.append(", screenConfig=");
            v.append(divkitScreenConfig);
            v.append(", invoiceId=");
            return oyr.t(v, str4, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.path);
            dest.writeString(this.skeletonId);
            dest.writeString(this.screen);
            this.screenConfig.writeToParcel(dest, flags);
            dest.writeString(this.invoiceId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<A3Requisites> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final A3Requisites createFromParcel(Parcel parcel) {
                return new A3Requisites(parcel.readString(), parcel.readString(), parcel.readString(), DivkitScreenConfig.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final A3Requisites[] newArray(int i) {
                return new A3Requisites[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015JH\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\u0015¨\u0006+"}, d2 = {"Lcom/ybsdk/feature/divkit/common/screen/api/DivkitCommonScreenParams$Default;", "Lcom/ybsdk/feature/divkit/common/screen/api/DivkitCommonScreenParams;", "", StateEntry.COLUMN_PATH, "skeletonId", MetaDataField.SCREEN_FIELD, "Lcom/ybsdk/feature/divkit/common/screen/api/DivkitScreenConfig;", "screenConfig", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/divkit/common/screen/api/DivkitScreenConfig;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/ybsdk/feature/divkit/common/screen/api/DivkitScreenConfig;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/divkit/common/screen/api/DivkitScreenConfig;Ljava/lang/String;)Lcom/ybsdk/feature/divkit/common/screen/api/DivkitCommonScreenParams$Default;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "getSkeletonId", "getScreen", "Lcom/ybsdk/feature/divkit/common/screen/api/DivkitScreenConfig;", "getScreenConfig", "getPayload", "feature-divkit-common-screen-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Default implements DivkitCommonScreenParams {
        public static final Parcelable.Creator<Default> CREATOR = new Creator();
        private final String path;
        private final String payload;
        private final String screen;
        private final DivkitScreenConfig screenConfig;
        private final String skeletonId;

        public Default(String str, String str2, String str3, DivkitScreenConfig divkitScreenConfig, String str4) {
            this.path = str;
            this.skeletonId = str2;
            this.screen = str3;
            this.screenConfig = divkitScreenConfig;
            this.payload = str4;
        }

        public static /* synthetic */ Default copy$default(Default r0, String str, String str2, String str3, DivkitScreenConfig divkitScreenConfig, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.path;
            }
            if ((i & 2) != 0) {
                str2 = r0.skeletonId;
            }
            if ((i & 4) != 0) {
                str3 = r0.screen;
            }
            if ((i & 8) != 0) {
                divkitScreenConfig = r0.screenConfig;
            }
            if ((i & 16) != 0) {
                str4 = r0.payload;
            }
            String str5 = str4;
            String str6 = str3;
            return r0.copy(str, str2, str6, divkitScreenConfig, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSkeletonId() {
            return this.skeletonId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getScreen() {
            return this.screen;
        }

        /* renamed from: component4, reason: from getter */
        public final DivkitScreenConfig getScreenConfig() {
            return this.screenConfig;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        public final Default copy(String path, String skeletonId, String screen, DivkitScreenConfig screenConfig, String payload) {
            return new Default(path, skeletonId, screen, screenConfig, payload);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Default)) {
                return false;
            }
            Default r5 = (Default) other;
            return jl40.l(this.path, r5.path) && jl40.l(this.skeletonId, r5.skeletonId) && jl40.l(this.screen, r5.screen) && jl40.l(this.screenConfig, r5.screenConfig) && jl40.l(this.payload, r5.payload);
        }

        @Override // com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams
        public String getPath() {
            return this.path;
        }

        public final String getPayload() {
            return this.payload;
        }

        @Override // com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams
        public String getScreen() {
            return this.screen;
        }

        @Override // com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams
        public DivkitScreenConfig getScreenConfig() {
            return this.screenConfig;
        }

        @Override // com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams
        public String getSkeletonId() {
            return this.skeletonId;
        }

        public int hashCode() {
            int hashCode = this.path.hashCode() * 31;
            String str = this.skeletonId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.screen;
            int hashCode3 = (this.screenConfig.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.payload;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.path;
            String str2 = this.skeletonId;
            String str3 = this.screen;
            DivkitScreenConfig divkitScreenConfig = this.screenConfig;
            String str4 = this.payload;
            StringBuilder v = b64.v("Default(path=", str, ", skeletonId=", str2, ", screen=");
            v.append(str3);
            v.append(", screenConfig=");
            v.append(divkitScreenConfig);
            v.append(", payload=");
            return oyr.t(v, str4, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.path);
            dest.writeString(this.skeletonId);
            dest.writeString(this.screen);
            this.screenConfig.writeToParcel(dest, flags);
            dest.writeString(this.payload);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Default> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                return new Default(parcel.readString(), parcel.readString(), parcel.readString(), DivkitScreenConfig.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i) {
                return new Default[i];
            }
        }
    }
}
