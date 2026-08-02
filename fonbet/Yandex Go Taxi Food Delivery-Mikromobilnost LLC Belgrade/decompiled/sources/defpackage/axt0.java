package defpackage;

import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.database.ReadState;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0007\"\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Laxt0;", "", "", "sql", "Landroid/database/sqlite/SQLiteStatement;", "g", "(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;", "", "selectionArgs", "Lcom/yandex/div/storage/database/ReadState;", "k", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/yandex/div/storage/database/ReadState;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface axt0 {
    SQLiteStatement g(String sql);

    ReadState k(String sql, String... selectionArgs);
}
