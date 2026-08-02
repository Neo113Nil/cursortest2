package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.Lifecycle;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackHorizontalPreviewListItemVh;
import com.vk.clips.design.view.filter.FiltersRecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dzenarticle.impl.domain.DzenArticle;
import com.vk.dzenarticle.impl.domain.ReadStatState;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.dzenarticle.impl.ui.store.DzenArticleInlineActor;
import com.vk.editor.filters.correction.model.FilterType;
import com.vk.feed.core.models.feedback.ButtonsFeedback;
import com.vk.feed.core.models.feedback.StarsFeedback;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.im.channelcreation.impl.g;
import com.vk.im.channelcreation.impl.j;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.log.L;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.b;
import com.vk.superapp.core.js.bridge.api.events.CallAPIMethod$Parameters;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import com.vk.voip.ui.broadcast.list.ui.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.c2r;
import xsna.chz;
import xsna.drz;
import xsna.edt;
import xsna.gm50;
import xsna.ikv0;
import xsna.kx30;
import xsna.ltg;
import xsna.ph;
import xsna.sum0;
import xsna.us2;
import xsna.uxd0;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class lh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lh(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        chz.b bVar;
        String str;
        ViewGroup viewGroup;
        int i = this.b;
        int i2 = 5;
        int i3 = 14;
        int i4 = 1;
        int i5 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ph phVar = (ph) obj3;
                bqh0 bqh0Var = (bqh0) obj2;
                qcy<Object>[] qcyVarArr = ph.n1;
                yzt0<List<hfz>> yzt0Var = ((b.a.C1766a) obj).a;
                ph.f fVar = new ph.f(1, bqh0Var, bqh0.class, "setItems", "setItems(Ljava/util/List;)V", 0);
                phVar.getClass();
                gm50.a.a(phVar, yzt0Var, fVar);
                bqh0Var.b(bqh0Var.d);
                return s3q0.a;
            case 1:
                chz chzVar = (chz) obj3;
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj2;
                if (((Lifecycle.Event) obj) == Lifecycle.Event.ON_RESUME) {
                    chzVar.getClass();
                    ((zak0) chzVar.d).setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
                    accessibilityManager.addAccessibilityStateChangeListener(chzVar);
                    chz.c cVar = chzVar.e;
                    if (cVar != null) {
                        ((zak0) cVar.b).setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                        accessibilityManager.addTouchExplorationStateChangeListener(cVar);
                    }
                    if (Build.VERSION.SDK_INT >= 33 && (bVar = chzVar.f) != null) {
                        ((zak0) bVar.a).setValue(Boolean.valueOf(chz.c(accessibilityManager)));
                        ((zak0) bVar.b).setValue(Boolean.valueOf(chz.h(accessibilityManager)));
                        chz.a.a(accessibilityManager, tw5.b(bVar));
                    }
                }
                return s3q0.a;
            case 2:
                e28 e28Var = (e28) obj3;
                e28Var.i.setSelected(false);
                e28Var.j.setSelected(true);
                e28Var.k.setSelected(false);
                e28Var.b.setVisibility(8);
                e28Var.c.setVisibility(0);
                e28Var.d.setVisibility(8);
                ((c5p) obj2).b(CollageStatEvent.i.a);
                return s3q0.a;
            case 3:
                return new xo8((bp8) obj3, (uxd0.a.InterfaceC3848a) obj, (View) obj2, i5);
            case 4:
                ((ds8) obj3).T6((ButtonsFeedback) obj2);
                return s3q0.a;
            case 5:
                String str2 = (String) obj2;
                List list = (List) obj;
                ((laa) obj3).getClass();
                switch (str2.hashCode()) {
                    case -1581161142:
                        if (str2.equals("offline_music_replacement_artist")) {
                            return j5g.D0(new qaa(i5), list);
                        }
                        break;
                    case -1529764530:
                        if (str2.equals("offline_music_replacement_name")) {
                            return j5g.D0(new paa(i5), list);
                        }
                        break;
                    case -702484208:
                        if (str2.equals("offline_music_replacement_by_user")) {
                            return j5g.D0(new saa(), list);
                        }
                        break;
                    case -189985123:
                        if (str2.equals("offline_music_replacement_added")) {
                            return j5g.D0(new raa(i5), list);
                        }
                        break;
                    case -185433675:
                        if (str2.equals("offline_music_replacement_old_first")) {
                            return j5g.y0(list);
                        }
                        break;
                    case 505811102:
                        if (str2.equals("offline_music_replacement_default")) {
                            return list;
                        }
                        break;
                }
                throw new IllegalArgumentException("Unknown replacement = ".concat(str2));
            case 6:
                return com.vk.im.channelcreation.impl.j.a((com.vk.im.channelcreation.impl.j) obj, j.a.a(((com.vk.im.channelcreation.impl.b) obj3).g().b, ((g.n) ((com.vk.im.channelcreation.impl.g) obj2)).b, null, false, 14), null, 5);
            case 7:
                w2w w2wVar = ((com.vk.im.engine.internal.longpoll.polling_tasks.socket.a) obj2).a;
                JSONObject optJSONObject = ((JSONObject) obj3).optJSONObject("unread_channels");
                if (optJSONObject == null) {
                    return s3q0.a;
                }
                int j = w2wVar.I0().system().j();
                w2wVar.I0().a().i(e43.l(new com.vk.im.engine.models.channels.a(ChannelsCounters.Type.UNREAD, optJSONObject.optInt("all"), j), new com.vk.im.engine.models.channels.a(ChannelsCounters.Type.UNREAD_UNMUTED, optJSONObject.optInt("not_muted"), j), new com.vk.im.engine.models.channels.a(ChannelsCounters.Type.ARCHIVED, optJSONObject.optInt("archived"), j)));
                return s3q0.a;
            case 8:
                ((pzw) obj).c = new m9c(i4, (h7v) obj3, (syf) obj2);
                return s3q0.a;
            case 9:
                izs izsVar = (izs) obj2;
                int intValue = ((Integer) obj).intValue();
                us2.d dVar = (us2.d) j5g.a0(((us2) obj3).b(intValue, intValue));
                if (dVar != null && (str = (String) dVar.a) != null) {
                    izsVar.invoke(new ltg.c(str));
                }
                return s3q0.a;
            case 10:
                return new kxh((ViewGroup) obj, ((Boolean) ((com.vk.movika.sdk.base.logic.interactor.h) obj3).invoke()).booleanValue(), cn70.b(16), ((fyh) obj2).i);
            case 11:
                return DzenArticleState.a((DzenArticleState) obj, (DzenArticle) obj2, ReadStatState.a(((DzenArticleState) ((DzenArticleInlineActor) obj3).b.getCurrentState()).d, System.currentTimeMillis(), false, false, false, false, false, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), DzenArticleState.LoadingState.IDLE, null, null, false, 113);
            case 12:
                Throwable th = (Throwable) obj;
                ((y2r) obj3).d().a(th);
                ((wk50.a) obj2).b(new c2r.h.a(th));
                return s3q0.a;
            case 13:
                tcr tcrVar = (tcr) obj;
                int i6 = FiltersRecyclerView.j;
                Context context = ((FiltersRecyclerView) obj2).getContext();
                Bitmap bitmap = tcrVar.b;
                FilterType filterType = tcrVar.a;
                return new Pair(filterType, ((tfr) qis0.this.n.getValue()).d(context, bitmap, ris0.a(filterType)));
            case 14:
                kzr kzrVar = (kzr) obj3;
                kx30.a aVar = (kx30.a) obj;
                if (epx.f(kzrVar.e, (CharSequence) obj2)) {
                    io.reactivex.rxjava3.subjects.d<drz.a<xrm>> dVar2 = kzrVar.b;
                    DialogsHistory dialogsHistory = new DialogsHistory(i5, 31);
                    dialogsHistory.k().addAll(aVar.c.values());
                    dVar2.onNext(new drz.a<>(new xrm(dialogsHistory, j5g.S0(aVar.c.keySet()), null, null, 12), false));
                    kzrVar.e = null;
                }
                return s3q0.a;
            case 15:
                kts ktsVar = (kts) obj2;
                List list2 = (List) obj3;
                List<UsersUserFullDto> list3 = (List) obj;
                j2r0 j2r0Var = ktsVar.t;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                for (UsersUserFullDto usersUserFullDto : list3) {
                    j2r0Var.getClass();
                    arrayList.add(j2r0.a(usersUserFullDto));
                }
                ktsVar.i(j5g.u0(arrayList, list2));
                return s3q0.a;
            case 16:
                adt adtVar = (adt) obj;
                ((xbt) obj3).T(new edt.f.i(vdt.a(adtVar.c), adtVar.e, adtVar.d, (GamesCatalogScreenTab) obj2));
                return s3q0.a;
            case 17:
                ((AvatarView) obj).X0((Dialog) obj3, (ProfilesSimpleInfo) obj2);
                return s3q0.a;
            case 18:
                ((p3y) obj3).X0().a(((JSONObject) obj).optString("response"), ((CallAPIMethod$Parameters) obj2).e());
                return s3q0.a;
            case 19:
                q640 q640Var = (q640) obj3;
                prq0 prq0Var = (prq0) obj2;
                q640Var.f = (etv0) obj;
                bpn0 bpn0Var = p640.a;
                SharedPreferences.Editor edit = ((SharedPreferences) bpn0Var.getValue()).edit();
                edit.putInt("shown_count", ((SharedPreferences) bpn0Var.getValue()).getInt("shown_count", 0) + 1);
                edit.apply();
                if (((SharedPreferences) bpn0Var.getValue()).getInt("shown_count", 0) >= 3) {
                    q640Var.b.b(HintId.INFO_VIDEO_SELECT_TOOLTIP_AUDIO_TRACK.getId());
                    SharedPreferences.Editor edit2 = ((SharedPreferences) bpn0Var.getValue()).edit();
                    edit2.putInt("shown_count", 0);
                    edit2.apply();
                }
                prq0Var.invoke();
                return s3q0.a;
            case 20:
                ix80 ix80Var = (ix80) obj3;
                hx80 hx80Var = (hx80) obj2;
                g47 g47Var = (g47) obj;
                l370.o(g47Var, new gd0(i3, hx80Var, ix80Var), f9t.z(ix80Var), new zb60(hx80Var, i2));
                l370.n(g47Var, f9t.w(ix80Var), new irt(7));
                g47Var.d(new dr7(ix80Var, 1));
                return s3q0.a;
            case 21:
                int i7 = PastBroadcastsFragment.U;
                ((PastBroadcastsFragment) obj3).fo((a.b) obj, (PastBroadcastsFragment.c) obj2);
                return s3q0.a;
            case 22:
                UserId userId = (UserId) obj3;
                lec0 lec0Var = (lec0) obj2;
                Long l = (Long) obj;
                bfc0 bfc0Var = sec0.a;
                if (l != null && l.longValue() == -1) {
                    bfc0Var.getClass();
                    return new io.reactivex.rxjava3.internal.operators.single.v(new h55(bfc0Var, lec0Var, userId, i4));
                }
                bfc0Var.getClass();
                return new io.reactivex.rxjava3.internal.operators.single.v(new zec0(i5, bfc0Var, lec0Var));
            case 23:
                ((qor) obj3).post(new oc3((a4d0) obj2, ((Integer) obj).intValue()));
                return s3q0.a;
            case 24:
                ((npk0) obj3).U6((StarsFeedback) obj2);
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 25:
                wpc0 wpc0Var = (wpc0) obj;
                ((yp1) obj3).invoke(wpc0Var);
                ((l0l0) obj2).e.invoke(wpc0Var);
                return s3q0.a;
            case 26:
                StickerItem stickerItem = (StickerItem) obj2;
                n15 n15Var = ((StickerPackHorizontalPreviewListItemVh.c) obj3).c;
                if (n15Var != null) {
                    n15Var.invoke(stickerItem);
                }
                return s3q0.a;
            case 27:
                as80 as80Var = (as80) obj3;
                as80Var.a.d = false;
                ((ctl0) obj2).b.e(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, as80Var);
                L.i((Throwable) obj);
                return s3q0.a;
            case 28:
                ((izs) obj3).invoke(sum0.d.a((sum0.d) obj2, null, null, null, false, null, false, (sum0.a) obj, false, 0, null, false, false, 4031));
                return s3q0.a;
            default:
                SuperAppFragment superAppFragment = ((com.vk.superapp.ui.a) obj3).b;
                String string = ((Activity) obj2).getString(R.string.super_app_widget_hidden);
                View view = superAppFragment.getView();
                if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.error_container)) != null) {
                    ikv0.a aVar2 = new ikv0.a(viewGroup.getContext());
                    aVar2.h(new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_text_accent), (Size) null, 12));
                    aVar2.i(new ikv0.d(string, (String) null, (ikv0.d.a) null, 6));
                    aVar2.e(iah0.a(8.0f));
                    aVar2.k(3000L);
                    aVar2.c();
                    aVar2.o(viewGroup);
                }
                return s3q0.a;
        }
    }
}
