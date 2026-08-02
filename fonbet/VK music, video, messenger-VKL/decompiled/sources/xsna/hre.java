package xsna;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoOwner;
import com.vk.log.L;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.fa90;
import xsna.q630;
import xsna.t7z;
import xsna.yqx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hre implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ hre(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        fa90 fa90Var;
        switch (this.b) {
            case 0:
                Integer num = (Integer) obj;
                final int intValue = num.intValue();
                Pair pair = (Pair) obj2;
                final VideoFile videoFile = (VideoFile) pair.d();
                final VideoFile videoFile2 = (VideoFile) pair.g();
                L.d(new gzs() { // from class: xsna.jre
                    @Override // xsna.gzs
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder("PlaylistsUi | REORDER DIFF compare current ");
                        sb.append(VideoFile.this.j1());
                        sb.append('[');
                        int i = intValue;
                        sb.append(i);
                        sb.append("]\tto last\t ");
                        sb.append(videoFile2.j1());
                        sb.append('[');
                        sb.append(i);
                        sb.append("]]");
                        return sb.toString();
                    }
                });
                if (epx.f(videoFile.a1(), videoFile2.a1())) {
                    return null;
                }
                return num;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1070649632, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkSegmentedControlKt.lambda$1070649632.<anonymous> (VkSegmentedControl.kt:271)");
                    }
                    a.j g = androidx.compose.foundation.layout.a.g(8);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, aVar, 6);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, q630.a.a);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar2);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    aVar.K(-2112058906);
                    b5i0 b5i0Var = b5i0.a;
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new kr6(8);
                        aVar.R(x);
                    }
                    b5i0Var.c(true, (gzs) x, uoi.b, null, aVar, 438, 8);
                    Object x2 = aVar.x();
                    if (x2 == c0012a) {
                        x2 = new d4(13);
                        aVar.R(x2);
                    }
                    b5i0Var.c(false, (gzs) x2, uoi.c, null, aVar, 438, 8);
                    rvi.a(bjv0.a.b(Boolean.FALSE), kai.c(-2090686107, new com.vk.movika.tools.controls.seekbar.i(b5i0Var, 7), aVar), aVar, 56);
                    aVar.j();
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                nsv nsvVar = (nsv) j5g.b0(((Integer) obj2).intValue(), (List) obj);
                return (nsvVar == null || (fa90Var = nsvVar.c) == null) ? fa90.b.a : fa90Var;
            case 3:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                aVar3.K(-494562181);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-494562181, intValue3, -1, "com.vk.core.compose.component.modal.VkModal.<anonymous> (Modal.kt:68)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-49441252, 6, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:211)");
                }
                WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
                o3q0 o3q0Var = yqx0.a.c(aVar3).l;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                h7z h7zVar = new h7z(o3q0Var, 32);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return h7zVar;
            case 4:
                f2h0 f2h0Var = (f2h0) obj;
                t7z t7zVar = (t7z) obj2;
                return e43.a(i2h0.a(new t7z.a(t7zVar.a), i2h0.D, f2h0Var), i2h0.a(new t7z.c(t7zVar.b), i2h0.E, f2h0Var), i2h0.a(new t7z.b(t7zVar.c), i2h0.F, f2h0Var));
            case 5:
                return new Pair(obj, (VideoOwner) obj2);
            default:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar4.K(-822284009);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-822284009, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:153)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.q;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var;
        }
    }
}
