package xsna;

import android.content.Context;
import android.location.Location;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.articles.ArticleFragment;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.channels.api.Channel;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import com.vk.log.L;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vkontakte.android.fragments.messages.chat_invite.accept.ChatInviteFragment;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.ea6;
import xsna.fh8;
import xsna.gm50;
import xsna.ikv0;
import xsna.kb7;
import xsna.le8;
import xsna.lpe0;
import xsna.qv4;
import xsna.w19;
import xsna.yg8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ay0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ay0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return com.vk.clips.sdk.shared.item.ads.c.n((com.vk.clips.sdk.shared.item.ads.c) obj3, (ez0) obj);
            case 1:
                ((gg1) obj3).p.b(i.C1485i.a);
                return s3q0.a;
            case 2:
                jj1 jj1Var = ((dk1) obj3).g;
                wia0 wia0Var = (wia0) obj;
                if (wia0Var.c) {
                    jj1Var.clear();
                }
                jj1Var.n0(wia0Var.a);
                return s3q0.a;
            case 3:
                ((Integer) obj).getClass();
                gn3 gn3Var = ((ArticleAuthorPageFragment) obj3).a0;
                if (gn3Var != null) {
                    tm3.y3(gn3Var);
                }
                return s3q0.a;
            case 4:
                rp3 rp3Var = (rp3) obj3;
                Poll poll = (Poll) obj;
                if (rp3Var.d != poll.b) {
                    ArticleFragment articleFragment = rp3Var.b;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("votingId", poll.b);
                    jSONObject.put("isBoard", poll.j ? 1 : 0);
                    s3q0 s3q0Var = s3q0.a;
                    articleFragment.to("pollUpdate", jSONObject);
                }
                rp3Var.d = 0;
                return s3q0.a;
            case 5:
                zh4 zh4Var = (zh4) obj3;
                List list = (List) obj;
                if (list != null) {
                    qi4 qi4Var = zh4Var.i1;
                    if (qi4Var == null) {
                        qi4Var = null;
                    }
                    qi4Var.Uc(new ri4(2, list, null));
                } else {
                    int i2 = zh4.k1;
                }
                return s3q0.a;
            case 6:
                pv4 pv4Var = (pv4) obj3;
                if (((qv4.d) obj).i) {
                    qu4 qu4Var = pv4Var.j;
                    (qu4Var != null ? qu4Var : null).b(false);
                }
                return s3q0.a;
            case 7:
                Throwable th = (Throwable) obj;
                return ((th.getCause() instanceof ApiAccessDeniedException) && o25.b(o25.a())) ? io.reactivex.rxjava3.core.x.k(ea6.d.a.a) : ea6.d(th) ? io.reactivex.rxjava3.core.x.k(new ea6.d.c(((ea6.b) obj3).a)) : io.reactivex.rxjava3.core.x.i(th);
            case 8:
                eb7 eb7Var = (eb7) obj3;
                eb7Var.g.setVisibility(8);
                eb7Var.h.setVisibility(8);
                eb7Var.i.setVisibility(0);
                eb7Var.j.setVisibility(8);
                gm50.a.a(eb7Var, ((kb7.d) obj).a, new m7(eb7Var, 11));
                return s3q0.a;
            case 9:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((o48) obj3).g).setValue(bool);
                return s3q0.a;
            case 10:
                ((ke8) obj3).b(le8.f.a);
                return s3q0.a;
            case 11:
                yg8 yg8Var = (yg8) obj;
                ((sg8) obj3).getClass();
                if (yg8Var instanceof yg8.b) {
                    obj2 = fh8.d.b.a;
                } else {
                    if (!(yg8Var instanceof yg8.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = fh8.d.a.a;
                }
                return new it80(obj2);
            case 12:
                ((o29) obj3).b.invoke(w19.d.b);
                return s3q0.a;
            case 13:
                va9 va9Var = (va9) obj3;
                w5w0 w5w0Var = (w5w0) obj;
                if (!epx.f(w5w0Var, va9.r)) {
                    va9Var.a(w5w0Var, false);
                }
                return s3q0.a;
            case 14:
                String str = (String) obj;
                izs<lpe0, s3q0> actionListener = ((r3a) obj3).getActionListener();
                if (actionListener != null) {
                    actionListener.invoke(new lpe0.b(str));
                }
                return s3q0.a;
            case 15:
                ((e3a) ((m6a) obj3).b).getClass();
                return e3a.b((CatalogCatalogResponseObjectDto) obj);
            case 16:
                ((tba) obj3).c();
                return s3q0.a;
            case 17:
                return Boolean.valueOf(epx.f(((UIBlock) obj).b, ((ltf0) ((n3a) obj3)).a));
            case 18:
                ((com.vk.catalog2.common.ui.mvp.util.a) obj3).i = null;
                return s3q0.a;
            case 19:
                ((z37) obj3).b((fja) obj);
                return s3q0.a;
            case 20:
                wxa wxaVar = (wxa) obj3;
                wxaVar.e.b(io.reactivex.rxjava3.kotlin.c.e(rsg0.W(yfb.x(wxaVar.c.d(new UserId(((Channel) obj).A.b))), 7), new xd8(L.a, 1), new m7(wxaVar, 22)));
                return s3q0.a;
            case 21:
                return bdb.a((bdb) obj, 0, 0, 0, 0, 0, 0, null, null, null, false, false, (ChannelNotificationsSettings) obj3, null, 0, null, null, null, null, null, null, null, null, null, false, false, -16385, 7);
            case 22:
                bsb bsbVar = (bsb) obj3;
                Long l = (Long) obj;
                ChatInviteFragment.b bVar = bsbVar.o;
                if (bVar != null) {
                    bVar.a(l.longValue());
                }
                ChatInviteFragment.b bVar2 = bsbVar.o;
                if (bVar2 != null) {
                    bVar2.b();
                }
                return s3q0.a;
            case 23:
                ClickableSticker clickableSticker = (ClickableSticker) obj3;
                b.d dVar = (b.d) obj;
                if (clickableSticker != null) {
                    dVar.b(clickableSticker.zb().zb(), "clickable_sticker");
                }
                return s3q0.a;
            case 24:
                ((gzs) obj3).invoke();
                return s3q0.a;
            case 25:
                return ((Boolean) obj).booleanValue() ? io.reactivex.rxjava3.internal.operators.completable.i.b : ((qge) obj3).a.a();
            case 26:
                ((fef) obj3).a.getLogger().a("ClipsUploadControllerImpl", (Throwable) obj);
                return s3q0.a;
            case 27:
                jpg jpgVar = (jpg) obj3;
                ((Boolean) obj).getClass();
                jpgVar.a.detach();
                jpgVar.b.invoke(new CommunityProfileAction.e.g.a(null));
                return s3q0.a;
            case 28:
                mbh mbhVar = (mbh) obj3;
                Location location = (Location) obj;
                mbhVar.e = location;
                mbhVar.c.po(location);
                return s3q0.a;
            default:
                rmh rmhVar = (rmh) obj3;
                Context context = rmhVar.a;
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = ikv0.c.f.a;
                aVar.u = new ikv0.d(context.getString(R.string.community_add_description_saved), (String) null, (ikv0.d.a) null, 6);
                aVar.k = 1;
                pkv0.g(aVar, 300L);
                rmhVar.e.invoke(new CommunityProfileAction.o(false));
                return s3q0.a;
        }
    }

    public /* synthetic */ ay0(com.vk.catalog2.common.ui.mvp.util.a aVar, wha whaVar) {
        this.b = 18;
        this.c = aVar;
    }

    public /* synthetic */ ay0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
