package xsna;

import android.content.Context;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ikv0;

/* compiled from: SnackbarContent.kt */
/* loaded from: classes17.dex */
public final class h7k0 extends ConstraintLayout implements f5z {
    public final ImageView A;
    public final ViewGroup B;
    public final ViewGroup C;
    public final ImageView D;
    public final VKReplacerView E;
    public final VkSpinner F;
    public final ImageView G;
    public final VkBlurView H;
    public final View I;
    public izs<? super izs<? super ikv0, s3q0>, s3q0> J;
    public final androidx.lifecycle.m t;
    public final ikv0.e.b u;
    public final ikv0.e.b v;
    public final TextView w;
    public final TextView x;
    public final VkButton y;
    public final VkButton z;

    /* compiled from: SnackbarContent.kt */
    public static final class a implements fr70, g0t {
        public final /* synthetic */ izs b;

        public a(izs izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.fr70
        public final /* synthetic */ void a(Object obj) {
            this.b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof fr70) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public h7k0(Context context) {
        super(context, null, 0);
        this.t = new androidx.lifecycle.m(this, true);
        Size size = new Size(hbh0.b(28, context), hbh0.b(28, context));
        this.u = new ikv0.e.b(new gko(getDefaults().l()), getDefaults().m(), size, (izs) null, 24);
        this.v = new ikv0.e.b(new gko(getDefaults().f()), getDefaults().g(), size, (izs) null, 24);
        this.J = new o7j0(1);
        LayoutInflater.from(context).inflate(R.layout.ds_internal_snackbar_content, this);
        setClipToOutline(true);
        setOutlineProvider(new avj(getDefaults().b(context)));
        TextView textView = (TextView) findViewById(R.id.title);
        this.w = textView;
        TextView textView2 = (TextView) findViewById(R.id.subtitle);
        this.x = textView2;
        VkButton vkButton = (VkButton) findViewById(R.id.middle_action_button);
        this.y = vkButton;
        VkButton vkButton2 = (VkButton) findViewById(R.id.right_action_button);
        this.z = vkButton2;
        this.A = (ImageView) findViewById(R.id.right_icon);
        this.B = (ViewGroup) findViewById(R.id.right_layout);
        this.C = (ViewGroup) findViewById(R.id.left_layout);
        this.D = (ImageView) findViewById(R.id.left_icon);
        this.E = (VKReplacerView) findViewById(R.id.avatar_image);
        this.G = (ImageView) findViewById(R.id.image_badge);
        this.F = (VkSpinner) findViewById(R.id.loading);
        VkBlurView vkBlurView = (VkBlurView) findViewById(R.id.snackbar_background_blur);
        vkBlurView.setBlurRadius(20.0f);
        this.H = vkBlurView;
        View findViewById = findViewById(R.id.snackbar_background_overlay);
        this.I = findViewById;
        textView.setTextAppearance(getDefaults().n(context));
        gpo0.i(textView, getDefaults().o());
        textView2.setTextAppearance(getDefaults().j(context));
        gpo0.i(textView2, getDefaults().k());
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = getDefaults().p(context);
        textView2.setLayoutParams(marginLayoutParams);
        vkButton2.setSize(getDefaults().c());
        vkButton2.setAppearance(getDefaults().d());
        vkButton2.setMode(getDefaults().e());
        vkButton.setSize(VkButton.Size.Small);
        vkButton.setAppearance(getDefaults().d());
        vkButton.setMode(getDefaults().e());
        getDefaults().getClass();
        gpo0.e(getDefaults().a(), findViewById);
        setMinHeight(getDefaults().i(context));
    }

    private final n7k0 getDefaults() {
        getContext();
        return zn20.a;
    }

    public final void P4(VkButton vkButton, ikv0.f fVar) {
        vkButton.setText(fVar.getText());
        Integer count = fVar.getCount();
        if (count != null) {
            vkButton.setCount(count);
        }
        jjc.g(vkButton, new g84(29, this, fVar));
    }

    public final void Q4(ImageView imageView, ikv0.g gVar) {
        imageView.setImageDrawable(gVar.getIcon().a(imageView.getContext()));
        imageView.getContext();
        cut0 b = gVar.b();
        if (b == null) {
            b = getDefaults().h();
        }
        gpo0.g(imageView, b);
        imageView.setContentDescription(gVar.c());
        Size a2 = gVar.a();
        if (a2 != null) {
            imageView.getLayoutParams().width = a2.getWidth();
            imageView.getLayoutParams().height = a2.getHeight();
        }
    }

    public final izs<izs<? super ikv0, s3q0>, s3q0> getHandleButtonClick$foundation_release() {
        return this.J;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getLifecycle().c(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getLifecycle().c(Lifecycle.Event.ON_DESTROY);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            getLifecycle().c(Lifecycle.Event.ON_RESUME);
        } else {
            getLifecycle().c(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void setHandleButtonClick$foundation_release(izs<? super izs<? super ikv0, s3q0>, s3q0> izsVar) {
        this.J = izsVar;
    }

    public final void setLeft(ikv0.c cVar) {
        f4m.E(this.C, cVar != null);
        if (cVar == null) {
            return;
        }
        boolean z = cVar instanceof ikv0.c.a;
        VKReplacerView vKReplacerView = this.E;
        ImageView imageView = this.G;
        if (z) {
            vKReplacerView.setVisibility(0);
            VkAvatar vkAvatar = new VkAvatar(vKReplacerView.getContext(), null, 6, 0);
            f4m.z(hbh0.b(32, vKReplacerView.getContext()), hbh0.b(32, vKReplacerView.getContext()), vkAvatar);
            vkAvatar.setContent(((ikv0.c.a) cVar).a);
            vkAvatar.A0(R.drawable.ds_internal_avatar_placeholder, ImageView.ScaleType.CENTER_CROP);
            vKReplacerView.a(vkAvatar);
            f4m.j(imageView);
            return;
        }
        if (cVar instanceof ikv0.c.e) {
            vKReplacerView.setVisibility(0);
            ikv0.c.e eVar = (ikv0.c.e) cVar;
            Integer num = eVar.c;
            int intValue = num != null ? num.intValue() : hbh0.b(40, vKReplacerView.getContext());
            VkPicture vkPicture = new VkPicture(vKReplacerView.getContext(), null, 6, 0);
            vkPicture.H0(intValue, intValue);
            vkPicture.setContent(eVar.a);
            vkPicture.setContentDescription(null);
            vkPicture.A0(R.drawable.ds_internal_snackbar_image_placeholder, ImageView.ScaleType.CENTER_CROP);
            vKReplacerView.a(vkPicture);
            ikv0.c.e.a aVar = eVar.b;
            if (aVar == null) {
                f4m.j(imageView);
                return;
            } else {
                imageView.setVisibility(0);
                Q4(imageView, aVar);
                return;
            }
        }
        boolean equals = cVar.equals(ikv0.c.b.a);
        ImageView imageView2 = this.D;
        if (equals) {
            imageView2.setVisibility(0);
            Q4(imageView2, this.v);
            f4m.j(imageView);
            return;
        }
        if (cVar.equals(ikv0.c.f.a)) {
            imageView2.setVisibility(0);
            Q4(imageView2, this.u);
            f4m.j(imageView);
        } else if (cVar instanceof ikv0.c.C3058c) {
            imageView2.setVisibility(0);
            Q4(imageView2, (ikv0.g) cVar);
            f4m.j(imageView);
        } else {
            if (!(cVar instanceof ikv0.c.d)) {
                throw new NoWhenBranchMatchedException();
            }
            VkSpinner vkSpinner = this.F;
            vkSpinner.setVisibility(0);
            vkSpinner.setSpinnerSize(VkSpinner.SpinnerSize.Size24);
            f4m.j(imageView);
        }
    }

    public final void setMiddle(ikv0.d dVar) {
        ikv0.d.c a2 = dVar.a();
        ug50<ikv0.d.a> ug50Var = dVar.c;
        ug50<ikv0.d.b> ug50Var2 = dVar.b;
        if (a2 != null) {
            String str = a2.a;
            TextView textView = this.w;
            ey2.i(textView, str);
            Integer num = a2.b;
            if (num != null) {
                textView.setMaxLines(num.intValue());
            }
        }
        ikv0.d.b d = ug50Var2.d();
        if (d != null) {
            String str2 = d.a;
            TextView textView2 = this.x;
            ey2.i(textView2, str2);
            Integer num2 = d.b;
            if (num2 != null) {
                textView2.setMaxLines(num2.intValue());
            }
        }
        ikv0.d.a d2 = ug50Var.d();
        boolean z = d2 != null;
        VkButton vkButton = this.y;
        f4m.E(vkButton, z);
        if (d2 != null) {
            P4(vkButton, d2);
        }
        dVar.a.e(this, new a(new emh0(this, 3)));
        ug50Var2.e(this, new a(new ebx(this, 27)));
        ug50Var.e(this, new a(new dn20(this, 26)));
    }

    public final void setRight(ikv0.e eVar) {
        f4m.E(this.B, eVar != null);
        if (eVar == null) {
            return;
        }
        boolean z = eVar instanceof ikv0.e.a;
        VkButton vkButton = this.z;
        ImageView imageView = this.A;
        if (z) {
            f4m.j(imageView);
            vkButton.setVisibility(0);
            P4(vkButton, (ikv0.f) eVar);
        } else {
            if (!(eVar instanceof ikv0.e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(vkButton);
            imageView.setVisibility(0);
            Q4(imageView, (ikv0.g) eVar);
            izs<ikv0, s3q0> izsVar = ((ikv0.e.b) eVar).d;
            if (izsVar != null) {
                imageView.setOnClickListener(new hmb(6, this, izsVar));
            }
        }
    }

    public final void setupWithBlurContentView(VkBlurContentView vkBlurContentView) {
        VkBlurView vkBlurView = this.H;
        vkBlurView.setupWithContent(vkBlurContentView);
        vkBlurView.setVisibility(vkBlurContentView != null ? 0 : 8);
    }

    @Override // xsna.f5z
    public androidx.lifecycle.m getLifecycle() {
        return this.t;
    }
}
