package xsna;

import android.content.Context;
import com.vk.libvideo.autoplay.b;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vkontakte.android.R;
import java.util.EnumMap;
import kotlin.LazyThreadSafetyMode;
import xsna.dw20;

/* compiled from: VkVideoPromoManager.kt */
/* loaded from: classes6.dex */
public final class i0w0 implements w8i {
    public static final i0w0 b = new i0w0();
    public static final Object c;
    public static final Object d;
    public static final Object e;
    public static dw20 f;

    static {
        ko60 ko60Var = new ko60(16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        c = msy.a(lazyThreadSafetyMode, ko60Var);
        d = msy.a(lazyThreadSafetyMode, new nyk0(8));
        e = msy.a(lazyThreadSafetyMode, new jql0(6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static void a(Context context, aa3 aa3Var, String str, long j) {
        EnumMap<VideoGrowthAppStore, String> a = los0.a(aa3Var.a);
        ?? r0 = e;
        zos0 c2 = ((VideoGrowthComponent) r0.getValue()).Af().c(a);
        ((VideoGrowthComponent) r0.getValue()).N8().b(context, c2.b, c2.a, str != null ? new VideoGrowthVideoParams(str, j, true, false, 8, null) : null, null);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public static void b(final Context context, final String str, boolean z) {
        int i;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        VideoGrowthVideoParams f2 = s490.f(b.C1208b.a());
        final long j = epx.f(f2 != null ? f2.b : null, str) ? f2.c : 0L;
        boolean i2 = dy2.i("com.vk.vkvideo");
        ?? r4 = c;
        if (i2) {
            aa3 aa3Var = ((tzv0) r4.getValue()).a;
            if (aa3Var != null) {
                a(context, aa3Var, str, j);
                return;
            }
            return;
        }
        if (f != null) {
            return;
        }
        aa3 aa3Var2 = ((tzv0) r4.getValue()).a;
        ?? r42 = e;
        String str2 = aa3Var2 != null ? ((VideoGrowthComponent) r42.getValue()).Af().c(los0.a(aa3Var2.a)).b : null;
        if (str2 != null) {
            ((VideoGrowthComponent) r42.getValue()).Z7().show(str2);
        }
        hz20 hz20Var = new hz20() { // from class: xsna.g0w0
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.hz20
            public final void a(int i3) {
                if (i3 == -1) {
                    i0w0 i0w0Var = i0w0.b;
                    ((com.vk.libvideo.api.promo.stats.b) i0w0.d.getValue()).c();
                    aa3 aa3Var3 = ((tzv0) i0w0.c.getValue()).a;
                    if (aa3Var3 != null) {
                        i0w0.a(context, aa3Var3, str, j);
                        return;
                    }
                    dw20 dw20Var = i0w0.f;
                    if (dw20Var != null) {
                        dw20Var.hide();
                    }
                }
            }
        };
        zo80 zo80Var = new zo80(16);
        hvr0 hvr0Var = new hvr0(str2, 20);
        if (z) {
            dhr0.a.getClass();
            i = dhr0.u().c;
        } else {
            i = dhr0.C().c;
        }
        ((com.vk.libvideo.api.promo.stats.b) d.getValue()).a();
        f = new dw20.b(context, null).u0(i).L(R.drawable.vk_icon_logo_vk_video_color_56).w0(context.getString(R.string.vk_video_promo_dialog_title_download_video_text)).a0(zo80Var).i0(R.string.vk_video_promo_dialog_action_button_hard_text, hz20Var).X(hvr0Var).I0(null);
    }
}
