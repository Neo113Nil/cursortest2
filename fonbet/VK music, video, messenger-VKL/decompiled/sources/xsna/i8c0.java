package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.gson.GsonBuilder;
import com.unity3d.ads.core.domain.HandleDebugSettings;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarView2;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.search.ui.impl.di.SearchUiComponentImpl;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class i8c0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ i8c0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        HandleDebugSettings initialize$lambda$220$lambda$214;
        switch (this.b) {
            case 0:
                return Integer.valueOf(dhr0.t.c(R.attr.vk_ui_text_negative));
            case 1:
                return ((QueueSyncComponent) ((k7m) m7m.f(fre0.b)).a(fpf0.a(QueueSyncComponent.class))).i0();
            case 2:
                return new spf0();
            case 3:
                return new GsonBuilder().excludeFieldsWithModifiers(128, 8).create();
            case 4:
                qcy<Object>[] qcyVarArr = SearchUiComponentImpl.c;
                return bzh0.a;
            case 5:
                return s3q0.a;
            case 6:
                return s3q0.a;
            case 7:
                initialize$lambda$220$lambda$214 = ServiceProvider.initialize$lambda$220$lambda$214();
                return initialize$lambda$220$lambda$214;
            case 8:
                return new ix4();
            case 9:
                int i = VideoAutoPlaySeekBarView2.t;
                Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                Paint paint = new Paint(1);
                paint.setShadowLayer(VideoAutoPlaySeekBarView2.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, VideoAutoPlaySeekBarView2.w, dhr0.t.c(R.attr.vk_ui_overlay_secondary));
                Paint b = rqi.b(1, -1);
                float width = createBitmap.getWidth() / 2.0f;
                float height = createBitmap.getHeight() / 2.0f;
                float f = (VideoAutoPlaySeekBarView2.u * 1.0f) / 2.0f;
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawCircle(width, height, f, paint);
                canvas.drawCircle(width, height, f, b);
                return createBitmap;
            case 10:
                return Boolean.valueOf(fxc0.B().J().a2());
            case 11:
                return new s290();
            case 12:
                return (mfv0) jfv0.t.getValue();
            case 13:
                o2l.a.getClass();
                return Boolean.valueOf(o2l.b("__dbg_voip_v2_ns_log_timings", false));
            case 14:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.J().f();
            default:
                return new trl(5);
        }
    }

    public /* synthetic */ i8c0(o7y0 o7y0Var) {
        this.b = 15;
    }
}
