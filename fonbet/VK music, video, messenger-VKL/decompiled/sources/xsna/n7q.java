package xsna;

import android.util.Size;
import com.vk.dto.common.StatPixel;
import com.vk.dto.common.VideoContentType;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.live.LivePlayBackSettings;
import com.vk.mediastore.media.VideoCacheIdImpl;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import one.video.exo.offline.DownloadInfo;
import one.video.pixels.model.PixelParam;
import xsna.wir0;
import xsna.zot0;

/* compiled from: ExoVideoSourceFactory.kt */
/* loaded from: classes2.dex */
public final class n7q {
    public final int a;
    public final int b;
    public final boolean c;
    public final LivePlayBackSettings d;
    public final String e;
    public final VideoUrlStorage f;
    public final boolean g;
    public final float h;
    public final boolean i;
    public final long j;
    public final int k;
    public final Size l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final long p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final boolean v;
    public final String w;
    public final Map<StatPixel.a, nsk0> x;

    public n7q(int i, int i2, boolean z, LivePlayBackSettings livePlayBackSettings, String str, VideoUrlStorage videoUrlStorage, boolean z2, float f, boolean z3, long j, int i3, Size size, boolean z4, boolean z5, int i4, long j2, String str2, String str3, String str4, String str5, String str6, boolean z6, String str7, Map map) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = livePlayBackSettings;
        this.e = str;
        this.f = videoUrlStorage;
        this.g = z2;
        this.h = f;
        this.i = z3;
        this.j = j;
        this.k = i3;
        this.l = size;
        this.m = z4;
        this.n = z5;
        this.o = i4;
        this.p = j2;
        this.q = str2;
        this.r = str3;
        this.s = str4;
        this.t = str5;
        this.u = str6;
        this.v = z6;
        this.w = str7;
        this.x = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r3 != false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v33, types: [kotlin.collections.builders.ListBuilder] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m7q a() {
        ?? singletonList;
        List list;
        ListBuilder listBuilder;
        VideoCacheIdImpl videoCacheIdImpl;
        boolean z;
        Integer num;
        Object rrj0Var;
        DownloadInfo s;
        int i = this.a;
        boolean z2 = i == -1;
        if (i == -5) {
            singletonList = Collections.singletonList(VideoUrl.RTMP_URL);
        } else if (i == -4) {
            singletonList = zot0.c();
        } else if (i == -3) {
            singletonList = e43.l(VideoUrl.OKMP_URL, VideoUrl.RTMP_URL);
        } else if (i == -2) {
            singletonList = zot0.d();
        } else if (i != -1) {
            zrp<VideoUrl> k = VideoUrl.k();
            singletonList = new ArrayList();
            for (Object obj : k) {
                if (((VideoUrl) obj).m() == i) {
                    singletonList.add(obj);
                }
            }
        } else {
            singletonList = Collections.singletonList(VideoUrl.EXTERNAL_URL);
        }
        if (!z2) {
            boolean isEmpty = singletonList.isEmpty();
            listBuilder = singletonList;
        }
        if (this.g) {
            VideoUrl.Companion.getClass();
            list = VideoUrl.MP4_URLS;
            listBuilder = j5g.D0(new zot0.a(), list);
        } else {
            listBuilder = zot0.a();
        }
        int i2 = 2;
        int i3 = this.b;
        wir0.a c3936a = i3 == 2 ? new wir0.a.C3936a(this.c) : wir0.a.b.a;
        VideoUrlStorage videoUrlStorage = this.f;
        wir0 wir0Var = new wir0(videoUrlStorage, c3936a);
        fxc0.B().i().getClass();
        Pair<sht0, VideoUrl> a = new on80(videoUrlStorage, wir0Var, this.d, null).a(listBuilder);
        if (a == null) {
            return null;
        }
        sht0 d = a.d();
        VideoUrl g = a.g();
        ezs0 s2 = fxc0.B().s();
        String str = this.e;
        boolean z3 = s2.c(str) && epx.f(this.u, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.OFFLINE));
        int m = g.m();
        int i4 = this.k / 1000;
        Size size = this.l;
        int width = size.getWidth();
        int height = size.getHeight();
        String a2 = cqm0.a(this.t);
        String str2 = this.u;
        String str3 = a2 == null ? str2 : a2;
        boolean z4 = this.i || z3;
        long j = this.j;
        if (z3 && (s = fxc0.B().s().s(str)) != null) {
            if (s.c == DownloadInfo.State.STATE_COMPLETED) {
                s = null;
            }
            if (s != null) {
                if (j >= ((long) Math.floor((s.g / 100.0f) * r8)) - 5000) {
                    j = 0;
                }
            }
        }
        long j2 = j;
        Collection<nsk0> values = this.x.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (true) {
            int i5 = 7;
            int i6 = 5;
            if (!it.hasNext()) {
                boolean q = g.q();
                boolean s3 = g.s();
                if (i3 != 5) {
                    if (i3 == 7) {
                        VideoCacheIdImpl videoCacheIdImpl2 = VideoCacheIdImpl.STORY;
                        if (i3 != 4 && pk90.d.get()) {
                            videoCacheIdImpl = videoCacheIdImpl2;
                        }
                    }
                    videoCacheIdImpl = null;
                } else {
                    videoCacheIdImpl = VideoCacheIdImpl.MESSAGES;
                }
                String h = i3 == 8 ? "TRAILER" : g.j().h();
                VideoContentType j3 = g.j();
                if (i3 == 3) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIPS_NEW_DISK_CACHE;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures) && e43.l(VideoContentType.DASH_SEP, VideoContentType.ONDEMAND_DASH, VideoContentType.WEBM, VideoContentType.MULTI_DASH).contains(j3)) {
                        z = true;
                        return new m7q(this.e, this.o, this.p, this.q, d, this.w, this.s, str3, m, h, i4, width, height, this.b, this.m, z4, this.n, str2, j2, s3, q, this.h, arrayList, videoCacheIdImpl, this.v, this.r, z);
                    }
                }
                z = false;
                return new m7q(this.e, this.o, this.p, this.q, d, this.w, this.s, str3, m, h, i4, width, height, this.b, this.m, z4, this.n, str2, j2, s3, q, this.h, arrayList, videoCacheIdImpl, this.v, this.r, z);
            }
            ArrayList<StatPixel> arrayList2 = ((nsk0) it.next()).a;
            ArrayList arrayList3 = new ArrayList();
            for (StatPixel statPixel : arrayList2) {
                int i7 = i2;
                StatPixel.a aVar = statPixel.b;
                Map<String, String> map = statPixel.d;
                String str4 = statPixel.c;
                if (aVar instanceof StatPixel.a.c.d) {
                    num = 1;
                } else if (aVar instanceof StatPixel.a.c.g) {
                    num = 0;
                } else if (aVar instanceof StatPixel.a.c.h) {
                    num = 4;
                } else if (aVar instanceof StatPixel.a.c.C0905a) {
                    num = 3;
                } else if (aVar instanceof StatPixel.a.c.e) {
                    num = Integer.valueOf(i6);
                } else if (aVar instanceof StatPixel.a.c.f) {
                    num = 6;
                } else if (aVar instanceof StatPixel.a.c.b) {
                    num = Integer.valueOf(i7);
                } else if (aVar instanceof StatPixel.a.c.C0906c) {
                    num = Integer.valueOf(i5);
                } else {
                    if (!(aVar instanceof StatPixel.a.AbstractC0903a) && !(aVar instanceof StatPixel.a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    num = null;
                }
                if (num != null && statPixel.e) {
                    rrj0Var = new jfx(Collections.singletonList(str4), num.intValue());
                } else if (num == null || map.isEmpty()) {
                    rrj0Var = num != null ? new rrj0(Collections.singletonList(str4), num.intValue()) : null;
                } else {
                    List singletonList2 = Collections.singletonList(str4);
                    int intValue = num.intValue();
                    ArrayList arrayList4 = new ArrayList(map.size());
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        arrayList4.add(new PixelParam(entry.getKey(), entry.getValue()));
                    }
                    rrj0Var = new di90(intValue, arrayList4, singletonList2);
                }
                if (rrj0Var != null) {
                    arrayList3.add(rrj0Var);
                }
                i2 = i7;
                i5 = 7;
                i6 = 5;
            }
            g5g.y(arrayList3, arrayList);
        }
    }
}
