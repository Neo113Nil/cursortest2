package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.exoplayer.source.j;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.common.data.displayitems.AdVkFeedItemState;
import com.vk.newsfeed.common.presentation.model.items.MyTargetNativeAdSinglePartUiDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiClientAdapter;
import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.session.ApiConfigStore;
import xsna.evd;
import xsna.jsc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class kx2 implements ApiConfigStore.Updater, pcs, j7j, z960 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kx2(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.j7j
    public void accept(Object obj) {
        j.a aVar = (j.a) this.b;
        ((androidx.media3.exoplayer.source.j) obj).B(aVar.a, aVar.b, (bpz) this.c, (pr10) this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z960
    public void g(VkContextMenu vkContextMenu, int i) {
        MyTargetNativeAdEntry myTargetNativeAdEntry;
        MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto = (MyTargetNativeAdSinglePartUiDto) this.b;
        hs50 hs50Var = (hs50) this.c;
        List<ajx> list = (List) this.d;
        String str = i == PostActions.ACTION_SHOW_AD_DEBUG_INFO.h() ? "debug" : i == PostActions.ACTION_COPY_ADS_URL.h() ? "ads_copy_url" : i == PostActions.ACTION_SHOW_ADVERTISER_INFO.h() ? "show_advertiser_info" : i == PostActions.ACTION_OPEN_RECOMMENDATION_URL.h() ? "ads_recommendations_info" : i == PostActions.ACTION_COPY_AD_MARKER.h() ? "ad_marker_template" : null;
        if (str != null) {
            for (ajx ajxVar : list) {
                if (epx.f(ajxVar.b(), str)) {
                    if (ajxVar.a() && vkContextMenu != null) {
                        vkContextMenu.b();
                    }
                    cjx cjxVar = hs50Var.e0;
                    if (cjxVar != null) {
                        cjxVar.b(ajxVar);
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (i == PostActions.ACTION_HIDE_AD_MY_TARGET_NATIVE_AD.h()) {
            if (vkContextMenu != null) {
                vkContextMenu.e(null);
            }
            myTargetNativeAdSinglePartUiDto.u = AdVkFeedItemState.HIDE_REASONS_SHOWING;
            hs50Var.h7(myTargetNativeAdSinglePartUiDto);
        } else if (i == PostActions.ACTION_REPORT.h() && (myTargetNativeAdEntry = (MyTargetNativeAdEntry) hs50Var.q6()) != null) {
            NewsfeedRouter newsfeedRouter = (NewsfeedRouter) hs50Var.c0.getValue();
            Context context = hs50Var.itemView.getContext();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (epx.f(((ajx) obj).getType(), "complain")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ajx) it.next()).getTitle());
            }
            newsfeedRouter.U(context, myTargetNativeAdEntry, (String[]) arrayList2.toArray(new String[0]));
        }
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
    }

    @Override // ru.ok.android.api.session.ApiConfigStore.Updater
    public ApiConfig invoke(ApiConfig apiConfig) {
        ApiConfig reconfigureConcurrent$lambda$2;
        reconfigureConcurrent$lambda$2 = ApiClientAdapter.reconfigureConcurrent$lambda$2((String) this.b, (String) this.c, (String) this.d, apiConfig);
        return reconfigureConcurrent$lambda$2;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        ClipCoauthorSdkItem.Type type;
        Object obj;
        jsc.a aVar = (jsc.a) this.b;
        List list = (List) this.c;
        fb fbVar = (fb) this.d;
        aVar.b.f("co_request");
        ArrayList<ClipsCoauthorSelectorUserItem> parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("co_result", ClipsCoauthorSelectorUserItem.class) : bundle.getParcelableArrayList("co_result");
        if (parcelableArrayList != null) {
            ArrayList arrayList = new ArrayList(c5g.u(parcelableArrayList, 10));
            for (ClipsCoauthorSelectorUserItem clipsCoauthorSelectorUserItem : parcelableArrayList) {
                UserId userId = clipsCoauthorSelectorUserItem.b;
                String d = clipsCoauthorSelectorUserItem.d();
                String str2 = clipsCoauthorSelectorUserItem.e;
                int i = evd.a.$EnumSwitchMapping$0[clipsCoauthorSelectorUserItem.h.ordinal()];
                if (i == 1) {
                    type = ClipCoauthorSdkItem.Type.Male;
                } else if (i == 2) {
                    type = ClipCoauthorSdkItem.Type.Female;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    type = ClipCoauthorSdkItem.Type.Community;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((ClipCoauthorSdkItem) obj).b.equals(clipsCoauthorSelectorUserItem.b)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ClipCoauthorSdkItem clipCoauthorSdkItem = (ClipCoauthorSdkItem) obj;
                boolean z = false;
                if (clipCoauthorSdkItem != null && clipCoauthorSdkItem.f) {
                    z = true;
                }
                arrayList.add(new ClipCoauthorSdkItem(userId, d, str2, type, z, clipsCoauthorSelectorUserItem.g));
            }
            fbVar.invoke(arrayList);
        }
    }
}
