package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.apps.BuildInfo;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.growth.api.data.VideoGrowthCommunitySource;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.sru;

/* compiled from: VideoGrowthTrapsManagerImpl.kt */
/* loaded from: classes6.dex */
public final class yos0 implements wos0 {
    public final f0s0 a;
    public final bos0 b;
    public final uos0 c;
    public final ros0 d;
    public final nos0 e;
    public final vcs0 f;

    /* compiled from: VideoGrowthTrapsManagerImpl.kt */
    public static final class a {
        public final /* synthetic */ FunctionReferenceImpl a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(gzs<s3q0> gzsVar) {
            this.a = (FunctionReferenceImpl) gzsVar;
        }
    }

    public yos0(f0s0 f0s0Var, bos0 bos0Var, uos0 uos0Var, ros0 ros0Var, nos0 nos0Var, vcs0 vcs0Var) {
        this.a = f0s0Var;
        this.b = bos0Var;
        this.c = uos0Var;
        this.d = ros0Var;
        this.e = nos0Var;
        this.f = vcs0Var;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wos0
    public final void a(Context context, VideoGrowthVideoParams videoGrowthVideoParams, boolean z, x1e0 x1e0Var) {
        if (this.e.b(z)) {
            return;
        }
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(VideoFeatures.VIDEO_ADS_SUSPEND_SAA_UNUSED) && this.a.b(context, videoGrowthVideoParams)) {
            return;
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SUPERAPP_BOMBING_TRAPS;
        if (bVar.a(videoFeatures)) {
            ewc ewcVar = new ewc(x1e0Var, videoGrowthVideoParams, this, context, 1);
            bos0 bos0Var = this.b;
            ?? r5 = bos0Var.g;
            ?? r10 = bos0Var.c;
            if (!BuildInfo.s() || !bVar.a(videoFeatures)) {
                ewcVar.invoke(yns0.g);
            }
            long a2 = pvo0.a();
            if (a2 - ((SharedPreferences) r10.getValue()).getLong("pref_key_bomb_trap_last_show_time", 0L) >= bos0Var.e) {
                if (((sk3) r5.getValue()).isEmpty() && a2 - ((SharedPreferences) r10.getValue()).getLong("pref_key_bomb_trap_last_show_time", 0L) >= bos0Var.f) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    SharedPreferences.Editor edit = ((SharedPreferences) r10.getValue()).edit();
                    edit.putStringSet("pref_key_shown_bomb_trap_ids", linkedHashSet);
                    edit.apply();
                    cos0 cos0Var = (cos0) bos0Var.d.getValue();
                    if (cos0Var != null) {
                        ((sk3) r5.getValue()).addAll(cos0Var.a);
                    }
                }
                zns0 zns0Var = (zns0) ((sk3) r5.getValue()).d();
                if (zns0Var == null) {
                    ewcVar.invoke(yns0.g);
                } else {
                    bos0Var.b.a(zns0Var.a, new aos0(bos0Var, zns0Var, ewcVar), new xx40(ewcVar, 16));
                }
            } else {
                ewcVar.invoke(yns0.g);
            }
        }
        ros0 ros0Var = this.d;
        ?? r1 = ros0Var.e;
        if (BuildInfo.s() && bVar.a(VideoFeatures.VIDEO_SUPERAPP_DISCOVER_TRAPS) && bVar.a(VideoFeatures.VIDEO_OPEN_STANDALONE_BOTTOMSHEET) && !ros0Var.c.a()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (((SharedPreferences) r1.getValue()).getLong("pref_key_last_open_vk_video_at_discovery_popup_show_after_close", 0L) == 0) {
                if (((SharedPreferences) r1.getValue()).getLong("pref_key_last_open_vk_video_at_discovery_popup_show", 0L) != 0 && currentTimeMillis < ((SharedPreferences) r1.getValue()).getLong("pref_key_last_open_vk_video_at_discovery_popup_show", 0L) + ros0Var.h) {
                    return;
                }
                SharedPreferences.Editor edit2 = ((SharedPreferences) r1.getValue()).edit();
                edit2.putLong("pref_key_last_open_vk_video_at_discovery_popup_show", currentTimeMillis);
                edit2.apply();
            } else {
                if (currentTimeMillis < ((SharedPreferences) r1.getValue()).getLong("pref_key_last_open_vk_video_at_discovery_popup_show_after_close", 0L) + ros0Var.i) {
                    return;
                }
                SharedPreferences.Editor edit3 = ((SharedPreferences) r1.getValue()).edit();
                edit3.putLong("pref_key_last_open_vk_video_at_discovery_popup_show", currentTimeMillis);
                edit3.apply();
                SharedPreferences.Editor edit4 = ((SharedPreferences) r1.getValue()).edit();
                edit4.putLong("pref_key_last_open_vk_video_at_discovery_popup_show_after_close", 0L);
                edit4.apply();
            }
            d0s d0sVar = new d0s(this, context, videoGrowthVideoParams);
            zos0 zos0Var = (zos0) ros0Var.g.getValue();
            if (zos0Var != null) {
                new sru.a(context, zos0Var, new j4r0(d0sVar, zos0Var, ros0Var)).I0(null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wos0
    public final void b(Context context, VideoGrowthVideoParams videoGrowthVideoParams, long j, VideoGrowthCommunitySource videoGrowthCommunitySource, gzs<s3q0> gzsVar) {
        a aVar = new a(gzsVar);
        String str = "@club" + Math.abs(j);
        vcs0 vcs0Var = this.f;
        zos0 zos0Var = (zos0) ((Map) vcs0Var.d.getValue()).getOrDefault(videoGrowthCommunitySource.h(), null);
        if (zos0Var != null) {
            new sru.a(context, zos0Var, new ucs0(aVar, zos0Var, vcs0Var, context, videoGrowthVideoParams, str)).I0(null);
        }
    }
}
