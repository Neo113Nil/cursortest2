package xsna;

import androidx.compose.runtime.a;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import java.util.ArrayList;
import java.util.List;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class be0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ be0(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        VideoFile videoFile;
        VideoFile videoFile2;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                de0.b((ArrayList) this.c, (z0n) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                sg50 sg50Var = (sg50) this.c;
                gzs gzsVar = (gzs) this.d;
                String str = (String) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1653881637, intValue, -1, "com.vk.clips.design.compose.description.subcomposeClickInterceptor.<anonymous> (ClipsEditDescriptionView.kt:181)");
                    }
                    q630 b = ojc.b(txj0.d(q630.a.a, 1.0f), sg50Var, null, false, null, gzsVar, 28);
                    boolean J = aVar.J(str);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new y2b(str, 1);
                        aVar.R(x);
                    }
                    ja8.a(egi0.b(b, false, (izs) x), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                String str2 = (String) this.c;
                s53 s53Var = (s53) this.d;
                r1x r1xVar = (r1x) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2130251682, intValue2, -1, "com.vk.ecomm.cart.impl.common.modal.InputCustomAddressBottomSheet.Builder.<anonymous> (InputCustomAddressBottomSheet.kt:42)");
                    }
                    t1x.a(str2, s53Var, r1xVar, null, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                rsd0.a((tsd0) this.c, (izs) this.e, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                n8i0.b((h8i0) this.c, (String) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                qqj0.a((q630) this.c, (u890) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.timeline.a.d((TimelineViewState) this.c, (q630) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                VideoFile videoFile3 = (VideoFile) this.c;
                List list = (List) this.d;
                List list2 = (List) this.e;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (Serializer.StreamParcelableAdapter streamParcelableAdapter : arrayList) {
                    boolean z = streamParcelableAdapter instanceof UIBlockSearchHistory.UIBlockSearchHistoryVideo;
                    if (z) {
                        videoFile = ((UIBlockSearchHistory.UIBlockSearchHistoryVideo) streamParcelableAdapter).A;
                    } else {
                        if (streamParcelableAdapter instanceof UIBlockVideo) {
                            videoFile = ((UIBlockVideo) streamParcelableAdapter).B;
                        }
                        videoFile2 = videoFile3;
                        arrayList2.add(streamParcelableAdapter);
                        videoFile3 = videoFile2;
                    }
                    if (epx.f(videoFile.a1(), videoFile3.a1())) {
                        VideoFileOld copy = videoFile3.copy();
                        copy.W = videoFile.r();
                        copy.S = list.contains(-2) && !list2.contains(-2);
                        if (z) {
                            UIBlockSearchHistory.UIBlockSearchHistoryVideo uIBlockSearchHistoryVideo = (UIBlockSearchHistory.UIBlockSearchHistoryVideo) streamParcelableAdapter;
                            videoFile2 = videoFile3;
                            streamParcelableAdapter = new UIBlockSearchHistory.UIBlockSearchHistoryVideo(new com.vk.catalog2.common.dto.api.ui.a(uIBlockSearchHistoryVideo.b, uIBlockSearchHistoryVideo.c, uIBlockSearchHistoryVideo.d, uIBlockSearchHistoryVideo.e, uIBlockSearchHistoryVideo.f, uIBlockSearchHistoryVideo.g, uIBlockSearchHistoryVideo.h, uIBlockSearchHistoryVideo.Db(), uIBlockSearchHistoryVideo.j, uIBlockSearchHistoryVideo.l, uIBlockSearchHistoryVideo.m, uIBlockSearchHistoryVideo.n, uIBlockSearchHistoryVideo.p), copy, uIBlockSearchHistoryVideo.B);
                        } else {
                            videoFile2 = videoFile3;
                            if (streamParcelableAdapter instanceof UIBlockVideo) {
                                streamParcelableAdapter = kwp0.b((UIBlockVideo) streamParcelableAdapter, copy);
                            }
                        }
                        arrayList2.add(streamParcelableAdapter);
                        videoFile3 = videoFile2;
                    }
                    videoFile2 = videoFile3;
                    arrayList2.add(streamParcelableAdapter);
                    videoFile3 = videoFile2;
                }
                return new UIBlockList(uIBlockList, arrayList2);
        }
    }

    public /* synthetic */ be0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ be0(tsd0 tsd0Var, izs izsVar, q630 q630Var, int i) {
        this.b = 3;
        this.c = tsd0Var;
        this.e = izsVar;
        this.d = q630Var;
    }
}
