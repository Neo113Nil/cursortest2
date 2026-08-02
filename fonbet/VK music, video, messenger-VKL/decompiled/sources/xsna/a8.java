package xsna;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.clip.ClipMusicTemplatesCatalogFragment;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.donut.ChannelDonutSupportFragment;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorDecisionState;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorPendingItem;
import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.groups.GroupPrivacy;
import com.vk.im.engine.models.groups.MemberStatus;
import com.vk.im.ui.components.common.DndPeriod;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;
import com.vk.libvideo.live.impl.broadcast_settings.BroadcastSettingsFragment;
import com.vk.log.L;
import com.vk.photos.root.albumdetails.presentation.d;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import com.vkontakte.android.fragments.AwayWebViewFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.aw9;
import xsna.dd9;
import xsna.ea6;
import xsna.fnc;
import xsna.gdn;
import xsna.hcd;
import xsna.ki8;
import xsna.qvq;
import xsna.rls;
import xsna.sn4;
import xsna.usc;
import xsna.ycb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a8 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v82, types: [xsna.dqb$a, xsna.j8i] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.im.engine.models.dialogs.c ic;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof fyr0) {
                    fyr0 fyr0Var = (fyr0) bwr0Var;
                    VideoFile videoFile = fyr0Var.a;
                    VideoFile videoFile2 = fyr0Var.a;
                    AboutVideoItem.SimilarVideoRedesign similarVideoRedesign = (AboutVideoItem.SimilarVideoRedesign) linkedHashMap.get(videoFile.r1());
                    if (similarVideoRedesign == null) {
                        break;
                    } else {
                        String r1 = videoFile2.r1();
                        noj0 noj0Var = similarVideoRedesign.b;
                        linkedHashMap.put(r1, AboutVideoItem.SimilarVideoRedesign.a(similarVideoRedesign, new noj0(videoFile2, noj0Var.b, noj0Var.c, null), false, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
                        break;
                    }
                } else if (bwr0Var instanceof oxr0) {
                    oxr0 oxr0Var = (oxr0) bwr0Var;
                    AboutVideoItem.SimilarVideoRedesign similarVideoRedesign2 = (AboutVideoItem.SimilarVideoRedesign) linkedHashMap.get(oxr0Var.a.r1());
                    if (similarVideoRedesign2 == null) {
                        break;
                    } else {
                        linkedHashMap.put(oxr0Var.a.r1(), AboutVideoItem.SimilarVideoRedesign.a(similarVideoRedesign2, null, oxr0Var.b, false, 125));
                        break;
                    }
                } else if (bwr0Var instanceof ayr0) {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        AboutVideoItem.SimilarVideoRedesign similarVideoRedesign3 = (AboutVideoItem.SimilarVideoRedesign) entry.getValue();
                        linkedHashMap.put(str, AboutVideoItem.SimilarVideoRedesign.a(similarVideoRedesign3, null, false, fxc0.B().c(similarVideoRedesign3.b.a), Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
                    }
                    break;
                } else if (bwr0Var instanceof wxr0) {
                    wxr0 wxr0Var = (wxr0) bwr0Var;
                    String str2 = wxr0Var.b;
                    VideoFile videoFile3 = wxr0Var.a;
                    if (!epx.f(str2, "videos_remove") || !o25.a().a(videoFile3.I0()) || linkedHashMap.remove(videoFile3.r1()) == null) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                ((AbsFriendsAndFollowersTabFragment) obj2).U.b(rls.a.a);
                break;
            case 2:
                ((gg1) obj2).T(new d.m((PhotoAlbum) obj));
                break;
            case 3:
                ((gq1) obj2).e.invoke(Boolean.TRUE);
                break;
            case 4:
                break;
            case 5:
                ((f15) obj2).k.a.invoke(new gdn.a.C2932a((String) obj));
                break;
            case 6:
                AwayWebViewFragment awayWebViewFragment = (AwayWebViewFragment) obj2;
                Throwable th = (Throwable) obj;
                int i2 = AwayWebViewFragment.t0;
                if (th instanceof Exception) {
                    awayWebViewFragment.onError(th);
                }
                break;
            case 7:
                break;
            case 8:
                ea6.a aVar = (ea6.a) obj2;
                Throwable th2 = (Throwable) obj;
                if (ea6.d(th2)) {
                    break;
                } else {
                    break;
                }
            case 9:
                yp80 yp80Var = (yp80) obj2;
                if (yp80Var != null) {
                    yp80Var.U();
                }
                break;
            case 10:
                ((BroadcastSettingsFragment.b) obj2).invoke(new ki8.e((BroadcastStream) obj));
                break;
            case 11:
                ((n69) obj2).c.b((t69) obj);
                break;
            case 12:
                int i3 = CallParticipantsFragment.W;
                ((CallParticipantsFragment) obj2).tn();
                break;
            case 13:
                ((id9) obj2).e.onNext((dd9.a) obj);
                break;
            case 14:
                lh9.d(((dl9) obj2).d, (Bitmap) obj);
                break;
            case 15:
                int i4 = ChannelDonutSupportFragment.V;
                ((ChannelDonutSupportFragment) obj2).getFeature().C((com.vk.channels.impl.donut.a) obj);
                break;
            case 16:
                int i5 = ChannelFragment.a1;
                sf20 ro = ((ChannelFragment) obj2).ro();
                int i6 = ((wb80) ((sxp) obj)).d;
                vm30 vm30Var = ro.o;
                if (vm30Var != null) {
                    ok30 ok30Var = vm30Var.H;
                    Iterator it = ok30Var.x0(MsgIdType.CNV_ID, i6).iterator();
                    while (it.hasNext()) {
                        ok30Var.notifyItemChanged(((Number) it.next()).intValue());
                    }
                }
                break;
            case 17:
                io.reactivex.rxjava3.subjects.d<ycb> dVar = ((adb) obj2).c;
                Channel channel = (Channel) obj;
                boolean z = channel.D != MemberStatus.MEMBER;
                GroupPrivacy groupPrivacy = channel.B;
                if (groupPrivacy == GroupPrivacy.CLOSED && z) {
                    dVar.onNext(new ycb.a());
                } else if (groupPrivacy == GroupPrivacy.PRIVATE && z) {
                    dVar.onNext(new ycb.b());
                } else {
                    dVar.onNext(ycb.d.a);
                }
                break;
            case 18:
                ((dqb) obj2).c.k();
                break;
            case 19:
                ChatFragment chatFragment = (ChatFragment) obj2;
                Boolean bool = (Boolean) obj;
                DialogExt dialogExt = chatFragment.V;
                if (dialogExt == null) {
                    dialogExt = null;
                }
                Dialog Cb = dialogExt.Cb();
                if (Cb != null && (ic = Cb.ic()) != null) {
                    alm almVar = chatFragment.c1;
                    if (almVar == null) {
                        almVar = null;
                    }
                    almVar.d(ic);
                }
                com.vk.im.ui.components.msg_list.a aVar2 = chatFragment.H0;
                (aVar2 != null ? aVar2 : null).d2(bool.booleanValue());
                break;
            case 20:
                ((ktb) obj2).i.b5((esb) obj);
                break;
            case 21:
                DndPeriod dndPeriod = (DndPeriod) obj;
                tsu tsuVar = ((azb) obj2).k;
                if (tsuVar != null) {
                    tsuVar.f(dndPeriod.i(), false);
                }
                break;
            case 22:
                z4c z4cVar = (z4c) obj2;
                Throwable th3 = (Throwable) obj;
                L.i(th3);
                mzp0 mzp0Var = z4cVar.f;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                z4cVar.T(new aw9.c.a(th3));
                break;
            case 23:
                fnc fncVar = (fnc) obj2;
                ClipCoauthorDecisionState clipCoauthorDecisionState = (ClipCoauthorDecisionState) obj;
                List<ClipCoauthorPendingItem> list = clipCoauthorDecisionState.b;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (ClipCoauthorPendingItem clipCoauthorPendingItem : list) {
                    UserId userId = ((fnc.d) fncVar).b;
                    ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
                    clipsFeatures.getClass();
                    boolean a = com.vk.toggle.b.A.a(clipsFeatures);
                    Owner owner = clipCoauthorPendingItem.b;
                    boolean z2 = clipCoauthorPendingItem.c;
                    if (epx.f(owner.b, userId)) {
                        if (!a || !z2) {
                            z2 = true;
                            arrayList.add(new ClipCoauthorPendingItem(clipCoauthorPendingItem.b, z2));
                        }
                        z2 = false;
                        arrayList.add(new ClipCoauthorPendingItem(clipCoauthorPendingItem.b, z2));
                    } else {
                        if (a) {
                            arrayList.add(new ClipCoauthorPendingItem(clipCoauthorPendingItem.b, z2));
                        }
                        z2 = false;
                        arrayList.add(new ClipCoauthorPendingItem(clipCoauthorPendingItem.b, z2));
                    }
                }
                break;
            case 24:
                qcy<Object>[] qcyVarArr = isc.t1;
                ((btc) obj2).b(new usc.a.c((String) obj));
                break;
            case 25:
                ClipMusicTemplatesCatalogFragment clipMusicTemplatesCatalogFragment = (ClipMusicTemplatesCatalogFragment) obj2;
                int i7 = ClipMusicTemplatesCatalogFragment.U;
                StringBuilder sb = new StringBuilder("ClipMusicTemplatesCatalogFragment success activity = ");
                FragmentActivity activity = clipMusicTemplatesCatalogFragment.getActivity();
                sb.append(activity != null ? qjg.a(activity) : null);
                L.e("TemplateFlow", sb.toString());
                clipMusicTemplatesCatalogFragment.finish();
                break;
            case 26:
                ((VkImageSimple) ((hcd.a) obj2).b.getValue()).setImageBitmap((Bitmap) obj);
                break;
            case 27:
                ((io.reactivex.rxjava3.core.r) obj2).onNext(new sn4.a(((Float) obj).floatValue()));
                break;
            case 28:
                ((u6e) obj2).C(new qvq.d.a((SdkExternalNpsCondition) obj));
                break;
            default:
                uaf.a((VkBanner) obj, new q((afe) obj2, 24));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ a8(g9u0 g9u0Var, ea6.a aVar) {
        this.b = 8;
        this.c = aVar;
    }
}
