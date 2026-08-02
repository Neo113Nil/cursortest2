package xsna;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;

/* compiled from: AudioGetMusicPageModern.kt */
/* loaded from: classes3.dex */
public final class fp4 {
    public final ix4 a = new ix4();
    public final a b = new a(null);
    public UserId c = UserId.d;

    /* compiled from: AudioGetMusicPageModern.kt */
    public static final class a {
        public Integer a;
        public ArrayList<MusicTrack> b;

        public a() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            ArrayList<MusicTrack> arrayList = this.b;
            return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ModernLoaderResult(playlistsTotal=");
            sb.append(this.a);
            sb.append(", musicTracks=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
        }

        public a(Object obj) {
            this.a = null;
            this.b = null;
        }
    }

    public fp4(Bundle bundle) {
    }
}
