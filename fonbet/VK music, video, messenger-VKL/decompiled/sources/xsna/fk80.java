package xsna;

import android.app.BackgroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import com.vk.api.generated.audio.dto.AudioStreamDto;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import com.vk.music.offline.api.domain.download.AudioDownloadManager;
import com.vk.toggle.features.MusicFeatures;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.exo.offline.DownloadInfo;
import one.video.exo.offline.OfflineRequirement;
import xsna.kr10;

/* compiled from: OneVideoAudioDownloadManager.kt */
/* loaded from: classes.dex */
public final class fk80 implements com.vk.music.offline.api.domain.download.b, AudioDownloadManager {
    public final gt70 b;
    public final sgl c;
    public final df5 d;
    public final ht70 e;
    public volatile mm80 h;
    public volatile Object j;
    public volatile boolean k;
    public List<? extends AudioDownloadManager.Requirement> l;
    public final msi f = new msi();
    public final bpn0 g = new bpn0(new bg6(this, 9));
    public final Object i = new Object();

    /* compiled from: OneVideoAudioDownloadManager.kt */
    /* loaded from: classes3.dex */
    public final class a implements hu70 {
        public final b b;
        public final HashMap<String, DownloadInfo> c;

        /* compiled from: OneVideoAudioDownloadManager.kt */
        /* renamed from: xsna.fk80$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2879a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.REGULAR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.PREFETCH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(HashMap hashMap, b bVar) {
            this.b = bVar;
            HashMap<String, DownloadInfo> hashMap2 = new HashMap<>();
            hashMap2.putAll(hashMap);
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                DownloadInfo downloadInfo = (DownloadInfo) ((Map.Entry) it.next()).getValue();
                if (downloadInfo.c != DownloadInfo.State.STATE_COMPLETED) {
                    a(downloadInfo);
                }
            }
            this.c = hashMap2;
        }

        public final void a(DownloadInfo downloadInfo) {
            t9v t9vVar;
            Uri uri;
            b bVar = b.REGULAR;
            String str = null;
            fk80 fk80Var = fk80.this;
            b bVar2 = this.b;
            if (bVar2 == bVar || (bVar2 == b.PREFETCH && downloadInfo.c == DownloadInfo.State.STATE_COMPLETED)) {
                fk80Var.f.a(downloadInfo.a, fk80.w(downloadInfo.c), null);
            }
            int i = C2879a.$EnumSwitchMapping$0[bVar2.ordinal()];
            if (i == 1) {
                t9vVar = fk80Var.b;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                t9vVar = fk80Var.c;
            }
            String str2 = downloadInfo.a;
            DownloadInfo.State state = downloadInfo.c;
            t9vVar.c(str2, downloadInfo.g, downloadInfo.d);
            fk80Var.e.a(str2, fk80.w(state), null);
            if (state == DownloadInfo.State.STATE_COMPLETED) {
                kr10.f fVar = downloadInfo.h.b;
                String uri2 = (fVar == null || (uri = fVar.a) == null) ? null : uri.toString();
                if (brm0.B(str2, "track_download_", false)) {
                    str = drm0.U(str2, "track_download_");
                } else if (brm0.B(str2, "chapter_download_", false)) {
                    str = drm0.U(str2, "chapter_download_");
                } else if (brm0.B(str2, "episode_download_", false)) {
                    str = drm0.U(str2, "episode_download_");
                }
                if (uri2 == null || str == null) {
                    return;
                }
                t9vVar.b(str2, str, uri2);
            }
        }

        @Override // xsna.hu70
        public final void kg(Map<String, ? extends DownloadInfo> map) {
            HashMap hashMap = (HashMap) map;
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                HashMap<String, DownloadInfo> hashMap2 = this.c;
                if (!hasNext) {
                    hashMap2.clear();
                    hashMap2.putAll(hashMap);
                    return;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                DownloadInfo downloadInfo = (DownloadInfo) entry.getValue();
                DownloadInfo downloadInfo2 = hashMap2.get(str);
                if (downloadInfo2 == null) {
                    a(downloadInfo);
                } else if (downloadInfo2.g != downloadInfo.g || downloadInfo2.c != downloadInfo.c) {
                    a(downloadInfo);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OneVideoAudioDownloadManager.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b PREFETCH;
        public static final b REGULAR;

        static {
            b bVar = new b("REGULAR", 0);
            REGULAR = bVar;
            b bVar2 = new b("PREFETCH", 1);
            PREFETCH = bVar2;
            b[] bVarArr = {bVar, bVar2};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: OneVideoAudioDownloadManager.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.PREFETCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AudioStreamDto.TypeDto.values().length];
            try {
                iArr2[AudioStreamDto.TypeDto.DASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AudioStreamDto.TypeDto.HLS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AudioStreamDto.TypeDto.HLS_TS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AudioStreamDto.TypeDto.HLS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AudioStreamDto.TypeDto.MP3.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AudioDownloadManager.Requirement.values().length];
            try {
                iArr3[AudioDownloadManager.Requirement.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[AudioDownloadManager.Requirement.NETWORK_UNMETERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[AudioDownloadManager.Requirement.DEVICE_CHARGING.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[AudioDownloadManager.Requirement.DEVICE_IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[AudioDownloadManager.Requirement.DEVICE_STORAGE_NOT_LOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DownloadInfo.State.values().length];
            try {
                iArr4[DownloadInfo.State.STATE_DOWNLOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[DownloadInfo.State.STATE_RESTARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[DownloadInfo.State.STATE_REMOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[DownloadInfo.State.STATE_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[DownloadInfo.State.STATE_QUEUED.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[DownloadInfo.State.STATE_COMPLETED.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[DownloadInfo.State.STATE_STOPPED.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public fk80(gt70 gt70Var, sgl sglVar, df5 df5Var, ht70 ht70Var) {
        this.b = gt70Var;
        this.c = sglVar;
        this.d = df5Var;
        this.e = ht70Var;
        EmptyList emptyList = EmptyList.b;
        this.j = emptyList;
        this.l = emptyList;
    }

    public static AudioDownloadManager.a v(DownloadInfo downloadInfo) {
        Uri uri;
        kr10.f fVar = downloadInfo.d().b;
        if (fVar == null || (uri = fVar.a) == null) {
            return null;
        }
        return new AudioDownloadManager.a(uri, downloadInfo.e(), w(downloadInfo.f()), downloadInfo.b(), downloadInfo.a(), null);
    }

    public static AudioDownloadManager.State w(DownloadInfo.State state) {
        switch (d.$EnumSwitchMapping$3[state.ordinal()]) {
            case 1:
                return AudioDownloadManager.State.DOWNLOADING;
            case 2:
                return AudioDownloadManager.State.RESTARTING;
            case 3:
                return AudioDownloadManager.State.REMOVING;
            case 4:
                return AudioDownloadManager.State.FAILED;
            case 5:
                return AudioDownloadManager.State.QUEUE;
            case 6:
                return AudioDownloadManager.State.COMPLETED;
            case 7:
                return AudioDownloadManager.State.STOPPED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static sht0 x(Uri uri, AudioStreamDto.TypeDto typeDto) {
        if (typeDto == null) {
            return drm0.D(uri.toString(), ".m3u8", true) ? new x9v(uri) : drm0.D(uri.toString(), ".mpd", true) ? new ftk(uri) : new ag30(uri);
        }
        int i = d.$EnumSwitchMapping$1[typeDto.ordinal()];
        if (i == 1) {
            return new ftk(uri);
        }
        if (i == 2 || i == 3 || i == 4) {
            return new x9v(uri);
        }
        if (i == 5) {
            return new ag30(uri);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.music.offline.api.domain.download.b
    public final void a(String str) {
        y();
        b u = u(str);
        int i = u == null ? -1 : d.$EnumSwitchMapping$0[u.ordinal()];
        if (i != -1) {
            if (i == 1) {
                s().i(str);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[RETURN] */
    @Override // com.vk.music.offline.api.domain.download.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AudioDownloadManager.a b(String str) {
        DownloadInfo downloadInfo;
        b u = u(str);
        int i = u == null ? -1 : d.$EnumSwitchMapping$0[u.ordinal()];
        if (i != -1) {
            if (i == 1) {
                downloadInfo = s().d(str);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                mm80 r = r();
                if (r != null) {
                    downloadInfo = r.c(str);
                }
            }
            if (downloadInfo == null) {
                return v(downloadInfo);
            }
            return null;
        }
        downloadInfo = null;
        if (downloadInfo == null) {
        }
    }

