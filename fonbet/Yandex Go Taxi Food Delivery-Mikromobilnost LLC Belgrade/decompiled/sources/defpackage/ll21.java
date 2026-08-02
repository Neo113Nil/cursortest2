package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class ll21 extends kl21 {
    public final RoomDatabase a;
    public final x7b0 b = new x7b0(12);

    public ll21(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.kl21
    public final int a(String str) {
        return ((Number) a.b(this.a, false, true, new il01(str, 9))).intValue();
    }

    @Override // defpackage.kl21
    public final void b(ArrayList arrayList) {
        a.b(this.a, false, true, new dl01(22, this, arrayList));
    }

    @Override // defpackage.kl21
    public final List c(long j, String str) {
        return (List) a.b(this.a, true, false, new qo6(str, j, 24));
    }

    @Override // defpackage.kl21
    public final List d(String str) {
        return (List) a.b(this.a, true, false, new il01(str, 8));
    }
}
