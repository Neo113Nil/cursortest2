package xsna;

import com.vk.core.preference.Preference;
import com.vk.dto.common.VideoUrl;
import com.vk.knet.cornet.CronetHttpLogger$DebugType;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: CronetDispatcher.kt */
/* loaded from: classes.dex */
public final class gek implements bes0, j601 {
    public final Object b;

    public gek(epf epfVar) {
        this.b = epfVar;
    }

    @Override // xsna.bes0
    public boolean a() {
        o2l.a.getClass();
        return o2l.b("__dbg_liveplayer", false);
    }

    @Override // xsna.bes0
    public Integer b() {
        o2l.a.getClass();
        int i = Preference.j().getInt("__dbg_video_ad_slot_id", 0);
        Integer valueOf = Integer.valueOf(i);
        if (i != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // xsna.bes0
    public Set c() {
        return (Set) this.b;
    }

    @Override // xsna.bes0
    public boolean d() {
        o2l.a.getClass();
        return o2l.b("__dbg_video_live_rotation", false);
    }

    @Override // xsna.bes0
    public boolean e() {
        o2l.a.getClass();
        return o2l.b("__dbg_retries_disabled", false);
    }

    @Override // xsna.bes0
    public boolean f() {
        o2l.a.getClass();
        return o2l.b("__dbg_videoview", false);
    }

    @Override // xsna.bes0
    public boolean g() {
        o2l.a.getClass();
        return o2l.b("__dbg_video_player_logs", false);
    }

    @Override // xsna.bes0
    public boolean h() {
        o2l.a.getClass();
        return o2l.b("__dbg_force_video_ad", false);
    }

    @Override // xsna.bes0
    public String i() {
        o2l.a.getClass();
        return o2l.c("__dbg_video_ad_creative_type", "");
    }

    public void j(skv skvVar) {
        String b = skvVar.b();
        j8g0 j8g0Var = (j8g0) this.b;
        bnk0 b2 = j8g0Var.b(b);
        j8g0.a(b2, b, false);
        CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.CLIENT_QUEUE;
        int availablePermits = b2.a.availablePermits();
        int queueLength = b2.a.getQueueLength();
        StringBuilder b3 = xy6.b(availablePermits, "[cronet] Host queue - ", b, " | availablePermits - ", " | queueLength ");
        b3.append(queueLength);
        Object[] objArr = {cronetHttpLogger$DebugType, b3.toString()};
        qek qekVar = vek.a;
        if (qekVar != null) {
            qekVar.c(Arrays.copyOf(objArr, 2));
        }
        try {
            bnk0 bnk0Var = j8g0Var.b;
            j8g0.a(bnk0Var, b, true);
            Object[] objArr2 = {cronetHttpLogger$DebugType, "[cronet] Common queue by " + b + " | availablePermits - " + bnk0Var.a.availablePermits() + " | queueLength " + bnk0Var.a.getQueueLength()};
            qek qekVar2 = vek.a;
            if (qekVar2 != null) {
                qekVar2.c(Arrays.copyOf(objArr2, 2));
            }
        } catch (Throwable unused) {
            j8g0Var.b(b).a.release();
        }
    }

    @Override // xsna.j601
    public Object zza() {
        return new e301(((yuz0) ((epf) this.b).b).a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r0 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gek() {
        Object obj;
        VideoUrl videoUrl;
        o2l.a.getClass();
        String c = o2l.c("__dbg_video_choose_urls", "");
        c = c.length() <= 0 ? null : c;
        if (c != null) {
            List<String> c0 = drm0.c0(c, new String[]{StringUtils.COMMA}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (String str : c0) {
                VideoUrl[] values = VideoUrl.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        videoUrl = null;
                        break;
                    }
                    videoUrl = values[i];
                    if (epx.f(videoUrl.name(), str)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (videoUrl != null) {
                    arrayList.add(videoUrl);
                }
            }
            obj = j5g.S0(arrayList);
        }
        obj = EmptySet.b;
        this.b = obj;
    }

    public gek(int i, int i2) {
        this.b = new j8g0(i, i2);
    }
}