    @Override // com.vk.music.offline.api.domain.download.b
    public final boolean c(String str) {
        mm80 r;
        return s().g(str) || ((r = r()) != null && r.g(str));
    }

    @Override // com.vk.music.offline.api.domain.download.AudioDownloadManager
    public final void d(xh40 xh40Var) {
        this.f.a.add(xh40Var);
    }

    @Override // com.vk.music.offline.api.domain.download.b
    public final Object e(String str) {
        b u = u(str);
        int i = u == null ? -1 : d.$EnumSwitchMapping$0[u.ordinal()];
        if (i == -1 || i == 1) {
            return null;
        }
        if (i == 2) {
            return r();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.music.offline.api.domain.download.b
    public final AudioDownloadManager.a f(String str) {
        DownloadInfo c2;
        mm80 r = r();
        if (r == null || (c2 = r.c(str)) == null) {
            return null;
        }
        return v(c2);
    }

    @Override // com.vk.music.offline.api.domain.download.b
    public final void g(String str, AudioStreamDto.TypeDto typeDto, Uri uri, byte[] bArr) {
        mm80 r;
        mm80 r2 = r();
        if ((r2 == null || !r2.g(str)) && (r = r()) != null) {
            mm80.a(r, str, x(uri, typeDto), bArr);
        }
    }

    @Override // com.vk.music.offline.api.domain.download.b
    public final void h(String str, AudioStreamDto.TypeDto typeDto, Uri uri, byte[] bArr) {
        y();
        bu70 s = s();
        sht0 x = x(uri, typeDto);
        bu70 bu70Var = bu70.a;
        synchronized (s) {
            bu70.e().b(str, x, bArr, null);
        }
    }

    @Override // com.vk.music.offline.api.domain.download.b
    public final void i(String str) {
        if (Build.VERSION.SDK_INT < 31) {
            t(str);
            return;
        }
        try {
            t(str);
        } catch (BackgroundServiceStartNotAllowedException e) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.e, new Object[]{e});
        }
    }

