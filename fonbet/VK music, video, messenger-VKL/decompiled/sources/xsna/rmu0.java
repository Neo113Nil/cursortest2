package xsna;

import androidx.core.widget.NestedScrollView;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.vk.confirmaccount.api.di.ConfirmAccountComponent;
import com.vk.confirmaccount.impl.VkConfirmUserByServiceActivity;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rmu0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rmu0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        WebViewEvent sendPrivacyFsmChange$lambda$20;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = VkConfirmUserByServiceActivity.m;
                return ((ConfirmAccountComponent) m7m.a((VkConfirmUserByServiceActivity) obj).mo408a(fpf0.a(ConfirmAccountComponent.class))).le();
            case 1:
                ((c0v0) obj).g();
                return s3q0.a;
            case 2:
                w6v0 w6v0Var = (w6v0) obj;
                return ((com.vk.auth.oauth.di.a) w6v0Var.A.getValue()).a(w6v0Var.b, w6v0Var.x);
            case 3:
                sendPrivacyFsmChange$lambda$20 = WebViewAdPlayer.sendPrivacyFsmChange$lambda$20((byte[]) obj);
                return sendPrivacyFsmChange$lambda$20;
            default:
                int i3 = WriteBar.h0;
                return (NestedScrollView) ((WriteBar) obj).findViewById(R.id.writebar_fullscreen_scroll_container);
        }
    }
}
