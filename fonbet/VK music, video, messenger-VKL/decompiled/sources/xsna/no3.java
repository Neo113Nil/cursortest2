package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.Address;
import com.vk.lists.DefaultErrorView;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import xsna.sdh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class no3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ no3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Triple triple;
        ImageSize Cb;
        int i = this.b;
        int i2 = 6;
        int i3 = 7;
        String str = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                oo3 oo3Var = (oo3) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj4 = oo3Var.C;
                ImageView imageView = oo3Var.N;
                if (((gmq) obj2).equals(obj4) && imageView != null) {
                    imageView.setActivated(booleanValue);
                }
                if (imageView != null) {
                    imageView.setContentDescription(booleanValue ? oo3Var.v6(R.string.fave_accessibility_remove_from_favorite) : oo3Var.v6(R.string.fave_accessibility_add_to_favorite));
                }
                break;
            case 1:
                com.vk.cameraui.impl.a aVar = (com.vk.cameraui.impl.a) obj3;
                List<nov> list = (List) obj;
                ((Boolean) obj2).getClass();
                WebStoryBox webStoryBox = aVar.c.u;
                if (webStoryBox != null && webStoryBox.Db()) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((nov) it.next()).C0());
                    }
                    aVar.T = com.vk.cameraui.impl.a.c0(arrayList);
                }
                for (nov novVar : list) {
                    novVar.setStickerAlpha(163);
                    aVar.k0.a(novVar);
                }
                break;
            case 2:
                ((vmh) obj3).a.d.invoke(new CommunityProfileAction.e.d.b((Address) obj, ((Boolean) obj2).booleanValue()));
                break;
            case 3:
                hfx hfxVar = (hfx) obj3;
                Context context = (Context) obj;
                n3n0 n3n0Var = (n3n0) obj2;
                dw20 dw20Var = n3n0Var.g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                n3n0Var.g = null;
                hfxVar.c.invoke(context);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((tw20) obj3).o(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 5:
                com.vk.catalog2.feature.music.configuration.b bVar = (com.vk.catalog2.feature.music.configuration.b) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                w950.p((w950) bVar.W.getValue(), uIBlockList.b, null, null, 6);
                x2b0.c((x2b0) bVar.X.getValue(), uIBlockList.b, null, 14);
                break;
            case 6:
                dlb dlbVar = new dlb((de40) obj3, (UIBlockLink) obj2, (View) obj, i3);
                bpn0 bpn0Var = jjc.a;
                break;
            case 7:
                ggc0 ggc0Var = (ggc0) obj3;
                MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint = (MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint) obj;
                dic0 dic0Var = (dic0) obj2;
                Activity activity = ggc0Var.a;
                if (activity != null) {
                    if (dic0Var == null) {
                        m6r0 a = hd60.a().a();
                        UserId y = a.y();
                        String r = a.r();
                        Image image = (Image) ((bxx) a.a(m6r0.D0));
                        if (image != null && (Cb = image.Cb(iah0.a(32), true, false)) != null) {
                            str = Cb.d.d;
                        }
                        triple = new Triple(y, r, str);
                    } else {
                        triple = new Triple(dic0Var.a, dic0Var.b, dic0Var.c);
                    }
                    UserId userId = (UserId) triple.d();
                    String str2 = (String) triple.g();
                    String str3 = (String) triple.h();
                    com.vk.storycamera.builder.a aVar2 = new com.vk.storycamera.builder.a(ggc0Var.b.getRef(), creationEntryPoint);
                    aVar2.E0 = true;
                    aVar2.q(userId, str2, str3);
                    aVar2.C(activity);
                }
                break;
            case 8:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                DefaultErrorView defaultErrorView = ((ReactionsFeedFragment) obj3).c0;
                if (defaultErrorView != null) {
                    defaultErrorView.setVisibility(booleanValue2 ? 0 : 8);
                }
                break;
            case 9:
                ((afi0) obj3).g(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                break;
            case 10:
                zdm0 zdm0Var = (zdm0) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1746987529, intValue, -1, "com.vk.story.viewer.impl.presentation.holders.StoryStatHolder.bindData.<anonymous> (StoryStatHolder.kt:19)");
                    }
                    rrv0.e(true, null, null, null, null, null, kai.c(750203930, new s77(zdm0Var, 13), aVar3), aVar3, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 11:
                szm0 szm0Var = (szm0) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1355973541, intValue2, -1, "com.vk.video.ui.discovery.minimizable.player.views.SubscriptionProposalHolder.setContent.<anonymous> (SubscriptionProposalHolder.kt:153)");
                    }
                    sdh0 sdh0Var = (sdh0) nr2.s(szm0Var.k, null, null, aVar4, 48, 2).getValue();
                    if (sdh0Var instanceof sdh0.b) {
                        aVar4.K(1640696189);
                        rrv0.e(true, null, null, null, null, null, kai.c(-142038937, new ys0(i2, szm0Var, (sdh0.b) sdh0Var), aVar4), aVar4, 1572870, 62);
                        aVar4 = aVar4;
                    } else {
                        aVar4.K(1633817661);
                    }
                    aVar4.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((erq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ no3(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
