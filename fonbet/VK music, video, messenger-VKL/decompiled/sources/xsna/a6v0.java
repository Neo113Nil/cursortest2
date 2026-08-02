package xsna;

import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Thumb;
import com.vk.dto.podcast.Podcast;
import java.io.File;
import java.util.ArrayList;

/* compiled from: VkMusicOldPodcastEntity.kt */
/* loaded from: classes3.dex */
public final class a6v0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;

    /* compiled from: VkMusicOldPodcastEntity.kt */
    public static final class a {
        public static Podcast a(a6v0 a6v0Var, int i) {
            Long n;
            String str = a6v0Var.b;
            String str2 = (String) j5g.a0(drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
            if (str2 == null || (n = arm0.n(str2)) == null) {
                return null;
            }
            UserId userId = new UserId(n.longValue());
            String str3 = a6v0Var.f;
            SparseArray sparseArray = new SparseArray();
            Context context = e43.a;
            sparseArray.append(200, Uri.fromFile(new File((context != null ? context : null).getFilesDir(), "photos_cache/" + i + '/' + str3)));
            Thumb thumb = new Thumb(str, 200, 200, sparseArray);
            String str4 = a6v0Var.c;
            ArrayList o = e43.o(thumb);
            String str5 = a6v0Var.d;
            int i2 = a6v0Var.e;
            return new Podcast(-100, userId, str4, -100, o, null, false, str5, null, (i2 & 1) == 1, (i2 & 2) == 2, null, false);
        }
    }

    public a6v0(int i, String str, int i2, String str2, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = str4;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6v0)) {
            return false;
        }
        a6v0 a6v0Var = (a6v0) obj;
        return this.a == a6v0Var.a && epx.f(this.b, a6v0Var.b) && epx.f(this.c, a6v0Var.c) && epx.f(this.d, a6v0Var.d) && this.e == a6v0Var.e && epx.f(this.f, a6v0Var.f);
    }

    public final int hashCode() {
        int a2 = shy.a(this.e, urd0.a(urd0.a(urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        String str = this.f;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMusicOldPodcastEntity(id=");
        sb.append(this.a);
        sb.append(", serverId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", flags=");
        sb.append(this.e);
        sb.append(", coverId=");
        return ho8.a(sb, this.f, ')');
    }
}
