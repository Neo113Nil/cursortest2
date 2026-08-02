package com.yandex.messaging.core.net.entities;

import com.yandex.messaging.core.net.entities.StateSyncDiff;

/* loaded from: classes15.dex */
public class UserReloadData extends PersonalUserData implements StateSyncDiff {
    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.m(this);
    }
}
