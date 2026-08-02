package xsna;

import java.io.Closeable;

/* compiled from: DownloadCursor.java */
/* loaded from: classes.dex */
public interface l8o extends Closeable {
    int getPosition();

    default boolean moveToNext() {
        return moveToPosition(getPosition() + 1);
    }

    boolean moveToPosition(int i);
}
