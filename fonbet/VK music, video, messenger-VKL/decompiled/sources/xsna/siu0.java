package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.components.cell.button.Appearance;
import com.vk.core.view.components.cell.button.IconAlign;
import com.vk.core.view.components.cell.button.IconBackgroundStyle;
import com.vk.core.view.components.cell.button.IconSize;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.dma;

/* compiled from: VkCellButtonMilkshake.kt */
/* loaded from: classes17.dex */
public final class siu0 extends FrameLayout implements too0 {
    public IconSize b;
    public IconBackgroundStyle c;
    public Appearance d;
    public boolean e;
    public IconAlign f;
    public final GradientDrawable g;
    public final View h;
    public final View i;
    public final ViewGroup j;
    public final ImageView k;
    public final View l;
    public final TextView m;
    public final TextView n;
    public String o;

    /* compiled from: VkCellButtonMilkshake.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconAlign.values().length];
            try {
                iArr[IconAlign.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconAlign.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public siu0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = IconSize.Medium;
        this.c = IconBackgroundStyle.None;
        this.d = Appearance.Accent;
        this.e = true;
        this.f = IconAlign.Center;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.g = gradientDrawable;
        this.h = LayoutInflater.from(context).inflate(R.layout.ds_internal_cell_button_content, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.middle);
        this.l = findViewById;
        findViewById.setId(R.id.ds_internal_cell_middle);
        TextView textView = (TextView) findViewById(R.id.title);
        this.m = textView;
        textView.setId(R.id.ds_internal_cell_middle_title);
        TextView textView2 = (TextView) findViewById(R.id.subtitle);
        this.n = textView2;
        textView2.setId(R.id.ds_internal_cell_middle_subtitle);
        View findViewById2 = findViewById(R.id.gap_icon_main);
        this.i = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.icon);
        this.k = imageView;
        imageView.setId(R.id.ds_internal_cell_left);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.icon_background);
        this.j = viewGroup;
        findViewById2.setVisibility(viewGroup.getVisibility());
        viewGroup.setBackground(gradientDrawable);
        setBackground(e3m.e(R.attr.selectableItemBackground, context));
    }

    @Override // xsna.too0
    public final void Ng() {
        int i;
        int i2;
        getContext();
        int b = hbh0.b(5, getContext());
        int i3 = dma.a.$EnumSwitchMapping$1[this.c.ordinal()];
        if (i3 != 1) {
            i = R.attr.vk_ui_background_secondary;
            if (i3 != 2 && i3 != 3 && i3 != 4 && i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = R.attr.vk_ui_transparent;
        }
        setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
        View view = this.l;
        view.setPadding(view.getPaddingLeft(), b, view.getPaddingRight(), b);
        this.g.setColor(gpo0.d(i, this));
        if (this.e) {
            getContext();
            int i4 = dma.a.$EnumSwitchMapping$2[this.d.ordinal()];
            if (i4 == 1) {
                i2 = R.attr.vk_ui_icon_accent;
            } else if (i4 == 2) {
                i2 = R.attr.vk_ui_icon_primary;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.attr.vk_ui_icon_negative;
            }
            gpo0.f(this.k, Integer.valueOf(i2));
        }
        this.h.setMinimumHeight(hbh0.b(48, getContext()));
        Context context = getContext();
        getContext();
        this.m.setTextAppearance(e3m.g(R.attr.vk_ui_typography_text_normal, context));
        Context context2 = getContext();
        getContext();
        this.n.setTextAppearance(e3m.g(R.attr.vk_ui_typography_footnote_normal, context2));
    }

    public final void a() {
        int i;
        int i2;
        getContext();
        int i3 = dma.a.$EnumSwitchMapping$2[this.d.ordinal()];
        if (i3 == 1) {
            i = R.attr.vk_ui_text_accent;
        } else if (i3 == 2) {
            i = R.attr.vk_ui_text_primary;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.attr.vk_ui_text_negative;
        }
        gpo0.i(this.m, i);
        if (this.e) {
            getContext();
            int i4 = dma.a.$EnumSwitchMapping$2[this.d.ordinal()];
            if (i4 == 1) {
                i2 = R.attr.vk_ui_icon_accent;
            } else if (i4 == 2) {
                i2 = R.attr.vk_ui_icon_primary;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.attr.vk_ui_icon_negative;
            }
            gpo0.f(this.k, Integer.valueOf(i2));
        }
        invalidate();
    }

    public final void b(boolean z, Integer num) {
        ImageView imageView = this.k;
        if (!z) {
            gpo0.a(imageView);
        }
        imageView.setImageResource(num != null ? num.intValue() : 0);
        imageView.setVisibility((num == null || num.intValue() == 0) ? 8 : 0);
        int visibility = imageView.getVisibility();
        ViewGroup viewGroup = this.j;
        viewGroup.setVisibility(visibility);
        setIconColorful(z);
        this.i.setVisibility(viewGroup.getVisibility());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final Appearance getAppearance() {
        return this.d;
    }

    public final IconAlign getIconAlign() {
        return this.f;
    }

    public final IconBackgroundStyle getIconBackgroundStyle() {
        return this.c;
    }

    public final boolean getIconColorful() {
        return this.e;
    }

    public final IconSize getIconSize() {
        return this.b;
    }

    public final String getTestTag() {
        return this.o;
    }

    public final void setAppearance(Appearance appearance) {
        this.d = appearance;
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.64f);
    }

    public final void setIconAlign(IconAlign iconAlign) {
        int i;
        this.f = iconAlign;
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            int i2 = a.$EnumSwitchMapping$0[iconAlign.ordinal()];
            if (i2 == 1) {
                i = 48;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 17;
            }
            f4m.m(i, viewGroup);
        }
    }

    public final void setIconBackgroundStyle(IconBackgroundStyle iconBackgroundStyle) {
        int i;
        float f;
        float a2;
        this.c = iconBackgroundStyle;
        int a3 = dma.a(getContext(), this.b, this.c);
        int b = dma.b(getContext(), this.b, this.c);
        IconBackgroundStyle iconBackgroundStyle2 = this.c;
        int[] iArr = dma.a.$EnumSwitchMapping$1;
        int i2 = iArr[iconBackgroundStyle2.ordinal()];
        if (i2 == 1) {
            i = R.attr.vk_ui_transparent;
        } else {
            if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.attr.vk_ui_background_secondary;
        }
        getContext();
        int i3 = iArr[this.c.ordinal()];
        if (i3 == 1) {
            f = vev0.h;
        } else if (i3 == 2) {
            f = vev0.f;
        } else if (i3 == 3) {
            f = vev0.f;
        } else if (i3 == 4) {
            f = vev0.f;
        } else {
            if (i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            f = vev0.f;
        }
        int i4 = (int) f;
        Context context = getContext();
        IconSize iconSize = this.b;
        int i5 = iArr[this.c.ordinal()];
        if (i5 == 1) {
            a2 = hbh0.a(context, 50.0f);
        } else if (i5 == 2) {
            a2 = hbh0.a(context, 50.0f);
        } else if (i5 == 3) {
            int i6 = dma.a.$EnumSwitchMapping$0[iconSize.ordinal()];
            if (i6 == 1 || i6 == 2) {
                a2 = hbh0.a(context, 3.0f);
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = hbh0.a(context, 4.0f);
            }
        } else if (i5 == 4) {
            int i7 = dma.a.$EnumSwitchMapping$0[iconSize.ordinal()];
            if (i7 == 1 || i7 == 2) {
                a2 = hbh0.a(context, 4.0f);
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = hbh0.a(context, 6.0f);
            }
        } else {
            if (i5 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            int i8 = dma.a.$EnumSwitchMapping$0[iconSize.ordinal()];
            if (i8 == 1 || i8 == 2) {
                a2 = hbh0.a(context, 8.0f);
            } else {
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = hbh0.a(context, 16.0f);
            }
        }
        int d = gpo0.d(i, this);
        GradientDrawable gradientDrawable = this.g;
        gradientDrawable.setColor(d);
        gradientDrawable.setCornerRadius(a2);
        ImageView imageView = this.k;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = b;
        layoutParams.width = b;
        imageView.setLayoutParams(layoutParams);
        ViewGroup viewGroup = this.j;
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.height = a3;
        marginLayoutParams.width = a3;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i4, marginLayoutParams.rightMargin, i4);
        viewGroup.setLayoutParams(marginLayoutParams);
        requestLayout();
        invalidate();
    }

    public final void setIconColorful(boolean z) {
        this.e = z;
        a();
    }

    public final void setIconSize(IconSize iconSize) {
        this.b = iconSize;
        int a2 = dma.a(getContext(), this.b, this.c);
        int b = dma.b(getContext(), this.b, this.c);
        ImageView imageView = this.k;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = b;
        layoutParams.width = b;
        imageView.setLayoutParams(layoutParams);
        ViewGroup viewGroup = this.j;
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = a2;
        layoutParams2.width = a2;
        viewGroup.setLayoutParams(layoutParams2);
        requestLayout();
        invalidate();
    }

    public final void setIconTint(int i) {
        gpo0.f(this.k, Integer.valueOf(i));
        setIconColorful(false);
    }

    public final void setSubtitle(CharSequence charSequence) {
        ey2.i(this.n, charSequence);
    }

    public final void setSubtitleMaxLines(int i) {
        this.n.setMaxLines(i);
    }

    public final void setTestTag(String str) {
        this.o = str;
        setTag(str);
    }

    public final void setTitle(CharSequence charSequence) {
        ey2.i(this.m, charSequence);
    }

    public final void setSubtitle(int i) {
        TextView textView = this.n;
        textView.setText(i);
        CharSequence text = textView.getText();
        f4m.D(textView, !(text == null || text.length() == 0));
    }

    public final void setTitle(int i) {
        TextView textView = this.m;
        textView.setText(i);
        CharSequence text = textView.getText();
        f4m.D(textView, !(text == null || text.length() == 0));
    }

    public final void setIconTint(ColorStateList colorStateList) {
        this.k.setImageTintList(colorStateList);
        setIconColorful(false);
    }
}
