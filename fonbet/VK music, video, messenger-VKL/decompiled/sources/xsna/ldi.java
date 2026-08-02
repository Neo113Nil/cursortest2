package xsna;

import android.content.Context;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.photo.editor.views.PointerView;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ldi implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ldi(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1201511856, intValue, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.ComposableSingletons$CommunityDetailsInfoItemKt.lambda$1201511856.<anonymous> (CommunityDetailsInfoItem.kt:122)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2025275458, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkScaffoldKt.lambda$2025275458.<anonymous> (VkScaffold.kt:55)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                com.vk.core.compose.component.datetime.d dVar = (com.vk.core.compose.component.datetime.d) obj2;
                Boolean bool = (Boolean) ((zak0) dVar.h).getValue();
                bool.booleanValue();
                return e43.l(bool, dVar.a.b());
            case 3:
                Object obj3 = ((ArrayList) ((lca) obj2).y0()).get(((Integer) obj).intValue());
                UIBlockMusicTrack uIBlockMusicTrack = obj3 instanceof UIBlockMusicTrack ? (UIBlockMusicTrack) obj3 : null;
                if (uIBlockMusicTrack != null) {
                    return uIBlockMusicTrack.z;
                }
                return null;
            case 4:
                ChannelsCounters channelsCounters = (ChannelsCounters) obj;
                if (((Boolean) obj2).booleanValue()) {
                    return channelsCounters;
                }
                ChannelsCounters.f.getClass();
                return ChannelsCounters.a.a();
            case 5:
                ((Integer) obj2).getClass();
                cd70.a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                return new OnlineBookingInternalComponent((AuthBridgeComponent) ((f8m) obj).a(fpf0.a(AuthBridgeComponent.class)));
            case 7:
                cyz cyzVar = (cyz) obj2;
                io.reactivex.rxjava3.internal.operators.observable.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new yxz((Context) obj, cyzVar));
                long j = cyzVar.d;
                return (j <= 0 || j >= Long.MAX_VALUE) ? io.reactivex.rxjava3.core.q.H(new Exception("Unexpected numUpdates")) : qVar.t0(j);
            case 8:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(-1623625960);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1623625960, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:185)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.W;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
            default:
                ((PointerView) obj).setOuterCircleRadius(((Float) obj2).floatValue());
                return s3q0.a;
        }
    }

    public /* synthetic */ ldi(int i) {
        this.b = 5;
    }
}
