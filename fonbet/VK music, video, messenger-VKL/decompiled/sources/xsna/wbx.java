package xsna;

import android.net.Uri;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.interactive.InteractiveInfo;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.random.Random;
import one.video.player.OneVideoPlayer;
import one.video.player.model.VideoContentType;
import one.video.stat2.ContentType;
import one.video.stat2.Mode;
import one.video.statistics.onelog.interative.ClickType;
import org.json.JSONObject;

/* compiled from: InteractiveStatisticController.kt */
/* loaded from: classes3.dex */
public final class wbx {
    public final VideoFile a;
    public final m7q b;
    public a c;
    public d3b0 d;
    public String e;
    public ybx g;
    public final boolean i;
    public String j;
    public String k;
    public one.video.stat2.a l;
    public final xbx m;
    public final HashMap<String, lpt0> f = new HashMap<>();
    public final b h = new b();

    /* compiled from: InteractiveStatisticController.kt */
    public static final class a {
        public final com.vk.movika.sdk.base.ui.c a;
        public final mj80 b;
        public final xk80 c;

        public a(com.vk.movika.sdk.base.ui.c cVar, mj80 mj80Var, xk80 xk80Var) {
            this.a = cVar;
            this.b = mj80Var;
            this.c = xk80Var;
        }
    }

