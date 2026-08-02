package xsna;

import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.moosic.EncryptedFileInfo;
import com.vk.dto.music.moosic.MoosicAudio;
import java.io.File;
import java.util.List;

/* compiled from: VkMusicOldTrackEntity.kt */
/* loaded from: classes3.dex */
public final class c6v0 {
    public final int a;
    public final String b;
    public final String c;
    public final EncryptedFileInfo d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final int k;
    public final List<Integer> l;
    public final List<Integer> m;

    /* compiled from: VkMusicOldTrackEntity.kt */
    public static final class a {
        public static boolean a(c6v0 c6v0Var) {
            return c6v0Var.k % 2 == 1;
        }

        public static MusicTrack b(c6v0 c6v0Var, UserId userId, int i, String str) {
            int i2;
            UserId userId2;
            Integer m;
            Long n;
            int i3 = c6v0Var.a;
            String str2 = c6v0Var.c;
            String str3 = c6v0Var.f;
            SparseArray sparseArray = new SparseArray();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            sparseArray.append(200, Uri.fromFile(new File(context.getFilesDir(), "photos_cache/" + i + '/' + str3)));
            Thumb thumb = new Thumb(c6v0Var.b, 200, 200, sparseArray);
            if (str2 != null) {
                String str4 = (String) j5g.a0(drm0.b0(str2, new char[]{'_'}, 0, 6));
                UserId userId3 = (str4 == null || (n = arm0.n(str4)) == null) ? userId : new UserId(n.longValue());
                String str5 = (String) j5g.k0(drm0.b0(str2, new char[]{'_'}, 0, 6));
                i2 = (str5 == null || (m = arm0.m(10, str5)) == null) ? -i3 : m.intValue();
                userId2 = userId3;
            } else {
                i2 = -i3;
                userId2 = userId;
            }
            int i4 = i2;
            String str6 = c6v0Var.g;
            String str7 = c6v0Var.h;
            long j = c6v0Var.j / 1000;
            return new MusicTrack(i4, userId2, str6, null, (int) (c6v0Var.i / 1000), 0, str7, "", null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, j, 0, false, 0L, null, false, false, false, null, null, DownloadingState.Downloaded.b, null, false, false, 0, null, false, 0, false, null, thumb, c6v0Var.k % 2 == 1, 0, new MoosicAudio(i, str, c6v0Var.d, c6v0Var.e, "photos_cache/" + i + '/' + str3), false, null, null, null, -16777432, 1003515, null);
        }

        public static MusicTrack c(c6v0 c6v0Var, MusicTrack musicTrack, int i, String str) {
            String str2 = c6v0Var.f;
            SparseArray sparseArray = new SparseArray();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            sparseArray.append(200, Uri.fromFile(new File(context.getFilesDir(), "photos_cache/" + i + '/' + str2)));
            return MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, DownloadingState.Downloaded.b, false, false, new Thumb(c6v0Var.b, 200, 200, sparseArray), new MoosicAudio(i, str, c6v0Var.d, c6v0Var.e, "photos_cache/" + i + '/' + str2), null, -1, 749563);
        }
    }

    public c6v0(int i, String str, String str2, EncryptedFileInfo encryptedFileInfo, long j, String str3, String str4, String str5, long j2, long j3, int i2, List<Integer> list, List<Integer> list2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = encryptedFileInfo;
        this.e = j;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = j2;
        this.j = j3;
        this.k = i2;
        this.l = list;
        this.m = list2;
    }

    public final List<Integer> a() {
        return this.m;
    }

    public final String b() {
        return this.f;
    }

    public final int c() {
        return this.a;
    }

    public final List<Integer> d() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6v0)) {
            return false;
        }
        c6v0 c6v0Var = (c6v0) obj;
        return this.a == c6v0Var.a && epx.f(this.b, c6v0Var.b) && epx.f(this.c, c6v0Var.c) && epx.f(this.d, c6v0Var.d) && this.e == c6v0Var.e && epx.f(this.f, c6v0Var.f) && epx.f(this.g, c6v0Var.g) && epx.f(this.h, c6v0Var.h) && this.i == c6v0Var.i && this.j == c6v0Var.j && this.k == c6v0Var.k && epx.f(this.l, c6v0Var.l) && epx.f(this.m, c6v0Var.m);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return this.m.hashCode() + fw3.a(shy.a(this.k, bh10.a(bh10.a(urd0.a(urd0.a(urd0.a(bh10.a((this.d.hashCode() + ((a2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMusicOldTrackEntity(id=");
        sb.append(this.a);
        sb.append(", moosicId=");
        sb.append(this.b);
        sb.append(", vkId=");
        sb.append(this.c);
        sb.append(", fileInfo=");
        sb.append(this.d);
        sb.append(", size=");
        sb.append(this.e);
        sb.append(", coverId=");
        sb.append(this.f);
        sb.append(", name=");
        sb.append(this.g);
        sb.append(", artistName=");
        sb.append(this.h);
        sb.append(", duration=");
        sb.append(this.i);
        sb.append(", addedAt=");
        sb.append(this.j);
        sb.append(", flags=");
        sb.append(this.k);
        sb.append(", playlistIds=");
        sb.append(this.l);
        sb.append(", albumIds=");
        return ms9.a(')', sb, this.m);
    }
}
