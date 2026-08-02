package xsna;

import androidx.room.RoomDatabase;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VmojiFileDao_Impl.kt */
/* loaded from: classes7.dex */
public final class w8w0 implements t8w0 {
    public final RoomDatabase a;

    public w8w0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.t8w0
    public final void a(long j, UserId userId) {
        u370.f(this.a, false, true, new v8w0(j, this, userId));
    }

    @Override // xsna.t8w0
    public final void b(long j, UserId userId, String str) {
        u370.f(this.a, false, true, new es80(j, userId, str, this));
    }

    @Override // xsna.t8w0
    public final List<o8w0> c() {
        return (List) u370.f(this.a, true, false, new wep0(this));
    }

    @Override // xsna.t8w0
    public final void d(final long j, final UserId userId, final String str) {
        u370.f(this.a, false, true, new izs(j, userId, str, this) { // from class: xsna.u8w0
            public final /* synthetic */ String b;
            public final /* synthetic */ long c;
            public final /* synthetic */ UserId d;

            @Override // xsna.izs
            public final Object invoke(Object obj) {
                String str2 = this.b;
                long j2 = this.c;
                UserId userId2 = this.d;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE user_vmoji_files set file=?, last_access = ? where user=?");
                try {
                    V0.D3(1, str2);
                    V0.bindLong(2, j2);
                    V0.bindLong(3, userId2.b);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            }
        });
    }

    @Override // xsna.t8w0
    public final void e(ArrayList arrayList) {
        StringBuilder e = fw3.e("DELETE FROM user_vmoji_files where user in (");
        e370.c(arrayList.size(), e);
        e.append(")");
        u370.f(this.a, false, true, new wkt0(e.toString(), arrayList, this));
    }

    @Override // xsna.t8w0
    public final o8w0 f(UserId userId) {
        return (o8w0) u370.f(this.a, true, false, new sem0(this, userId));
    }
}
