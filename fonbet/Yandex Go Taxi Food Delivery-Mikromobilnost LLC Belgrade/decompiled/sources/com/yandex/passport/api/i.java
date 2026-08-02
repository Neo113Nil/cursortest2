package com.yandex.passport.api;

/* loaded from: classes8.dex */
public interface i {
    PassportAccountType getAccountType();

    String getAvatarUrl();

    String getFirstName();

    boolean getHasPlus();

    String getLastName();

    String getNativeDefaultEmail();

    s1 getPartitions();

    String getPrimaryDisplayName();

    String getSecondaryDisplayName();

    g2 getStash();

    k2 getUid();

    String getYandexoidLogin();

    boolean isAuthorized();

    boolean isAvatarEmpty();

    boolean isBetaTester();

    boolean isYandexoid();
}
