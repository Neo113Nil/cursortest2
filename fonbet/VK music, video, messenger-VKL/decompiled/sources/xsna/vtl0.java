package xsna;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlInfo;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.ads.DisclaimerType;
import com.vk.dto.stories.model.ads.MyTargetAdData;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import xsna.shv;
import xsna.utl0;
import xsna.zu50;

/* compiled from: StoriesMyTargetAdPrefetcherImpl.kt */
/* loaded from: classes11.dex */
public final class vtl0 implements utl0 {
    public final zix b;
    public final HashMap<StoryEntry, ttl0> c = new HashMap<>();
    public final ysg0<utl0.a> d = new ysg0<>();
    public final ysg0<utl0.c.a> e = new ysg0<>();
    public final ysg0<utl0.c.AbstractC3831c> f = new ysg0<>();
    public final ysg0<utl0.c.b> g = new ysg0<>();

    /* compiled from: StoriesMyTargetAdPrefetcherImpl.kt */
    /* loaded from: classes6.dex */
    public static final class b extends phv {
        public final /* synthetic */ zu50 a;
        public final /* synthetic */ vtl0 b;

        public b(zu50 zu50Var, vtl0 vtl0Var) {
            this.a = zu50Var;
            this.b = vtl0Var;
        }

        @Override // xsna.phv
        public final void a() {
            this.b.f.a(new utl0.c.AbstractC3831c.a(this.a));
        }

        @Override // xsna.phv
        public final void b() {
            this.b.f.a(new utl0.c.AbstractC3831c.b(this.a));
        }
    }

    /* compiled from: StoriesMyTargetAdPrefetcherImpl.kt */
    /* loaded from: classes6.dex */
    public static final class c extends shv {
        public final /* synthetic */ vtl0 a;
        public final /* synthetic */ zu50 b;

        public c(zu50 zu50Var, vtl0 vtl0Var) {
            this.a = vtl0Var;
            this.b = zu50Var;
        }

        @Override // xsna.shv
        public final void a(WebView webView, shv.a aVar, String str) {
            this.a.e.a(new utl0.c.a.C3829a(this.b, new IllegalStateException("HTML load error: code=" + aVar.a + " description=" + aVar.b)));
        }

        @Override // xsna.shv
        public final void b(WebView webView) {
            this.a.e.a(new utl0.c.a.b(this.b));
        }

        @Override // xsna.shv
        public final void c(WebView webView, String str, Bitmap bitmap) {
            this.a.e.a(new utl0.c.a.C3830c(this.b));
        }
    }

    public vtl0(zix zixVar) {
        this.b = zixVar;
    }

    public static Image i(kbz0 kbz0Var) {
        return new Image((List<ImageSize>) Collections.singletonList(new ImageSize(kbz0Var.getUrl(), kbz0Var.getWidth(), kbz0Var.getHeight(), null, (char) 0, false, 56, null)));
    }

    @Override // xsna.utl0
    public final void a() {
        this.c.clear();
    }

    @Override // xsna.utl0
    public final ysg0<utl0.c.b> b() {
        return this.g;
    }

    @Override // xsna.utl0
    public final io.reactivex.rxjava3.core.a c(StoryEntry storyEntry, MyTargetAdStoriesContainer myTargetAdStoriesContainer) {
        String d;
        MyTargetAdData myTargetAdData = storyEntry.E0;
        return (myTargetAdData == null || (d = myTargetAdData.d()) == null) ? io.reactivex.rxjava3.core.a.k(new IllegalArgumentException("myTargetAdData source is null")) : new io.reactivex.rxjava3.internal.operators.completable.e(new uik0(d, storyEntry, this, myTargetAdStoriesContainer));
    }

    @Override // xsna.utl0
    public final ysg0<utl0.a> d() {
        return this.d;
    }

    @Override // xsna.utl0
    public final ysg0<utl0.c.AbstractC3831c> e() {
        return this.f;
    }

