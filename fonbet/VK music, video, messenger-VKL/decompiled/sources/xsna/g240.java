package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.multiaccount.impl.ui.FooterButtonType;
import com.vkontakte.android.R;

/* compiled from: MultiAccountFooterButtonViewHolder.kt */
/* loaded from: classes6.dex */
public final class g240 extends RecyclerView.e0 {
    public final ij0 l;
    public final View m;
    public final TextView n;
    public final View o;
    public final Context p;

    /* compiled from: MultiAccountFooterButtonViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FooterButtonType.values().length];
            try {
                iArr[FooterButtonType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FooterButtonType.LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public g240(ViewGroup viewGroup, pxo pxoVar) {
        super(tf3.b(viewGroup, R.layout.vk_auth_multiaccount_footer_button, viewGroup, false));
        this.l = pxoVar;
        this.m = this.itemView.findViewById(R.id.footer_button_icon_view);
        this.n = (TextView) this.itemView.findViewById(R.id.footer_button_text_view);
        this.o = this.itemView.findViewById(R.id.footer_view);
        this.p = this.itemView.getContext();
    }
}
