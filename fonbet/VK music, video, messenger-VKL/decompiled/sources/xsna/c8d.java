package xsna;

import xsna.tlo0;

/* compiled from: ClipMetaViewState.kt */
/* loaded from: classes2.dex */
public final class c8d {
    public final tlo0.h a;
    public final a b;
    public final c c;

    /* compiled from: ClipMetaViewState.kt */
    public static final class a implements b {
        public final tlo0.h a;

        public a(tlo0.h hVar) {
            this.a = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (((this.a.a.hashCode() * 31) - 2108028659) * 31);
        }

        public final String toString() {
            return "ChannelName(name=" + this.a + ", avatarUrl=https://sun9-67.userapi.com/s/v1/ig2/bcTDi8CsBgqeT6nxTPRVQVwYh7TfWAoDYhaWx8IJIR1uSixIBwKEG61c68HXyOBMs_-gnFA_zTRz0bRdj8qe7Vcb.jpg?quality=95&crop=0,0,1280,1280&as=32x32,48x48,72x72,108x108,160x160,240x240,360x360,480x480,540x540,640x640,720x720,1080x1080,1280x1280&ava=1&u=o2zz14OYgEKwsgo6T4jjUw70LnRkzM3wE9VVg8N8naQ&cs=100x100, isVerified=true)";
        }
    }

    /* compiled from: ClipMetaViewState.kt */
    public interface b {
    }

    /* compiled from: ClipMetaViewState.kt */
    public static final class c implements b {
        public final tlo0.h a;
        public final tlo0.h b;

        public c(tlo0.h hVar, tlo0.h hVar2) {
            this.a = hVar;
            this.b = hVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewsAndDate(viewCount=");
            sb.append(this.a);
            sb.append(", date=");
            return jq.c(sb, this.b, ')');
        }
    }

    public c8d(tlo0.h hVar, a aVar, c cVar) {
        this.a = hVar;
        this.b = aVar;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8d)) {
            return false;
        }
        c8d c8dVar = (c8d) obj;
        return this.a.equals(c8dVar.a) && this.b.equals(c8dVar.b) && this.c.equals(c8dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ClipMetaViewState(title=" + ((Object) ("Title(title=" + this.a + ')')) + ", subhead=" + this.b + ", subtitle=" + this.c + ')';
    }
}
