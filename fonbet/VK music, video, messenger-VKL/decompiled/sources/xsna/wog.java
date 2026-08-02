package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: CommunitiesVerticalPaginationViewVkUi.kt */
/* loaded from: classes16.dex */
public final class wog extends n6s {

    /* compiled from: CommunitiesVerticalPaginationViewVkUi.kt */
    public static final class a extends RecyclerView.e0 {
    }

    @Override // xsna.n6s
    public final ee a(Context context, ViewGroup viewGroup) {
        return null;
    }

    @Override // xsna.n6s
    public final RecyclerView.e0 b(Context context, ViewGroup viewGroup, xa80 xa80Var) {
        VkCell vkCell = new VkCell(context, null, 6, 0);
        vkCell.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        vkCell.setMiddle(new VkCell.Middle.b((VkCell.Middle.e) null, new VkCell.Middle.d(tq.h(tlo0.Companion, R.string.liblists_err_text), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 13));
        vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.b(new tlo0.f(R.string.liblists_retry), new com.vk.movika.sdk.base.logic.interactor.b(xa80Var, 24), VkButton.Appearance.Accent, VkButton.Mode.Tertiary, null, null, null, null, 2032), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
        return new a(vkCell);
    }
}
