package xsna;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.preference.Preference;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import java.util.EnumMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.ky6;

/* compiled from: VkVideoFeedButtonPromoManagerImpl.kt */
/* loaded from: classes3.dex */
public final class yzv0 implements wzv0, uzv0, dwb0 {
    public final VideoGrowthComponent b;
    public final ywb0 c;
    public final View d;
    public zzv0 e;
    public final Object f;
    public final Object g;
    public final vzv0 h;

    /* compiled from: VkVideoFeedButtonPromoManagerImpl.kt */
    public static final /* synthetic */ class a extends PropertyReference0Impl {
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return (kos0) ((yzv0) this.receiver).f.getValue();
        }
    }

    public yzv0(VideoGrowthComponent videoGrowthComponent, ywb0 ywb0Var, View view) {
        this.b = videoGrowthComponent;
        this.c = ywb0Var;
        this.d = view;
        rjg0 rjg0Var = new rjg0(14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, rjg0Var);
        this.g = msy.a(lazyThreadSafetyMode, new l6n0(this, 23));
        this.h = new vzv0(new a(this, yzv0.class, "showConfig", "getShowConfig()Lcom/vk/toggle/data/VideoGrowthFeatureConfig;", 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uzv0
    public final void a(Context context) {
        kos0 kos0Var = (kos0) this.f.getValue();
        if (kos0Var != null) {
            EnumMap<VideoGrowthAppStore, String> h = s490.h(kos0Var);
            VideoGrowthComponent videoGrowthComponent = this.b;
            zos0 c = videoGrowthComponent.Af().c(h);
            VideoGrowthAppStore videoGrowthAppStore = c.a;
            videoGrowthComponent.N8().b(context, c.b, videoGrowthAppStore, null, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uzv0
    public final void b(long j, boolean z) {
        vzv0 vzv0Var = this.h;
        if (z) {
            sos0 Z7 = this.b.Z7();
            String str = (String) this.g.getValue();
            if (str == null) {
                str = "";
            }
            Z7.d(str);
            vzv0Var.getClass();
            ky6.a aVar = (ky6.a) Preference.j().edit();
            aVar.putLong("pref_key_last_open_vk_video_popup_show_after_close", j);
            aVar.a();
        } else {
            vzv0Var.getClass();
            vzv0.a(j);
        }
        this.c.b(this);
        zzv0 zzv0Var = this.e;
        if (zzv0Var != null) {
            zzv0Var.setVisibility(8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void c() {
        kos0 kos0Var;
        if (!dy2.i("com.vk.vkvideo") || (kos0Var = (kos0) this.f.getValue()) == null || kos0Var.k) {
            rrn0 rrn0Var = new rrn0(this, 29);
            vzv0 vzv0Var = this.h;
            vzv0Var.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = vzv0Var.b;
            if (j == 0) {
                long j2 = vzv0Var.a;
                if (j2 == 0 || elapsedRealtime >= j2 + vzv0Var.c) {
                    rrn0Var.invoke();
                    vzv0.a(elapsedRealtime);
                    return;
                }
            }
            if (elapsedRealtime >= j + vzv0Var.d) {
                rrn0Var.invoke();
                vzv0.a(elapsedRealtime);
                ky6.a aVar = (ky6.a) Preference.j().edit();
                aVar.putLong("pref_key_last_open_vk_video_popup_show_after_close", 0L);
                aVar.a();
            }
        }
    }

    @Override // xsna.dwb0
    public final void e() {
        zzv0 zzv0Var = this.e;
        if (zzv0Var != null) {
            zzv0Var.setVisibility(8);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dwb0
    public final void n() {
        sos0 Z7 = this.b.Z7();
        String str = (String) this.g.getValue();
        if (str == null) {
            str = "";
        }
        Z7.show(str);
        zzv0 zzv0Var = this.e;
        if ((zzv0Var != null ? zzv0Var.getParent() : null) != null) {
            zzv0 zzv0Var2 = this.e;
            if (zzv0Var2 != null) {
                zzv0Var2.setVisibility(0);
                return;
            }
            return;
        }
        View view = this.d;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.addView(this.e, -1, -1);
        }
    }

    @Override // xsna.wzv0
    public final void onDestroy() {
        zzv0 zzv0Var = this.e;
        if (zzv0Var != null) {
            zzv0Var.setVisibility(8);
        }
        this.e = null;
        this.c.b(this);
    }
}
