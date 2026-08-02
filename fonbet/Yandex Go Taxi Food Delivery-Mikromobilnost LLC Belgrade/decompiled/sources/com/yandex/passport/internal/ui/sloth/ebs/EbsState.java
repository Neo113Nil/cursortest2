package com.yandex.passport.internal.ui.sloth.ebs;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0081\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/ebs/EbsState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Companion", "com/yandex/passport/internal/ui/sloth/ebs/d1", "SESSION_INIT", "RETRYING_SESSION", "EBS_SDK_BIO_PHOTO_CHECK_PENDING", "ESIA_CONSENT_PENDING", "EBS_SDK_INIT_PENDING", "LOW_AGE_ALERT", "ESIA_BIO_MISSING_ALERT_V2", "ESIA_CONSENT_NEEDED", "EBS_REGISTRATION_PENDING", "EBS_REGISTRATION_TIMEOUT_V2", "EBS_SDK_CHECK_NEEDED_ALERT", "EBS_SDK_INSTALLING_ERROR_ALERT", "EBS_SDK_BIO_PHOTO_CHECK_ALERT", "EBS_SDK_BIO_PHOTO_CHECK_CONSENT_NEEDED", "EBS_SDK_BIO_PHOTO_CHECK_OPEN_SETTINGS", "EBS_SDK_BIO_PHOTO_CHECK_FAILED_ALERT", "CREATE_TRACK_ID_REQUEST_FAILED", "CREATE_JWT_REQUEST_FAILED", "START_SESSION_REQUEST_FAILED_V2", "CHECK_TRACK_ID_REQUEST_FAILED", "ESIA_BIO_CREATION_PENDING", "UNKNOWN_STATE_FOR_AM", "UNEXPECTED_AM_ERROR", "UNEXPECTED_LK_ERROR", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EbsState implements Parcelable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EbsState[] $VALUES;
    public static final Parcelable.Creator<EbsState> CREATOR;
    public static final d1 Companion;
    public static final EbsState SESSION_INIT = new EbsState("SESSION_INIT", 0);
    public static final EbsState RETRYING_SESSION = new EbsState("RETRYING_SESSION", 1);
    public static final EbsState EBS_SDK_BIO_PHOTO_CHECK_PENDING = new EbsState("EBS_SDK_BIO_PHOTO_CHECK_PENDING", 2);
    public static final EbsState ESIA_CONSENT_PENDING = new EbsState("ESIA_CONSENT_PENDING", 3);
    public static final EbsState EBS_SDK_INIT_PENDING = new EbsState("EBS_SDK_INIT_PENDING", 4);
    public static final EbsState LOW_AGE_ALERT = new EbsState("LOW_AGE_ALERT", 5);
    public static final EbsState ESIA_BIO_MISSING_ALERT_V2 = new EbsState("ESIA_BIO_MISSING_ALERT_V2", 6);
    public static final EbsState ESIA_CONSENT_NEEDED = new EbsState("ESIA_CONSENT_NEEDED", 7);
    public static final EbsState EBS_REGISTRATION_PENDING = new EbsState("EBS_REGISTRATION_PENDING", 8);
    public static final EbsState EBS_REGISTRATION_TIMEOUT_V2 = new EbsState("EBS_REGISTRATION_TIMEOUT_V2", 9);
    public static final EbsState EBS_SDK_CHECK_NEEDED_ALERT = new EbsState("EBS_SDK_CHECK_NEEDED_ALERT", 10);
    public static final EbsState EBS_SDK_INSTALLING_ERROR_ALERT = new EbsState("EBS_SDK_INSTALLING_ERROR_ALERT", 11);
    public static final EbsState EBS_SDK_BIO_PHOTO_CHECK_ALERT = new EbsState("EBS_SDK_BIO_PHOTO_CHECK_ALERT", 12);
    public static final EbsState EBS_SDK_BIO_PHOTO_CHECK_CONSENT_NEEDED = new EbsState("EBS_SDK_BIO_PHOTO_CHECK_CONSENT_NEEDED", 13);
    public static final EbsState EBS_SDK_BIO_PHOTO_CHECK_OPEN_SETTINGS = new EbsState("EBS_SDK_BIO_PHOTO_CHECK_OPEN_SETTINGS", 14);
    public static final EbsState EBS_SDK_BIO_PHOTO_CHECK_FAILED_ALERT = new EbsState("EBS_SDK_BIO_PHOTO_CHECK_FAILED_ALERT", 15);
    public static final EbsState CREATE_TRACK_ID_REQUEST_FAILED = new EbsState("CREATE_TRACK_ID_REQUEST_FAILED", 16);
    public static final EbsState CREATE_JWT_REQUEST_FAILED = new EbsState("CREATE_JWT_REQUEST_FAILED", 17);
    public static final EbsState START_SESSION_REQUEST_FAILED_V2 = new EbsState("START_SESSION_REQUEST_FAILED_V2", 18);
    public static final EbsState CHECK_TRACK_ID_REQUEST_FAILED = new EbsState("CHECK_TRACK_ID_REQUEST_FAILED", 19);
    public static final EbsState ESIA_BIO_CREATION_PENDING = new EbsState("ESIA_BIO_CREATION_PENDING", 20);
    public static final EbsState UNKNOWN_STATE_FOR_AM = new EbsState("UNKNOWN_STATE_FOR_AM", 21);
    public static final EbsState UNEXPECTED_AM_ERROR = new EbsState("UNEXPECTED_AM_ERROR", 22);
    public static final EbsState UNEXPECTED_LK_ERROR = new EbsState("UNEXPECTED_LK_ERROR", 23);

    private static final /* synthetic */ EbsState[] $values() {
        return new EbsState[]{SESSION_INIT, RETRYING_SESSION, EBS_SDK_BIO_PHOTO_CHECK_PENDING, ESIA_CONSENT_PENDING, EBS_SDK_INIT_PENDING, LOW_AGE_ALERT, ESIA_BIO_MISSING_ALERT_V2, ESIA_CONSENT_NEEDED, EBS_REGISTRATION_PENDING, EBS_REGISTRATION_TIMEOUT_V2, EBS_SDK_CHECK_NEEDED_ALERT, EBS_SDK_INSTALLING_ERROR_ALERT, EBS_SDK_BIO_PHOTO_CHECK_ALERT, EBS_SDK_BIO_PHOTO_CHECK_CONSENT_NEEDED, EBS_SDK_BIO_PHOTO_CHECK_OPEN_SETTINGS, EBS_SDK_BIO_PHOTO_CHECK_FAILED_ALERT, CREATE_TRACK_ID_REQUEST_FAILED, CREATE_JWT_REQUEST_FAILED, START_SESSION_REQUEST_FAILED_V2, CHECK_TRACK_ID_REQUEST_FAILED, ESIA_BIO_CREATION_PENDING, UNKNOWN_STATE_FOR_AM, UNEXPECTED_AM_ERROR, UNEXPECTED_LK_ERROR};
    }

    static {
        EbsState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new d1();
        CREATOR = new Parcelable.Creator<EbsState>() { // from class: com.yandex.passport.internal.ui.sloth.ebs.EbsState.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EbsState createFromParcel(Parcel parcel) {
                return EbsState.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EbsState[] newArray(int i) {
                return new EbsState[i];
            }
        };
    }

    private EbsState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static EbsState valueOf(String str) {
        return (EbsState) Enum.valueOf(EbsState.class, str);
    }

    public static EbsState[] values() {
        return (EbsState[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }
}
