package xsna;

import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.moosic.EncryptedFileInfo;
import com.vk.dto.music.moosic.MoosicAudio;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: VkMusicOldPodcastEpisodeEntity.kt */
/* loaded from: classes3.dex */
public final class b6v0 {
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
    public final int l;
    public final int m;

    /* compiled from: VkMusicOldPodcastEpisodeEntity.kt */
    public static final class a {
        public static MusicTrack a(b6v0 b6v0Var, int i) {
            Long n;
            Integer m;
            Image image;
            Thumb thumb;
            EncryptedFileInfo encryptedFileInfo;
            long j;
            String str;
            int i2;
            String str2 = b6v0Var.f;
            int i3 = b6v0Var.k;
            String str3 = b6v0Var.c;
            String str4 = (String) j5g.a0(drm0.c0(str3, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
            if (str4 == null || (n = arm0.n(str4)) == null) {
                return null;
            }
            UserId userId = new UserId(n.longValue());
            String str5 = (String) j5g.k0(drm0.c0(str3, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
            if (str5 == null || (m = arm0.m(10, str5)) == null) {
                return null;
            }
            int intValue = m.intValue();
            if (str2 != null) {
                String str6 = "photos_cache/" + i + '/' + str2;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                String uri = Uri.fromFile(new File(context.getFilesDir(), str6)).toString();
                m900<String, ImageSize> m900Var = ImageSize.e;
                image = new Image((List<ImageSize>) Collections.singletonList(ImageSize.b.a(uri)));
            } else {
                image = null;
            }
            if (str2 != null) {
                SparseArray sparseArray = new SparseArray();
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                sparseArray.append(200, Uri.fromFile(new File(context2.getFilesDir(), "photos_cache/" + i + '/' + str2)));
                thumb = new Thumb(str3, 200, 200, sparseArray);
            } else {
                thumb = null;
            }
            String str7 = b6v0Var.g;
            String str8 = b6v0Var.h;
            long j2 = b6v0Var.j / 1000;
            int i4 = (int) (b6v0Var.i / 1000);
            boolean z = (i3 & 1) == 1;
            EncryptedFileInfo encryptedFileInfo2 = b6v0Var.d;
            long j3 = b6v0Var.e;
            if (str2 != null) {
                encryptedFileInfo = encryptedFileInfo2;
                j = j3;
                str = "photos_cache/" + i + '/' + str2;
            } else {
                encryptedFileInfo = encryptedFileInfo2;
                j = j3;
                str = null;
            }
            MoosicAudio moosicAudio = new MoosicAudio(i, "", encryptedFileInfo, j, str);
            Episode episode = new Episode(0, false, b6v0Var.l / 1000, b6v0Var.b, image, null, null, null, null, false);
            if ((i3 & 1) == 1 && (i3 & 2) == 2) {
                i2 = 6;
            } else if ((i3 & 1) == 1) {
                i2 = 2;
            } else {
                i2 = (i3 & 2) == 2 ? 4 : 0;
            }
            return new MusicTrack(intValue, userId, str7, null, i4, 0, str8, "", null, 0, false, false, 0, null, false, null, null, z, null, null, null, episode, null, null, j2, 0, false, 0L, null, false, false, false, null, null, DownloadingState.Downloaded.b, null, false, false, 0, null, false, i2, false, null, thumb, false, 0, moosicAudio, false, null, null, null, -19005656, 1011195, null);
        }
    }

    public b6v0(int i, String str, String str2, EncryptedFileInfo encryptedFileInfo, long j, String str3, String str4, String str5, long j2, long j3, int i2, int i3, int i4) {
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
        this.l = i3;
        this.m = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6v0)) {
            return false;
        }
        b6v0 b6v0Var = (b6v0) obj;
        return this.a == b6v0Var.a && epx.f(this.b, b6v0Var.b) && epx.f(this.c, b6v0Var.c) && epx.f(this.d, b6v0Var.d) && this.e == b6v0Var.e && epx.f(this.f, b6v0Var.f) && epx.f(this.g, b6v0Var.g) && epx.f(this.h, b6v0Var.h) && this.i == b6v0Var.i && this.j == b6v0Var.j && this.k == b6v0Var.k && this.l == b6v0Var.l && this.m == b6v0Var.m;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int a2 = bh10.a((this.d.hashCode() + urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31, 31, this.e);
        String str2 = this.f;
        return Integer.hashCode(this.m) + shy.a(this.l, shy.a(this.k, bh10.a(bh10.a(urd0.a(urd0.a((a2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMusicOldPodcastEpisodeEntity(id=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", serverId=");
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
        sb.append(", date=");
        sb.append(this.j);
        sb.append(", flags=");
        sb.append(this.k);
        sb.append(", listenProgress=");
        sb.append(this.l);
        sb.append(", listenState=");
        return vu5.b(sb, this.m, ')');
    }
}
