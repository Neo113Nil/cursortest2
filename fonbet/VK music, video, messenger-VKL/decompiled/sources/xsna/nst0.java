package xsna;

import android.content.Context;
import com.vk.device.store.AppStore;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vkontakte.android.R;
import java.util.EnumMap;
import kotlin.LazyThreadSafetyMode;
import xsna.dw20;

/* compiled from: VideoWatchingRestrictionModal.kt */
/* loaded from: classes2.dex */
public final class nst0 implements w8i {
    public final Object b;
    public final Object c;
    public final Object d;
    public dw20 e;

    public nst0() {
        e3c0 e3c0Var = new e3c0(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, e3c0Var);
        this.c = msy.a(lazyThreadSafetyMode, new uvs0(this, 4));
        this.d = msy.a(lazyThreadSafetyMode, new gqh0(this, 21));
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(final Context context, String str, Long l, ihq ihqVar) {
        EnumMap<AppStore, String> enumMap;
        if (this.e != null) {
            return;
        }
        final VideoGrowthVideoParams videoGrowthVideoParams = (str == null || l == null) ? null : new VideoGrowthVideoParams(str, l.longValue(), false, false, 12, null);
        aa3 aa3Var = ((fzv0) this.b.getValue()).a;
        final zos0 c = (aa3Var == null || (enumMap = aa3Var.a) == null) ? null : ((VideoGrowthComponent) this.d.getValue()).Af().c(los0.a(enumMap));
        com.vk.libvideo.api.promo.stats.a aVar = (com.vk.libvideo.api.promo.stats.a) this.c.getValue();
        String str2 = c != null ? c.b : null;
        if (str2 == null) {
            str2 = "";
        }
        aVar.e(str2);
        hz20 hz20Var = new hz20() { // from class: xsna.mst0
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.hz20
            public final void a(int i) {
                if (i == -1) {
                    zos0 zos0Var = zos0.this;
                    nst0 nst0Var = this;
                    if (zos0Var == null) {
                        dw20 dw20Var = nst0Var.e;
                        if (dw20Var != null) {
                            dw20Var.hide();
                            return;
                        }
                        return;
                    }
                    nst0Var.getClass();
                    ?? r1 = nst0Var.c;
                    if (dy2.i("com.vk.vkvideo")) {
                        ((com.vk.libvideo.api.promo.stats.a) r1.getValue()).c();
                    } else {
                        ((com.vk.libvideo.api.promo.stats.a) r1.getValue()).b();
                    }
                    ((VideoGrowthComponent) nst0Var.d.getValue()).N8().b(context, zos0Var.b, zos0Var.a, videoGrowthVideoParams, null);
                }
            }
        };
        sdr sdrVar = new sdr(this, c, ihqVar, 7);
        l49 l49Var = new l49(this, c, ihqVar, 10);
        dhr0.a.getClass();
        this.e = ((dw20.b) new dw20.b(context, null).u0(dhr0.u().c).L(R.drawable.vk_icon_logo_vk_video_color_56).w0(context.getString(R.string.title_background_watching_restriction)).i0(dy2.i("com.vk.vkvideo") ? R.string.open_vk_video_btn : R.string.download_vk_video_btn, hz20Var).a0(new kld0(this, 29)).X(sdrVar).F(enj.e(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_secondary, context), null)).b0(new q8i0(l49Var, 26)).I0(null);
    }
}
