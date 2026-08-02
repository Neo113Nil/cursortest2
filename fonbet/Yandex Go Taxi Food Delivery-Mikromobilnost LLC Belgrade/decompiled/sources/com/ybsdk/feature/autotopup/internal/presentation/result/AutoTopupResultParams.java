package com.ybsdk.feature.autotopup.internal.presentation.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.analytics.generated.AutoTopupSettingsResultTypeAutotopup;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.CommonSheetEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.nnm;
import defpackage.oo31;
import defpackage.tse0;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "isV2RequestStatusEnabled", "", "()Z", "NoPolling", "Polling", "ShowPaymentInfo", "Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams$NoPolling;", "Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams$Polling;", "Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams$ShowPaymentInfo;", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AutoTopupResultParams extends ScreenParams {
    boolean isV2RequestStatusEnabled();

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%Jd\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b5\u0010 R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b\u000b\u0010#R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u0010%¨\u00069"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams$NoPolling;", "Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams;", "Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "primaryButton", "secondaryButton", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "imageUrl", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", "isV2RequestStatusEnabled", "", "Lcom/ybsdk/core/analytics/generated/AutoTopupSettingsResultTypeAutotopup;", "resultAnalyticsTypes", "<init>", "(Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "component2", "component3", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Z", "component7", "()Ljava/util/List;", "copy", "(Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams$NoPolling;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "getPrimaryButton", "getSecondaryButton", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getImageUrl", "Ljava/lang/String;", "getTitle", "getDescription", "Z", "Ljava/util/List;", "getResultAnalyticsTypes", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoPolling implements AutoTopupResultParams {
        public static final Parcelable.Creator<NoPolling> CREATOR = new Creator();
        private final String description;
        private final ThemedImageUrlEntity imageUrl;
        private final boolean isV2RequestStatusEnabled;
        private final ActionButtonEntity primaryButton;
        private final List<AutoTopupSettingsResultTypeAutotopup> resultAnalyticsTypes;
        private final ActionButtonEntity secondaryButton;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public NoPolling(ActionButtonEntity actionButtonEntity, ActionButtonEntity actionButtonEntity2, ThemedImageUrlEntity themedImageUrlEntity, String str, String str2, boolean z, List<? extends AutoTopupSettingsResultTypeAutotopup> list) {
            this.primaryButton = actionButtonEntity;
            this.secondaryButton = actionButtonEntity2;
            this.imageUrl = themedImageUrlEntity;
            this.title = str;
            this.description = str2;
            this.isV2RequestStatusEnabled = z;
            this.resultAnalyticsTypes = list;
        }

        public static /* synthetic */ NoPolling copy$default(NoPolling noPolling, ActionButtonEntity actionButtonEntity, ActionButtonEntity actionButtonEntity2, ThemedImageUrlEntity themedImageUrlEntity, String str, String str2, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                actionButtonEntity = noPolling.primaryButton;
            }
            if ((i & 2) != 0) {
                actionButtonEntity2 = noPolling.secondaryButton;
            }
            if ((i & 4) != 0) {
                themedImageUrlEntity = noPolling.imageUrl;
            }
            if ((i & 8) != 0) {
                str = noPolling.title;
            }
            if ((i & 16) != 0) {
                str2 = noPolling.description;
            }
            if ((i & 32) != 0) {
                z = noPolling.isV2RequestStatusEnabled;
            }
            if ((i & 64) != 0) {
                list = noPolling.resultAnalyticsTypes;
            }
            boolean z2 = z;
            List list2 = list;
            String str3 = str2;
            ThemedImageUrlEntity themedImageUrlEntity2 = themedImageUrlEntity;
            return noPolling.copy(actionButtonEntity, actionButtonEntity2, themedImageUrlEntity2, str, str3, z2, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final ActionButtonEntity getPrimaryButton() {
            return this.primaryButton;
        }

        /* renamed from: component2, reason: from getter */
        public final ActionButtonEntity getSecondaryButton() {
            return this.secondaryButton;
        }

        /* renamed from: component3, reason: from getter */
        public final ThemedImageUrlEntity getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsV2RequestStatusEnabled() {
            return this.isV2RequestStatusEnabled;
        }

        public final List<AutoTopupSettingsResultTypeAutotopup> component7() {
            return this.resultAnalyticsTypes;
        }

        public final NoPolling copy(ActionButtonEntity primaryButton, ActionButtonEntity secondaryButton, ThemedImageUrlEntity imageUrl, String title, String description, boolean isV2RequestStatusEnabled, List<? extends AutoTopupSettingsResultTypeAutotopup> resultAnalyticsTypes) {
            return new NoPolling(primaryButton, secondaryButton, imageUrl, title, description, isV2RequestStatusEnabled, resultAnalyticsTypes);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoPolling)) {
                return false;
            }
            NoPolling noPolling = (NoPolling) other;
            return jl40.l(this.primaryButton, noPolling.primaryButton) && jl40.l(this.secondaryButton, noPolling.secondaryButton) && jl40.l(this.imageUrl, noPolling.imageUrl) && jl40.l(this.title, noPolling.title) && jl40.l(this.description, noPolling.description) && this.isV2RequestStatusEnabled == noPolling.isV2RequestStatusEnabled && jl40.l(this.resultAnalyticsTypes, noPolling.resultAnalyticsTypes);
        }

        public final String getDescription() {
            return this.description;
        }

        public final ThemedImageUrlEntity getImageUrl() {
            return this.imageUrl;
        }

        public final ActionButtonEntity getPrimaryButton() {
            return this.primaryButton;
        }

        public final List<AutoTopupSettingsResultTypeAutotopup> getResultAnalyticsTypes() {
            return this.resultAnalyticsTypes;
        }

        public final ActionButtonEntity getSecondaryButton() {
            return this.secondaryButton;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.primaryButton.hashCode() * 31;
            ActionButtonEntity actionButtonEntity = this.secondaryButton;
            int hashCode2 = (hashCode + (actionButtonEntity == null ? 0 : actionButtonEntity.hashCode())) * 31;
            ThemedImageUrlEntity themedImageUrlEntity = this.imageUrl;
            int b = unr0.b((hashCode2 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31, 31, this.title);
            String str = this.description;
            int e = unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.isV2RequestStatusEnabled);
            List<AutoTopupSettingsResultTypeAutotopup> list = this.resultAnalyticsTypes;
            return e + (list != null ? list.hashCode() : 0);
        }

        @Override // com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams
        public boolean isV2RequestStatusEnabled() {
            return this.isV2RequestStatusEnabled;
        }

        public String toString() {
            ActionButtonEntity actionButtonEntity = this.primaryButton;
            ActionButtonEntity actionButtonEntity2 = this.secondaryButton;
            ThemedImageUrlEntity themedImageUrlEntity = this.imageUrl;
            String str = this.title;
            String str2 = this.description;
            boolean z = this.isV2RequestStatusEnabled;
            List<AutoTopupSettingsResultTypeAutotopup> list = this.resultAnalyticsTypes;
            StringBuilder sb = new StringBuilder("NoPolling(primaryButton=");
            sb.append(actionButtonEntity);
            sb.append(", secondaryButton=");
            sb.append(actionButtonEntity2);
            sb.append(", imageUrl=");
            sb.append(themedImageUrlEntity);
            sb.append(", title=");
            sb.append(str);
            sb.append(", description=");
            tse0.y(str2, ", isV2RequestStatusEnabled=", ", resultAnalyticsTypes=", sb, z);
            return ly3.s(sb, list, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.primaryButton, flags);
            dest.writeParcelable(this.secondaryButton, flags);
            dest.writeParcelable(this.imageUrl, flags);
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeInt(this.isV2RequestStatusEnabled ? 1 : 0);
            List<AutoTopupSettingsResultTypeAutotopup> list = this.resultAnalyticsTypes;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator m = oo31.m(dest, 1, list);
            while (m.hasNext()) {
                dest.writeString(((AutoTopupSettingsResultTypeAutotopup) m.next()).name());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NoPolling> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoPolling createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ActionButtonEntity actionButtonEntity = (ActionButtonEntity) parcel.readParcelable(NoPolling.class.getClassLoader());
                ActionButtonEntity actionButtonEntity2 = (ActionButtonEntity) parcel.readParcelable(NoPolling.class.getClassLoader());
                ThemedImageUrlEntity themedImageUrlEntity = (ThemedImageUrlEntity) parcel.readParcelable(NoPolling.class.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList2.add(AutoTopupSettingsResultTypeAutotopup.valueOf(parcel.readString()));
                    }
                    arrayList = arrayList2;
                }
                return new NoPolling(actionButtonEntity, actionButtonEntity2, themedImageUrlEntity, readString, readString2, z, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoPolling[] newArray(int i) {
                return new NoPolling[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)Jp\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001dJ\u0010\u0010-\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b-\u0010\u001bJ\u001a\u00100\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b:\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b;\u0010\u001dR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b\r\u0010'R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010)¨\u0006?"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams$Polling;", "Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams;", "", "requestId", "Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "primaryButton", "Lcom/ybsdk/core/common/domain/entities/CommonSheetEntity;", "appNotFoundSheetEntity", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "imageUrl", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", "isV2RequestStatusEnabled", "", "Lcom/ybsdk/core/analytics/generated/AutoTopupSettingsResultTypeAutotopup;", "resultAnalyticsTypes", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Lcom/ybsdk/core/common/domain/entities/CommonSheetEntity;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "component3", "()Lcom/ybsdk/core/common/domain/entities/CommonSheetEntity;", "component4", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component5", "component6", "component7", "()Z", "component8", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Lcom/ybsdk/core/common/domain/entities/CommonSheetEntity;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams$Polling;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestId", "Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "getPrimaryButton", "Lcom/ybsdk/core/common/domain/entities/CommonSheetEntity;", "getAppNotFoundSheetEntity", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getImageUrl", "getTitle", "getDescription", "Z", "Ljava/util/List;", "getResultAnalyticsTypes", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Polling implements AutoTopupResultParams {
        public static final Parcelable.Creator<Polling> CREATOR = new Creator();
        private final CommonSheetEntity appNotFoundSheetEntity;
        private final String description;
        private final ThemedImageUrlEntity imageUrl;
        private final boolean isV2RequestStatusEnabled;
        private final ActionButtonEntity primaryButton;
        private final String requestId;
        private final List<AutoTopupSettingsResultTypeAutotopup> resultAnalyticsTypes;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public Polling(String str, ActionButtonEntity actionButtonEntity, CommonSheetEntity commonSheetEntity, ThemedImageUrlEntity themedImageUrlEntity, String str2, String str3, boolean z, List<? extends AutoTopupSettingsResultTypeAutotopup> list) {
            this.requestId = str;
            this.primaryButton = actionButtonEntity;
            this.appNotFoundSheetEntity = commonSheetEntity;
            this.imageUrl = themedImageUrlEntity;
            this.title = str2;
            this.description = str3;
            this.isV2RequestStatusEnabled = z;
            this.resultAnalyticsTypes = list;
        }

        public static /* synthetic */ Polling copy$default(Polling polling, String str, ActionButtonEntity actionButtonEntity, CommonSheetEntity commonSheetEntity, ThemedImageUrlEntity themedImageUrlEntity, String str2, String str3, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = polling.requestId;
            }
            if ((i & 2) != 0) {
                actionButtonEntity = polling.primaryButton;
            }
            if ((i & 4) != 0) {
                commonSheetEntity = polling.appNotFoundSheetEntity;
            }
            if ((i & 8) != 0) {
                themedImageUrlEntity = polling.imageUrl;
            }
            if ((i & 16) != 0) {
                str2 = polling.title;
            }
            if ((i & 32) != 0) {
                str3 = polling.description;
            }
            if ((i & 64) != 0) {
                z = polling.isV2RequestStatusEnabled;
            }
            if ((i & 128) != 0) {
                list = polling.resultAnalyticsTypes;
            }
            boolean z2 = z;
            List list2 = list;
            String str4 = str2;
            String str5 = str3;
            return polling.copy(str, actionButtonEntity, commonSheetEntity, themedImageUrlEntity, str4, str5, z2, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        /* renamed from: component2, reason: from getter */
        public final ActionButtonEntity getPrimaryButton() {
            return this.primaryButton;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonSheetEntity getAppNotFoundSheetEntity() {
            return this.appNotFoundSheetEntity;
        }

        /* renamed from: component4, reason: from getter */
        public final ThemedImageUrlEntity getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsV2RequestStatusEnabled() {
            return this.isV2RequestStatusEnabled;
        }

        public final List<AutoTopupSettingsResultTypeAutotopup> component8() {
            return this.resultAnalyticsTypes;
        }

        public final Polling copy(String requestId, ActionButtonEntity primaryButton, CommonSheetEntity appNotFoundSheetEntity, ThemedImageUrlEntity imageUrl, String title, String description, boolean isV2RequestStatusEnabled, List<? extends AutoTopupSettingsResultTypeAutotopup> resultAnalyticsTypes) {
            return new Polling(requestId, primaryButton, appNotFoundSheetEntity, imageUrl, title, description, isV2RequestStatusEnabled, resultAnalyticsTypes);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Polling)) {
                return false;
            }
            Polling polling = (Polling) other;
            return jl40.l(this.requestId, polling.requestId) && jl40.l(this.primaryButton, polling.primaryButton) && jl40.l(this.appNotFoundSheetEntity, polling.appNotFoundSheetEntity) && jl40.l(this.imageUrl, polling.imageUrl) && jl40.l(this.title, polling.title) && jl40.l(this.description, polling.description) && this.isV2RequestStatusEnabled == polling.isV2RequestStatusEnabled && jl40.l(this.resultAnalyticsTypes, polling.resultAnalyticsTypes);
        }

        public final CommonSheetEntity getAppNotFoundSheetEntity() {
            return this.appNotFoundSheetEntity;
        }

        public final String getDescription() {
            return this.description;
        }

        public final ThemedImageUrlEntity getImageUrl() {
            return this.imageUrl;
        }

        public final ActionButtonEntity getPrimaryButton() {
            return this.primaryButton;
        }

        public final String getRequestId() {
            return this.requestId;
        }

        public final List<AutoTopupSettingsResultTypeAutotopup> getResultAnalyticsTypes() {
            return this.resultAnalyticsTypes;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.requestId.hashCode() * 31;
            ActionButtonEntity actionButtonEntity = this.primaryButton;
            int hashCode2 = (hashCode + (actionButtonEntity == null ? 0 : actionButtonEntity.hashCode())) * 31;
            CommonSheetEntity commonSheetEntity = this.appNotFoundSheetEntity;
            int hashCode3 = (hashCode2 + (commonSheetEntity == null ? 0 : commonSheetEntity.hashCode())) * 31;
            ThemedImageUrlEntity themedImageUrlEntity = this.imageUrl;
            int b = unr0.b((hashCode3 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31, 31, this.title);
            String str = this.description;
            int e = unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.isV2RequestStatusEnabled);
            List<AutoTopupSettingsResultTypeAutotopup> list = this.resultAnalyticsTypes;
            return e + (list != null ? list.hashCode() : 0);
        }

        @Override // com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams
        public boolean isV2RequestStatusEnabled() {
            return this.isV2RequestStatusEnabled;
        }

        public String toString() {
            String str = this.requestId;
            ActionButtonEntity actionButtonEntity = this.primaryButton;
            CommonSheetEntity commonSheetEntity = this.appNotFoundSheetEntity;
            ThemedImageUrlEntity themedImageUrlEntity = this.imageUrl;
            String str2 = this.title;
            String str3 = this.description;
            boolean z = this.isV2RequestStatusEnabled;
            List<AutoTopupSettingsResultTypeAutotopup> list = this.resultAnalyticsTypes;
            StringBuilder sb = new StringBuilder("Polling(requestId=");
            sb.append(str);
            sb.append(", primaryButton=");
            sb.append(actionButtonEntity);
            sb.append(", appNotFoundSheetEntity=");
            sb.append(commonSheetEntity);
            sb.append(", imageUrl=");
            sb.append(themedImageUrlEntity);
            sb.append(", title=");
            g8e.D(sb, str2, ", description=", str3, ", isV2RequestStatusEnabled=");
            sb.append(z);
            sb.append(", resultAnalyticsTypes=");
            sb.append(list);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.requestId);
            dest.writeParcelable(this.primaryButton, flags);
            dest.writeParcelable(this.appNotFoundSheetEntity, flags);
            dest.writeParcelable(this.imageUrl, flags);
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeInt(this.isV2RequestStatusEnabled ? 1 : 0);
            List<AutoTopupSettingsResultTypeAutotopup> list = this.resultAnalyticsTypes;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator m = oo31.m(dest, 1, list);
            while (m.hasNext()) {
                dest.writeString(((AutoTopupSettingsResultTypeAutotopup) m.next()).name());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Polling> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Polling createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                ActionButtonEntity actionButtonEntity = (ActionButtonEntity) parcel.readParcelable(Polling.class.getClassLoader());
                CommonSheetEntity commonSheetEntity = (CommonSheetEntity) parcel.readParcelable(Polling.class.getClassLoader());
                ThemedImageUrlEntity themedImageUrlEntity = (ThemedImageUrlEntity) parcel.readParcelable(Polling.class.getClassLoader());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList.add(AutoTopupSettingsResultTypeAutotopup.valueOf(parcel.readString()));
                    }
                }
                return new Polling(readString, actionButtonEntity, commonSheetEntity, themedImageUrlEntity, readString2, readString3, z, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Polling[] newArray(int i) {
                return new Polling[i];
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b\u0007\u0010\u0018¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams$ShowPaymentInfo;", "Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams;", "", "agreementId", "source", "type", "", "isV2RequestStatusEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupResultParams$ShowPaymentInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "getSource", "getType", "Z", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowPaymentInfo implements AutoTopupResultParams {
        public static final Parcelable.Creator<ShowPaymentInfo> CREATOR = new Creator();
        private final String agreementId;
        private final boolean isV2RequestStatusEnabled;
        private final String source;
        private final String type;

        public ShowPaymentInfo(String str, String str2, String str3, boolean z) {
            this.agreementId = str;
            this.source = str2;
            this.type = str3;
            this.isV2RequestStatusEnabled = z;
        }

        public static /* synthetic */ ShowPaymentInfo copy$default(ShowPaymentInfo showPaymentInfo, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showPaymentInfo.agreementId;
            }
            if ((i & 2) != 0) {
                str2 = showPaymentInfo.source;
            }
            if ((i & 4) != 0) {
                str3 = showPaymentInfo.type;
            }
            if ((i & 8) != 0) {
                z = showPaymentInfo.isV2RequestStatusEnabled;
            }
            return showPaymentInfo.copy(str, str2, str3, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsV2RequestStatusEnabled() {
            return this.isV2RequestStatusEnabled;
        }

        public final ShowPaymentInfo copy(String agreementId, String source, String type, boolean isV2RequestStatusEnabled) {
            return new ShowPaymentInfo(agreementId, source, type, isV2RequestStatusEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowPaymentInfo)) {
                return false;
            }
            ShowPaymentInfo showPaymentInfo = (ShowPaymentInfo) other;
            return jl40.l(this.agreementId, showPaymentInfo.agreementId) && jl40.l(this.source, showPaymentInfo.source) && jl40.l(this.type, showPaymentInfo.type) && this.isV2RequestStatusEnabled == showPaymentInfo.isV2RequestStatusEnabled;
        }

        public final String getAgreementId() {
            return this.agreementId;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.agreementId.hashCode() * 31;
            String str = this.source;
            return Boolean.hashCode(this.isV2RequestStatusEnabled) + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.type);
        }

        @Override // com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams
        public boolean isV2RequestStatusEnabled() {
            return this.isV2RequestStatusEnabled;
        }

        public String toString() {
            String str = this.agreementId;
            String str2 = this.source;
            return nnm.i(this.type, ", isV2RequestStatusEnabled=", Extension.C_BRAKE, b64.v("ShowPaymentInfo(agreementId=", str, ", source=", str2, ", type="), this.isV2RequestStatusEnabled);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.agreementId);
            dest.writeString(this.source);
            dest.writeString(this.type);
            dest.writeInt(this.isV2RequestStatusEnabled ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ShowPaymentInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowPaymentInfo createFromParcel(Parcel parcel) {
                return new ShowPaymentInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowPaymentInfo[] newArray(int i) {
                return new ShowPaymentInfo[i];
            }
        }
    }
}
