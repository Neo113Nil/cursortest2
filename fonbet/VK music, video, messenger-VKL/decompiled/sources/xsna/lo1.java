package xsna;

import androidx.compose.runtime.a;
import androidx.recyclerview.widget.GridLayoutManager;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo1 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lo1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                AlbumsListFragment albumsListFragment = (AlbumsListFragment) obj4;
                int intValue = ((Integer) obj2).intValue();
                ((Integer) obj3).getClass();
                int i2 = AlbumsListFragment.a0;
                int i3 = intValue > iah0.a((float) 600) ? 3 : 2;
                albumsListFragment.U = i3;
                GridLayoutManager gridLayoutManager = albumsListFragment.V;
                if (gridLayoutManager == null || gridLayoutManager.s != i3) {
                    if (gridLayoutManager != null) {
                        gridLayoutManager.setSpanCount(i3);
                    }
                    aq2 aq2Var = albumsListFragment.T;
                    if (aq2Var == null) {
                        aq2Var = null;
                    }
                    aq2Var.getRecyclerView().invalidateItemDecorations();
                }
                break;
            case 1:
                v0r v0rVar = (v0r) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1936360157, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:92)");
                    }
                    v0rVar.j(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                m8d0 m8d0Var = (m8d0) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1517305109, intValue3, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsHeaderRightActionsImpl.Content.<anonymous>.<anonymous> (PrimaryBlockGoodsHeaderRightActionsImpl.kt:140)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1820128868, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronRightCircle28> (VkSdkIcons.kt:506)");
                }
                lg90 a = pg90.a(R.drawable.vk_icon_chevron_right_circle_28, 0, aVar2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                boolean J = aVar2.J(m8d0Var);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new ln20(m8d0Var, 18);
                    aVar2.R(x);
                }
                m8d0Var.f(a, null, null, x, (SemanticsConfiguration) ((zak0) m8d0Var.i).getValue(), aVar2, 8, 14);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
        }
        return s3q0.a;
    }
}
