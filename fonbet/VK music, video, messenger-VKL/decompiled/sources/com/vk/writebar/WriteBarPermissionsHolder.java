package com.vk.writebar;

import java.util.HashSet;
import xsna.asp;
import xsna.zrp;

/* compiled from: WriteBarPermissionsHolder.kt */
/* loaded from: classes7.dex */
public final class WriteBarPermissionsHolder {
    public final HashSet<Permission> a = new HashSet<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WriteBarPermissionsHolder.kt */
    public static final class Permission {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Permission[] $VALUES;
        public static final Permission ACHIEVEMENTS;
        public static final Permission APPS;
        public static final Permission AUDIO_MSG;
        public static final Permission BOT_KEYBOARD;
        public static final Permission DOCUMENTS_SEARCH;
        public static final Permission GIFT;
        public static final Permission GRAFFITY;
        public static final Permission LOCATION;
        public static final Permission MONEY_REQUEST;
        public static final Permission MONEY_SEND;
        public static final Permission PHOTO_FROM_GALLERY;
        public static final Permission PHOTO_FROM_VK;
        public static final Permission PHOTO_VIDEO_FROM_VK;
        public static final Permission POLL;
        public static final Permission STORY;
        public static final Permission VIDEO_MSG;

        static {
            Permission permission = new Permission("GIFT", 0);
            GIFT = permission;
            Permission permission2 = new Permission("STORY", 1);
            STORY = permission2;
            Permission permission3 = new Permission("MONEY_SEND", 2);
            MONEY_SEND = permission3;
            Permission permission4 = new Permission("MONEY_REQUEST", 3);
            MONEY_REQUEST = permission4;
            Permission permission5 = new Permission("LOCATION", 4);
            LOCATION = permission5;
            Permission permission6 = new Permission("AUDIO_MSG", 5);
            AUDIO_MSG = permission6;
            Permission permission7 = new Permission("VIDEO_MSG", 6);
            VIDEO_MSG = permission7;
            Permission permission8 = new Permission("GRAFFITY", 7);
            GRAFFITY = permission8;
            Permission permission9 = new Permission("BOT_KEYBOARD", 8);
            BOT_KEYBOARD = permission9;
            Permission permission10 = new Permission("POLL", 9);
            POLL = permission10;
            Permission permission11 = new Permission("PHOTO_VIDEO_FROM_VK", 10);
            PHOTO_VIDEO_FROM_VK = permission11;
            Permission permission12 = new Permission("DOCUMENTS_SEARCH", 11);
            DOCUMENTS_SEARCH = permission12;
            Permission permission13 = new Permission("APPS", 12);
            APPS = permission13;
            Permission permission14 = new Permission("ACHIEVEMENTS", 13);
            ACHIEVEMENTS = permission14;
            Permission permission15 = new Permission("PHOTO_FROM_VK", 14);
            PHOTO_FROM_VK = permission15;
            Permission permission16 = new Permission("PHOTO_FROM_GALLERY", 15);
            PHOTO_FROM_GALLERY = permission16;
            Permission[] permissionArr = {permission, permission2, permission3, permission4, permission5, permission6, permission7, permission8, permission9, permission10, permission11, permission12, permission13, permission14, permission15, permission16};
            $VALUES = permissionArr;
            $ENTRIES = new asp(permissionArr);
        }

        public Permission() {
            throw null;
        }

        public static Permission valueOf(String str) {
            return (Permission) Enum.valueOf(Permission.class, str);
        }

        public static Permission[] values() {
            return (Permission[]) $VALUES.clone();
        }
    }

    public final boolean a(Permission permission, boolean z) {
        HashSet<Permission> hashSet = this.a;
        return z ? hashSet.add(permission) : hashSet.remove(permission);
    }
}
