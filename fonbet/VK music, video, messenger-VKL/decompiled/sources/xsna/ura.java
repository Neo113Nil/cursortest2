package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarLayout2;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import org.json.JSONObject;
import xsna.dh6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ura implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ura(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                Context context = (Context) obj4;
                VideoAlbum videoAlbum = (VideoAlbum) obj3;
                String str = (String) obj2;
                gzs gzsVar = (gzs) obj;
                UserId userId = videoAlbum.c;
                int i3 = videoAlbum.b;
                UiTracker uiTracker = UiTracker.a;
                String d = UiTracker.d();
                if (str == null) {
                    str = "";
                }
                int i4 = 7;
                new io.reactivex.rxjava3.internal.operators.observable.l0(rsg0.y0(new a0u(userId, i3, d, str, false, 32), null, null, 3), new e05(new he3(4, context, videoAlbum), i4)).subscribe(new tra(gzsVar, i2), new da(new g74(new pl2(i4), 1), 6));
                break;
            case 1:
                ((wh50) obj4).setValue(Boolean.FALSE);
                ((ViewGroup) obj3).removeView((ComposeView) obj2);
                dh6.a aVar = ((kkd) obj).a.d;
                if (aVar != null) {
                    aVar.b();
                }
                break;
            case 2:
                onk onkVar = (onk) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                String str2 = (String) obj;
                izs<JSONObject, JSONObject> izsVar = r3y.a.get((String) obj2);
                JSONObject invoke = izsVar != null ? izsVar.invoke(jSONObject) : null;
                if (invoke == null) {
                    onkVar.d.e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), str2, 1, null));
                } else {
                    onkVar.c.a(invoke.toString(), str2);
                }
                break;
            default:
                VideoItemListLargeVh.j((VideoItemListLargeVh) obj4, (int[]) obj3, (int[]) obj2, (VideoAutoPlaySeekBarLayout2) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ura(onk onkVar, String str, JSONObject jSONObject, String str2) {
        this.b = 2;
        this.c = onkVar;
        this.e = str;
        this.d = jSONObject;
        this.f = str2;
    }
}
