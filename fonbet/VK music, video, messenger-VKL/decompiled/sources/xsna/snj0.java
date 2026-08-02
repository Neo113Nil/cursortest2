package xsna;

import android.view.View;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.vmoji.character.model.VmojiProductModel;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.egp0;
import xsna.gyw0;
import xsna.iyw0;
import xsna.m8v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class snj0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ snj0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((m900) ((zrx0) obj3).b).put((String) obj2, (List) obj);
                break;
            case 1:
                pbl0 pbl0Var = (pbl0) obj3;
                val0 val0Var = ((wbl0) obj2).l;
                if (val0Var == null) {
                    val0Var = null;
                }
                pbl0Var.d(val0Var.b);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                ((xfp0) obj3).V(egp0.a.C2808a.b, (MusicTrack) obj2);
                break;
            case 5:
                String str = (String) obj2;
                View view = (View) obj;
                int i2 = VideoNewProfileHeaderViewV2.y;
                int i3 = m8v0.M;
                m8v0.a.a(view, str, null, VkTooltip$MarkerStyle.Style6, VkTooltip$MarkerSize.Size96, VkOnboarding$TintColor.Azure, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Left, new qjg0(view, 13), new ow60(20), null, null, null, new ggb0((d8t0) obj3, 28), null, 0, false, null, null, false, null, dhr0.C().b, 8379396);
                break;
            case 6:
                m8u0 m8u0Var = (m8u0) obj3;
                m8u0Var.e.b(new io.reactivex.rxjava3.internal.operators.observable.i0(io.reactivex.rxjava3.core.q.P(0L, 1L, TimeUnit.SECONDS), new cfz(new lyl0(m8u0Var, 16), 21)).t0(1L).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new m3y(new kpk0(8, m8u0Var, (PlaybackActionMeta) obj2), 29)));
                break;
            case 7:
                ((l6w0) obj3).invoke((VmojiProductModel) obj2);
                break;
            default:
                cyw0 cyw0Var = (cyw0) obj3;
                iyw0.a aVar = (iyw0.a) obj;
                boolean z = !aVar.j;
                cyw0Var.T(new gyw0.d(z));
                cyw0.V(cyw0Var, null, null, null, null, null, null, null, null, Boolean.valueOf(z), aVar, 255);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ snj0(String str, d8t0 d8t0Var) {
        this.b = 5;
        this.d = str;
        this.c = d8t0Var;
    }

    public /* synthetic */ snj0(dym0 dym0Var, SdkVideoFile sdkVideoFile, UserId userId) {
        this.b = 2;
        this.c = sdkVideoFile;
        this.d = userId;
    }
}
