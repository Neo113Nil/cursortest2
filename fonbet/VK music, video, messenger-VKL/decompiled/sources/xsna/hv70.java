package xsna;

import com.vk.dto.music.Thumb;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: OfflinePodcastEpisodesViewState.kt */
/* loaded from: classes3.dex */
public interface hv70 extends lm50 {

    /* compiled from: OfflinePodcastEpisodesViewState.kt */
    public static final class a implements hv70 {
        public final String b;
        public final OfflinePodcastEpisodesMviState.SortType c;
        public final List<c> d;
        public final b e;
        public final int f;
        public final int g;

        public a() {
            throw null;
        }

        public a(String str, OfflinePodcastEpisodesMviState.SortType sortType, List list, b bVar, int i) {
            int i2 = 0;
            bVar = (i & 8) != 0 ? new b(0) : bVar;
            int size = list.size();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i2 += ((c) it.next()).e;
            }
            this.b = str;
            this.c = sortType;
            this.d = list;
            this.e = bVar;
            this.f = size;
            this.g = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g;
        }

        @Override // xsna.hv70
        public final OfflinePodcastEpisodesMviState.SortType f() {
            return this.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.g) + shy.a(this.f, (this.e.hashCode() + fw3.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d)) * 31, 31);
        }

        @Override // xsna.hv70
        public final String n() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(podcastTitle=");
            sb.append(this.b);
            sb.append(", selectedSortType=");
            sb.append(this.c);
            sb.append(", episodes=");
            sb.append(this.d);
            sb.append(", deleteAllInfo=");
            sb.append(this.e);
            sb.append(", episodesCount=");
            sb.append(this.f);
            sb.append(", episodesDuration=");
            return vu5.b(sb, this.g, ')');
        }
    }

    /* compiled from: OfflinePodcastEpisodesViewState.kt */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeleteAllInfo(buttonTextRes=");
            sb.append(this.a);
            sb.append(", dialogTitleRes=");
            sb.append(this.b);
            sb.append(", dialogDescriptionRes=");
            sb.append(this.c);
            sb.append(", dialogNegativeButtonRes=");
            sb.append(this.d);
            sb.append(", dialogPositiveButtonRes=");
            return vu5.b(sb, this.e, ')');
        }

        public b(int i) {
            this.a = R.string.podcast_episodes_delete_all;
            this.b = R.string.podcast_episodes_delete_dialog_title;
            this.c = R.string.podcast_episodes_delete_dialog_description;
            this.d = R.string.podcast_episodes_delete_dialog_button_negative;
            this.e = R.string.podcast_episodes_delete_dialog_button_positive;
        }
    }

    /* compiled from: OfflinePodcastEpisodesViewState.kt */
    public static final class c {
        public final String a;
        public final String b;
        public final int c;
        public final Thumb d;
        public final int e;
        public final bi40 f;

        public c(String str, String str2, int i, Thumb thumb, int i2, bi40 bi40Var) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = thumb;
            this.e = i2;
            this.f = bi40Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && epx.f(this.d, cVar.d) && this.e == cVar.e && epx.f(this.f, cVar.f);
        }

        public final int hashCode() {
            int a = shy.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31);
            Thumb thumb = this.d;
            return this.f.hashCode() + shy.a(this.e, (a + (thumb == null ? 0 : thumb.hashCode())) * 31, 31);
        }

        public final String toString() {
            return "EpisodeItem(mid=" + this.a + ", title=" + this.b + ", progressTime=" + this.c + ", cover=" + this.d + ", duration=" + this.e + ", downloadState=" + this.f + ')';
        }
    }

    /* compiled from: OfflinePodcastEpisodesViewState.kt */
    public static final class d implements hv70 {
        public final String b;
        public final OfflinePodcastEpisodesMviState.SortType c;

        public d(String str, OfflinePodcastEpisodesMviState.SortType sortType) {
            this.b = str;
            this.c = sortType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c == dVar.c;
        }

        @Override // xsna.hv70
        public final OfflinePodcastEpisodesMviState.SortType f() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        @Override // xsna.hv70
        public final String n() {
            return this.b;
        }

        public final String toString() {
            return "Loading(podcastTitle=" + this.b + ", selectedSortType=" + this.c + ')';
        }
    }

    OfflinePodcastEpisodesMviState.SortType f();

    String n();
}
