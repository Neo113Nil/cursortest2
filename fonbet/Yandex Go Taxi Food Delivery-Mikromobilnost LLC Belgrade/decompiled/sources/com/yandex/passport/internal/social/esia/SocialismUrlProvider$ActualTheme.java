package com.yandex.passport.internal.social.esia;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/yandex/passport/internal/social/esia/SocialismUrlProvider$ActualTheme", "Landroid/os/Parcelable;", "", "Lcom/yandex/passport/internal/social/esia/SocialismUrlProvider$ActualTheme;", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "LIGHT", "DARK", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SocialismUrlProvider$ActualTheme implements Parcelable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SocialismUrlProvider$ActualTheme[] $VALUES;
    public static final Parcelable.Creator<SocialismUrlProvider$ActualTheme> CREATOR;
    public static final SocialismUrlProvider$ActualTheme LIGHT = new SocialismUrlProvider$ActualTheme("LIGHT", 0);
    public static final SocialismUrlProvider$ActualTheme DARK = new SocialismUrlProvider$ActualTheme("DARK", 1);

    private static final /* synthetic */ SocialismUrlProvider$ActualTheme[] $values() {
        return new SocialismUrlProvider$ActualTheme[]{LIGHT, DARK};
    }

    static {
        SocialismUrlProvider$ActualTheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        CREATOR = new Parcelable.Creator<SocialismUrlProvider$ActualTheme>() { // from class: com.yandex.passport.internal.social.esia.SocialismUrlProvider$ActualTheme.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SocialismUrlProvider$ActualTheme createFromParcel(Parcel parcel) {
                return SocialismUrlProvider$ActualTheme.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SocialismUrlProvider$ActualTheme[] newArray(int i) {
                return new SocialismUrlProvider$ActualTheme[i];
            }
        };
    }

    private SocialismUrlProvider$ActualTheme(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SocialismUrlProvider$ActualTheme valueOf(String str) {
        return (SocialismUrlProvider$ActualTheme) Enum.valueOf(SocialismUrlProvider$ActualTheme.class, str);
    }

    public static SocialismUrlProvider$ActualTheme[] values() {
        return (SocialismUrlProvider$ActualTheme[]) $VALUES.clone();
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
