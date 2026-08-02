package yads;

import android.view.View;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import kotlin.Pair;
import xsna.on00;
import xsna.pn00;
import xsna.ttp0;

/* loaded from: classes10.dex */
public final class sg3 implements Runnable {
    public final /* synthetic */ tg3 b;

    public sg3(tg3 tg3Var) {
        this.b = tg3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tg3 tg3Var = this.b;
        if (!tg3Var.d) {
            if (tg3Var.a.a.contains(lh3.d)) {
                ch3 ch3Var = (ch3) this.b.b;
                fh3 fh3Var = ch3Var.f;
                mj3 mj3Var = ch3Var.g;
                mj3Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!ttp0.g(linkedHashMap)) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                View view = mj3Var.b.getView();
                Integer valueOf = view != null ? Integer.valueOf(view.getHeight()) : null;
                Integer valueOf2 = view != null ? Integer.valueOf(view.getWidth()) : null;
                lm1 lm1Var = mj3Var.a.c;
                if (valueOf == null || valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    linkedHashMap.put("view_container_height", StringUtils.UNDEFINED);
                } else {
                    linkedHashMap.put("view_container_height", valueOf);
                }
                if (valueOf2 == null || valueOf2.intValue() <= 0) {
                    valueOf2 = null;
                }
                if (valueOf2 == null) {
                    linkedHashMap.put("view_container_width", StringUtils.UNDEFINED);
                } else {
                    linkedHashMap.put("view_container_width", valueOf2);
                }
                int i = lm1Var.g;
                Integer valueOf3 = i > 0 ? Integer.valueOf(i) : null;
                if (valueOf3 == null) {
                    linkedHashMap.put("video_height", StringUtils.UNDEFINED);
                } else {
                    linkedHashMap.put("video_height", valueOf3);
                }
                int i2 = lm1Var.h;
                Integer valueOf4 = i2 > 0 ? Integer.valueOf(i2) : null;
                if (valueOf4 == null) {
                    linkedHashMap.put("video_width", StringUtils.UNDEFINED);
                } else {
                    linkedHashMap.put("video_width", valueOf4);
                }
                String str = lm1Var.e;
                if (str == null) {
                    linkedHashMap.put("video_codec", StringUtils.UNDEFINED);
                } else {
                    linkedHashMap.put("video_codec", str);
                }
                String str2 = lm1Var.d;
                if (str2 == null) {
                    linkedHashMap.put("video_mime_type", StringUtils.UNDEFINED);
                } else {
                    linkedHashMap.put("video_mime_type", str2);
                }
                Float f = lm1Var.f;
                if (f == null) {
                    linkedHashMap.put("video_vmaf", StringUtils.UNDEFINED);
                } else {
                    linkedHashMap.put("video_vmaf", f);
                }
                fh3Var.f = on00.f(new Pair("video_playback_info", linkedHashMap));
                ch3Var.a.a(v5.u);
                if (!ch3Var.h) {
                    ch3Var.h = true;
                    fh3 fh3Var2 = ch3Var.f;
                    fh3Var2.getClass();
                    fh3Var2.a(pn00.m(new Pair("status", "success"), new Pair("durations", fh3Var2.c.a())));
                }
                tg3 tg3Var2 = this.b;
                tg3Var2.d = true;
                tg3Var2.c.removeCallbacksAndMessages(null);
                tg3Var2.e = false;
                return;
            }
        }
        this.b.c.postDelayed(this, 200L);
    }
}
