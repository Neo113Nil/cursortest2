package com.yandex.go.trusted_contacts.share_settings;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/trusted_contacts/share_settings/ShareSettingsItemType;", "", "", "id", CA20Status.STATUS_USER_I, "getId", "()I", "CONTACT", "TITLE", "SUBTITLE", "SETTINGS_OPTION", "SETTINGS_SWITCHER", "CARD_DIVIDER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ShareSettingsItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShareSettingsItemType[] $VALUES;
    public static final ShareSettingsItemType CARD_DIVIDER;
    public static final ShareSettingsItemType CONTACT;
    public static final ShareSettingsItemType SETTINGS_OPTION;
    public static final ShareSettingsItemType SETTINGS_SWITCHER;
    public static final ShareSettingsItemType SUBTITLE;
    public static final ShareSettingsItemType TITLE;
    private final int id;

    static {
        ShareSettingsItemType shareSettingsItemType = new ShareSettingsItemType("CONTACT", 0, 0);
        CONTACT = shareSettingsItemType;
        ShareSettingsItemType shareSettingsItemType2 = new ShareSettingsItemType("TITLE", 1, 1);
        TITLE = shareSettingsItemType2;
        ShareSettingsItemType shareSettingsItemType3 = new ShareSettingsItemType("SUBTITLE", 2, 2);
        SUBTITLE = shareSettingsItemType3;
        ShareSettingsItemType shareSettingsItemType4 = new ShareSettingsItemType("SETTINGS_OPTION", 3, 3);
        SETTINGS_OPTION = shareSettingsItemType4;
        ShareSettingsItemType shareSettingsItemType5 = new ShareSettingsItemType("SETTINGS_SWITCHER", 4, 4);
        SETTINGS_SWITCHER = shareSettingsItemType5;
        ShareSettingsItemType shareSettingsItemType6 = new ShareSettingsItemType("CARD_DIVIDER", 5, 5);
        CARD_DIVIDER = shareSettingsItemType6;
        ShareSettingsItemType[] shareSettingsItemTypeArr = {shareSettingsItemType, shareSettingsItemType2, shareSettingsItemType3, shareSettingsItemType4, shareSettingsItemType5, shareSettingsItemType6};
        $VALUES = shareSettingsItemTypeArr;
        $ENTRIES = kotlin.enums.a.a(shareSettingsItemTypeArr);
    }

    public ShareSettingsItemType(String str, int i, int i2) {
        this.id = i2;
    }

    public static ShareSettingsItemType valueOf(String str) {
        return (ShareSettingsItemType) Enum.valueOf(ShareSettingsItemType.class, str);
    }

    public static ShareSettingsItemType[] values() {
        return (ShareSettingsItemType[]) $VALUES.clone();
    }
}
