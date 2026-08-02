package xsna;

import android.widget.LinearLayout;
import com.vk.api.generated.market.dto.MarketReviewCommentsDto;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.core.view.components.button.VkButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class z2e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z2e(int i, ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment) {
        this.b = 0;
        this.c = i;
        this.d = clipsFavoriteFolderContentListFragment;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj2;
                ClipsFavoriteFolderContentListFragment.b bVar = (ClipsFavoriteFolderContentListFragment.b) obj;
                int i3 = ClipsFavoriteFolderContentListFragment.W;
                LinearLayout linearLayout = bVar.e;
                LinearLayout linearLayout2 = bVar.e;
                if (linearLayout.getChildCount() != i2) {
                    linearLayout2.removeAllViews();
                    for (int i4 = 0; i4 < i2; i4++) {
                        VkButton vkButton = new VkButton(clipsFavoriteFolderContentListFragment.requireContext(), null, 6, 0);
                        vkButton.setAppearance(VkButton.Appearance.Accent);
                        vkButton.setMode(VkButton.Mode.Primary);
                        vkButton.setSize(VkButton.Size.Large);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                        layoutParams.weight = 1.0f;
                        if (i4 != 0) {
                            layoutParams.setMarginStart(ClipsFavoriteFolderContentListFragment.W);
                        }
                        vkButton.setLayoutParams(layoutParams);
                        linearLayout2.addView(vkButton);
                    }
                }
                return s3q0.a;
            case 1:
                ((t0g) obj2).m.invoke(Integer.valueOf(i2));
                return s3q0.a;
            default:
                zxh zxhVar = (zxh) obj2;
                return zxhVar.d.e((MarketReviewCommentsDto) obj, i2, true, zxhVar.g);
        }
    }

    public /* synthetic */ z2e(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
