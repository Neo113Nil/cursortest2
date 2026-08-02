package com.ybsdk.feature.app.icon.api;

import defpackage.k4o;
import defpackage.zt2;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0006\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/app/icon/api/AppIcon;", "", "", "id", "alias", "", "isLegacy", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getAlias", "Z", "()Z", "Companion", "zt2", "DEFAULT", "RETRO", "FUTURE", "SWAGA", "EMO", "FIGHT_CLUB", "WALL", "GAME_BOY", "SODA", "GJEL", "DINO", "BUTTER_RED_IKRA", "BUTTER_BLACK_IKRA", "BUTTER_STUDENT", "BUTTER_FISH", "IRONY_OF_FATE", "TOMATO_JAR", "PICKLE_JAR", "HORSE", "TANGERINE", "RUSSIAN_SALAD", "TV", "RUSSIAN_BANYA", "CHAMPAGNE", "feature-app-icon-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AppIcon {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AppIcon[] $VALUES;
    public static final zt2 Companion;
    private final String alias;
    private final String id;
    private final boolean isLegacy;
    public static final AppIcon DEFAULT = new AppIcon("DEFAULT", 0, "default", "com.yb.screens.MainActivityDefault", false);
    public static final AppIcon RETRO = new AppIcon("RETRO", 1, "retro", "com.yb.screens.MainActivityRetro", false);
    public static final AppIcon FUTURE = new AppIcon("FUTURE", 2, "future", "com.yb.screens.MainActivityFuture", false);
    public static final AppIcon SWAGA = new AppIcon("SWAGA", 3, "swaga", "com.yb.screens.MainActivitySwaga", false);
    public static final AppIcon EMO = new AppIcon("EMO", 4, "emo", "com.yb.screens.MainActivityEmo", false);
    public static final AppIcon FIGHT_CLUB = new AppIcon("FIGHT_CLUB", 5, "fight_club", "com.yb.screens.MainActivityFightClub", false);
    public static final AppIcon WALL = new AppIcon("WALL", 6, "wall", "com.yb.screens.MainActivityWall", false);
    public static final AppIcon GAME_BOY = new AppIcon("GAME_BOY", 7, "game_boy", "com.yb.screens.MainActivityGameBoy", false);
    public static final AppIcon SODA = new AppIcon("SODA", 8, "soda", "com.yb.screens.MainActivitySoda", false);
    public static final AppIcon GJEL = new AppIcon("GJEL", 9, "gjel", "com.yb.screens.MainActivityGjel", false);
    public static final AppIcon DINO = new AppIcon("DINO", 10, "dino", "com.yb.screens.MainActivityDino", false);
    public static final AppIcon BUTTER_RED_IKRA = new AppIcon("BUTTER_RED_IKRA", 11, "butter_red_ikra", "com.yb.screens.MainActivityButterRedIkra", true);
    public static final AppIcon BUTTER_BLACK_IKRA = new AppIcon("BUTTER_BLACK_IKRA", 12, "butter_black_ikra", "com.yb.screens.MainActivityButterBlackIkra", true);
    public static final AppIcon BUTTER_STUDENT = new AppIcon("BUTTER_STUDENT", 13, "butter_student", "com.yb.screens.MainActivityButterStudent", true);
    public static final AppIcon BUTTER_FISH = new AppIcon("BUTTER_FISH", 14, "butter_fish", "com.yb.screens.MainActivityButterFish", true);
    public static final AppIcon IRONY_OF_FATE = new AppIcon("IRONY_OF_FATE", 15, "irony_of_fate", "com.yb.screens.MainActivityIronyOfFate", true);
    public static final AppIcon TOMATO_JAR = new AppIcon("TOMATO_JAR", 16, "tomato_jar", "com.yb.screens.MainActivityTomatoJar", true);
    public static final AppIcon PICKLE_JAR = new AppIcon("PICKLE_JAR", 17, "pickle_jar", "com.yb.screens.MainActivityPickleJar", true);
    public static final AppIcon HORSE = new AppIcon("HORSE", 18, "horse", "com.yb.screens.MainActivityHorse", true);
    public static final AppIcon TANGERINE = new AppIcon("TANGERINE", 19, "tangerine", "com.yb.screens.MainActivityTangerine", true);
    public static final AppIcon RUSSIAN_SALAD = new AppIcon("RUSSIAN_SALAD", 20, "russian_salad", "com.yb.screens.MainActivityRussianSalad", true);
    public static final AppIcon TV = new AppIcon("TV", 21, "tv", "com.yb.screens.MainActivityTv", true);
    public static final AppIcon RUSSIAN_BANYA = new AppIcon("RUSSIAN_BANYA", 22, "russian_banya", "com.yb.screens.MainActivityRussianBanya", true);
    public static final AppIcon CHAMPAGNE = new AppIcon("CHAMPAGNE", 23, "champagne", "com.yb.screens.MainActivityChampagne", true);

    private static final /* synthetic */ AppIcon[] $values() {
        return new AppIcon[]{DEFAULT, RETRO, FUTURE, SWAGA, EMO, FIGHT_CLUB, WALL, GAME_BOY, SODA, GJEL, DINO, BUTTER_RED_IKRA, BUTTER_BLACK_IKRA, BUTTER_STUDENT, BUTTER_FISH, IRONY_OF_FATE, TOMATO_JAR, PICKLE_JAR, HORSE, TANGERINE, RUSSIAN_SALAD, TV, RUSSIAN_BANYA, CHAMPAGNE};
    }

    static {
        AppIcon[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new zt2();
    }

    private AppIcon(String str, int i, String str2, String str3, boolean z) {
        this.id = str2;
        this.alias = str3;
        this.isLegacy = z;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AppIcon valueOf(String str) {
        return (AppIcon) Enum.valueOf(AppIcon.class, str);
    }

    public static AppIcon[] values() {
        return (AppIcon[]) $VALUES.clone();
    }

    public final String getAlias() {
        return this.alias;
    }

    public final String getId() {
        return this.id;
    }

    /* renamed from: isLegacy, reason: from getter */
    public final boolean getIsLegacy() {
        return this.isLegacy;
    }
}
