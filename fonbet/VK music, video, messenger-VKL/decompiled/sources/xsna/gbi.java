package xsna;

import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.video.ui.discovery.minimizable.s;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.List;
import xsna.a6t0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class gbi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ gbi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1093471326, intValue, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.ComposableSingletons$AudioBookActionsPanelKt.lambda$-1093471326.<anonymous> (AudioBookActionsPanel.kt:91)");
                    }
                    z3r0.b(null, false, aVar, 0, 3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-834648532, intValue2, -1, "com.vk.profile.core.tabs.ui.pager.ComposableSingletons$CommunityProfileContentPagerViewHolderKt.lambda$-834648532.<anonymous> (CommunityProfileContentPagerViewHolder.kt:351)");
                    }
                    wgh.a(0, 0, 0L, aVar2, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                ksy ksyVar = (ksy) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar3.J(ksyVar) ? 4 : 2;
                }
                if (aVar3.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(660653868, intValue3, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.ComposableSingletons$GoodsWithFiltersListKt.lambda$660653868.<anonymous> (GoodsWithFiltersList.kt:54)");
                    }
                    q630 f = txj0.f(ksyVar.b(q630.a.a), 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    f9t.e(hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                a6t0.a.C2528a c2528a = (a6t0.a.C2528a) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar4.J(c2528a) ? 4 : 2;
                }
                if (aVar4.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1327033422, intValue4, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$VideoPreviewScreenContentKt.lambda$-1327033422.<anonymous> (VideoPreviewScreenContent.kt:83)");
                    }
                    c2528a.a.h().c(PreviewViewState.Size.PosterSmall2x3, aVar4, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 4:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).q.a.i());
                return s3q0.a;
            case 5:
                o6j o6jVar = (o6j) obj3;
                tra0 N = ((zo10) obj2).N(o6j.b(o6j.i(o6jVar.a), o6jVar.a, 0, 0, 0, 14));
                return ((ep10) obj).Q(N.b, N.c, jgp.b, new qpj(N, 13));
            case 6:
                ((Integer) obj).getClass();
                int intValue5 = ((Integer) obj2).intValue();
                nov novVar = (nov) obj3;
                novVar.e(f2l0.a, (intValue5 - novVar.getRealHeight()) - f2l0.a(intValue5));
                return s3q0.a;
            default:
                return new s.e((List) obj, (List) obj2, (List) obj3);
        }
    }
}
