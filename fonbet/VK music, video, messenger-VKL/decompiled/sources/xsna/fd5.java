package xsna;

import android.content.Context;
import android.widget.EditText;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.stat.VkOnboardingStat$Type;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b6i0;
import xsna.f0r;
import xsna.pyn;
import xsna.ubx;
import xsna.zp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class fd5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fd5(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x026e, code lost:
    
        if (r0 == null) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27, types: [T, com.vk.movika.sdk.base.ui.k] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        pyn pynVar;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                jd5 jd5Var = (jd5) obj4;
                UserId userId = (UserId) obj3;
                VideoFile videoFile = (VideoFile) obj2;
                xc6 xc6Var = (xc6) obj;
                u2o u2oVar = xc6Var instanceof u2o ? (u2o) xc6Var : null;
                if (u2oVar != null) {
                    o5o o5oVar = jd5Var.f;
                    Boolean bool = u2oVar.c;
                    u2o u2oVar2 = (u2o) xc6Var;
                    pynVar = o5oVar.a(bool != null ? bool.booleanValue() : userId.equals(videoFile.getUid()), u2oVar2.a, u2oVar2.b, true ^ videoFile.U());
                    break;
                }
                pynVar = pyn.a.a;
                return new AboutVideoItem.d.a(pynVar);
            case 1:
                ArrayList arrayList = ((v8s) obj4).a;
                int i3 = 5;
                ((nvy) obj).e(arrayList.size(), new u3c(new od3(i3), arrayList), new v3c(i2, arrayList, new io3(i3)), new jai(802480018, new w3c(arrayList, (l5c) obj3, (izs) obj2), true));
                return s3q0.a;
            case 2:
                lti ltiVar = (lti) obj4;
                ckv ckvVar = (ckv) obj3;
                yjv yjvVar = (yjv) obj2;
                m63.j(m63.c(), new Pair("network.available", Boolean.valueOf(((y260) ltiVar.e.getValue()).a())));
                wbd0 wbd0Var = ltiVar.m;
                if (wbd0Var != null) {
                    try {
                        wbd0Var.a(ckvVar);
                        wbd0Var.c(ckvVar);
                    } catch (Throwable th) {
                        if (wbd0Var != null) {
                            wbd0Var.b(ckvVar);
                        }
                        throw th;
                    }
                }
                mkv mkvVar = (mkv) vhk0.h(ltiVar.l, "KnetEngine " + ltiVar.o + " execute", new kti(ltiVar, ckvVar, yjvVar, i2), 6);
                if (wbd0Var == null) {
                    return mkvVar;
                }
                okv okvVar = mkvVar.g;
                if (okvVar != null) {
                    return mkv.b(mkvVar, null, okvVar.p(new vbd0(okvVar.n(), wbd0Var, ckvVar)), 31);
                }
                wbd0Var.b(ckvVar);
                return mkvVar;
            case 3:
                f0r f0rVar = (f0r) obj4;
                nj50<? super qvq, ? super c2r> nj50Var = (nj50) obj3;
                s4r s4rVar = (s4r) obj2;
                vw50 vw50Var = (vw50) obj;
                ArrayList f = f0rVar.e().f(vw50Var.a);
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add(((FeedItem) next).b1())) {
                        arrayList2.add(next);
                    }
                }
                f0rVar.i(nj50Var, arrayList2, new f0r.m(PaginationKey.LoadedFull.b, vw50Var.b), s4rVar, ubx.b.a, null, null);
                return s3q0.a;
            case 4:
                PublishState publishState = (PublishState) obj;
                VkOnboardingComponent vkOnboardingComponent = ((gce0) obj3).m;
                VkOnboardingStat$Type vkOnboardingStat$Type = VkOnboardingStat$Type.Tooltip;
                VkOnboardingComponent.Companion companion = VkOnboardingComponent.Companion;
                return PublishState.a(publishState, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, (VkOnboardingCampaign) obj4, vkOnboardingComponent.ac(vkOnboardingStat$Type, (String) obj2), true, publishState.E, null, false, false, null, false, false, false, false, 1073741823, 2044);
            case 5:
                ((ny00) obj4).a((Context) obj2, (Good) obj3);
                return s3q0.a;
            case 6:
                ProfileFriendsFragment profileFriendsFragment = (ProfileFriendsFragment) obj4;
                EditText editText = (EditText) obj3;
                String str = (String) obj2;
                androidx.appcompat.app.d dVar = profileFriendsFragment.d0;
                if (dVar != null) {
                    dVar.dismiss();
                }
                String obj5 = editText.getText().toString();
                if (drm0.p0(obj5).toString().length() == 0) {
                    return s3q0.a;
                }
                if (!obj5.equals(str)) {
                    FriendsListParams oo = profileFriendsFragment.oo();
                    FriendsListParams.FriendListCreation friendListCreation = oo instanceof FriendsListParams.FriendListCreation ? (FriendsListParams.FriendListCreation) oo : null;
                    if (friendListCreation != null) {
                        friendListCreation.d = -1;
                    }
                }
                zwd0 zwd0Var = (zwd0) profileFriendsFragment.S;
                if (zwd0Var != null) {
                    zwd0Var.Tm(obj5);
                }
                return s3q0.a;
            case 7:
                ((enh0) obj4).c((UserId) obj3, (CatalogProfileLocalState.FollowSource) obj2);
                return s3q0.a;
            case 8:
                myc0.h((yvj) obj4, null, null, new b6i0.b((gho) obj3, (wh50) obj2, null), 3);
                return s3q0.a;
            case 9:
                izs izsVar = (izs) obj3;
                Throwable th2 = (Throwable) obj;
                if (((zfj0) obj4).a.b()) {
                    izsVar.invoke(th2);
                }
                return s3q0.a;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                UserProfileDialogs userProfileDialogs = (UserProfileDialogs) obj2;
                zp0.a aVar = (zp0.a) obj;
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj4).element;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                ref$ObjectRef.element = new com.vk.movika.sdk.base.ui.k(25, userProfileDialogs, aVar);
                return s3q0.a;
        }
    }
}
