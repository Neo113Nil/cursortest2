package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.avatarpicker.AuthAvatarPickerActivity;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.favorites.impl.ui.folders.picker.c;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.utils.newtork.NetworkState;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.messages.WritePermission;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.dialogs.TransitionData;
import com.vk.im.engine.models.groups.AdminLevel;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.profile.user.impl.ui.b;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.dzb;
import xsna.gob;
import xsna.h7u0;
import xsna.i9b;
import xsna.nwb;
import xsna.r1r0;
import xsna.tj50;
import xsna.vp1;
import xsna.xxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class mb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        int i;
        boolean z;
        String k;
        int i2 = this.b;
        int i3 = 9;
        int i4 = 13;
        int i5 = 1;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                rb rbVar = (rb) obj2;
                return rsg0.w0(yfb.x(r1r0.a.b(rbVar.d, Collections.singletonList(rbVar.a), rbVar.g, null, null, 58))).l(new pb(new ob(0), 0));
            case 1:
                f31 f31Var = (f31) obj2;
                rc0 rc0Var = (rc0) ((it80) obj).a;
                if (rc0Var != null) {
                    izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = f31Var.f;
                    (izsVar != null ? izsVar : null).invoke(new b.a.C1706b(rc0Var));
                } else {
                    izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar2 = f31Var.f;
                    (izsVar2 != null ? izsVar2 : null).invoke(b.a.C1705a.b);
                }
                return s3q0.a;
            case 2:
                gg1 gg1Var = (gg1) obj2;
                gg1Var.p.b(i.e.a);
                gg1Var.W();
                return s3q0.a;
            case 3:
                ((com.vk.movika.sdk.base.logic.interactor.p) obj2).invoke(new vp1.g(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 4:
                bw2 bw2Var = (bw2) obj2;
                List<lhk0> list = ((fw2) obj).b;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (lhk0 lhk0Var : list) {
                    gw2 gw2Var = bw2Var.e;
                    String str2 = bw2Var.d.b;
                    gw2Var.getClass();
                    arrayList.add(gw2.a(lhk0Var, str2));
                }
                return arrayList;
            case 5:
                AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment = (AppearanceSettingsWithBackgroundsFragment) obj2;
                Triple triple = (Triple) obj;
                int i6 = AppearanceSettingsWithBackgroundsFragment.b0;
                boolean booleanValue = ((Boolean) triple.d()).booleanValue();
                boolean booleanValue2 = ((Boolean) triple.g()).booleanValue();
                boolean booleanValue3 = ((Boolean) triple.h()).booleanValue();
                if (booleanValue) {
                    String string = appearanceSettingsWithBackgroundsFragment.requireContext().getString(R.string.sett_appearance_list_system_hint_placeholder);
                    String string2 = appearanceSettingsWithBackgroundsFragment.requireContext().getString(R.string.sett_appearance_list_system_hint_value, string);
                    ?? spannableStringBuilder = new SpannableStringBuilder(string2);
                    spannableStringBuilder.setSpan(new AppearanceSettingsWithBackgroundsFragment.b(2, Integer.valueOf(dhr0.t.c(R.attr.vk_ui_text_accent))), drm0.K(0, 6, string2, string, false), string2.length(), 34);
                    str = spannableStringBuilder;
                } else {
                    str = appearanceSettingsWithBackgroundsFragment.requireContext().getString(R.string.sett_appearance_list_auto_hint);
                }
                boolean z2 = (booleanValue || booleanValue2) && !booleanValue3;
                TextView textView = appearanceSettingsWithBackgroundsFragment.X;
                TextView textView2 = textView;
                if (textView == null) {
                    textView2 = null;
                }
                textView2.setText(str);
                TextView textView3 = appearanceSettingsWithBackgroundsFragment.X;
                (textView3 == null ? null : textView3).setVisibility(z2 ? 0 : 8);
                return s3q0.a;
            case 6:
                dn4 dn4Var = (dn4) obj2;
                ((xh50) dn4Var.e.getValue()).setValue(Boolean.valueOf(dn4Var.b()));
                return s3q0.a;
            case 7:
                int i7 = AuthAvatarPickerActivity.i;
                ((AuthAvatarPickerActivity) obj2).Q1();
                return s3q0.a;
            case 8:
                p66 p66Var = (p66) obj2;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    p66Var.u0(th);
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    vggVar.c();
                }
                return s3q0.a;
            case 9:
                Object obj3 = ((zk6) obj2).o;
                ((oud0) (obj3 != null ? obj3 : null)).a();
                return s3q0.a;
            case 10:
                int i8 = BaseSharingExternalActivity.Z;
                ((BaseSharingExternalActivity) obj2).finish();
                return s3q0.a;
            case 11:
                return new kk7((ViewGroup) obj, (BonusCatalogFragment) obj2);
            case 12:
                h58 h58Var = (h58) obj2;
                Throwable th2 = (Throwable) obj;
                h58Var.getClass();
                if ((th2 instanceof VKApiExecutionException) && ((VKApiExecutionException) th2).s() == -1 && (i = h58Var.f) < 1) {
                    h58Var.f = i + 1;
                    io.reactivex.rxjava3.disposables.b bVar = h58Var.c;
                    com.vk.core.utils.newtork.b.a.getClass();
                    bVar.b(com.vk.core.utils.newtork.b.f().t0(1L).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new hv(new com.vk.movika.sdk.base.observable.o(h58Var, i3), 5)));
                }
                return s3q0.a;
            case 13:
                ((m99) obj2).d(new j5((Boolean) obj, i3));
                return s3q0.a;
            case 14:
                return new Pair(j5g.Y(((AlbumEntry) j5g.Y((List) obj)).d), Boolean.valueOf(((Ref$BooleanRef) obj2).element));
            case 15:
                ((k9k) obj2).b((s730) obj);
                return s3q0.a;
            case 16:
                ((zak0) ((noa) obj2).m).setValue((String) obj);
                return s3q0.a;
            case 17:
                ChannelFragment channelFragment = (ChannelFragment) obj2;
                int i9 = ChannelFragment.a1;
                PopupStickerAnimation popupStickerAnimation = ((AttachSticker) obj).g.k;
                if (popupStickerAnimation != null) {
                    channelFragment.zo(popupStickerAnimation);
                }
                return s3q0.a;
            case 18:
                s4b s4bVar = (s4b) obj2;
                uib a = ((xgl0) obj).a();
                Peer peer = s4bVar.d;
                bdb c = a.c(peer.b);
                long j = peer.b;
                xgl0 I0 = s4bVar.c.I0();
                int r = ad0.B(I0.a().B(j)) ? I0.system().r(j) : I0.system().j();
                if (c == null || c.r != r) {
                    return null;
                }
                return c;
            case 19:
                InstantJob instantJob = (InstantJob) obj;
                return Boolean.valueOf((instantJob instanceof e7b) && epx.f(((e7b) instantJob).c, ((c7b) obj2).b));
            case 20:
                i9b i9bVar = (i9b) obj2;
                i9b.a aVar = (i9b.a) obj;
                qza qzaVar = i9bVar.r;
                Context context = i9bVar.f;
                Channel channel = aVar.a;
                i9bVar.v = channel;
                String str3 = channel.v;
                AdminLevel adminLevel = channel.u;
                ChannelType channelType = channel.z;
                boolean z3 = (drm0.N(str3) || ad0.B(channelType)) ? false : true;
                nwb.j jVar = new nwb.j(new ChatProfileListItem.d(channel.v));
                if (!z3) {
                    jVar = null;
                }
                nwb.b bVar2 = new nwb.b(new ChatProfileListItem.j(18, context.getString(R.string.vkim_channels_profile_personal_channel_settings), R.drawable.vk_icon_settings_outline_28, null, false, false, false, 96));
                if (channelType != ChannelType.PERSONAL_CHANNEL || adminLevel != AdminLevel.ADMIN) {
                    bVar2 = null;
                }
                String string3 = context.getString(R.string.vkim_channels_profile_community_channel_monetization);
                r9b r9bVar = i9bVar.w;
                q7v0 q7v0Var = r9bVar.a;
                VkOnboardingCampaign e = q7v0Var.e("me:channel_profile_action_donut_android");
                nwb.b bVar3 = new nwb.b(new ChatProfileListItem.g(string3, e != null ? q7v0Var.d(e) : false));
                ImFeatures imFeatures = ImFeatures.DONUTS_EASY_FLOW_IN_CHANNEL;
                imFeatures.getClass();
                if (com.vk.toggle.b.A.a(imFeatures) && channelType == ChannelType.COMMUNITY_CHANNEL) {
                    z = adminLevel == AdminLevel.ADMIN && channel.M;
                    if (z && bVar3.b.f) {
                        r9bVar.a.c(new no(r9bVar, 13));
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    bVar3 = null;
                }
                List I = rl3.I(new nwb[]{jVar, bVar2, bVar3});
                boolean z4 = !ad0.B(channelType) && adminLevel == AdminLevel.ADMIN;
                boolean z5 = (channel.S || z4) ? false : true;
                boolean z6 = channelType == ChannelType.COMMUNITY_CHANNEL && adminLevel == AdminLevel.ADMIN;
                boolean n = i9bVar.q.n();
                List<xub> b = qzaVar.b(context, channel, i9bVar.b);
                List<xub> a2 = qzaVar.a(channel, context, z4, n);
                String i10 = i9bVar.j.i(channel, false);
                ImageList imageList = channel.c;
                Channel channel2 = i9bVar.v;
                if (ad0.B(channel2 != null ? channel2.z : null)) {
                    Integer num = aVar.a.G;
                    k = num == null ? "" : uqm0.i(num.intValue(), R.plurals.vkim_channel_subscribers_count, R.string.vkim_channel_subscribers_count_formatted, true);
                } else {
                    Integer num2 = aVar.b;
                    k = num2 != null ? uqm0.k(num2.intValue(), R.plurals.vkim_channel_subscribers_count) : i9bVar.k ? context.getString(R.string.vkim_group) : context.getString(R.string.vkim_channel);
                }
                return new xxd0.b((CharSequence) i10, "", k, (CharSequence) "", new VerifyInfo(channel.f, false, false, false, false, false, 62, null), z4, z5, false, channel.S, z6, imageList, (Drawable) null, (AvatarBorderType) null, (List) b, (List) a2, I, ((ArrayList) I).isEmpty(), (ImStoryState) null, (WritePermission) null, (TransitionData) null, false, 4069376);
            case 21:
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.b(new mh3(i5, (ymb) obj2, (gob.a) obj));
                return s3q0.a;
            case 22:
                return ((wpp) obj).d((LinkedHashSet) obj2);
            case 23:
                ((dzb.a) obj2).m.f();
                return s3q0.a;
            case 24:
                slc slcVar = (slc) obj2;
                Context context2 = slcVar.a;
                VideoFile videoFile = (VideoFile) j5g.a0((List) obj);
                if (videoFile == null) {
                    slcVar.a();
                } else {
                    VideoRestriction O = videoFile.O();
                    if (O == null || e5o.b(O)) {
                        jgd k0 = slcVar.b.x().k0();
                        if (k0.b()) {
                            fxc0.B().Y().k(slcVar.a, videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                        } else {
                            k0.a(context2);
                        }
                    } else {
                        int i11 = h7u0.p;
                        h7u0.a c2 = h7u0.b.c(context2);
                        c2.h0(O.b);
                        String str4 = O.c;
                        if (!drm0.N(str4)) {
                            c2.a.f = str4;
                        }
                        c2.c0(R.string.clips_full_video_restricted_dialog_understand, null);
                        c2.m();
                    }
                }
                return s3q0.a;
            case 25:
                int intValue = ((Integer) obj).intValue();
                int i12 = ClipFeedListFragment.a2;
                FeedItem yo = ((ClipFeedListFragment) obj2).yo(intValue);
                if (yo != null) {
                    return new Pair(yo, yo.F());
                }
                return null;
            case 26:
                wid widVar = (wid) obj2;
                widVar.e.onNext(Boolean.FALSE);
                widVar.f = null;
                return s3q0.a;
            case 27:
                vod vodVar = (vod) obj2;
                Throwable th3 = (Throwable) obj;
                if (h03.a(th3)) {
                    hg1.f(vodVar.g);
                    com.vk.core.utils.newtork.b.a.getClass();
                    io.reactivex.rxjava3.subjects.d<NetworkState> dVar = com.vk.core.utils.newtork.b.e;
                    kf3 kf3Var = new kf3(new mo1(i4), r6);
                    dVar.getClass();
                    vodVar.g = hg1.h(new io.reactivex.rxjava3.internal.operators.observable.i0(dVar, kf3Var).t0(1L), new com.vk.movika.sdk.base.observable.q(vodVar, 24));
                } else {
                    L.i(th3);
                }
                return s3q0.a;
            case 28:
                com.vk.clips.favorites.impl.ui.folders.content.f fVar = (com.vk.clips.favorites.impl.ui.folders.content.f) obj2;
                tj50.a aVar2 = (tj50.a) obj;
                iz izVar = new iz(fVar, 25);
                ao8 ao8Var = ao8.d;
                return new ClipsFavoriteFolderContentListViewState.b(aVar2.a(izVar, ao8Var), aVar2.a(new com.vk.movika.sdk.base.observable.o(fVar, 19), ao8Var), aVar2.a(new qb(14), ao8Var));
            default:
                ((com.vk.clips.favorites.impl.ui.folders.picker.b) obj2).T(new c.e.C0611c((b4e) obj));
                return s3q0.a;
        }
    }
}
