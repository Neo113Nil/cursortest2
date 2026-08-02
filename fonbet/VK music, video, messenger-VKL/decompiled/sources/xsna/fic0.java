package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import java.util.List;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public interface fic0 extends com.vk.newsfeed.posting.impl.domain.model.e {

    /* compiled from: PostingPatch.kt */
    public static final class a implements fic0 {
        public final PostingPlaceDto b;

        public a(PostingPlaceDto postingPlaceDto) {
            this.b = postingPlaceDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PickPlace(place=" + this.b + ')';
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class b implements fic0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 972968233;
        }

        public final String toString() {
            return "RemoveFile";
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class c implements fic0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 104073240;
        }

        public final String toString() {
            return "RemoveMusic";
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class d implements fic0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 106558202;
        }

        public final String toString() {
            return "RemovePlace";
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class e implements fic0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 973271916;
        }

        public final String toString() {
            return "RemovePoll";
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class f implements fic0 {
        public final FileDto b;

        public f(FileDto fileDto) {
            this.b = fileDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetFile(file=" + this.b + ')';
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class g implements fic0 {
        public final MusicDto b;

        public g(MusicDto musicDto) {
            this.b = musicDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetMusicPlaylist(playlist=" + this.b + ')';
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class h implements fic0 {
        public final MusicDto b;

        public h(MusicDto musicDto) {
            this.b = musicDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetMusicSnippet(snippet=" + this.b + ')';
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class i implements fic0 {
        public final List<MusicDto> b;

        public i(List<MusicDto> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("SetMusicTracks(tracks="), this.b);
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class j implements fic0 {
        public final PostingPollDto b;

        public j(PostingPollDto postingPollDto) {
            this.b = postingPollDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetPoll(poll=" + this.b + ')';
        }
    }
}
