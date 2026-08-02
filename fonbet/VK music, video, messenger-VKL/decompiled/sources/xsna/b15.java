package xsna;

import androidx.compose.runtime.a;
import com.vk.donut.design.compose.banner.DonutBannerSkeletonContent;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b15 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b15(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = this.c;
        int i2 = 0;
        switch (i) {
            case 0:
                f15 f15Var = (f15) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1583518053, intValue, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.Component.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AudiobookListContent.kt:98)");
                    }
                    f15Var.j.a(null, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                wh50 wh50Var = (wh50) obj4;
                y4i0 y4i0Var = (y4i0) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(y4i0Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1091511331, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkSegmentedControlKt.lambda$258189194.<anonymous>.<anonymous> (VkSegmentedControl.kt:323)");
                    }
                    boolean z = ((Number) wh50Var.getValue()).intValue() == 0;
                    Object x = aVar2.x();
                    Object obj5 = a.C0011a.a;
                    if (x == obj5) {
                        x = new koi(0, wh50Var);
                        aVar2.R(x);
                    }
                    int i3 = ((intValue2 << 12) & 57344) | Tensorflow.FRAME_WIDTH;
                    y4i0Var.c(z, (gzs) x, uoi.f, null, aVar2, i3, 8);
                    boolean z2 = ((Number) wh50Var.getValue()).intValue() == 1;
                    Object x2 = aVar2.x();
                    if (x2 == obj5) {
                        x2 = new g2c(1, wh50Var);
                        aVar2.R(x2);
                    }
                    y4i0Var.c(z2, (gzs) x2, uoi.g, null, aVar2, i3, 8);
                    boolean z3 = ((Number) wh50Var.getValue()).intValue() == 2;
                    Object x3 = aVar2.x();
                    if (x3 == obj5) {
                        x3 = new loi(0, wh50Var);
                        aVar2.R(x3);
                    }
                    y4i0Var.c(z3, (gzs) x3, uoi.h, null, aVar2, i3, 8);
                    boolean z4 = ((Number) wh50Var.getValue()).intValue() == 3;
                    Object x4 = aVar2.x();
                    if (x4 == obj5) {
                        x4 = new moi(i2, wh50Var);
                        aVar2.R(x4);
                    }
                    y4i0Var.c(z4, (gzs) x4, uoi.i, null, aVar2, i3, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                DonutBannerSkeletonContent donutBannerSkeletonContent = (DonutBannerSkeletonContent) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1977359594, intValue3, -1, "com.vk.donut.design.compose.banner.MilkshakeDonutBannerSkeletonShimmer.<anonymous>.<anonymous> (DonutBannerSkeleton.kt:74)");
                    }
                    com.vk.donut.design.compose.banner.b.f(((DonutBannerSkeletonContent.a) donutBannerSkeletonContent).a, null, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 3:
                ListGroupCallView listGroupCallView = (ListGroupCallView) obj4;
                int intValue4 = ((Integer) obj2).intValue();
                int intValue5 = ((Integer) obj3).intValue();
                float f = ListGroupCallView.o0;
                if (intValue4 != 0 && intValue5 != 0) {
                    listGroupCallView.y.a();
                }
                break;
            default:
                lv40 lv40Var = (lv40) obj4;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= aVar4.J(q630Var) ? 4 : 2;
                }
                if (aVar4.t(intValue6 & 1, (intValue6 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1523692495, intValue6, -1, "com.vk.music.stickyplayer.presentation.components.music.MusicPlaybackQueueItem.Content.<anonymous>.<anonymous> (MusicPlaybackQueueItem.kt:78)");
                    }
                    if (((Boolean) ((zak0) lv40Var.b).getValue()).booleanValue()) {
                        aVar4.K(-1186185323);
                        p6b0.a(p6b0.a, ((Boolean) ((zak0) lv40Var.c).getValue()).booleanValue(), ahn.E(q630.a.a, "playingIndicator").g(q630Var), aVar4, 6);
                    } else {
                        aVar4.K(-1189667181);
                    }
                    aVar4.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }
}
