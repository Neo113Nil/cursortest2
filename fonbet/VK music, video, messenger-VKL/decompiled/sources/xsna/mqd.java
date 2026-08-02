package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.dto.hints.HintId;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.WeakHashMap;
import kotlin.random.Random;
import xsna.ikv0;

/* compiled from: ClipsDescriptionEditView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes16.dex */
public final class mqd extends CoordinatorLayout {
    public final g28 A;
    public final NestedScrollView B;
    public final View C;
    public final FrameLayout D;
    public final u5f z;

    /* compiled from: ClipsDescriptionEditView.kt */
    public final class a extends InputFilter.LengthFilter {
        public a() {
            super(4000);
        }

        @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
            if (filter != null && charSequence != null && myc0.f(charSequence) && filter.length() != charSequence.length()) {
                mqd mqdVar = mqd.this;
                ikv0.a aVar = new ikv0.a(mqdVar.getContext());
                aVar.u = new ikv0.d(mqdVar.getContext().getString(R.string.clips_edit_description_limit_alert_text), (String) null, (ikv0.d.a) null, 6);
                aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, mqdVar.getContext().getString(R.string.clips_edit_description_limit_alert_btn), new i8(16));
                aVar.o = Integer.valueOf(e3m.a(R.dimen.clips_description_edit_snackbar_bottom_margin, mqdVar.getContext()));
                aVar.l = 80;
                aVar.d = true;
                aVar.o(mqdVar);
                g28 g28Var = mqdVar.A;
                Animation animation = g28Var.getAnimation();
                if (animation == null || animation.hasEnded()) {
                    Random.b.getClass();
                    gg ggVar = Random.c;
                    TranslateAnimation translateAnimation = new TranslateAnimation((-1.0f) - ggVar.k(3), 1.0f - ggVar.k(3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    translateAnimation.setDuration(210L);
                    translateAnimation.setInterpolator(new CycleInterpolator(3.0f));
                    g28Var.startAnimation(translateAnimation);
                }
            }
            return filter;
        }
    }

