package xsna;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkModalCardContent.kt */
/* loaded from: classes17.dex */
public final class c5v0 extends FrameLayout {
    public c b;
    public b c;
    public View d;
    public a e;
    public boolean f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final LinearLayout j;
    public final ViewGroup k;
    public final ImageView l;
    public final VKReplacerView m;
    public final VKReplacerView n;
    public final VKReplacerView o;
    public final TextView p;
    public final TextView q;
    public final VkButton r;
    public final VkButton s;

    /* compiled from: VkModalCardContent.kt */
    public static final class a {
        public final C2643a a;
        public final C2643a b;
        public final boolean c;

        /* compiled from: VkModalCardContent.kt */
        /* renamed from: xsna.c5v0$a$a, reason: collision with other inner class name */
        public static final class C2643a {
            public final tlo0 a;
            public final gzs<s3q0> b;
            public final VkButton.Size c;
            public final VkButton.Mode d;
            public final VkButton.Appearance e;
            public final boolean f;

            public C2643a() {
                throw null;
            }

            public C2643a(tlo0 tlo0Var, gzs gzsVar, VkButton.Size size, VkButton.Mode mode, VkButton.Appearance appearance, boolean z, int i) {
                size = (i & 32) != 0 ? VkButton.Size.Large : size;
                mode = (i & 64) != 0 ? VkButton.Mode.Primary : mode;
                appearance = (i & 128) != 0 ? VkButton.Appearance.Accent : appearance;
                z = (i & 256) != 0 ? true : z;
                this.a = tlo0Var;
                this.b = gzsVar;
                this.c = size;
                this.d = mode;
                this.e = appearance;
                this.f = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2643a)) {
                    return false;
                }
                C2643a c2643a = (C2643a) obj;
                return epx.f(this.a, c2643a.a) && epx.f(this.b, c2643a.b) && this.c == c2643a.c && this.d == c2643a.d && this.e == c2643a.e && this.f == c2643a.f;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + sf3.a(this.a.hashCode() * 31, 923521, this.b)) * 31)) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Button(text=");
                sb.append(this.a);
                sb.append(", onClick=");
                sb.append(this.b);
                sb.append(", icon=null, trailingIcon=null, count=null, buttonSize=");
                sb.append(this.c);
                sb.append(", buttonMode=");
                sb.append(this.d);
                sb.append(", buttonAppearance=");
                sb.append(this.e);
                sb.append(", enabled=");
                return defpackage.q0.a(sb, this.f, ')');
            }
        }

        public /* synthetic */ a(C2643a c2643a, C2643a c2643a2, int i) {
            this(c2643a, (i & 2) != 0 ? null : c2643a2, (i & 4) != 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            C2643a c2643a = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (c2643a == null ? 0 : c2643a.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Buttons(firstButton=");
            sb.append(this.a);
            sb.append(", secondButton=");
            sb.append(this.b);
            sb.append(", isVerticalOrientation=");
            return defpackage.q0.a(sb, this.c, ')');
        }

        public a(C2643a c2643a, C2643a c2643a2, boolean z) {
            this.a = c2643a;
            this.b = c2643a2;
            this.c = z;
        }
    }

    /* compiled from: VkModalCardContent.kt */
    public static final class b {
        public final tlo0 a;
        public final tlo0 b;
        public final TextUtils.TruncateAt c;
        public final Integer d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b() {
            this(15, r0, r0);
            tlo0 tlo0Var = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            tlo0 tlo0Var = this.a;
            int hashCode = (tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31;
            tlo0 tlo0Var2 = this.b;
            int hashCode2 = (hashCode + (tlo0Var2 == null ? 0 : tlo0Var2.hashCode())) * 31;
            TextUtils.TruncateAt truncateAt = this.c;
            int hashCode3 = (hashCode2 + (truncateAt == null ? 0 : truncateAt.hashCode())) * 31;
            Integer num = this.d;
            return hashCode3 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Main(title=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", titleEllipsize=");
            sb.append(this.c);
            sb.append(", titleMaxLines=");
            return uqi.b(sb, this.d, ')');
        }

        public /* synthetic */ b(int i, tlo0 tlo0Var, tlo0 tlo0Var2) {
            this((i & 1) != 0 ? null : tlo0Var, (i & 2) != 0 ? null : tlo0Var2, null, (i & 8) != 0 ? null : 3);
        }

        public b(tlo0 tlo0Var, tlo0 tlo0Var2, TextUtils.TruncateAt truncateAt, Integer num) {
            this.a = tlo0Var;
            this.b = tlo0Var2;
            this.c = truncateAt;
            this.d = num;
        }
    }

    /* compiled from: VkModalCardContent.kt */
    public interface c {

        /* compiled from: VkModalCardContent.kt */
        public static final class a implements c {
            public final c.d a;
            public final int b;

            public a(c.d dVar) {
                Context context = e43.a;
                int b = hbh0.b(56, context == null ? null : context);
                this.a = dVar;
                this.b = b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b;
            }

            public final int hashCode() {
                return shy.a(this.b, this.a.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Avatar(content=");
                sb.append(this.a);
                sb.append(", size=");
                return h5s.c(this.b, ", contentDescription=null)", sb);
            }
        }

        /* compiled from: VkModalCardContent.kt */
        public static final class b implements c {
            public final gko a;
            public final cut0 b;
            public final Size c;

            public b(gko gkoVar, cut0 cut0Var, Size size, int i) {
                cut0Var = (i & 2) != 0 ? new x7g(R.attr.vk_ui_icon_secondary) : cut0Var;
                size = (i & 4) != 0 ? null : size;
                this.a = gkoVar;
                this.b = cut0Var;
                this.c = size;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.a.a) * 31;
                cut0 cut0Var = this.b;
                int hashCode2 = (hashCode + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31;
                Size size = this.c;
                return (hashCode2 + (size != null ? size.hashCode() : 0)) * 31;
            }

            public final String toString() {
                return "Icon(icon=" + this.a + ", iconTint=" + this.b + ", iconSize=" + this.c + ", iconDescription=null)";
            }
        }

        /* compiled from: VkModalCardContent.kt */
        /* renamed from: xsna.c5v0$c$c, reason: collision with other inner class name */
        public static final class C2644c implements c {
            public final vlw a;
            public final Size b;
            public final float c;
            public final boolean d;

            public C2644c(vlw vlwVar, Size size, boolean z, int i) {
                float f;
                if ((i & 8) != 0) {
                    Context context = e43.a;
                    f = hbh0.a(context == null ? null : context, 2.0f);
                } else {
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                this.a = vlwVar;
                this.b = size;
                this.c = f;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2644c)) {
                    return false;
                }
                C2644c c2644c = (C2644c) obj;
                return epx.f(this.a, c2644c.a) && epx.f(this.b, c2644c.b) && Float.compare(this.c, c2644c.c) == 0 && this.d == c2644c.d;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Size size = this.b;
                return Boolean.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, (hashCode + (size == null ? 0 : size.hashCode())) * 961, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Image(source=");
                sb.append(this.a);
                sb.append(", size=");
                sb.append(this.b);
                sb.append(", contentDescription=null, radius=");
                sb.append(this.c);
                sb.append(", isWithPaddings=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: VkModalCardContent.kt */
        public static final class d implements c {
            public final com.vk.core.view.components.picture.c a;
            public final int b;

            public d(com.vk.core.view.components.picture.c cVar, int i, int i2) {
                if ((i2 & 2) != 0) {
                    Context context = e43.a;
                    i = hbh0.b(56, context == null ? null : context);
                }
                this.a = cVar;
                this.b = i;
            }
        }
    }

    public c5v0(Context context) {
        super(context, null, 0);
        this.f = true;
        setId(R.id.ds_internal_modal_card_container);
        LayoutInflater.from(context).inflate(R.layout.ds_internal_modal_default_content, (ViewGroup) this, true);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.root);
        this.g = viewGroup;
        viewGroup.setClipToOutline(true);
        viewGroup.setOutlineProvider(new avj(hbh0.a(context, 10.0f)));
        this.h = (ViewGroup) findViewById(R.id.top);
        this.i = (ViewGroup) findViewById(R.id.main);
        this.k = (ViewGroup) findViewById(R.id.bottom_content);
        this.j = (LinearLayout) findViewById(R.id.buttons);
        this.l = (ImageView) findViewById(R.id.top_icon);
        this.m = (VKReplacerView) findViewById(R.id.top_avatar_view);
        this.o = (VKReplacerView) findViewById(R.id.top_image_view);
        this.n = (VKReplacerView) findViewById(R.id.top_picture_view);
        this.p = (TextView) findViewById(R.id.main_title);
        TextView textView = (TextView) findViewById(R.id.main_description);
        if (x9z.a == null) {
            x9z.a = new x9z();
        }
        textView.setMovementMethod(x9z.a);
        this.q = textView;
        this.r = (VkButton) findViewById(R.id.button_first);
        this.s = (VkButton) findViewById(R.id.button_second);
    }

    public static void a(VkButton vkButton, a.C2643a c2643a) {
        vkButton.setText(c2643a.a.a(vkButton.getContext()));
        vkButton.setCount(null);
        vkButton.setSize(c2643a.c);
        vkButton.setMode(c2643a.d);
        vkButton.setAppearance(c2643a.e);
        vkButton.setEnabled(c2643a.f);
        jjc.g(vkButton, new r0r0(c2643a, 14));
    }

    private final void setMainTitleEllipsizeEndAndMaxLines(b bVar) {
        TextUtils.TruncateAt truncateAt = bVar.c;
        TextView textView = this.p;
        if (truncateAt != null) {
            textView.setEllipsize(truncateAt);
        }
        Integer num = bVar.d;
        if (num != null) {
            textView.setMaxLines(num.intValue());
        }
    }

    public final void b() {
        int i = 0;
        int a2 = this.f ? e3m.a(R.dimen.vk_ui_base_padding_horizontal, getContext()) : 0;
        int b2 = this.f ? hbh0.b(16, getContext()) : 0;
        c cVar = this.b;
        boolean z = cVar instanceof c.C2644c;
        boolean z2 = z ? ((c.C2644c) cVar).d && this.f : this.f;
        int i2 = z2 ? a2 : 0;
        if (z2 && z) {
            i = i2;
        } else if (z2 && cVar != null) {
            i = e3m.a(R.dimen.vk_ui_spacing_size2_xl, getContext());
        }
        ViewGroup viewGroup = this.g;
        f4m.y(i, viewGroup);
        f4m.l(i2, i2, this.h);
        f4m.l(a2, a2, this.i);
        f4m.l(a2, a2, this.k);
        f4m.l(a2, a2, this.j);
        f4m.v(b2, viewGroup);
    }

    public final View getBottomContent() {
        return this.d;
    }

    public final a getButtons() {
        return this.e;
    }

    public final b getMain() {
        return this.c;
    }

    @Override // android.view.View
    public final c getTop() {
        return this.b;
    }

    public final void setBottomContent(View view) {
        this.d = view;
        boolean z = view != null;
        ViewGroup viewGroup = this.k;
        f4m.E(viewGroup, z);
        View view2 = this.d;
        if (view2 != null) {
            viewGroup.addView(view2, -1, -2);
        }
    }

    public final void setButtons(a aVar) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        this.e = aVar;
        boolean z = aVar != null;
        LinearLayout linearLayout = this.j;
        f4m.E(linearLayout, z);
        a aVar2 = this.e;
        if (aVar2 != null) {
            a.C2643a c2643a = aVar2.b;
            boolean z2 = c2643a != null;
            VkButton vkButton = this.s;
            f4m.E(vkButton, z2);
            a.C2643a c2643a2 = aVar2.a;
            VkButton vkButton2 = this.r;
            a(vkButton2, c2643a2);
            if (c2643a != null) {
                a(vkButton, c2643a);
                a aVar3 = this.e;
                if (aVar3 != null) {
                    boolean z3 = aVar3.c;
                    linearLayout.setOrientation(z3 ? 1 : 0);
                    if (z3) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    } else {
                        layoutParams = new LinearLayout.LayoutParams(0, -2);
                        layoutParams.weight = 1.0f;
                    }
                    vkButton2.setLayoutParams(layoutParams);
                    if (z3) {
                        layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    } else {
                        layoutParams2 = new LinearLayout.LayoutParams(0, -2);
                        layoutParams2.weight = 1.0f;
                    }
                    layoutParams2.topMargin = z3 ? hbh0.b(12, getContext()) : 0;
                    layoutParams2.setMarginStart(z3 ? 0 : hbh0.b(12, getContext()));
                    vkButton.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void setMain(b bVar) {
        this.c = bVar;
        f4m.E(this.i, bVar != null);
        b bVar2 = this.c;
        if (bVar2 != null) {
            setMainTitleEllipsizeEndAndMaxLines(bVar2);
            tlo0 tlo0Var = bVar2.a;
            CharSequence a2 = tlo0Var != null ? tlo0Var.a(getContext()) : null;
            TextView textView = this.p;
            ey2.i(textView, a2);
            tlo0 tlo0Var2 = bVar2.b;
            CharSequence a3 = tlo0Var2 != null ? tlo0Var2.a(getContext()) : null;
            TextView textView2 = this.q;
            ey2.i(textView2, a3);
            f4m.t(textView.getVisibility() == 0 ? hbh0.b(8, getContext()) : 0, textView2);
        }
    }

    public final void setTop(c cVar) {
        this.b = cVar;
        f4m.E(this.h, cVar != null);
        ImageView imageView = this.l;
        f4m.j(imageView);
        VKReplacerView vKReplacerView = this.n;
        f4m.j(vKReplacerView.getView());
        VKReplacerView vKReplacerView2 = this.m;
        f4m.j(vKReplacerView2.getView());
        VKReplacerView vKReplacerView3 = this.o;
        f4m.j(vKReplacerView3.getView());
        c cVar2 = this.b;
        if (cVar2 != null) {
            if (cVar2 instanceof c.b) {
                c.b bVar = (c.b) cVar2;
                imageView.setVisibility(0);
                imageView.setImageDrawable(gko.b(bVar.a.a, imageView.getContext()));
                gpo0.g(imageView, bVar.b);
                imageView.setContentDescription(null);
                Size size = bVar.c;
                if (size != null) {
                    imageView.getLayoutParams().width = size.getWidth();
                    imageView.getLayoutParams().height = size.getHeight();
                }
            } else if (cVar2 instanceof c.a) {
                c.a aVar = (c.a) cVar2;
                vKReplacerView2.getView().setVisibility(0);
                View view = vKReplacerView2.getView();
                VkAvatar vkAvatar = view instanceof VkAvatar ? (VkAvatar) view : null;
                if (vkAvatar == null) {
                    vkAvatar = new VkAvatar(vKReplacerView2.getContext(), null, 6, 0);
                    vKReplacerView2.a(vkAvatar);
                }
                int i = aVar.b;
                f4m.z(i, i, vkAvatar);
                vkAvatar.setContent(aVar.a);
                vkAvatar.setContentDescription(null);
                vkAvatar.A0(R.drawable.ds_internal_avatar_placeholder, ImageView.ScaleType.CENTER_CROP);
            } else if (cVar2 instanceof c.d) {
                c.d dVar = (c.d) cVar2;
                vKReplacerView.getView().setVisibility(0);
                View view2 = vKReplacerView.getView();
                VkPicture vkPicture = view2 instanceof VkPicture ? (VkPicture) view2 : null;
                if (vkPicture == null) {
                    vkPicture = new VkPicture(vKReplacerView.getContext(), null, 6, 0);
                    vKReplacerView.a(vkPicture);
                }
                int i2 = dVar.b;
                f4m.z(i2, i2, vkPicture);
                vkPicture.setContent(dVar.a);
                vkPicture.setContentDescription(null);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(gpo0.d(R.attr.vk_ui_image_placeholder_alpha, vKReplacerView));
                gradientDrawable.setStroke((int) hbh0.a(vKReplacerView.getContext(), 0.5f), gpo0.d(R.attr.vk_ui_image_border_alpha, vKReplacerView));
                vkPicture.F0(gradientDrawable, ImageView.ScaleType.CENTER_CROP);
            } else {
                if (!(cVar2 instanceof c.C2644c)) {
                    throw new NoWhenBranchMatchedException();
                }
                c.C2644c c2644c = (c.C2644c) cVar2;
                vKReplacerView3.getView().setVisibility(0);
                View view3 = vKReplacerView3.getView();
                VkImage vkImage = view3 instanceof VkImage ? (VkImage) view3 : null;
                if (vkImage == null) {
                    vkImage = new VkImage(vKReplacerView3.getContext(), null, 6, 0);
                    vKReplacerView3.a(vkImage);
                }
                Size size2 = c2644c.b;
                if (size2 != null) {
                    f4m.A(vkImage, size2);
                }
                vkImage.p0(c2644c.a);
                vkImage.setCornerRadius(c2644c.c);
                vkImage.setContentDescription(null);
            }
        }
        b();
    }

    public final void setWithPaddings(boolean z) {
        this.f = z;
        b();
    }
}
