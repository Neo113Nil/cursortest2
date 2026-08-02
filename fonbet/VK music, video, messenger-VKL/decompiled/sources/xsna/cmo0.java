package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.editor.common.text.views.CreateStoryEditText;
import com.vk.dto.common.id.UserId;
import com.vk.stories.design.view.HashtagHintsView;
import com.vk.stories.design.view.editor.PipetteColorPicker;
import com.vk.stories.design.view.text.StorySeekBar;
import com.vk.stories.design.view.text.TextStickerFrameLayout;
import com.vk.stories.design.view.text.TextStyleColorPicker;
import com.vk.stories.design.view.text.TextStyleFontPicker;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.hmo0;

/* compiled from: TextStickerDialogImpl.kt */
/* loaded from: classes16.dex */
public final class cmo0 extends zlo0 implements DialogInterface.OnDismissListener {
    public static final Layout.Alignment[] y = {Layout.Alignment.ALIGN_CENTER, Layout.Alignment.ALIGN_OPPOSITE, Layout.Alignment.ALIGN_NORMAL};
    public static final Integer[] z = {Integer.valueOf(R.drawable.vk_icon_align_center_shadow_large_48), Integer.valueOf(R.drawable.vk_icon_align_right_large_48), Integer.valueOf(R.drawable.vk_icon_align_left_shadow_large_48)};
    public final amo0 c;
    public final hhw d;
    public final xpa0 e;
    public final imo0 f;
    public DialogInterface.OnDismissListener g;
    public final a52 h;
    public final CreateStoryEditText i;
    public final StorySeekBar j;
    public final CoordinatorLayout k;
    public final TextStyleFontPicker l;
    public final TextStyleColorPicker m;
    public final ImageView n;
    public final ConstraintLayout o;
    public final PipetteColorPicker p;
    public final ImageView q;
    public final Object r;
    public final xpk<ix5, Void> s;
    public final xpk<Layout.Alignment, Integer> t;
    public final io.reactivex.rxjava3.disposables.c u;
    public final tim0 v;
    public kmo0 w;
    public final a x;

