package xsna;

import android.app.Dialog;
import android.content.Context;
import android.util.Size;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.view.components.bottombar.VkBottomBar;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoSkippablePart;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickersRecommendationBlock;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.newsfeed.posting.donut_teaser.domain.interactor.TextValidationState;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionSubscribe;
import com.vk.superapp.api.dto.widgets.actions.WebSubscribeExtra;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiEvent;
import com.vk.superapp.browser_events.VkAppEvent;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.subscribe_tile.SuperAppWidgetSubscribeTile;
import com.vk.video.design.view.VideoControlsBarView;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vk.voip.ui.group_selector.ui.a;
import com.vk.voip.ui.hint.VoipHintView;
import com.vk.voip.ui.hint.a;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vk.voip.ui.sessionrooms.dialog.SessionRoomsDialog;
import com.vk.voip.ui.sessionrooms.e;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.c7n0;
import xsna.h7u0;
import xsna.ikv0;
import xsna.kkw0;
import xsna.qr60;
import xsna.tj50;
import xsna.wbu0;
import xsna.y0r0;
import xsna.ypr0;
import xsna.zvn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class b3m0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b3m0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<SuperAppWidget> list;
        Throwable th;
        Iterator it;
        Object obj2;
        WebSubscribeExtra.MemberStatus memberStatus;
        boolean z;
        Window window;
        FragmentManager fragmentManager;
        kkw0.a aVar;
        int i = 9;
        int i2 = 21;
        int i3 = 3;
        int i4 = 2;
        int i5 = 8;
        Throwable th2 = null;
        switch (this.b) {
            case 0:
                StoryFragment storyFragment = (StoryFragment) this.c;
                int i6 = StoryFragment.X;
                storyFragment.eo();
                return s3q0.a;
            case 1:
                xam0 xam0Var = (xam0) this.c;
                y0f0 y0f0Var = (y0f0) obj;
                yam0 yam0Var = xam0Var.j;
                if (yam0Var != null) {
                    yam0Var.f.onNext(Optional.of(y0f0Var));
                    yam0Var.d = y0f0Var;
                }
                xam0Var.h.setReaction(y0f0Var);
                return s3q0.a;
            case 2:
                SuggestedPostsFragment suggestedPostsFragment = (SuggestedPostsFragment) this.c;
                gom0 gom0Var = (gom0) obj;
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                gom0.a(gom0Var, e4n0.b, new pg(suggestedPostsFragment, i5));
                gom0.a(gom0Var, f4n0.b, new y6c(suggestedPostsFragment, 15));
                gom0.a(gom0Var, g4n0.b, new phg(suggestedPostsFragment, i));
                gom0.a(gom0Var, h4n0.b, new com.vk.movika.tools.controls.seekbar.h(suggestedPostsFragment, 13));
                gom0.a(gom0Var, i4n0.b, new com.vk.movika.tools.controls.seekbar.i(suggestedPostsFragment, 18));
                return s3q0.a;
            case 3:
                ((com.vk.lists.c) this.c).s(((StickersRecommendationBlock) obj).e);
                return s3q0.a;
            case 4:
                kym0 kym0Var = (kym0) obj;
                c7n0 c7n0Var = ((com.vk.superapp.ui.a) this.c).b.b0;
                if (c7n0Var == null) {
                    c7n0Var = null;
                }
                c7n0Var.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it2 = ((ListDataSet) c7n0Var.c).d.iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        Throwable th3 = th2;
                        e43.t();
                        throw th3;
                    }
                    zif0 zif0Var = (zif0) next;
                    if ((zif0Var instanceof den0) && (list = ((den0) zif0Var).e.o.f) != null) {
                        List<SuperAppWidget> list2 = list;
                        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                        Iterator it3 = list2.iterator();
                        th2 = th2;
                        while (it3.hasNext()) {
                            SuperAppWidget superAppWidget = (SuperAppWidget) it3.next();
                            if (superAppWidget instanceof SuperAppWidgetSubscribeTile) {
                                WebAction webAction = ((SuperAppWidgetSubscribeTile) superAppWidget).o.d;
                                WebActionSubscribe webActionSubscribe = webAction instanceof WebActionSubscribe ? (WebActionSubscribe) webAction : th2;
                                if (webActionSubscribe != null) {
                                    Throwable th4 = th2;
                                    it = it3;
                                    long j = webActionSubscribe.d;
                                    gzs<s3q0> gzsVar = fkq0.a;
                                    th = th4;
                                    obj2 = fkq0.e(new UserId(j));
                                } else {
                                    th = th2;
                                    it = it3;
                                    obj2 = th2;
                                }
                                if (epx.f(obj2, kym0Var.b)) {
                                    SubscribeStatus subscribeStatus = kym0Var.a;
                                    WebSubscribeExtra webSubscribeExtra = webActionSubscribe.e;
                                    if (webSubscribeExtra != null) {
                                        int i9 = c7n0.a.$EnumSwitchMapping$0[subscribeStatus.ordinal()];
                                        if (i9 == 1) {
                                            memberStatus = WebSubscribeExtra.MemberStatus.NOT_A_MEMBER;
                                            z = webSubscribeExtra.d;
                                            webSubscribeExtra.d = false;
                                        } else if (i9 == 2) {
                                            memberStatus = WebSubscribeExtra.MemberStatus.MEMBER;
                                            z = !webSubscribeExtra.d;
                                            webSubscribeExtra.d = true;
                                        } else if (i9 != 3) {
                                            memberStatus = webSubscribeExtra.e;
                                            z = false;
                                        } else {
                                            z = (webSubscribeExtra.d && webSubscribeExtra.e == WebSubscribeExtra.MemberStatus.HAS_SENT_A_REQUEST) ? false : true;
                                            memberStatus = WebSubscribeExtra.MemberStatus.HAS_SENT_A_REQUEST;
                                        }
                                        webSubscribeExtra.e = memberStatus;
                                        if (z) {
                                            linkedHashSet.add(Integer.valueOf(i7));
                                        }
                                    }
                                }
                            } else {
                                th = th2;
                                it = it3;
                            }
                            arrayList.add(s3q0.a);
                            it3 = it;
                            th2 = th;
                        }
                    }
                    i7 = i8;
                    th2 = th2;
                }
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    c7n0Var.notifyItemChanged(((Number) it4.next()).intValue());
                }
                return s3q0.a;
            case 5:
                ovn0 ovn0Var = (ovn0) this.c;
                zvn0 zvn0Var = (zvn0) obj;
                qcy<Object>[] qcyVarArr2 = ovn0.m1;
                if (zvn0Var instanceof zvn0.a) {
                    ovn0Var.hide();
                } else {
                    if (!(zvn0Var instanceof zvn0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        ((lvn0) ovn0Var.l1.getValue(ovn0Var, ovn0.m1[0])).c().performHapticFeedback(17);
                    } catch (Throwable unused) {
                    }
                    Dialog dialog = ovn0Var.s;
                    if (dialog != null && (window = dialog.getWindow()) != null) {
                        Context requireContext = ovn0Var.requireContext();
                        ikv0.a aVar2 = new ikv0.a(requireContext);
                        aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
                        aVar2.u = new ikv0.d(requireContext.getString(R.string.tabbar_settings_save_error), (String) null, (ikv0.d.a) null, 6);
                        aVar2.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, requireContext.getString(R.string.tabbar_settings_save_retry), new z6f0(ovn0Var, 19));
                        aVar2.o = Integer.valueOf(iah0.a(8));
                        aVar2.p(window);
                    }
                }
                return s3q0.a;
            case 6:
                io.reactivex.rxjava3.core.r rVar = (io.reactivex.rxjava3.core.r) this.c;
                if (!rVar.h()) {
                    rVar.onNext(TextValidationState.ERROR);
                    rVar.onComplete();
                }
                return s3q0.a;
            case 7:
                ((ToolbarRedesignVh) this.c).g((ToolbarRedesignVh.a) obj);
                return s3q0.a;
            case 8:
                tuq0 tuq0Var = (tuq0) this.c;
                if (((Boolean) obj).booleanValue()) {
                    tuq0Var.j.a(new y0r0.a(tuq0Var.a.a()));
                }
                return s3q0.a;
            case 9:
                return ((zvq0) this.c).b.e(new awq0((qr60.a) obj));
            case 10:
                vpr0 vpr0Var = (vpr0) this.c;
                tj50.a aVar3 = (tj50.a) obj;
                tpr0 tpr0Var = tpr0.b;
                ao8 ao8Var = ao8.d;
                return new ypr0.b(aVar3.a(tpr0Var, ao8Var), aVar3.a(new upr0(1, vpr0Var, vpr0.class, "buildPickerItems", "buildPickerItems(Lcom/vk/camera/editor/stories/impl/verticalization/mode/VerticalizationModeState;)Lcom/vk/camera/editor/stories/impl/verticalization/mode/VerticalizationModeViewState$PickerItems;", 0), ao8Var));
            case 11:
                owi.a("search_debounce", 300L, new m84(i2, (jsr0) this.c, (String) obj));
                return s3q0.a;
            case 12:
                ((VideoFile) this.c).eb((VideoSkippablePart) obj);
                return s3q0.a;
            case 13:
                VideoControlsBarView.a aVar4 = ((VideoControlsBarView) this.c).b;
                if (aVar4 != null) {
                    aVar4.a();
                }
                return s3q0.a;
            case 14:
                rwo0 rwo0Var = ((VideoEditTimelineView) this.c).F;
                if (rwo0Var != null) {
                    rwo0Var.w();
                }
                return s3q0.a;
            case 15:
                VideoEpisodesFragment videoEpisodesFragment = (VideoEpisodesFragment) this.c;
                atp atpVar = (atp) obj;
                int i10 = VideoEpisodesFragment.V;
                nr4.b().p(videoEpisodesFragment.requireContext(), atpVar.b, atpVar.a());
                return s3q0.a;
            case 16:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) this.c;
                gVar.v0();
                gVar.v.h();
                return s3q0.a;
            case 17:
                Toast.makeText(((com.vk.auth.ui.password.askpassword.a) this.c).b.getContext(), ((wbu0.a) obj).a, 0).show();
                return s3q0.a;
            case 18:
                VkBottomBar vkBottomBar = (VkBottomBar) this.c;
                int i11 = VkBottomBar.o;
                vkBottomBar.a();
                return s3q0.a;
            case 19:
                ihu0 ihu0Var = (ihu0) this.c;
                fvv0 fvv0Var = ihu0Var.e;
                fvv0Var.t().u = true;
                ihu0Var.d.s();
                ((t9u0) ihu0Var.k.getValue()).a.onNext(VkAppEvent.VK_APP_FAVORITE_STATUS_CHANGED);
                ihu0Var.c.r(JsApiEvent.FAVORITE_RESULT, new JSONObject().put("result", true));
                int i12 = fvv0Var.h() ? R.string.vk_apps_games_added_to_favorites : R.string.vk_apps_app_added_to_favorites;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).j(((ggu0) ihu0Var.h.c).b.getString(i12));
                return s3q0.a;
            case 20:
                com.vk.core.view.components.skeleton.a aVar5 = (com.vk.core.view.components.skeleton.a) this.c;
                int i13 = VkCellSkeleton.n;
                ((vjv0) obj).setArea(aVar5);
                return s3q0.a;
            case 21:
                giv0 giv0Var = (giv0) this.c;
                ysg0<Object> ysg0Var = ysg0.b;
                io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0Var.a;
                int i14 = 11;
                igj0 igj0Var = new igj0(i14);
                fVar.getClass();
                io.reactivex.rxjava3.internal.operators.observable.m1 a0 = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, igj0Var).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                hrt0 hrt0Var = new hrt0(new c4q0(giv0Var, i5), i3);
                xgx0 xgx0Var = xgx0.a;
                io.reactivex.rxjava3.disposables.c subscribe = a0.subscribe(hrt0Var, new j7l0(new wg8(xgx0Var, 9), i14));
                io.reactivex.rxjava3.disposables.b bVar = giv0Var.b;
                bVar.b(subscribe);
                io.reactivex.rxjava3.subjects.f<Object> fVar2 = ysg0Var.a;
                hbn0 hbn0Var = new hbn0(3);
                fVar2.getClass();
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar2, hbn0Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new nan0(giv0Var, i5), new u0o0(new qp3(xgx0Var, 7), i14)));
                return s3q0.a;
            case 22:
                aw3 aw3Var = (aw3) this.c;
                cw3 cw3Var = (cw3) ((it80) obj).a;
                if (cw3Var != null) {
                    if (!aw3Var.k) {
                        tv4.b("AsrRecordInProgressView View is destroyed", com.vk.metrics.eventtracking.b.a);
                    }
                    if (!epx.f(aw3Var.j, cw3Var)) {
                        aw3Var.j = cw3Var;
                        aw3Var.a(cw3Var);
                        aw3Var.l = false;
                    }
                }
                return s3q0.a;
            case 23:
                kkw0 kkw0Var = (kkw0) this.c;
                com.vk.voip.ui.sessionrooms.e eVar = (com.vk.voip.ui.sessionrooms.e) obj;
                int i15 = 4;
                if (eVar instanceof e.a) {
                    e.a aVar6 = (e.a) eVar;
                    l7s l7sVar = kkw0Var.b;
                    k9b k9bVar = kkw0Var.f;
                    if (aVar6 instanceof e.a.C2079e) {
                        FragmentManager fragmentManager2 = (FragmentManager) k9bVar.invoke();
                        if (fragmentManager2 != null) {
                            SessionRoomsDialog.a aVar7 = new SessionRoomsDialog.a();
                            aVar7.a = SessionRoomsDialog.DialogKind.NOTIFY_ROOMS_NOT_AVAILABLE;
                            s3q0 s3q0Var = s3q0.a;
                            aVar7.a(fragmentManager2);
                        }
                    } else if (aVar6 instanceof e.a.d) {
                        FragmentManager fragmentManager3 = (FragmentManager) k9bVar.invoke();
                        if (fragmentManager3 != null) {
                            SessionRoomsDialog.a aVar8 = new SessionRoomsDialog.a();
                            aVar8.a = SessionRoomsDialog.DialogKind.NOTIFY_ROOMS_NOT_AVAILABLE;
                            s3q0 s3q0Var2 = s3q0.a;
                            aVar8.a(fragmentManager3);
                        }
                    } else if (aVar6 instanceof e.a.b) {
                        FragmentManager fragmentManager4 = (FragmentManager) k9bVar.invoke();
                        if (fragmentManager4 != null) {
                            SessionRoomsDialog.a aVar9 = new SessionRoomsDialog.a();
                            aVar9.a = SessionRoomsDialog.DialogKind.NOTIFY_LEAVE_ROOM_PROHIBITED;
                            s3q0 s3q0Var3 = s3q0.a;
                            aVar9.a(fragmentManager4);
                        }
                    } else if (aVar6 instanceof e.a.f) {
                        FragmentManager fragmentManager5 = (FragmentManager) k9bVar.invoke();
                        if (fragmentManager5 != null) {
                            SessionRoomsDialog.a aVar10 = new SessionRoomsDialog.a();
                            aVar10.a = SessionRoomsDialog.DialogKind.SELECT_ROOM;
                            aVar10.b = null;
                            s3q0 s3q0Var4 = s3q0.a;
                            aVar10.a(fragmentManager5);
                        }
                    } else if (aVar6 instanceof e.a.C2078a) {
                        e.a.C2078a c2078a = (e.a.C2078a) aVar6;
                        String str = c2078a.a;
                        f.a.b bVar2 = c2078a.b;
                        boolean z2 = c2078a.c;
                        if (kkw0Var.j == null) {
                            int i16 = h7u0.p;
                            h7u0.a c = h7u0.b.c(l7sVar);
                            c.g0(R.string.voip_session_room_admin_assistance_request_notification_title);
                            c.a.f = z2 ? l7sVar.getString(R.string.voip_session_room_admin_assistance_request_notification_description_same_room, str) : l7sVar.getString(R.string.voip_session_room_admin_assistance_request_notification_description, str, bVar2.b);
                            c.a0(new mkd0(kkw0Var, 1));
                            if (z2) {
                                c.c0(R.string.voip_close, new w4p(bVar2, i15));
                            } else {
                                c.c0(R.string.voip_session_room_admin_assistance_request_notification_confirm, new iwd(bVar2, i4));
                                c.W(R.string.voip_session_room_admin_assistance_request_notification_cancel, null);
                            }
                            kkw0Var.j = c.m();
                        }
                        s3q0 s3q0Var5 = s3q0.a;
                    } else {
                        if (!(aVar6 instanceof e.a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gzs<s3q0> gzsVar2 = ((e.a.c) aVar6).a;
                        int i17 = h7u0.p;
                        h7u0.a c2 = h7u0.b.c(l7sVar);
                        c2.g0(R.string.voip_session_room_admin_room_countdown_timer_close_dialog_title);
                        c2.U(R.string.voip_session_room_admin_room_countdown_timer_close_dialog_description);
                        c2.c0(R.string.voip_session_room_admin_room_countdown_timer_close_dialog_confirm, new ja60(2, gzsVar2));
                        c2.W(R.string.voip_session_room_admin_room_countdown_timer_close_dialog_cancel, null);
                        kkw0Var.k = c2.m();
                        s3q0 s3q0Var6 = s3q0.a;
                    }
                } else if (eVar instanceof e.c) {
                    e.c cVar = (e.c) eVar;
                    l7s l7sVar2 = kkw0Var.b;
                    if (cVar instanceof e.c.g) {
                        aVar = new kkw0.a(l7sVar2.getString(R.string.voip_session_room_joined_notification, ((e.c.g) cVar).b), 6);
                    } else if (cVar instanceof e.c.d) {
                        aVar = new kkw0.a(l7sVar2.getString(R.string.voip_session_room_main_call_joined), 6);
                    } else if (cVar instanceof e.c.a) {
                        aVar = new kkw0.a(l7sVar2.getString(R.string.voip_session_room_attention_request_sent_notification), 4);
                    } else if (cVar instanceof e.c.C2080c) {
                        aVar = new kkw0.a(l7sVar2.getString(R.string.voip_session_room_attention_request_failed_notification), 6);
                    } else if (cVar instanceof e.c.b) {
                        aVar = new kkw0.a(l7sVar2.getString(R.string.voip_session_room_admin_rights_required_error), 6);
                    } else if (cVar instanceof e.c.C2081e) {
                        aVar = new kkw0.a(l7sVar2.getString(R.string.voip_session_room_admin_moved_participant_to_main_call), 6);
                    } else if (cVar instanceof e.c.f) {
                        aVar = new kkw0.a(l7sVar2.getString(R.string.voip_session_room_admin_moved_participant_to_room, ((e.c.f) cVar).a), 6);
                    } else {
                        if (!(cVar instanceof e.c.h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = new kkw0.a(((e.c.h) cVar).a, Integer.valueOf(R.drawable.vk_icon_message_unread_top_28), l7sVar2.getString(R.string.voip_session_room_admin_message_for_rooms_notification_close));
                    }
                    com.vk.voip.ui.hint.a aVar11 = kkw0Var.e;
                    String str2 = aVar.a;
                    Integer num = aVar.b;
                    String str3 = aVar.c;
                    VoipHintView voipHintView = aVar11.a;
                    a.EnumC2056a enumC2056a = a.EnumC2056a.SessionRoomNotification;
                    if (enumC2056a.h() >= aVar11.a()) {
                        voipHintView.a(new VoipHintView.a(str2, num, str3, new icn0(aVar11, i2), true));
                        voipHintView.setVisibility(0);
                        aVar11.i = enumC2056a;
                        if (str3 == null) {
                            aVar11.j(io.reactivex.rxjava3.core.a.s(3000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new sbb(aVar11, i5)));
                        }
                    }
                } else if (eVar instanceof e.d) {
                    kkw0Var.getClass();
                    if (!(((e.d) eVar) instanceof e.d.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cvk.u(R.string.voip_session_room_admin_close_rooms_error, false);
                } else {
                    if (!(eVar instanceof e.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e.b bVar3 = (e.b) eVar;
                    kkw0Var.getClass();
                    if (!(bVar3 instanceof e.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((e.b.a) bVar3).a && (fragmentManager = (FragmentManager) kkw0Var.f.invoke()) != null) {
                        SessionRoomsDialog.a aVar12 = new SessionRoomsDialog.a();
                        int i18 = kkw0.b.$EnumSwitchMapping$0[((e.b.a) bVar3).b.ordinal()];
                        if (i18 == 1) {
                            aVar12.a = SessionRoomsDialog.DialogKind.NOTIFY_ROOMS_CLOSED;
                        } else if (i18 == 2) {
                            aVar12.a = SessionRoomsDialog.DialogKind.NOTIFY_ROOMS_CLOSED_WITH_STREAM;
                        } else {
                            if (i18 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar12.a = SessionRoomsDialog.DialogKind.NOTIFY_ROOMS_CLOSED_WITH_RECORD;
                        }
                        s3q0 s3q0Var7 = s3q0.a;
                        aVar12.a(fragmentManager);
                    }
                    androidx.appcompat.app.d dVar = kkw0Var.j;
                    if (dVar != null) {
                        dVar.dismiss();
                    }
                    kkw0Var.j = null;
                    androidx.appcompat.app.d dVar2 = kkw0Var.k;
                    if (dVar2 != null) {
                        dVar2.dismiss();
                    }
                    kkw0Var.k = null;
                }
                return s3q0.a;
            case 24:
                ((sow0) this.c).c.a(a.g.a);
                return s3q0.a;
            case 25:
                VoipPastCallsFragment voipPastCallsFragment = (VoipPastCallsFragment) this.c;
                m59 m59Var = (m59) obj;
                voipPastCallsFragment.X.setItems(m59Var.a);
                VoipPastCallsFragment.b bVar4 = voipPastCallsFragment.Q;
                (bVar4 != null ? bVar4 : null).d.setRefreshing(m59Var.b);
                return s3q0.a;
            default:
                return new e0x0((ViewGroup) obj, ((szw0) this.c).j);
        }
    }
}
