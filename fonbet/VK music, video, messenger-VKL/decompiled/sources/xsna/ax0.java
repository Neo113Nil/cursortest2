package xsna;

import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.lists.c;
import com.vk.search.communities.map.catalog.root.SearchCommunitiesOnMapListRootVh;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.arq0;
import xsna.bex0;
import xsna.qik;

/* compiled from: AdsItemFeature.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class ax0 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        qik.a aVar;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((yw0) this.receiver).a());
            case 1:
                qik qikVar = (qik) this.receiver;
                PhotoAttachment photoAttachment = qikVar.b;
                if (photoAttachment != null && (aVar = qikVar.d) != null) {
                    aVar.c(photoAttachment.Hb());
                }
                return s3q0.a;
            case 2:
                r6y r6yVar = ((bst) this.receiver).b;
                if (r6yVar != null) {
                    bex0.a.a(r6yVar, JsApiMethodType.GET_WORKOUTS, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
                }
                return s3q0.a;
            case 3:
                ((m3z) this.receiver).f();
                return s3q0.a;
            case 4:
                return ((n850) this.receiver).c();
            case 5:
                return Boolean.valueOf(((mkr0) this.receiver).E());
            case 6:
                SearchCommunitiesOnMapListRootVh searchCommunitiesOnMapListRootVh = (SearchCommunitiesOnMapListRootVh) this.receiver;
                pr prVar = new pr(17);
                c.h hVar = new c.h((c.m) searchCommunitiesOnMapListRootVh.r.getValue());
                hVar.o = prVar;
                return new VerticalListVh(searchCommunitiesOnMapListRootVh.m.b.s, hVar, (kea) searchCommunitiesOnMapListRootVh.r.getValue(), searchCommunitiesOnMapListRootVh.m, searchCommunitiesOnMapListRootVh.N(), false, R.layout.catalog_search_all_discover_search_result_list_vertical, new VerticalListVh.a(new z3v(false), null, null, 52), 352);
            case 7:
                arq0 arq0Var = (arq0) this.receiver;
                arq0.a aVar2 = arq0.v;
                zak0 zak0Var = (zak0) arq0Var.t;
                VkContextMenu vkContextMenu = (VkContextMenu) zak0Var.getValue();
                if (vkContextMenu == null) {
                    arq0Var.s6(false);
                } else {
                    zak0Var.setValue(null);
                    vkContextMenu.b();
                    arq0Var.s6(false);
                }
                return s3q0.a;
            default:
                return ((w2x0) this.receiver).c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax0(Object obj, int i) {
        super(0, obj, mkr0.class, "canLoadMorePeers", "canLoadMorePeers()Z", 0);
        this.b = i;
        switch (i) {
            case 7:
                super(0, obj, arq0.class, "dismissAvatarMenu", "dismissAvatarMenu()V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax0(n850 n850Var) {
        super(0, n850Var, n850.class, "availableStorages", "availableStorages()Ljava/util/Set;", 0);
        this.b = 4;
    }
}
