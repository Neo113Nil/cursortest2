package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: TutorialBannerView.kt */
/* loaded from: classes6.dex */
public final class zsp0 extends LinearLayout {
    public a b;
    public yng0 c;
    public AppCompatTextView d;
    public AppCompatTextView e;

    /* compiled from: TutorialBannerView.kt */
    public static final class a {
        public final tlo0.f a;
        public final tlo0.f b;
        public final C4198a c;

        /* compiled from: TutorialBannerView.kt */
        /* renamed from: xsna.zsp0$a$a, reason: collision with other inner class name */
        public static final class C4198a {
            public final gko a;

            public C4198a(int i) {
                this.a = new gko(i);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4198a) && epx.f(this.a, ((C4198a) obj).a);
            }

            public final int hashCode() {
                return Integer.hashCode(this.a.a) * 31;
            }

            public final String toString() {
                return "TopImageDrawable(image=" + this.a + ", imageDescription=null)";
            }
        }

        public a(tlo0.f fVar, tlo0.f fVar2, C4198a c4198a) {
            this.a = fVar;
            this.b = fVar2;
            this.c = c4198a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b.a, Integer.hashCode(this.a.a) * 31, 31);
        }

        public final String toString() {
            return "Content(title=" + this.a + ", subtitle=" + this.b + ", topImage=" + this.c + ')';
        }
    }

    public final a getContent() {
        return this.b;
    }

    public final void setContent(a aVar) {
        gko gkoVar;
        this.b = aVar;
        a.C4198a c4198a = aVar != null ? aVar.c : null;
        yng0 yng0Var = this.c;
        if (yng0Var == null) {
            yng0Var = new yng0(getContext());
            yng0Var.setId(R.id.vk_ui_tutorial_banner_drawable);
            this.c = yng0Var;
            yng0Var.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(yng0Var, new ViewGroup.LayoutParams(-1, iah0.a(64)));
        }
        yng0Var.setImageDrawable((c4198a == null || (gkoVar = c4198a.a) == null) ? null : gko.b(gkoVar.a, yng0Var.getContext()));
        yng0Var.setImportantForAccessibility(2);
        tlo0.f fVar = aVar != null ? aVar.a : null;
        AppCompatTextView appCompatTextView = this.d;
        if (appCompatTextView == null) {
            appCompatTextView = new AppCompatTextView(getContext());
            appCompatTextView.setId(R.id.vk_ui_tutorial_banner_title);
            appCompatTextView.setTextAppearance(R.style.VkUiTypography_HeadlineMedium);
            appCompatTextView.setTextColor(krv0.m(R.attr.vk_ui_text_primary, getContext()));
            appCompatTextView.setMaxLines(Integer.MAX_VALUE);
            this.d = appCompatTextView;
            addView(appCompatTextView, new ViewGroup.LayoutParams(-1, -2));
            f4m.t(iah0.a(8), appCompatTextView);
        }
        appCompatTextView.setText(fVar != null ? tlo0.b.a(fVar, appCompatTextView.getContext()) : null);
        tlo0.f fVar2 = aVar != null ? aVar.b : null;
        AppCompatTextView appCompatTextView2 = this.e;
        if (appCompatTextView2 == null) {
            appCompatTextView2 = new AppCompatTextView(getContext());
            appCompatTextView2.setId(R.id.vk_ui_tutorial_banner_subtitle);
            appCompatTextView2.setTextAppearance(R.style.VkUiTypography_FootnoteNormal);
            appCompatTextView2.setTextColor(krv0.m(R.attr.vk_ui_text_subhead, getContext()));
            appCompatTextView2.setMaxLines(Integer.MAX_VALUE);
            appCompatTextView2.setMinLines(2);
            addView(appCompatTextView2, new ViewGroup.LayoutParams(-1, -2));
            this.e = appCompatTextView2;
            f4m.t(iah0.a(4), appCompatTextView2);
        }
        appCompatTextView2.setText(fVar2 != null ? tlo0.b.a(fVar2, appCompatTextView2.getContext()) : null);
    }
}
