package defpackage;

import android.database.Cursor;

/* loaded from: classes10.dex */
public interface kif {
    void changeCursor(Cursor cursor);

    CharSequence convertToString(Cursor cursor);

    Cursor getCursor();

    Cursor runQueryOnBackgroundThread(CharSequence charSequence);
}
