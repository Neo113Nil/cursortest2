package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class by10 {
    public final RoomDatabase a;
    public final fc1 b = new fc1(23);

    public by10(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public final ey10 a(long j, long j2) {
        return (ey10) a.b(this.a, true, false, new j2b(8, j2, j));
    }

    public final String b(long j, long j2) {
        return (String) a.b(this.a, true, false, new j2b(14, j, j2));
    }

    public final Boolean c(long j, long j2) {
        ey10 a = a(j, j2);
        if (a != null) {
            return Boolean.valueOf(wkb1.k(a.b, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH));
        }
        return null;
    }

    public final void d(long j, String str) {
        ((Number) a.b(this.a, false, true, new qo6(str, j, 9))).intValue();
    }
}
