package xsna;

import androidx.compose.runtime.a;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nrv implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nrv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.c;
                col colVar = (col) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(colVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2120378724, intValue, -1, "com.vk.design.demo.presentation.screens.IconsContent.Content.<anonymous>.<anonymous> (IconsContent.kt:53)");
                    }
                    boolean z = ((Number) wh50Var.getValue()).intValue() == 0;
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new prv(0, wh50Var);
                        aVar.R(x);
                    }
                    colVar.b(((intValue << 12) & 57344) | Tensorflow.FRAME_WIDTH, aVar, (gzs) x, null, z);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                k150 k150Var = (k150) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1285751246, intValue2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.playlistItems.<anonymous> (MusicPlaylistListContent.kt:181)");
                    }
                    k150Var.c(0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(328525652, intValue3, -1, "com.vk.notifications.list.impl.presentation.base.view.common.NotificationList.<anonymous>.<anonymous>.<anonymous> (NotificationList.kt:99)");
                    }
                    boolean J = aVar3.J(izsVar);
                    Object x2 = aVar3.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x2 == c0012a) {
                        x2 = new oyg(izsVar, 3);
                        aVar3.R(x2);
                    }
                    izs izsVar2 = (izs) x2;
                    boolean J2 = aVar3.J(izsVar);
                    Object x3 = aVar3.x();
                    if (J2 || x3 == c0012a) {
                        x3 = new ypd(izsVar, 3);
                        aVar3.R(x3);
                    }
                    izs izsVar3 = (izs) x3;
                    boolean J3 = aVar3.J(izsVar);
                    Object x4 = aVar3.x();
                    if (J3 || x4 == c0012a) {
                        x4 = new lse(izsVar, 2);
                        aVar3.R(x4);
                    }
                    ub70.b(izsVar2, izsVar3, (izs) x4, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 3:
                f9d0 f9d0Var = (f9d0) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-719567585, intValue4, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesTileContentImpl.Content.<anonymous>.<anonymous>.<anonymous> (PrimaryBlockServicesTileContentImpl.kt:117)");
                    }
                    f9d0Var.s(null, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            default:
                j15 j15Var = (j15) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue5 & 1, (intValue5 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1622928879, intValue5, -1, "com.vk.profile.core.tabs.ui.music.ProfileContentAudioViewHolder.setupShimmers.<anonymous>.<anonymous>.<anonymous> (ProfileContentAudioViewHolder.kt:272)");
                    }
                    zud0.b(j15Var.k, null, 0, 0, 0, 0L, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
        }
        return s3q0.a;
    }
}
