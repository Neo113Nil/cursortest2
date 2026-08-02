package com.yandex.messaging.internal.storage.debug;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import defpackage.cvg;
import defpackage.jxi;
import defpackage.l8x;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005H\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0007J \u0010\u0011\u001a\n \u000b*\u0004\u0018\u00010\u00100\u00102\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00020\b2\u000e\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0018\u001a\u00020\b2\u000e\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0017J \u0010\u0019\u001a\n \u000b*\u0004\u0018\u00010\u00150\u00152\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ6\u0010\u001c\u001a(\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00150\u0015 \u000b*\u0014\u0012\u000e\b\u0001\u0012\n \u000b*\u0004\u0018\u00010\u00150\u0015\u0018\u00010\u001b0\u001bH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u0014J\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\n \u000b*\u0004\u0018\u00010\"0\"H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020%2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020*2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b+\u0010,J\u0018\u0010.\u001a\n \u000b*\u0004\u0018\u00010-0-H\u0096\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b0\u0010\u0014J\u0018\u00102\u001a\u0002012\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b2\u00103J \u00104\u001a\n \u000b*\u0004\u0018\u00010\u00150\u00152\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b4\u0010\u001aJ\u0018\u00105\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b5\u0010)J\u0010\u00107\u001a\u000206H\u0096\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u000206H\u0096\u0001¢\u0006\u0004\b9\u00108J\u0010\u0010:\u001a\u000206H\u0096\u0001¢\u0006\u0004\b:\u00108J\u0010\u0010;\u001a\u000206H\u0096\u0001¢\u0006\u0004\b;\u00108J\u0010\u0010<\u001a\u000206H\u0096\u0001¢\u0006\u0004\b<\u00108J\u0010\u0010=\u001a\u000206H\u0096\u0001¢\u0006\u0004\b=\u00108J\u0018\u0010>\u001a\u0002062\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u0002062\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b@\u0010?J\u0010\u0010A\u001a\u000206H\u0096\u0001¢\u0006\u0004\bA\u00108J\u0010\u0010B\u001a\u000206H\u0096\u0001¢\u0006\u0004\bB\u00108J\u0010\u0010C\u001a\u000206H\u0096\u0001¢\u0006\u0004\bC\u00108J\u0018\u0010D\u001a\u0002062\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\bD\u0010?J\u0010\u0010E\u001a\u000206H\u0096\u0001¢\u0006\u0004\bE\u00108J \u0010G\u001a\u00020\u00052\u000e\u0010\t\u001a\n \u000b*\u0004\u0018\u00010F0FH\u0096\u0001¢\u0006\u0004\bG\u0010HJ \u0010J\u001a\u00020\u00052\u000e\u0010\t\u001a\n \u000b*\u0004\u0018\u00010I0IH\u0096\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u000206H\u0097\u0001¢\u0006\u0004\bL\u00108J(\u0010M\u001a\n \u000b*\u0004\u0018\u00010\"0\"2\u000e\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\"0\"H\u0096\u0001¢\u0006\u0004\bM\u0010NJ \u0010O\u001a\u00020\u00052\u000e\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\"0\"H\u0096\u0001¢\u0006\u0004\bO\u0010PJ0\u0010R\u001a\u00020\u00052\u000e\u0010\t\u001a\n \u000b*\u0004\u0018\u00010Q0Q2\u000e\u0010\f\u001a\n \u000b*\u0004\u0018\u00010-0-H\u0096\u0001¢\u0006\u0004\bR\u0010SJ \u0010T\u001a\u00020\u00052\u000e\u0010\t\u001a\n \u000b*\u0004\u0018\u00010F0FH\u0096\u0001¢\u0006\u0004\bT\u0010HJ \u0010U\u001a\u00020\u00052\u000e\u0010\t\u001a\n \u000b*\u0004\u0018\u00010I0IH\u0096\u0001¢\u0006\u0004\bU\u0010KR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010V¨\u0006W"}, d2 = {"com/yandex/messaging/internal/storage/debug/DebugCursorController$DebugCursor", "Landroid/database/Cursor;", "cursor", "<init>", "(Lcvg;Landroid/database/Cursor;)V", "Lzy11;", "close", "()V", "", "p0", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "p1", "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", "deactivate", "", "getBlob", "(I)[B", "getColumnCount", "()I", "", "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()[Ljava/lang/String;", "getCount", "", "getDouble", "(I)D", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "", "getFloat", "(I)F", "getInt", "(I)I", "", "getLong", "(I)J", "Landroid/net/Uri;", "getNotificationUri", "()Landroid/net/Uri;", "getPosition", "", "getShort", "(I)S", "getString", "getType", "", "getWantsAllOnMoveCalls", "()Z", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "(I)Z", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "requery", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "setExtras", "(Landroid/os/Bundle;)V", "Landroid/content/ContentResolver;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "unregisterContentObserver", "unregisterDataSetObserver", "Landroid/database/Cursor;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class DebugCursorController$DebugCursor implements Cursor {
    private final Cursor cursor;
    final /* synthetic */ cvg this$0;

    public DebugCursorController$DebugCursor(cvg cvgVar, Cursor cursor) {
        this.this$0 = cvgVar;
        this.cursor = cursor;
        throw new IllegalStateException("Debug cursor shouldn't be used in release builds");
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.cursor.isClosed()) {
            cvg cvgVar = this.this$0;
            synchronized (cvgVar) {
                try {
                    l8x l8xVar = (l8x) cvgVar.b.get(this.cursor);
                    if (l8xVar != null) {
                        l8xVar.a(null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.cursor.close();
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int p0, CharArrayBuffer p1) {
        this.cursor.copyStringToBuffer(p0, p1);
    }

    @Override // android.database.Cursor
    @jxi
    public void deactivate() {
        this.cursor.deactivate();
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int p0) {
        return this.cursor.getBlob(p0);
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        return this.cursor.getColumnCount();
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String p0) {
        return this.cursor.getColumnIndex(p0);
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String p0) {
        return this.cursor.getColumnIndexOrThrow(p0);
    }

    @Override // android.database.Cursor
    public String getColumnName(int p0) {
        return this.cursor.getColumnName(p0);
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        return this.cursor.getColumnNames();
    }

    @Override // android.database.Cursor
    public int getCount() {
        return this.cursor.getCount();
    }

    @Override // android.database.Cursor
    public double getDouble(int p0) {
        return this.cursor.getDouble(p0);
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return this.cursor.getExtras();
    }

    @Override // android.database.Cursor
    public float getFloat(int p0) {
        return this.cursor.getFloat(p0);
    }

    @Override // android.database.Cursor
    public int getInt(int p0) {
        return this.cursor.getInt(p0);
    }

    @Override // android.database.Cursor
    public long getLong(int p0) {
        return this.cursor.getLong(p0);
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return this.cursor.getNotificationUri();
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.cursor.getPosition();
    }

    @Override // android.database.Cursor
    public short getShort(int p0) {
        return this.cursor.getShort(p0);
    }

    @Override // android.database.Cursor
    public String getString(int p0) {
        return this.cursor.getString(p0);
    }

    @Override // android.database.Cursor
    public int getType(int p0) {
        return this.cursor.getType(p0);
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return this.cursor.getWantsAllOnMoveCalls();
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return this.cursor.isAfterLast();
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return this.cursor.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return this.cursor.isClosed();
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.cursor.isFirst();
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return this.cursor.isLast();
    }

    @Override // android.database.Cursor
    public boolean isNull(int p0) {
        return this.cursor.isNull(p0);
    }

    @Override // android.database.Cursor
    public boolean move(int p0) {
        return this.cursor.move(p0);
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        return this.cursor.moveToFirst();
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        return this.cursor.moveToLast();
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        return this.cursor.moveToNext();
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int p0) {
        return this.cursor.moveToPosition(p0);
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        return this.cursor.moveToPrevious();
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver p0) {
        this.cursor.registerContentObserver(p0);
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver p0) {
        this.cursor.registerDataSetObserver(p0);
    }

    @Override // android.database.Cursor
    @jxi
    public boolean requery() {
        return this.cursor.requery();
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle p0) {
        return this.cursor.respond(p0);
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle p0) {
        this.cursor.setExtras(p0);
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver p0, Uri p1) {
        this.cursor.setNotificationUri(p0, p1);
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver p0) {
        this.cursor.unregisterContentObserver(p0);
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver p0) {
        this.cursor.unregisterDataSetObserver(p0);
    }
}
