package org.chromium.base;

/* loaded from: classes8.dex */
public interface UnownedUserData {
    default boolean informOnDetachmentFromHost() {
        return true;
    }

    default void onDetachedFromHost(UnownedUserDataHost unownedUserDataHost) {
    }
}
