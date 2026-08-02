package xsna;

import android.widget.ImageView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.dto.common.VideoFile;
import com.vk.profile.design.view.subscriptioninfo.SubscriptionInfoView;
import java.util.ArrayList;
import xsna.idh0;
import xsna.j5h;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class og4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ og4(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((pg4) obj4).a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((ko7) obj4).c((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((j5h.c) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((njl) obj4).e((String) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                hwl.a((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                dt70 dt70Var = (dt70) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(368219888, intValue, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.OfflineAudioBookChaptersScreen.<anonymous> (OfflineAudioBookChaptersMviComposeComponent.kt:130)");
                    }
                    zs70.g(dt70Var, izsVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ich0.a((idh0.a) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                final SubscriptionInfoView subscriptionInfoView = (SubscriptionInfoView) obj3;
                ztm0 ztm0Var = (ztm0) obj;
                o6j o6jVar = (o6j) obj2;
                int i2 = SubscriptionInfoView.p;
                int[] iArr = new int[1];
                ((zo10) j5g.Y(ztm0Var.t1(m4s.g, new jai(-871242542, new sg4(6, subscriptionInfoView, iArr), true)))).N(o6jVar.a);
                final float j1 = ((azl) obj4).j1(iArr[0]);
                tra0 N = ((zo10) j5g.Y(ztm0Var.t1(po40.f, new jai(424284962, new wzs() { // from class: xsna.oym0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj5, Object obj6) {
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj5;
                        int intValue2 = ((Integer) obj6).intValue();
                        int i3 = SubscriptionInfoView.p;
                        if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(424284962, intValue2, -1, "com.vk.profile.design.view.subscriptioninfo.SubscriptionInfoView.ThemedContent.<anonymous>.<anonymous>.<anonymous> (SubscriptionInfoView.kt:86)");
                            }
                            SubscriptionInfoView subscriptionInfoView2 = SubscriptionInfoView.this;
                            qym0.a(subscriptionInfoView2.getShape(), subscriptionInfoView2.getOnClick(), subscriptionInfoView2.getSubscriptionInfoText(), txj0.v(q630.a.a, j1), null, aVar2, 0, 16);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, true)))).N(o6jVar.a);
                return ztm0Var.Q(N.b, N.c, jgp.b, new j5b0(N, 17));
            case 8:
                ((Integer) obj2).getClass();
                o8o0.a((i4m) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                cmo0 cmo0Var = (cmo0) obj4;
                ix5 ix5Var = (ix5) obj;
                ix5Var.b(cmo0Var.f);
                ((ImageView) obj3).setImageResource(ix5Var.h());
                cmo0Var.f();
                return s3q0.a;
            default:
                VideoFile videoFile = (VideoFile) obj3;
                UIBlockList uIBlockList = (UIBlockList) new m2h(videoFile, (c6s0) obj4).invoke((UIBlockList) obj, (com.vk.lists.c) obj2);
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                ArrayList arrayList2 = new ArrayList();
                for (UIBlock uIBlock : arrayList) {
                    if (uIBlock instanceof UIBlockVideo) {
                        UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
                        if (epx.f(uIBlockVideo.B.r1(), videoFile.r1())) {
                            String str = uIBlockVideo.K;
                            if (drm0.D(str, "video/my/liked", false) || drm0.D(str, "my/liked", false)) {
                                uIBlock = null;
                            }
                        }
                    }
                    if (uIBlock != null) {
                        arrayList2.add(uIBlock);
                    }
                }
                return new UIBlockList(uIBlockList, arrayList2);
        }
    }

    public /* synthetic */ og4(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
    }
}
