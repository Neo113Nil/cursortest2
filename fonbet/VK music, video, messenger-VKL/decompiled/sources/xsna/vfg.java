package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.channels.api.CommentsHistory;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CommentsOrderHolder.kt */
/* loaded from: classes16.dex */
public final class vfg extends vfz<wfg> {
    public final TextView l;
    public wfg m;

    /* compiled from: CommentsOrderHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommentsHistory.Order.values().length];
            try {
                iArr[CommentsHistory.Order.ASC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommentsHistory.Order.DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public vfg(View view, j20 j20Var) {
        super(view);
        TextView textView = (TextView) view;
        this.l = textView;
        textView.setOnClickListener(new ufg(0, j20Var, this));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(wfg wfgVar) {
        int i;
        wfg wfgVar2 = wfgVar;
        this.m = wfgVar2;
        int i2 = a.$EnumSwitchMapping$0[wfgVar2.b.ordinal()];
        if (i2 == 1) {
            i = R.string.vkim_channel_comments_order_acs;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.vkim_channel_comments_order_desc;
        }
        TextView textView = this.l;
        textView.setText(i);
        if (wfgVar2.c) {
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_accent));
        } else {
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
        }
    }
}
