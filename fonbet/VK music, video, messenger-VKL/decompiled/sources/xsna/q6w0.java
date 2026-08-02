package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.stickers.PromoColor;
import com.vk.imageloader.view.VKImageView;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vk.vmoji.character.model.CharacterContext;
import com.vk.vmoji.character.model.ImageListModel;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VmojiCharacterHeaderHolder.kt */
/* loaded from: classes7.dex */
public final class q6w0 extends u6w0<r6w0> {
    public final VKImageView l;
    public final ImageView m;
    public final TextView n;
    public final TextView o;
    public final View p;
    public final View q;
    public final TextView r;
    public final View s;
    public final View t;
    public final TextView u;
    public final ShimmerFrameLayout v;

    /* compiled from: VmojiCharacterHeaderHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CharacterContext.values().length];
            try {
                iArr[CharacterContext.OTHER_CHARACTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CharacterContext.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public q6w0(ViewGroup viewGroup, b8w0 b8w0Var) {
        super(R.layout.vmoji_character_header_item, viewGroup);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.icon);
        this.l = vKImageView;
        this.m = (ImageView) this.itemView.findViewById(R.id.icon_bg);
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = (TextView) this.itemView.findViewById(R.id.deactivated_subtitle);
        View findViewById = this.itemView.findViewById(R.id.edit);
        this.p = findViewById;
        this.q = this.itemView.findViewById(R.id.vmoji_edit_icon);
        this.r = (TextView) this.itemView.findViewById(R.id.vmoji_edit_text);
        View findViewById2 = this.itemView.findViewById(R.id.create_vmoji);
        this.s = findViewById2;
        this.t = this.itemView.findViewById(R.id.separator);
        this.u = (TextView) this.itemView.findViewById(R.id.promo_counter);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.shimmer);
        this.v = shimmerFrameLayout;
        vKImageView.setPaintFilterBitmap(true);
        jjc.g(findViewById, new mdk0(b8w0Var, 25));
        jjc.g(findViewById2, new sxl0(b8w0Var, 15));
        Shimmer.a aVar = (Shimmer.a) new Shimmer.a().c(false).j();
        aVar.a.m = 0;
        shimmerFrameLayout.b(aVar.d(1.0f).h(0.08f).e(2500L).a());
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        int Y;
        r6w0 r6w0Var = (r6w0) hfzVar;
        int i = r6w0Var.k;
        boolean z = r6w0Var.j;
        CharacterContext characterContext = r6w0Var.c;
        CharacterContext characterContext2 = CharacterContext.UNKNOWN;
        String string = characterContext == characterContext2 ? this.itemView.getContext().getString(R.string.vmoji_default_character) : r6w0Var.b;
        TextView textView = this.n;
        textView.setText(string);
        bwt0.p0(this.o, z);
        CharacterContext characterContext3 = CharacterContext.MY_CHARACTER;
        TextView textView2 = this.r;
        View view = this.q;
        View view2 = this.t;
        View view3 = this.s;
        View view4 = this.p;
        if (characterContext == characterContext3) {
            f4m.v(cn70.b(2), textView);
            view4.setVisibility(0);
            view.setVisibility(0);
            textView2.setText(this.itemView.getContext().getString(R.string.vmoji_character_edit));
            f4m.j(view3);
            view2.setVisibility(0);
        } else {
            f4m.j(view4);
            if (r6w0Var.d) {
                f4m.v(cn70.b(4), textView);
                f4m.j(view3);
                view2.setVisibility(0);
            } else {
                f4m.v(cn70.b(6), textView);
                view3.setVisibility(0);
                f4m.j(view2);
            }
        }
        if (characterContext == characterContext2) {
            view4.setVisibility(0);
            f4m.j(view);
            at.d(this.itemView, R.string.vmoji_open_in_editor, textView2);
        }
        boolean c = dhr0.a.c(this.itemView.getContext());
        int i2 = c ? r6w0Var.h : r6w0Var.g;
        abg0 abg0Var = dhr0.t;
        this.m.setImageDrawable(new baf0(abg0Var.a(R.drawable.shape_bg_header_icon), i2));
        ImageListModel imageListModel = c ? r6w0Var.f : r6w0Var.e;
        String Ab = imageListModel != null ? ImageListModel.Ab(imageListModel, cn70.b(148)) : null;
        VKImageView vKImageView = this.l;
        vKImageView.load(Ab);
        int i3 = a.$EnumSwitchMapping$0[characterContext.ordinal()];
        float f = 1.0f;
        if (i3 != 1 && (i3 == 2 || !r6w0Var.i || z)) {
            f = 0.5f;
        }
        vKImageView.setAlpha(f);
        PromoColor promoColor = r6w0Var.l;
        TextView textView3 = this.u;
        if (i <= 0 || promoColor == null) {
            f4m.j(textView3);
            return;
        }
        Drawable a2 = abg0Var.a(R.drawable.sticker_store_icon_badge);
        Context context = this.itemView.getContext();
        int i4 = mdl0.$EnumSwitchMapping$0[promoColor.ordinal()];
        if (i4 == 1) {
            Y = dhr0.Y(R.attr.vk_ui_icon_accent, context);
        } else if (i4 == 2) {
            Y = dhr0.Y(R.attr.vk_ui_accent_red, context);
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Y = dhr0.Y(R.attr.vk_ui_icon_medium, context);
        }
        textView3.setBackground(new baf0(a2, Y));
        textView3.setText(i < 100 ? String.valueOf(i) : "99+");
        textView3.setVisibility(0);
        this.v.c();
    }
}
