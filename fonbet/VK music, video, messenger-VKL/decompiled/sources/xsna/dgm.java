package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.TextView;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.clips.internal.nps.api.InternalNpsStateHolder$NpsEventType;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.Peer;
import com.vk.dto.music.Playlist;
import com.vk.im.chat.api.ChatComponent;
import com.vk.im.ui.fragments.ImCreateChatControlParamsFragment;
import com.vk.media.MediaUtils;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import com.vk.music.fragment.impl.MusicOfflineCatalogFragment;
import com.vk.music.subscription.api.di.MusicSubscriptionComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.subscriptions.js.bridge.api.di.JsSubscriptionsDelegateComponent;
import com.vk.superapp.subscriptions.js.bridge.api.di.MiniAppSubscriptionComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.k3z;
import xsna.pb20;
import xsna.unp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dgm implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dgm(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 16;
        Object obj = this.c;
        switch (i) {
            case 0:
                egm egmVar = (egm) obj;
                VkImageSimple vkImageSimple = new VkImageSimple(egmVar.d, null, 6, 0);
                vkImageSimple.setImageResource(R.drawable.vk_icon_ghost_16);
                vkImageSimple.setContentDescription(null);
                vkImageSimple.setLayoutParams(egm.W(egmVar, cn70.b(16), cn70.b(16), cn70.b(4), (int) (cn70.a() * 1.8f), 0, 0, 48));
                egmVar.b.addView(vkImageSimple);
                return vkImageSimple;
            case 1:
                int i3 = DiscoverSearchFragment.s0;
                ((omo) obj).onCancel();
                return s3q0.a;
            case 2:
                View inflate = LayoutInflater.from(((r2o) obj).e).inflate(R.layout.view_posting_donut_item, (ViewGroup) null, false);
                ((TextView) inflate.findViewById(R.id.posting_donut_item_text)).setText(R.string.newsfeed_settings_donut_visibility_all);
                return inflate;
            case 3:
                WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) obj;
                if (customViewCallback != null) {
                    customViewCallback.onCustomViewHidden();
                }
                return s3q0.a;
            case 4:
                lxp lxpVar = (lxp) obj;
                mxp mxpVar = lxpVar.e;
                VkAuthState vkAuthState = lxpVar.d;
                mxpVar.getClass();
                vkAuthState.d.put("force_remove_link", String.valueOf(0));
                p66.j0(mxpVar, vkAuthState, null, null, null, 30);
                return s3q0.a;
            case 5:
                return "File " + ((u7r) obj).a + " does not exist";
            case 6:
                Uri uri = (Uri) obj;
                Context context = e43.a;
                return MediaUtils.a.c(context != null ? context : null, uri, true);
            case 7:
                xvy xvyVar = (xvy) obj;
                return Boolean.valueOf(xvyVar.h() == 0 && xvyVar.i() == 0);
            case 8:
                int i4 = FriendsFragment.q0;
                h3p0.b((FriendsFragment) obj);
                return s3q0.a;
            case 9:
                int i5 = GalleryFragmentImpl.R0;
                com.vk.core.simplescreen.a aVar = new com.vk.core.simplescreen.a(((GalleryFragmentImpl) obj).kn(), false, false);
                aVar.setOnDismissListener(new u3t());
                return aVar;
            case 10:
                yct yctVar = (yct) obj;
                yctVar.i1.invoke();
                yctVar.dismiss();
                return s3q0.a;
            case 11:
                GeoPostsFragment geoPostsFragment = (GeoPostsFragment) obj;
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                return new ilt(new m1i(geoPostsFragment, i2), new l9h(geoPostsFragment, 20), new fgm(geoPostsFragment, 12), new maj(geoPostsFragment, 18));
            case 12:
                return new uxp0(((nau) obj).b);
            case 13:
                int i6 = ImCreateChatControlParamsFragment.b0;
                ((ImCreateChatControlParamsFragment) obj).a0();
                return s3q0.a;
            case 14:
                io2 io2Var = ((com.vk.im.video.g) obj).u;
                if (io2Var != null) {
                    io2Var.J();
                }
                return s3q0.a;
            case 15:
                ojx ojxVar = (ojx) obj;
                ojxVar.i.a.onNext(new xjx(ojxVar.f.d.b, InternalNpsStateHolder$NpsEventType.CLOSED));
                return s3q0.a;
            case 16:
                r6y r6yVar = (r6y) obj;
                return ((JsSubscriptionsDelegateComponent) x6y.H().a(fpf0.a(JsSubscriptionsDelegateComponent.class))).H7().a(r6yVar.M(), r6yVar, ((MiniAppSubscriptionComponent) x6y.H().a(fpf0.a(MiniAppSubscriptionComponent.class))).u2());
            case 17:
                k3z k3zVar = (k3z) obj;
                k3zVar.d0 = k3z.b.GRANTED;
                k3zVar.f1();
                return s3q0.a;
            case 18:
                nhz nhzVar = (nhz) obj;
                nhzVar.j1 = true;
                nhzVar.i1.c();
                nhzVar.dismiss();
                return s3q0.a;
            case 19:
                ((nc00) obj).k2();
                return s3q0.a;
            case 20:
                return u810.i((y810) obj);
            case 21:
                pb20 pb20Var = (pb20) obj;
                pb20.a aVar2 = pb20.k1;
                Lazy a = msy.a(LazyThreadSafetyMode.NONE, new cfl(pb20Var, 21));
                ras rasVar = pb20Var.h1;
                qcy<Object>[] qcyVarArr2 = pb20.l1;
                qcy<Object> qcyVar = qcyVarArr2[0];
                Peer peer = (Peer) rasVar.a(pb20Var);
                ras rasVar2 = pb20Var.i1;
                qcy<Object> qcyVar2 = qcyVarArr2[1];
                int intValue = ((Number) rasVar2.a(pb20Var)).intValue();
                ras rasVar3 = pb20Var.j1;
                qcy<Object> qcyVar3 = qcyVarArr2[2];
                return new qb20(new yi30(intValue, peer, (String) rasVar3.a(pb20Var)), unp0.b.a, pb20Var, a);
            case 22:
                te20 te20Var = (te20) obj;
                return "from=" + te20Var.b + " to=" + te20Var.c + " src=" + te20Var.e + " lmt=" + te20Var.d;
            case 23:
                iy30 iy30Var = (iy30) obj;
                VkSearchView vkSearchView = iy30Var.k;
                if (vkSearchView == null) {
                    vkSearchView = null;
                }
                vkSearchView.e5();
                VkSearchView vkSearchView2 = iy30Var.k;
                (vkSearchView2 != null ? vkSearchView2 : null).a5();
                return s3q0.a;
            case 24:
                return ((MusicAnalyticsComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.a) obj)).a(fpf0.a(MusicAnalyticsComponent.class))).Bd();
            case 25:
                int i7 = MusicOfflineCatalogFragment.X;
                return ((MusicSubscriptionComponent) m7m.d((MusicOfflineCatalogFragment) obj).a(fpf0.a(MusicSubscriptionComponent.class))).q1();
            case 26:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                StringBuilder sb = new StringBuilder("Playlists to import: ");
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.add(((Number) entry.getKey()).intValue() + " -> " + ((Playlist) entry.getValue()).Ib());
                }
                sb.append(j5g.g0(arrayList, null, null, null, 0, null, 63));
                return sb.toString();
            case 27:
                return ((ChatComponent) ((k7m) m7m.f((fa60) obj)).a(fpf0.a(ChatComponent.class))).Cf();
            case 28:
                rm60 rm60Var = (rm60) obj;
                return new g7o(new qm60(rm60Var, 0), new w100(rm60Var, 11));
            default:
                ((p6y) obj).invoke();
                return s3q0.a;
        }
    }

    public /* synthetic */ dgm(u810 u810Var, y810 y810Var) {
        this.b = 20;
        this.c = y810Var;
    }
}
