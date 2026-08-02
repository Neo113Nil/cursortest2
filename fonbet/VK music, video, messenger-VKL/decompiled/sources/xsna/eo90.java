package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: PastBroadcastsListViewItem.kt */
/* loaded from: classes7.dex */
public final class eo90 implements hfz {
    public final VideoFile b;
    public final a c;

    /* compiled from: PastBroadcastsListViewItem.kt */
    public static final class a {
        public final int a;
        public final String b;
        public final String c;

        public a(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UIFields(vid=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", description=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public eo90(VideoFile videoFile) {
        this.b = videoFile;
        this.c = new a(videoFile.o0(), videoFile.getTitle(), videoFile.j1());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return eo90.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.c, ((eo90) obj).c);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.c.a);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return lq.a(new StringBuilder("Content(video="), this.b, ')');
    }
}
