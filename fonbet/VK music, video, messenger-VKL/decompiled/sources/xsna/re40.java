package xsna;

import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.Push;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.newsfeed.common.delegates.OnMediaAudioComponentProvider;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.poll.fragments.PollVotersFragment;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import com.vk.search.params.api.City;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import xsna.bbv0;
import xsna.lfc;
import xsna.tmd0;
import xsna.vim0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class re40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ re40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                MusicOfflineCatalogRootVh musicOfflineCatalogRootVh = (MusicOfflineCatalogRootVh) obj;
                break;
            case 2:
                ue60 ue60Var = ((wg60) obj).h;
                break;
            case 3:
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                break;
            case 4:
                break;
            case 5:
                OnMediaAudioComponentProvider onMediaAudioComponentProvider = (OnMediaAudioComponentProvider) obj;
                break;
            case 6:
                lv90 lv90Var = (lv90) obj;
                lfc.b bVar = new lfc.b(lv90Var.requireContext(), false);
                City city = (City) lv90Var.m1.getValue();
                bVar.i = city != null ? Integer.valueOf(city.b) : null;
                bVar.h = "search_people_filter_city_param";
                lv90Var.h1.a(bVar.a());
                break;
            case 7:
                h5a0 h5a0Var = (h5a0) obj;
                o1l0 accessibilityListener = h5a0Var.getAccessibilityListener();
                if (accessibilityListener != null) {
                    ((kdl0) accessibilityListener).a(h5a0Var);
                }
                break;
            case 8:
                break;
            case 9:
                PollResultsFragment pollResultsFragment = (PollResultsFragment) obj;
                pollResultsFragment.lo(pollResultsFragment.Y);
                break;
            case 10:
                int i2 = PollVotersFragment.a0;
                ((PollVotersFragment) obj).finish();
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                com.vk.newsfeed.impl.items.posting.item.modals.b bVar2 = (com.vk.newsfeed.impl.items.posting.item.modals.b) obj;
                ListBuilder e = e43.e();
                e.add(com.vk.newsfeed.impl.items.posting.item.modals.b.e(bVar2));
                e.add(bVar2.a());
                e.add(bVar2.f());
                e.add(bVar2.b());
                e.add(bVar2.g(false));
                e.add(bVar2.d());
                break;
            case 16:
                ((ml1) obj).invoke(tmd0.a.a);
                break;
            case 17:
                break;
            case 18:
                Map<String, String> map = ((Push) obj).a;
                if (BuildInfo.m()) {
                    break;
                } else {
                    break;
                }
            case 19:
                break;
            case 20:
                break;
            case 21:
                r4g0 r4g0Var = (r4g0) obj;
                r4g0Var.s = r4g0Var.q;
                o1l0 accessibilityListener2 = r4g0Var.getAccessibilityListener();
                if (accessibilityListener2 != null) {
                    ((kdl0) accessibilityListener2).a(r4g0Var);
                }
                break;
            case 22:
                ClassLoader classLoader = ((szg0) obj).a;
                Method method = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures").getMethod("getDisplayFoldFeatures", null);
                Class cls = (Class) ((ParameterizedType) method.getGenericReturnType()).getActualTypeArguments()[0];
                if (Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(List.class) && epx.f(cls, classLoader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature"))) {
                    z = true;
                }
                break;
            case 23:
                break;
            case 24:
                bbv0.g.getClass();
                bbv0.a.f().d.j((String) obj);
                break;
            case 25:
                ?? r0 = ((dwk0) obj).a;
                break;
            case 26:
                HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                n9l0 F = StickersDatabase.a.b().F();
                List<StickerStockItem> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (StickerStockItem stickerStockItem : list) {
                    arrayList.add(new j5l0(stickerStockItem.b, 0, stickerStockItem.c, stickerStockItem.N, stickerStockItem.h, stickerStockItem.k, stickerStockItem.d, stickerStockItem.g, stickerStockItem.C, stickerStockItem.v, stickerStockItem.D, stickerStockItem.e, stickerStockItem.f, stickerStockItem.J, stickerStockItem.K, stickerStockItem.L, stickerStockItem.H, stickerStockItem.y, stickerStockItem.i, stickerStockItem.j, stickerStockItem.l, stickerStockItem.m, stickerStockItem.n, stickerStockItem.o, stickerStockItem.p, stickerStockItem.q, stickerStockItem.r, stickerStockItem.s, stickerStockItem.t, stickerStockItem.u, stickerStockItem.w, stickerStockItem.x, stickerStockItem.z, stickerStockItem.A, stickerStockItem.B, stickerStockItem.E, stickerStockItem.F, stickerStockItem.G, stickerStockItem.I, stickerStockItem.M, stickerStockItem.O, stickerStockItem.Q, stickerStockItem.T));
                }
                F.a(arrayList);
                break;
            case 27:
                break;
            case 28:
                gzs<s3q0> gzsVar = ((yem0) obj).m;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            default:
                ((wim0) obj).c.fo(vim0.d.b);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ re40(List list, m9l0 m9l0Var) {
        this.b = 26;
        this.c = list;
    }
}
