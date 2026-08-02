package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.donut.dto.DonutGroupSettingsDto;
import com.vk.api.generated.donut.dto.DonutGroupSettingsLevelLimitDto;
import com.vk.articles.ArticleFragment;
import com.vk.biometric.auth.api.domain.model.AuthMode;
import com.vk.biometrics.lock.api.domain.model.PinLockLaunchMode;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsFragment;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.f;
import com.vk.camera.clips.core.drafts.ClipsDraftOld;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.reactions.ChannelReactionWebViewFragment;
import com.vk.clips.clipsaudio.data.ActionButtonType;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.entrypoints.ui.a;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.sdk.shared.item.common.restriction.RestrictionOverlayRenderDelegate;
import com.vk.common.links.LaunchContext;
import com.vk.core.preference.Preference;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.articles.Article;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ReactionUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.newsfeed.posting.action_button.presentation.ActionButtonsFragment;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.am9;
import xsna.e2d;
import xsna.eya;
import xsna.fi3;
import xsna.g69;
import xsna.ig3;
import xsna.ikv0;
import xsna.lab;
import xsna.lu4;
import xsna.ly;
import xsna.ogb;
import xsna.uxd0;
import xsna.v59;
import xsna.wbu0;
import xsna.xn50;
import xsna.y2v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Iterator it;
        hfz bVar;
        FeatureId featureId;
        Activity w;
        Window window;
        WindowManager.LayoutParams attributes;
        boolean z = false;
        switch (this.b) {
            case 0:
                VideoFile videoFile = (VideoFile) this.c;
                VKList vKList = (VKList) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = vKList.iterator();
                while (it2.hasNext()) {
                    Image image = ((UserProfile) it2.next()).O;
                    if (image != null) {
                        arrayList.add(image);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : vKList) {
                    if (((UserProfile) obj2).j) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ReactionUserProfile reactionUserProfile = (ReactionUserProfile) it3.next();
                    String string = reactionUserProfile.s.getString("name_dat");
                    if (string == null) {
                        string = reactionUserProfile.s.getString("first_name_dat");
                    }
                    if (string != null) {
                        arrayList3.add(string);
                    }
                }
                return new rjz(videoFile.l1(), arrayList, arrayList3);
            case 1:
                ActionButtonsFragment actionButtonsFragment = (ActionButtonsFragment) this.c;
                ly lyVar = (ly) obj;
                qcy<Object>[] qcyVarArr = ActionButtonsFragment.U;
                if (lyVar instanceof ly.a) {
                    actionButtonsFragment.finish();
                } else if (lyVar instanceof ly.c) {
                    actionButtonsFragment.Mf(426, new Intent().putExtra("selected_action", ((ly.c) lyVar).a));
                } else {
                    if (!(lyVar instanceof ly.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((qdz) actionButtonsFragment.S.getValue()).e().d(actionButtonsFragment.requireContext(), Uri.parse(((ly.b) lyVar).a), LaunchContext.A, null);
                }
                return s3q0.a;
            case 2:
                ((gg1) this.c).C((com.vk.photos.root.albumdetails.presentation.a) obj);
                return s3q0.a;
            case 3:
                ((com.vk.photos.root.albumdetails.presentation.c) this.c).n.submitList(Collections.singletonList((k.b) obj));
                return s3q0.a;
            case 4:
                zg3 zg3Var = (zg3) this.c;
                ogb.a aVar = (ogb.a) obj;
                Collection singletonList = !zg3Var.h.c() ? Collections.singletonList(fi3.a.b) : EmptyList.b;
                List<Channel> list = aVar.a;
                Object obj3 = aVar.b;
                List<Channel> list2 = list;
                ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
                Iterator it4 = list2.iterator();
                Object obj4 = obj3;
                while (it4.hasNext()) {
                    Channel channel = (Channel) it4.next();
                    if (zg3Var.i) {
                        long j = channel.b;
                        it = it4;
                        bVar = new fi3.d(j, channel.c, channel.d, (MsgFromChannel) obj4.get(Long.valueOf(j)), channel.f, channel.Db(qni0.a()), channel.k);
                        obj4 = obj4;
                    } else {
                        it = it4;
                        bVar = new fi3.b(channel.b, channel.c, channel.d, channel.g, zg3Var.g().b.contains(Long.valueOf(channel.b)));
                    }
                    arrayList4.add(bVar);
                    it4 = it;
                    obj4 = obj4;
                }
                return j5g.u0(aVar.f ? Collections.singletonList(fi3.c.b) : EmptyList.b, j5g.u0(arrayList4, singletonList));
            case 5:
                ((nj3) this.c).d.invoke(new ig3.g(((y7a0) obj).a));
                return s3q0.a;
            case 6:
                VKList vKList2 = (VKList) obj;
                ArticleFragment articleFragment = ((rp3) this.c).b;
                Article article = vKList2 != null ? (Article) j5g.a0(vKList2) : null;
                Context requireContext = articleFragment.requireContext();
                ikv0.a aVar2 = new ikv0.a(requireContext);
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                aVar2.u = new ikv0.d(requireContext.getString(R.string.article_saved), (String) null, (ikv0.d.a) null, 6);
                aVar2.n();
                if (article != null) {
                    articleFragment.no(article);
                }
                articleFragment.so();
                return s3q0.a;
            case 7:
                lu4.a.b bVar2 = (lu4.a.b) obj;
                hu4 hu4Var = ((wt4) this.c).i1;
                (hu4Var != null ? hu4Var : null).a(bVar2);
                return s3q0.a;
            case 8:
                r46 r46Var = (r46) this.c;
                r46Var.k(new uxd0.i0(r46Var.c, new defpackage.i((io.reactivex.rxjava3.disposables.c) obj, 7)));
                return s3q0.a;
            case 9:
                wbu0.a aVar3 = (wbu0.a) obj;
                x65 y = ((e66) this.c).y();
                if (y != null) {
                    y.vf(aVar3);
                }
                return s3q0.a;
            case 10:
                Object obj5 = ((a37) this.c).o;
                ((x27) (obj5 != null ? obj5 : null)).O();
                return s3q0.a;
            case 11:
                BiometricsLockSettingsFragment biometricsLockSettingsFragment = (BiometricsLockSettingsFragment) this.c;
                ?? r1 = biometricsLockSettingsFragment.R;
                com.vk.biometrics.lock.impl.presentation.base.mvi.settings.f fVar = (com.vk.biometrics.lock.impl.presentation.base.mvi.settings.f) obj;
                int i = BiometricsLockSettingsFragment.Y;
                if (fVar instanceof f.c) {
                    biometricsLockSettingsFragment.finish();
                } else if (fVar instanceof f.b) {
                    biometricsLockSettingsFragment.getFeature().C(a.b.C0430a.b);
                    ((b87) r1.getValue()).e(biometricsLockSettingsFragment.requireContext(), PinLockLaunchMode.DISABLE_PASSWORD);
                    biometricsLockSettingsFragment.finish();
                } else if (fVar instanceof f.a) {
                    ((b87) r1.getValue()).e(biometricsLockSettingsFragment.requireContext(), PinLockLaunchMode.OLD_PASSWORD);
                } else if (fVar instanceof f.e) {
                    L.G(zy60.c("BiometricsLock: before request-> is available ", " \nis available by hardware ", biometricsLockSettingsFragment.fo().c(biometricsLockSettingsFragment.requireContext()), biometricsLockSettingsFragment.fo().b(biometricsLockSettingsFragment.requireContext())));
                    k47 fo = biometricsLockSettingsFragment.fo();
                    t6e0 t6e0Var = new t6e0(biometricsLockSettingsFragment.getString(R.string.bl_enter_by_biometrics), new s6e0(biometricsLockSettingsFragment.getString(R.string.bl_cancel), false));
                    Object obj6 = r57.a;
                    fo.d(biometricsLockSettingsFragment, t6e0Var, new vjk(AuthMode.ENCRYPTION, "biometrics_lock".getBytes(emb.b)), Preference.f("biometrics_lock"), biometricsLockSettingsFragment);
                } else if (fVar instanceof f.d) {
                    biometricsLockSettingsFragment.getFeature().C(a.b.C0430a.b);
                    ((b87) r1.getValue()).c(biometricsLockSettingsFragment.requireContext());
                } else {
                    int i2 = 3;
                    if (fVar instanceof f.C0435f) {
                        List<ug5> list3 = ((f.C0435f) fVar).a;
                        kmu0 kmu0Var = new kmu0(biometricsLockSettingsFragment.requireContext(), tzp0.a(null, 3));
                        kmu0Var.v(0);
                        kmu0Var.P0();
                        kmu0Var.U0(kai.b(966049448, new mz1(i2, list3, biometricsLockSettingsFragment)));
                        biometricsLockSettingsFragment.X = kmu0Var.I0("BiometricsLockSettingsFragment.showAutoLockTimeBottomSheet");
                    } else if (fVar instanceof f.g) {
                        y2v.a aVar4 = new y2v.a(biometricsLockSettingsFragment.requireContext(), tzp0.a(null, 1));
                        aVar4.J();
                        aVar4.v0(R.string.bl_hide);
                        aVar4.z0(8388611);
                        aVar4.v(0);
                        aVar4.c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
                        aVar4.I0(null);
                    } else if (fVar instanceof f.h) {
                        myc0.h(g5z.a(biometricsLockSettingsFragment.getViewLifecycleOwner()), null, null, new r87(biometricsLockSettingsFragment, biometricsLockSettingsFragment.getString(R.string.bl_pin_password_changed), null), 3);
                    } else {
                        if (!(fVar instanceof f.i)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        n97 n97Var = (n97) biometricsLockSettingsFragment.U.getValue();
                        hsk0 hsk0Var = ((f.i) fVar).a;
                        int a = biometricsLockSettingsFragment.fo().a(biometricsLockSettingsFragment.requireContext());
                        n97Var.getClass();
                        n97.a(hsk0Var, a);
                    }
                }
                return s3q0.a;
            case 12:
                x8a x8aVar = (x8a) this.c;
                k08 k08Var = (k08) obj;
                if (k08Var != null) {
                    x8aVar.b(k08Var);
                }
                return s3q0.a;
            case 13:
                u76 u76Var = ((u48) this.c).m;
                if (u76Var != null) {
                    u76Var.h3();
                }
                return s3q0.a;
            case 14:
                String str = (String) obj;
                qdc0 qdc0Var = ((com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.d) this.c).f;
                if (qdc0Var != null) {
                    qdc0Var.W2(str);
                }
                return s3q0.a;
            case 15:
                h69 h69Var = (h69) this.c;
                FeatureId.a aVar5 = FeatureId.Companion;
                List<String> list4 = ((v59.c) obj).a;
                aVar5.getClass();
                ArrayList arrayList5 = new ArrayList();
                for (String str2 : list4) {
                    FeatureId[] values = FeatureId.values();
                    int length = values.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            featureId = values[i3];
                            if (!epx.f(featureId.h(), str2)) {
                                i3++;
                            }
                        } else {
                            featureId = null;
                        }
                    }
                    if (featureId != null) {
                        arrayList5.add(featureId);
                    }
                }
                h69Var.d.onNext(new g69.a(arrayList5));
                return s3q0.a;
            case 16:
                int i4 = CallParticipantsFragment.W;
                ((kdw0) this.c).b((mdw0) obj);
                return s3q0.a;
            case 17:
                yxa yxaVar = (yxa) this.c;
                DonutGroupSettingsLevelLimitDto d = ((DonutGroupSettingsDto) obj).d();
                yxaVar.T(new eya.d(d != null ? new f0o(d.i(), d.d(), d.g(), d.f(), d.e()) : null));
                return s3q0.a;
            case 18:
                lab labVar = (lab) obj;
                mab mabVar = ((iab) this.c).j1;
                if (mabVar != null) {
                    if (labVar instanceof lab.b) {
                        lab.b bVar3 = (lab.b) labVar;
                        String str3 = bVar3.a;
                        long j2 = bVar3.b.b;
                        int i5 = bVar3.c;
                        int i6 = bVar3.d;
                        int i7 = bVar3.e;
                        ChannelReactionWebViewFragment.a aVar6 = new ChannelReactionWebViewFragment.a(ChannelReactionWebViewFragment.class, null, null);
                        Bundle bundle = aVar6.j;
                        bundle.putString("url_arg", str3);
                        bundle.putLong("channel_id_arg", j2);
                        bundle.putInt("cmid_arg", i5);
                        bundle.putInt("count_arg", i6);
                        bundle.putInt("user_count_before_arg", i7);
                        aVar6.k(mabVar.a);
                    } else if (labVar instanceof lab.c) {
                        maz.c(mabVar.b.e(), mabVar.a, "https://money.mail.ru/img/donation_rules.pdf", LaunchContext.A, null, null, 24);
                    } else {
                        if (!(labVar instanceof lab.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mabVar.c.invoke();
                    }
                }
                return s3q0.a;
            case 19:
                qmb qmbVar = qmb.this;
                fl4 fl4Var = qmbVar.k;
                FragmentActivity fragmentActivity = qmbVar.i;
                View view = qmbVar.g;
                if (view != null && (w = bwt0.w(view)) != null && (window = w.getWindow()) != null && (attributes = window.getAttributes()) != null && (attributes.flags & 8192) == 0) {
                    z = true;
                }
                fl4Var.x(fragmentActivity, !z);
                return s3q0.a;
            case 20:
                ChatFragment chatFragment = (ChatFragment) this.c;
                ChatFragment.d dVar = ChatFragment.w1;
                edw edwVar = edw.a;
                edw.d(R.string.vkim_pinned_msg_not_found, chatFragment.requireContext(), true);
                return s3q0.a;
            case 21:
                return new q6p((ViewGroup) obj, (com.vk.im.ui.components.chat_profile.a) this.c);
            case 22:
                io.reactivex.rxjava3.subjects.d<nbc> dVar2 = ((pbc) this.c).b;
                dVar2.onNext(nbc.a(dVar2.P0(), null, null, false, (Throwable) obj, 3));
                return s3q0.a;
            case 23:
                return new com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.g((ViewGroup) obj, ((gqc) this.c).h);
            case 24:
                u6d u6dVar = (u6d) this.c;
                if (e2d.a.$EnumSwitchMapping$0[((RestrictionOverlayRenderDelegate.RestrictionOverlayAction) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                u6dVar.a(ClipItemViewEvent.m.b);
                return s3q0.a;
            case 25:
                nad nadVar = (nad) this.c;
                rms0 rms0Var = (rms0) obj;
                if (rms0Var != null) {
                    List<UserId> list5 = rms0Var.a;
                    List<Integer> list6 = rms0Var.b;
                    if (list5 == null && list6 == null) {
                        return s3q0.a;
                    }
                    List<PrivacySetting.PrivacyRule> privacy = nadVar.f.getPrivacy();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj7 : privacy) {
                        if (obj7 instanceof PrivacyRules.Exclude) {
                            arrayList6.add(obj7);
                        }
                    }
                    PrivacyRules.Exclude exclude = (PrivacyRules.Exclude) j5g.a0(arrayList6);
                    if (exclude != null) {
                        exclude.c.clear();
                        if (list5 != null) {
                            Iterator it5 = list5.iterator();
                            while (it5.hasNext()) {
                                exclude.Fb((UserId) it5.next());
                            }
                        }
                        if (list6 != null) {
                            Iterator it6 = list6.iterator();
                            while (it6.hasNext()) {
                                exclude.Fb(new UserId(((Number) it6.next()).intValue() + 2000000000));
                            }
                        }
                    }
                    nadVar.X0();
                    nadVar.U0();
                }
                return s3q0.a;
            case 26:
                rgd rgdVar = (rgd) this.c;
                int i8 = ((ModalActionSheetListItem) obj).a;
                if (i8 == ActionButtonType.CHANGE.ordinal()) {
                    rgdVar.f();
                } else if (i8 == ActionButtonType.TRIM.ordinal()) {
                    rgdVar.g(null, rgdVar.c);
                    nf9 nf9Var = nf9.b;
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS;
                    StoryPublishEvent storyPublishEvent = StoryPublishEvent.CUT_AUDIO_CAMERA;
                    am9.a aVar7 = new am9.a();
                    aVar7.j = com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
                    nf9.b(nf9Var, storyPublishEvent, aVar7, null, null, true, null, 108).e();
                } else if (i8 == ActionButtonType.DELETE.ordinal()) {
                    rgdVar.b();
                    nf9 nf9Var2 = nf9.b;
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS;
                    StoryPublishEvent storyPublishEvent2 = StoryPublishEvent.DELETE_AUDIO_CAMERA;
                    am9.a aVar8 = new am9.a();
                    aVar8.j = com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen2);
                    nf9.b(nf9Var2, storyPublishEvent2, aVar8, null, null, true, null, 108).e();
                }
                return s3q0.a;
            case 27:
                ClipsDraftOld clipsDraftOld = (ClipsDraftOld) this.c;
                w9y w9yVar = (w9y) obj;
                w9yVar.e(clipsDraftOld.b, "id");
                w9yVar.c(Integer.valueOf(clipsDraftOld.c), "max_duration");
                w9yVar.e(clipsDraftOld.d, "files");
                w9yVar.e(clipsDraftOld.e, "description");
                w9yVar.d(Long.valueOf(clipsDraftOld.f), "preview_timestamp");
                w9yVar.b(Boolean.valueOf(clipsDraftOld.g), "autosaved");
                w9yVar.c(Integer.valueOf(clipsDraftOld.h), "date");
                w9yVar.b(Boolean.valueOf(clipsDraftOld.i), "is_preview_from_gallery");
                w9yVar.e(clipsDraftOld.j, "preview_uri");
                w9yVar.e(clipsDraftOld.k, "stickers");
                w9yVar.e(clipsDraftOld.t, "audios");
                w9yVar.f("sound_volume", Double.valueOf(clipsDraftOld.l));
                w9yVar.f("music_volume", Double.valueOf(clipsDraftOld.m));
                w9yVar.g("editor_music", clipsDraftOld.n);
                w9yVar.d(clipsDraftOld.o, "delayed_publication_date");
                w9yVar.e(clipsDraftOld.q, "entry_point");
                w9yVar.g("geo_location_attachment", clipsDraftOld.p);
                w9yVar.g("link_attachment", clipsDraftOld.r);
                w9yVar.g("ord_info", clipsDraftOld.u);
                w9yVar.g("duet_info", clipsDraftOld.v);
                w9yVar.g("market_attachment", clipsDraftOld.s);
                w9yVar.f("aspect_ratio", Double.valueOf(clipsDraftOld.w));
                w9yVar.g("playlist", clipsDraftOld.x);
                w9yVar.g("template", clipsDraftOld.y);
                w9yVar.g("video_attachment", clipsDraftOld.z);
                w9yVar.g("user_related_data", clipsDraftOld.A);
                return s3q0.a;
            case 28:
                ((k0e) this.c).f.k();
                return s3q0.a;
            default:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) this.c;
                int i9 = ClipsEntryPointsFragment.i0;
                a.f fVar2 = a.f.b;
                clipsEntryPointsFragment.getClass();
                xn50.a.c(clipsEntryPointsFragment, fVar2);
                return s3q0.a;
        }
    }
}
