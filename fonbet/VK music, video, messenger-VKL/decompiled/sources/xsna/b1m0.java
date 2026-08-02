package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.stickers.api.models.question.StoryQuestionInfo;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.vpe0;

/* compiled from: StoryCreateQuestionDialog.kt */
/* loaded from: classes16.dex */
public final class b1m0 extends tyl0<Object> implements w0m0, fux<t0m0> {
    public static final int v = iah0.a(48);
    public final v3l0 f;
    public Animation g;
    public Animation h;
    public Animation i;
    public Animation j;
    public ViewGroup k;
    public VkInputSelect l;
    public ViewGroup m;
    public TextView n;
    public RecyclerView o;
    public v0m0 p;
    public StoryQuestionInfo.a q;
    public ValueAnimator r;
    public z0m0 s;
    public final c1m0 t;
    public v2l0 u;

    /* compiled from: StoryCreateQuestionDialog.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ StoryQuestionInfo.a c;

        public a(StoryQuestionInfo.a aVar) {
            this.c = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            StoryQuestionInfo.a a = StoryQuestionInfo.a.a(this.c);
            b1m0 b1m0Var = b1m0.this;
            b1m0Var.q = a;
            b1m0Var.f(a);
        }
    }

    public b1m0(Context context, x0m0 x0m0Var, v3l0 v3l0Var) {
        super(LayoutInflater.from(context).inflate(R.layout.story_question_dialog_layout, (ViewGroup) null), false, v3l0Var);
        this.f = v3l0Var;
        new ArrayList();
        this.t = new c1m0(this, new vb7(), x0m0Var);
        Window window = getWindow();
        if (window != null) {
            mhy.g(window);
        }
    }

    @Override // xsna.w0m0
    public final void D7(boolean z) {
        VkInputSelect vkInputSelect = this.l;
        if (vkInputSelect == null) {
            vkInputSelect = null;
        }
        vkInputSelect.setGravity(z ? 1 : 49);
    }

    @Override // xsna.w0m0
    public final void De(String str) {
        VkInputSelect vkInputSelect = this.l;
        if (vkInputSelect == null) {
            vkInputSelect = null;
        }
        vkInputSelect.setText(str);
    }

    @Override // xsna.w0m0
    public final void Kl(int i) {
        int length = Lf().length();
        if (length < 0 || length > i) {
            return;
        }
        VkInputSelect vkInputSelect = this.l;
        if (vkInputSelect == null) {
            vkInputSelect = null;
        }
        vkInputSelect.setSelection(i);
    }

    @Override // xsna.w0m0
    public final void L6(String str) {
        VkInputSelect vkInputSelect = this.l;
        if (vkInputSelect == null) {
            vkInputSelect = null;
        }
        vkInputSelect.setHint(str);
    }

    @Override // xsna.w0m0
    public final String Lf() {
        String obj;
        String d;
        VkInputSelect vkInputSelect = this.l;
        if (vkInputSelect == null) {
            vkInputSelect = null;
        }
        Editable text = vkInputSelect.getText();
        return (text == null || (obj = text.toString()) == null || (d = cqm0.d(obj)) == null) ? "" : d;
    }

    @Override // xsna.w0m0
    public final void O4() {
        RecyclerView recyclerView = this.o;
        if (recyclerView == null) {
            recyclerView = null;
        }
        bwt0.p0(recyclerView, true);
    }

    @Override // xsna.w0m0
    public final void Rk(final StoryQuestionInfo.a aVar, boolean z) {
        if (!z || this.q == null) {
            StoryQuestionInfo.a a2 = StoryQuestionInfo.a.a(aVar);
            this.q = a2;
            f(a2);
            return;
        }
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final StoryQuestionInfo.a a3 = StoryQuestionInfo.a.a(this.q);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.y0m0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                b1m0 b1m0Var = b1m0.this;
                StoryQuestionInfo.a aVar2 = b1m0Var.q;
                if (aVar2 != null) {
                    StoryQuestionInfo.a aVar3 = a3;
                    int i = aVar3.a;
                    StoryQuestionInfo.a aVar4 = aVar;
                    aVar2.a = l8g.a(floatValue, i, aVar4.a);
                    aVar2.c = l8g.a(floatValue, aVar3.c, aVar4.c);
                    aVar2.d = l8g.a(floatValue, aVar3.d, aVar4.d);
                    aVar2.j = l8g.a(floatValue, aVar3.j, aVar4.j);
                    aVar2.b = l8g.a(floatValue, aVar3.b, aVar4.b);
                    aVar2.e = l8g.a(floatValue, aVar3.e, aVar4.e);
                    aVar2.f = l8g.a(floatValue, aVar3.f, aVar4.f);
                    aVar2.h = l8g.a(floatValue, aVar3.h, aVar4.h);
                    aVar2.g = l8g.a(floatValue, aVar3.g, aVar4.g);
                    b1m0Var.f(aVar2);
                }
            }
        });
        ofFloat.addListener(new a(aVar));
        ofFloat.setDuration(200L);
        this.r = ofFloat;
        ofFloat.start();
    }

    @Override // xsna.w0m0
    public final void Ua(StoryQuestionInfo.Style style) {
        List<t0m0> y0;
        t0m0 t0m0Var;
        z0m0 z0m0Var;
        List<t0m0> y02;
        v0m0 v0m0Var = this.p;
        int i = -1;
        if (v0m0Var != null && (y02 = v0m0Var.y0()) != null) {
            Iterator it = ((ArrayList) y02).iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((t0m0) it.next()).a == style) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        v0m0 v0m0Var2 = this.p;
        if (v0m0Var2 == null || (y0 = v0m0Var2.y0()) == null || (t0m0Var = (t0m0) j5g.b0(i, y0)) == null || (z0m0Var = this.s) == null) {
            return;
        }
        z0m0Var.li(i, t0m0Var);
    }

    @Override // xsna.w0m0
    public final String Y5() {
        String obj;
        VkInputSelect vkInputSelect = this.l;
        if (vkInputSelect == null) {
            vkInputSelect = null;
        }
        CharSequence hint = vkInputSelect.getHint();
        return (hint == null || (obj = hint.toString()) == null) ? "" : obj;
    }

    @Override // xsna.tyl0
    public final void b(ViewGroup viewGroup) {
        this.g = AnimationUtils.loadAnimation(getContext(), R.anim.stories_question_text_in);
        this.h = AnimationUtils.loadAnimation(getContext(), R.anim.stories_question_text_out);
        this.i = AnimationUtils.loadAnimation(getContext(), R.anim.stories_question_text_in);
        this.j = AnimationUtils.loadAnimation(getContext(), R.anim.stories_question_text_out);
        this.s = new z0m0(this);
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.story_question_dialog_colors_recycler);
        z0m0 z0m0Var = this.s;
        v0m0 v0m0Var = z0m0Var != null ? new v0m0(z0m0Var) : null;
        this.p = v0m0Var;
        recyclerView.setAdapter(v0m0Var);
        recyclerView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new v98(10, 0, 0, true));
        this.o = recyclerView;
        bwt0.h0(this, viewGroup.findViewById(R.id.story_dialog_root_layout));
        this.m = (ViewGroup) viewGroup.findViewById(R.id.story_question_input_sample_wrapper);
        this.n = (TextView) viewGroup.findViewById(R.id.story_question_input_sample);
        VkInputSelect vkInputSelect = (VkInputSelect) viewGroup.findViewById(R.id.story_question_dialog_question_edit_text);
        vkInputSelect.setFont(FontFamily.MEDIUM);
        vkInputSelect.setMaxLines(4);
        vkInputSelect.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(65)});
        vkInputSelect.setInputType(671745);
        vkInputSelect.b(new a1m0(this, vkInputSelect));
        this.l = vkInputSelect;
        h();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.story_question_dialog_question_layout);
        viewGroup2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        bwt0.h0(this, viewGroup2);
        if (!fnj.d(getContext())) {
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iah0.f().widthPixels - (v * 2);
            viewGroup2.setLayoutParams(layoutParams);
        }
        this.k = viewGroup2;
        this.e.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.tyl0
    public final View c() {
        VkInputSelect vkInputSelect = this.l;
        if (vkInputSelect == null) {
            return null;
        }
        return vkInputSelect;
    }

    @Override // xsna.w0m0
    public final void ch() {
        RecyclerView recyclerView = this.o;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.performHapticFeedback(0);
    }

    @Override // xsna.tyl0
    public final void d() {
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            viewGroup = null;
        }
        v3l0 v3l0Var = this.f;
        v3l0Var.a(viewGroup);
        v3l0Var.a(this.e);
        RecyclerView recyclerView = this.o;
        v3l0Var.a(recyclerView != null ? recyclerView : null);
    }

    public final void f(StoryQuestionInfo.a aVar) {
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ((GradientDrawable) viewGroup.getBackground()).setColor(aVar.a);
        VkInputSelect vkInputSelect = this.l;
        if (vkInputSelect == null) {
            vkInputSelect = null;
        }
        vkInputSelect.setHintTextColor(aVar.c);
        VkInputSelect vkInputSelect2 = this.l;
        if (vkInputSelect2 == null) {
            vkInputSelect2 = null;
        }
        vkInputSelect2.setTextColor(aVar.d);
        if (Build.VERSION.SDK_INT >= 29) {
            VkInputSelect vkInputSelect3 = this.l;
            if (vkInputSelect3 == null) {
                vkInputSelect3 = null;
            }
            Drawable textCursorDrawable = vkInputSelect3.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable.setColorFilter(new BlendModeColorFilter(aVar.j, BlendMode.SRC_ATOP));
            }
        } else {
            VkInputSelect vkInputSelect4 = this.l;
            if (vkInputSelect4 == null) {
                vkInputSelect4 = null;
            }
            vkInputSelect4.setCursorColor(aVar.j);
        }
        ViewGroup viewGroup2 = this.m;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        ((GradientDrawable) viewGroup2.getBackground()).setColor(aVar.g);
        TextView textView = this.n;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(aVar.h);
        ViewGroup viewGroup3 = this.k;
        (viewGroup3 != null ? viewGroup3 : null).invalidate();
    }

    @Override // xsna.dc6
    public final cc6 getPresenter() {
        return this.t;
    }

    public final void h() {
        v2l0 v2l0Var = this.u;
        vpe0 vpe0Var = null;
        if (v2l0Var != null) {
            if (!v2l0Var.c()) {
                v2l0Var = null;
            }
            if (v2l0Var != null) {
                vpe0Var = vpe0.b.a(StoryQuestionInfo.Style.ACCENT, v2l0Var);
            }
        }
        List<vpe0> I = rl3.I(new vpe0[]{vpe0.d.a, vpe0.e.a, vpe0Var});
        ArrayList arrayList = new ArrayList(c5g.u(I, 10));
        for (vpe0 vpe0Var2 : I) {
            StoryQuestionInfo.Style a2 = vpe0Var2.a();
            boolean equals = vpe0Var2.equals(vpe0.d.a);
            int description = vpe0Var2.getDescription();
            StoryQuestionInfo.a b = vpe0Var2.b();
            boolean z = vpe0Var2 instanceof vpe0.d;
            int i = R.drawable.bg_white_circle;
            if (!z) {
                if (vpe0Var2 instanceof vpe0.e) {
                    i = R.drawable.bg_gray_300_circle;
                } else if (!(vpe0Var2 instanceof vpe0.a) && !(vpe0Var2 instanceof vpe0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            arrayList.add(new t0m0(a2, equals, description, b, i));
        }
        v0m0 v0m0Var = this.p;
        if (v0m0Var != null) {
            v0m0Var.setItems(arrayList);
        }
    }

    @Override // xsna.fux
    public final void li(int i, Object obj) {
        t0m0 t0m0Var = (t0m0) obj;
        c1m0 c1m0Var = this.t;
        if (c1m0Var != null) {
            c1m0Var.li(i, t0m0Var);
        }
    }

    @Override // xsna.tyl0, android.view.View.OnClickListener
    public final void onClick(View view) {
        c1m0 c1m0Var;
        super.onClick(view);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.story_dialog_root_layout && this.e.isEnabled() && (c1m0Var = this.t) != null) {
            c1m0Var.k();
        }
    }

    @Override // xsna.w0m0
    public final int v3() {
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            viewGroup = null;
        }
        return viewGroup.getWidth();
    }
}