    /* compiled from: InteractiveStatisticController.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoContentType.values().length];
            try {
                iArr[VideoContentType.MP4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoContentType.HLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoContentType.DASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoContentType.RTMP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoContentType.LOCAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoContentType.OFFLINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wbx(VideoFile videoFile, m7q m7qVar, opt0 opt0Var) {
        String str;
        this.a = videoFile;
        this.b = m7qVar;
        String str2 = "";
        this.e = "";
        this.i = (com.vk.toggle.d.t.b() == null && com.vk.toggle.d.E0.b() == null) ? false : true;
        gpt0 gpt0Var = gpt0.a;
        Random.Default r13 = Random.b;
        r13.getClass();
        gg ggVar = Random.c;
        this.j = new BigInteger(Long.toUnsignedString(ggVar.m()), 10).toString(36);
        r13.getClass();
        this.k = new BigInteger(Long.toUnsignedString(ggVar.m()), 10).toString(36);
        this.m = new xbx(this);
        for (lpt0 lpt0Var : opt0Var.b()) {
            this.f.put(lpt0Var.a, lpt0Var);
        }
        opt0Var.e = new qr0(1, this, wbx.class, "addToChaptersMap", "addToChaptersMap(Lcom/vk/movika/impl/VideoVariantsResolver$ChapterIdToOvid;)V", 0, 7);
        InteractiveInfo R7 = this.a.R7();
        if (R7 != null && (str = R7.c) != null) {
            str2 = str;
        }
        this.e = str2;
    }

    public static final void a(wbx wbxVar) {
        Map map;
        sht0 sht0Var;
        Uri uri;
        if (wbxVar.i) {
            one.video.stat2.a aVar = wbxVar.l;
            one.video.stat2.a aVar2 = null;
            aVar2 = null;
            aVar2 = null;
            if (epx.f(aVar != null ? aVar.a : null, wbxVar.j)) {
                return;
            }
            String str = wbxVar.k;
            String str2 = wbxVar.j;
            m7q m7qVar = wbxVar.b;
            String host = (m7qVar == null || (sht0Var = m7qVar.e) == null || (uri = sht0Var.b) == null) ? null : uri.getHost();
            try {
                long parseLong = Long.parseLong(wbxVar.e);
                if (m7qVar != null && host != null) {
                    vw3 vw3Var = ryk0.a;
                    String M4 = wbxVar.a.M4();
                    JSONObject jSONObject = M4 != null ? new JSONObject(M4) : null;
                    long j = m7qVar.s;
                    Mode mode = Mode.INLINE;
                    ContentType.a aVar3 = ContentType.Companion;
                    String upperCase = m7qVar.j.toUpperCase(Locale.ROOT);
                    aVar3.getClass();
                    map = ContentType.types;
                    ContentType contentType = (ContentType) map.get(upperCase);
                    if (contentType == null) {
                        contentType = ContentType.UNKNOWN;
                    }
                    aVar2 = new one.video.stat2.a(str2, str, parseLong, jSONObject, j, host, false, mode, true, false, false, contentType);
                }
            } catch (Exception unused) {
            }
            wbxVar.e(aVar2);
        }
    }

    public final void b(a aVar, d3b0 d3b0Var) {
        String str;
        a aVar2 = this.c;
        xbx xbxVar = this.m;
        b bVar = this.h;
        if (aVar2 != null) {
            aVar2.a.d.x.D(bVar);
            aVar2.b.o.D(xbxVar);
        }
        ybx ybxVar = this.g;
        if (ybxVar != null) {
            ybxVar.z(null);
        }
        this.g = null;
        e(null);
        this.c = aVar;
        c();
        gpt0 gpt0Var = gpt0.a;
        Random.b.getClass();
        this.k = new BigInteger(Long.toUnsignedString(Random.c.m()), 10).toString(36);
        if (aVar != null) {
            aVar.a.d.x.y(bVar);
            aVar.b.o.y(xbxVar);
            xk80 xk80Var = aVar.c;
            InteractiveInfo R7 = this.a.R7();
            if (R7 == null || (str = R7.d) == null) {
                str = "";
            }
            ybx ybxVar2 = new ybx(str);
            ybxVar2.z(xk80Var);
            this.g = ybxVar2;
            f(this.b, this.e);
        }
        this.d = d3b0Var;
    }

    public final void c() {
        gpt0 gpt0Var = gpt0.a;
        Random.b.getClass();
        this.j = new BigInteger(Long.toUnsignedString(Random.c.m()), 10).toString(36);
    }

    public final void d() {
        String str;
        ybx ybxVar = this.g;
        if (ybxVar != null) {
            ClickType clickType = ClickType.WATCH_AGAIN_BTN;
            g4b0 g4b0Var = ybxVar.i;
            if (g4b0Var == null) {
                g4b0Var = ybxVar.j;
            }
            if (g4b0Var != null) {
                ybx.A("player_interface_click", g4b0Var).setCustom("param", clickType.h()).log();
            }
        }
        ybx ybxVar2 = this.g;
        if (ybxVar2 != null) {
            ybxVar2.z(null);
        }
        this.g = null;
        c();
        gpt0 gpt0Var = gpt0.a;
        Random.b.getClass();
        this.k = new BigInteger(Long.toUnsignedString(Random.c.m()), 10).toString(36);
        a aVar = this.c;
        if (aVar != null) {
            xk80 xk80Var = aVar.c;
            InteractiveInfo R7 = this.a.R7();
            if (R7 == null || (str = R7.d) == null) {
                str = "";
            }
            ybx ybxVar3 = new ybx(str);
            ybxVar3.z(xk80Var);
            this.g = ybxVar3;
            e(null);
        }
    }

    public final void e(one.video.stat2.a aVar) {
        a aVar2;
        sht0 j;
        Uri uri;
        one.video.stat2.a aVar3 = this.l;
        if (aVar3 != aVar) {
            if (aVar3 != null && !aVar3.f) {
                int i = wn80.a;
                OneVideoPlayer oneVideoPlayer = aVar3.r;
                long e = oneVideoPlayer != null ? aVar3.e(oneVideoPlayer) : -1L;
                OneVideoPlayer oneVideoPlayer2 = aVar3.r;
                String str = null;
                if (oneVideoPlayer2 != null && (j = oneVideoPlayer2.j()) != null && (uri = j.b) != null) {
                    str = uri.getHost();
                }
                aVar3.f(e, str);
            }
            this.l = aVar;
            if (aVar == null || (aVar2 = this.c) == null) {
                return;
            }
            xk80 xk80Var = aVar2.c;
            aVar.l(xk80Var, Long.valueOf(aVar.e(xk80Var)));
        }
    }

    public final void f(m7q m7qVar, String str) {
        if (m7qVar == null) {
            return;
        }
        sht0 e = jgz.e(m7qVar);
        Random.Default r3 = Random.b;
        r3.getClass();
        gg ggVar = Random.c;
        new BigInteger(Long.toUnsignedString(ggVar.m()), 10).toString(36);
        r3.getClass();
        new BigInteger(Long.toUnsignedString(ggVar.m()), 10).toString(36);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = m7qVar.q;
        String host = e.b.getHost();
        String str2 = m7qVar.h;
        String str3 = m7qVar.g;
        if (str3 != null) {
            linkedHashMap.put("track_code", str3);
        }
        String str4 = this.j;
        String str5 = this.k;
        int i = c.$EnumSwitchMapping$0[e.a.ordinal()];
        one.video.statistics.ContentType contentType = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : one.video.statistics.ContentType.mp4 : one.video.statistics.ContentType.rtmp : one.video.statistics.ContentType.dash : one.video.statistics.ContentType.hls : one.video.statistics.ContentType.mp4;
        one.video.statistics.ContentType contentType2 = contentType != null ? contentType : null;
        ybx ybxVar = this.g;
        if (ybxVar != null) {
            ybxVar.y(new g4b0(str, str4, str5, host, contentType2, str2, z, false, false, linkedHashMap));
        }
    }

    /* compiled from: InteractiveStatisticController.kt */
    public final class b implements com.vk.movika.sdk.base.listener.h {
        public b() {
        }

        @Override // com.vk.movika.sdk.base.listener.h
        public final void m(com.vk.movika.sdk.base.model.l lVar) {
            ybx ybxVar;
            String str = ((com.vk.movika.sdk.base.model.g) lVar.c).c;
            ClickType clickType = epx.f(str, "Button") ? ClickType.NEXT_CHAPTER_BTN : epx.f(str, "Area") ? ClickType.NEXT_CHAPTER_AREA : null;
            if (clickType == null || (ybxVar = wbx.this.g) == null) {
                return;
            }
            g4b0 g4b0Var = ybxVar.i;
            if (g4b0Var == null) {
                g4b0Var = ybxVar.j;
            }
            if (g4b0Var == null) {
                return;
            }
            ybx.A("player_interface_click", g4b0Var).setCustom("param", clickType.h()).log();
        }

        @Override // com.vk.movika.sdk.base.listener.h
        public final void h(com.vk.movika.sdk.base.model.l lVar) {
        }

        @Override // com.vk.movika.sdk.base.listener.h
        public final void n(com.vk.movika.sdk.base.model.l lVar) {
        }
    }
}
