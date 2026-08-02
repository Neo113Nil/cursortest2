package com.ybsdk.feature.transfer.version2.internal.screens.fund.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.transfer.version2.internal.screens.fund.FundDocsNoticeFragment;
import defpackage.bos;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/fund/model/FundDocsNoticeResult;", "Landroid/os/Parcelable;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Companion", GlideBitmapDownloader.ACCEPT_HEADER, "bos", "Lcom/ybsdk/feature/transfer/version2/internal/screens/fund/model/FundDocsNoticeResult$Accept;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FundDocsNoticeResult extends Parcelable {
    public static final bos Companion = bos.a;

    Bundle toBundle();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/fund/model/FundDocsNoticeResult$Accept;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/fund/model/FundDocsNoticeResult;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Accept implements FundDocsNoticeResult {
        public static final Accept INSTANCE = new Accept();
        public static final Parcelable.Creator<Accept> CREATOR = new Creator();

        private Accept() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Accept);
        }

        public int hashCode() {
            return 1453857848;
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.fund.model.FundDocsNoticeResult
        public Bundle toBundle() {
            return wwg.g(new Pair(FundDocsNoticeFragment.RESULT_KEY, this));
        }

        public String toString() {
            return GlideBitmapDownloader.ACCEPT_HEADER;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Accept> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Accept createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Accept.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Accept[] newArray(int i) {
                return new Accept[i];
            }
        }
    }
}
