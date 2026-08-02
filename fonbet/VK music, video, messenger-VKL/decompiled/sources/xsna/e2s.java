package xsna;

import android.content.Context;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.contacts.NoReadContactsPermissionException;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.id.UserId;
import com.vk.im.popup.Popup;
import com.vk.instantjobs.InstantJob;
import com.vk.managed_groups.impl.list.ManagedGroupsListFragment;
import com.vk.managed_groups.impl.list.h;
import com.vk.managed_groups.impl.list.popup.ManagedGroupAction;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.offline.ui.presentation.MusicDownloadsSettingsFragment;
import com.vk.newsfeed.impl.feedback.NewsEntryFeedbackCommentsFragment;
import com.vk.newsfeed.impl.postmodal.reactions.donut.ModalPostDonutFragment;
import com.vk.newsfeed.impl.postmodal.reactions.donut.e;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.photos.ui.profile.ProfilePhotoTag;
import com.vk.posting.presentation.video.search.h;
import com.vk.profile.community.members.api.CommunityMembersFilter;
import com.vk.profile.community.members.impl.ui.MviMembersListFragment;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import com.vkontakte.android.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.ok.android.webrtc.CameraToggles;
import xsna.as30;
import xsna.dw20;
import xsna.ebk;
import xsna.fbk;
import xsna.gm50;
import xsna.ikv0;
import xsna.ltd0;
import xsna.mmh0;
import xsna.q0j0;
import xsna.qr60;
import xsna.sr20;
import xsna.tj50;
import xsna.tlo0;
import xsna.w19;
import xsna.wlp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class e2s implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e2s(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v116, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r1v118, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r1v119, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v88, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        tb90 tb90Var;
        int i = this.b;
        int i2 = 4;
        int i3 = 28;
        tb90 tb90Var2 = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                i2s i2sVar = (i2s) obj2;
                if (((t2s) obj).i == 0) {
                    i2sVar.h.a();
                }
                return s3q0.a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((fxt0) obj2).b).setValue(bool);
                return s3q0.a;
            case 2:
                ((b5v) obj2).c.jo(true);
                h03.b((Throwable) obj);
                return s3q0.a;
            case 3:
                ((c8v) obj2).d1().f(true);
                return s3q0.a;
            case 4:
                as30.a aVar = ((com.vk.im.video.g) obj2).s;
                (aVar != null ? aVar : null).c();
                return Boolean.TRUE;
            case 5:
                ((tdu) obj).b(((Number) ((wlp0.d) obj2).getValue()).floatValue());
                return s3q0.a;
            case 6:
                ((w2y) obj2).a.z(JsApiMethodType.ADD_MINI_APP_SNIPPET_TO_CHAT, (Throwable) obj);
                return s3q0.a;
            case 7:
                ((whz) obj2).G();
                return s3q0.a;
            case 8:
                ManagedGroupsListFragment managedGroupsListFragment = (ManagedGroupsListFragment) obj2;
                com.vk.managed_groups.impl.list.h hVar = (com.vk.managed_groups.impl.list.h) obj;
                if (hVar instanceof h.b) {
                    ((com.vk.im.popup.a) managedGroupsListFragment.R.getValue()).c(new ai00(e43.l(new lwb0(null, R.string.vkim_turn_on_notifications_group, null, null, R.drawable.vk_icon_notification_outline_24, ManagedGroupAction.NOTIFICATIONS_ON, false, null, false, false, 1989), new lwb0(null, R.string.vkim_turn_off_notifications_group, null, null, R.drawable.vk_icon_notification_slash_outline_24, ManagedGroupAction.NOTIFICATIONS_OFF, false, null, false, false, 1989)), ((h.b) hVar).a, Popup.g.b.a, 2431), new com.vk.im.engine.commands.messages.a(26, managedGroupsListFragment, hVar), null);
                } else {
                    int i4 = ManagedGroupsListFragment.X;
                    if (!(hVar instanceof h.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context requireContext = managedGroupsListFragment.requireContext();
                    tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_error_change_notifications_settings);
                    ikv0.a aVar2 = new ikv0.a(requireContext);
                    float f = 28;
                    aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_triangle_outline_56, Integer.valueOf(R.attr.vk_ui_icon_negative), new Size(iah0.a(f), iah0.a(f)), 8);
                    aVar2.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, requireContext).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar2.n();
                }
                return s3q0.a;
            case 9:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                la10 b = ((f910) obj2).b();
                if (b != null) {
                    b.L0(0, booleanValue);
                }
                return s3q0.a;
            case 10:
                ((s5o0) obj).c = new vg3((a220) obj2, i2);
                return s3q0.a;
            case 11:
                pr20 pr20Var = (pr20) obj2;
                sr20 sr20Var = (sr20) obj;
                Integer valueOf = Integer.valueOf(R.attr.vk_ui_text_accent);
                if (sr20Var.equals(sr20.a.a)) {
                    pr20Var.tn();
                } else if (sr20Var.equals(sr20.b.a)) {
                    Context mo2getContext = pr20Var.mo2getContext();
                    if (mo2getContext != null) {
                        new dw20.b(mo2getContext, null).M(R.drawable.vk_icon_error_outline_56, valueOf).v0(R.string.vk_music_widget_not_available_title).h0(R.string.vk_music_widget_not_available_button, new f84(14)).I0(null);
                    }
                } else {
                    if (!sr20Var.equals(sr20.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context mo2getContext2 = pr20Var.mo2getContext();
                    if (mo2getContext2 != null) {
                        MobileServicesType h2 = ((VkHealthPermissionsComponent) pr20Var.i.getValue()).Wb().h(mo2getContext2);
                        if (h2 == MobileServicesType.GOOGLE_PLAY || h2 == MobileServicesType.HUAWEI) {
                            pr20Var.j.j(mo2getContext2, RequestedMiniApp.VK_STEPS, null, new k0j(pr20Var, 29));
                        } else {
                            ((dw20.b) dw20.a.Q(new dw20.b(mo2getContext2, null).M(R.drawable.vk_icon_error_outline_56, valueOf).v0(R.string.vk_steps_widget_not_available_title), R.string.vk_steps_widget_not_available_subtitle)).h0(R.string.vk_music_widget_not_available_button, new lg(22)).I0(null);
                        }
                    }
                }
                return s3q0.a;
            case 12:
                ModalPostDonutFragment modalPostDonutFragment = (ModalPostDonutFragment) obj2;
                int i5 = ModalPostDonutFragment.W;
                if (!((com.vk.newsfeed.impl.postmodal.reactions.donut.e) obj).equals(e.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.vk.lists.c cVar = modalPostDonutFragment.T;
                if (cVar != null) {
                    cVar.d();
                }
                return s3q0.a;
            case 13:
                Context context = ((rw30) obj2).k;
                Throwable th = (Throwable) obj;
                if (th instanceof NoReadContactsPermissionException) {
                    edw edwVar = edw.a;
                    edw.d(R.string.vkim_error_create_contact_no_permission, context, true);
                } else if (!(th instanceof CancellationException) && !(th instanceof NoSuchElementException)) {
                    if (th instanceof IOException) {
                        new fbk.a(context).I0(null);
                    } else {
                        new ebk.a(context).I0(null);
                    }
                }
                return s3q0.a;
            case 14:
                com.vk.im.engine.commands.messages.g gVar = (com.vk.im.engine.commands.messages.g) obj2;
                InstantJob instantJob = (InstantJob) obj;
                if (((instantJob instanceof ny30) && ((ny30) instantJob).d == gVar.b) || ((instantJob instanceof hh30) && ((hh30) instantJob).d == gVar.b)) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 15:
                qcy<Object>[] qcyVarArr = MusicDownloadsSettingsFragment.P;
                ?? r3 = ((MusicDownloadsSettingsFragment) obj2).N;
                final j850 j850Var = new j850(((OfflineAudioComponent) r3.getValue()).Ja(), ((OfflineAudioComponent) r3.getValue()).Na());
                return new cn50(up2.d(new rf20((gzs) obj, 5), new wb0() { // from class: xsna.gj40
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        return new ej40(j850.this, sj50Var);
                    }
                }, svj.b));
            case 16:
                UIBlockList uIBlockList = (UIBlockList) obj;
                if (!((nk40) obj2).c(uIBlockList)) {
                    if (!uIBlockList.Ib().contains("music_audios_remove")) {
                        ArrayList<UIBlock> Sb = uIBlockList.Sb();
                        if (Sb == null || !Sb.isEmpty()) {
                            Iterator it = Sb.iterator();
                            while (it.hasNext()) {
                                if (((UIBlock) it.next()).Ib().contains("music_audios_remove")) {
                                }
                            }
                        }
                    }
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 17:
                MviMembersListFragment mviMembersListFragment = (MviMembersListFragment) obj2;
                MviMembersListFragment.a aVar3 = MviMembersListFragment.T;
                return new l220(new co50(), new a220((UserId) mviMembersListFragment.N.getValue(), (CommunityMembersFilter) mviMembersListFragment.O.getValue(), new hah(mviMembersListFragment.P), new fah(), mviMembersListFragment.P));
            case 18:
                et50 et50Var = (et50) obj2;
                et50Var.p1.clear();
                et50Var.hide();
                return s3q0.a;
            case 19:
                NewsEntryFeedbackCommentsFragment newsEntryFeedbackCommentsFragment = (NewsEntryFeedbackCommentsFragment) obj2;
                xfg xfgVar = newsEntryFeedbackCommentsFragment.b1;
                yfg yfgVar = newsEntryFeedbackCommentsFragment.a1;
                if (yfgVar != null) {
                    xfgVar.getClass();
                    xfgVar.e = new WeakReference<>(yfgVar);
                    xfgVar.setItems(yfgVar.d);
                    xfgVar.f = newsEntryFeedbackCommentsFragment.d1;
                    VkContextMenu vkContextMenu = (VkContextMenu) newsEntryFeedbackCommentsFragment.c1.getValue();
                    if (vkContextMenu != null) {
                        vkContextMenu.g();
                    }
                }
                return s3q0.a;
            case 20:
                ((CameraToggles) obj).isCrashOnCameraCloseRequired();
                return new CameraToggles(new xl9(((w19.b) ((com.vk.movika.sdk.base.logic.interactor.d) obj2).c).b).a);
            case 21:
                fs80 fs80Var = (fs80) obj2;
                fs80Var.a.put((String) obj, Long.valueOf(System.nanoTime()));
                long nanoTime = System.nanoTime();
                ks80 ks80Var = fs80Var.e;
                ks80Var.f().e(new es80(fs80Var, nanoTime, ks80Var));
                return s3q0.a;
            case 22:
                mc90 mc90Var = (mc90) obj2;
                ?? r1 = (Float) obj;
                float floatValue = r1.floatValue();
                long d = k7b0.d(mc90Var);
                float f2 = mc90Var.i + floatValue;
                long c = an10.c(f2);
                mc90Var.i = f2 - c;
                if (Math.abs(floatValue) >= 1.0E-4f) {
                    long j = d + c;
                    long i6 = swe0.i(j, mc90Var.h, mc90Var.g);
                    ?? r10 = j != i6;
                    long j2 = i6 - d;
                    float f3 = j2;
                    mc90Var.j = f3;
                    long abs = Math.abs(j2);
                    float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (abs != 0) {
                        ((zak0) mc90Var.E).setValue(Boolean.valueOf(f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        ((zak0) mc90Var.F).setValue(Boolean.valueOf(f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    }
                    int i7 = (int) j2;
                    int i8 = -i7;
                    tb90 h3 = ((tb90) ((zak0) mc90Var.m).getValue()).h(i8);
                    if (h3 != null && (tb90Var = mc90Var.b) != null) {
                        tb90 h4 = tb90Var.h(i8);
                        if (h4 != null) {
                            mc90Var.b = h4;
                        }
                        if (tb90Var2 == null) {
                            mc90Var.h(tb90Var2, mc90Var.a, true);
                            zq70.A(mc90Var.A);
                        } else {
                            zb90 zb90Var = mc90Var.d;
                            mc90 mc90Var2 = (mc90) zb90Var.b;
                            kg50 kg50Var = (kg50) zb90Var.d;
                            if (mc90Var2.q() != 0) {
                                f4 = i7 / mc90Var2.q();
                            }
                            ((vak0) kg50Var).g(((vak0) kg50Var).getFloatValue() + f4);
                            stf0 stf0Var = (stf0) ((zak0) mc90Var.x).getValue();
                            if (stf0Var != null) {
                                stf0Var.k();
                            }
                        }
                        if (r10 != false) {
                            r1 = Long.valueOf(j2);
                        }
                        floatValue = r1.floatValue();
                    }
                    tb90Var2 = h3;
                    if (tb90Var2 == null) {
                    }
                    if (r10 != false) {
                    }
                    floatValue = r1.floatValue();
                }
                return Float.valueOf(floatValue);
            case 23:
                ((ktd0) obj2).T((ltd0.d) obj);
                return s3q0.a;
            case 24:
                ProfilePhotoTag profilePhotoTag = (ProfilePhotoTag) obj;
                ((ProfileMainPhotosFragment) obj2).yo().G0(profilePhotoTag, new qw30(profilePhotoTag, 25));
                return s3q0.a;
            case 25:
                return ((j4f0) obj2).b.e(new l4f0((qr60.a) obj));
            case 26:
                return new mmh0.b(((tj50.a) obj).a(new vlc0((lmh0) obj2, i2), ao8.d));
            case 27:
                com.vk.posting.presentation.video.search.g gVar2 = (com.vk.posting.presentation.video.search.g) obj2;
                gm50.a.a(gVar2, ((h.a) obj).a, new yr00(gVar2, i3));
                return s3q0.a;
            case 28:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                if (((jai0) obj).f.a.a.c.length() > 0) {
                    ref$BooleanRef.element = false;
                }
                return s3q0.a;
            default:
                return SettingsState.a((SettingsState) obj, null, false, null, null, null, null, Boolean.valueOf(((q0j0.j) ((q0j0) obj2)).b), null, null, 447);
        }
    }
}
