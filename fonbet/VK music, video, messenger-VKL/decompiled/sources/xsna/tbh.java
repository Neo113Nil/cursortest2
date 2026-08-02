package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import com.vk.catalog2.common.ui.holders.market.FeaturedListBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.FriendsSearchQueryVh;
import com.vk.contacts.NoReadContactsPermissionException;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedMiniReactionsStack;
import com.vk.im.chat.clips.decoration.impl.di.ImChatClipsDecorationScopedComponentImpl;
import com.vk.log.L;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.superapp.ads.js.bridge.impl.di.JsAdsDelegateComponentImpl;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import xsna.bsm;
import xsna.n1y;
import xsna.riv;
import xsna.vx70;
import xsna.xyq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tbh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tbh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = 4;
        switch (this.b) {
            case 0:
                ((gzs) this.c).invoke();
                return s3q0.a;
            case 1:
                ksh kshVar = (ksh) this.c;
                return new ush(kshVar.a, kshVar.b, kshVar.c, (ksd0) kshVar.d.E0.getValue(), (qdh) kshVar.h.getValue(), kshVar.e, kshVar.f, kshVar.g);
            case 2:
                ((vvh) this.c).m.s = null;
                return s3q0.a;
            case 3:
                u1j u1jVar = (u1j) this.c;
                View findViewById = u1jVar.findViewById(R.id.add_new_room);
                bwt0.i0(findViewById, new i4e(u1jVar, 17));
                return findViewById;
            case 4:
                ddj ddjVar = (ddj) this.c;
                ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
                imFeatures.getClass();
                if (com.vk.toggle.b.A.a(imFeatures)) {
                    ddjVar.g();
                } else {
                    VkSearchView vkSearchView = ddjVar.w;
                    if (vkSearchView == null) {
                        vkSearchView = null;
                    }
                    vkSearchView.setQuery("");
                }
                View view = ddjVar.r;
                (view != null ? view : null).setVisibility(4);
                ddjVar.p.i();
                return s3q0.a;
            case 5:
                ((p9k) this.c).e.onError(new NoReadContactsPermissionException());
                return s3q0.a;
            case 6:
                hrl hrlVar = (hrl) this.c;
                hrlVar.d = true;
                hrlVar.a.c();
                return s3q0.a;
            case 7:
                return new en30(((tim) this.c).a);
            case 8:
                return new bsm.i((bsm) this.c);
            case 9:
                return new baf0(m33.a(R.drawable.vk_icon_info_outline_dzen, ((rto) this.c).itemView.getContext()), dhr0.t.c(R.attr.vk_ui_icon_tertiary));
            case 10:
                i7p i7pVar = (i7p) this.c;
                View inflate = i7pVar.a.inflate();
                inflate.setOnClickListener(new hn2(i7pVar, i));
                return inflate;
            case 11:
                EditText editText = ((pop) this.c).x;
                return com.vk.registration.funnels.a.d(editText != null ? editText : null);
            case 12:
                return ((mqp) this.c).o;
            case 13:
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) this.c;
                qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
                return faveFeedFragment.go();
            case 14:
                return new FeaturedListBannerVh.a((LayoutInflater) this.c);
            case 15:
                ((gzs) ((zak0) ((xyq.b) this.c).b).getValue()).invoke();
                return s3q0.a;
            case 16:
                return FeedMiniReactionsStack.a((FeedMiniReactionsStack) this.c);
            case 17:
                com.vk.newsfeed.common.recycler.holders.a aVar = (com.vk.newsfeed.common.recycler.holders.a) this.c;
                return new ga60(aVar.itemView.getContext(), (neg) aVar.m0.getValue(), (NewsfeedRouter) aVar.n0.getValue());
            case 18:
                ((FriendsSearchQueryVh) this.c).c.invoke();
                return s3q0.a;
            case 19:
                return Float.valueOf(((com.vk.geo.impl.presentation.b) this.c).A);
            case 20:
                return ((y4u) this.c).a.S3();
            case 21:
                return new jsa(new os9(new m1o((uhu) this.c, 9), 2));
            case 22:
                riv rivVar = (riv) this.c;
                synchronized (rivVar.f) {
                    try {
                        if (!rivVar.d.isEmpty()) {
                            try {
                                File file = rivVar.e;
                                if (file == null) {
                                    file = rivVar.a();
                                    rivVar.e = file;
                                }
                                boolean z = file.length() == 0;
                                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                                ObjectOutputStream objectOutputStream = z ? new ObjectOutputStream(fileOutputStream) : new riv.a(fileOutputStream);
                                try {
                                    Iterator<riv.b> it = rivVar.d.values().iterator();
                                    while (it.hasNext()) {
                                        riv.b next = it.next();
                                        boolean z2 = z ? false : z;
                                        if (z) {
                                            objectOutputStream.writeInt(1);
                                        }
                                        objectOutputStream.writeUTF(next.a);
                                        objectOutputStream.writeInt(next.b);
                                        objectOutputStream.writeInt(next.c);
                                        objectOutputStream.writeInt(next.d);
                                        objectOutputStream.writeInt(next.e);
                                        it.remove();
                                        z = z2;
                                    }
                                    objectOutputStream.flush();
                                    s3q0 s3q0Var = s3q0.a;
                                    objectOutputStream.close();
                                } finally {
                                }
                            } catch (Exception e) {
                                L.j(e, "HttpCacheStatistics");
                                com.vk.metrics.eventtracking.b.a.a(e);
                            }
                            rivVar.d();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s3q0.a;
            case 23:
                ImChatClipsDecorationScopedComponentImpl imChatClipsDecorationScopedComponentImpl = (ImChatClipsDecorationScopedComponentImpl) this.c;
                return new nob(imChatClipsDecorationScopedComponentImpl.b.e0(), imChatClipsDecorationScopedComponentImpl.c.getExperiments(), imChatClipsDecorationScopedComponentImpl.d.g(), imChatClipsDecorationScopedComponentImpl.e.b0());
            case 24:
                io2 io2Var = ((com.vk.im.video.g) this.c).u;
                if (io2Var != null) {
                    io2Var.D0();
                }
                return s3q0.a;
            case 25:
                JsAdsDelegateComponentImpl jsAdsDelegateComponentImpl = (JsAdsDelegateComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = JsAdsDelegateComponentImpl.e;
                nwy nwyVar = jsAdsDelegateComponentImpl.a;
                qcy<Object>[] qcyVarArr3 = JsAdsDelegateComponentImpl.e;
                qcy<Object> qcyVar = qcyVarArr3[0];
                del0 del0Var = ((n1y.a) nwyVar.c()).b;
                qcy<Object> qcyVar2 = qcyVarArr3[0];
                return new hwf(del0Var, ((n1y.a) nwyVar.c()).d);
            case 26:
                return new yvp(((z4y) this.c).b);
            case 27:
                return new n7y((x6y) this.c);
            case 28:
                return ((whz) this.c).getView().findViewById(R.id.no_autoplay_button);
            default:
                y300 y300Var = (y300) this.c;
                mkx mkxVar = y300Var.b;
                okhttp3.u r = mkxVar.r(new fy70(y300Var.c), y300Var.d);
                return new vx70.b(mkxVar.p(r), r.g, null);
        }
    }
}
