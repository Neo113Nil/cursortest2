package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.audiobook.AudioBook;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* compiled from: AudioBookEntity.kt */
/* loaded from: classes3.dex */
public final class fg4 {
    public final int a;
    public final UserId b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final Image j;
    public final String k;
    public final Integer l;
    public final boolean m;
    public final String n;
    public final String o;
    public final int p;
    public final MusicDynamicRestriction q;
    public final DownloadingState r;
    public final String s;

    /* compiled from: AudioBookEntity.kt */
    public static final class a {
        public static fg4 a(UserId userId, AudioBook audioBook) {
            return new fg4(0, userId, audioBook.b, audioBook.c, audioBook.d, audioBook.e, audioBook.f, audioBook.g, audioBook.i, audioBook.j, audioBook.p, audioBook.q, audioBook.r, audioBook.s.i(), audioBook.t, audioBook.u, audioBook.v, DownloadingState.NotLoaded.b, AudioBook.zb(audioBook, EmptyList.b, false, 4193791).e5().toString());
        }

        public static AudioBook b(fg4 fg4Var) {
            return AudioBook.zb(new AudioBook(new JSONObject(fg4Var.s)), null, fg4Var.m, 4128767);
        }
    }

    public fg4(int i, UserId userId, int i2, String str, String str2, int i3, boolean z, int i4, int i5, Image image, String str3, Integer num, boolean z2, String str4, String str5, int i6, MusicDynamicRestriction musicDynamicRestriction, DownloadingState downloadingState, String str6) {
        this.a = i;
        this.b = userId;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = i3;
        this.g = z;
        this.h = i4;
        this.i = i5;
        this.j = image;
        this.k = str3;
        this.l = num;
        this.m = z2;
        this.n = str4;
        this.o = str5;
        this.p = i6;
        this.q = musicDynamicRestriction;
        this.r = downloadingState;
        this.s = str6;
    }

    public final String a() {
        return this.n;
    }

    public final String b() {
        return this.e;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.p;
    }

    public final String e() {
        return this.k;
    }

    public final Image f() {
        return this.j;
    }

    public final DownloadingState g() {
        return this.r;
    }

    public final int h() {
        return this.h;
    }

    public final int i() {
        return this.a;
    }

    public final String j() {
        return this.s;
    }

    public final int k() {
        return this.f;
    }

    public final Integer l() {
        return this.l;
    }

    public final MusicDynamicRestriction m() {
        return this.q;
    }

    public final String n() {
        return this.d;
    }

    public final String o() {
        return this.o;
    }

    public final UserId p() {
        return this.b;
    }

    public final int q() {
        return this.i;
    }

    public final boolean r() {
        return this.g;
    }

    public final boolean s() {
        return this.m;
    }
}
