package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import com.vkontakte.android.R;
import java.util.EnumMap;
import kotlin.LazyThreadSafetyMode;
import xsna.nhz;

/* compiled from: VideoGrowthListingControllerImpl.kt */
/* loaded from: classes6.dex */
public final class nos0 implements mos0 {
    public final hos0 a;
    public final hit0 b;
    public final sos0 c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new yo80(11));

    /* compiled from: VideoGrowthListingControllerImpl.kt */
    public static final class a implements qos0 {
        public final /* synthetic */ fos0 a;
        public final /* synthetic */ nos0 b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ String d;
        public final /* synthetic */ VideoGrowthAppStore e;
        public final /* synthetic */ VideoGrowthVideoParams f;

        public a(fos0 fos0Var, nos0 nos0Var, Context context, String str, VideoGrowthAppStore videoGrowthAppStore, VideoGrowthVideoParams videoGrowthVideoParams) {
            this.a = fos0Var;
            this.b = nos0Var;
            this.c = context;
            this.d = str;
            this.e = videoGrowthAppStore;
            this.f = videoGrowthVideoParams;
        }

        @Override // xsna.qos0
        public final void a() {
            this.b.c.show(this.d);
            this.a.c();
        }

        @Override // xsna.qos0
        public final void b() {
            this.b.c.d(this.d);
            fos0 fos0Var = this.a;
            fos0Var.a();
            fos0Var.b();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.qos0
        public final void c() {
            fos0 fos0Var = this.a;
            fos0Var.a();
            nos0 nos0Var = this.b;
            oos0 oos0Var = (oos0) nos0Var.d.getValue();
            if (oos0Var != null && oos0Var.c) {
                fos0Var.b();
            }
            nos0Var.b.b(this.c, this.d, this.e, this.f, null);
        }

        @Override // xsna.qos0
        public final void onCancel() {
            this.b.c.b(this.d);
            fos0 fos0Var = this.a;
            fos0Var.a();
            fos0Var.b();
        }
    }

    public nos0(hos0 hos0Var, sos0 sos0Var, hit0 hit0Var) {
        this.a = hos0Var;
        this.b = hit0Var;
        this.c = sos0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mos0
    public final void a(Context context, VideoGrowthVideoParams videoGrowthVideoParams, boolean z, boolean z2, boolean z3, fos0 fos0Var) {
        oos0 oos0Var = (oos0) this.d.getValue();
        if (oos0Var == null) {
            fos0Var.b();
            return;
        }
        boolean z4 = z2 || oos0Var.d;
        if (z && (!dy2.i("com.vk.vkvideo") || z4)) {
            fos0Var.b();
            return;
        }
        EnumMap<VideoGrowthAppStore, String> enumMap = new EnumMap<>((Class<VideoGrowthAppStore>) VideoGrowthAppStore.class);
        enumMap.put((EnumMap<VideoGrowthAppStore, String>) VideoGrowthAppStore.GOOGLE, (VideoGrowthAppStore) oos0Var.e);
        enumMap.put((EnumMap<VideoGrowthAppStore, String>) VideoGrowthAppStore.HUAWEI, (VideoGrowthAppStore) oos0Var.f);
        enumMap.put((EnumMap<VideoGrowthAppStore, String>) VideoGrowthAppStore.RUSTORE, (VideoGrowthAppStore) oos0Var.g);
        enumMap.put((EnumMap<VideoGrowthAppStore, String>) VideoGrowthAppStore.SAMSUNG, (VideoGrowthAppStore) oos0Var.h);
        enumMap.put((EnumMap<VideoGrowthAppStore, String>) VideoGrowthAppStore.XIAOMI, (VideoGrowthAppStore) oos0Var.i);
        zos0 c = this.a.c(enumMap);
        VideoGrowthAppStore videoGrowthAppStore = c.a;
        String str = c.b;
        if (dy2.i("com.vk.vkvideo") && !z4) {
            this.b.b(context, str, videoGrowthAppStore, videoGrowthVideoParams, null);
            return;
        }
        boolean z5 = !dy2.i("com.vk.vkvideo");
        String str2 = oos0Var.a;
        if (!epx.f(ply.a(), "ru")) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = context.getString(oos0Var.c ? R.string.text_title_listing_bottom_sheet : R.string.text_title_soft_listing_bottom_sheet);
        }
        new nhz.a(context, new pos0(z5, str2, context.getString(dy2.i("com.vk.vkvideo") ? R.string.open_vk_video_btn : R.string.download_vk_video_btn), z3, !dy2.i("com.vk.vkvideo") ? qdq.a(videoGrowthAppStore) : null), new a(fos0Var, this, context, str, videoGrowthAppStore, videoGrowthVideoParams)).I0(null);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mos0
    public final boolean b(boolean z) {
        oos0 oos0Var;
        if (!BuildInfo.s()) {
            return false;
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_MOVIES_SERIES_LISTING;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            return z || ((oos0Var = (oos0) this.d.getValue()) != null && oos0Var.j);
        }
        return false;
    }
}
