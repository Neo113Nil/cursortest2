package com.yandex.go.mainscreen.superapp.impl.header.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tsv0;
import defpackage.vn11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/header/experiment/SuperAppConfigMenuExperiment;", "Lvn11;", "Companion", "MenuIconType", "com/yandex/go/mainscreen/superapp/impl/header/experiment/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperAppConfigMenuExperiment implements vn11 {
    public static final c Companion = new c();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(0))};
    public static final SuperAppConfigMenuExperiment d = new SuperAppConfigMenuExperiment(0);
    public final MenuIconType b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/header/experiment/SuperAppConfigMenuExperiment$MenuIconType;", "", "Companion", "com/yandex/go/mainscreen/superapp/impl/header/experiment/d", "AVATAR", "HAMBURGER", "FLOATING_AVATAR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class MenuIconType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ MenuIconType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final MenuIconType AVATAR;
        public static final d Companion;
        public static final MenuIconType FLOATING_AVATAR;
        public static final MenuIconType HAMBURGER;

        static {
            MenuIconType menuIconType = new MenuIconType("AVATAR", 0);
            AVATAR = menuIconType;
            MenuIconType menuIconType2 = new MenuIconType("HAMBURGER", 1);
            HAMBURGER = menuIconType2;
            MenuIconType menuIconType3 = new MenuIconType("FLOATING_AVATAR", 2);
            FLOATING_AVATAR = menuIconType3;
            MenuIconType[] menuIconTypeArr = {menuIconType, menuIconType2, menuIconType3};
            $VALUES = menuIconTypeArr;
            $ENTRIES = kotlin.enums.a.a(menuIconTypeArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(1));
        }

        public static MenuIconType valueOf(String str) {
            return (MenuIconType) Enum.valueOf(MenuIconType.class, str);
        }

        public static MenuIconType[] values() {
            return (MenuIconType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SuperAppConfigMenuExperiment(int i, MenuIconType menuIconType) {
        if ((i & 1) == 0) {
            this.b = MenuIconType.HAMBURGER;
        } else {
            this.b = menuIconType;
        }
    }

    public SuperAppConfigMenuExperiment() {
        this(0);
    }

    public SuperAppConfigMenuExperiment(int i) {
        this.b = MenuIconType.HAMBURGER;
    }
}
