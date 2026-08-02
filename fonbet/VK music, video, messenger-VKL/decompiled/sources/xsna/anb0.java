package xsna;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.stickers.api.styles.StickerColorToken;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vk.stories.design.view.poll.RoundedCornersView;
import com.vkontakte.android.R;

/* compiled from: PollBackgroundAdapterRedesign.kt */
/* loaded from: classes4.dex */
public final class anb0 extends ng<StickerCommonStyle> {
    public final v2l0 g;
    public boolean h;
    public Object i;
    public int j;

    /* compiled from: PollBackgroundAdapterRedesign.kt */
    public final class a extends vif0<StickerCommonStyle> {
        public final RoundedCornersView n;
        public final RoundedCornersView o;
        public final RoundedCornersView p;
        public final RoundedCornersView q;
        public final RoundedCornersView r;
        public final RoundedCornersView s;
        public final RoundedCornersView t;
        public final AppCompatCheckBox u;

        public a(ViewGroup viewGroup) {
            super(viewGroup, R.layout.poll_preview_redesign, 0);
            this.n = (RoundedCornersView) this.itemView.findViewById(R.id.poll_preview_background);
            this.o = (RoundedCornersView) this.itemView.findViewById(R.id.poll_preview_title_line_1);
            this.p = (RoundedCornersView) this.itemView.findViewById(R.id.poll_preview_title_line_2);
            this.q = (RoundedCornersView) this.itemView.findViewById(R.id.poll_preview_option_line_1);
            this.r = (RoundedCornersView) this.itemView.findViewById(R.id.poll_preview_option_line_2);
            this.s = (RoundedCornersView) this.itemView.findViewById(R.id.poll_preview_option_line_3);
            this.t = (RoundedCornersView) this.itemView.findViewById(R.id.poll_preview_footer_line_1);
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.itemView.findViewById(R.id.poll_checkbox);
            appCompatCheckBox.setClickable(false);
            this.u = appCompatCheckBox;
        }

        @Override // xsna.vif0
        public final void i6(StickerCommonStyle stickerCommonStyle) {
            StickerCommonStyle stickerCommonStyle2 = stickerCommonStyle;
            final anb0 anb0Var = anb0.this;
            Object obj = anb0Var.i;
            v2l0 v2l0Var = anb0Var.g;
            boolean z = obj == stickerCommonStyle2;
            this.u.setChecked(z);
            if (z) {
                this.itemView.setOnClickListener(null);
            } else {
                final int bindingAdapterPosition = getBindingAdapterPosition();
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: xsna.zmb0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        anb0.this.L0(bindingAdapterPosition);
                    }
                });
            }
            Context context = this.l.getContext();
            int b = v2l0Var != null ? v2l0Var.b(context, stickerCommonStyle2, StickerColorToken.POLL_PREVIEW_BACKGROUND) : b.$EnumSwitchMapping$0[stickerCommonStyle2.ordinal()] == 1 ? context.getColor(R.color.vk_white) : context.getColor(R.color.vk_gray_800);
            int b2 = v2l0Var != null ? v2l0Var.b(context, stickerCommonStyle2, StickerColorToken.POLL_PREVIEW_CONTENT) : b.$EnumSwitchMapping$0[stickerCommonStyle2.ordinal()] == 1 ? context.getColor(R.color.vk_gray_300) : context.getColor(R.color.vk_gray_500);
            Integer valueOf = b.$EnumSwitchMapping$0[stickerCommonStyle2.ordinal()] == 2 ? Integer.valueOf(context.getColor(R.color.vk_gray_700)) : null;
            RoundedCornersView roundedCornersView = this.n;
            roundedCornersView.setBackgroundColor(b);
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                float a = cn70.a() * 0.5f;
                Paint c = x9.c(true);
                c.setStyle(Paint.Style.STROKE);
                c.setColor(intValue);
                c.setStrokeWidth(a);
                roundedCornersView.d = c;
                roundedCornersView.invalidate();
            }
            this.o.setBackgroundColor(b2);
            this.p.setBackgroundColor(b2);
            this.q.setBackgroundColor(b2);
            this.r.setBackgroundColor(b2);
            this.s.setBackgroundColor(b2);
            this.t.setBackgroundColor(b2);
            anb0Var.h = true;
        }
    }

    /* compiled from: PollBackgroundAdapterRedesign.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickerCommonStyle.values().length];
            try {
                iArr[StickerCommonStyle.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerCommonStyle.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public anb0(v2l0 v2l0Var, put putVar) {
        super(putVar);
        this.g = v2l0Var;
        this.j = -1;
    }

    @Override // xsna.ng
    public final Object K0() {
        return this.i;
    }

    @Override // xsna.ng
    public final void L0(int i) {
        int i2 = this.j;
        this.j = i;
        if (this.h) {
            if (i2 >= 0 && i2 < getItemCount()) {
                notifyItemChanged(i2);
            }
            if (i < 0 || i >= getItemCount()) {
                return;
            }
            this.i = this.c.c(i);
            notifyItemChanged(i);
        }
    }

    @Override // xsna.ng
    public final void N0(Object obj) {
        this.i = obj;
    }

    @Override // xsna.ng
    public final int getCurrentPosition() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof a) {
            ((a) e0Var).i6(this.c.c(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }
}
