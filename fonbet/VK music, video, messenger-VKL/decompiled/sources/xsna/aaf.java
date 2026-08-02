package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.tips.Tooltip;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: ClipsTooltipsController.kt */
/* loaded from: classes16.dex */
public final class aaf implements gzs<s3q0> {
    public final /* synthetic */ CameraUIView b;
    public final /* synthetic */ baf c;
    public final /* synthetic */ CameraUIView d;

    public aaf(CameraUIView cameraUIView, baf bafVar, CameraUIView cameraUIView2) {
        this.b = cameraUIView;
        this.c = bafVar;
        this.d = cameraUIView2;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        CameraUIView cameraUIView = this.b;
        float bottom = ((cameraUIView.getBottom() - cameraUIView.getTop()) + cameraUIView.getTop()) * 0.25f;
        RectF rectF = new RectF(cameraUIView.getLeft(), bottom, cameraUIView.getRight(), bottom);
        TextView textView = new TextView(cameraUIView.getContext());
        textView.setId(R.id.title);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView.setTextColor(-1);
        com.vk.typography.b.k(textView, FontFamily.REGULAR, Float.valueOf(15.0f), 4);
        textView.setGravity(17);
        textView.setText(textView.getText());
        Context context = cameraUIView.getContext();
        CameraUIView cameraUIView2 = this.d;
        Context context2 = cameraUIView2.getContext();
        String string = cameraUIView.getContext().getString(R.string.clips_duration_changed_toast);
        pla.e().b().getClass();
        b1y b1yVar = new b1y((String) null);
        Tooltip.WindowStyle windowStyle = Tooltip.WindowStyle.FULLSCREEN;
        Context context3 = cameraUIView.getContext();
        e3m.a aVar = e3m.a;
        int color = context3.getColor(R.color.vk_clear);
        int color2 = cameraUIView2.getContext().getColor(R.color.vk_white);
        NavigationBarStyle navigationBarStyle = NavigationBarStyle.DARK;
        Tooltip.d dVar = new Tooltip.d(cameraUIView.getContext().getColor(R.color.vk_black));
        baf bafVar = this.c;
        bafVar.c = Tooltip.l(new Tooltip(context2, string, null, windowStyle, null, null, b1yVar, color, color2, null, 0.8f, null, 0, false, navigationBarStyle, 0, true, new j6b(textView, 1), null, null, null, null, null, new z9f(bafVar), 3000L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, dVar, null, -25380320, 13), context, rectF, true, true, false, true, 128);
        return s3q0.a;
    }
}
