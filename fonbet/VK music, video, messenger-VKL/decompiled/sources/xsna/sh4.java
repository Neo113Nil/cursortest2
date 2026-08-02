package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.offline.api.model.moosic.VkMusicOldAudioBookEntity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.fg4;
import xsna.flb;

/* compiled from: AudioBookOfflineInteractorImpl.kt */
/* loaded from: classes.dex */
public final class sh4 implements qh4 {
    public final of4 a;
    public final ukb b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new lu2(2));

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(com.vk.dto.music.audiobook.a.c((AudioBookChapter) t)), Integer.valueOf(com.vk.dto.music.audiobook.a.c((AudioBookChapter) t2)));
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(com.vk.dto.music.audiobook.a.c((AudioBookChapter) t)), Integer.valueOf(com.vk.dto.music.audiobook.a.c((AudioBookChapter) t2)));
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(com.vk.dto.music.audiobook.a.c((AudioBookChapter) t)), Integer.valueOf(com.vk.dto.music.audiobook.a.c((AudioBookChapter) t2)));
        }
    }

    public sh4(of4 of4Var, ukb ukbVar) {
        this.a = of4Var;
        this.b = ukbVar;
    }

    @Override // xsna.qh4
    public final List A(int i, UserId userId) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + j + ", bookId=" + i});
        }
        List l2 = this.b.l(i, String.valueOf(j));
        ArrayList arrayList = new ArrayList(c5g.u(l2, 10));
        Iterator it = l2.iterator();
        while (it.hasNext()) {
            arrayList.add(flb.a.b((flb) it.next()));
        }
        return j5g.D0(new a(), arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qh4
    public final void B(UserId userId, AudioBook audioBook) {
        if (((Boolean) this.c.getValue()).booleanValue()) {
            itg0.k(new io.reactivex.rxjava3.internal.operators.single.o(io.reactivex.rxjava3.core.x.k(audioBook), new f50(new rh4(0, this, userId), 4)).q(asu0.a.c()), null, null, 3);
        }
    }

    @Override // xsna.qh4
    public final void C(int i, UserId userId) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + j + ", bookId=" + i});
        }
        this.a.e(i, String.valueOf(j));
    }

    @Override // xsna.qh4
    public final List<AudioBook> D(UserId userId) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", defpackage.k0.a(j, "uid=")});
        }
        List<fg4> f = this.a.f(String.valueOf(j));
        ArrayList arrayList = new ArrayList(c5g.u(f, 10));
        Iterator<T> it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(fg4.a.b((fg4) it.next()));
        }
        return arrayList;
    }

    @Override // xsna.qh4
    public final List<AudioBook> E(UserId userId) {
        long j = userId.b;
        List<fg4> f = this.a.f(String.valueOf(j));
        ArrayList arrayList = new ArrayList(c5g.u(f, 10));
        Iterator<T> it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(fg4.a.b((fg4) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AudioBook audioBook = (AudioBook) it2.next();
            String valueOf = String.valueOf(j);
            List l = this.b.l(audioBook.getId(), valueOf);
            ArrayList arrayList3 = new ArrayList(c5g.u(l, 10));
            Iterator it3 = l.iterator();
            while (it3.hasNext()) {
                arrayList3.add(flb.a.b((flb) it3.next()));
            }
            arrayList2.add(AudioBook.zb(audioBook, j5g.D0(new b(), arrayList3), false, 4193791));
        }
        return arrayList2;
    }

    @Override // xsna.qh4
    public final void F(int i, UserId userId, boolean z) {
        this.a.c(i, String.valueOf(userId.b), z);
    }

    @Override // xsna.qh4
    public final int f(int i, UserId userId) {
        return this.a.b(i, String.valueOf(userId.b));
    }

    @Override // xsna.qh4
    public final io.reactivex.rxjava3.core.q m(int i, UserId userId) {
        long j = userId.b;
        return io.reactivex.rxjava3.core.q.m(this.a.g(i, String.valueOf(j)).U(new lp0(new ak(this, 1), 2)), this.b.a(i, String.valueOf(j)).U(new ql2(new wq3(2), 3)), new xl0(new yh3(1), 3));
    }

    @Override // xsna.qh4
    public final void x(UserId userId, int i, VkMusicOldAudioBookEntity vkMusicOldAudioBookEntity) {
        this.a.a(fg4.a.a(userId, VkMusicOldAudioBookEntity.a.a(vkMusicOldAudioBookEntity, i)));
    }

    @Override // xsna.qh4
    public final AudioBook y(int i, UserId userId) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + j + ", bookId=" + i});
        }
        fg4 d = this.a.d(i, String.valueOf(j));
        if (d != null) {
            return fg4.a.b(d);
        }
        return null;
    }

    @Override // xsna.qh4
    public final void z(UserId userId, AudioBook audioBook) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + ", bookId=" + audioBook.getId()});
        }
        this.a.a(fg4.a.a(userId, audioBook));
    }
}
