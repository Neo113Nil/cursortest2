package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.uu70;

/* compiled from: OfflinePlaybackErrorEventBuilder.kt */
/* loaded from: classes2.dex */
public abstract class ru70 {
    public final String a;
    public final int b;
    public final long c;

    /* compiled from: OfflinePlaybackErrorEventBuilder.kt */
    public static final class a extends ru70 {
        public final uu70.b d;
        public final int e;

        public a(uu70.b bVar, int i, int i2, long j) {
            super("offline_video_playback_error_evaded", i2, j);
            this.d = bVar;
            this.e = i;
        }

        @Override // xsna.ru70
        public final SchemeStat$TypeDevNullItem a() {
            uu70.b bVar = this.d;
            if (!(bVar instanceof uu70.b.C3834b)) {
                if (epx.f(bVar, uu70.b.a.a)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            return new SchemeStat$TypeDevNullItem(DevNullEventKey.VIDEO_PLAYBACK_ERROR.h(), null, ((uu70.b.C3834b) bVar).toString(), Integer.valueOf(this.e), this.a, null, null, null, String.valueOf(this.b), null, String.valueOf(this.c), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1310, 3, null);
        }
    }

    /* compiled from: OfflinePlaybackErrorEventBuilder.kt */
    public static final class b extends ru70 {
        public final String d;

        public b(String str, int i, long j) {
            super("offline_video_playback_error", i, j);
            this.d = str;
        }

        @Override // xsna.ru70
        public final SchemeStat$TypeDevNullItem a() {
            return new SchemeStat$TypeDevNullItem(DevNullEventKey.VIDEO_PLAYBACK_ERROR.h(), null, this.d, null, this.a, null, null, null, String.valueOf(this.b), null, String.valueOf(this.c), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1302, 3, null);
        }
    }

    public ru70(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public abstract SchemeStat$TypeDevNullItem a();
}
