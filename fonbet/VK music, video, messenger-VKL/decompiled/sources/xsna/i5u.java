package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.ecomm.market.good.ui.holder.LoadingState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;

/* compiled from: GoodLoaderHolder.kt */
/* loaded from: classes18.dex */
public final class i5u extends vif0<LoadingState> {
    public final VkSpinner n;
    public final VkCell o;

    /* compiled from: GoodLoaderHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadingState.values().length];
            try {
                iArr[LoadingState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadingState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadingState.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i5u(ViewGroup viewGroup, q010 q010Var) {
        super(viewGroup, R.layout.good_footer_view, 0);
        this.n = (VkSpinner) this.itemView.findViewById(R.id.load_more_progress);
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.load_more_error);
        this.o = vkCell;
        VkCell.Middle.e eVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        vkCell.setMiddle(new VkCell.Middle.b(eVar, new VkCell.Middle.d(tq.h(tlo0.Companion, R.string.liblists_err_text), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) objArr, (VkCell.Middle.Size) null, 13));
        vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.b(new tlo0.f(R.string.liblists_retry), q010Var, VkButton.Appearance.Accent, VkButton.Mode.Tertiary, VkButton.Size.Small, null, null, null, 2016), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
    }

    @Override // xsna.vif0
    public final void i6(LoadingState loadingState) {
        int i = a.$EnumSwitchMapping$0[loadingState.ordinal()];
        VkCell vkCell = this.o;
        VkSpinner vkSpinner = this.n;
        if (i == 1) {
            vkSpinner.setVisibility(0);
            f4m.j(vkCell);
        } else if (i == 2) {
            f4m.j(vkSpinner);
            vkCell.setVisibility(0);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(vkSpinner);
            f4m.j(vkCell);
        }
    }
}
