package xsna;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import com.vk.im.engine.reporters.performance.events.LogType;
import io.requery.android.database.CursorWindowAllocationException;
import kotlin.Result;

/* compiled from: SqliteExt.kt */
/* loaded from: classes2.dex */
public final class p6g0 implements Cursor {
    public final String b;
    public final Cursor c;

    public p6g0(Cursor cursor, String str) {
        this.b = str;
        this.c = cursor;
    }

    public final void b(Throwable th) {
        if (th instanceof CursorWindowAllocationException) {
            new r3w0(LogType.DB_ERROR, "CursorWindowAllocation", null, null, null, null, null, null, null, null, null, 16380).q();
            return;
        }
        if (!(th instanceof IllegalStateException)) {
            new r3w0(LogType.DB_ERROR, "other", null, null, null, null, null, null, null, null, null, 16380).q();
            return;
        }
        String message = th.getMessage();
        if (message == null || true != brm0.B(message, "Couldn't read row", false)) {
            new r3w0(LogType.DB_ERROR, "other", null, null, null, null, null, null, null, null, null, 16380).q();
        } else {
            new r3w0(LogType.DB_ERROR, "IllegalStateReadRow", this.b, null, null, null, null, null, null, null, null, 16376).q();
        }
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object failure;
        try {
            this.c.close();
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        Object failure;
        try {
            this.c.copyStringToBuffer(i, charArrayBuffer);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
    }

    @Override // android.database.Cursor
    @ozl
    public final void deactivate() {
        Object failure;
        try {
            this.c.deactivate();
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i) {
        Object failure;
        try {
            failure = this.c.getBlob(i);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return (byte[]) failure;
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        Object failure;
        try {
            failure = Integer.valueOf(this.c.getColumnCount());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Number) failure).intValue();
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(String str) {
        Object failure;
        try {
            failure = Integer.valueOf(this.c.getColumnIndex(str));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Number) failure).intValue();
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        Object failure;
        try {
            failure = Integer.valueOf(this.c.getColumnIndexOrThrow(str));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Number) failure).intValue();
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i) {
        Object failure;
        try {
            failure = this.c.getColumnName(i);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return (String) failure;
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        Object failure;
        try {
            failure = this.c.getColumnNames();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return (String[]) failure;
    }

    @Override // android.database.Cursor
    public final int getCount() {
        Object failure;
        try {
            failure = Integer.valueOf(this.c.getCount());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Number) failure).intValue();
    }

    @Override // android.database.Cursor
    public final double getDouble(int i) {
        Object failure;
        try {
            failure = Double.valueOf(this.c.getDouble(i));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Number) failure).doubleValue();
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        Object failure;
        try {
            failure = this.c.getExtras();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return (Bundle) failure;
    }

    @Override // android.database.Cursor
    public final float getFloat(int i) {
        Object failure;
        try {
            failure = Float.valueOf(this.c.getFloat(i));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Number) failure).floatValue();
    }

    @Override // android.database.Cursor
    public final int getInt(int i) {
        Object failure;
        try {
            failure = Integer.valueOf(this.c.getInt(i));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Number) failure).intValue();
    }

    @Override // android.database.Cursor
    public final long getLong(int i) {
        Object failure;
        try {
            failure = Long.valueOf(this.c.getLong(i));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Number) failure).longValue();
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        Object failure;
        try {
            failure = this.c.getNotificationUri();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return (Uri) failure;
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        Object failure;
        try {
            failure = Integer.valueOf(this.c.getPosition());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Number) failure).intValue();
    }

    @Override // android.database.Cursor
    public final short getShort(int i) {
        Object failure;
        try {
            failure = Short.valueOf(this.c.getShort(i));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Number) failure).shortValue();
    }

    @Override // android.database.Cursor
    public final String getString(int i) {
        Object failure;
        try {
            failure = this.c.getString(i);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return (String) failure;
    }

    @Override // android.database.Cursor
    public final int getType(int i) {
        Object failure;
        try {
            failure = Integer.valueOf(this.c.getType(i));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Number) failure).intValue();
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        Object failure;
        try {
            failure = Boolean.valueOf(this.c.getWantsAllOnMoveCalls());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Boolean) failure).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        Object failure;
        try {
            failure = Boolean.valueOf(this.c.isAfterLast());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Boolean) failure).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        Object failure;
        try {
            failure = Boolean.valueOf(this.c.isBeforeFirst());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Boolean) failure).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        Object failure;
        try {
            failure = Boolean.valueOf(this.c.isClosed());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Boolean) failure).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        Object failure;
        try {
            failure = Boolean.valueOf(this.c.isFirst());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Boolean) failure).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        Object failure;
        try {
            failure = Boolean.valueOf(this.c.isLast());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Boolean) failure).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i) {
        Object failure;
        try {
            failure = Boolean.valueOf(this.c.isNull(i));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Boolean) failure).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean move(int i) {
        Object failure;
        try {
            failure = Boolean.valueOf(this.c.move(i));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Boolean) failure).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        Object failure;
        try {
            failure = Boolean.valueOf(this.c.moveToFirst());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Boolean) failure).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        Object failure;
        try {
            failure = Boolean.valueOf(this.c.moveToLast());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Boolean) failure).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        Object failure;
        try {
            failure = Boolean.valueOf(this.c.moveToNext());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Boolean) failure).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i) {
        Object failure;
        try {
            failure = Boolean.valueOf(this.c.moveToPosition(i));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Boolean) failure).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        Object failure;
        try {
            failure = Boolean.valueOf(this.c.moveToPrevious());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Boolean) failure).booleanValue();
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        Object failure;
        try {
            this.c.registerContentObserver(contentObserver);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        Object failure;
        try {
            this.c.registerDataSetObserver(dataSetObserver);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
    }

    @Override // android.database.Cursor
    @ozl
    public final boolean requery() {
        Object failure;
        try {
            failure = Boolean.valueOf(this.c.requery());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return ((Boolean) failure).booleanValue();
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        Object failure;
        try {
            failure = this.c.respond(bundle);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
        return (Bundle) failure;
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        Object failure;
        try {
            this.c.setExtras(bundle);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        Object failure;
        try {
            this.c.setNotificationUri(contentResolver, uri);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        Object failure;
        try {
            this.c.unregisterContentObserver(contentObserver);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        Object failure;
        try {
            this.c.unregisterDataSetObserver(dataSetObserver);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            b(a);
        }
        kotlin.a.a(failure);
    }
}
