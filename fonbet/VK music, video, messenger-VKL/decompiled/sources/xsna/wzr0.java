package xsna;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.vk.dto.common.AdSection;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: VideoAdTracker.kt */
/* loaded from: classes18.dex */
public final class wzr0 {
    public final jc0 a;
    public final Map<String, String> b;
    public final li5 c;
    public int d;

    public wzr0(jc0 jc0Var, Map map, li5 li5Var) {
        this.a = jc0Var;
        this.b = map;
        this.c = li5Var;
    }

    @SuppressLint({"DefaultLocale"})
    public final void a(String str, AdSection adSection, String str2) {
        String name;
        Bundle bundle = new Bundle();
        li5 li5Var = this.c;
        VideoAutoPlay videoAutoPlay = li5Var.a;
        long j = 1000;
        long duration = videoAutoPlay.getDuration() / j;
        long position = videoAutoPlay.getPosition() / j;
        if (position >= 0) {
            bundle.putLong("duration", duration);
            bundle.putLong("ad_position", position);
        }
        bundle.putString("params", this.b.toString());
        bundle.putString("type", str);
        jc0 jc0Var = this.a;
        bundle.putLong("user_id", jc0Var.c.b);
        bundle.putLong("ts", System.currentTimeMillis() / j);
        bundle.putString("video_id", jc0Var.d);
        bundle.putString("guid", UUID.randomUUID().toString());
        String str3 = jc0Var.a;
        bpn0 bpn0Var = cqm0.a;
        if (str3 == null) {
            str3 = "";
        }
        bundle.putString("ref", str3);
        String str4 = jc0Var.b;
        bundle.putString("context", str4 != null ? str4 : "");
        String obj = jc0Var.e.toString();
        Locale locale = Locale.ROOT;
        bundle.putString("player_type", obj.toLowerCase(locale));
        String str5 = jc0Var.f;
        if (str5 != null) {
            bundle.putString("track_code", str5);
        }
        if (str2 != null) {
            bundle.putString("banner_id", str2);
        }
        if (adSection != null && (name = adSection.name()) != null) {
            bundle.putString("ad_type", name.toLowerCase(locale));
        }
        if (li5Var.a()) {
            bundle.putBoolean("is_in_pip", true);
        }
        if (videoAutoPlay.M0() && !videoAutoPlay.R0().h()) {
            bundle.putBoolean("is_in_background", true);
        }
        qyk0.a().e("video_ad_play", bundle);
    }
}