    @Override // com.vk.music.offline.api.domain.download.AudioDownloadManager
    public final boolean isInitialized() {
        return this.k;
    }

    @Override // com.vk.music.offline.api.domain.download.b
    public final void j(String str) {
        q().k(str);
        String A = d370.A(str);
        if (A != null) {
            this.d.b(String.valueOf(o25.a().c().b), A).subscribe();
        }
    }

    @Override // com.vk.music.offline.api.domain.download.AudioDownloadManager
    public final void k(List<? extends AudioDownloadManager.Requirement> list) {
        this.l = list;
    }

    @Override // com.vk.music.offline.api.domain.download.b
    public final void l(String str, AudioStreamDto.TypeDto typeDto, Uri uri, byte[] bArr) {
        mm80 r;
        if (s().g(str) || (r = r()) == null) {
            return;
        }
        mm80.a(r, str, x(uri, typeDto), bArr);
    }

    @Override // com.vk.music.offline.api.domain.download.b
    public final void m(String str) {
        mm80 r = r();
        if (r != null) {
            r.l(str);
        }
    }

    @Override // com.vk.music.offline.api.domain.download.AudioDownloadManager
    public final List<AudioDownloadManager.Requirement> n() {
        return this.l;
    }

    @Override // com.vk.music.offline.api.domain.download.b
    public final void o() {
        if (MusicFeatures.AUDIO_PLAYER_VIDEO_BUFFERING.h()) {
            asu0.a.getClass();
            asu0.n().execute(new ek80(this, 0));
        }
    }

