package xsna;

import android.content.Context;
import android.os.Looper;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.vk.ads.stats.impl.di.AdPixelStatsComponentImpl;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import com.vk.music.player.PlaySourceMeta;
import com.vk.reactions.view.GridReactionsPaginatedView;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.Calendar;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.cex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class vg0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vg0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        b.d j;
        JSONObject g;
        ExposedFunction keysStorage;
        boolean z = false;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AdPixelStatsComponentImpl.b;
                o260 o260Var = d260.a;
                if (o260Var == null) {
                    return null;
                }
                return o260Var;
            case 1:
                float f = iah0.f().widthPixels;
                float f2 = GridReactionsPaginatedView.R;
                float f3 = GridReactionsPaginatedView.T;
                float f4 = f / (f2 + f3);
                if (f4 < 1.0f) {
                    f4 = 1.0f;
                }
                int b = an10.b(f4);
                float f5 = iah0.f().heightPixels / (GridReactionsPaginatedView.S + f3);
                return Integer.valueOf(swe0.g((an10.b(f5 >= 1.0f ? f5 : 1.0f) * b) + 4, 10, 50));
            case 2:
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                throw null;
            case 3:
                return s3q0.a;
            case 4:
                return "archiveChannel: ";
            case 5:
                return new jwl();
            case 6:
                return s3q0.a;
            case 7:
                return androidx.compose.runtime.k.b(Boolean.FALSE);
            case 8:
                return Calendar.getInstance();
            case 9:
                return "invalidateCache: ";
            case 10:
                SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 11:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_REPORT_DASH_MANIFEST_LOAD_DURATION;
                videoFeatures.getClass();
                return new vsk(com.vk.toggle.b.A.a(videoFeatures));
            case 12:
                ComFeatures comFeatures = ComFeatures.COM_NEW_MENU;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 13:
                bpn0 bpn0Var = u8r.a;
                return "cleanExpiredFiles";
            case 14:
                return s3q0.a;
            case 15:
                int i = GamesCatalogDetailFragment.d0;
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                SaFeatures saFeatures = SaFeatures.SA_GAMES_CATALOG_PERFORMANCE;
                if (bVar.a(saFeatures) && (j = bVar.j(saFeatures.getKey(), false)) != null && (g = j.g()) != null && g.optBoolean("compose_optimizations", true)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                keysStorage = CommonAdViewerExposedFunctionsKt.getKeysStorage();
                return keysStorage;
            case 17:
                return s3q0.a;
            case 18:
                hew.b.getClass();
                few fewVar = new few(0);
                if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                    fewVar.run();
                } else {
                    hew.g.post(fewVar);
                }
                return s3q0.a;
            case 19:
                int[] iArr = {n8g.l(-16777216, 0), n8g.l(-16777216, 10), n8g.l(-16777216, 40), n8g.l(-16777216, 163), n8g.l(-16777216, 193), n8g.l(-16777216, 204)};
                cex.a aVar = cex.a.a;
                return cex.a.a(iArr);
            case 20:
                return new Regex("/(app[-0-9]+)(?:_([-0-9]+))?");
            case 21:
                return s3q0.a;
            case 22:
                return s3q0.a;
            case 23:
                int i2 = wq30.y;
                return Boolean.TRUE;
            case 24:
                return new r290();
            case 25:
                return new PlaySourceMeta.VKMixPlaySourceMeta("", null, false, "");
            case 26:
                Context context = e43.a;
                return Integer.valueOf(e3m.a(R.dimen.vkim_reactions_icon_size, context != null ? context : null));
            case 27:
                return new StringBuilder();
            case 28:
                return s3q0.a;
            default:
                return new yf3();
        }
    }
}
