package com.yandex.go.scooters.photocontrol.data.model;

import defpackage.gsq0;
import defpackage.h5o0;
import defpackage.i3y;
import defpackage.k4o;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/photocontrol/data/model/ScootersPhotocontrolStatusResponse;", "", "Companion", "Exam", "PhotocontrolStatus", "$serializer", "com/yandex/go/scooters/photocontrol/data/model/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPhotocontrolStatusResponse {
    public static final g Companion = new g();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(9))};
    public final List a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/photocontrol/data/model/ScootersPhotocontrolStatusResponse$PhotocontrolStatus;", "", "Companion", "com/yandex/go/scooters/photocontrol/data/model/i", "SUCCESS", "FAILED", "IN_PROGRESS", "IMPOSSIBLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PhotocontrolStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PhotocontrolStatus[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final i Companion;
        public static final PhotocontrolStatus FAILED;
        public static final PhotocontrolStatus IMPOSSIBLE;
        public static final PhotocontrolStatus IN_PROGRESS;
        public static final PhotocontrolStatus SUCCESS;

        static {
            PhotocontrolStatus photocontrolStatus = new PhotocontrolStatus("SUCCESS", 0);
            SUCCESS = photocontrolStatus;
            PhotocontrolStatus photocontrolStatus2 = new PhotocontrolStatus("FAILED", 1);
            FAILED = photocontrolStatus2;
            PhotocontrolStatus photocontrolStatus3 = new PhotocontrolStatus("IN_PROGRESS", 2);
            IN_PROGRESS = photocontrolStatus3;
            PhotocontrolStatus photocontrolStatus4 = new PhotocontrolStatus("IMPOSSIBLE", 3);
            IMPOSSIBLE = photocontrolStatus4;
            PhotocontrolStatus[] photocontrolStatusArr = {photocontrolStatus, photocontrolStatus2, photocontrolStatus3, photocontrolStatus4};
            $VALUES = photocontrolStatusArr;
            $ENTRIES = kotlin.enums.a.a(photocontrolStatusArr);
            Companion = new i();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(11));
        }

        public static PhotocontrolStatus valueOf(String str) {
            return (PhotocontrolStatus) Enum.valueOf(PhotocontrolStatus.class, str);
        }

        public static PhotocontrolStatus[] values() {
            return (PhotocontrolStatus[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ScootersPhotocontrolStatusResponse(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public ScootersPhotocontrolStatusResponse() {
        this.a = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/photocontrol/data/model/ScootersPhotocontrolStatusResponse$Exam;", "", "Companion", "$serializer", "com/yandex/go/scooters/photocontrol/data/model/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Exam {
        public static final h Companion = new h();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(10))};
        public final String a;
        public final PhotocontrolStatus b;

        public /* synthetic */ Exam(int i, String str, PhotocontrolStatus photocontrolStatus) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = photocontrolStatus;
            }
        }

        public Exam() {
            this.a = null;
            this.b = null;
        }
    }
}
