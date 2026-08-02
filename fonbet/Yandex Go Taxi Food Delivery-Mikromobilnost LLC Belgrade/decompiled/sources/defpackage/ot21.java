package defpackage;

import androidx.room.RoomDatabase;
import kotlin.a;

/* loaded from: classes15.dex */
public final class ot21 {
    public final RoomDatabase a;
    public final aro b = new aro(2, this);
    public final i3y c;

    public ot21(RoomDatabase roomDatabase) {
        this.c = a.a(new e4r(roomDatabase, 8));
        this.a = roomDatabase;
    }

    public final st21 a(String str) {
        return (st21) androidx.room.util.a.b(this.a, true, false, new dl01(27, str, this));
    }
}
