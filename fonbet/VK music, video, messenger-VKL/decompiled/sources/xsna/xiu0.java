package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.tool.view.GapLinearLayout;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aju0;

/* compiled from: VkCellMiddle.kt */
/* loaded from: classes17.dex */
public final class xiu0 extends GapLinearLayout implements too0 {
    public static final aju0.a u = new aju0.a();
    public final xiu0 d;
    public AppCompatTextView e;
    public wjc f;
    public wjc g;
    public LinearLayout h;
    public LinearLayout i;
    public LinearLayout j;
    public AppCompatImageView k;
    public AppCompatImageView l;
    public AppCompatImageView m;
    public AppCompatImageView n;
    public AppCompatImageView o;
    public AppCompatImageView p;
    public VkCell.d q;
    public aju0 r;
    public ziu0 s;
    public VkCell.Middle.b t;

    /* compiled from: VkCellMiddle.kt */
    public static final class a {
        public final dko a;
        public final k1u0 b;
        public final tlo0 c;
        public final Size d;

        public a(dko dkoVar, k1u0 k1u0Var, tlo0 tlo0Var, Size size) {
            this.a = dkoVar;
            this.b = k1u0Var;
            this.c = tlo0Var;
            this.d = size;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            tlo0 tlo0Var = this.c;
            int hashCode2 = (hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
            Size size = this.d;
            return hashCode2 + (size != null ? size.hashCode() : 0);
        }

        public final String toString() {
            return "IconData(icon=" + this.a + ", iconTint=" + this.b + ", iconDescription=" + this.c + ", iconSize=" + this.d + ')';
        }
    }

