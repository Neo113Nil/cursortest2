package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.vk.core.view.components.text.VkText;
import com.vk.libvideo.api.ad.AdChoice;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdMenuAction;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.av20;
import xsna.dw20;

/* compiled from: AdMenuBottomSheet.kt */
/* loaded from: classes3.dex */
public final class mg0 {
    public final Context a;
    public final ArrayList b;
    public final c c;
    public final wc0 d;
    public dw20 e;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new hg(this, 2));

    /* compiled from: AdMenuBottomSheet.kt */
    public final class a extends s770 {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.s770
        public final void m(hkp hkpVar, Object obj, int i) {
            d dVar;
            b bVar = (b) obj;
            View f = hkpVar.f(R.id.video_sport_ad_menu_item);
            mg0 mg0Var = mg0.this;
            ?? r0 = mg0Var.f;
            Context context = mg0Var.a;
            VkText vkText = (VkText) f;
            b.a aVar = bVar.b;
            if (epx.f(aVar, b.a.C3341a.a)) {
                dVar = new d(R.style.VkUiTypography_Text, R.attr.vk_ui_text_primary, e3m.a(R.dimen.vk_ui_spacing_size_l, context), e3m.a(R.dimen.vk_ui_spacing_size_l, context));
            } else if (epx.f(aVar, b.a.c.a)) {
                dVar = new d(R.style.VkUiTypography_Footnote, R.attr.vk_ui_text_subhead, e3m.a(R.dimen.vk_ui_spacing_size_m, context), e3m.a(R.dimen.vk_ui_spacing_size_m, context));
            } else if (epx.f(aVar, b.a.d.a)) {
                dVar = new d(R.style.VkUiTypography_Footnote, R.attr.vk_ui_text_subhead, e3m.a(R.dimen.vk_ui_spacing_size_m, context) / 2, e3m.a(R.dimen.vk_ui_spacing_size_l, context));
            } else if (epx.f(aVar, b.a.e.a)) {
                dVar = new d(R.style.VkUiTypography_Footnote, R.attr.vk_ui_text_subhead, e3m.a(R.dimen.vk_ui_spacing_size_l, context), e3m.a(R.dimen.vk_ui_spacing_size_m, context) / 2);
            } else {
                if (!epx.f(aVar, b.a.C3342b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = new d(R.style.VkUiTypography_Text, R.attr.vk_ui_accent_red, e3m.a(R.dimen.vk_ui_spacing_size_l, context), e3m.a(R.dimen.vk_ui_spacing_size_m, context));
            }
            vkText.setTextAppearance((Context) r0.getValue(), dVar.a);
            vkText.setTextColor(krv0.m(dVar.b, (Context) r0.getValue()));
            awt0.x(vkText, 0, dVar.c, 0, dVar.d, 5);
            vkText.setText(bVar.a.a);
        }

        @Override // xsna.s770
        public final hkp p(View view) {
            hkp hkpVar = new hkp(7);
            hkpVar.d(view.findViewById(R.id.video_sport_ad_menu_item));
            return hkpVar;
        }
    }

    /* compiled from: AdMenuBottomSheet.kt */
    public static final class b {
        public final AdChoice a;
        public final a b;

        /* compiled from: AdMenuBottomSheet.kt */
        public static abstract class a {

            /* compiled from: AdMenuBottomSheet.kt */
            /* renamed from: xsna.mg0$b$a$a, reason: collision with other inner class name */
            public static final class C3341a extends a {
                public static final C3341a a = new C3341a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3341a);
                }

                public final int hashCode() {
                    return -39071543;
                }

                public final String toString() {
                    return "Accent";
                }
            }

            /* compiled from: AdMenuBottomSheet.kt */
            /* renamed from: xsna.mg0$b$a$b, reason: collision with other inner class name */
            public static final class C3342b extends a {
                public static final C3342b a = new C3342b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3342b);
                }

                public final int hashCode() {
                    return -1640875736;
                }

                public final String toString() {
                    return "Complain";
                }
            }

            /* compiled from: AdMenuBottomSheet.kt */
            public static final class c extends a {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 478109811;
                }

                public final String toString() {
                    return "Second";
                }
            }

            /* compiled from: AdMenuBottomSheet.kt */
            public static final class d extends a {
                public static final d a = new d();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public final int hashCode() {
                    return 299271294;
                }

                public final String toString() {
                    return "SecondBottom";
                }
            }

            /* compiled from: AdMenuBottomSheet.kt */
            public static final class e extends a {
                public static final e a = new e();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof e);
                }

                public final int hashCode() {
                    return 1257910242;
                }

                public final String toString() {
                    return "SecondTop";
                }
            }
        }

        public b(AdChoice adChoice, a aVar) {
            this.a = adChoice;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Item(adChoice=" + this.a + ", style=" + this.b + ')';
        }
    }

    /* compiled from: AdMenuBottomSheet.kt */
    public interface c {
        void a(b bVar);

        void onDismiss();
    }

    /* compiled from: AdMenuBottomSheet.kt */
    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public d(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    /* compiled from: AdMenuBottomSheet.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((c) this.receiver).onDismiss();
            return s3q0.a;
        }
    }

    public mg0(Context context, ArrayList arrayList, c cVar, wc0 wc0Var) {
        this.a = context;
        this.b = arrayList;
        this.c = cVar;
        this.d = wc0Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a() {
        dw20 dw20Var = this.e;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        this.e = null;
        av20.a aVar = new av20.a();
        ?? r2 = this.f;
        aVar.d(R.layout.video_sport_ad_menu_item_layout, LayoutInflater.from((Context) r2.getValue()));
        aVar.d = new a();
        aVar.c(new lg0(this, 0));
        av20 b2 = aVar.b();
        b2.setItems(this.b);
        dw20.b bVar = new dw20.b((Context) r2.getValue(), null);
        bVar.a0(new e(0, this.c, c.class, "onDismiss", "onDismiss()V", 0));
        dw20.a.k(bVar, b2, 6);
        this.e = bVar.I0("sport_ad_menu");
        this.d.c(CommonVideoAdsStat$TypeOverlayAdMenuAction.MenuAction.OPEN_MENU);
    }
}
