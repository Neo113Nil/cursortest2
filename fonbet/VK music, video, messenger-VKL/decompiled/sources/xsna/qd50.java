package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import com.vk.api.generated.audio.dto.AudioAddResponseDto;
import com.vk.api.generated.audio.dto.AudioAddResultDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.music.MusicTrack;
import com.vk.im.ui.views.msg.MsgStickyDateView;
import com.vkontakte.android.R;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import java.util.List;
import org.json.JSONObject;

/* compiled from: MusicTrackModelImpl.java */
/* loaded from: classes3.dex */
public final class qd50 implements hx2, vs80, NativeAdEventListener {
    public final Object b;
    public final Object c;

    public /* synthetic */ qd50(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.vs80
    public boolean a() {
        return ((vs80) this.b).a();
    }

    @Override // xsna.hx2
    public void b(Object obj) {
        List<AudioAddResultDto> e = ((AudioAddResponseDto) obj).e();
        if (e == null || e.isEmpty()) {
            return;
        }
        nd50.F((nd50) this.c, (MusicTrack) this.b, e.get(0).d());
    }

    public void c(Rect rect) {
        MsgStickyDateView msgStickyDateView = (MsgStickyDateView) this.b;
        rect.set(msgStickyDateView.getLeft(), msgStickyDateView.getTop(), msgStickyDateView.getRight(), msgStickyDateView.getBottom());
    }

    @Override // xsna.vs80
    public List d(Integer num) {
        List<vqi> d = ((vs80) this.b).d(null);
        y2k0 y2k0Var = (y2k0) this.c;
        int i = y2k0Var.v;
        if (i < 0) {
            return d;
        }
        return j5g.u0(d, tqi.a(y2k0Var, num, i, Integer.valueOf(y2k0Var.M(i, y2k0Var.b))));
    }

    @Override // xsna.hx2
    public void e(@NonNull VKApiExecutionException vKApiExecutionException) {
        nd50.E((nd50) this.c, (MusicTrack) this.b, vKApiExecutionException);
    }

    public void f() {
        ((vtt0) this.c).d(false);
    }

    public void g(boolean z) {
        ((vtt0) this.c).c(z ? 1000L : 350L, true);
    }

    public void h(long j) {
        ((MsgStickyDateView) this.b).setDate(j);
    }

    public void i(int i) {
        ((MsgStickyDateView) this.b).setTranslationY(i);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public void onAdClicked() {
        ((a5y0) this.b).a();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public void onImpression(ImpressionData impressionData) {
        String rawData;
        JSONObject j = (impressionData == null || (rawData = impressionData.getRawData()) == null) ? null : cqm0.j(rawData);
        ((a5y0) this.b).b(j != null ? j.optString("precision") : null, j != null ? j.optString("revenue") : null, ((d5y0) ((z4y0) this.c)).a.getAdAssets().getCallToAction());
    }

    public qd50(View view) {
        MsgStickyDateView msgStickyDateView = (MsgStickyDateView) view.findViewById(R.id.msg_list_sticky_date);
        this.b = msgStickyDateView;
        this.c = new vtt0(msgStickyDateView, null, null, 300L, 6);
    }

    public qd50(nd50 nd50Var, MusicTrack musicTrack) {
        this.c = nd50Var;
        this.b = musicTrack;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public void onLeftApplication() {
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public void onReturnedToApplication() {
    }
}
