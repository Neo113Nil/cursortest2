package xsna;

import android.animation.PropertyValuesHolder;
import androidx.compose.ui.node.LayoutNode;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;
import com.vk.log.L;
import com.vk.utils.vectordrawable.AnimationTarget;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.cri;
import xsna.dt1;
import xsna.kk9;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class nq2 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ nq2(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                PropertyValuesHolder propertyValuesHolder = (PropertyValuesHolder) obj;
                AnimationTarget.Property property = AnimationTarget.Property.FILL_COLOR;
                Float[] fArr = (Float[]) ((Object[]) obj2);
                int length = fArr.length;
                float[] fArr2 = new float[length];
                for (int i = 0; i < length; i++) {
                    fArr2[i] = fArr[i].floatValue();
                }
                propertyValuesHolder.setFloatValues(Arrays.copyOf(fArr2, length));
                return s3q0.a;
            case 1:
                kk9.b bVar = kk9.F;
                L.l(lhg.a(((Integer) obj).intValue(), "camera error: "));
                return s3q0.a;
            case 2:
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1999514597, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.holders.documents.ComposableSingletons$CommunityProfileContentDocumentViewHolderKt.lambda$1999514597.<anonymous> (CommunityProfileContentDocumentViewHolder.kt:85)");
                    }
                    tth.a(null, mnh0.b, aVar, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2090448418, intValue2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.placeholder.ComposableSingletons$FullToolbarKt.lambda$-2090448418.<anonymous> (FullToolbar.kt:174)");
                    }
                    q630 a = wdj0.a(q630.a.a, null);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, a);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar3);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, d, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    qws.b(false, aVar2, 6);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 5:
                Object obj3 = ((ArrayList) ((lca) obj2).y0()).get(((Integer) obj).intValue());
                UIBlockMusicTrack uIBlockMusicTrack = obj3 instanceof UIBlockMusicTrack ? (UIBlockMusicTrack) obj3 : null;
                if (uIBlockMusicTrack != null) {
                    return uIBlockMusicTrack.z;
                }
                return null;
            case 6:
                Playlist playlist = (Playlist) obj;
                Playlist playlist2 = (Playlist) obj2;
                return Integer.valueOf((playlist.b == playlist2.b && epx.f(playlist.c, playlist2.c)) ? 0 : 1);
            case 7:
                ((Integer) obj2).getClass();
                n750.h(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                ((Integer) obj).intValue();
                return ((OrdersListItem) obj2).a;
            case 9:
                return Integer.valueOf(((zox) obj).j0(((Integer) obj2).intValue()));
            case 10:
                ((Integer) obj2).intValue();
                return s3q0.a;
            case 11:
                return Integer.valueOf(((zox) obj).Z(((Integer) obj2).intValue()));
            case 12:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-477978445, intValue3, -1, "com.vk.profile.user.impl.ui.adapter.holders.lego.UserProfileLegoServiceInfoViewHolder.Content.<anonymous> (UserProfileLegoServiceInfoViewHolder.kt:30)");
                    }
                    if (oq.h(-1640652593, aVar4)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar5.K(47451869);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(47451869, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:191)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar5.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.c0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return frv0Var;
        }
    }

    public /* synthetic */ nq2(com.vk.camera.sdk.impl.a aVar) {
        this.b = 1;
        kk9.b bVar = kk9.F;
    }
}
