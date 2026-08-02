package xsna;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.im.engine.models.mentions.MassMentionType;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.thm;

/* compiled from: VhMassMention.kt */
/* loaded from: classes2.dex */
public final class bsr0 extends vfz<yi10> {
    public static final a q = new a(R.string.im_engine_mention_all_description, R.attr.im_icon_mention_all_start_color, R.attr.im_icon_mention_all_end_color);
    public static final a r = new a(R.string.im_engine_mention_online_description, R.attr.im_icon_mention_online_start_color, R.attr.im_icon_mention_online_end_color);
    public final gj0 l;
    public final TextView m;
    public final TextView n;
    public xi10 o;
    public final GradientDrawable p;

    /* compiled from: VhMassMention.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MassMentionResources(description=");
            sb.append(this.a);
            sb.append(", firstColorRes=");
            sb.append(this.b);
            sb.append(", secondColorRes=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: VhMassMention.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MassMentionType.values().length];
            try {
                iArr[MassMentionType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MassMentionType.ONLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public bsr0(View view, thm.a aVar) {
        super(view);
        this.l = aVar;
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        this.m = (TextView) view.findViewById(R.id.description);
        this.n = (TextView) view.findViewById(R.id.name);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientType(0);
        this.p = gradientDrawable;
        view.setOnClickListener(new v9b(this, 12));
        imageView.setBackground(gradientDrawable);
    }

    @Override // xsna.vfz
    public final void W5(yi10 yi10Var) {
        a aVar;
        xi10 xi10Var = yi10Var.b;
        int i = b.$EnumSwitchMapping$0[xi10Var.a.ordinal()];
        if (i == 1) {
            aVar = q;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = r;
        }
        int f = e3m.f(aVar.b, this.itemView.getContext());
        int f2 = e3m.f(aVar.c, this.itemView.getContext());
        this.m.setText(this.itemView.getContext().getResources().getString(aVar.a));
        this.n.setText(xi10Var.b);
        this.p.setColors(new int[]{f, f2});
        this.o = xi10Var;
    }
}
