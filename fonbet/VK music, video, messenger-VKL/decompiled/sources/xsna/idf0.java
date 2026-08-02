package xsna;

import android.view.View;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.utils.a;
import com.vk.dto.common.Image;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupLikes;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.common.presentation.model.items.RecommendationsCarouselItemUiDto;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RecommendedGroupHolderV3.kt */
/* loaded from: classes4.dex */
public final class idf0 extends vif0<GroupSuggestion> {
    public final hdf0 n;
    public final gtl0 o;
    public final String p;
    public final boolean q;
    public String r;
    public jdf0 s;
    public final w100 t;
    public final fyd0 u;
    public final q3n0 v;
    public final io.reactivex.rxjava3.disposables.g w;

    public idf0(hdf0 hdf0Var, gtl0 gtl0Var, String str, boolean z) {
        super(gtl0Var.itemView, gtl0Var.l);
        this.n = hdf0Var;
        this.o = gtl0Var;
        this.p = str;
        this.q = z;
        this.t = new w100(this, 29);
        this.u = new fyd0(this, 3);
        this.v = new q3n0(this, FullSourceJoinApi.SourceType.COMMUNITY_BLOCK_RECOM.h(), FullSourceJoinApi.EntryServiceType.FEED.i(), 18);
        this.w = new io.reactivex.rxjava3.disposables.g();
        this.itemView.addOnAttachStateChangeListener(new a());
    }

    @Override // xsna.vif0
    public final void i6(GroupSuggestion groupSuggestion) {
        RecommendationsCarouselItemUiDto.a aVar;
        RecommendationsCarouselItemUiDto.ActionButtonData actionButtonData;
        GroupSuggestion groupSuggestion2 = groupSuggestion;
        hd60.a().T(this.p, groupSuggestion2, this.r);
        this.itemView.getContext();
        hdf0 hdf0Var = this.n;
        hdf0Var.getClass();
        Object obj = com.vk.core.utils.a.a;
        Group group = groupSuggestion2.b;
        a.C0794a e = com.vk.core.utils.a.e(group.y, VerifyInfoHelper.ColorTheme.normal);
        RecommendationsCarouselItemUiDto.c cVar = new RecommendationsCarouselItemUiDto.c(group.d, e != null ? Integer.valueOf(e.a) : null, e != null ? Integer.valueOf(e.b) : null, 18);
        String str = group.z;
        if (str == null) {
            str = "";
        }
        Image image = group.g;
        RecommendationsCarouselItemUiDto.b bVar = image == null ? null : new RecommendationsCarouselItemUiDto.b(image, null);
        GroupLikes groupLikes = group.T;
        ArrayList<UserProfile> arrayList = groupLikes != null ? groupLikes.e : null;
        if (arrayList == null || arrayList.isEmpty()) {
            aVar = new RecommendationsCarouselItemUiDto.a(uqm0.i(group.v, R.plurals.community_subscribers, R.string.community_subscribers_formatted, true), null, false);
        } else {
            int i = groupLikes.d;
            String d = y8g0.d(R.plurals.friends_quantity, i, uqm0.f(i));
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                Image image2 = ((UserProfile) it.next()).O;
                if (image2 != null) {
                    arrayList2.add(image2);
                }
            }
            aVar = new RecommendationsCarouselItemUiDto.a(d, new RecommendationsCarouselItemUiDto.a.InterfaceC1369a.b(j5g.H0(arrayList2, 2)), true);
        }
        RecommendationsCarouselItemUiDto.a aVar2 = (!(aVar.b instanceof RecommendationsCarouselItemUiDto.a.InterfaceC1369a.C1370a) || this.q) ? aVar : null;
        if (hd60.a().e1(group.C)) {
            actionButtonData = new RecommendationsCarouselItemUiDto.ActionButtonData(y8g0.e(R.string.community_status_button_public_subscribed), y8g0.e(R.string.community_status_button_public_subscribed), null, hdf0Var.a ? RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.COMPLETED : RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.NONE, 4);
        } else {
            actionButtonData = new RecommendationsCarouselItemUiDto.ActionButtonData(y8g0.e(R.string.join_page), y8g0.e(R.string.join_page), null, RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.NONE, 4);
        }
        RecommendationsCarouselItemUiDto recommendationsCarouselItemUiDto = new RecommendationsCarouselItemUiDto(cVar, str, bVar, aVar2, actionButtonData);
        w100 w100Var = this.t;
        gtl0 gtl0Var = this.o;
        gtl0Var.q6(w100Var);
        gtl0Var.s6(this.u);
        gtl0Var.V5(recommendationsCarouselItemUiDto);
    }

    /* compiled from: RecommendedGroupHolderV3.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            io.reactivex.rxjava3.disposables.c a = idf0.this.w.a();
            if (a != null) {
                a.dispose();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
