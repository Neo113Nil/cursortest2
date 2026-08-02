package ru.mail.libverify.n;

import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.Objects;
import ru.mail.libverify.n.m;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* loaded from: classes9.dex */
final class f {
    private final Cursor a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public f(@NonNull Cursor cursor) {
        this.a = cursor;
        this.b = cursor.getColumnIndex("_id");
        this.c = cursor.getColumnIndex("type");
        this.d = cursor.getColumnIndex(RTCStatsConstants.KEY_ADDRESS);
        this.e = cursor.getColumnIndex("body");
    }

    @NonNull
    public final b a() {
        return new b(this.a.getLong(this.b), m.b.a(this.a.getInt(this.c)), Objects.toString(this.a.getString(this.d), ""), Objects.toString(this.a.getString(this.e), ""));
    }

    public final boolean b() {
        return this.a.moveToFirst();
    }

    public final boolean c() {
        return this.a.moveToNext();
    }
}
