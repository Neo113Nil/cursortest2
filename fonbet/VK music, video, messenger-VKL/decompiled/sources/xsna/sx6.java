package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.core.fragments.FragmentImpl;
import com.vk.navigation.marked.FragmentWithGlobalSearch$TargetAction;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.profile.community.catalog.impl.communities.CommunitiesCatalogFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BestFriendsConversationVh.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class sx6 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ww50 v;
        switch (this.b) {
            case 0:
                rx6.h6((rx6) this.receiver);
                break;
            case 1:
                FragmentActivity activity = ((FragmentImpl) this.receiver).getActivity();
                if (activity != null && (v = s200.v(activity)) != null) {
                    v.W();
                }
                break;
            case 2:
                ExploreFragment exploreFragment = (ExploreFragment) this.receiver;
                int i = ExploreFragment.h0;
                exploreFragment.getClass();
                exploreFragment.no(FragmentWithGlobalSearch$TargetAction.HeaderSearchIconClick);
                break;
            default:
                ((drh0) this.receiver).n();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx6(ExploreFragment exploreFragment) {
        super(0, exploreFragment, ExploreFragment.class, "onSearchButtonClick", "onSearchButtonClick()V", 0);
        this.b = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx6(CommunitiesCatalogFragment communitiesCatalogFragment) {
        super(0, communitiesCatalogFragment, lbs.class, "openNavigationDrawer", "openNavigationDrawer(Lcom/vk/core/fragments/FragmentImpl;)V", 1);
        this.b = 1;
    }
}
