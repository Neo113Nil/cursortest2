package com.yandex.div.storage.database;

import android.database.SQLException;
import com.yandex.div.storage.database.DatabaseOpenHelper;

/* compiled from: Migration.kt */
/* loaded from: classes7.dex */
public interface Migration {
    void migrate(DatabaseOpenHelper.Database database) throws SQLException;
}
