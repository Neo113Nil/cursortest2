package com.yandex.mapkit.search;

import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public enum Snippet {
    NONE(0),
    PHOTOS(1),
    BUSINESS_RATING1X(2),
    PANORAMAS(32),
    MASS_TRANSIT(64),
    EXPERIMENTAL(128),
    ROUTE_DISTANCES(256),
    RELATED_PLACES(512),
    BUSINESS_IMAGES(1024),
    REFERENCES(2048),
    FUEL(4096),
    EXCHANGE(8192),
    NEARBY_STOPS(16384),
    SUBTITLE(32768),
    ROUTE_POINT(65536),
    SHOWTIMES(131072),
    RELATED_ADVERTS_ON_MAP(262144),
    GOODS1X(524288),
    DISCOVERY2X(1048576),
    RELATED_ADVERTS_ON_CARD(2097152),
    VISUAL_HINTS(SelfTester_JCP.ENCRYPT_CBC),
    ENCYCLOPEDIA(SelfTester_JCP.ENCRYPT_CNT),
    PHOTOS3X(16777216),
    DISCOVERY_MENU(SelfTester_JCP.DECRYPT_CFB),
    ORG_OFFER2X(SelfTester_JCP.DECRYPT_CNT),
    ORG_OWNERSHIP(SelfTester_JCP.IMITA),
    ORG_OWNER_TODOS(536870912);

    public final int value;

    Snippet(int i) {
        this.value = i;
    }
}