    public final mm80 p() {
        PrivateFiles.a b2;
        mm80 mm80Var = new mm80();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        c cVar = new c(context);
        v9v v9vVar = new v9v(new VkHttpCallFactory(VkHttpCallFactory.MediaType.MUSIC, new d4(27)), null);
        List singletonList = Collections.singletonList(OfflineRequirement.NETWORK);
        b2 = e8r.a.b(r5, PrivateSubdir.PREFETCH_MUSIC_PRIVATE.h(), true);
        mm80Var.h(cVar, null, b2.a.getAbsolutePath(), v9vVar, singletonList, null);
        mm80Var.b(new a(mm80Var.f(), b.PREFETCH));
        return mm80Var;
    }

    public final mm80 q() {
        mm80 mm80Var;
        mm80 mm80Var2 = this.h;
        if (mm80Var2 != null) {
            return mm80Var2;
        }
        synchronized (this.i) {
            mm80Var = this.h;
            if (mm80Var == null) {
                mm80Var = p();
                this.h = mm80Var;
            }
        }
        return mm80Var;
    }

    public final mm80 r() {
        if (MusicFeatures.AUDIO_PLAYER_VIDEO_BUFFERING.h()) {
            return q();
        }
        return null;
    }

    public final bu70 s() {
        return (bu70) this.g.getValue();
    }

    public final void t(String str) {
        y();
        b u = u(str);
        int i = u == null ? -1 : d.$EnumSwitchMapping$0[u.ordinal()];
        if (i != -1) {
            if (i == 1) {
                s().h(str);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                mm80 r = r();
                if (r != null) {
                    r.j(str);
                }
            }
        }
    }

    public final b u(String str) {
        if (s().g(str)) {
            return b.REGULAR;
        }
        mm80 r = r();
        if (r == null || !r.g(str)) {
            return null;
        }
        return b.PREFETCH;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void y() {
        OfflineRequirement offlineRequirement;
        List<? extends AudioDownloadManager.Requirement> list = this.l;
        ?? r1 = this.j;
        if (list == null || r1 == 0) {
            return;
        }
        if (list.size() == r1.size() && list.containsAll((Collection) r1)) {
            return;
        }
        List<? extends AudioDownloadManager.Requirement> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i = d.$EnumSwitchMapping$2[((AudioDownloadManager.Requirement) it.next()).ordinal()];
            if (i == 1) {
                offlineRequirement = OfflineRequirement.NETWORK;
            } else if (i == 2) {
                offlineRequirement = OfflineRequirement.NETWORK_UNMETERED;
            } else if (i == 3) {
                offlineRequirement = OfflineRequirement.DEVICE_CHARGING;
            } else if (i == 4) {
                offlineRequirement = OfflineRequirement.DEVICE_IDLE;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                offlineRequirement = OfflineRequirement.DEVICE_STORAGE_NOT_LOW;
            }
            arrayList.add(offlineRequirement);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                bu70.a.j(arrayList);
                this.j = i7o0.a(list);
                return;
            } catch (BackgroundServiceStartNotAllowedException e) {
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l, L.LogType.e, new Object[]{e});
                return;
            }
        }
        try {
            bu70.a.j(arrayList);
            this.j = i7o0.a(list);
        } catch (IllegalStateException e2) {
            L l2 = L.a;
            l2.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l2, L.LogType.e, new Object[]{e2});
        }
    }

    /* compiled from: OneVideoAudioDownloadManager.kt */
    /* loaded from: classes3.dex */
    public static final class c extends ContextWrapper {
        public c(Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File getDatabasePath(String str) {
            return getBaseContext().getDatabasePath("prefetch_".concat(str));
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
            return getBaseContext().openOrCreateDatabase("prefetch_".concat(str), i, cursorFactory);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
            return getBaseContext().openOrCreateDatabase("prefetch_".concat(str), i, cursorFactory, databaseErrorHandler);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Context getApplicationContext() {
            return this;
        }
    }
}
