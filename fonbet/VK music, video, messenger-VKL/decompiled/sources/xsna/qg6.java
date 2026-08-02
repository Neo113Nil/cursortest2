package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.ui.UIBlockSearchQuickFilter;
import com.vk.catalog2.common.ui.holders.search.FiltersWithSearchResultVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qg6 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qg6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.vk.content.design.view.camera.a aVar = (com.vk.content.design.view.camera.a) obj2;
                Mask mask = (Mask) obj;
                if (!aVar.r.a() && aVar.f) {
                    aVar.getUsersBridge().m(aVar.getContext(), mask.e, new o0r0.a(true, SignalingProtocol.KEY_CAMERA, null, null, null, null, null, false, false, false, false, null, null, null, 65532));
                    izs<? super UserId, s3q0> izsVar = aVar.c;
                    if (izsVar != null) {
                        izsVar.invoke(mask.e);
                        break;
                    }
                }
                break;
            case 1:
                FiltersWithSearchResultVh filtersWithSearchResultVh = (FiltersWithSearchResultVh) obj2;
                UIBlockSearchQuickFilter uIBlockSearchQuickFilter = (UIBlockSearchQuickFilter) obj;
                com.vk.catalog2.common.ui.holders.search.b bVar = com.vk.catalog2.common.ui.holders.search.b.a;
                com.vk.catalog2.common.ui.holders.search.b.c(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_FILTER, uIBlockSearchQuickFilter.y);
                ViewGroup viewGroup = filtersWithSearchResultVh.g;
                if (viewGroup != null && (context = viewGroup.getContext()) != null) {
                    ((udr) filtersWithSearchResultVh.c.getValue()).a(context, uIBlockSearchQuickFilter.A, new defpackage.v(10, filtersWithSearchResultVh, uIBlockSearchQuickFilter));
                    break;
                }
                break;
            case 2:
                ((MusicPageInfoBlockNewVh.e) obj2).c.invoke((MusicPageInfoBlockNewVh.d) obj);
                break;
            default:
                hs50 hs50Var = (hs50) obj2;
                ajx ajxVar = (ajx) obj;
                cjx cjxVar = hs50Var.e0;
                if (cjxVar != null) {
                    cjxVar.b(ajxVar);
                }
                MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) hs50Var.q6();
                if (myTargetNativeAdEntry != null) {
                    hs50Var.D.sa(new NewsfeedExternalAction.c.r(myTargetNativeAdEntry));
                    break;
                }
                break;
        }
    }
}
