package com.yandex.div.storage.database;

import android.database.Cursor;
import com.yandex.div.internal.util.IOUtils;
import java.io.Closeable;
import xsna.e9e0;
import xsna.gzs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: ReadState.kt */
/* loaded from: classes7.dex */
public final class ReadState implements Closeable {
    private Cursor _cursor;
    private final e9e0<Cursor> cursorProvider;
    private final gzs<s3q0> onCloseState;

    public ReadState(gzs<s3q0> gzsVar, e9e0<Cursor> e9e0Var) {
        this.onCloseState = gzsVar;
        this.cursorProvider = e9e0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.closeCursorSilently(this._cursor);
        this.onCloseState.invoke();
    }

    public final Cursor getCursor() {
        if (this._cursor != null) {
            throw new RuntimeException("Cursor should be called only once");
        }
        Cursor cursor = this.cursorProvider.get();
        this._cursor = cursor;
        return cursor;
    }

    public /* synthetic */ ReadState(gzs gzsVar, e9e0 e9e0Var, int i, zcl zclVar) {
        this((i & 1) != 0 ? new gzs<s3q0>() { // from class: com.yandex.div.storage.database.ReadState.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }
        } : gzsVar, e9e0Var);
    }
}
