package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.music.MusicTrack;
import java.util.List;

/* compiled from: MusicLinksUtils.kt */
/* loaded from: classes3.dex */
public final class vm40 {
    public static final String a = i5s.a(new StringBuilder("https://"), a0a.d, "/app51404928");
    public static final String b = "standalone3";
    public static final List<Long> c = e43.l(51404928L, 51491207L, 51404928L);

    public static String a() {
        return i5s.a(new StringBuilder("https://"), a0a.d, "/audio?section=updates");
    }

    public static String b() {
        return i5s.a(new StringBuilder("https://"), a0a.d, "/audio_offline");
    }

    public static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        boolean u = BuildInfo.u();
        String str3 = a;
        sb.append(u ? tdj.a(v1v.b(str3, '#'), b, "&utm_source=", str) : pzl.b(str3, "#utm_source=", str));
        if (str2 != null && str.equals("my_music")) {
            sb.append("&utm_term=".concat(str2));
        }
        return sb.toString();
    }

    public static String d(MusicTrack musicTrack) {
        if (musicTrack.Mb()) {
            return "https://" + a0a.d + "/audiobook" + musicTrack.d0;
        }
        if (musicTrack.Vb()) {
            StringBuilder sb = new StringBuilder();
            sb.append("https://" + a0a.d + "/podcast");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(musicTrack.c);
            sb2.append('_');
            sb2.append(musicTrack.b);
            sb.append(sb2.toString());
            String str = musicTrack.r;
            if (str != null && str.length() != 0) {
                sb.append(BundleUtil.UNDERLINE_TAG + musicTrack.r);
            }
            return sb.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("https://" + a0a.d + "/audio");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(musicTrack.c);
        sb4.append('_');
        sb4.append(musicTrack.b);
        sb3.append(sb4.toString());
        String str2 = musicTrack.r;
        if (str2 != null && str2.length() != 0) {
            sb3.append(BundleUtil.UNDERLINE_TAG + musicTrack.r);
        }
        return sb3.toString();
    }
}
