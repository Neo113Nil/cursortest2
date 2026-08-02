package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.List;

/* loaded from: classes15.dex */
public final class dcu0 extends ccu0 {
    public final RoomDatabase a;
    public final x7b0 b = new x7b0(7);

    public dcu0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.ccu0
    public final void a() {
        a.b(this.a, false, true, new x8t0(13));
    }

    @Override // defpackage.ccu0
    public final String[] b() {
        return (String[]) a.b(this.a, true, false, new x8t0(12));
    }

    @Override // defpackage.ccu0
    public final boolean c(String str) {
        return ((Boolean) a.b(this.a, true, false, new g8r0(str, 9))).booleanValue();
    }

    @Override // defpackage.ccu0
    public final void d(List list) {
        a.b(this.a, false, true, new scs0(17, this, list));
    }
}
