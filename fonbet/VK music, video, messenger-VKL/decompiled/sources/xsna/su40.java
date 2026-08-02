package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import java.util.List;

/* compiled from: MusicPickerSideEffect.kt */
/* loaded from: classes4.dex */
public interface su40 {

    /* compiled from: MusicPickerSideEffect.kt */
    public interface a extends su40 {

        /* compiled from: MusicPickerSideEffect.kt */
        /* renamed from: xsna.su40$a$a, reason: collision with other inner class name */
        public static final class C3689a implements a {
            public final Playlist a;

            public C3689a(Playlist playlist) {
                this.a = playlist;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3689a) && epx.f(this.a, ((C3689a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ShowAlertDialogAttachPlaylist(playlist=" + this.a + ')';
            }
        }

        /* compiled from: MusicPickerSideEffect.kt */
        public static final class b implements a {
            public final MusicTrack a;

            public b(MusicTrack musicTrack) {
                this.a = musicTrack;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return rq.c(new StringBuilder("ShowAlertDialogAttachTrack(track="), this.a, ')');
            }
        }

        /* compiled from: MusicPickerSideEffect.kt */
        public static final class c implements a {
            public final int a;

            public c(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("ShowSnackbarAudioMaxCount(audioMaxCount="), this.a, ')');
            }
        }

        /* compiled from: MusicPickerSideEffect.kt */
        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 719289582;
            }

            public final String toString() {
                return "ShowSnackbarPrivatePlaylist";
            }
        }
    }

    /* compiled from: MusicPickerSideEffect.kt */
    public interface b extends su40 {

        /* compiled from: MusicPickerSideEffect.kt */
        public static final class a implements b {
            public final PickerTechMetrics a;

            public a(PickerTechMetrics pickerTechMetrics) {
                this.a = pickerTechMetrics;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Dismiss(techMetrics=" + this.a + ')';
            }
        }

        /* compiled from: MusicPickerSideEffect.kt */
        /* renamed from: xsna.su40$b$b, reason: collision with other inner class name */
        public static final class C3690b implements b {
            public final Playlist a;
            public final PickerTechMetrics b;

            public C3690b(Playlist playlist, PickerTechMetrics pickerTechMetrics) {
                this.a = playlist;
                this.b = pickerTechMetrics;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3690b)) {
                    return false;
                }
                C3690b c3690b = (C3690b) obj;
                return epx.f(this.a, c3690b.a) && epx.f(this.b, c3690b.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "FinishWithPlaylist(playlist=" + this.a + ", techMetrics=" + this.b + ')';
            }
        }

        /* compiled from: MusicPickerSideEffect.kt */
        public static final class c implements b {
            public final MusicDto a;
            public final MusicDto b;
            public final List<MusicDto> c;
            public final PickerTechMetrics d;

            public c(MusicDto musicDto, MusicDto musicDto2, List<MusicDto> list, PickerTechMetrics pickerTechMetrics) {
                this.a = musicDto;
                this.b = musicDto2;
                this.c = list;
                this.d = pickerTechMetrics;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
            }

            public final int hashCode() {
                MusicDto musicDto = this.a;
                int hashCode = (musicDto == null ? 0 : musicDto.hashCode()) * 31;
                MusicDto musicDto2 = this.b;
                return this.d.hashCode() + fw3.a((hashCode + (musicDto2 != null ? musicDto2.hashCode() : 0)) * 31, 31, this.c);
            }

            public final String toString() {
                return "FinishWithResult(playlist=" + this.a + ", snippet=" + this.b + ", tracks=" + this.c + ", techMetrics=" + this.d + ')';
            }
        }

        /* compiled from: MusicPickerSideEffect.kt */
        public static final class d implements b {
            public final boolean a;
            public final List<MusicDto> b;

            public d(boolean z, List<MusicDto> list) {
                this.a = z;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a == dVar.a && epx.f(this.b, dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenSelectedSnippetSettings(isSnippetPreferred=");
                sb.append(this.a);
                sb.append(", selectedSnippets=");
                return ms9.a(')', sb, this.b);
            }
        }

        /* compiled from: MusicPickerSideEffect.kt */
        public static final class e implements b {
            public final List<MusicDto> a;

            public e(List<MusicDto> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("OpenSelectedTracks(selectedTracks="), this.a);
            }
        }
    }

    /* compiled from: MusicPickerSideEffect.kt */
    public static final class c implements su40 {
    }
}
