package xsna;

import com.vk.design.demo.presentation.nav.ScreenKey;
import com.vk.dto.common.VideoFile;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.f8t0;
import xsna.q630;
import xsna.xpb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class kv7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kv7(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((nv7) obj5).h((nw7) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                ((Integer) obj2).getClass();
                anm.a((xpb0.a) obj5, (izs) obj3, (spb0) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((krx) obj5).l((lsx) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ee00.a((String) obj5, (ScreenKey) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                gmq gmqVar = (gmq) obj5;
                VideoFile videoFile = (VideoFile) obj4;
                p960 p960Var = (p960) obj3;
                Throwable th = (Throwable) obj2;
                ((VideoAttachment) gmqVar).Ob((VideoFile) obj);
                if (th != null) {
                    videoFile.Xa(true);
                }
                ((NewsFeedComponent) p960Var.a.getValue()).w().e(120, gmqVar);
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((j080) obj5).h((o080) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 6:
                zdb0 zdb0Var = (zdb0) obj5;
                izs izsVar = (izs) obj3;
                rmp rmpVar = (rmp) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-682564675, intValue, -1, "com.vk.video.playlist.playlistscreen.ui.view.PlaylistScreenView.<anonymous>.<anonymous> (PlaylistScreenView.kt:85)");
                    }
                    w3g.a(zdb0Var.b, izsVar, rmpVar, null, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 7:
                f8t0.c.a aVar2 = (f8t0.c.a) obj5;
                String str = (String) obj4;
                VideoNewProfileHeaderViewV2 videoNewProfileHeaderViewV2 = (VideoNewProfileHeaderViewV2) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i2 = VideoNewProfileHeaderViewV2.y;
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(527618404, intValue2, -1, "com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2.bindTitleWithAgeMark.<anonymous> (VideoNewProfileHeaderViewV2.kt:409)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1604722121, new zle(aVar2, str, videoNewProfileHeaderViewV2, 8), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                lg90 lg90Var = (lg90) obj5;
                String str2 = (String) obj4;
                wh50 wh50Var = (wh50) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1647052744, intValue3, -1, "com.vk.core.compose.component.VkIconButton.<anonymous>.<anonymous>.<anonymous> (VkIconButton.kt:350)");
                    }
                    vqv.a(lg90Var, str2, q630.a.a, ((l5g) wh50Var.getValue()).a, aVar4, 392, 0);
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

    public /* synthetic */ kv7(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }

    public /* synthetic */ kv7(zdb0 zdb0Var, izs izsVar, rmp rmpVar) {
        this.b = 6;
        this.d = zdb0Var;
        this.c = izsVar;
        this.e = rmpVar;
    }

    public /* synthetic */ kv7(xpb0.a aVar, izs izsVar, spb0 spb0Var, int i) {
        this.b = 1;
        this.d = aVar;
        this.c = izsVar;
        this.e = spb0Var;
    }
}
