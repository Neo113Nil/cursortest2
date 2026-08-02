package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBooksChapterProgressStatus;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.api.model.moosic.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.flb;

/* compiled from: ChapterOfflineInteractorImpl.kt */
/* loaded from: classes.dex */
public final class jlb implements ilb {
    public final ukb a;

    public jlb(ukb ukbVar) {
        this.a = ukbVar;
    }

    @Override // xsna.ilb
    public final String a(String str) {
        return this.a.j(String.valueOf(o25.a().c().b), str);
    }

    @Override // xsna.ilb
    public final void b(UserId userId, AudioBookChapter audioBookChapter, int i) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.i;
            StringBuilder b = fp.b(j, "uid=", ", chapterId=");
            b.append(audioBookChapter.getId());
            L.u(l, logType, new Object[]{"OfflineDbConn", b.toString()});
        }
        String id = audioBookChapter.getId();
        ukb ukbVar = this.a;
        ukbVar.m(flb.a.a(userId, audioBookChapter, false, ukbVar.h(id), ukbVar.j(String.valueOf(o25.a().c().b), audioBookChapter.getId())));
        ukbVar.c(new yj4(String.valueOf(j), audioBookChapter.getId(), i));
    }

    @Override // xsna.ilb
    public final List c(UserId userId, ArrayList arrayList) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + ", size=" + arrayList.size()});
        }
        ArrayList v = c5g.v(j5g.V0(arrayList, 512, 512, true, new u6(7, this, userId)));
        ArrayList arrayList2 = new ArrayList(c5g.u(v, 10));
        Iterator it = v.iterator();
        while (it.hasNext()) {
            arrayList2.add(flb.a.b((flb) it.next()));
        }
        return arrayList2;
    }

    @Override // xsna.ilb
    public final AudioBookChapter d(UserId userId, String str) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + j + ", chapterId=" + str});
        }
        String valueOf = String.valueOf(j);
        ukb ukbVar = this.a;
        flb k = ukbVar.k(valueOf, str);
        if (k != null) {
            ukbVar.n(String.valueOf(j), str);
        }
        if (k != null) {
            return flb.a.b(k);
        }
        return null;
    }

    @Override // xsna.ilb
    public final void e(UserId userId, int i, int i2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AudioBookChapter a = a.C1328a.a((com.vk.music.offline.api.model.moosic.a) it.next(), i);
            flb a2 = flb.a.a(userId, a, true, MusicOfflineCacheStorage.EXTERNAL_OR_INTERNAL, null);
            ukb ukbVar = this.a;
            ukbVar.m(a2);
            ukbVar.c(new yj4(String.valueOf(userId.b), a.getId(), i2));
        }
    }

    @Override // xsna.ilb
    public final void f(UserId userId, String str, String str2) {
        this.a.b(String.valueOf(userId.b), str, str2);
    }

    @Override // xsna.ilb
    public final void g(int i, int i2, String str, String str2) {
        this.a.g((int) Math.ceil(i / 1000), str, str2, (((long) i) <= 1000 ? AudioBooksChapterProgressStatus.UNREAD : ((double) swe0.f(((float) i) / ((float) i2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)) < 0.98d ? AudioBooksChapterProgressStatus.IN_PROGRESS : AudioBooksChapterProgressStatus.DONE).i());
    }

    @Override // xsna.ilb
    public final void h(String str, DownloadingState downloadingState) {
        int a = DownloadingState.a.a(downloadingState);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", zil0.a(a, "chapterId=", str, ", downloadingState=")});
        }
        this.a.f(a, str);
    }
}