    /* compiled from: VkCellMiddle.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<AppCompatImageView> {
        @Override // xsna.gzs
        public final AppCompatImageView invoke() {
            xiu0 xiu0Var = (xiu0) this.receiver;
            AppCompatImageView appCompatImageView = xiu0Var.p;
            if (appCompatImageView != null) {
                return appCompatImageView;
            }
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(xiu0Var.getContext());
            appCompatImageView2.setId(R.id.ds_internal_cell_middle_subtitle_along_right);
            appCompatImageView2.setVisibility(8);
            xiu0Var.p = appCompatImageView2;
            xiu0Var.g().addView(appCompatImageView2, cpy.b(0, 0, e3m.a(R.dimen.vk_ui_spacing_size_xs, xiu0Var.getContext()), 0, 0, 0, 59));
            return appCompatImageView2;
        }
    }

    /* compiled from: VkCellMiddle.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<AppCompatImageView> {
        @Override // xsna.gzs
        public final AppCompatImageView invoke() {
            xiu0 xiu0Var = (xiu0) this.receiver;
            AppCompatImageView appCompatImageView = xiu0Var.o;
            if (appCompatImageView != null) {
                return appCompatImageView;
            }
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(xiu0Var.getContext());
            appCompatImageView2.setId(R.id.ds_internal_cell_middle_subtitle_along_left);
            appCompatImageView2.setVisibility(8);
            LinearLayout.LayoutParams b = cpy.b(0, 0, 0, 0, 0, e3m.a(R.dimen.vk_ui_spacing_size_xs, xiu0Var.getContext()), 31);
            xiu0Var.o = appCompatImageView2;
            xiu0Var.g().addView(appCompatImageView2, 0, b);
            return appCompatImageView2;
        }
    }

    /* compiled from: VkCellMiddle.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<AppCompatImageView> {
        @Override // xsna.gzs
        public final AppCompatImageView invoke() {
            return xiu0.b((xiu0) this.receiver);
        }
    }

    /* compiled from: VkCellMiddle.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<AppCompatImageView> {
        @Override // xsna.gzs
        public final AppCompatImageView invoke() {
            return xiu0.b((xiu0) this.receiver);
        }
    }

    /* compiled from: VkCellMiddle.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<AppCompatImageView> {
        @Override // xsna.gzs
        public final AppCompatImageView invoke() {
            xiu0 xiu0Var = (xiu0) this.receiver;
            AppCompatImageView appCompatImageView = xiu0Var.m;
            if (appCompatImageView != null) {
                return appCompatImageView;
            }
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(xiu0Var.getContext());
            appCompatImageView2.setId(R.id.ds_internal_cell_middle_title_along_left_second);
            appCompatImageView2.setVisibility(8);
            xiu0Var.m = appCompatImageView2;
            xiu0Var.h().addView(appCompatImageView2, 1, cpy.b(0, 0, 0, 0, 0, e3m.a(R.dimen.vk_ui_spacing_size_xs, xiu0Var.getContext()), 31));
            return appCompatImageView2;
        }
    }

    /* compiled from: VkCellMiddle.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements gzs<AppCompatImageView> {
        @Override // xsna.gzs
        public final AppCompatImageView invoke() {
            return xiu0.c((xiu0) this.receiver);
        }
    }

    /* compiled from: VkCellMiddle.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements gzs<AppCompatImageView> {
        @Override // xsna.gzs
        public final AppCompatImageView invoke() {
            return xiu0.c((xiu0) this.receiver);
        }
    }

    /* compiled from: VkCellMiddle.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements gzs<AppCompatImageView> {
        @Override // xsna.gzs
        public final AppCompatImageView invoke() {
            xiu0 xiu0Var = (xiu0) this.receiver;
            AppCompatImageView appCompatImageView = xiu0Var.n;
            if (appCompatImageView != null) {
                return appCompatImageView;
            }
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(xiu0Var.getContext());
            appCompatImageView2.setId(R.id.ds_internal_cell_middle_title_along_right_second);
            appCompatImageView2.setVisibility(8);
            xiu0Var.n = appCompatImageView2;
            xiu0Var.h().addView(appCompatImageView2, cpy.b(0, 0, e3m.a(R.dimen.vk_ui_spacing_size_xs, xiu0Var.getContext()), 0, 0, 0, 59));
            return appCompatImageView2;
        }
    }

    public xiu0(Context context) {
        super(context, null, 0);
        this.d = this;
        this.r = u;
        setOrientation(1);
        setGravity(16);
        setClipToPadding(false);
        getContext();
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size_l, getContext());
        f4m.B(a2, a2, this);
        setGap(e3m.a(R.dimen.vk_ui_spacing_size3_xs, context));
    }

    public static final AppCompatImageView b(xiu0 xiu0Var) {
        AppCompatImageView appCompatImageView = xiu0Var.k;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(xiu0Var.getContext());
        appCompatImageView2.setId(R.id.ds_internal_cell_middle_title_along_left);
        appCompatImageView2.setVisibility(8);
        xiu0Var.k = appCompatImageView2;
        xiu0Var.h().addView(appCompatImageView2, 0, cpy.b(0, 0, 0, 0, 0, e3m.a(R.dimen.vk_ui_spacing_size_xs, xiu0Var.getContext()), 31));
        return appCompatImageView2;
    }

    public static final AppCompatImageView c(xiu0 xiu0Var) {
        AppCompatImageView appCompatImageView = xiu0Var.l;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(xiu0Var.getContext());
        appCompatImageView2.setId(R.id.ds_internal_cell_middle_title_along_right);
        appCompatImageView2.setVisibility(8);
        xiu0Var.l = appCompatImageView2;
        xiu0Var.h().addView(appCompatImageView2, cpy.b(0, 0, e3m.a(R.dimen.vk_ui_spacing_size_xs, xiu0Var.getContext()), 0, 0, 0, 59));
        return appCompatImageView2;
    }

    public static void i(AppCompatTextView appCompatTextView, int i2, int i3) {
        if (gz80.a(28)) {
            TypedArray obtainStyledAttributes = appCompatTextView.getContext().obtainStyledAttributes(i2, R$styleable.c);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, appCompatTextView.getLineHeight());
            obtainStyledAttributes.recycle();
            appCompatTextView.setLineHeight(dimensionPixelSize);
            int i4 = dimensionPixelSize - i3;
            appCompatTextView.setFirstBaselineToTopHeight(i4 >= 0 ? i4 : 0);
            appCompatTextView.setLastBaselineToBottomHeight(i3);
        }
    }

    public static a j(VkCell.Middle.e.b.C0817b c0817b) {
        return new a(c0817b.a, c0817b.b, c0817b.c, c0817b.d);
    }

    public static void k(a aVar, gzs gzsVar) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) gzsVar.invoke();
        appCompatImageView.setImageDrawable(aVar.a.a(appCompatImageView.getContext()));
        tlo0 tlo0Var = aVar.c;
        appCompatImageView.setContentDescription(tlo0Var != null ? tlo0Var.a(appCompatImageView.getContext()) : null);
        k1u0 k1u0Var = aVar.b;
        appCompatImageView.getContext();
        gpo0.h(appCompatImageView, k1u0Var, Integer.valueOf(R.attr.vk_ui_icon_accent));
        Size size = aVar.d;
        if (size != null) {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = size.getWidth();
            layoutParams.height = size.getHeight();
            appCompatImageView.setLayoutParams(layoutParams);
        }
        appCompatImageView.setVisibility(0);
    }

    private final void setExtraSubtitle(VkCell.Middle.c cVar) {
        CharSequence charSequence;
        gzs<s3q0> gzsVar;
        tlo0 tlo0Var;
        if (cVar == null && this.j == null) {
            return;
        }
        if (cVar == null || (tlo0Var = cVar.a) == null || (charSequence = tlo0Var.a(getContext())) == null) {
            charSequence = null;
        }
        wjc f2 = f(this.g, R.id.ds_internal_cell_middle_extra_subtitle, e(), new efr0(this, 10));
        f2.setText(charSequence);
        f2.setMaxLines(cVar != null ? cVar.c : 1);
        f2.setEllipsize(cVar != null ? cVar.d : null);
        f2.setOnClickListener((cVar == null || (gzsVar = cVar.b) == null) ? null : new l6q0(1, gzsVar));
        f2.setClickable((cVar != null ? cVar.b : null) != null);
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.setVisibility(charSequence == null ? 8 : 0);
        }
    }

    private final void setSubtitle(VkCell.Middle.d dVar) {
        CharSequence charSequence;
        gzs<s3q0> gzsVar;
        tlo0 tlo0Var;
        if (dVar == null && this.i == null) {
            return;
        }
        if (dVar == null || (tlo0Var = dVar.a) == null || (charSequence = tlo0Var.a(getContext())) == null) {
            charSequence = null;
        }
        boolean z = charSequence == null;
        wjc f2 = f(this.f, R.id.ds_internal_cell_middle_subtitle, g(), new qjl0(this, 17));
        f2.setText(charSequence);
        f2.setMaxLines(dVar != null ? dVar.c : 1);
        f2.setEllipsize(dVar != null ? dVar.d : null);
        f2.setOnClickListener((dVar == null || (gzsVar = dVar.b) == null) ? null : new bn1(gzsVar, 14));
        f2.setClickable((dVar != null ? dVar.b : null) != null);
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            linearLayout.setVisibility(z ? 8 : 0);
        }
        setSubtitleBefore(dVar != null ? dVar.e : null);
        setSubtitleAfter(dVar != null ? dVar.f : null);
    }

    private final void setSubtitleAfter(VkCell.Middle.d.b bVar) {
        if (bVar == null) {
            AppCompatImageView appCompatImageView = this.p;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
                return;
            }
            return;
        }
        if (!(bVar instanceof VkCell.Middle.d.b.C0815b)) {
            throw new NoWhenBranchMatchedException();
        }
        VkCell.Middle.d.b.C0815b c0815b = (VkCell.Middle.d.b.C0815b) bVar;
        k(new a(c0815b.a, c0815b.b, c0815b.c, null), new b(0, this, xiu0.class, "ensureMiddleSubtitleAlongRight", "ensureMiddleSubtitleAlongRight()Landroidx/appcompat/widget/AppCompatImageView;", 0));
    }

    private final void setSubtitleBefore(VkCell.Middle.d.b bVar) {
        if (bVar == null) {
            AppCompatImageView appCompatImageView = this.o;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
                return;
            }
            return;
        }
        if (!(bVar instanceof VkCell.Middle.d.b.C0815b)) {
            throw new NoWhenBranchMatchedException();
        }
        VkCell.Middle.d.b.C0815b c0815b = (VkCell.Middle.d.b.C0815b) bVar;
        k(new a(c0815b.a, c0815b.b, c0815b.c, null), new c(0, this, xiu0.class, "ensureMiddleSubtitleAlongLeft", "ensureMiddleSubtitleAlongLeft()Landroidx/appcompat/widget/AppCompatImageView;", 0));
    }

    private final void setTitle(VkCell.Middle.e eVar) {
        CharSequence charSequence;
        View view;
        VkCell.Middle.e.b bVar;
        View view2;
        View view3;
        VkCell.Middle.e.b bVar2;
        gzs<s3q0> gzsVar;
        tlo0 tlo0Var;
        xiu0 xiu0Var = this;
        if (eVar == null && xiu0Var.h == null) {
            return;
        }
        if (eVar == null || (tlo0Var = eVar.a) == null || (charSequence = tlo0Var.a(xiu0Var.getContext())) == null) {
            charSequence = null;
        }
        AppCompatTextView appCompatTextView = xiu0Var.e;
        if (appCompatTextView == null) {
            ziu0 create = xiu0Var.r.create(xiu0Var.getContext());
            xiu0Var.s = create;
            LinearLayout.LayoutParams b2 = cpy.b(0, 0, 0, 0, 0, 0, 63);
            b2.weight = 1.0f;
            xiu0Var.h().addView(create.getView(), 0, b2);
            appCompatTextView = create.a();
            xiu0Var.e = appCompatTextView;
            appCompatTextView.setId(R.id.ds_internal_cell_middle_title);
            appCompatTextView.setIncludeFontPadding(false);
            gpo0.i(appCompatTextView, R.attr.vk_ui_text_primary);
        }
        appCompatTextView.setTextAppearance(e3m.g(R.attr.vk_ui_typography_text, appCompatTextView.getContext()));
        i(appCompatTextView, e3m.g(R.attr.vk_ui_typography_text, appCompatTextView.getContext()), an10.b(TypedValue.applyDimension(2, 4, appCompatTextView.getContext().getResources().getDisplayMetrics())));
        gpo0.i(appCompatTextView, R.attr.vk_ui_text_primary);
        ziu0 ziu0Var = xiu0Var.s;
        if (ziu0Var != null) {
            ziu0Var.setText(charSequence);
        } else {
            appCompatTextView.setText(charSequence);
        }
        appCompatTextView.setMaxLines(eVar != null ? eVar.c : 1);
        appCompatTextView.setEllipsize(eVar != null ? eVar.d : null);
        appCompatTextView.setOnClickListener((eVar == null || (gzsVar = eVar.b) == null) ? null : new q3g0(1, gzsVar));
        appCompatTextView.setClickable((eVar != null ? eVar.b : null) != null);
        LinearLayout linearLayout = xiu0Var.h;
        if (linearLayout != null) {
            linearLayout.setVisibility(charSequence != null ? 0 : 8);
        }
        if (eVar == null || (bVar2 = eVar.e) == null) {
            AppCompatImageView appCompatImageView = xiu0Var.k;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
            }
            AppCompatImageView appCompatImageView2 = xiu0Var.m;
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(8);
            }
        } else if (bVar2 instanceof VkCell.Middle.e.b.C0817b) {
            k(j((VkCell.Middle.e.b.C0817b) bVar2), new d(0, xiu0Var, xiu0.class, "ensureMiddleTitleAlongLeft", "ensureMiddleTitleAlongLeft()Landroidx/appcompat/widget/AppCompatImageView;", 0));
            AppCompatImageView appCompatImageView3 = xiu0Var.m;
            if (appCompatImageView3 != null) {
                appCompatImageView3.setVisibility(8);
            }
        } else if (bVar2 instanceof VkCell.Middle.e.b.c) {
            VkCell.Middle.e.b.c cVar = (VkCell.Middle.e.b.c) bVar2;
            k(j(cVar.a), new e(0, xiu0Var, xiu0.class, "ensureMiddleTitleAlongLeft", "ensureMiddleTitleAlongLeft()Landroidx/appcompat/widget/AppCompatImageView;", 0));
            xiu0Var = this;
            k(j(cVar.b), new f(0, xiu0Var, xiu0.class, "ensureMiddleTitleAlongLeftSecond", "ensureMiddleTitleAlongLeftSecond()Landroidx/appcompat/widget/AppCompatImageView;", 0));
        } else if (!(bVar2 instanceof VkCell.Middle.e.b.d)) {
            throw new NoWhenBranchMatchedException();
        }
        if (eVar == null || (bVar = eVar.f) == null) {
            AppCompatImageView appCompatImageView4 = xiu0Var.l;
            if (appCompatImageView4 != null) {
                appCompatImageView4.setVisibility(8);
            }
            AppCompatImageView appCompatImageView5 = xiu0Var.n;
            if (appCompatImageView5 != null) {
                appCompatImageView5.setVisibility(8);
            }
            VkCell.d dVar = xiu0Var.q;
            if (dVar == null || (view = dVar.getView()) == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        if (bVar instanceof VkCell.Middle.e.b.C0817b) {
            k(j((VkCell.Middle.e.b.C0817b) bVar), new g(0, xiu0Var, xiu0.class, "ensureMiddleTitleAlongRight", "ensureMiddleTitleAlongRight()Landroidx/appcompat/widget/AppCompatImageView;", 0));
            AppCompatImageView appCompatImageView6 = xiu0Var.n;
            if (appCompatImageView6 != null) {
                appCompatImageView6.setVisibility(8);
            }
            VkCell.d dVar2 = xiu0Var.q;
            if (dVar2 == null || (view3 = dVar2.getView()) == null) {
                return;
            }
            view3.setVisibility(8);
            return;
        }
        if (bVar instanceof VkCell.Middle.e.b.c) {
            VkCell.Middle.e.b.c cVar2 = (VkCell.Middle.e.b.c) bVar;
            k(j(cVar2.a), new h(0, xiu0Var, xiu0.class, "ensureMiddleTitleAlongRight", "ensureMiddleTitleAlongRight()Landroidx/appcompat/widget/AppCompatImageView;", 0));
            k(j(cVar2.b), new i(0, this, xiu0.class, "ensureMiddleTitleAlongRightSecond", "ensureMiddleTitleAlongRightSecond()Landroidx/appcompat/widget/AppCompatImageView;", 0));
            VkCell.d dVar3 = this.q;
            if (dVar3 == null || (view2 = dVar3.getView()) == null) {
                return;
            }
            view2.setVisibility(8);
            return;
        }
        if (!(bVar instanceof VkCell.Middle.e.b.d)) {
            throw new NoWhenBranchMatchedException();
        }
        VkCell.d dVar4 = xiu0Var.q;
        if (dVar4 != null) {
            dVar4.a(((VkCell.Middle.e.b.d) bVar).a);
            dVar4.getView().setVisibility(0);
        }
        AppCompatImageView appCompatImageView7 = xiu0Var.l;
        if (appCompatImageView7 != null) {
            appCompatImageView7.setVisibility(8);
        }
        AppCompatImageView appCompatImageView8 = xiu0Var.n;
        if (appCompatImageView8 != null) {
            appCompatImageView8.setVisibility(8);
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        getContext();
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size_l, getContext());
        f4m.B(a2, a2, this);
        d(this.t);
    }

    public final void d(VkCell.Middle.b bVar) {
        this.t = bVar;
        setTitle(bVar != null ? bVar.a : null);
        setSubtitle(bVar != null ? bVar.b : null);
        setExtraSubtitle(bVar != null ? bVar.c : null);
    }

    public final LinearLayout e() {
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            return linearLayout;
        }
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setId(R.id.ds_internal_cell_middle_extra_subtitle_wrapper);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        this.j = linearLayout2;
        this.d.addView(linearLayout2, cpy.b(0, 0, 0, 0, 0, 0, 63));
        return linearLayout2;
    }

    public final wjc f(wjc wjcVar, int i2, LinearLayout linearLayout, izs<? super wjc, s3q0> izsVar) {
        if (wjcVar == null) {
            wjcVar = new wjc(getContext(), null, 0);
            wjcVar.setId(i2);
            gpo0.i(wjcVar, R.attr.vk_ui_text_secondary);
            wjcVar.setIncludeFontPadding(false);
            izsVar.invoke(wjcVar);
            LinearLayout.LayoutParams b2 = cpy.b(0, 0, 0, 0, 0, 0, 63);
            b2.weight = 1.0f;
            linearLayout.addView(wjcVar, b2);
        }
        wjcVar.setTextAppearance(e3m.g(R.attr.vk_ui_typography_footnote, wjcVar.getContext()));
        i(wjcVar, e3m.g(R.attr.vk_ui_typography_footnote, wjcVar.getContext()), an10.b(TypedValue.applyDimension(2, 3, wjcVar.getContext().getResources().getDisplayMetrics())));
        gpo0.i(wjcVar, R.attr.vk_ui_text_secondary);
        return wjcVar;
    }

    public final LinearLayout g() {
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            linearLayout = new LinearLayout(getContext());
            linearLayout.setId(R.id.ds_internal_cell_middle_subtitle_wrapper);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            this.i = linearLayout;
            LinearLayout linearLayout2 = this.h;
            xiu0 xiu0Var = this.d;
            int indexOfChild = xiu0Var.indexOfChild(linearLayout2);
            xiu0Var.addView(linearLayout, indexOfChild != 0 ? 1 + indexOfChild : 1, cpy.b(0, 0, 0, 0, 0, 0, 63));
        }
        return linearLayout;
    }

    public final ziu0 getTitleHolder() {
        return this.s;
    }

    public final aju0 getTitleHolderFactory() {
        return this.r;
    }

    public final LinearLayout h() {
        LinearLayout linearLayout = this.h;
        if (linearLayout != null) {
            return linearLayout;
        }
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setId(R.id.ds_internal_cell_middle_title_wrapper);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        this.h = linearLayout2;
        this.d.addView(linearLayout2, 0, cpy.b(0, 0, 0, 0, 0, 0, 63));
        return linearLayout2;
    }

    public final void setTitleAfterViewController$foundation_release(VkCell.e eVar) {
        View view;
        if (eVar == null) {
            VkCell.d dVar = this.q;
            if (dVar != null && (view = dVar.getView()) != null) {
                h().removeView(view);
            }
            this.q = null;
            return;
        }
        VkCell.d create = eVar.create(getContext());
        View view2 = create.getView();
        view2.setVisibility(8);
        h().addView(view2, cpy.b(0, 0, e3m.a(R.dimen.vk_ui_spacing_size_xs, view2.getContext()), 0, 0, 0, 59));
        this.q = create;
    }

    public final void setTitleHolder(ziu0 ziu0Var) {
        this.s = ziu0Var;
    }

    public final void setTitleHolderFactory(aju0 aju0Var) {
        this.r = aju0Var;
    }
}
