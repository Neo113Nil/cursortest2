package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookFile;
import com.vk.dto.music.audiobook.AudioBooksChapterProgressStatus;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import org.json.JSONObject;

/* compiled from: ChapterEntity.kt */
/* loaded from: classes3.dex */
public final class flb {
    public final int a;
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final int g;
    public final String h;
    public final String i;
    public final Integer j;
    public final Integer k;
    public final String l;
    public final DownloadingState m;
    public final MusicOfflineCacheStorage n;
    public final String o;

    /* compiled from: ChapterEntity.kt */
    public static final class a {
        public static flb a(UserId userId, AudioBookChapter audioBookChapter, boolean z, MusicOfflineCacheStorage musicOfflineCacheStorage, String str) {
            String str2 = audioBookChapter.b;
            String str3 = audioBookChapter.c;
            AudioBookFile audioBookFile = audioBookChapter.d;
            return new flb(0, userId, str2, str3, audioBookFile != null ? audioBookFile.b : null, audioBookFile != null ? Integer.valueOf(audioBookFile.c) : null, audioBookChapter.e, audioBookChapter.f.i(), audioBookChapter.g, audioBookChapter.h, Integer.valueOf(audioBookChapter.i), str, z ? audioBookChapter.j : DownloadingState.NotLoaded.b, musicOfflineCacheStorage, audioBookChapter.e5().toString());
        }

        public static AudioBookChapter b(flb flbVar) {
            AudioBookChapter audioBookChapter = new AudioBookChapter(new JSONObject(flbVar.o));
            DownloadingState downloadingState = flbVar.m;
            AudioBooksChapterProgressStatus.a aVar = AudioBooksChapterProgressStatus.Companion;
            String str = flbVar.h;
            aVar.getClass();
            return AudioBookChapter.zb(audioBookChapter, flbVar.g, AudioBooksChapterProgressStatus.a.a(str), downloadingState, null, 743);
        }
    }

    public flb(int i, UserId userId, String str, String str2, String str3, Integer num, int i2, String str4, String str5, Integer num2, Integer num3, String str6, DownloadingState downloadingState, MusicOfflineCacheStorage musicOfflineCacheStorage, String str7) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = num;
        this.g = i2;
        this.h = str4;
        this.i = str5;
        this.j = num2;
        this.k = num3;
        this.l = str6;
        this.m = downloadingState;
        this.n = musicOfflineCacheStorage;
        this.o = str7;
    }

    public final String a() {
        return this.c;
    }

    public final Integer b() {
        return this.k;
    }

    public final DownloadingState c() {
        return this.m;
    }

    public final Integer d() {
        return this.f;
    }

    public final int e() {
        return this.a;
    }

    public final String f() {
        return this.o;
    }

    public final String g() {
        return this.l;
    }

    public final String h() {
        return this.h;
    }

    public final int i() {
        return this.g;
    }

    public final Integer j() {
        return this.j;
    }

    public final MusicOfflineCacheStorage k() {
        return this.n;
    }

    public final String l() {
        return this.d;
    }

    public final String m() {
        return this.i;
    }

    public final UserId n() {
        return this.b;
    }

    public final String o() {
        return this.e;
    }
}
