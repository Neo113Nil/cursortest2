package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookGenre;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.music.audiobook.AudioBooksAccessStatus;
import com.vk.music.playlist.display.audiobook.presentation.model.AudioBookLoadState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.wzj;

/* compiled from: DisplayAudioBookChaptersState.kt */
/* loaded from: classes3.dex */
public final class jen implements km50 {
    public final boolean A;
    public final AudioBookLoadState b;
    public final AudioBook c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Throwable g;
    public final Object h;
    public final wzj.b i;
    public final boolean j;
    public final String k;
    public final String l;
    public final List<AudioBookPerson> m;
    public final ArrayList n;
    public final List<AudioBookPerson> o;
    public final String p;
    public final boolean q;
    public final int r;
    public final String s;
    public final boolean t;
    public final int u;
    public final int v;
    public final String w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
    public jen(AudioBookLoadState audioBookLoadState, AudioBook audioBook, boolean z, boolean z2, boolean z3, Throwable th) {
        Object obj;
        this.b = audioBookLoadState;
        this.c = audioBook;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = th;
        List<AudioBookChapter> list = audioBook.k;
        if (list != null) {
            List<AudioBookChapter> list2 = list;
            obj = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                obj.add(new hlb((AudioBookChapter) it.next()));
            }
        } else {
            obj = EmptyList.b;
        }
        this.h = obj;
        Image image = this.c.j;
        this.i = image != null ? new wzj.b.C3964b(new Thumb(image)) : wzj.b.a.a;
        AudioBook audioBook2 = this.c;
        this.j = audioBook2.r;
        this.k = audioBook2.c;
        this.l = audioBook2.Db();
        AudioBook audioBook3 = this.c;
        this.m = audioBook3.l;
        List<AudioBookPerson> list3 = audioBook3.m;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList.add(((AudioBookPerson) it2.next()).c);
        }
        this.n = arrayList;
        AudioBook audioBook4 = this.c;
        this.o = audioBook4.m;
        AudioBookGenre audioBookGenre = (AudioBookGenre) j5g.a0(audioBook4.o);
        String str = audioBookGenre != null ? audioBookGenre.c : null;
        this.p = str == null ? "" : str;
        AudioBook audioBook5 = this.c;
        this.q = audioBook5.f;
        List<AudioBookChapter> list4 = audioBook5.k;
        this.r = list4 != null ? list4.size() : 0;
        AudioBook audioBook6 = this.c;
        String str2 = audioBook6.w;
        this.s = str2 != null ? str2 : "";
        this.t = audioBook6.s == AudioBooksAccessStatus.FREE;
        this.u = audioBook6.e;
        this.v = audioBook6.g;
        this.w = audioBook6.p;
        boolean f = jnj.f(audioBook6.u);
        this.x = f;
        this.y = jnj.d(this.c.u);
        boolean z4 = !f;
        this.z = z4;
        this.A = z4;
    }

    public static jen a(jen jenVar, AudioBookLoadState audioBookLoadState, AudioBook audioBook, boolean z, Throwable th, int i) {
        if ((i & 1) != 0) {
            audioBookLoadState = jenVar.b;
        }
        AudioBookLoadState audioBookLoadState2 = audioBookLoadState;
        if ((i & 2) != 0) {
            audioBook = jenVar.c;
        }
        AudioBook audioBook2 = audioBook;
        boolean z2 = jenVar.d;
        if ((i & 8) != 0) {
            z = jenVar.e;
        }
        boolean z3 = z;
        boolean z4 = jenVar.f;
        if ((i & 32) != 0) {
            th = jenVar.g;
        }
        jenVar.getClass();
        return new jen(audioBookLoadState2, audioBook2, z2, z3, z4, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jen)) {
            return false;
        }
        jen jenVar = (jen) obj;
        return this.b == jenVar.b && epx.f(this.c, jenVar.c) && this.d == jenVar.d && this.e == jenVar.e && this.f == jenVar.f && epx.f(this.g, jenVar.g);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        Throwable th = this.g;
        return b + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayAudioBookChaptersState(loadingState=");
        sb.append(this.b);
        sb.append(", audioBook=");
        sb.append(this.c);
        sb.append(", isVkMusicSubscriber=");
        sb.append(this.d);
        sb.append(", isBookPlaying=");
        sb.append(this.e);
        sb.append(", isChapterDownloadEnabled=");
        sb.append(this.f);
        sb.append(", currentError=");
        return oq.c(sb, this.g, ')');
    }
}
