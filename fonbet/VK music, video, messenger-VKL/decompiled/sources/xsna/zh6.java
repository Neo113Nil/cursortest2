package xsna;

import android.app.Activity;
import android.widget.FrameLayout;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.photo.editor.features.colorgrading.ColorGradingTool;
import com.vk.photo.editor.features.colorgrading.b;
import com.vk.photo.editor.views.ToolButton;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class zh6 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ zh6(com.vk.music.notifications.restriction.a aVar, String str, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str2, MusicRestrictionPopupDisplayer.SubscriptionPopupType subscriptionPopupType) {
        this.c = aVar;
        this.d = str;
        this.f = musicPlaybackLaunchContext;
        this.e = str2;
        this.g = subscriptionPopupType;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                MusicRestrictionPopupDisplayer.e((com.vk.music.notifications.restriction.a) this.c, (Activity) obj, (String) this.d, (MusicPlaybackLaunchContext) this.f, (String) this.e, (MusicRestrictionPopupDisplayer.SubscriptionPopupType) this.g, null, 32);
                break;
            default:
                ColorGradingTool colorGradingTool = (ColorGradingTool) this.c;
                l3p.a("resizingColorGrading", new wyd(colorGradingTool, (HashMap) this.d, (HashMap) this.e, (ToolButton) this.f, (FrameLayout) this.g, 1));
                colorGradingTool.n.b(b.k.a);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zh6(ColorGradingTool colorGradingTool, HashMap hashMap, HashMap hashMap2, ToolButton toolButton, FrameLayout frameLayout) {
        this.c = colorGradingTool;
        this.d = hashMap;
        this.e = hashMap2;
        this.f = toolButton;
        this.g = frameLayout;
    }
}
