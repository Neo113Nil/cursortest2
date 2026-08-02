package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: BirthdaysListPageLoadingErrorHolder.kt */
/* loaded from: classes15.dex */
public final class ra7 extends vfz<gb7> {
    public final np1 l;
    public final VkCell m;

    public ra7(ViewGroup viewGroup, np1 np1Var) {
        super(R.layout.birthdays_list_loading_error_item, viewGroup);
        this.l = np1Var;
        this.m = (VkCell) this.itemView;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(gb7 gb7Var) {
        VkCell.Middle.b bVar = new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.liblists_err_text), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 14);
        VkCell vkCell = this.m;
        vkCell.setMiddle(bVar);
        tlo0.f fVar = new tlo0.f(R.string.liblists_retry);
        VkButton.Mode mode = VkButton.Mode.Link;
        getContext();
        vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.b(fVar, new v6(this, 6), VkButton.Appearance.Accent, mode, null, null, null, null, 2032), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
    }
}
