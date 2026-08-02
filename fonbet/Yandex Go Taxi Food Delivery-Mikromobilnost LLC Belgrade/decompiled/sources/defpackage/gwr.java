package defpackage;

import androidx.room.RoomDatabase;
import kotlin.a;

/* loaded from: classes15.dex */
public final class gwr {
    public final RoomDatabase a;
    public final i3y c;
    public final fwr d;
    public final fwr b = new fwr(this, 0);
    public final fc1 e = new fc1(17);

    public gwr(RoomDatabase roomDatabase) {
        int i = 1;
        this.c = a.a(new e4r(roomDatabase, i));
        this.a = roomDatabase;
        this.d = new fwr(this, i);
        new fc1(18);
    }

    public final euu0 a() {
        return (euu0) this.c.getValue();
    }
}