    @Override // xsna.utl0
    public final void f(StoryEntry storyEntry, MyTargetAdStoriesContainer myTargetAdStoriesContainer) {
        VideoFileOld videoFileOld;
        DisclaimerType disclaimerType;
        l0n d;
        l0n d2;
        DisclaimerType disclaimerType2;
        zix zixVar = this.b;
        if (zixVar == null) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("internalNativeAdFactory is null"));
            return;
        }
        MyTargetAdData myTargetAdData = storyEntry.E0;
        String str = null;
        String d3 = myTargetAdData != null ? myTargetAdData.d() : null;
        if (d3 == null) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("myTargetAdData source is null"));
            return;
        }
        p5z0 b2 = zixVar.a().b(d3, "VK_STORIES");
        wjz0 content = b2.getContent();
        if (content == null) {
            return;
        }
        kbz0 f = content.f();
        storyEntry.m = f != null ? new Photo(i(f)) : null;
        lhz0 h = content.h();
        if (h != null) {
            videoFileOld = VideoFile.a.c();
            videoFileOld.Ib("story");
            videoFileOld.C0((int) h.a());
            videoFileOld.Hb(h.b());
            kbz0 d4 = h.d();
            if (d4 != null) {
                Image i = i(d4);
                videoFileOld.Gb(i);
                videoFileOld.D9(i);
            }
            HashMap hashMap = new HashMap();
            List<nnx> D0 = j5g.D0(new nvu(2), h.c());
            nnx nnxVar = (nnx) j5g.k0(D0);
            if (nnxVar != null) {
                videoFileOld.l8((int) nnxVar.getWidth());
                videoFileOld.G5((int) nnxVar.getHeight());
            }
            for (nnx nnxVar2 : D0) {
                float width = nnxVar2.getWidth();
                VideoUrl videoUrl = width >= 2160.0f ? VideoUrl.URL_2160 : width >= 1440.0f ? VideoUrl.URL_1440 : width >= 1080.0f ? VideoUrl.URL_1080 : width >= 720.0f ? VideoUrl.URL_720 : width >= 480.0f ? VideoUrl.URL_480 : width >= 360.0f ? VideoUrl.URL_360 : VideoUrl.URL_240;
                hashMap.put(videoUrl.l(), new VideoUrlInfo(videoUrl.m(), nnxVar2.a(), videoUrl.q(), videoUrl.s(), videoUrl.o(), videoUrl.r(), videoUrl.j().h()));
            }
            videoFileOld.ua(new VideoUrlStorage(hashMap));
        } else {
            videoFileOld = null;
        }
        storyEntry.n = videoFileOld;
        MyTargetAdData myTargetAdData2 = storyEntry.E0;
        if (myTargetAdData2 != null) {
            myTargetAdData2.e(cqm0.g(b2.getId()));
        }
        myTargetAdStoriesContainer.Tb().put(storyEntry, b2);
        HashMap<StoryEntry, dt50> Ub = myTargetAdStoriesContainer.Ub();
        kbz0 e = content.e();
        String url = e != null ? e.getUrl() : null;
        wjz0 content2 = b2.getContent();
        String g = content2 != null ? content2.g() : null;
        wjz0 content3 = b2.getContent();
        String a2 = content3 != null ? content3.a() : null;
        wjz0 content4 = b2.getContent();
        String b3 = content4 != null ? content4.b() : null;
        String a3 = (a2 == null || b3 == null) ? null : v1v.a(' ', a2, b3);
        wjz0 content5 = b2.getContent();
        String c2 = content5 != null ? content5.c() : null;
        wjz0 content6 = b2.getContent();
        if (content6 == null || (d2 = content6.d()) == null) {
            disclaimerType = null;
        } else {
            switch (d2.a) {
                case 6:
                case 8:
                    disclaimerType2 = DisclaimerType.DRUGS;
                    break;
                case 7:
                default:
                    disclaimerType2 = null;
                    break;
                case 9:
                    disclaimerType2 = DisclaimerType.SUPPLEMENTS;
                    break;
                case 10:
                    disclaimerType2 = DisclaimerType.DECLARATION;
                    break;
                case 11:
                    disclaimerType2 = DisclaimerType.LOANS;
                    break;
                case 12:
                    disclaimerType2 = DisclaimerType.BANKRUPTCY;
                    break;
                case 13:
                    disclaimerType2 = DisclaimerType.ENERGETICS;
                    break;
            }
            disclaimerType = disclaimerType2;
        }
        wjz0 content7 = b2.getContent();
        if (content7 != null && (d = content7.d()) != null) {
            str = d.c;
        }
        Ub.put(storyEntry, new dt50(null, url, g, a3, c2, disclaimerType, str, null, null));
    }

    @Override // xsna.utl0
    public final ttl0 g(StoryEntry storyEntry) {
        return this.c.get(storyEntry);
    }

    @Override // xsna.utl0
    public final ysg0<utl0.c.a> h() {
        return this.e;
    }

    /* compiled from: StoriesMyTargetAdPrefetcherImpl.kt */
    /* loaded from: classes6.dex */
    public static final class a implements zu50.c {
        public final /* synthetic */ StoryEntry a;
        public final /* synthetic */ vtl0 b;
        public final /* synthetic */ zu50 c;
        public final /* synthetic */ bp50 d;
        public final /* synthetic */ MyTargetAdStoriesContainer e;
        public final /* synthetic */ io.reactivex.rxjava3.core.b f;

        public a(StoryEntry storyEntry, vtl0 vtl0Var, zu50 zu50Var, bp50 bp50Var, MyTargetAdStoriesContainer myTargetAdStoriesContainer, io.reactivex.rxjava3.core.b bVar) {
            this.a = storyEntry;
            this.b = vtl0Var;
            this.c = zu50Var;
            this.d = bp50Var;
            this.e = myTargetAdStoriesContainer;
            this.f = bVar;
        }

        @Override // xsna.zu50.c
        public final void a(View view, zu50 zu50Var) {
            this.b.d.a(new utl0.a(view != null ? Integer.valueOf(view.getId()) : null, zu50Var));
        }

        @Override // xsna.zu50.c
        public final void b(zu50 zu50Var) {
            cw50 d = zu50Var.d();
            if (d == null || d.x == null) {
                return;
            }
            this.b.g.a(new utl0.c.b(zu50Var));
        }

        @Override // xsna.zu50.c
        public final void c(iaz0 iaz0Var, zu50 zu50Var) {
            this.b.c.remove(this.a);
            this.f.onError(new IllegalStateException("MyTarget Banner loading Error [" + iaz0Var.a + "]: " + iaz0Var.b));
        }

        @Override // xsna.zu50.c
        public final void d(cw50 cw50Var, zu50 zu50Var) {
            Float valueOf;
            Float f;
            DisclaimerType disclaimerType;
            DisclaimerType disclaimerType2;
            int i;
            l0n l0nVar = cw50Var.k;
            kiw kiwVar = cw50Var.q;
            StoryEntry storyEntry = this.a;
            MyTargetAdData myTargetAdData = storyEntry.E0;
            if (myTargetAdData != null) {
                String str = cw50Var.f;
                myTargetAdData.f = str != null ? cqm0.g(str) : null;
            }
            this.b.c.put(storyEntry, new ttl0(this.c, this.d));
            lhv lhvVar = cw50Var.x;
            if (lhvVar != null) {
                if (lhvVar != null) {
                    int i2 = lhvVar.a;
                    valueOf = Float.valueOf((i2 == 0 || (i = lhvVar.b) == 0) ? 0.5625f : i2 / i);
                    f = valueOf;
                }
                f = null;
            } else {
                if (cw50Var.v != null) {
                    valueOf = Float.valueOf(r5.b / r5.c);
                    f = valueOf;
                }
                f = null;
            }
            HashMap<StoryEntry, dt50> hashMap = this.e.o;
            Bitmap a = kiwVar != null ? kiwVar.a() : null;
            String str2 = kiwVar != null ? kiwVar.a : null;
            String str3 = cw50Var.g;
            String str4 = cw50Var.o;
            String str5 = cw50Var.l;
            String a2 = (str4 == null || str5 == null) ? null : v1v.a(' ', str4, str5);
            String str6 = cw50Var.h;
            if (l0nVar != null) {
                switch (l0nVar.a) {
                    case 6:
                    case 8:
                        disclaimerType2 = DisclaimerType.DRUGS;
                        break;
                    case 7:
                    default:
                        disclaimerType2 = null;
                        break;
                    case 9:
                        disclaimerType2 = DisclaimerType.SUPPLEMENTS;
                        break;
                    case 10:
                        disclaimerType2 = DisclaimerType.DECLARATION;
                        break;
                    case 11:
                        disclaimerType2 = DisclaimerType.LOANS;
                        break;
                    case 12:
                        disclaimerType2 = DisclaimerType.BANKRUPTCY;
                        break;
                    case 13:
                        disclaimerType2 = DisclaimerType.ENERGETICS;
                        break;
                }
                disclaimerType = disclaimerType2;
            } else {
                disclaimerType = null;
            }
            hashMap.put(storyEntry, new dt50(a, str2, str3, a2, str6, disclaimerType, l0nVar != null ? l0nVar.c : null, cw50Var.a() ? Long.valueOf((long) (cw50Var.u * 1000)) : null, f));
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"StoriesMyTargetAdPrefetcherImpl stop handle storyId=" + storyEntry.c + " on thread " + Thread.currentThread().getName()});
            }
            this.f.onComplete();
        }

        @Override // xsna.zu50.c
        public final void onClick() {
            this.b.d.a(new utl0.a(null, this.c));
        }

        @Override // xsna.zu50.c
        public final void onVideoComplete() {
        }

        @Override // xsna.zu50.c
        public final void onVideoPause() {
        }

        @Override // xsna.zu50.c
        public final void onVideoPlay() {
        }
    }
}
