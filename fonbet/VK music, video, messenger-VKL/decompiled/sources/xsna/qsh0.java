package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SearchFeedParametersView.kt */
/* loaded from: classes5.dex */
public final class qsh0 extends ConstraintLayout implements xwh0 {
    public final VkCheckboxItem t;
    public final RadioButton u;
    public final RadioButton v;

    /* compiled from: SearchFeedParametersView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkFeedSearchParams.SortType.values().length];
            try {
                iArr[VkFeedSearchParams.SortType.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkFeedSearchParams.SortType.RELEVANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qsh0(Context context) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.catalog_feed_search_params, (ViewGroup) this, true);
        this.u = (RadioButton) inflate.findViewById(R.id.by_relevance);
        this.v = (RadioButton) inflate.findViewById(R.id.by_time);
        this.t = (VkCheckboxItem) inflate.findViewById(R.id.filter_remove_duplicates);
    }

    @Override // xsna.xwh0
    public final void A0(VkFeedSearchParams vkFeedSearchParams) {
        RadioButton radioButton;
        this.t.setChecked(vkFeedSearchParams.c);
        int i = a.$EnumSwitchMapping$0[vkFeedSearchParams.b.ordinal()];
        if (i == 1) {
            radioButton = this.v;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            radioButton = this.u;
        }
        radioButton.setChecked(true);
    }

    @Override // xsna.xwh0
    public final void J0(VkFeedSearchParams vkFeedSearchParams) {
        vkFeedSearchParams.c = this.t.u.isChecked();
        vkFeedSearchParams.b = this.v.isChecked() ? VkFeedSearchParams.SortType.DATE : this.u.isChecked() ? VkFeedSearchParams.SortType.RELEVANT : VkFeedSearchParams.SortType.RELEVANT;
    }
}