    /* compiled from: View.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            mqd mqdVar = mqd.this;
            NestedScrollView nestedScrollView = mqdVar.B;
            nestedScrollView.p(0 - nestedScrollView.getScrollX(), mqdVar.A.getBottom() - nestedScrollView.getScrollY(), false);
        }
    }

    /* compiled from: View.kt */
    public static final class c implements View.OnLayoutChangeListener {
        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            mqd mqdVar = mqd.this;
            mhy.j(mqdVar.A);
            mqdVar.addOnLayoutChangeListener(mqdVar.new b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqd(Context context, p5f p5fVar, zih0 zih0Var) {
        super(context, null, 0);
        View view;
        FrameLayout frameLayout = null;
        View.inflate(context, R.layout.layout_description_edit, this);
        this.B = (NestedScrollView) findViewById(R.id.clip_description_scroll_container);
        u5f a2 = p5fVar != null ? p5fVar.a(zih0Var) : null;
        this.z = a2;
        g28 g28Var = new g28(context);
        g28Var.setId(R.id.clip_description_edit);
        g28Var.setTextAppearance(R.style.VkUiTypography_HeadlineNormal);
        int dimension = (int) g28Var.getContext().getResources().getDimension(R.dimen.text_area_horizontal_paddings);
        g28Var.setPadding(dimension, (int) g28Var.getContext().getResources().getDimension(R.dimen.text_area_top_padding), dimension, 0);
        g28Var.setSingleLine(false);
        g28Var.setGravity(8388659);
        g28Var.setMaxLines(Integer.MAX_VALUE);
        g28Var.setAutofillHints("");
        g28Var.setTextColor(e3m.f(R.attr.vk_ui_text_primary, g28Var.getContext()));
        g28Var.setHintTextColor(e3m.f(R.attr.vk_ui_vkontakte_color_header_search_field_tint, g28Var.getContext()));
        g28Var.setBackground(new ColorDrawable(0));
        g28Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        g28Var.setHorizontallyScrolling(false);
        this.A = g28Var;
        int i = 29;
        if (a2 != null) {
            w5f a3 = ((l3n0) a2.a).a(g28Var, new vkb(a2, new com.vk.movika.sdk.base.observable.a(this, i), this, 2), new o9(9, a2, this), (y34) a2.d);
            a2.f = a3;
            addView(a3.h.d(this, null));
            y5f y5fVar = (y5f) a2.f;
            View I1 = (y5fVar == null ? null : y5fVar).I1(this);
            if (I1 != null) {
                addView(I1);
            }
        }
        g28Var.setHint(anj.c(R.string.clips_edit_description_hint, context));
        g28Var.setOnClickListener(new com.vk.im.video.d(this, 3));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.clip_description_container);
        viewGroup.addView(g28Var);
        int i2 = 24;
        if (a2 != null) {
            yg ygVar = new yg(this, 23);
            zg zgVar = new zg(this, 28);
            qcy<Object>[] qcyVarArr = bwt0.a;
            view = (ConstraintLayout) LayoutInflater.from(getContext()).inflate(R.layout.layout_suggestions_block, (ViewGroup) this, false);
            VkText vkText = (VkText) view.findViewById(R.id.insert_hashtag);
            jjc.g(vkText, new n40(ygVar, i2));
            String id = HintId.CLIPS_SEE_WHAT_IS_TRENDING_NOW.getId();
            h7v h7vVar = (h7v) a2.e;
            if (h7vVar.a(id)) {
                vkText.setText(vkText.getResources().getString(R.string.clips_edit_description_insert_hashtag_highlighted));
                VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) view.findViewById(R.id.highlight_insert_hashtag);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (vkText.isLaidOut()) {
                    VkOnboardingHighlighter.e(vkOnboardingHighlighter, false, null, false, null, 12);
                    h7vVar.b(id);
                } else {
                    vkText.addOnLayoutChangeListener(new t5f(vkOnboardingHighlighter, a2, id));
                }
            }
            jjc.g(view.findViewById(R.id.insert_mention), new qm1(zgVar, i));
        } else {
            view = null;
        }
        this.C = view;
        if (view != null) {
            addView(view);
        }
        int i3 = 1;
        if (a2 != null) {
            qcy<Object>[] qcyVarArr2 = bwt0.a;
            frameLayout = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.clips_trending_hashtags_landing, (ViewGroup) this, false);
            VkLinkedText vkLinkedText = (VkLinkedText) frameLayout.findViewById(R.id.clips_trending_hashtags_landing_title);
            String string = vkLinkedText.getContext().getString(R.string.clips_trending_hashtags_landing_title);
            String string2 = vkLinkedText.getContext().getString(R.string.clips_trending_hashtags_landing_link);
            s5f s5fVar = new s5f(a2, vkLinkedText);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(v1v.a(' ', string, string2));
            spannableStringBuilder.setSpan(s5fVar, string.length() + 1, spannableStringBuilder.length(), 33);
            vkLinkedText.setText(spannableStringBuilder);
            vkLinkedText.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.D = frameLayout;
        if (frameLayout != null) {
            addView(frameLayout);
        }
        oa01.a(g28Var, new com.vk.movika.sdk.base.observable.e(this, i2));
        viewGroup.setOnClickListener(new qj8(this, i3));
        y0();
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new c());
        } else {
            mhy.j(g28Var);
            addOnLayoutChangeListener(new b());
        }
    }

    public final String getFormattedText() {
        String obj;
        Editable text = this.A.getText();
        return (text == null || (obj = text.toString()) == null) ? "" : obj;
    }

    public final String getUnformattedText() {
        u5f u5fVar = this.z;
        if (u5fVar != null) {
            y5f y5fVar = (y5f) u5fVar.f;
            if (y5fVar == null) {
                y5fVar = null;
            }
            String d6 = y5fVar.d6();
            if (d6 != null) {
                return d6;
            }
        }
        return getFormattedText();
    }

    public final void setInitialText(String str) {
        g28 g28Var = this.A;
        g28Var.setText(str);
        g28Var.setSelection(str.length());
        u5f u5fVar = this.z;
        if (u5fVar != null) {
            y5f y5fVar = (y5f) u5fVar.f;
            if (y5fVar == null) {
                y5fVar = null;
            }
            y5fVar.A5();
            y5f y5fVar2 = (y5f) u5fVar.f;
            (y5fVar2 != null ? y5fVar2 : null).d0();
        }
        g28Var.setFilters(new a[]{new a()});
    }

    public final void setOnTextChangeListener(izs<? super CharSequence, s3q0> izsVar) {
        oa01.a(this.A, new lqd(izsVar, 0));
    }

    public final void w0(String str) {
        Character B0;
        g28 g28Var = this.A;
        Editable text = g28Var.getText();
        if (!((text == null || (B0 = erm0.B0(text)) == null) ? true : ro.j(B0.charValue()))) {
            str = " ".concat(str);
        }
        Editable text2 = g28Var.getText();
        if (str.length() + (text2 != null ? text2.length() : 0) <= 4000) {
            if (g28Var.getSelectionStart() >= 0) {
                Editable text3 = g28Var.getText();
                if (text3 != null) {
                    text3.insert(g28Var.getSelectionStart(), str);
                }
            } else {
                Editable text4 = g28Var.getText();
                if (text4 != null) {
                    text4.append((CharSequence) str);
                }
            }
            mhy.j(g28Var);
        }
    }

    public final void y0() {
        Character B0;
        g28 g28Var = this.A;
        Editable text = g28Var.getText();
        boolean z = g28Var.length() + ((text == null || (B0 = erm0.B0(text)) == null) ? true : ro.j(B0.charValue()) ? 1 : 2) <= 4000;
        int a2 = z ? e3m.a(R.dimen.clips_description_edit_bottom_margin, getContext()) : 0;
        View view = this.C;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        f4m.q(a2, this.B);
    }
}
