package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.stickers.bottomsheets.LegoStickersBottomSheetDialog;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.navigation.api.data.AppShareType;
import com.vkontakte.android.R;
import org.json.JSONObject;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class nhj implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nhj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                izs izsVar = (izs) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2077509990, intValue, -1, "com.vk.clips.playlists.playlist_ui.ui.ReadyButton.<anonymous> (Content.kt:197)");
                }
                String N = d370.N(R.string.clips_playlist_reorder_ready, 0, aVar);
                ButtonSize buttonSize = ButtonSize.Large;
                ButtonStyle buttonStyle = ButtonStyle.Primary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                q630 D = s200.D(txj0.f(q630.a.a, 1.0f), 12);
                boolean J = aVar.J(izsVar);
                Object x = aVar.x();
                if (J || x == a.C0011a.a) {
                    x = new v67(izsVar, 2);
                    aVar.R(x);
                }
                bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, D, null, false, false, null, null, null, N, null, null, null, null, true, null, null, null, aVar, 28080, 12582912, 0, 4059104);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            case 1:
                int i2 = LegoStickersBottomSheetDialog.d0;
                ((LegoStickersBottomSheetDialog) obj4).getClass();
                break;
            default:
                mbj0 mbj0Var = (mbj0) obj4;
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", AppShareType.STORY.h());
                jSONObject.put("story_id", (String) obj3);
                mbj0Var.a.n(JsApiMethodType.SHARE, jSONObject);
                System.currentTimeMillis();
                mbj0Var.b();
                break;
        }
        return s3q0.a;
    }
}
