package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.widget.TextView;
import com.vk.attachpicker.impl.graffiti.presentation.GraffitiDrawingFragment;
import com.vk.attachpicker.impl.graffiti.presentation.a;
import com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView;
import com.vk.clips.design.view.filter.FiltersRecyclerView;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.design.demo.presentation.screens.ContextMenuScreenContent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.mentions.MentionProfileVO;
import com.vk.network.eventhub.api.Message;
import com.vk.network.eventhub.impl.EventHubServiceClient;
import com.vk.network.eventhub.impl.c;
import com.vk.pending.PendingGraffitiAttachment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchPeopleCatalogRootVh;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationBannerView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.aex;
import xsna.bfz;
import xsna.gm50;
import xsna.hls;
import xsna.jns;
import xsna.jw00;
import xsna.qr60;
import xsna.sbz;
import xsna.tj50;
import xsna.tlo0;
import xsna.uxo;
import xsna.xlt;
import xsna.y6u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class fgh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fgh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        StoryEntry storyEntry;
        boolean z = true;
        boolean z2 = false;
        z2 = false;
        switch (this.b) {
            case 0:
                UserId userId = ((ggh) this.c).a;
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof wxr0) {
                    z = ((wxr0) bwr0Var).a.C2();
                } else if (!(bwr0Var instanceof qwr0) && !(bwr0Var instanceof uxr0)) {
                    if (bwr0Var instanceof fyr0) {
                        z = ((fyr0) bwr0Var).a.C2();
                    } else if (bwr0Var instanceof twr0) {
                        z = epx.f(((twr0) bwr0Var).a, userId);
                    } else if (bwr0Var instanceof rwr0) {
                        z = epx.f(((rwr0) bwr0Var).a, userId);
                    } else if (!(bwr0Var instanceof pwr0)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                com.vk.core.view.components.tabs.d dVar = (com.vk.core.view.components.tabs.d) this.c;
                ((etv0) obj).b(false);
                dVar.callOnClick();
                return s3q0.a;
            case 2:
                com.vk.profile.core.scheduled_clips.h hVar = (com.vk.profile.core.scheduled_clips.h) this.c;
                if (((Boolean) obj).booleanValue()) {
                    VkPlaceholder vkPlaceholder = hVar.h;
                    vkPlaceholder.setVisibility(0);
                    vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_globe_cross_outline_56), new x7g(R.attr.vk_ui_icon_secondary), null, 12));
                    vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.community_scheduled_clips_grid_error_title)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.community_scheduled_clips_grid_error_subtitle))));
                    VkPlaceholder.a.C0857a c0857a = null;
                    vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.vk_common_retry), (gzs) new g4g(hVar, 6), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Large, VkButton.Mode.Tertiary, VkButton.Appearance.Accent, false, 284), c0857a, c0857a, 0 == true ? 1 : 0, 8));
                }
                return s3q0.a;
            case 3:
                ((r3j) this.c).l.invoke();
                return s3q0.a;
            case 4:
                ((zak0) ((ContextMenuScreenContent) this.c).h).setValue((ContextMenuScreenContent.MenuToolButtonsVariant) obj);
                return s3q0.a;
            case 5:
                scl sclVar = (scl) this.c;
                String str = ((vqt) obj).e;
                com.vk.lists.c cVar = sclVar.i;
                cVar.s(str);
                String j = cVar.j();
                if (j == null || j.length() == 0) {
                    cVar.r(false);
                }
                return s3q0.a;
            case 6:
                pjm pjmVar = (pjm) this.c;
                if (pjmVar.c()) {
                    Dialog dialog = (Dialog) pjmVar.f.invoke();
                    boolean l = com.vk.im.engine.utils.a.l(dialog, (Collection) pjmVar.g.invoke());
                    if (dialog != null && dialog.Gb() && l) {
                        pjmVar.d.D(pjmVar, new yy30(dialog.Zb()));
                    }
                }
                return s3q0.a;
            case 7:
                List list = (List) this.c;
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                List<Integer> list2 = bVar.J;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!list2.contains(Integer.valueOf(((Number) obj2).intValue()))) {
                        arrayList.add(obj2);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    return bVar;
                }
                ArrayList arrayList2 = new ArrayList(list2);
                arrayList2.addAll(arrayList);
                return com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, arrayList2, null, 0, false, false, null, null, 0, null, 0, -1, 2097147);
            case 8:
                return Boolean.valueOf(epx.f(((so4) ((one.video.player.tracks.a) ((kao) this.c).a).c).h, ((androidx.media3.common.a) obj).d));
            case 9:
                qxo qxoVar = (qxo) this.c;
                gm50.a.a(qxoVar, ((uxo.a) obj).a, new xcd(qxoVar, 18));
                return s3q0.a;
            case 10:
                return Boolean.valueOf(((Class) this.c).isInstance(((u1c0) obj).a));
            case 11:
                EventHubServiceClient eventHubServiceClient = (EventHubServiceClient) this.c;
                Message message = (Message) obj;
                try {
                    boolean m = eventHubServiceClient.m(message);
                    if (!m) {
                        xzp xzpVar = eventHubServiceClient.c;
                        if (xzpVar != null) {
                            xzpVar.e(message.c(), new IOException("WebSocket write rejected"), message);
                        }
                        eventHubServiceClient.i.a(message);
                    }
                    z2 = m;
                } catch (IOException e) {
                    com.vk.network.eventhub.impl.c cVar2 = eventHubServiceClient.q;
                    c.a.C1363a c1363a = new c.a.C1363a(e);
                    cVar2.getClass();
                    com.vk.network.eventhub.impl.c.e(c1363a);
                    xzp xzpVar2 = eventHubServiceClient.c;
                    if (xzpVar2 != null) {
                        xzpVar2.e(message.c(), e, message);
                    }
                    eventHubServiceClient.i.a(message);
                } catch (InterruptedException e2) {
                    eventHubServiceClient.i.a(message);
                    throw e2;
                } catch (Exception e3) {
                    com.vk.metrics.eventtracking.b.a.a(e3);
                    com.vk.network.eventhub.impl.c cVar3 = eventHubServiceClient.q;
                    c.a.C1364c c1364c = new c.a.C1364c(e3);
                    cVar3.getClass();
                    com.vk.network.eventhub.impl.c.e(c1364c);
                    xzp xzpVar3 = eventHubServiceClient.c;
                    if (xzpVar3 != null) {
                        xzpVar3.e(message.c(), e3, message);
                    }
                    eventHubServiceClient.i.a(message);
                }
                return Boolean.valueOf(z2);
            case 12:
                n3q n3qVar = (n3q) this.c;
                Long l2 = (Long) obj;
                if (l2 != null) {
                    n3qVar.h(l2.longValue());
                }
                return s3q0.a;
            case 13:
                tcr tcrVar = (tcr) obj;
                izs<? super tcr, s3q0> izsVar = ((FiltersRecyclerView) this.c).g;
                if (izsVar != null) {
                    izsVar.invoke(tcrVar);
                }
                return s3q0.a;
            case 14:
                Context context = (Context) this.c;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "FoldersToolbarButtonBack");
                qgi0.h(tgi0Var, context.getString(R.string.vkim_accessibility_toolbar_back_exit));
                return s3q0.a;
            case 15:
                ((gls) this.c).T(new hls.b.a((Throwable) obj));
                return s3q0.a;
            case 16:
                xms xmsVar = (xms) this.c;
                hns hnsVar = (hns) obj;
                String str2 = hnsVar.a;
                if (str2 == null) {
                    str2 = "";
                }
                xmsVar.T(new jns.d.b(new rms(str2, hnsVar.b, hnsVar.c, hnsVar.d, EmptyList.b, false, ((b25) xmsVar.i.c).d())));
                return s3q0.a;
            case 17:
                wmt wmtVar = (wmt) obj;
                ((bmt) this.c).c(new xlt.a(zp60.a));
                return new cmt(new qr60.a.g(wmtVar.a, wmtVar.b, wmtVar.d, true, false, null, null, 96));
            case 18:
                GlobalSearchPeopleCatalogRootVh globalSearchPeopleCatalogRootVh = (GlobalSearchPeopleCatalogRootVh) this.c;
                n3a n3aVar = (n3a) obj;
                if (n3aVar instanceof ap0) {
                    globalSearchPeopleCatalogRootVh.H.b(rsg0.y0(yfb.x(globalSearchPeopleCatalogRootVh.I.d(Collections.singletonList(((ap0) n3aVar).a))), null, null, 3).subscribe(new f2u(new xht(3), z2 ? 1 : 0), new g2u(new ob(29), z2 ? 1 : 0)));
                }
                return s3q0.a;
            case 19:
                k6u k6uVar = (k6u) this.c;
                Map map = (Map) obj;
                jw00 jw00Var = (jw00) map.get(jw00.a.c);
                if (jw00Var != null) {
                    k6uVar.T(new y6u.b.a(jw00Var.a()));
                }
                jw00 jw00Var2 = (jw00) map.get(jw00.c.c);
                if (jw00Var2 != null) {
                    k6uVar.T(new y6u.b.C4081b(jw00Var2.a()));
                }
                return s3q0.a;
            case 20:
                GraffitiDrawingFragment graffitiDrawingFragment = (GraffitiDrawingFragment) this.c;
                int i = GraffitiDrawingFragment.Q;
                new a.C0385a(graffitiDrawingFragment.requireContext(), (PendingGraffitiAttachment) obj).I0(null);
                return s3q0.a;
            case 21:
                HorizontalFiltersWithScrollView.f.a aVar = (HorizontalFiltersWithScrollView.f.a) this.c;
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.r(tgi0Var2, "horizontal_button_with_scroll_test_tag");
                Boolean valueOf = Boolean.valueOf(aVar.b);
                sgi0<Boolean> sgi0Var = bgi0.c;
                qcy<Object> qcyVar = bgi0.a[1];
                sgi0Var.getClass();
                tgi0Var2.a(sgi0Var, valueOf);
                return s3q0.a;
            case 22:
                qex qexVar = (qex) this.c;
                aex.a.C2538a c2538a = (aex.a.C2538a) qexVar.m;
                if (c2538a != null && (storyEntry = c2538a.d) != null) {
                    pdx pdxVar = qexVar.o;
                    Context context2 = qexVar.itemView.getContext();
                    Parcel obtain = Parcel.obtain();
                    try {
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                        Serializer.g gVar = new Serializer.g(obtain);
                        gVar.i0(storyEntry);
                        obtain.setDataPosition(0);
                        Serializer.StreamParcelable G = gVar.G(StoryEntry.class.getClassLoader());
                        obtain.recycle();
                        pdxVar.b(context2, (StoryEntry) G);
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                }
                return s3q0.a;
            case 23:
                rbz rbzVar = (rbz) this.c;
                tj50.a aVar2 = (tj50.a) obj;
                gzn gznVar = new gzn(11);
                ao8 ao8Var = ao8.d;
                return new sbz.b(aVar2.a(gznVar, ao8Var), aVar2.a(new xht(7), ao8Var), aVar2.a(new n82(rbzVar, 26), ao8Var));
            case 24:
                bfz.a aVar3 = (bfz.a) obj;
                ((dfz) this.c).c = aVar3;
                if ((aVar3 instanceof bfz.a.g) && epx.f(((bfz.a.g) aVar3).b.b, "dialogs_list_info_bar_connect_edu_chats")) {
                    ljt.a("edu_joining_ejd_chats");
                } else {
                    if (aVar3 instanceof bfz.a.d) {
                        bfz.a.d dVar2 = (bfz.a.d) aVar3;
                        if (epx.f(dVar2.b.b, "gifts_holidays")) {
                            ljt.a(dVar2.b.b);
                        }
                    }
                    if (aVar3 instanceof bfz.a.c) {
                        bfz.a.c cVar4 = (bfz.a.c) aVar3;
                        if (epx.f(cVar4.b.b, "gifts_birthdays")) {
                            List<InfoBar.Payload.GiftsBirthdays.User> list3 = ((InfoBar.Payload.GiftsBirthdays) cVar4.b.m).c;
                            if (list3.size() == 1) {
                                UserId userId2 = ((InfoBar.Payload.GiftsBirthdays.User) j5g.Y(list3)).b;
                                String valueOf2 = String.valueOf(System.currentTimeMillis());
                                UiTracker uiTracker = UiTracker.a;
                                new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BANNER, null, null, null, null, null, 62, null), valueOf2, valueOf2, null, new MobileOfficialAppsImStat$TypeImConversationBannerView("gifts_birthdays_single", userId2 != null ? Long.valueOf(userId2.b) : null), 8)).q();
                            } else {
                                ljt.a(cVar4.b.b);
                            }
                        }
                    }
                    if (aVar3 instanceof bfz.a.f) {
                        bfz.a.f fVar = (bfz.a.f) aVar3;
                        if (epx.f(fVar.b.b, "max_ad")) {
                            ljt.a(fVar.b.b);
                        }
                    }
                    if (aVar3 instanceof bfz.a.e) {
                        ljt.a(((bfz.a.e) aVar3).b.b);
                    }
                }
                return s3q0.a;
            case 25:
                LiveView liveView = (LiveView) this.c;
                Boolean bool = (Boolean) obj;
                liveView.r.setIsEmojiKeyboardVisibility(bool.booleanValue());
                boolean booleanValue = bool.booleanValue();
                flz flzVar = liveView.E;
                elz presenter = flzVar != null ? flzVar.getPresenter() : null;
                if (presenter != null) {
                    if (booleanValue) {
                        presenter.K();
                    } else {
                        presenter.x1();
                    }
                }
                liveView.u();
                liveView.d(bool.booleanValue(), true);
                return s3q0.a;
            case 26:
                MainActivity.a aVar4 = (MainActivity.a) this.c;
                aVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("pref_to_highlight", "adaptive_feed_media");
                new oz50(SettingsGeneralFragment.class, null, bundle).k(MainActivity.this);
                ((ikv0) obj).a();
                return null;
            case 27:
                return com.vk.clips.sdk.shared.item.market_ads.b.k((com.vk.clips.sdk.shared.item.market_ads.b) this.c, (mq00) obj);
            case 28:
                String str3 = (String) obj;
                TextView textView = ((MarketItemReviewsFragment) this.c).m0;
                (textView != null ? textView : null).setText(str3);
                return s3q0.a;
            default:
                MentionProfileVO mentionProfileVO = (MentionProfileVO) obj;
                c420 c420Var = ((l320) this.c).e;
                if (c420Var != null) {
                    c420Var.b(mentionProfileVO);
                }
                return s3q0.a;
        }
    }
}