    /* compiled from: TextStickerDialogImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[kmo0.values().length];
            try {
                iArr[kmo0.CHOOSE_FONTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kmo0.CHOOSE_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kmo0.CHOOSE_PIPETTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Layout.Alignment.values().length];
            try {
                iArr2[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v81, types: [Data[], xsna.ix5[]] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [xsna.ix5] */
    public cmo0(Context context, boolean z2, CharSequence charSequence, imo0 imo0Var, amo0 amo0Var, hhw hhwVar, boolean z3, xpa0 xpa0Var, v3l0 v3l0Var, boolean z4) {
        super(context, v3l0Var.b(z2));
        imo0 imo0Var2;
        t5s t5sVar;
        ?? r6;
        this.c = amo0Var;
        this.d = hhwVar;
        this.e = xpa0Var;
        int i = 0;
        if (imo0Var == null) {
            imo0Var2 = new imo0(hmo0.c[c(xpa0Var.W())], skd.c[0], z4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER);
        } else {
            imo0Var2 = imo0Var;
        }
        this.f = imo0Var2;
        int i2 = 5;
        this.r = msy.a(LazyThreadSafetyMode.NONE, new ikk0(this, i2));
        this.w = kmo0.CHOOSE_FONTS;
        a aVar = new a();
        aVar.a = true;
        this.x = aVar;
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.PickerDialogAnimation);
            mhy.g(window);
        }
        if (getContext() instanceof Activity) {
            mhy.f(((Activity) getContext()).getWindow());
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.picker_layout_text_sticker_dialog_new, (ViewGroup) null);
        setContentView(inflate);
        if (z2 && !gz80.a(30)) {
            this.h = new a52(getWindow(), inflate);
        }
        CreateStoryEditText createStoryEditText = (CreateStoryEditText) findViewById(R.id.et_sticker);
        this.i = createStoryEditText;
        if (!z4) {
            createStoryEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(325)});
        }
        CreateStoryEditText createStoryEditText2 = this.i;
        (createStoryEditText2 == null ? null : createStoryEditText2).setInputType(671745);
        CreateStoryEditText createStoryEditText3 = this.i;
        createStoryEditText3 = createStoryEditText3 == null ? null : createStoryEditText3;
        int a2 = iah0.a(80);
        int a3 = iah0.a(100);
        int i3 = zlo0.b;
        createStoryEditText3.setPaddingRelative(i3, a2, i3, a3);
        CreateStoryEditText createStoryEditText4 = this.i;
        (createStoryEditText4 == null ? null : createStoryEditText4).setText(charSequence);
        CreateStoryEditText createStoryEditText5 = this.i;
        (createStoryEditText5 == null ? null : createStoryEditText5).getViewTreeObserver().addOnPreDrawListener(new dmo0(this));
        CreateStoryEditText createStoryEditText6 = this.i;
        int i4 = 9;
        (createStoryEditText6 == null ? null : createStoryEditText6).setCallback(new did0(this, i4));
        CreateStoryEditText createStoryEditText7 = this.i;
        (createStoryEditText7 == null ? null : createStoryEditText7).setOnOutsideTextAreaClicked(new emo0(this));
        CreateStoryEditText createStoryEditText8 = this.i;
        (createStoryEditText8 == null ? null : createStoryEditText8).setTopOutsideAreaMargin(iah0.a(52));
        CreateStoryEditText createStoryEditText9 = this.i;
        (createStoryEditText9 == null ? null : createStoryEditText9).setCustomInsertionActionModeCallback(aVar);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator);
        this.k = coordinatorLayout;
        this.o = (ConstraintLayout) findViewById(R.id.constraint_buttons);
        View findViewById = findViewById(R.id.vk_button_text_done);
        if (findViewById != null) {
            findViewById.setOnClickListener(new ra6(this, 8));
        }
        this.p = (PipetteColorPicker) findViewById(R.id.pipette_color_picker);
        this.q = (ImageView) findViewById(R.id.pipette_image_layer);
        PipetteColorPicker pipetteColorPicker = this.p;
        (pipetteColorPicker == null ? null : pipetteColorPicker).setColorSelectedListener(new mvl0(this, 4));
        PipetteColorPicker pipetteColorPicker2 = this.p;
        (pipetteColorPicker2 == null ? null : pipetteColorPicker2).setOnTouchCorrectListener(new bt3(this, 15));
        PipetteColorPicker pipetteColorPicker3 = this.p;
        (pipetteColorPicker3 == null ? null : pipetteColorPicker3).setDoneClickListener(new gj80(this, 23));
        TextStyleFontPicker textStyleFontPicker = (TextStyleFontPicker) findViewById(R.id.fonts_style_picker);
        this.l = textStyleFontPicker;
        textStyleFontPicker.setOnSnapPositionFontStyle(new kf8(1, this, cmo0.class, "setFontText", "setFontText(Lcom/vk/dto/stories/model/FontStyle;)V", 0, 10));
        TextStyleFontPicker textStyleFontPicker2 = this.l;
        textStyleFontPicker2 = textStyleFontPicker2 == null ? null : textStyleFontPicker2;
        String str = imo0Var2.m;
        textStyleFontPicker2.setCurrentTextFont(c(str == null ? "" : str));
        this.m = (TextStyleColorPicker) findViewById(R.id.color_picker);
        ImageView imageView = (ImageView) findViewById(R.id.iv_gradient_color_text);
        imageView.setOnClickListener(new f9(this, 14));
        this.n = imageView;
        TextStyleColorPicker textStyleColorPicker = this.m;
        (textStyleColorPicker == null ? null : textStyleColorPicker).setOnSelectedColor(new yyl0(this, i2));
        StorySeekBar storySeekBar = (StorySeekBar) findViewById(R.id.font_size_seek_bar);
        this.j = storySeekBar;
        this.u = storySeekBar.b.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new xk30(new q8i0(this, 12), 28));
        TextStickerFrameLayout textStickerFrameLayout = (TextStickerFrameLayout) findViewById(R.id.gesture_handler);
        textStickerFrameLayout.setOnScaleListener(new fmo0(this));
        textStickerFrameLayout.setOnSwipeListener(new gmo0(this));
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_text_background);
        this.s = new xpk<>(new ix5[0], null, new og4(i4, this, imageView2));
        imageView2.setOnClickListener(new uzb(this, 11));
        ImageView imageView3 = (ImageView) findViewById(R.id.iv_align);
        this.t = new xpk<>(y, z, new q85(10, this, imageView3));
        imageView3.setOnClickListener(new wz5(this, 11));
        if (z3) {
            CreateStoryEditText createStoryEditText10 = this.i;
            CreateStoryEditText createStoryEditText11 = createStoryEditText10 == null ? null : createStoryEditText10;
            bws bwsVar = new bws(20);
            q520 q520Var = new q520(24);
            ArrayList arrayList = new ArrayList();
            int i5 = 27;
            z410 z410Var = new z410(i5);
            d7l0 d7l0Var = new d7l0(4);
            n0m0 n0m0Var = new n0m0(2);
            TextStyleColorPicker textStyleColorPicker2 = this.m;
            arrayList.add(textStyleColorPicker2 == null ? null : textStyleColorPicker2);
            TextStyleFontPicker textStyleFontPicker3 = this.l;
            arrayList.add(textStyleFontPicker3 == null ? null : textStyleFontPicker3);
            tim0 tim0Var = new tim0(createStoryEditText11, xpa0Var.N(), arrayList, new da50(this, i5), bwsVar, q520Var, z410Var, n0m0Var, d7l0Var);
            this.v = tim0Var;
            coordinatorLayout.addView(tim0Var.j.d(coordinatorLayout, null));
            tim0 tim0Var2 = this.v;
            HashtagHintsView b2 = tim0Var2 != null ? tim0Var2.i.b(coordinatorLayout) : null;
            if (b2 != null) {
                coordinatorLayout.addView(b2);
            }
        }
        Typeface typeface = imo0Var2.a;
        t5s[] t5sVarArr = hmo0.c;
        int length = t5sVarArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                t5sVar = null;
                break;
            }
            t5sVar = t5sVarArr[i6];
            if (t5sVar.f().equals(typeface)) {
                break;
            } else {
                i6++;
            }
        }
        if (t5sVar != null) {
            ?? c = t5sVar.c();
            StorySeekBar storySeekBar2 = this.j;
            (storySeekBar2 == null ? null : storySeekBar2).setProgress((imo0Var2.c - t5sVar.a()) / (t5sVar.d() - t5sVar.a()));
            StorySeekBar storySeekBar3 = this.j;
            (storySeekBar3 == null ? null : storySeekBar3).setProgress(imo0Var2.b(t5sVar));
            xpk xpkVar = this.s;
            xpk xpkVar2 = xpkVar == null ? null : xpkVar;
            xpkVar2.a = c;
            xpkVar2.b = null;
            xpkVar = xpkVar == null ? null : xpkVar;
            int i7 = imo0Var2.h;
            int length2 = c.length;
            while (true) {
                if (i >= length2) {
                    r6 = 0;
                    break;
                }
                r6 = c[i];
                if (r6.getId() == i7) {
                    break;
                } else {
                    i++;
                }
            }
            xpkVar.b(r6);
            TextStyleColorPicker textStyleColorPicker3 = this.m;
            (textStyleColorPicker3 == null ? null : textStyleColorPicker3).a(imo0Var2.g, imo0Var2.i);
            xpk<Layout.Alignment, Integer> xpkVar3 = this.t;
            (xpkVar3 == null ? null : xpkVar3).b(imo0Var2.b);
            e(t5sVar);
        }
        f();
        CreateStoryEditText createStoryEditText12 = this.i;
        (createStoryEditText12 == null ? null : createStoryEditText12).setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        StorySeekBar storySeekBar4 = this.j;
        (storySeekBar4 == null ? null : storySeekBar4).setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        TextStyleFontPicker textStyleFontPicker4 = this.l;
        (textStyleFontPicker4 == null ? null : textStyleFontPicker4).setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        b(this.w);
        hhw hhwVar2 = this.d;
        if (hhwVar2 != null) {
            CreateStoryEditText createStoryEditText13 = this.i;
            hhwVar2.a(createStoryEditText13 != null ? createStoryEditText13 : null, new irc0(this, 18), new hb40(this, 25));
        }
        super.setOnDismissListener(this);
    }

    public static int c(String str) {
        t5s[] t5sVarArr = hmo0.c;
        int length = t5sVarArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            t5s t5sVar = t5sVarArr[i];
            int i4 = i3 + 1;
            hmo0.c cVar = t5sVar instanceof hmo0.c ? (hmo0.c) t5sVar : null;
            if (epx.f(cVar != null ? cVar.i() : null, str)) {
                i2 = i3;
            }
            i++;
            i3 = i4;
        }
        return i2;
    }

    @Override // xsna.zlo0
    public final void a() {
        CreateStoryEditText createStoryEditText = this.i;
        if (createStoryEditText == null) {
            createStoryEditText = null;
        }
        mhy.j(createStoryEditText);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(kmo0 kmo0Var) {
        View decorView;
        View decorView2;
        int i = b.$EnumSwitchMapping$0[kmo0Var.ordinal()];
        ImageView imageView = this.n;
        TextStyleColorPicker textStyleColorPicker = this.m;
        TextStyleFontPicker textStyleFontPicker = this.l;
        CreateStoryEditText createStoryEditText = this.i;
        PipetteColorPicker pipetteColorPicker = this.p;
        ConstraintLayout constraintLayout = this.o;
        CoordinatorLayout coordinatorLayout = this.k;
        if (i == 1) {
            if (textStyleFontPicker == null) {
                textStyleFontPicker = null;
            }
            bwt0.p0(textStyleFontPicker, true);
            if (textStyleColorPicker == null) {
                textStyleColorPicker = null;
            }
            bwt0.p0(textStyleColorPicker, false);
            if (imageView == null) {
                imageView = null;
            }
            imageView.setImageResource(R.drawable.vk_icon_gradient_shadow_large_48);
            imageView.setContentDescription(imageView.getResources().getString(R.string.story_accessibility_select_color));
            coordinatorLayout.setBackgroundResource(R.color.vk_black_alpha20);
            if (constraintLayout == null) {
                constraintLayout = null;
            }
            bwt0.p0(constraintLayout, true);
            bwt0.p0(pipetteColorPicker == null ? null : pipetteColorPicker, false);
            if (pipetteColorPicker == null) {
                pipetteColorPicker = null;
            }
            pipetteColorPicker.e();
            if (createStoryEditText == null) {
                createStoryEditText = null;
            }
            mhy.j(createStoryEditText);
            return;
        }
        if (i == 2) {
            if (textStyleFontPicker == null) {
                textStyleFontPicker = null;
            }
            bwt0.p0(textStyleFontPicker, false);
            if (textStyleColorPicker == null) {
                textStyleColorPicker = null;
            }
            bwt0.p0(textStyleColorPicker, true);
            if (imageView == null) {
                imageView = null;
            }
            imageView.setImageResource(R.drawable.vk_icon_text_circle_shadow_large_48);
            imageView.setContentDescription(imageView.getResources().getString(R.string.story_accessibility_select_font));
            coordinatorLayout.setBackgroundResource(R.color.vk_black_alpha20);
            if (constraintLayout == null) {
                constraintLayout = null;
            }
            bwt0.p0(constraintLayout, true);
            bwt0.p0(pipetteColorPicker == null ? null : pipetteColorPicker, false);
            if (pipetteColorPicker == null) {
                pipetteColorPicker = null;
            }
            pipetteColorPicker.e();
            if (createStoryEditText == null) {
                createStoryEditText = null;
            }
            mhy.j(createStoryEditText);
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        nf9.b.g();
        coordinatorLayout.setBackground(null);
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        bwt0.p0(constraintLayout, false);
        xpa0 xpa0Var = this.e;
        boolean P = xpa0Var.P();
        ?? r1 = this.r;
        if (P) {
            int V = xpa0Var.V();
            xpa0Var.S(V);
            ((s5l0) r1.getValue()).c(V, false, new x2j0(this, 5), new ksg0(this, 13));
        } else {
            xpa0Var.R();
            Bitmap T = xpa0Var.T();
            Window window = getWindow();
            Integer valueOf = (window == null || (decorView2 = window.getDecorView()) == null) ? null : Integer.valueOf(decorView2.getWidth());
            Window window2 = getWindow();
            Integer valueOf2 = (window2 == null || (decorView = window2.getDecorView()) == null) ? null : Integer.valueOf(decorView.getHeight());
            if (valueOf == null || valueOf2 == null) {
                kmo0 kmo0Var2 = kmo0.CHOOSE_COLOR;
                this.w = kmo0Var2;
                b(kmo0Var2);
            } else {
                PipetteColorPicker pipetteColorPicker2 = pipetteColorPicker == null ? null : pipetteColorPicker;
                Bitmap b2 = ((s5l0) r1.getValue()).b(valueOf.intValue(), valueOf2.intValue(), T);
                t2l0 t2l0Var = this.f.i;
                int i2 = PipetteColorPicker.s;
                pipetteColorPicker2.d(b2, t2l0Var, null);
                if (pipetteColorPicker == null) {
                    pipetteColorPicker = null;
                }
                bwt0.p0(pipetteColorPicker, true);
            }
        }
        if (createStoryEditText == null) {
            createStoryEditText = null;
        }
        mhy.d(createStoryEditText);
    }

    public final void d() {
        CreateStoryEditText createStoryEditText = this.i;
        tim0 tim0Var = this.v;
        if (tim0Var != null) {
            CreateStoryEditText createStoryEditText2 = createStoryEditText == null ? null : createStoryEditText;
            Pattern pattern = n420.a;
            Editable editableText = createStoryEditText2.getEditableText();
            HashMap<UserId, String> hashMap = tim0Var.k;
            for (i420 i420Var : (i420[]) editableText.getSpans(0, editableText.length(), i420.class)) {
                String obj = editableText.subSequence(editableText.getSpanStart(i420Var), editableText.getSpanEnd(i420Var)).toString();
                if ((i420Var instanceof ogq0) && !epx.f(obj, hashMap.get(((ogq0) i420Var).b))) {
                    editableText.removeSpan(i420Var);
                }
            }
            int i = tim0Var.q;
            int i2 = tim0Var.m;
            if (i < i2) {
                evu evuVar = tim0Var.g;
                kvu kvuVar = evuVar.c;
                Editable text = evuVar.a.getText();
                Matcher matcher = Pattern.compile("#([a-zA-Zа-яА-ЯёЁ0-9_])+").matcher(text);
                int i3 = 0;
                while (matcher.find() && i + i3 < i2) {
                    int start = matcher.start();
                    int end = matcher.end();
                    String group = matcher.group(0);
                    Object[] spans = text.getSpans(start, end, kvuVar.f());
                    if (spans == null || spans.length == 0) {
                        SpannableString spannableString = new SpannableString(group);
                        if (group == null) {
                            group = "";
                        }
                        spannableString.setSpan(kvuVar.a(group), 0, spannableString.length(), 33);
                        text.replace(start, end, spannableString);
                        i3++;
                    }
                }
            }
        }
        if (createStoryEditText == null) {
            createStoryEditText = null;
        }
        Editable text2 = createStoryEditText.getText();
        amo0 amo0Var = this.c;
        imo0 imo0Var = this.f;
        amo0Var.a(text2, imo0Var);
        mhy.b(getContext());
        this.e.C0(imo0Var.m);
        dismiss();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Data[], xsna.ix5[]] */
    public final void e(t5s t5sVar) {
        xpk<ix5, Void> xpkVar = this.s;
        if (xpkVar == null) {
            xpkVar = null;
        }
        int i = xpkVar.d;
        ix5 ix5Var = i != -1 ? xpkVar.a[i] : null;
        ?? c = t5sVar.c();
        xpk<ix5, Void> xpkVar2 = this.s;
        xpk<ix5, Void> xpkVar3 = xpkVar2 == null ? null : xpkVar2;
        xpkVar3.a = c;
        xpkVar3.b = null;
        if (xpkVar2 == null) {
            xpkVar2 = null;
        }
        xpkVar2.b(t5sVar.g(ix5Var));
        StorySeekBar storySeekBar = this.j;
        if (storySeekBar == null) {
            storySeekBar = null;
        }
        t5sVar.e(storySeekBar.getProgress());
        imo0 imo0Var = this.f;
        t5sVar.b(imo0Var);
        float a2 = t5sVar.a();
        float d = t5sVar.d() - t5sVar.a();
        imo0Var.c = (float) Math.ceil(((this.j != null ? r6 : null).getProgress() * d) + a2);
        f();
    }

    public final void f() {
        xpk<ix5, Void> xpkVar = this.s;
        if (xpkVar == null) {
            xpkVar = null;
        }
        int i = xpkVar.d;
        ix5 ix5Var = i != -1 ? xpkVar.a[i] : null;
        imo0 imo0Var = this.f;
        if (ix5Var != null) {
            ix5Var.b(imo0Var);
        }
        TextStyleFontPicker textStyleFontPicker = this.l;
        if (textStyleFontPicker == null) {
            textStyleFontPicker = null;
        }
        textStyleFontPicker.getCurrentFontStyle().b(imo0Var);
        CreateStoryEditText createStoryEditText = this.i;
        if (createStoryEditText == null) {
            createStoryEditText = null;
        }
        createStoryEditText.getClass();
        Layout.Alignment alignment = imo0Var.b;
        int i2 = alignment == null ? -1 : CreateStoryEditText.b.$EnumSwitchMapping$0[alignment.ordinal()];
        int i3 = 1;
        createStoryEditText.setTextAlignment(i2 != 1 ? i2 != 2 ? 4 : 6 : 5);
        Layout.Alignment alignment2 = imo0Var.b;
        int i4 = alignment2 != null ? CreateStoryEditText.b.$EnumSwitchMapping$0[alignment2.ordinal()] : -1;
        if (i4 == 1) {
            i3 = 8388611;
        } else if (i4 == 2) {
            i3 = 8388613;
        }
        createStoryEditText.setGravity(i3 | 16);
        createStoryEditText.setTextColor(imo0Var.f);
        createStoryEditText.setTypeface(imo0Var.a);
        createStoryEditText.setTextSize(0, imo0Var.c);
        createStoryEditText.setLineSpacing(imo0Var.d, imo0Var.e);
        imo0Var.l.getClass();
        createStoryEditText.getPaint().setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        createStoryEditText.setLayerType(2, null);
        createStoryEditText.f = aco0.a(imo0Var.k);
        createStoryEditText.requestLayout();
        createStoryEditText.invalidate();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.e.playVideo();
        a52 a52Var = this.h;
        if (a52Var != null) {
            a52Var.a.getViewTreeObserver().removeOnGlobalLayoutListener(a52Var.c);
        }
        DialogInterface.OnDismissListener onDismissListener = this.g;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        io.reactivex.rxjava3.disposables.c cVar = this.u;
        if (cVar != null && !cVar.h()) {
            this.u.dispose();
        }
        tim0 tim0Var = this.v;
        if (tim0Var != null) {
            tim0Var.dispose();
        }
        if (getContext() instanceof Activity) {
            mhy.g(((Activity) getContext()).getWindow());
        }
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.g = onDismissListener;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        a52 a52Var = this.h;
        if (a52Var != null) {
            a52Var.a.getViewTreeObserver().addOnGlobalLayoutListener(a52Var.c);
        }
    }

    /* compiled from: TextStickerDialogImpl.kt */
    public static final class a implements ActionMode.Callback {
        public boolean a;

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.a;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
        }
    }
}
