package xsna;

import android.content.Context;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.utils.a;
import com.vk.dto.common.Image;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.photo.CropPhoto;
import com.vk.dto.user.ProfileActionButton;
import com.vk.dto.user.ProfileDescription;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.common.presentation.model.items.RecommendationsCarouselItemUiDto;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: RecommendedProfileHolderV3.kt */
/* loaded from: classes4.dex */
public final class pef0 extends vif0<RecommendedProfile> {
    public final oef0 n;
    public final gtl0 o;
    public final vv20 p;
    public final vex q;

    public pef0(oef0 oef0Var, gtl0 gtl0Var) {
        super(gtl0Var.itemView, gtl0Var.l);
        this.n = oef0Var;
        this.o = gtl0Var;
        this.p = new vv20(this, 20);
        this.q = new vex(this, 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (r3 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a4  */
    @Override // xsna.vif0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(RecommendedProfile recommendedProfile) {
        Iterable iterable;
        RecommendationsCarouselItemUiDto.b bVar;
        RecommendationsCarouselItemUiDto.a aVar;
        UserProfile d;
        RecommendationsCarouselItemUiDto.ActionButtonData actionButtonData;
        Object obj;
        List<Image> list;
        RecommendationsCarouselItemUiDto.a.InterfaceC1369a.b bVar2;
        RecommendedProfile recommendedProfile2 = recommendedProfile;
        Context context = this.itemView.getContext();
        this.n.getClass();
        Object obj2 = com.vk.core.utils.a.a;
        a.C0794a e = com.vk.core.utils.a.e(recommendedProfile2.d().B, VerifyInfoHelper.ColorTheme.normal);
        RecommendationsCarouselItemUiDto.c cVar = new RecommendationsCarouselItemUiDto.c(recommendedProfile2.d().e, e != null ? Integer.valueOf(e.a) : null, e != null ? Integer.valueOf(e.b) : null, 18);
        List<ProfileDescription> list2 = recommendedProfile2.d().E;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list2) {
                ProfileDescription.Type type = ((ProfileDescription) obj3).b;
                if (type == ProfileDescription.Type.TEXT || type == ProfileDescription.Type.ICON) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = ((ProfileDescription) it.next()).e;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            iterable = j5g.H0(arrayList2, 2);
        }
        iterable = EmptyList.b;
        String g0 = j5g.g0(iterable, " · ", null, null, 0, null, 62);
        Image image = recommendedProfile2.d().O;
        CropPhoto cropPhoto = recommendedProfile2.d().Q;
        if (cropPhoto != null) {
            Image image2 = cropPhoto.b.y;
            CropPhoto.Crop crop = cropPhoto.c;
            bVar = new RecommendationsCarouselItemUiDto.b(image2, new RecommendationsCarouselItemUiDto.b.a(crop.b, crop.d, crop.c, crop.e));
        } else {
            bVar = image != null ? new RecommendationsCarouselItemUiDto.b(image, null) : null;
        }
        List<ProfileDescription> list3 = recommendedProfile2.d().E;
        if (list3 != null) {
            Iterator<T> it2 = list3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((ProfileDescription) obj).b == ProfileDescription.Type.IMAGES) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ProfileDescription profileDescription = (ProfileDescription) obj;
            if (profileDescription != null) {
                List<Image> list4 = profileDescription.d;
                String str2 = profileDescription.e;
                if (profileDescription.b == ProfileDescription.Type.IMAGES && ((str2 != null && str2.length() != 0) || ((list = list4) != null && !list.isEmpty()))) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    List<Image> list5 = list4;
                    if (list5 == null || list5.isEmpty()) {
                        bVar2 = null;
                    } else {
                        int size = list4.size();
                        if (size > 2) {
                            size = 2;
                        }
                        bVar2 = new RecommendationsCarouselItemUiDto.a.InterfaceC1369a.b(list4.subList(0, size));
                    }
                    aVar = new RecommendationsCarouselItemUiDto.a(str2, bVar2, true);
                    d = recommendedProfile2.d();
                    if (d.s.getInt("friend_request_status", 0) != 0 ? d.j : d.s.getInt("friend_request_status", 0) == 1) {
                        RecommendationsCarouselItemUiDto.ActionButtonData.ActionState actionState = xo9.s(d) ? RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.IN_PROGRESS : RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.NONE;
                        if ((d.e0 == SocialButtonType.FOLLOW) && !(d.v == 2)) {
                            actionButtonData = new RecommendationsCarouselItemUiDto.ActionButtonData(context.getString(R.string.profile_recommendations_subscribe), context.getString(R.string.profile_recommendations_subscribe), null, actionState, 4);
                        } else {
                            ProfileActionButton profileActionButton = d.F;
                            actionButtonData = (profileActionButton != null ? profileActionButton.b : null) == ProfileActionButton.Type.ADD ? new RecommendationsCarouselItemUiDto.ActionButtonData(context.getString(R.string.add), context.getString(R.string.accessibility_add_friend), null, actionState, 4) : (profileActionButton != null ? profileActionButton.b : null) == ProfileActionButton.Type.ACCEPT ? new RecommendationsCarouselItemUiDto.ActionButtonData(context.getString(R.string.friend_request_accept), context.getString(R.string.accessibility_add_friend), null, actionState, 4) : new RecommendationsCarouselItemUiDto.ActionButtonData(context.getString(R.string.add), context.getString(R.string.accessibility_add_friend), null, actionState, 4);
                        }
                    } else {
                        int i = d.v;
                        actionButtonData = new RecommendationsCarouselItemUiDto.ActionButtonData(context.getString((i == 1 || i == 2) ? R.string.friends_recommendations_request_done : (d.e0 == SocialButtonType.FOLLOW) && !(i == 2) ? R.string.profile_recommendations_subscribe_done : R.string.friend_req_sent), null, null, RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.COMPLETED, 6);
                    }
                    RecommendationsCarouselItemUiDto recommendationsCarouselItemUiDto = new RecommendationsCarouselItemUiDto(cVar, g0, bVar, aVar, actionButtonData);
                    vv20 vv20Var = this.p;
                    gtl0 gtl0Var = this.o;
                    gtl0Var.q6(vv20Var);
                    gtl0Var.s6(this.q);
                    gtl0Var.V5(recommendationsCarouselItemUiDto);
                }
            }
        }
        aVar = null;
        d = recommendedProfile2.d();
        if (d.s.getInt("friend_request_status", 0) != 0 ? d.j : d.s.getInt("friend_request_status", 0) == 1) {
        }
        RecommendationsCarouselItemUiDto recommendationsCarouselItemUiDto2 = new RecommendationsCarouselItemUiDto(cVar, g0, bVar, aVar, actionButtonData);
        vv20 vv20Var2 = this.p;
        gtl0 gtl0Var2 = this.o;
        gtl0Var2.q6(vv20Var2);
        gtl0Var2.s6(this.q);
        gtl0Var2.V5(recommendationsCarouselItemUiDto2);
    }
}
