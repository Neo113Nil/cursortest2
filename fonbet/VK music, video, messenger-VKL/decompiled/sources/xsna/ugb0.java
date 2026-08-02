package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Thumb;
import com.vk.dto.podcast.Podcast;
import java.util.List;
import org.json.JSONObject;

/* compiled from: PodcastEntity.kt */
/* loaded from: classes3.dex */
public final class ugb0 {
    public final int a;
    public final UserId b;
    public final int c;
    public final UserId d;
    public final String e;
    public final int f;
    public final Thumb g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final DownloadingState m;
    public final String n;

    /* compiled from: PodcastEntity.kt */
    public static final class a {
        public static ugb0 a(UserId userId, Podcast podcast) {
            int i = podcast.b;
            UserId userId2 = podcast.c;
            String str = podcast.d;
            int i2 = podcast.e;
            List<Thumb> list = podcast.f;
            return new ugb0(0, userId, i, userId2, str, i2, list != null ? (Thumb) j5g.a0(list) : null, podcast.h, podcast.i, podcast.k, podcast.l, podcast.m, DownloadingState.NotLoaded.b, podcast.e5().toString());
        }

        public static Podcast b(ugb0 ugb0Var) {
            return Podcast.a(new Podcast(new JSONObject(ugb0Var.n)), ugb0Var.k, 7167);
        }
    }

    public ugb0(int i, UserId userId, int i2, UserId userId2, String str, int i3, Thumb thumb, boolean z, String str2, boolean z2, boolean z3, String str3, DownloadingState downloadingState, String str4) {
        this.a = i;
        this.b = userId;
        this.c = i2;
        this.d = userId2;
        this.e = str;
        this.f = i3;
        this.g = thumb;
        this.h = z;
        this.i = str2;
        this.j = z2;
        this.k = z3;
        this.l = str3;
        this.m = downloadingState;
        this.n = str4;
    }

    public final boolean a() {
        return this.j;
    }

    public final DownloadingState b() {
        return this.m;
    }

    public final int c() {
        return this.a;
    }

    public final String d() {
        return this.n;
    }

    public final UserId e() {
        return this.d;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.c;
    }

    public final String h() {
        return this.e;
    }

    public final String i() {
        return this.i;
    }

    public final boolean j() {
        return this.h;
    }

    public final Thumb k() {
        return this.g;
    }

    public final String l() {
        return this.l;
    }

    public final UserId m() {
        return this.b;
    }

    public final boolean n() {
        return this.k;
    }
}
