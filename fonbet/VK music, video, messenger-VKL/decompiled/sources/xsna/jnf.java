package xsna;

import android.content.Context;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.ecomm.cart.impl.cart.ui.emptycart.EmptyCartRootViewHolder;
import com.vk.ecomm.catalog.impl.di.MarketCatalogComponent;
import com.vk.ecomm.reviews.impl.di.ReviewsComponentImpl;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.im.engine.di.ImConfigurationComponentImpl;
import com.vk.libvideo.coldstart.api.di.VideoColdStartComponent;
import com.vk.log.L;
import com.vk.profile.community.catalog.impl.di.CommunitiesCatalogComponentImpl;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchMarketCatalogRootVh;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.CommonVoipBridgeComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import xsna.e260;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class jnf implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ jnf(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                pxv pxvVar = m63.e;
                return (pnf) (pxvVar != null ? pxvVar : null).invoke();
            case 1:
                return new CommunitiesCatalogComponentImpl.a();
            case 2:
                bpn0 bpn0Var = e260.e;
                return e260.a.a();
            case 3:
                List l = e43.l("^id\\d+.*", "^club\\d+.*", "^event\\d+.*", "^public\\d+.*");
                ArrayList arrayList = new ArrayList(c5g.u(l, 10));
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Regex((String) it.next()));
                }
                return arrayList;
            case 4:
                return new ImConfigurationComponentImpl.a();
            case 5:
                ArrayList arrayList2 = new ArrayList();
                try {
                    arrayList2.add(VkOAuthService.ALFA);
                } catch (Throwable unused) {
                }
                try {
                    arrayList2.add(VkOAuthService.ESIA);
                } catch (Throwable unused2) {
                }
                try {
                    arrayList2.add(VkOAuthService.GOOGLE);
                } catch (Throwable unused3) {
                }
                try {
                    arrayList2.add(VkOAuthService.MAILRU);
                } catch (Throwable unused4) {
                }
                try {
                    arrayList2.add(VkOAuthService.OK);
                } catch (Throwable unused5) {
                }
                try {
                    arrayList2.add(VkOAuthService.PASSKEY);
                } catch (Throwable unused6) {
                }
                try {
                    arrayList2.add(VkOAuthService.SBER);
                } catch (Throwable unused7) {
                }
                try {
                    arrayList2.add(VkOAuthService.TINKOFF);
                } catch (Throwable unused8) {
                }
                try {
                    arrayList2.add(VkOAuthService.YANDEX);
                } catch (Throwable unused9) {
                }
                return arrayList2;
            case 6:
                qcy<Object>[] qcyVarArr = ReviewsComponentImpl.l;
                return new bjg0();
            case 7:
                L.p("Master key for session was created");
                return s3q0.a;
            case 8:
                return new MarketCatalogComponent.a(fpf0.a(EmptyCartRootViewHolder.class), fpf0.a(GlobalSearchMarketCatalogRootVh.class));
            case 9:
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                return new y2m0();
            case 10:
                return dgn0.c().a.C.getValue();
            case 11:
                VKApplication.a aVar = VKApplication.c;
                o260 o260Var = d260.a;
                return (o260Var != null ? o260Var : null).b(NetworkClient.ClientType.CLIENT_IMAGE_LOADER);
            case 12:
                return new CommonVoipBridgeComponent.a();
            case 13:
                return asu0.a.b(10, 5000L, "vk-session-management-init");
            case 14:
                return new VideoColdStartComponent.a();
            case 15:
                Context context = e43.a;
                return new udz(context != null ? context : null, new com.vk.common.links.a(hd60.a().P()));
            case 16:
                return new com.vk.profile.questions.impl.g();
            case 17:
                io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = com.vk.voip.ui.c.k0;
                vqe0 vqe0Var = new vqe0(18);
                OKVoipEngine oKVoipEngine = com.vk.voip.ui.c.r;
                com.vk.voip.ui.c.b.getClass();
                return new kcx0(i0Var, vqe0Var, oKVoipEngine, (ubx0) com.vk.voip.ui.c.z.getValue(), com.vk.voip.ui.c.F());
            default:
                return new i35();
        }
    }
}
