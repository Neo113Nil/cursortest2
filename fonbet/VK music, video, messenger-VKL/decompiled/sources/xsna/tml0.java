package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.stories.model.StoryBackground;
import com.vk.dto.user.UserProfile;
import com.vk.feed.design.view.newsfeed.header.VkFeedPostHeaderView;
import com.vk.photo.editor.views.PointerView;
import com.vk.storycamera.picker.ui.c;
import java.io.File;
import java.util.List;
import kotlin.text.Regex;
import xsna.h6x0;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class tml0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ tml0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UserProfile userProfile = null;
        switch (this.b) {
            case 0:
                return bpl0.a((apl0) obj);
            case 1:
                StoryBackground storyBackground = (StoryBackground) obj;
                File e = PrivateFiles.e(e8r.a, PrivateSubdir.STORIES_BACKGROUND, String.valueOf(storyBackground.c), "mp4", 24);
                Regex regex = com.vk.core.files.a.a;
                if (vhk0.g(e) && System.currentTimeMillis() - e.lastModified() <= kql0.d) {
                    return io.reactivex.rxjava3.core.q.T(StoryBackground.zb(storyBackground, null, e, 255));
                }
                int i = 29;
                return new io.reactivex.rxjava3.internal.operators.observable.i0(dug0.a(e, storyBackground.d), new vii0(new per(i), 3)).U(new mrc0(new pb00(storyBackground, i), 4));
            case 2:
                it80.a aVar = it80.b;
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.a0((List) obj);
                if (usersUserFullDto != null) {
                    new j2r0();
                    userProfile = j2r0.a(usersUserFullDto);
                }
                aVar.getClass();
                return new it80(userProfile);
            case 3:
                return c.b.a;
            case 4:
                ryq0 ryq0Var = (ryq0) obj;
                return Boolean.valueOf((ryq0Var.b || ryq0Var.d || ryq0Var.c || (ryq0Var.h.isEmpty() && !ryq0Var.i)) ? false : true);
            case 5:
                mxj0 mxj0Var = (mxj0) obj;
                return new tq2(Float.intBitsToFloat((int) (mxj0Var.a >> 32)), Float.intBitsToFloat((int) (mxj0Var.a & 4294967295L)));
            case 6:
                return null;
            case 7:
                int i2 = VkFeedPostHeaderView.S;
                return com.vk.movika.sdk.base.model.n.a(1.5f);
            case 8:
                q5j q5jVar = (q5j) obj;
                m6j m6jVar = q5jVar.d;
                s5j s5jVar = q5jVar.c;
                jor0.a(m6jVar, s5jVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jor0.a(q5jVar.f, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jcv.b(q5jVar.g, s5jVar.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                return s3q0.a;
            case 9:
                return ahn.C((io.reactivex.rxjava3.core.q) obj);
            case 10:
                return ((wj8) obj).b;
            case 11:
                return h6x0.a.a;
            case 12:
                return Boolean.valueOf(((Attach) obj) instanceof AttachMarket);
            default:
                return Float.valueOf(((PointerView) obj).getInnerCircleRadius());
        }
    }

    public /* synthetic */ tml0(Object obj, int i) {
        this.b = i;
    }
}
