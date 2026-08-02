package com.vkontakte.android.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfileContentTab.kt */
/* loaded from: classes7.dex */
public final class ProfileContentTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProfileContentTab[] $VALUES;
    public static final ProfileContentTab ALBUMS;
    public static final ProfileContentTab ARTICLES;
    public static final ProfileContentTab CLIPS;
    public static final a Companion;
    public static final ProfileContentTab GIFTS;
    public static final ProfileContentTab MUSIC;
    public static final ProfileContentTab NARRATIVES;
    public static final ProfileContentTab NFTS;
    public static final ProfileContentTab PHOTOS;
    public static final ProfileContentTab VIDEOS;
    private final String serverName;

    /* compiled from: ProfileContentTab.kt */
    public static final class a {
    }

    static {
        ProfileContentTab profileContentTab = new ProfileContentTab("VIDEOS", 0, "videos");
        VIDEOS = profileContentTab;
        ProfileContentTab profileContentTab2 = new ProfileContentTab("NARRATIVES", 1, "narratives");
        NARRATIVES = profileContentTab2;
        ProfileContentTab profileContentTab3 = new ProfileContentTab("PHOTOS", 2, "photos");
        PHOTOS = profileContentTab3;
        ProfileContentTab profileContentTab4 = new ProfileContentTab("ARTICLES", 3, "articles");
        ARTICLES = profileContentTab4;
        ProfileContentTab profileContentTab5 = new ProfileContentTab("CLIPS", 4, "short_videos");
        CLIPS = profileContentTab5;
        ProfileContentTab profileContentTab6 = new ProfileContentTab("MUSIC", 5, "music");
        MUSIC = profileContentTab6;
        ProfileContentTab profileContentTab7 = new ProfileContentTab("NFTS", 6, "nfts");
        NFTS = profileContentTab7;
        ProfileContentTab profileContentTab8 = new ProfileContentTab("ALBUMS", 7, "albums");
        ALBUMS = profileContentTab8;
        ProfileContentTab profileContentTab9 = new ProfileContentTab("GIFTS", 8, "gifts");
        GIFTS = profileContentTab9;
        ProfileContentTab[] profileContentTabArr = {profileContentTab, profileContentTab2, profileContentTab3, profileContentTab4, profileContentTab5, profileContentTab6, profileContentTab7, profileContentTab8, profileContentTab9};
        $VALUES = profileContentTabArr;
        $ENTRIES = new asp(profileContentTabArr);
        Companion = new a();
    }

    public ProfileContentTab(String str, int i, String str2) {
        this.serverName = str2;
    }

    public static ProfileContentTab valueOf(String str) {
        return (ProfileContentTab) Enum.valueOf(ProfileContentTab.class, str);
    }

    public static ProfileContentTab[] values() {
        return (ProfileContentTab[]) $VALUES.clone();
    }

    public final String h() {
        return this.serverName;
    }
}
