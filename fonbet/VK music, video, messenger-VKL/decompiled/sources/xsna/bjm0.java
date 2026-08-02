package xsna;

import android.content.Intent;
import android.util.Size;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.video.VideoSave;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.log.L;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.storycamera.picker.template.ui.StoryTemplateFragment;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.ui.friends.VkFriendsPickerActivity;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.upload.impl.tasks.VideoUploadTaskNew;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.growth.VideoGrowthButtons;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ajw0;
import xsna.b89;
import xsna.buw0;
import xsna.ca9;
import xsna.edw0;
import xsna.fjm0;
import xsna.fmw0;
import xsna.g69;
import xsna.gm50;
import xsna.i8w0;
import xsna.ikv0;
import xsna.m5x0;
import xsna.owm;
import xsna.p7w0;
import xsna.pxw0;
import xsna.qn60;
import xsna.spw0;
import xsna.utw0;
import xsna.xcw0;
import xsna.ytw0;
import xsna.yyb;
import xsna.zlw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class bjm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bjm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:287:0x0599, code lost:
    
        if (r1 != 4) goto L302;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [xsna.pi10] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        VideoGrowthButtons.a aVar;
        int i;
        buw0.c cVar;
        String str;
        Set<CallMemberId> set;
        Set<CallMemberId> set2;
        Set<CallMemberId> set3;
        Set<CallMemberId> set4;
        Map<String, whr0> map;
        Collection<CallMemberId> collection;
        Set<CallMemberId> set5;
        int i2 = this.b;
        int i3 = 0;
        r3 = false;
        boolean z = false;
        boolean z2 = true;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                fjm0 fjm0Var = (fjm0) obj;
                int i4 = StoryTemplateFragment.U;
                gjm0 gjm0Var = (gjm0) ((StoryTemplateFragment) obj2).T.getValue();
                gjm0Var.getClass();
                if (!(fjm0Var instanceof fjm0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                StoryBoxPrepared storyBoxPrepared = ((fjm0.a) fjm0Var).a;
                com.vk.storycamera.builder.a aVar2 = new com.vk.storycamera.builder.a(gjm0Var.a().b, gjm0Var.a().c);
                aVar2.b(gjm0Var.a());
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                aVar2.G0 = true;
                aVar2.A(storyBoxPrepared);
                FragmentImpl fragmentImpl = gjm0Var.a;
                Intent B = aVar2.B(fragmentImpl.kn(), true);
                ?? activity = fragmentImpl.getActivity();
                ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
                ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
                if (Y == null || !Y.q(19470, B, fragmentImpl)) {
                    fragmentImpl.startActivityForResult(B, 19470, null);
                }
                return s3q0.a;
            case 1:
                UserId userId = (UserId) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        break;
                    } else {
                        i3 = 3;
                    }
                    i0q0.j(new xw2(userId, i3, 1));
                    return s3q0.a;
                }
                i3 = 1;
                i0q0.j(new xw2(userId, i3, 1));
                return s3q0.a;
            case 2:
                WallWithCounters wallWithCounters = (WallWithCounters) obj2;
                qn60.c cVar2 = (qn60.c) obj;
                return new j5n0(cVar2.a, cVar2.b, wallWithCounters, wallWithCounters.i());
            case 3:
                ?? r2 = ((cwp0) obj2).a;
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new oml((Mask) it.next()));
                }
                r2.accept(arrayList);
                return s3q0.a;
            case 4:
                ber0 ber0Var = (ber0) obj2;
                mfu0 mfu0Var = ber0Var.c;
                if (((Boolean) obj).booleanValue()) {
                    mfu0Var.n(JsApiMethodType.ALLOW_NOTIFICATIONS, new JSONObject().put("result", true));
                } else {
                    if (mfu0Var.o()) {
                        mfu0Var.j(JsApiMethodType.ALLOW_NOTIFICATIONS, VkAppsErrors.Client.i(VkAppsErrors.Client.INACTIVE_SCREEN, null, null, 7));
                        return s3q0.a;
                    }
                    SuperappUiRouterBridge.a.g gVar = SuperappUiRouterBridge.a.g.a;
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    (superappUiRouterBridge != null ? superappUiRouterBridge : null).g0(gVar, new cer0(ber0Var));
                    tau0 d = ber0Var.a.d();
                    if (d != null) {
                        d.e(MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_NOTIFICATIONS, MiniAppSettingsBoxAction.SHOW);
                    }
                }
                return s3q0.a;
            case 5:
                oor0 oor0Var = ((ror0) obj2).e;
                if (oor0Var != null) {
                    oor0Var.t2();
                }
                return s3q0.a;
            case 6:
                lqr0 lqr0Var = (lqr0) obj2;
                jj0 jj0Var = lqr0Var.l;
                yyb.a aVar3 = lqr0Var.w;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                DialogMember c = aVar3.c();
                yyb.a aVar4 = lqr0Var.w;
                if (aVar4 == null) {
                    aVar4 = null;
                }
                ProfilesInfo e = aVar4.e();
                yyb.a aVar5 = lqr0Var.w;
                jj0Var.f(c, e, (aVar5 != null ? aVar5 : null).d());
                return s3q0.a;
            case 7:
                VideoAutoPlay.e eVar = (VideoAutoPlay.e) obj;
                ((wzs) obj2).invoke(eVar.a, eVar.b);
                return s3q0.a;
            case 8:
                return Collections.singletonList(new AboutVideoItem.m(((VideoFile) obj2).Y3().size(), (String) obj));
            case 9:
                return Boolean.valueOf(((Map) obj2).keySet().contains(Integer.valueOf(((RecyclerView.e0) obj).getItemViewType())));
            case 10:
                ((com.vk.video.ui.discovery.minimizable.related_videos.k) obj2).e.invoke((c.s0.d) obj);
                return s3q0.a;
            case 11:
                VideoGrowthButtons videoGrowthButtons = (VideoGrowthButtons) obj2;
                if (videoGrowthButtons.h != null && (aVar = videoGrowthButtons.b) != null) {
                    aVar.onClick();
                }
                return s3q0.a;
            case 12:
                ikv0 ikv0Var = ((nht0) obj2).f;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                return s3q0.a;
            case 13:
                VideoUploadTaskNew videoUploadTaskNew = (VideoUploadTaskNew) obj2;
                VideoSave.a aVar6 = (VideoSave.a) obj;
                VideoUploadTaskNew.d.a aVar7 = VideoUploadTaskNew.d.g;
                VideoUploadTaskNew.d g0 = VideoUploadTaskNew.g0();
                aVar7.getClass();
                int i5 = aVar6.f;
                Integer valueOf = Integer.valueOf(i5);
                if (i5 < 0) {
                    valueOf = null;
                }
                int intValue2 = valueOf != null ? valueOf.intValue() : g0.a;
                int i6 = aVar6.g;
                Integer valueOf2 = Integer.valueOf(i6);
                if (i6 <= 0) {
                    valueOf2 = null;
                }
                int intValue3 = valueOf2 != null ? valueOf2.intValue() : g0.b;
                long j = aVar6.h;
                Long valueOf3 = Long.valueOf(j);
                if (j <= 0) {
                    valueOf3 = null;
                }
                long longValue = valueOf3 != null ? valueOf3.longValue() : g0.c;
                long j2 = aVar6.i;
                Long valueOf4 = Long.valueOf(j2);
                if (j2 <= 0) {
                    valueOf4 = null;
                }
                long longValue2 = valueOf4 != null ? valueOf4.longValue() : g0.d;
                double d2 = aVar6.j;
                Double valueOf5 = Double.valueOf(d2);
                if (d2 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    valueOf5 = null;
                }
                videoUploadTaskNew.J = new VideoUploadTaskNew.d(intValue2, intValue3, longValue, longValue2, valueOf5 != null ? (float) valueOf5.doubleValue() : g0.e, g0.f);
                videoUploadTaskNew.B = aVar6.c;
                videoUploadTaskNew.C = aVar6.b;
                if (videoUploadTaskNew.y) {
                    String str2 = aVar6.d;
                    String str3 = aVar6.e;
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        String str4 = str3.length() > 0 ? str3 : null;
                        if (str4 != null) {
                            str2 = str4;
                        }
                    }
                    fxc0.B().E().k(videoUploadTaskNew.d, str2);
                }
                return aVar6.a;
            case 14:
                ((q9u0) obj2).O(owm.b.b);
                return s3q0.a;
            case 15:
                FragmentActivity activity2 = ((ubu0) obj2).getActivity();
                if (activity2 != null) {
                    activity2.onBackPressed();
                }
                return s3q0.a;
            case 16:
                VkFriendsPickerActivity vkFriendsPickerActivity = (VkFriendsPickerActivity) obj2;
                String str5 = (String) obj;
                iwu0 iwu0Var = vkFriendsPickerActivity.n;
                if (iwu0Var == null) {
                    iwu0Var = null;
                }
                com.vk.lists.c cVar3 = vkFriendsPickerActivity.g;
                com.vk.lists.c cVar4 = cVar3 != null ? cVar3 : null;
                if (!str5.equals(iwu0Var.f)) {
                    iwu0Var.f = str5;
                    cVar4.p(false);
                }
                return s3q0.a;
            case 17:
                VkTopBarSearchQueryVh vkTopBarSearchQueryVh = (VkTopBarSearchQueryVh) obj2;
                tho0 tho0Var = (tho0) obj;
                VkTopBarSearchQueryVh.b bVar = vkTopBarSearchQueryVh.r;
                VkTopBar.Middle.d dVar = bVar.g;
                vkTopBarSearchQueryVh.h(VkTopBarSearchQueryVh.b.a(bVar, false, null, false, null, false, dVar != null ? VkTopBar.Middle.d.a(dVar, null, tho0Var, false, null, 4093) : null, false, null, null, 959));
                vkTopBarSearchQueryVh.p.onNext(tho0Var.a.c);
                return s3q0.a;
            case 18:
                ((m6w0) obj2).T((p7w0.f.b) obj);
                return s3q0.a;
            case 19:
                e8w0 e8w0Var = (e8w0) obj2;
                bwt0.p0(e8w0Var.n, false);
                bwt0.p0(e8w0Var.o, true);
                e8w0Var.t.a(false);
                f4m.v(0, e8w0Var.m);
                gm50.a.a(e8w0Var, ((i8w0.d) obj).a, new egt0(e8w0Var, 8));
                return s3q0.a;
            case 20:
                bdw0 bdw0Var = (bdw0) obj2;
                Throwable th = (Throwable) obj;
                if (!(th instanceof VKApiExecutionException)) {
                    bdw0Var.i.b(new fmw0.a(th));
                } else if (((VKApiExecutionException) th).s() == 9002) {
                    bdw0Var.T(edw0.b.C2796b.b);
                } else {
                    bdw0Var.i.b(new fmw0.a(th));
                }
                return s3q0.a;
            case 21:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj2;
                ajw0 ajw0Var = (ajw0) obj;
                int i7 = VoipCallServiceFragment.Y;
                int i8 = 6;
                if (ajw0Var instanceof ajw0.b) {
                    shw0 shw0Var = ((ajw0.b) ajw0Var).a;
                    FragmentActivity activity3 = voipCallServiceFragment.getActivity();
                    if (activity3 != null) {
                        g2v.c().getClass();
                        szv.a(k9u0.a, activity3, null, new com.vk.movika.sdk.base.logic.processor.actions.e(28, voipCallServiceFragment, shw0Var), new qmj0(7), new o7k0(i8, voipCallServiceFragment, shw0Var), 2);
                    }
                } else if (ajw0Var instanceof ajw0.a) {
                    ajw0.a aVar8 = (ajw0.a) ajw0Var;
                    if (aVar8 instanceof ajw0.a.C2547a) {
                        i = R.string.voip_vkapp_services_friend_added;
                    } else {
                        if (!(aVar8 instanceof ajw0.a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R.string.voip_vkapp_services_friend_follow;
                    }
                    ikv0.a aVar9 = new ikv0.a(voipCallServiceFragment.requireContext());
                    aVar9.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) null, (Size) null, 14);
                    aVar9.u = new ikv0.d(voipCallServiceFragment.getString(i), (String) null, (ikv0.d.a) null, 6);
                    aVar9.n();
                } else {
                    if (!(ajw0Var instanceof ajw0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tfu0 tfu0Var = voipCallServiceFragment.U;
                    if (tfu0Var != null) {
                        tfu0Var.invoke();
                    }
                }
                return s3q0.a;
            case 22:
                ((vlw0) obj2).l.b(zlw0.a.a);
                return s3q0.a;
            case 23:
                ((kpw0) obj2).T((spw0.a.b) obj);
                return s3q0.a;
            case 24:
                nrw0 nrw0Var = (nrw0) obj2;
                FeatureId featureId = FeatureId.VMOJI;
                h69 h69Var = nrw0Var.M;
                if (h69Var != null) {
                    h69Var.d.onNext(new g69.e(featureId));
                }
                nrw0Var.q(xcw0.g.a);
                return s3q0.a;
            case 25:
                stw0 stw0Var = (stw0) obj2;
                s99 s99Var = (s99) obj;
                CallMemberId callMemberId = stw0Var.f;
                ca9 ca9Var = s99Var.c;
                if (!(ca9Var instanceof ca9.a) && !epx.f(ca9Var, ca9.b.a) && !epx.f(ca9Var, ca9.d.a)) {
                    if (!(ca9Var instanceof ca9.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ca9.c cVar5 = ca9Var != null ? (ca9.c) ca9Var : null;
                    ?? r9 = (cVar5 == null || (set5 = cVar5.d) == null || !set5.contains(callMemberId)) ? false : true;
                    ?? r22 = (cVar5 == null || (collection = cVar5.k) == null || !collection.contains(callMemberId)) ? false : true;
                    if (r9 == false && r22 == false) {
                        stw0Var.l.b(utw0.a.a);
                        return s3q0.a;
                    }
                }
                b89.h hVar = stw0Var.n.a(s99Var).a;
                if (hVar instanceof b89.h.c) {
                    stw0Var.T(new ytw0.c(true));
                    stw0Var.T(ytw0.a.b);
                } else if (hVar instanceof b89.h.a) {
                    stw0Var.T(new ytw0.c(false));
                    stw0Var.T(new ytw0.b(((b89.h.a) hVar).a));
                } else {
                    if (!(hVar instanceof b89.h.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stw0Var.T(new ytw0.c(false));
                    stw0Var.T(ytw0.a.b);
                    ttw0 ttw0Var = stw0Var.i;
                    ca9.c cVar6 = ca9Var instanceof ca9.c ? (ca9.c) ca9Var : null;
                    b89.h.b bVar2 = (b89.h.b) hVar;
                    CallMemberId callMemberId2 = ttw0Var.a;
                    if (cVar6 == null) {
                        cVar = new buw0.c(0);
                    } else {
                        CallMemberId callMemberId3 = cVar6.b;
                        boolean contains = cVar6.D.contains(callMemberId3);
                        boolean contains2 = cVar6.C.contains(callMemberId3);
                        if (!contains && !contains2) {
                            z2 = false;
                        }
                        cVar = new buw0.c(callMemberId3, z2);
                    }
                    whr0 whr0Var = (cVar6 == null || (map = cVar6.m) == null) ? null : map.get(callMemberId2.b);
                    CallMemberId callMemberId4 = ttw0Var.a;
                    boolean z3 = bVar2.l;
                    boolean f = epx.f(cVar6 != null ? cVar6.b : null, callMemberId4);
                    sew0 sew0Var = bVar2.a;
                    String obj3 = bVar2.b.toString();
                    if (whr0Var == null || (str = whr0Var.u) == null) {
                        str = "";
                    }
                    buw0.b bVar3 = new buw0.b(callMemberId4, f, z3, sew0Var, obj3, str, whr0Var != null ? whr0Var.c : false);
                    boolean contains3 = (cVar6 == null || (set4 = cVar6.n) == null) ? false : set4.contains(callMemberId2);
                    boolean contains4 = (cVar6 == null || (set3 = cVar6.p) == null) ? false : set3.contains(callMemberId2);
                    boolean contains5 = (cVar6 == null || (set2 = cVar6.r) == null) ? false : set2.contains(callMemberId2);
                    if (cVar6 != null && (set = cVar6.s) != null) {
                        z = set.contains(callMemberId2);
                    }
                    stw0Var.T(new ytw0.d(new buw0(false, null, cVar, bVar3, new buw0.d(contains3, contains4, contains5, z, bVar2.n), new buw0.a(bVar2.e, bVar2.m, bVar2.k, bVar2.r.a, bVar2.t, bVar2.w, bVar2.i, 1))));
                }
                return s3q0.a;
            case 26:
                ((lyw0) obj2).l.a(pxw0.q.a);
                return s3q0.a;
            case 27:
                L.i((Throwable) obj);
                ((v5x0) obj2).C(m5x0.i.b);
                return s3q0.a;
            default:
                Object obj4 = ((vkx0) obj2).o;
                ((skx0) (obj4 != null ? obj4 : null)).g();
                return s3q0.a;
        }
    }

    public /* synthetic */ bjm0(kwm0 kwm0Var, UserId userId) {
        this.b = 1;
        this.c = userId;
    }
}
