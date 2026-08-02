package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog2.feature.music.holders.MusicCatalogErrorRedesignedStateVh;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.draftslist.impl.ui.DraftsListFragment;
import com.vk.dto.money.MoneyGetCardsResult;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.commands.contacts.ContactsSearchCmd;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vk.log.L;
import com.vk.money.createtransfer.people.CreatePeopleTransferPresenter;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.ivm.a;
import com.vk.voip.miniapps.impl.picture_in_picture.overlay.MiniAppCallPiPOverlayService;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.c99;
import xsna.cm70;
import xsna.cs00;
import xsna.f3t.c;
import xsna.fcw;
import xsna.fd50;
import xsna.gcw;
import xsna.m610;
import xsna.mcz;
import xsna.ndw;
import xsna.p7y;
import xsna.pdg0;
import xsna.qn60;
import xsna.sdo;
import xsna.tj50;
import xsna.xcj;
import xsna.ytm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wcj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wcj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        c99 c99Var = null;
        switch (this.b) {
            case 0:
                fcw.a aVar = (fcw.a) this.c;
                ContactsSearchCmd.c cVar = (ContactsSearchCmd.c) obj;
                return new gcw.a(j5g.D0(new xcj.a(), cVar.a.values()), new ImSearchLocalRequestLoggingInfo(aVar.a, aVar.c, cVar.b, 0, aVar.d, null, 0, false, 232, null));
            case 1:
                ((zak0) ((rfj) this.c).l).setValue((String) obj);
                return s3q0.a;
            case 2:
                CreatePeopleTransferPresenter createPeopleTransferPresenter = (CreatePeopleTransferPresenter) this.c;
                MoneyGetCardsResult moneyGetCardsResult = (MoneyGetCardsResult) obj;
                createPeopleTransferPresenter.f = moneyGetCardsResult;
                createPeopleTransferPresenter.u(moneyGetCardsResult.c);
                createPeopleTransferPresenter.o.Go(createPeopleTransferPresenter.f);
                return s3q0.a;
            case 3:
                dcm dcmVar = (dcm) this.c;
                izv izvVar = dcmVar.e;
                ConcurrentHashMap.KeySetView<Long, Boolean> keySetView = dcmVar.g;
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof p980) {
                    Iterator it = ((p980) sxpVar).d.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        long longValue = ((Number) entry.getKey()).longValue();
                        Collection collection = (Collection) entry.getValue();
                        if (keySetView.contains(Long.valueOf(longValue))) {
                            pdg0 a = izvVar.a(dcmVar, new k0c(collection));
                            if (a instanceof pdg0.a) {
                                pdg0.a.C3506a c3506a = ((pdg0.a) a).a;
                                obj3 = Boolean.FALSE;
                            } else {
                                if (!(a instanceof pdg0.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                obj3 = ((pdg0.b) a).a;
                            }
                            if (((Boolean) obj3).booleanValue()) {
                                dcmVar.f(longValue);
                            }
                        }
                    }
                } else if (sxpVar instanceof e980) {
                    e980 e980Var = (e980) sxpVar;
                    if (keySetView.contains(Long.valueOf(e980Var.d))) {
                        pdg0 a2 = izvVar.a(dcmVar, new k0c(e980Var.e));
                        if (a2 instanceof pdg0.a) {
                            pdg0.a.C3506a c3506a2 = ((pdg0.a) a2).a;
                            obj2 = Boolean.FALSE;
                        } else {
                            if (!(a2 instanceof pdg0.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            obj2 = ((pdg0.b) a2).a;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            dcmVar.f(e980Var.d);
                        }
                    }
                } else if (sxpVar instanceof OnCacheInvalidateEvent) {
                    dcmVar.f.clear();
                    Iterator<Long> it2 = keySetView.iterator();
                    while (it2.hasNext()) {
                        dcmVar.e(20, it2.next().longValue());
                    }
                }
                return s3q0.a;
            case 4:
                aqm aqmVar = (aqm) this.c;
                w2w w2wVar = aqmVar.d;
                w2wVar.I0().b().c().r(-1);
                w2wVar.I0().b().a().a(aqmVar.c);
                return s3q0.a;
            case 5:
                ((fum) this.c).O(new ytm.e0((Set) obj));
                return s3q0.a;
            case 6:
                e4n e4nVar = (e4n) this.c;
                q1n v = e4nVar.v();
                DiscoverId discoverId = ((t4n) e4nVar.b.getCurrentState()).c;
                NewsEntriesContainer newsEntriesContainer = e4nVar.k;
                NewsEntriesContainer a3 = ((x960) obj).a();
                v.getClass();
                List<NewsEntry> list = a3.c;
                if (!list.isEmpty()) {
                    v.b.getClass();
                    newsEntriesContainer = new NewsEntriesContainer(a3.b, list);
                    n1n.e(discoverId, newsEntriesContainer);
                }
                e4nVar.k = newsEntriesContainer;
                return s3q0.a;
            case 7:
                NewsEntriesContainer newsEntriesContainer2 = (NewsEntriesContainer) this.c;
                qn60.c cVar2 = (qn60.c) obj;
                return new f9n(cVar2.a, cVar2.b, newsEntriesContainer2.c, newsEntriesContainer2.b.b, null, null);
            case 8:
                DraftsListFragment draftsListFragment = (DraftsListFragment) this.c;
                qcy<Object>[] qcyVarArr = DraftsListFragment.Q;
                draftsListFragment.fo().b((sdo.g) obj);
                return s3q0.a;
            case 9:
                a.f fVar = (a.f) this.c;
                EditorState editorState = (EditorState) obj;
                List<EditorState.b> list2 = editorState.d;
                Map<f5p, g5p> map = editorState.b;
                if (epx.f(map, editorState.c.c)) {
                    return editorState;
                }
                EditorState.b bVar = new EditorState.b(editorState.a, fVar.a, pn00.t(map));
                List arrayList = editorState.b() == list2.size() - 1 ? new ArrayList(list2) : new ArrayList(list2).subList(0, editorState.b() + 1);
                arrayList.add(bVar);
                return EditorState.a(editorState, null, null, bVar, arrayList, EditorMessage.Source.Synthetic, null, null, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);
            case 10:
                dpp dppVar = (dpp) this.c;
                return dppVar.x.a(dppVar.requireContext(), (String) obj);
            case 11:
                Object obj4 = ((b2q) this.c).o;
                ((d2q) (obj4 != null ? obj4 : null)).E0();
                return s3q0.a;
            case 12:
                lyr lyrVar = (lyr) this.c;
                List list3 = (List) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((b0s) it3.next()).d);
                }
                lyrVar.g = arrayList2;
                return s3q0.a;
            case 13:
                return Boolean.valueOf(((String) obj).length() == 0 && ((Boolean) ((fws) this.c).j.invoke()).booleanValue());
            case 14:
                return ((f3t) this.c).new c((ViewGroup) obj);
            case 15:
                r7t r7tVar = (r7t) this.c;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                String str = r7tVar.g;
                if (str != null) {
                    qgi0.h(tgi0Var, str);
                }
                return s3q0.a;
            case 16:
                ((qdw) this.c).d.onNext(new ndw.a((Map) obj));
                return s3q0.a;
            case 17:
                pjx pjxVar = (pjx) ((tjx) this.c).d.getValue();
                pjxVar.getClass();
                return new zjx(((tj50.a) obj).a(new qjx(1, pjxVar, pjx.class, "mapQuestionnaireUIModel", "mapQuestionnaireUIModel(Lcom/vk/clips/internal/nps/impl/feature/common/InternalNpsState$Content;)Lcom/vk/clips/internal/nps/impl/view/models/QuestionnaireUIModel;", 0), ao8.d));
            case 18:
                JSONObject jSONObject = (JSONObject) this.c;
                ((p7y.a) obj).getClass();
                jSONObject.put("result", false);
                return jSONObject;
            case 19:
                m99 m99Var = (m99) this.c;
                mcz mczVar = (mcz) obj;
                if (!mczVar.equals(mcz.b.a)) {
                    if (mczVar instanceof mcz.a) {
                        c99Var = new c99.f(((mcz.a) mczVar).a);
                    } else if (mczVar instanceof mcz.f) {
                        c99Var = new c99.c0(true, ((mcz.f) mczVar).a);
                    } else if (mczVar instanceof mcz.c) {
                        c99Var = new c99.i(((mcz.c) mczVar).a);
                    } else if (mczVar.equals(mcz.h.a)) {
                        c99Var = c99.h0.a;
                    } else if (mczVar instanceof mcz.e) {
                        c99Var = new c99.o0(((mcz.e) mczVar).a);
                    } else if (mczVar instanceof mcz.d) {
                        c99Var = new c99.l(((mcz.d) mczVar).a);
                    } else if (mczVar.equals(mcz.i.a)) {
                        c99Var = c99.k0.a;
                    } else {
                        if (!(mczVar instanceof mcz.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c99Var = new c99.p(((mcz.g) mczVar).a);
                    }
                }
                if (c99Var != null) {
                    m99Var.b(c99Var);
                }
                return s3q0.a;
            case 20:
                return CatalogSectionState.a((CatalogSectionState) obj, (ArrayList) ((wxm) this.c).b, false, false, null, null, false, null, null, null, null, 8187);
            case 21:
                ds00 ds00Var = (ds00) this.c;
                m610 m610Var = (m610) obj;
                if (m610Var instanceof m610.a) {
                    ds00Var.a(new cs00.k(((m610.a) m610Var).a));
                }
                if (m610Var instanceof m610.b) {
                    m610.b bVar2 = (m610.b) m610Var;
                    ds00Var.a(new cs00.a(bVar2.a, bVar2.b, bVar2.c));
                }
                return s3q0.a;
            case 22:
                MasksWrap masksWrap = (MasksWrap) this.c;
                Throwable th = (Throwable) obj;
                int i = MasksWrap.e0;
                L.g("MasksWrap", th);
                masksWrap.l(null, th);
                return s3q0.a;
            case 23:
                MiniAppCallPiPOverlayService miniAppCallPiPOverlayService = (MiniAppCallPiPOverlayService) this.c;
                int i2 = MiniAppCallPiPOverlayService.e;
                miniAppCallPiPOverlayService.stopSelf();
                return s3q0.a;
            case 24:
                return (xl30) this.c;
            case 25:
                ((MusicCatalogErrorRedesignedStateVh) this.c).i.invoke();
                Activity h = e3m.h((Context) obj);
                if (h != null) {
                    ((BridgeComponent) m7m.a(h).a(fpf0.a(BridgeComponent.class))).Le().N(h);
                }
                return s3q0.a;
            case 26:
                ((qu40) this.c).d.getClass();
                Object k0 = j5g.k0(((MusicPickerState) obj).j);
                MusicPickerList.SelectedPlaylist selectedPlaylist = k0 instanceof MusicPickerList.SelectedPlaylist ? (MusicPickerList.SelectedPlaylist) k0 : null;
                if (selectedPlaylist != null) {
                    return selectedPlaylist.c;
                }
                return null;
            case 27:
                ib50 ib50Var = (ib50) obj;
                ((pc50) this.c).T(new fd50.b(ib50Var.b, ib50Var.a.J));
                return s3q0.a;
            case 28:
                cm70 cm70Var = (cm70) this.c;
                cm70.a aVar2 = (cm70.a) obj;
                if (aVar2 instanceof cm70.a.b) {
                    Context context = cm70Var.a.getContext();
                    ExternalNpsCondition externalNpsCondition = ((cm70.a.b) aVar2).a;
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.clips_nps_survey_uploading_show);
                    View view = cm70Var.d;
                    view.setVisibility(0);
                    view.startAnimation(loadAnimation);
                    cm70Var.b.b(externalNpsCondition);
                    bwt0.i0(cm70Var.e, new com.vk.video.ui.discovery.minimizable.related_videos.j(cm70Var, context, externalNpsCondition, 6));
                    bwt0.i0(cm70Var.f, new v74(22, cm70Var, context));
                }
                return s3q0.a;
            default:
                VerificationMethodTypes verificationMethodTypes = (VerificationMethodTypes) obj;
                Object obj5 = ((vl90) this.c).o;
                ((tl90) (obj5 != null ? obj5 : null)).b(verificationMethodTypes);
                return s3q0.a;
        }
    }
}
