package xsna;

import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class rat0 implements izs {
    public final /* synthetic */ LinkedHashMap b;
    public final /* synthetic */ sat0 c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ rat0(LinkedHashMap linkedHashMap, sat0 sat0Var, ArrayList arrayList, boolean z) {
        this.b = linkedHashMap;
        this.c = sat0Var;
        this.d = arrayList;
        this.e = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        bwr0 bwr0Var = (bwr0) obj;
        boolean z = bwr0Var instanceof fyr0;
        LinkedHashMap<String, AboutVideoItem.SimilarVideoRedesign> linkedHashMap = this.b;
        sat0 sat0Var = this.c;
        ArrayList arrayList = this.d;
        if (z) {
            VideoFile videoFile = ((fyr0) bwr0Var).a;
            AboutVideoItem.SimilarVideoRedesign similarVideoRedesign = linkedHashMap.get(videoFile.r1());
            if (similarVideoRedesign == null) {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }
            String r1 = videoFile.r1();
            DonutVideoUiModel a = sat0Var.a.a(nkt0.a(videoFile), DonutVideoCardSource.LARGE_CARD);
            noj0 noj0Var = similarVideoRedesign.b;
            linkedHashMap.put(r1, AboutVideoItem.SimilarVideoRedesign.a(similarVideoRedesign, new noj0(videoFile, noj0Var.b, noj0Var.c, a), false, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            return io.reactivex.rxjava3.core.q.T(j5g.u0(j5g.O0(linkedHashMap.values()), arrayList));
        }
        if (bwr0Var instanceof oxr0) {
            oxr0 oxr0Var = (oxr0) bwr0Var;
            return io.reactivex.rxjava3.core.q.T(j5g.u0(sat0Var.a(oxr0Var.a, linkedHashMap, oxr0Var.b), arrayList));
        }
        if (bwr0Var instanceof qxr0) {
            return io.reactivex.rxjava3.core.q.T(j5g.u0(sat0Var.b(((qxr0) bwr0Var).a.I0().b, linkedHashMap), arrayList));
        }
        if (bwr0Var instanceof ayr0) {
            for (Map.Entry<String, AboutVideoItem.SimilarVideoRedesign> entry : linkedHashMap.entrySet()) {
                String key = entry.getKey();
                AboutVideoItem.SimilarVideoRedesign value = entry.getValue();
                linkedHashMap.put(key, AboutVideoItem.SimilarVideoRedesign.a(value, null, false, fxc0.B().c(value.b.a), Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
            }
            return io.reactivex.rxjava3.core.q.T(j5g.u0(j5g.O0(linkedHashMap.values()), arrayList));
        }
        if (!(bwr0Var instanceof wxr0)) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        wxr0 wxr0Var = (wxr0) bwr0Var;
        sat0Var.getClass();
        if (this.e) {
            String str = wxr0Var.b;
            VideoFile videoFile2 = wxr0Var.a;
            if (epx.f(str, "videos_history_remove") && linkedHashMap.remove(videoFile2.r1()) != null) {
                sat0Var.d.add(videoFile2.r1());
                return io.reactivex.rxjava3.core.q.T(j5g.u0(j5g.O0(linkedHashMap.values()), arrayList));
            }
        }
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }
}
