package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.offline.api.domain.download.AudioDownloadManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: CorruptedTracksRecoveryManagerImpl.kt */
/* loaded from: classes3.dex */
public final class swj implements com.vk.music.offline.api.domain.download.a {
    public final com.vk.music.offline.api.domain.download.b a;
    public final kgp0 b;
    public final ConcurrentHashMap<String, MusicTrack> c = new ConcurrentHashMap<>();
    public final ConcurrentHashMap.KeySetView<String, Boolean> d = ConcurrentHashMap.newKeySet();
    public final ConcurrentHashMap.KeySetView<String, Boolean> e = ConcurrentHashMap.newKeySet();
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: CorruptedTracksRecoveryManagerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioDownloadManager.State.values().length];
            try {
                iArr[AudioDownloadManager.State.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioDownloadManager.State.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public swj(fk80 fk80Var, kgp0 kgp0Var) {
        this.a = fk80Var;
        this.b = kgp0Var;
    }

    @Override // com.vk.music.offline.api.domain.download.a
    public final void b(String str, String str2, String str3) {
        if (this.d.remove(str)) {
            this.f.b(io.reactivex.rxjava3.core.a.l(new qwj(this, str2, str3, 0)).q(asu0.a.c()).subscribe(new va4(0), new ji3(new com.vk.movika.sdk.base.logic.processor.d(8, str, (Object) this), 21)));
        }
    }

    @Override // com.vk.music.offline.api.domain.download.a
    public final void c(String str) {
        if (this.c.containsKey(str)) {
            this.f.b(io.reactivex.rxjava3.core.a.l(new isa(str, this)).q(asu0.a.c()).subscribe(new tgb(1, this, str), new pp3(new ij8(6, this, str), 16)));
        }
    }

    @Override // com.vk.music.offline.api.domain.download.a
    public final Set<String> d() {
        return j5g.S0(this.c.keySet());
    }

    @Override // com.vk.music.offline.api.domain.download.a
    public final void e(String str, AudioDownloadManager.State state) {
        int i = a.$EnumSwitchMapping$0[state.ordinal()];
        ConcurrentHashMap<String, MusicTrack> concurrentHashMap = this.c;
        ConcurrentHashMap.KeySetView<String, Boolean> keySetView = this.e;
        if (i == 1) {
            concurrentHashMap.remove(str);
            this.d.remove(str);
            keySetView.remove(str);
        } else if (i == 2 && keySetView.contains(str)) {
            keySetView.remove(str);
            MusicTrack musicTrack = concurrentHashMap.get(str);
            if (musicTrack != null) {
                io.reactivex.rxjava3.internal.operators.completable.a0 r = io.reactivex.rxjava3.core.a.r(1L, TimeUnit.SECONDS);
                String str2 = musicTrack.i;
                this.f.b(r.c(str2 == null ? io.reactivex.rxjava3.internal.operators.completable.i.b : io.reactivex.rxjava3.core.a.l(new rwj(musicTrack, str2, this, str))).q(asu0.a.c()).subscribe(new va4(0), new b60(new j20(10, this, str), 18)));
            }
        }
    }

    @Override // com.vk.music.offline.api.domain.download.a
    public final void f(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MusicTrack musicTrack = (MusicTrack) it.next();
            if (musicTrack.i != null) {
                String concat = "track_download_".concat(musicTrack.Fb());
                if (this.c.putIfAbsent(concat, musicTrack) == null) {
                    this.d.add(concat);
                    com.vk.music.offline.api.domain.download.b bVar = this.a;
                    if (bVar.c(concat)) {
                        bVar.a(concat);
                        this.e.add(concat);
                    } else {
                        String str = musicTrack.i;
                        this.f.b((str == null ? io.reactivex.rxjava3.internal.operators.completable.i.b : io.reactivex.rxjava3.core.a.l(new rwj(musicTrack, str, this, concat))).q(asu0.a.c()).subscribe(new va4(0), new tf(new g84(8, this, concat), 19)));
                    }
                }
            }
        }
    }

    @Override // com.vk.music.offline.api.domain.download.a
    public final void release() {
        this.f.e();
    }
}
