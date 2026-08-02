package xsna;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: CancellationSignalAwareCursor.kt */
/* loaded from: classes2.dex */
public final class tq9 implements Cursor {
    public final Cursor b;
    public final rq9 c;
    public final Set<rq9> d;

    public tq9(Cursor cursor, rq9 rq9Var, LinkedHashSet linkedHashSet) {
        this.b = cursor;
        this.c = rq9Var;
        this.d = linkedHashSet;
    }

    public static String b(tq9 tq9Var) {
        return "ImDatabase: query finished, active queries: " + tq9Var.d.size();
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.b.close();
            synchronized (this.d) {
                this.d.remove(this.c);
            }
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{b(this)});
        } catch (Throwable th) {
            synchronized (this.d) {
                this.d.remove(this.c);
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{b(this)});
                }
                throw th;
            }
        }
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        this.b.copyStringToBuffer(i, charArrayBuffer);
    }

    @Override // android.database.Cursor
    @ozl
    public final void deactivate() {
        this.b.deactivate();
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i) {
        return this.b.getBlob(i);
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        return this.b.getColumnCount();
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(String str) {
        return this.b.getColumnIndex(str);
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        return this.b.getColumnIndexOrThrow(str);
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i) {
        return this.b.getColumnName(i);
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.b.getColumnNames();
    }

    @Override // android.database.Cursor
    public final int getCount() {
        return this.b.getCount();
    }

    @Override // android.database.Cursor
    public final double getDouble(int i) {
        return this.b.getDouble(i);
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return this.b.getExtras();
    }

    @Override // android.database.Cursor
    public final float getFloat(int i) {
        return this.b.getFloat(i);
    }

    @Override // android.database.Cursor
    public final int getInt(int i) {
        return this.b.getInt(i);
    }

    @Override // android.database.Cursor
    public final long getLong(int i) {
        return this.b.getLong(i);
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        return this.b.getNotificationUri();
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.b.getPosition();
    }

    @Override // android.database.Cursor
    public final short getShort(int i) {
        return this.b.getShort(i);
    }

    @Override // android.database.Cursor
    public final String getString(int i) {
        return this.b.getString(i);
    }

    @Override // android.database.Cursor
    public final int getType(int i) {
        return this.b.getType(i);
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return this.b.getWantsAllOnMoveCalls();
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return this.b.isAfterLast();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return this.b.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.b.isClosed();
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.b.isFirst();
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        return this.b.isLast();
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i) {
        return this.b.isNull(i);
    }

    @Override // android.database.Cursor
    public final boolean move(int i) {
        return this.b.move(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return this.b.moveToFirst();
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return this.b.moveToLast();
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return this.b.moveToNext();
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i) {
        return this.b.moveToPosition(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return this.b.moveToPrevious();
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        this.b.registerContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.b.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    @ozl
    public final boolean requery() {
        return this.b.requery();
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return this.b.respond(bundle);
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        this.b.setExtras(bundle);
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.b.setNotificationUri(contentResolver, uri);
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        this.b.unregisterContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.b.unregisterDataSetObserver(dataSetObserver);
    }
}
