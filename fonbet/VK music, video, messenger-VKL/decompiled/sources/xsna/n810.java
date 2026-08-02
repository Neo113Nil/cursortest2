package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.ecomm.products_multipicker.impl.presentation.adapters.itemadapter.paginationerror.TypeOfItems;
import com.vkontakte.android.R;

/* compiled from: MarketMultiPickerPaginationErrorItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class n810 extends vfz<m810> {
    public final izs<b910, s3q0> l;
    public final VkCell m;
    public m810 n;

    /* compiled from: MarketMultiPickerPaginationErrorItemViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TypeOfItems.values().length];
            try {
                iArr[TypeOfItems.GROUP_ITEMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeOfItems.FAVE_ITEMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n810(ViewGroup viewGroup, izs<? super b910, s3q0> izsVar) {
        super(R.layout.products_multipicker_item_pagination_error, viewGroup);
        this.l = izsVar;
        this.m = (VkCell) this.itemView.findViewById(R.id.error_view_holder);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(m810 m810Var) {
        m810 m810Var2 = m810Var;
        this.n = m810Var2;
        VkCell.Middle.b bVar = new VkCell.Middle.b(new VkCell.Middle.e(m810Var2.b, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 14);
        VkCell vkCell = this.m;
        vkCell.setMiddle(bVar);
        vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.b(m810Var2.c, new cvs(this, 16), VkButton.Appearance.Accent, VkButton.Mode.Link, null, null, null, null, 2032), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
        int a2 = iah0.a(6);
        f4m.l(a2, a2, vkCell);
    }
}
