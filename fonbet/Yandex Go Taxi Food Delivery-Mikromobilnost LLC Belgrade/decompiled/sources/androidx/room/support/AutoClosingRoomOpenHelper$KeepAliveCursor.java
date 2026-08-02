package androidx.room.support;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import defpackage.jxi;
import defpackage.np3;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0014J \u0010\u001e\u001a\u00020\n2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\n2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b \u0010\u001fJ \u0010!\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b!\u0010\"J6\u0010$\u001a(\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c \u001d*\u0014\u0012\u000e\b\u0001\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010#0#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b&\u0010\fJ \u0010(\u001a\n \u001d*\u0004\u0018\u00010'0'2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b(\u0010)J \u0010*\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b*\u0010\"J(\u0010-\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010,\u001a\n \u001d*\u0004\u0018\u00010+0+H\u0096\u0001¢\u0006\u0004\b-\u0010.J\u0018\u00100\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b2\u00103J\u0018\u00105\u001a\u0002042\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u00020:2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b=\u00103J\u0018\u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b>\u0010\u0011J\u0010\u0010?\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b?\u0010\tJ\u0010\u0010@\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b@\u0010\u0014J\u0010\u0010A\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\bA\u0010\u0014J \u0010C\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010B0BH\u0096\u0001¢\u0006\u0004\bC\u0010DJ \u0010E\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010B0BH\u0096\u0001¢\u0006\u0004\bE\u0010DJ \u0010G\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010F0FH\u0096\u0001¢\u0006\u0004\bG\u0010HJ \u0010I\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010F0FH\u0096\u0001¢\u0006\u0004\bI\u0010HJ0\u0010L\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010J0J2\u000e\u0010,\u001a\n \u001d*\u0004\u0018\u00010K0KH\u0096\u0001¢\u0006\u0004\bL\u0010MJ\u0018\u0010N\u001a\n \u001d*\u0004\u0018\u00010K0KH\u0096\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\bP\u0010\u0014J \u0010R\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bR\u0010SJ\u0018\u0010T\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bT\u0010UJ(\u0010V\u001a\n \u001d*\u0004\u0018\u00010Q0Q2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010XR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010Y¨\u0006Z"}, d2 = {"androidx/room/support/AutoClosingRoomOpenHelper$KeepAliveCursor", "Landroid/database/Cursor;", "delegate", "Lnp3;", "autoCloser", "<init>", "(Landroid/database/Cursor;Lnp3;)V", "Lzy11;", "close", "()V", "", "getCount", "()I", "getPosition", "p0", "", "move", "(I)Z", "moveToPosition", "moveToFirst", "()Z", "moveToLast", "moveToNext", "moveToPrevious", "isFirst", "isLast", "isBeforeFirst", "isAfterLast", "", "kotlin.jvm.PlatformType", "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()[Ljava/lang/String;", "getColumnCount", "", "getBlob", "(I)[B", "getString", "Landroid/database/CharArrayBuffer;", "p1", "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", "", "getShort", "(I)S", "getInt", "(I)I", "", "getLong", "(I)J", "", "getFloat", "(I)F", "", "getDouble", "(I)D", "getType", "isNull", "deactivate", "requery", "isClosed", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "unregisterContentObserver", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "unregisterDataSetObserver", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "getNotificationUri", "()Landroid/net/Uri;", "getWantsAllOnMoveCalls", "Landroid/os/Bundle;", "setExtras", "(Landroid/os/Bundle;)V", "getExtras", "()Landroid/os/Bundle;", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "Landroid/database/Cursor;", "Lnp3;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AutoClosingRoomOpenHelper$KeepAliveCursor implements Cursor {
    private final np3 autoCloser;
    private final Cursor delegate;

    public AutoClosingRoomOpenHelper$KeepAliveCursor(Cursor cursor, np3 np3Var) {
        this.delegate = cursor;
        this.autoCloser = np3Var;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
        this.autoCloser.a();
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int p0, CharArrayBuffer p1) {
        this.delegate.copyStringToBuffer(p0, p1);
    }

    @Override // android.database.Cursor
    @jxi
    public void deactivate() {
        this.delegate.deactivate();
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int p0) {
        return this.delegate.getBlob(p0);
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        return this.delegate.getColumnCount();
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String p0) {
        return this.delegate.getColumnIndex(p0);
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String p0) {
        return this.delegate.getColumnIndexOrThrow(p0);
    }

    @Override // android.database.Cursor
    public String getColumnName(int p0) {
        return this.delegate.getColumnName(p0);
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        return this.delegate.getColumnNames();
    }

    @Override // android.database.Cursor
    public int getCount() {
        return this.delegate.getCount();
    }

    @Override // android.database.Cursor
    public double getDouble(int p0) {
        return this.delegate.getDouble(p0);
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return this.delegate.getExtras();
    }

    @Override // android.database.Cursor
    public float getFloat(int p0) {
        return this.delegate.getFloat(p0);
    }

    @Override // android.database.Cursor
    public int getInt(int p0) {
        return this.delegate.getInt(p0);
    }

    @Override // android.database.Cursor
    public long getLong(int p0) {
        return this.delegate.getLong(p0);
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return this.delegate.getNotificationUri();
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.delegate.getPosition();
    }

    @Override // android.database.Cursor
    public short getShort(int p0) {
        return this.delegate.getShort(p0);
    }

    @Override // android.database.Cursor
    public String getString(int p0) {
        return this.delegate.getString(p0);
    }

    @Override // android.database.Cursor
    public int getType(int p0) {
        return this.delegate.getType(p0);
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return this.delegate.getWantsAllOnMoveCalls();
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return this.delegate.isAfterLast();
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return this.delegate.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return this.delegate.isClosed();
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.delegate.isFirst();
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return this.delegate.isLast();
    }

    @Override // android.database.Cursor
    public boolean isNull(int p0) {
        return this.delegate.isNull(p0);
    }

    @Override // android.database.Cursor
    public boolean move(int p0) {
        return this.delegate.move(p0);
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        return this.delegate.moveToFirst();
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        return this.delegate.moveToLast();
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        return this.delegate.moveToNext();
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int p0) {
        return this.delegate.moveToPosition(p0);
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        return this.delegate.moveToPrevious();
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver p0) {
        this.delegate.registerContentObserver(p0);
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver p0) {
        this.delegate.registerDataSetObserver(p0);
    }

    @Override // android.database.Cursor
    @jxi
    public boolean requery() {
        return this.delegate.requery();
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle p0) {
        return this.delegate.respond(p0);
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle p0) {
        this.delegate.setExtras(p0);
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver p0, Uri p1) {
        this.delegate.setNotificationUri(p0, p1);
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver p0) {
        this.delegate.unregisterContentObserver(p0);
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver p0) {
        this.delegate.unregisterDataSetObserver(p0);
    }
}
