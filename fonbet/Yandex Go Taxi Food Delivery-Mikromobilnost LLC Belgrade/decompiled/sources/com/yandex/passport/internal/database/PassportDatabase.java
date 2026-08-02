package com.yandex.passport.internal.database;

import androidx.room.RoomDatabase;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/internal/database/PassportDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class PassportDatabase extends RoomDatabase {
    public abstract com.yandex.passport.internal.database.auth_cookie.d S0();

    public abstract com.yandex.passport.internal.database.diary.d T0();

    public abstract com.yandex.passport.internal.database.diary.e U0();
}
