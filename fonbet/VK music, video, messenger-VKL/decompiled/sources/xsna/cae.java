package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class cae implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ cae(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    break;
                } else {
                    Context context = this.c;
                    if (!kzz.a(context)) {
                        break;
                    } else {
                        break;
                    }
                }
            case 1:
                ClipsRouter.c(g620.f().a(), this.c, Collections.singletonList(new ClipFeedTab.Playlist.FromBeginning((ClipsPlaylist) obj)), null, null, fpf0.a(ClipFeedTab.Playlist.FromBeginning.class), null, null, true, null, 1900);
                break;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    Context context2 = this.c;
                    if (e3m.h(context2) != null) {
                        ikv0.a aVar = new ikv0.a(context2);
                        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                        aVar.u = new ikv0.d(context2.getString(R.string.music_catalog_radio_station_followed), (String) null, (ikv0.d.a) null, 6);
                        aVar.e = 4000L;
                        pkv0.f(aVar);
                    }
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                L.i(th);
                if (th instanceof VKApiExecutionException) {
                    rte0.z(this.c, (VKApiExecutionException) th);
                } else {
                    cvk.u(R.string.error, false);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ cae(huh0 huh0Var, Context context) {
        this.b = 2;
        this.c = context;
    }
}
