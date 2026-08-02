package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.attachpicker.impl.ImagePickerActivity;
import com.vk.clips.design.view.hsl.HslRecyclerView;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.crop.CropImageView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.im.ImageList;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.player.LoopMode;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.all.ModalPostAllReactionsFragment;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment.b;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment.e;
import com.vk.stickers.ContextUser;
import com.vk.superapp.design.view.multiaccount.avatar.VkProfileAvatarView;
import com.vk.superapp.multiaccount.api.UserSecurityStatus;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.b3i0;
import xsna.d5v;
import xsna.er9;
import xsna.gko;
import xsna.gzx;
import xsna.hi00;
import xsna.if6;
import xsna.ii00;
import xsna.l110;
import xsna.lb40;
import xsna.m1s;
import xsna.mcz;
import xsna.qxl;
import xsna.tj50;
import xsna.vyh;
import xsna.wzx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class rmg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rmg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v22, types: [xsna.xyr] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [xsna.m1s$a] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.vk.im.ui.views.avatars.AvatarView] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkTopBar.a.d a;
        CharSequence valueOf;
        VkProfileAvatarView.ProtectionIndicatorType protectionIndicatorType;
        int i;
        int i2 = this.b;
        int i3 = 6;
        int i4 = 2;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                ContextUser contextUser = (ContextUser) obj2;
                Collection<Integer> collection = (Collection) obj;
                if (contextUser != null) {
                    contextUser.e = collection;
                }
                return s3q0.a;
            case 1:
                CommunityNotificationSettingsFragment communityNotificationSettingsFragment = (CommunityNotificationSettingsFragment) obj2;
                xqt xqtVar = (xqt) obj;
                int i5 = CommunityNotificationSettingsFragment.b0;
                if ((xqtVar != null ? xqtVar.a : null) != null) {
                    ArrayList arrayList = new ArrayList();
                    int a2 = iah0.a(8);
                    for (p3j0 p3j0Var : xqtVar.a) {
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<q3j0> arrayList3 = p3j0Var.b;
                        if (arrayList3 != null) {
                            if (!arrayList3.isEmpty()) {
                                arrayList2.add(new CommunityNotificationSettingsFragment.f(p3j0Var.a));
                                Iterator it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(communityNotificationSettingsFragment.new e((q3j0) it.next()));
                                }
                            }
                            if6.b bVar = new if6.b(arrayList2);
                            bVar.b = a2;
                            bVar.a(bVar.e, false);
                            arrayList.addAll(arrayList2);
                        }
                    }
                    if (communityNotificationSettingsFragment.Y) {
                        if6.b bVar2 = new if6.b(e43.a(communityNotificationSettingsFragment.new b()));
                        List<we6> list = bVar2.e;
                        bVar2.a(list, false);
                        arrayList.addAll(list);
                    }
                    VkTopBar vkTopBar = communityNotificationSettingsFragment.U;
                    if (vkTopBar == null) {
                        vkTopBar = null;
                    }
                    if (communityNotificationSettingsFragment.Y) {
                        a = null;
                    } else {
                        gko.b bVar3 = gko.Companion;
                        a = VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_done_24), tq.h(tlo0.Companion, R.string.community_notifications_save), new p5h(communityNotificationSettingsFragment, r7 ? 1 : 0), null, new b8g(e3m.f(R.attr.vk_ui_icon_accent, communityNotificationSettingsFragment.requireContext())), com.vk.core.compose.component.semantics.b.a(null, new xr0(21), 3), 8), null, 6);
                    }
                    vkTopBar.setAfter(a);
                    communityNotificationSettingsFragment.X.setItems(arrayList);
                    com.vk.notifications.settings.c cVar = communityNotificationSettingsFragment.V;
                    if (cVar == null) {
                        cVar = null;
                    }
                    cVar.f0();
                } else if ((xqtVar != null ? xqtVar.c : 0) >= (xqtVar != null ? xqtVar.b : 0)) {
                    com.vk.notifications.settings.c cVar2 = communityNotificationSettingsFragment.V;
                    if (cVar2 == null) {
                        cVar2 = null;
                    }
                    cVar2.qg(new com.vk.notifications.settings.a(communityNotificationSettingsFragment));
                } else {
                    com.vk.notifications.settings.c cVar3 = communityNotificationSettingsFragment.V;
                    if (cVar3 == null) {
                        cVar3 = null;
                    }
                    cVar3.qg(new com.vk.notifications.settings.b(communityNotificationSettingsFragment));
                }
                com.vk.notifications.settings.c cVar4 = communityNotificationSettingsFragment.V;
                (cVar4 != null ? cVar4 : null).Mk();
                return s3q0.a;
            case 2:
                tjh tjhVar = (tjh) obj2;
                Pair pair = (Pair) obj;
                d5v d5vVar = (d5v) pair.j();
                return Boolean.valueOf(((d5vVar instanceof d5v.b) || (d5vVar instanceof d5v.a) || (d5vVar instanceof d5v.c)) ? epx.f(pair.i(), tjhVar.a) : false);
            case 3:
                CommunityRepliesFragment communityRepliesFragment = (CommunityRepliesFragment) obj2;
                List<? extends hfz> list2 = (List) obj;
                RepliesView repliesView = communityRepliesFragment.S;
                if (repliesView != null) {
                    repliesView.g(list2);
                }
                RepliesView repliesView2 = communityRepliesFragment.S;
                if (repliesView2 != null) {
                    repliesView2.c();
                }
                return s3q0.a;
            case 4:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d dVar = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) obj2;
                dVar.b0(false);
                dVar.p.b(new vyh.f(tq.h(tlo0.Companion, R.string.default_network_error)));
                return s3q0.a;
            case 5:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) obj2;
                List<? extends qtd0> list3 = (List) obj;
                if (aVar.t == 2) {
                    aVar.Y0(list3);
                    com.vk.im.ui.components.contacts.b b1 = aVar.b1();
                    b1.getClass();
                    com.vk.im.ui.components.contacts.b.c(new jcj(b1, list3, b1));
                } else {
                    com.vk.im.ui.components.contacts.b b12 = aVar.b1();
                    boolean z = !aVar.H;
                    b12.getClass();
                    com.vk.im.ui.components.contacts.b.c(new gcj(z, b12, list3));
                }
                return s3q0.a;
            case 6:
                tij tijVar = (tij) obj2;
                L.g(tijVar.b1(), (Throwable) obj);
                tijVar.o1();
                return s3q0.a;
            case 7:
                ((CropImageView) ((com.vk.avatarpicker.a) obj2).b.invoke()).b((Bitmap) obj, new com.vk.crop.g(r0.getWidth(), r0.getHeight()), true, null);
                return s3q0.a;
            case 8:
                akl aklVar = (akl) obj2;
                aklVar.f = 0;
                aklVar.i.r(true);
                return s3q0.a;
            case 9:
                Throwable th = (Throwable) obj;
                L.i(th);
                ((fxl) obj2).T(new qxl.g.a(th));
                return s3q0.a;
            case 10:
                com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f fVar = (com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj2;
                ?? r0 = fVar.g;
                ?? r2 = fVar.f;
                com.vk.superapp.multiaccount.api.f fVar2 = (com.vk.superapp.multiaccount.api.f) obj;
                if (fVar2 != null) {
                    ((TextView) r2.getValue()).setVisibility(0);
                    fVar.a().setVisibility(0);
                    bvd0 bvd0Var = fVar.p;
                    String a3 = bvd0Var.a(fVar2);
                    if (fVar2.a().d()) {
                        Context context = fVar.c.getContext();
                        fVar.e.getClass();
                        valueOf = k15.o(context, "", fVar2.a().l);
                    } else {
                        String str = fVar2.a().e;
                        String str2 = str != null ? str : "";
                        if (str2.length() == 0) {
                            str2 = fVar2.a().f;
                        }
                        String replace = str2 != null ? str2.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null;
                        valueOf = replace != null ? SpannableString.valueOf(replace) : null;
                    }
                    ((TextView) r2.getValue()).setText(k15.i(fVar.b.getContext(), SpannableString.valueOf(fVar2.a().c), fVar2.a().i, fVar2.a().h, false));
                    ((TextView) r0.getValue()).setText(valueOf);
                    ((ViewGroup) fVar.m.getValue()).setContentDescription(a3);
                    awt0.v((TextView) r0.getValue(), !(valueOf == null || valueOf.length() == 0));
                    VkProfileAvatarView a4 = fVar.a();
                    if (!epx.f(fVar2.a().o, Boolean.TRUE)) {
                        Integer num = fVar2.a().j;
                        UserSecurityStatus.Companion.getClass();
                        int i6 = b3i0.a.$EnumSwitchMapping$0[UserSecurityStatus.a.a(num).ordinal()];
                        if (i6 == 1) {
                            protectionIndicatorType = VkProfileAvatarView.ProtectionIndicatorType.ORANGE;
                        } else if (i6 == 2) {
                            protectionIndicatorType = VkProfileAvatarView.ProtectionIndicatorType.RED;
                        }
                        a4.setType(protectionIndicatorType);
                        fVar.a().c.setContent(new c.d(fVar2.a().d, null));
                        fVar.a().setContentDescription(bvd0Var.a(fVar2));
                    }
                    protectionIndicatorType = null;
                    a4.setType(protectionIndicatorType);
                    fVar.a().c.setContent(new c.d(fVar2.a().d, null));
                    fVar.a().setContentDescription(bvd0Var.a(fVar2));
                } else {
                    ((TextView) r2.getValue()).setVisibility(4);
                    fVar.a().setVisibility(4);
                }
                return s3q0.a;
            case 11:
                ukq ukqVar = (ukq) obj2;
                s39 s39Var = (s39) obj;
                LinearLayoutManager linearLayoutManager = ukqVar.C;
                int v = linearLayoutManager.v();
                ukqVar.B.setItems(s39Var.a);
                linearLayoutManager.scrollToPosition(v);
                ukqVar.y.setEnabled(s39Var.b);
                ukqVar.D.post(new qo4(ukqVar, i4));
                return s3q0.a;
            case 12:
                Map map = (Map) obj2;
                v1s v1sVar = (v1s) obj;
                List<xyr> list4 = v1sVar.c;
                ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    ?? r3 = (xyr) it2.next();
                    if (r3 instanceof m1s.a) {
                        r3 = (m1s.a) r3;
                        spm spmVar = (spm) map.get(Integer.valueOf(r3.a));
                        if (spmVar != null) {
                            r3 = new m1s.a(r3.a, r3.b, r3.c, m1s.s(spmVar));
                        }
                    }
                    arrayList4.add(r3);
                }
                return v1s.a(v1sVar, null, arrayList4, null, map, false, false, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);
            case 13:
                fws fwsVar = (fws) obj2;
                g4l0 g4l0Var = (g4l0) obj;
                if (g4l0Var instanceof t1l0) {
                    fwsVar.a.b = ((t1l0) g4l0Var).a;
                    fwsVar.m.onNext(((afi0) fwsVar.h.c).b());
                }
                return s3q0.a;
            case 14:
                wgv wgvVar = (wgv) obj;
                izs<? super wgv, s3q0> izsVar = ((HslRecyclerView) obj2).b;
                if (izsVar != null) {
                    izsVar.invoke(wgvVar);
                }
                return s3q0.a;
            case 15:
                return quv.i((quv) obj2, ((Boolean) obj).booleanValue());
            case 16:
                int i7 = ImagePickerActivity.p;
                ((ImagePickerActivity) obj2).finish();
                return s3q0.a;
            case 17:
                wzx wzxVar = (wzx) obj2;
                gzx gzxVar = (gzx) obj;
                wzx.a aVar2 = wzxVar.g;
                Context context2 = wzxVar.h;
                ProgressBar progressBar = aVar2.d;
                boolean z2 = gzxVar.e;
                progressBar.setVisibility(z2 ? 0 : 8);
                aVar2.e.setEnabled(!z2);
                Toolbar toolbar = aVar2.a;
                ((TextView) toolbar.findViewById(R.id.title_text)).setText(gzxVar.c);
                TextView textView = (TextView) toolbar.findViewById(R.id.subtitle_text);
                int i8 = gzxVar.b;
                textView.setText(i8 == 0 ? context2.getResources().getString(R.string.voip_history_ongoing_call_no_participants) : context2.getResources().getQuantityString(R.plurals.voip_history_ongoing_call_participants_count, i8, Integer.valueOf(i8)));
                ((ImageView) toolbar.findViewById(R.id.ongoing_call_scan_device_qr_code_button)).setVisibility(gzxVar.a ? 0 : 8);
                wzx.a.C3965a c3965a = aVar2.f;
                FrameLayout frameLayout = c3965a.d;
                ViewFlipper viewFlipper = c3965a.a;
                ImageView imageView = c3965a.b;
                ImageView imageView2 = c3965a.c;
                x9p x9pVar = wzxVar.b;
                if (gzxVar.g) {
                    imageView2.setImageResource(R.drawable.vk_icon_voice_24);
                    imageView2.setContentDescription(context2.getString(R.string.voip_accessibility_mic_off));
                } else {
                    imageView2.setImageResource(R.drawable.vk_icon_microphone_slash_24);
                    imageView2.setContentDescription(context2.getString(R.string.voip_accessibility_mic_on));
                }
                if (gzxVar.f) {
                    imageView.setImageResource(R.drawable.vk_icon_videocam_28);
                    imageView.setContentDescription(context2.getString(R.string.voip_accessibility_camera_off));
                    sp.g(viewFlipper, 1);
                    if (x9pVar != null) {
                        x9pVar.c(frameLayout, new xzx());
                    }
                } else {
                    imageView.setImageResource(R.drawable.vk_icon_videocam_slash_alt_28);
                    imageView.setContentDescription(context2.getString(R.string.voip_accessibility_camera_on));
                    sp.g(viewFlipper, 0);
                    if (x9pVar != null) {
                        x9pVar.b(frameLayout);
                    }
                }
                gzx.a aVar3 = gzxVar.d;
                wzx.a.b bVar4 = aVar2.b;
                View view = bVar4.a;
                ?? r7 = bVar4.d;
                TextView textView2 = bVar4.c;
                TextView textView3 = bVar4.b;
                boolean z3 = aVar3 instanceof gzx.a.d;
                view.setVisibility(z3 ? 8 : 0);
                if (aVar3 instanceof gzx.a.c) {
                    gzx.a.c cVar5 = (gzx.a.c) aVar3;
                    textView3.setText(cVar5.a);
                    textView2.setText(context2.getText(R.string.voip_change_name_profile_description));
                    ImageList imageList = cVar5.b;
                    AvatarView.a aVar4 = AvatarView.y;
                    r7.T0(imageList, null);
                } else if (aVar3 instanceof gzx.a.b) {
                    gzx.a.b bVar5 = (gzx.a.b) aVar3;
                    textView3.setText(bVar5.a);
                    textView2.setText(context2.getText(R.string.voip_change_name_group_desription));
                    ImageList imageList2 = bVar5.b;
                    AvatarView.a aVar5 = AvatarView.y;
                    r7.T0(imageList2, null);
                } else if (aVar3 instanceof gzx.a.C2962a) {
                    textView3.setText(((gzx.a.C2962a) aVar3).a);
                    textView2.setText(context2.getText(R.string.voip_change_name_anonym_title));
                    Drawable a5 = m33.a(R.drawable.bg_anonym_avatar, context2);
                    LayerDrawable layerDrawable = (LayerDrawable) (a5 != null ? a5.mutate() : null);
                    Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.voip_anonym_icon_incognito_layer);
                    Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.voip_anonym_background_layer);
                    int color = context2.getColor(R.color.vk_steel_gray_150);
                    int color2 = context2.getColor(R.color.vk_white);
                    findDrawableByLayerId.setTint(color);
                    findDrawableByLayerId2.setTint(color2);
                    r7.T0(null, layerDrawable);
                } else if (!z3) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 18:
                g0z g0zVar = (g0z) obj2;
                bn40.d("Failed to load searched tracks");
                g0zVar.c(g0zVar.a, "net_error");
                return s3q0.a;
            case 19:
                ((zcz) obj2).e.onNext(new mcz.f());
                return s3q0.a;
            case 20:
                xgv xgvVar = (xgv) obj2;
                ii00 ii00Var = (ii00) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Got managed group event " + ii00Var});
                }
                if (ii00Var.equals(ii00.e.a) || ii00Var.equals(ii00.b.a)) {
                    xgvVar.invoke(hi00.a.b.a);
                } else if (ii00Var.equals(ii00.a.a)) {
                    xgvVar.invoke(hi00.a.C2999a.a);
                }
                return s3q0.a;
            case 21:
                tj50.a aVar6 = (tj50.a) obj;
                viu viuVar = new viu(i3);
                ao8 ao8Var = ao8.d;
                return new l110.a(aVar6.a(viuVar, ao8Var), aVar6.a(new x2e((e110) obj2, 28), ao8Var));
            case 22:
                return new s540((ViewGroup) obj, ((i810) obj2).i);
            case 23:
                jd10 jd10Var = (jd10) obj2;
                io.reactivex.rxjava3.disposables.c cVar6 = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar7 = jd10Var.p;
                if (cVar7 != null) {
                    cVar7.dispose();
                }
                jd10Var.p = cVar6;
                return s3q0.a;
            case 24:
                ModalPostAllReactionsFragment modalPostAllReactionsFragment = (ModalPostAllReactionsFragment) obj2;
                int i9 = ModalPostAllReactionsFragment.Z;
                TextView textView4 = modalPostAllReactionsFragment.V;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                VkRecyclerPaginatedView vkRecyclerPaginatedView = modalPostAllReactionsFragment.T;
                if (vkRecyclerPaginatedView != null) {
                    vkRecyclerPaginatedView.setVisibility(8);
                }
                ProgressBar progressBar2 = modalPostAllReactionsFragment.W;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(0);
                }
                return s3q0.a;
            case 25:
                androidx.compose.ui.graphics.a aVar7 = (androidx.compose.ui.graphics.a) obj2;
                ggj ggjVar = (ggj) obj;
                er9.b a0 = ggjVar.a0();
                long d = a0.d();
                a0.a().e();
                try {
                    a0.a.b(aVar7, 0);
                    ggjVar.s1();
                    nq.b(a0, d);
                    return s3q0.a;
                } catch (Throwable th2) {
                    nq.b(a0, d);
                    throw th2;
                }
            case 26:
                Attach attach = (Attach) obj;
                return Boolean.valueOf((attach instanceof AttachAudioMsg) && ((AttachAudioMsg) attach).xb() == ((si30) obj2).d);
            case 27:
                return Boolean.valueOf(((Msg) obj).b == ((Msg) obj2).b);
            case 28:
                qx5 qx5Var = (qx5) obj;
                if (qq2.d(((g440) ((u440) obj2).s).getRequireContext())) {
                    qx5Var.r();
                }
                return s3q0.a;
            default:
                lb40 lb40Var = (lb40) obj2;
                int i10 = lb40.a.$EnumSwitchMapping$0[((LoopMode) obj).ordinal()];
                if (i10 == 1) {
                    i = R.string.music_talkback_player_repeat_mode_playlist;
                } else if (i10 == 2) {
                    i = lb40Var.g() ? R.string.music_kids_talkback_player_repeat_mode_track : R.string.music_talkback_player_repeat_mode_track;
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.music_talkback_player_repeat_mode_turn_off;
                }
                return Integer.valueOf(i);
        }
    }

    public /* synthetic */ rmg(Map map, m1s m1sVar) {
        this.b = 12;
        this.c = map;
    }
}
