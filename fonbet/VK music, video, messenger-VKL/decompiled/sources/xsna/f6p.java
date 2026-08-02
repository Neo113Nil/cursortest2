package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: EduMaxMembersVc.kt */
/* loaded from: classes2.dex */
public final class f6p {
    public static final int n = cn70.b(52);
    public static final int o = cn70.b(28);
    public static final int p = cn70.b(44);
    public final ViewStub a;
    public final Context b;
    public final h7 c;
    public View d;
    public VkUserStack e;
    public TextView f;
    public View g;
    public ViewGroup h;
    public String i;
    public final e j;
    public d k;
    public final com.vk.im.ui.views.avatars.b l;
    public ValueAnimator m;

    /* compiled from: EduMaxMembersVc.kt */
    public static final class a implements VkCell.d {
        public static final VkCell.Left.Main.Size b = VkCell.Left.Main.Size.ExtraSmall;
        public final AvatarView a;

        public a(Context context) {
            AvatarView avatarView = new AvatarView(context, null, 6, 0);
            avatarView.setRound(true);
            VkCell.Left.Main.Size size = b;
            avatarView.setLayoutParams(new ViewGroup.LayoutParams(size.k(context), size.k(context)));
            this.a = avatarView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if (fVar instanceof c) {
                this.a.Y0(((c) fVar).a.b);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: EduMaxMembersVc.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: EduMaxMembersVc.kt */
    public static final class c implements VkCell.f {
        public final f a;

        public c(f fVar) {
            this.a = fVar;
        }
    }

    /* compiled from: EduMaxMembersVc.kt */
    public final class d extends ViewGroup {
        public final RecyclerView b;
        public final FrameLayout c;

        public d(f6p f6pVar, Context context) {
            super(context);
            RecyclerView recyclerView = new RecyclerView(context);
            this.b = recyclerView;
            FrameLayout frameLayout = new FrameLayout(context);
            this.c = frameLayout;
            int b = cn70.b(6);
            int b2 = cn70.b(12);
            int b3 = cn70.b(6);
            int b4 = cn70.b(16);
            abg0 abg0Var = dhr0.t;
            int c = abg0Var.c(R.attr.vk_ui_background_content);
            recyclerView.setAdapter(f6pVar.j);
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setBackgroundColor(c);
            f4m.v(b, recyclerView);
            addView(recyclerView);
            VkButton vkButton = new VkButton(context, null, 6, 0);
            vkButton.setMode(VkButton.Mode.Primary);
            vkButton.setSize(VkButton.Size.Large);
            vkButton.setTextTint(ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_text_contrast)));
            vkButton.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-11898113, -6478344}));
            vkButton.setText(context.getString(R.string.vkim_edu_max_members_open_max));
            bwt0.i0(vkButton, new udo(f6pVar, 3));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(b2, b3, b2, b2);
            frameLayout.addView(vkButton, layoutParams);
            wng0 wng0Var = new wng0();
            wng0Var.b(c);
            wng0Var.c(0, 0, b4, b4);
            frameLayout.setBackground(wng0Var);
            addView(frameLayout);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            RecyclerView recyclerView = this.b;
            if (recyclerView.getVisibility() != 8) {
                int measuredWidth = recyclerView.getMeasuredWidth();
                i5 = recyclerView.getMeasuredHeight();
                recyclerView.layout(0, 0, measuredWidth, i5);
            } else {
                i5 = 0;
            }
            FrameLayout frameLayout = this.c;
            if (frameLayout.getVisibility() != 8) {
                frameLayout.layout(0, i5, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + i5);
            }
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i2);
            FrameLayout frameLayout = this.c;
            if (frameLayout.getVisibility() != 8) {
                frameLayout.measure(i, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE));
                i3 = frameLayout.getMeasuredHeight();
            } else {
                i3 = 0;
            }
            int i4 = size - i3;
            RecyclerView recyclerView = this.b;
            if (recyclerView.getVisibility() != 8) {
                recyclerView.measure(i, View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
    }

    /* compiled from: EduMaxMembersVc.kt */
    public static final class e extends sxm {
    }

    /* compiled from: EduMaxMembersVc.kt */
    public static final class f implements hfz {
        public final qtd0 b;

        public f(qtd0 qtd0Var) {
            this.b = qtd0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Long.valueOf(this.b.G3());
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return qq.f(new StringBuilder("MemberItem(profile="), this.b, ')');
        }
    }

    /* compiled from: EduMaxMembersVc.kt */
    public static final class g extends vfz<f> {
        public final VkCell l;
        public final DisplayNameFormatter m;

        public g(VkCell vkCell) {
            super(vkCell);
            this.l = vkCell;
            this.m = new DisplayNameFormatter(null, 3, null);
        }

        @Override // xsna.vfz
        public final void W5(f fVar) {
            f fVar2 = fVar;
            VkCell.Left.b a = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new c(fVar2), VkCell.Left.Main.Size.ExtraSmall));
            VkCell vkCell = this.l;
            vkCell.setLeft(a);
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            tlo0.a aVar2 = tlo0.Companion;
            qtd0 qtd0Var = fVar2.b;
            DisplayNameFormatter displayNameFormatter = this.m;
            displayNameFormatter.getClass();
            vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(oq.d(aVar2, displayNameFormatter.e(qtd0Var, UserNameCase.NOM)), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
        }
    }

    /* compiled from: EduMaxMembersVc.kt */
    public static final class h extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ f6p c;

        public h(boolean z, f6p f6pVar) {
            this.b = z;
            this.c = f6pVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            d dVar;
            if (!this.b || (dVar = this.c.k) == null) {
                return;
            }
            f4m.j(dVar);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            FrameLayout frameLayout;
            RecyclerView recyclerView;
            if (this.b) {
                return;
            }
            f6p f6pVar = this.c;
            d dVar = f6pVar.k;
            if (dVar != null && (recyclerView = dVar.b) != null) {
                recyclerView.setVisibility(0);
            }
            d dVar2 = f6pVar.k;
            if (dVar2 != null && (frameLayout = dVar2.c) != null) {
                frameLayout.setVisibility(0);
            }
            d dVar3 = f6pVar.k;
            if (dVar3 != null) {
                dVar3.setVisibility(0);
            }
        }
    }

    public f6p(ViewStub viewStub, Context context, h7 h7Var) {
        this.a = viewStub;
        this.b = context;
        this.c = h7Var;
        e eVar = new e();
        eVar.x0(f.class, new com.vk.movika.sdk.base.logic.interactor.f(eVar, 22));
        this.j = eVar;
        this.l = new com.vk.im.ui.views.avatars.b(context, true);
    }

    public final void a() {
        if (this.k == null) {
            this.k = new d(this, this.b);
            View view = this.d;
            if (view == null) {
                view = null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                marginLayoutParams.setMargins(0, n, 0, 0);
                ((ViewGroup) view).addView(this.k, marginLayoutParams);
            }
        }
    }

    public final void b() {
        View view = this.g;
        if (view == null) {
            view = null;
        }
        final boolean z = view.getRotation() == 180.0f;
        ValueAnimator duration = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(300L);
        final d dVar = this.k;
        if (dVar == null) {
            return;
        }
        final int measuredHeight = dVar.c.getMeasuredHeight() + dVar.b.getMeasuredHeight();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.e6p
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!z) {
                    floatValue = 1.0f - floatValue;
                }
                dVar.setTranslationY((-measuredHeight) * floatValue);
                View view2 = this.g;
                if (view2 == null) {
                    view2 = null;
                }
                view2.setRotation(180.0f - (floatValue * 180.0f));
            }
        });
        duration.addListener(new h(z, this));
        duration.start();
        this.m = duration;
    }
}
