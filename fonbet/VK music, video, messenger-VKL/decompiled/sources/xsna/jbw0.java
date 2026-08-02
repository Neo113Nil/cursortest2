package xsna;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.vk.dto.common.id.UserId;
import com.vk.vmoji.storage.impl.database.VmojiStorageDatabase;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VmojiStorageDbRegistry.kt */
/* loaded from: classes7.dex */
public final class jbw0 implements lbw0 {
    public final t8w0 a;

    public jbw0(Context context) {
        RoomDatabase.a a = bhv0.a(context, "vmoji_file_storage", VmojiStorageDatabase.class);
        asu0.a.getClass();
        a.f = asu0.n();
        this.a = ((VmojiStorageDatabase) a.b()).y();
    }

    @Override // xsna.lbw0
    public final void a(long j, UserId userId) {
        this.a.a(j, userId);
    }

    @Override // xsna.lbw0
    public final void b(long j, UserId userId, String str) {
        this.a.b(j, userId, str);
    }

    @Override // xsna.lbw0
    public final List<mbw0> c() {
        return this.a.c();
    }

    @Override // xsna.lbw0
    public final void d(long j, UserId userId, String str) {
        this.a.d(j, userId, str);
    }

    @Override // xsna.lbw0
    public final void e(ArrayList arrayList) {
        this.a.e(arrayList);
    }

    @Override // xsna.lbw0
    public final o8w0 f(UserId userId) {
        return this.a.f(userId);
    }
}
