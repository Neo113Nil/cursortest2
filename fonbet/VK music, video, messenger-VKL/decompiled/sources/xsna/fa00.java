package xsna;

import android.content.Context;
import com.vk.api.generated.market.dto.MarketGetStorefrontResponseDto;
import com.vk.api.generated.market.dto.MarketStorefrontViewedProductsDto;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.ecomm.market.api.bus.MarketEventGoodCreated;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.attaches.AttachRoom;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import com.vk.newsfeed.api.data.NewsfeedSearchList;
import com.vk.newsfeed.impl.discover.themed.ThemedFeedToolbarFragment;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.preview.presentation.view.StoryGalleryPickerPreviewViewNew;
import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import xsna.b910;
import xsna.e0o0;
import xsna.it80;
import xsna.ixd0;
import xsna.ksh0;
import xsna.o880;
import xsna.tj50;
import xsna.u3s;
import xsna.via0;
import xsna.vs70;
import xsna.xn50;
import xsna.z710;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fa00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v74, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ry60 ry60Var = null;
        ry60Var = null;
        ry60Var = null;
        ry60Var = null;
        ry60Var = null;
        boolean z = false;
        switch (this.b) {
            case 0:
                ((ga00) this.c).n.L2(lz6.a);
                return s3q0.a;
            case 1:
                MainActivity mainActivity = (MainActivity) this.c;
                String str = (String) obj;
                String str2 = MainActivity.P;
                mainActivity.getClass();
                L l = L.a;
                L.r(L.LogType.d, "AfterAuthDeeplink", "Open deffered deeplink: " + str);
                xwk.d().e().a(mainActivity, str);
                return s3q0.a;
            case 2:
                c810 c810Var = (c810) this.c;
                int i = c810.o1;
                if (((ay00) obj) instanceof MarketEventGoodCreated) {
                    z710.n nVar = z710.n.b;
                    c810Var.getClass();
                    xn50.a.c(c810Var, nVar);
                }
                return s3q0.a;
            case 3:
                c810 c810Var2 = ((f910) this.c).d;
                b910 b910Var = (b910) obj;
                if (b910Var instanceof b910.g) {
                    xn50.a.c(c810Var2, ((b910.g) b910Var).a == 0 ? z710.h.b.b : z710.h.a.b);
                } else if (b910Var instanceof b910.c) {
                    xn50.a.c(c810Var2, new z710.d(((b910.c) b910Var).a));
                } else if (b910Var.equals(b910.e.a)) {
                    xn50.a.c(c810Var2, z710.h.c.b);
                } else if (b910Var.equals(b910.f.a)) {
                    xn50.a.c(c810Var2, z710.h.d.b);
                } else if (b910Var instanceof b910.a) {
                    xn50.a.c(c810Var2, z710.b.b);
                } else if (b910Var instanceof b910.b) {
                    xn50.a.c(c810Var2, z710.c.b);
                } else {
                    if (!(b910Var instanceof b910.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xn50.a.c(c810Var2, new z710.p(null));
                }
                return s3q0.a;
            case 4:
                e0o0 e0o0Var = (e0o0) this.c;
                via0 via0Var = (via0) obj;
                if ((via0Var instanceof via0.b) && ((via0.b) via0Var).a.a == ((e0o0.c) e0o0Var).a.a.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                return Boolean.valueOf(!((wpp) this.c).c.containsKey(Long.valueOf(((Msg) obj).c)));
            case 6:
                return ((kw8) obj).e(new b810((yk8) this.c, 6));
            case 7:
                ((MusicOfflineCatalogRootVh) this.c).m.b.e.b(new oon0("music_audios_download", null, false, false, 14), false);
                return s3q0.a;
            case 8:
                return new MusicPlayerInformerViewState.b(((tj50.a) obj).e(new com.vk.music.informer.mvi.i(1, (mx40) ((com.vk.music.informer.mvi.j) this.c).d.getValue(), mx40.class, "map", "map(Lcom/vk/music/informer/mvi/MusicPlayerInformerState;)Lcom/vk/music/informer/mvi/MusicPlayerInformerViewState$ArtistPromo;", 0)));
            case 9:
                py60 py60Var = (py60) this.c;
                nn50<State, TaskId, OutTask, Patch, Event> nn50Var = py60Var.b;
                NewsfeedSearchList newsfeedSearchList = (NewsfeedSearchList) obj;
                String str3 = newsfeedSearchList.query;
                if (str3 != null && str3.length() != 0) {
                    ry60 ry60Var2 = ((xx60) nn50Var.getCurrentState()).k;
                    if (epx.f(ry60Var2 != null ? ry60Var2.c : null, newsfeedSearchList.query)) {
                        ry60Var = ((xx60) nn50Var.getCurrentState()).k;
                        aic aicVar = new aic();
                        qy60 qy60Var = py60Var.h;
                        pn60 pn60Var = qy60Var.c;
                        return py60Var.t(newsfeedSearchList, aicVar, new zyi0(ry60Var, pn60Var), new xc3(newsfeedSearchList, null, pn60Var, qy60Var.d, null, true, null));
                    }
                }
                String str4 = newsfeedSearchList.query;
                if (str4 != null && str4.length() != 0 && !newsfeedSearchList.isEmpty()) {
                    xx60 xx60Var = (xx60) nn50Var.getCurrentState();
                    if (xx60Var.f == null && xx60Var.b == null) {
                        ry60Var = new ry60(null, y8g0.e(R.string.story_search_stories_block_title), newsfeedSearchList.query);
                    }
                }
                aic aicVar2 = new aic();
                qy60 qy60Var2 = py60Var.h;
                pn60 pn60Var2 = qy60Var2.c;
                return py60Var.t(newsfeedSearchList, aicVar2, new zyi0(ry60Var, pn60Var2), new xc3(newsfeedSearchList, null, pn60Var2, qy60Var2.d, null, true, null));
            case 10:
                bt70 bt70Var = (bt70) this.c;
                g47 g47Var = (g47) obj;
                l370.o(g47Var, new zf20(bt70Var, 11), f9t.z(bt70Var), new u620(9));
                l370.m(g47Var, f9t.w(bt70Var));
                g47Var.d(new vs70.a(bt70Var));
                return s3q0.a;
            case 11:
                a880 a880Var = (a880) this.c;
                o880 o880Var = (o880) obj;
                if (o880Var instanceof o880.b) {
                    if (!((o880.b) o880Var).a && !a880Var.v) {
                        z = true;
                    }
                    a880Var.d = z;
                } else {
                    if (!(o880Var instanceof o880.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a880Var.O.b(((o880.a) o880Var).a, true);
                }
                return s3q0.a;
            case 12:
                fi80 fi80Var = (fi80) this.c;
                ((Boolean) obj).booleanValue();
                ((gzs) ((zak0) fi80Var.c).getValue()).invoke();
                return s3q0.a;
            case 13:
                ((o990) this.c).l.c(u3s.c.a);
                return s3q0.a;
            case 14:
                ((com.vk.photos.root.photoflow.presentation.j) this.c).e.invoke(a.h.b);
                return s3q0.a;
            case 15:
                ((c3b0) this.c).a = ((Integer) obj).intValue();
                return s3q0.a;
            case 16:
                ((tab0) this.c).c.invoke((String) obj);
                return s3q0.a;
            case 17:
                Throwable th = (Throwable) obj;
                ((hib0) this.c).h.setEnabled(true);
                Context context = e43.a;
                cvk.w(j03.g(context != null ? context : null, th, R.string.default_network_error), false);
                return s3q0.a;
            case 18:
                exd0 exd0Var = (exd0) this.c;
                String str5 = (String) obj;
                return !drm0.N(str5) ? exd0Var.q.p(str5).U(new pu50(new d410(exd0Var, 27), 8)) : io.reactivex.rxjava3.core.q.T(new ixd0.a(exd0Var.l.b(), exd0Var.l.g.size(), false, false));
            case 19:
                AttachWithId attachWithId = (AttachWithId) this.c;
                Attach attach = (Attach) obj;
                if (attach instanceof AttachPoll) {
                    AttachPoll attachPoll = (AttachPoll) attach;
                    AttachPoll attachPoll2 = (AttachPoll) attachWithId;
                    return new AttachPoll(attachPoll.b, attachPoll2.c, attachPoll2.d, Math.max(attachPoll.e, attachPoll2.e));
                }
                if (attach instanceof AttachVideo) {
                    return m24.d((AttachVideo) attach, (AttachVideo) attachWithId);
                }
                if (attach instanceof AttachVideoMsg) {
                    return m24.e((AttachVideoMsg) attach, (AttachVideoMsg) attachWithId);
                }
                if (attach instanceof AttachImage) {
                    return m24.c((AttachImage) attach, (AttachImage) attachWithId);
                }
                if (attach instanceof AttachDoc) {
                    return m24.b((AttachDoc) attach, (AttachDoc) attachWithId);
                }
                if (attach instanceof AttachAudioMsg) {
                    AttachAudioMsg attachAudioMsg = (AttachAudioMsg) attach;
                    AttachAudioMsg attachAudioMsg2 = new AttachAudioMsg((AttachAudioMsg) attachWithId);
                    attachAudioMsg2.b = attachAudioMsg.b;
                    attachAudioMsg2.j = attachAudioMsg.j;
                    attachAudioMsg2.o = attachAudioMsg.o;
                    return attachAudioMsg2;
                }
                if (attach instanceof AttachWall) {
                    return m24.f((AttachWall) attach, (AttachWall) attachWithId);
                }
                if (attach instanceof AttachGraffiti) {
                    AttachGraffiti attachGraffiti = (AttachGraffiti) attach;
                    AttachGraffiti attachGraffiti2 = new AttachGraffiti((AttachGraffiti) attachWithId);
                    attachGraffiti2.b = attachGraffiti.b;
                    attachGraffiti2.g = attachGraffiti.g;
                    return attachGraffiti2;
                }
                if (attach instanceof AttachStory) {
                    AttachStory attachStory = (AttachStory) attach;
                    return AttachStory.a((AttachStory) attachWithId, null, attachStory.c, attachStory.e, 501);
                }
                if (attach instanceof AttachSticker) {
                    AttachSticker attachSticker = new AttachSticker((AttachSticker) attachWithId);
                    attachSticker.b = ((AttachSticker) attach).b;
                    return attachSticker;
                }
                if (attach instanceof AttachRoom) {
                    AttachRoom attachRoom = new AttachRoom((AttachRoom) attachWithId);
                    attachRoom.d = ((AttachRoom) attach).d;
                    return attachRoom;
                }
                Attach copy = attachWithId.copy();
                copy.m0(attach.xb());
                return copy;
            case 20:
                ((zak0) ((sjg0) this.c).q).setValue((String) obj);
                return s3q0.a;
            case 21:
                a2e0 a2e0Var = (a2e0) this.c;
                a2e0Var.b((io.reactivex.rxjava3.disposables.c) obj);
                a2e0Var.c(300L);
                return s3q0.a;
            case 22:
                l1w0 l1w0Var = (l1w0) this.c;
                Throwable th2 = (Throwable) obj;
                xgx0.a.getClass();
                xgx0.d(th2);
                l1w0Var.a(th2);
                return s3q0.a;
            case 23:
                ksh0.b bVar = (ksh0.b) obj;
                if ((((csh0) this.c).d.d.i || bVar.b.b.length() > 0) && bVar.c != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 24:
                ((l7l0) this.c).e = (StickerStockItem) obj;
                return s3q0.a;
            case 25:
                mkl0 mkl0Var = (mkl0) this.c;
                it80.a aVar = it80.b;
                MarketStorefrontViewedProductsDto C = ((MarketGetStorefrontResponseDto) obj).C();
                mpl0 f = C != null ? mkl0Var.b.f(C) : null;
                aVar.getClass();
                return new it80(f);
            case 26:
                Collection<z4m0> collection = (Collection) this.c;
                SQLiteStatement g = ((e0w) obj).g("\n            INSERT OR REPLACE INTO stories_info(owner_id, story_state, last_updated_ttl)\n            VALUES(?,?,?)\n            ");
                try {
                    for (z4m0 z4m0Var : collection) {
                        g.bindLong(1, z4m0Var.a.b);
                        g.bindLong(2, z4m0Var.b.h());
                        g.bindLong(3, z4m0Var.c);
                        g.executeInsert();
                    }
                    s3q0 s3q0Var = s3q0.a;
                    g.close();
                    return s3q0.a;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        ro.e(g, th3);
                        throw th4;
                    }
                }
            case 27:
                gzs<s3q0> gzsVar = ((StoryGalleryPickerPreviewViewNew) this.c).d;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 28:
                ((com.vk.superapp.ui.a) this.c).b.xo((ProfileNavigationInfo.SecurityRecommendationIndicator) obj);
                return s3q0.a;
            default:
                ThemedFeedToolbarFragment themedFeedToolbarFragment = (ThemedFeedToolbarFragment) this.c;
                int i2 = ThemedFeedToolbarFragment.a0;
                themedFeedToolbarFragment.s();
                return s3q0.a;
        }
    }
}
