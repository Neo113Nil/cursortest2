package xsna;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.toggle.data.RecommendationsItemImageStyle;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RecommendationsCarouselShowAllHolder.kt */
/* loaded from: classes4.dex */
public final class tbf0 extends vif0<Object> implements View.OnClickListener {
    public final gzs<s3q0> n;
    public final TextView o;

    /* compiled from: RecommendationsCarouselShowAllHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecommendationsItemImageStyle.values().length];
            try {
                iArr[RecommendationsItemImageStyle.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecommendationsItemImageStyle.PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public tbf0(ViewGroup viewGroup, gzs<s3q0> gzsVar, sbf0 sbf0Var, boolean z) {
        super(viewGroup, R.layout.holder_recommendations_carousel_show_all, 0);
        int a2;
        this.n = gzsVar;
        TextView textView = (TextView) this.itemView.findViewById(R.id.show_all_button);
        this.o = textView;
        textView.setOnClickListener(this);
        this.itemView.getContext();
        ColorStateList q6 = q6(R.attr.vk_ui_icon_medium);
        ColorStateList q62 = q6(R.attr.vk_ui_text_secondary);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, new baf0(m33.a(R.drawable.vk_icon_chevron_right_circle_28, this.itemView.getContext()), q6), (Drawable) null, (Drawable) null);
        textView.setTextColor(q62);
        if (z) {
            this.itemView.getLayoutParams().height = -1;
            return;
        }
        int i = a.$EnumSwitchMapping$0[sbf0Var.c.ordinal()];
        if (i == 1) {
            a2 = e3m.a(R.dimen.recomm_carousel_item_width, this.itemView.getContext());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            a2 = e3m.a(R.dimen.recomm_carousel_portrait_image_height, this.itemView.getContext());
        }
        f4m.n(a2, this.itemView);
    }

    public static ColorStateList q6(int i) {
        int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
        int c = dhr0.t.c(i);
        return new ColorStateList(iArr, new int[]{l8g.f(0.8f, c), c});
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b() || view == null || view.getId() != R.id.show_all_button) {
            return;
        }
        this.n.invoke();
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
    }
}
