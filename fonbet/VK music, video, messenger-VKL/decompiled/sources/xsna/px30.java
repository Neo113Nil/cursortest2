package xsna;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.Gson;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.notifications.dto.NotificationsGetRedesignSettingResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationRedesignDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingHintDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsItemDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.api.generated.notifications.dto.NotificationsUnifiedNotificationDto;
import com.vk.api.generated.questions.dto.QuestionsQuestionDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal;
import com.vk.auth.modal.qrwithcode.b;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.catalog2.feature.music.holders.MusicFollowOwnerButtonVh;
import com.vk.catalog2.feature.music.holders.RadioStationCellVh;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.unknown.NotFoundClipsFragment;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.ads.PixelStats;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.ui.components.common.DndPeriodAndSound;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.c;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.e;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bmc0;
import xsna.cf70;
import xsna.d5c0;
import xsna.gi80;
import xsna.gm50;
import xsna.ikv0;
import xsna.k840;
import xsna.kb70;
import xsna.ria0;
import xsna.xn50;
import xsna.xrb0;
import xsna.yo60;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class px30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ px30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.util.Size, java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v20 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto;
        NotificationsNotificationRedesignDto f;
        ArrayList arrayList;
        List<NotificationsNotificationSettingOptionsItemDto> d;
        String str;
        List<NotificationsNotificationSettingOptionsItemDto> d2;
        String str2;
        NotificationsNotificationSettingHintDto notificationsNotificationSettingHintDto;
        NotificationsNotificationSettingHintDto d3;
        NotificationsNotificationSettingHintDto d4;
        NotificationsUnifiedNotificationDto e;
        int i = this.b;
        int i2 = 12;
        kb70.d dVar = 0;
        dVar = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                rx30 rx30Var = (rx30) obj2;
                int i3 = krr0.q;
                return new krr0(rx30Var.i.inflate(R.layout.vkim_global_peer_list_item, (ViewGroup) obj, false), rx30Var.h);
            case 1:
                ((etv0) obj).b(false);
                ((q640) obj2).d.invoke();
                return s3q0.a;
            case 2:
                ((MusicFollowOwnerButtonVh) obj2).f = null;
                return s3q0.a;
            case 3:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                za20 za20Var = (za20) obj;
                bn40.g(iy4.class.getSimpleName(), "event: ", qjg.a(za20Var));
                if (za20Var instanceof bb20) {
                    bn40.f("MusicMessageQueue", "queue started");
                    gzs gzsVar = (gzs) ref$ObjectRef.element;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                    ref$ObjectRef.element = null;
                } else {
                    if (!(za20Var instanceof ab20)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    for (n450 n450Var : ((ab20) za20Var).a) {
                        r5v0 r5v0Var = k840.a.h;
                        if (r5v0Var == null) {
                            r5v0Var = null;
                        }
                        r5v0Var.b(n450Var);
                    }
                }
                return s3q0.a;
            case 4:
                fr40 fr40Var = (fr40) obj2;
                int i4 = fr40.j1;
                yzt0<xh80> yzt0Var = ((gi80.a) obj).a;
                kh80 kh80Var = fr40Var.i1;
                gm50.a.a(fr40Var, yzt0Var, new m8(1, kh80Var == null ? null : kh80Var, kh80.class, "render", "render(Lcom/vk/music/bottomsheets/onboarding/presentation/OnboardingState;)V", 0, 5));
                return s3q0.a;
            case 5:
                return w060.b0((bi20) obj2, (MusicTrack) obj, null, 12);
            case 6:
                ((o660) obj2).b.invoke(new zxd0.p((DndPeriodAndSound) obj));
                return s3q0.a;
            case 7:
                sg60 sg60Var = (sg60) obj2;
                x960 x960Var = (x960) obj;
                LinkedHashSet c = sg60Var.j.b.c();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : c) {
                    if (obj3 instanceof NewsEntry) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                arrayList3.addAll(x960Var.a().c);
                o1n o1nVar = sg60Var.f;
                DiscoverId discoverId = ((xf60) sg60Var.b.getCurrentState()).g;
                NewsEntriesContainer newsEntriesContainer = new NewsEntriesContainer(x960Var.a().b, arrayList3);
                o1nVar.getClass();
                n1n.e(discoverId, newsEntriesContainer);
                return s3q0.a;
            case 8:
                int i5 = NotFoundClipsFragment.N;
                g620.f().a().i(((View) obj).getContext(), fpf0.a(ClipFeedTab.TopVideo.class), null);
                ((NotFoundClipsFragment) obj2).finish();
                return s3q0.a;
            case 9:
                qe70 qe70Var = (qe70) obj2;
                NotificationsGetRedesignSettingResponseDto notificationsGetRedesignSettingResponseDto = (NotificationsGetRedesignSettingResponseDto) obj;
                NotificationsNotificationSettingRedesignDto i6 = notificationsGetRedesignSettingResponseDto.i();
                if (i6 != null) {
                    NotificationsNotificationSettingRedesignDto i7 = notificationsGetRedesignSettingResponseDto.i();
                    if (i7 == null || (d3 = i7.d()) == null) {
                        notificationsNotificationSettingHintDto = null;
                    } else {
                        NotificationsNotificationSettingRedesignDto i8 = notificationsGetRedesignSettingResponseDto.i();
                        notificationsNotificationSettingHintDto = NotificationsNotificationSettingHintDto.a(d3, (i8 == null || (d4 = i8.d()) == null || (e = d4.e()) == null) ? null : ci70.a(e));
                    }
                    notificationsNotificationSettingRedesignDto = NotificationsNotificationSettingRedesignDto.a(i6, null, notificationsNotificationSettingHintDto, null, 239);
                } else {
                    notificationsNotificationSettingRedesignDto = null;
                }
                cf70.b bVar = cf70.b.b;
                if (notificationsNotificationSettingRedesignDto == null) {
                    qe70Var.T(bVar);
                    return s3q0.a;
                }
                if (notificationsNotificationSettingRedesignDto.i() != null) {
                    NotificationsNotificationSettingOptionsDto i9 = notificationsNotificationSettingRedesignDto.i();
                    if (i9 != null && (d2 = i9.d()) != null) {
                        List<NotificationsNotificationSettingOptionsItemDto> list = d2;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                try {
                                    str2 = ((NotificationsNotificationSettingOptionsItemDto) it.next()).getId();
                                } catch (Throwable unused) {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                }
                            }
                        }
                    }
                    qe70Var.T(bVar);
                    return s3q0.a;
                }
                if (notificationsNotificationSettingRedesignDto.j() != null) {
                    NotificationsNotificationSettingOptionsDto j = notificationsNotificationSettingRedesignDto.j();
                    if (j != null && (d = j.d()) != null) {
                        List<NotificationsNotificationSettingOptionsItemDto> list2 = d;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                try {
                                    str = ((NotificationsNotificationSettingOptionsItemDto) it2.next()).getId();
                                } catch (Throwable unused2) {
                                    str = null;
                                }
                                if (str != null) {
                                }
                            }
                        }
                    }
                    qe70Var.T(bVar);
                    return s3q0.a;
                }
                NotificationsNotificationSettingHintDto d5 = notificationsNotificationSettingRedesignDto.d();
                if (d5 != null && (f = d5.f()) != null) {
                    Gson gson = new Gson();
                    List<UsersUserDto> g = notificationsGetRedesignSettingResponseDto.g();
                    List<GroupsGroupFullDto> e2 = notificationsGetRedesignSettingResponseDto.e();
                    if (e2 != null) {
                        List<GroupsGroupFullDto> list3 = e2;
                        arrayList = new ArrayList(c5g.u(list3, 10));
                        Iterator<T> it3 = list3.iterator();
                        while (it3.hasNext()) {
                            arrayList.add((GroupsGroupDto) gson.fromJson(gson.toJson((GroupsGroupFullDto) it3.next()), GroupsGroupDto.class));
                        }
                    } else {
                        arrayList = null;
                    }
                    dVar = new la70(new x970(g, arrayList, null, notificationsGetRedesignSettingResponseDto.f(), notificationsGetRedesignSettingResponseDto.j(), null, notificationsGetRedesignSettingResponseDto.d(), null, null, null), qe70Var.h, null).e(f);
                }
                qe70Var.T(new cf70.a(notificationsNotificationSettingRedesignDto, dVar));
                return s3q0.a;
            case 10:
                return ezf.c((VkAuthValidatePhoneResult) obj, (CodeState) obj2);
            case 11:
                com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a aVar = (com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a) obj2;
                pyp0 pyp0Var = (pyp0) obj;
                aVar.getClass();
                if (pyp0Var instanceof com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a) {
                    com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a aVar2 = (com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a) pyp0Var;
                    i880 i880Var = aVar2.j;
                    Integer valueOf = i880Var != null ? Integer.valueOf(i880Var.c) : null;
                    i880 i880Var2 = aVar.j;
                    if (epx.f(valueOf, i880Var2 != null ? Integer.valueOf(i880Var2.c) : null)) {
                        i880 i880Var3 = aVar2.j;
                        UserId userId = i880Var3 != null ? i880Var3.b : null;
                        i880 i880Var4 = aVar.j;
                        if (epx.f(userId, i880Var4 != null ? i880Var4.b : null)) {
                            r3 = true;
                        }
                    }
                }
                return Boolean.valueOf(r3);
            case 12:
                ji80 ji80Var = (ji80) obj2;
                int i10 = ji80.n1;
                xrb0.c cVar = xrb0.c.b;
                ji80Var.getClass();
                xn50.a.c(ji80Var, cVar);
                return s3q0.a;
            case 13:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b bVar2 = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b) obj2;
                bVar2.T(new c.d((Throwable) obj));
                bVar2.g.b(e.a.a);
                return s3q0.a;
            case 14:
                VkButton vkButton = ((u1a0) obj2).l1;
                (vkButton != null ? vkButton : null).setLoading(true);
                return s3q0.a;
            case 15:
                y3a0 y3a0Var = (y3a0) ((x3a0) obj2).a;
                if (y3a0Var != null) {
                    y3a0Var.S(true);
                }
                return s3q0.a;
            case 16:
                qia0 qia0Var = (qia0) obj2;
                gm50.a.a(qia0Var, ((ria0.a) obj).a, new zb60(qia0Var, 9));
                return s3q0.a;
            case 17:
                ala0 ala0Var = (ala0) obj2;
                ((zak0) ala0Var.j).setValue((PictureRadius) ala0Var.e.get((String) obj));
                return s3q0.a;
            case 18:
                return Boolean.valueOf(!((mqa0) obj2).d.a.contains((UUID) ((PixelStats) obj).e.getValue()));
            case 19:
                hya0 hya0Var = (hya0) obj2;
                String str3 = (String) obj;
                if (str3 != null) {
                    hya0Var.b.invoke(str3);
                }
                return s3q0.a;
            case 20:
                ((l6c0) obj2).c(new d5c0.a(new yo60.g.a((Throwable) obj)));
                return s3q0.a;
            case 21:
                j7c0 j7c0Var = (j7c0) obj;
                j7c0 a = j7c0.a(j7c0Var, ChannelMsgSendConfig.a(j7c0Var.a, null, false, false, false, false, null, null, null, null, false, false, false, false, null, 24543), null, null, null, false, 28);
                ((com.vk.channels.impl.post_settings.b) obj2).s(a.a, null);
                return a;
            case 22:
                PendingDocumentAttachment pendingDocumentAttachment = (PendingDocumentAttachment) obj;
                z84 z84Var = ((scc0) obj2).f;
                return Boolean.valueOf(z84Var == null || !z84Var.g0(pendingDocumentAttachment));
            case 23:
                int intValue = ((Integer) obj).intValue();
                Context context = ((ikc0) obj2).c.getContext();
                if (context != null) {
                    return context.getString(intValue);
                }
                return null;
            case 24:
                PostingVisibilityMode postingVisibilityMode = (PostingVisibilityMode) obj;
                ylc0 ylc0Var = ((dmc0) obj2).c;
                if (ylc0Var != null) {
                    mlq0 g2 = ylc0Var.g();
                    c3j0 c3j0Var = g2.b;
                    if (c3j0Var.o0() != postingVisibilityMode) {
                        g2.e.f(g2.m);
                    }
                    c3j0Var.Q(postingVisibilityMode);
                    bmc0 bmc0Var = g2.g;
                    g2.b(bmc0.a(bmc0Var, bmc0.b.a(bmc0Var.a, false, postingVisibilityMode, 3), null, 2), true);
                }
                return s3q0.a;
            case 25:
                zrd0.a.e((UUID) obj2);
                return s3q0.a;
            case 26:
                com.vk.auth.modal.qrwithcode.a aVar3 = ((QrWithCodeAuthModal) obj2).g;
                com.vk.auth.modal.qrwithcode.a aVar4 = aVar3 != null ? aVar3 : null;
                if (aVar4.k instanceof b.c) {
                    aVar4.e(b.d.a, true);
                }
                return s3q0.a;
            case 27:
                com.vk.profile.questions.impl.d dVar2 = (com.vk.profile.questions.impl.d) obj2;
                QuestionsQuestionDto b = ((com.vk.profile.questions.impl.d) obj).b();
                Boolean j2 = dVar2.b().j();
                Boolean bool = Boolean.TRUE;
                if (!epx.f(j2, bool)) {
                    r3 = epx.f(b != null ? b.g() : null, dVar2.b().g());
                } else if (b != null) {
                    r3 = epx.f(b.j(), bool);
                }
                return Boolean.valueOf(r3);
            case 28:
                RadioStationCellVh radioStationCellVh = (RadioStationCellVh) obj2;
                VkCell vkCell = radioStationCellVh.f;
                if (vkCell == null) {
                    vkCell = null;
                }
                ikv0.a aVar5 = new ikv0.a(vkCell.getContext());
                aVar5.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) dVar, i2);
                VkCell vkCell2 = radioStationCellVh.f;
                if (vkCell2 == null) {
                    vkCell2 = null;
                }
                aVar5.u = new ikv0.d(vkCell2.getContext().getString(R.string.music_catalog_radio_station_followed), (String) dVar, (ikv0.d.a) dVar, 6);
                aVar5.e = 4000L;
                pkv0.f(aVar5);
                return s3q0.a;
            default:
                RestoreSearchFragment restoreSearchFragment = (RestoreSearchFragment) obj2;
                restoreSearchFragment.e0.reset();
                ysg0.b.a(new mru0(restoreSearchFragment.e0, true));
                restoreSearchFragment.io(null, true);
                return s3q0.a;
        }
    }

    public /* synthetic */ px30(w060 w060Var, bi20 bi20Var) {
        this.b = 5;
        this.c = bi20Var;
    }

    public /* synthetic */ px30(qe70 qe70Var, String str) {
        this.b = 9;
        this.c = qe70Var;
    }
}
