package defpackage;

import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.database.c;
import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroid/database/sqlite/SQLiteStatement;", "", "index", "", "value", "Lzy11;", "a", "(Landroid/database/sqlite/SQLiteStatement;I[B)V", "Ljava/io/Closeable;", "b", "(Ljava/io/Closeable;)V", "Lcom/yandex/div/storage/database/c$b;", "c", "(Lcom/yandex/div/storage/database/c$b;)V", "div-storage_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class cxt0 {
    public static final void a(SQLiteStatement sQLiteStatement, int i, byte[] bArr) {
        if (bArr == null) {
            sQLiteStatement.bindNull(i);
        } else {
            sQLiteStatement.bindBlob(i, bArr);
        }
    }

    public static final void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final void c(c.b bVar) {
        try {
            bVar.t();
        } catch (IllegalStateException unused) {
        }
    }
}
