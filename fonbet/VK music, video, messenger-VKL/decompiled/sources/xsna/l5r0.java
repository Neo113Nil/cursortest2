package xsna;

import android.content.Context;
import com.vk.api.generated.video.dto.VideoGetThumbUploadUrlResponseDto;
import com.vk.clips.sdk.shared.api.analytics.SdkStatPixel;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.common.StatPixel;
import com.vk.feature.uxpolls.modalpoll.f;
import com.vk.feature.uxpolls.modalpoll.g;
import com.vk.uxpolls.domain.exception.EmptyPollsError;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.f;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.i8w0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class l5r0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ l5r0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                f.a aVar = ((com.vk.feature.uxpolls.modalpoll.f) obj).b;
                if (aVar instanceof f.a.c) {
                    return g.a.AbstractC1030a.c.a;
                }
                if (aVar instanceof f.a.b) {
                    return g.a.AbstractC1030a.b.a;
                }
                if (!(aVar instanceof f.a.C1029a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable th = ((f.a.C1029a) aVar).b;
                return th instanceof EmptyPollsError ? new g.a.AbstractC1030a.C1031a(th, R.string.ux_polls_modal_error_empty_polls_title, R.string.ux_polls_modal_error_empty_polls_subtitle) : new g.a.AbstractC1030a.C1031a(th, R.string.ux_polls_modal_error_title, R.string.ux_polls_modal_error_subtitle);
            case 1:
                Long l = (Long) obj;
                return io.reactivex.rxjava3.core.q.B0(l.longValue(), TimeUnit.MILLISECONDS).U(new xb20(new waf0(l, 18), 21));
            case 2:
                return new i6t0((Context) obj);
            case 3:
                return new ncq0(((VideoGetThumbUploadUrlResponseDto) obj).d(), null, null, null, null, 30);
            case 4:
                return new f.a(((tj50.a) obj).a(new i0r(26), ao8.d));
            case 5:
                qcy<Object>[] qcyVarArr = VideoFileAdapter.l;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    StatPixel.a aVar2 = (StatPixel.a) entry.getKey();
                    nsk0 nsk0Var = (nsk0) entry.getValue();
                    SdkStatPixel.a a = SdkStatPixel.a.b.a(aVar2.a());
                    ArrayList<StatPixel> arrayList = nsk0Var.a;
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    for (StatPixel statPixel : arrayList) {
                        arrayList2.add(new SdkStatPixel(SdkStatPixel.a.b.a(statPixel.b.a()), statPixel.c, statPixel.d, statPixel.e));
                    }
                    linkedHashMap.put(a, new ukh0(arrayList2));
                }
                return linkedHashMap;
            case 6:
                return ((SubtitleRenderItem) obj).b;
            case 7:
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 8:
                return s3q0.a;
            default:
                return new i8w0.c(((tj50.a) obj).a(s7w0.b, ao8.d));
        }
    }
}
