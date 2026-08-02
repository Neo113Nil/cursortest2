package ru.ok.android.webrtc.participant.movie;

import java.util.List;
import xsna.de;
import xsna.epx;
import xsna.h5s;
import xsna.wq;
import xsna.xy6;

/* loaded from: classes9.dex */
public final class MovieThumbnail {
    public final List a;

    public static final class Quality {
        public final String a;
        public final int b;
        public final int c;

        public Quality(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public static /* synthetic */ Quality copy$default(Quality quality, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = quality.a;
            }
            if ((i3 & 2) != 0) {
                i = quality.b;
            }
            if ((i3 & 4) != 0) {
                i2 = quality.c;
            }
            return quality.copy(str, i, i2);
        }

        public final String component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        public final int component3() {
            return this.c;
        }

        public final Quality copy(String str, int i, int i2) {
            return new Quality(str, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Quality)) {
                return false;
            }
            Quality quality = (Quality) obj;
            return epx.f(this.a, quality.a) && this.b == quality.b && this.c == quality.c;
        }

        public final int getHeight() {
            return this.c;
        }

        public final String getLink() {
            return this.a;
        }

        public final int getWidth() {
            return this.b;
        }

        public int hashCode() {
            return Integer.hashCode(this.c) + de.v(this.b, this.a.hashCode() * 31);
        }

        public String toString() {
            String str = this.a;
            return h5s.c(this.c, ")", xy6.b(this.b, "Quality(link=", str, ", width=", ", height="));
        }
    }

    public MovieThumbnail(List<Quality> list) {
        this.a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MovieThumbnail copy$default(MovieThumbnail movieThumbnail, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = movieThumbnail.a;
        }
        return movieThumbnail.copy(list);
    }

    public final List<Quality> component1() {
        return this.a;
    }

    public final MovieThumbnail copy(List<Quality> list) {
        return new MovieThumbnail(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MovieThumbnail) && epx.f(this.a, ((MovieThumbnail) obj).a);
    }

    public final List<Quality> getQualities() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return wq.c("MovieThumbnail(qualities=", ")", this.a);
    }
}
