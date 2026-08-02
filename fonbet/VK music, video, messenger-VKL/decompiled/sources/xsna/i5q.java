package xsna;

import androidx.media3.exoplayer.offline.c;
import androidx.media3.exoplayer.scheduler.Requirements;
import com.vk.music.offline.api.domain.download.AudioDownloadManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ExoAudioDownloadManager.kt */
/* loaded from: classes.dex */
public final class i5q implements AudioDownloadManager {
    public final androidx.media3.exoplayer.offline.c b;
    public final msi c = new msi();

    /* compiled from: ExoAudioDownloadManager.kt */
    public final class a implements c.InterfaceC0061c {
        public a() {
        }

        @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
        public final void e(androidx.media3.exoplayer.offline.c cVar, o7o o7oVar, Exception exc) {
            AudioDownloadManager.State a = i5q.a(o7oVar.b);
            if (a == null) {
                return;
            }
            i5q.this.c.a(o7oVar.a.b, a, exc);
        }
    }

    /* compiled from: ExoAudioDownloadManager.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioDownloadManager.Requirement.values().length];
            try {
                iArr[AudioDownloadManager.Requirement.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioDownloadManager.Requirement.NETWORK_UNMETERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioDownloadManager.Requirement.DEVICE_CHARGING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioDownloadManager.Requirement.DEVICE_IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AudioDownloadManager.Requirement.DEVICE_STORAGE_NOT_LOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public i5q(androidx.media3.exoplayer.offline.c cVar) {
        this.b = cVar;
        cVar.f.add(new a());
    }

    public static AudioDownloadManager.State a(int i) {
        if (i == 0) {
            return AudioDownloadManager.State.QUEUE;
        }
        if (i == 1) {
            return AudioDownloadManager.State.STOPPED;
        }
        if (i == 2) {
            return AudioDownloadManager.State.DOWNLOADING;
        }
        if (i == 3) {
            return AudioDownloadManager.State.COMPLETED;
        }
        if (i == 4) {
            return AudioDownloadManager.State.FAILED;
        }
        if (i == 5) {
            return AudioDownloadManager.State.REMOVING;
        }
        if (i != 7) {
            return null;
        }
        return AudioDownloadManager.State.RESTARTING;
    }

    @Override // com.vk.music.offline.api.domain.download.AudioDownloadManager
    public final AudioDownloadManager.a b(String str) {
        o7o o7oVar;
        AudioDownloadManager.State a2;
        try {
            o7oVar = this.b.b.b(str);
        } catch (Throwable unused) {
            o7oVar = null;
        }
        if (o7oVar == null || (a2 = a(o7oVar.b)) == null) {
            return null;
        }
        return new AudioDownloadManager.a(o7oVar.a.c, o7oVar.b(), a2, o7oVar.e, o7oVar.a(), Integer.valueOf(o7oVar.g));
    }

    @Override // com.vk.music.offline.api.domain.download.AudioDownloadManager
    public final void d(xh40 xh40Var) {
        this.c.a.add(xh40Var);
    }

    @Override // com.vk.music.offline.api.domain.download.AudioDownloadManager
    public final boolean isInitialized() {
        return this.b.i;
    }

    @Override // com.vk.music.offline.api.domain.download.AudioDownloadManager
    public final void k(List<? extends AudioDownloadManager.Requirement> list) {
        List<? extends AudioDownloadManager.Requirement> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i = b.$EnumSwitchMapping$0[((AudioDownloadManager.Requirement) it.next()).ordinal()];
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i == 2) {
                    continue;
                } else if (i != 3) {
                    i2 = 4;
                    if (i == 4) {
                        continue;
                    } else {
                        if (i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = 16;
                    }
                } else {
                    i2 = 8;
                }
            }
            arrayList.add(Integer.valueOf(i2));
        }
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            i3 |= ((Number) it2.next()).intValue();
        }
        this.b.h(new Requirements(i3));
    }

    @Override // com.vk.music.offline.api.domain.download.AudioDownloadManager
    public final List<AudioDownloadManager.Requirement> n() {
        Requirements requirements = this.b.p.c;
        ListBuilder e = e43.e();
        int i = requirements.b;
        int i2 = requirements.b;
        if ((i & 1) != 0) {
            e.add(AudioDownloadManager.Requirement.NETWORK);
        }
        if ((i2 & 2) != 0) {
            e.add(AudioDownloadManager.Requirement.NETWORK_UNMETERED);
        }
        if ((i2 & 8) != 0) {
            e.add(AudioDownloadManager.Requirement.DEVICE_CHARGING);
        }
        if ((i2 & 4) != 0) {
            e.add(AudioDownloadManager.Requirement.DEVICE_IDLE);
        }
        if ((i2 & 16) != 0) {
            e.add(AudioDownloadManager.Requirement.DEVICE_STORAGE_NOT_LOW);
        }
        return e.g();
    }
}
