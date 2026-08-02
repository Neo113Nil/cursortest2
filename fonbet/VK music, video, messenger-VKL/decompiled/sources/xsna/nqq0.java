package xsna;

import com.vk.lists.ListDataSet;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;

/* compiled from: UserProfileItemsViewDelegate.kt */
/* loaded from: classes5.dex */
public final class nqq0 {
    public final ListDataSet<UserProfileAdapterItem> a;
    public final opq0 b;
    public final loq0 c;
    public final hpq0 d;
    public final khc0 e;
    public final io.reactivex.rxjava3.core.q<ajh> f;
    public final UserProfileHeaderView g;

    /* compiled from: UserProfileItemsViewDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityProfileContent.InitialPosition.ScrollToContentType.values().length];
            try {
                iArr[CommunityProfileContent.InitialPosition.ScrollToContentType.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityProfileContent.InitialPosition.ScrollToContentType.SMOOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nqq0(com.vk.lists.a aVar, opq0 opq0Var, loq0 loq0Var, hpq0 hpq0Var, khc0 khc0Var, io.reactivex.rxjava3.subjects.f fVar, UserProfileHeaderView userProfileHeaderView) {
        this.a = aVar;
        this.b = opq0Var;
        this.c = loq0Var;
        this.d = hpq0Var;
        this.e = khc0Var;
        this.f = fVar;
        this.g = userProfileHeaderView;
    }
}
