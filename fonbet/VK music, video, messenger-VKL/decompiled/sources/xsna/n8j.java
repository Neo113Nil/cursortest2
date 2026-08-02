package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.collapse_behavior.CollapseBehavior;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;

/* compiled from: ContactHeaderView.kt */
/* loaded from: classes2.dex */
public abstract class n8j extends ConstraintLayout {
    public final float A;
    public final int B;
    public final CollapseBehavior C;
    public final a D;
    public final int E;
    public final int F;
    public final float G;
    public final float H;
    public final int I;
    public final mk5 J;
    public final ImAvatarView t;
    public final TextView u;
    public final ImageView v;
    public final TextView w;
    public final int x;
    public final int y;
    public final float z;

    /* compiled from: ContactHeaderView.kt */
    public static final class a {
        public a() {
        }

        public final void a() {
            n8j n8jVar = n8j.this;
            zmp0.a(n8jVar, n8jVar.J);
            n8j.P4(n8jVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        public final void b() {
            n8j n8jVar = n8j.this;
            zmp0.a(n8jVar, n8jVar.J);
            n8j.P4(n8jVar, 1.0f);
        }
    }

    public n8j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final void P4(n8j n8jVar, float f) {
        n8jVar.setAvatarSize(f);
        n8jVar.setAvatarMarginTop(f);
        n8jVar.setNameTextSize(f);
        n8jVar.setStatusTextSize(f);
        n8jVar.setNameMarginTop(f);
    }

    private final void setAvatarMarginTop(float f) {
        f4m.t((int) ((f * this.F) + this.y), this.t);
    }

    private final void setAvatarSize(float f) {
        int i = (int) ((f * this.E) + this.x);
        ImAvatarView imAvatarView = this.t;
        ViewGroup.LayoutParams layoutParams = imAvatarView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imAvatarView.setLayoutParams(layoutParams);
    }

    private final void setNameMarginTop(float f) {
        f4m.t((int) ((f * this.I) + this.B), this.u);
    }

    private final void setNameTextSize(float f) {
        this.u.setTextSize(0, (f * this.G) + this.z);
    }

    private final void setStatusTextSize(float f) {
        this.w.setTextSize(0, (f * this.H) + this.A);
    }

    public final ImAvatarView getAvatarView() {
        return this.t;
    }

    public abstract int getLayoutId();

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C.c = this.D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C.c = null;
    }

    public final void setAvatar(qtd0 qtd0Var) {
        this.t.s1(qtd0Var);
    }

    public final void setName(CharSequence charSequence) {
        this.u.setText(charSequence);
    }

    public final void setStatusText(String str) {
        this.w.setText(str);
    }

    public final void setVerified(VerifyInfo verifyInfo) {
        int i;
        boolean Db = verifyInfo.Db();
        ImageView imageView = this.v;
        if (Db) {
            imageView.setImageDrawable(VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, getContext(), VerifyInfoHelper.ColorTheme.normal, 24));
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public n8j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.C = new CollapseBehavior(iah0.f().heightPixels / 3);
        mk5 mk5Var = new mk5();
        mk5Var.e(300L);
        this.J = mk5Var;
        int layoutId = getLayoutId();
        qcy<Object>[] qcyVarArr = bwt0.a;
        View findViewById = LayoutInflater.from(getContext()).inflate(layoutId, (ViewGroup) this, true).findViewById(R.id.im_contact_header);
        this.t = (ImAvatarView) findViewById.findViewById(R.id.im_avatar);
        this.u = (TextView) findViewById.findViewById(R.id.im_name);
        this.v = (ImageView) findViewById.findViewById(R.id.im_verified);
        this.w = (TextView) findViewById.findViewById(R.id.im_last_seen);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.e);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        float dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        float dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.x = dimensionPixelSize6;
        int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.y = dimensionPixelSize7;
        float dimensionPixelSize8 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.z = dimensionPixelSize8;
        float dimensionPixelSize9 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.A = dimensionPixelSize9;
        int dimensionPixelSize10 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.B = dimensionPixelSize10;
        obtainStyledAttributes.recycle();
        this.E = dimensionPixelSize - dimensionPixelSize6;
        this.F = dimensionPixelSize2 - dimensionPixelSize7;
        this.G = dimensionPixelSize3 - dimensionPixelSize8;
        this.H = dimensionPixelSize4 - dimensionPixelSize9;
        this.I = dimensionPixelSize5 - dimensionPixelSize10;
        this.D = new a();
    }

    public final void setAvatar(ImageList imageList) {
        this.t.o1(imageList, null);
    }
}
