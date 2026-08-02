package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.markup.view.tools.PipetteView;
import com.vk.photo.editor.markup.view.tools.SizeSeekBarView;
import com.vk.photo.editor.markup.view.tools.button.ColorButton;
import com.vk.photo.editor.markup.view.tools.button.FontButton;
import com.vk.photo.editor.markup.view.tools.button.PipetteButton;
import com.vk.photo.editor.markup.view.tools.editor.TextElementEditText;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.jeo0;
import xsna.jio0;
import xsna.veo0;
import xsna.wpa0;
import xsna.y8g;

/* compiled from: TextElementEditDialog.kt */
/* loaded from: classes4.dex */
public final class ffo0 extends Dialog implements SizeSeekBarView.a, PipetteView.a, DialogInterface.OnKeyListener, TextElementEditText.a {
    public static final /* synthetic */ int B = 0;
    public final of10 A;
    public final FunctionReferenceImpl b;
    public izs<? super gfo0, s3q0> c;
    public izs<? super gfo0, s3q0> d;
    public xlj e;
    public n4p f;
    public veo0.a g;
    public final View h;
    public final TextElementEditText i;
    public final PipetteView j;
    public final ViewGroup k;
    public final Group l;
    public final ViewGroup m;
    public final RecyclerView n;
    public final RecyclerView o;
    public final FontButton p;
    public final ColorButton q;
    public final ImageView r;
    public final ImageView s;
    public final ImageView t;
    public final SizeSeekBarView u;
    public final PipetteButton v;
    public final ColorDrawable w;
    public final ColorDrawable x;
    public final kf10 y;
    public final jf10 z;

    /* JADX WARN: Multi-variable type inference failed */
    public ffo0(int i, Context context, izs izsVar) {
        super(context, i);
        this.b = (FunctionReferenceImpl) izsVar;
        this.c = new gz30(25);
        int i2 = 17;
        this.d = new ha40(i2);
        this.g = veo0.a.b.a;
        ColorDrawable colorDrawable = new ColorDrawable(-1728053248);
        this.w = colorDrawable;
        this.x = new ColorDrawable(0);
        kf10 kf10Var = new kf10();
        this.y = kf10Var;
        jf10 jf10Var = new jf10();
        this.z = jf10Var;
        of10 of10Var = new of10();
        this.A = of10Var;
        ConcatAdapter concatAdapter = new ConcatAdapter(of10Var, jf10Var);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(colorDrawable);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setWindowAnimations(R.style.TextEditorDialogAnimation);
        }
        setContentView(LayoutInflater.from(context).inflate(R.layout.dialog_text_element_edit, (ViewGroup) null));
        this.h = findViewById(R.id.layout_edit_content);
        this.i = (TextElementEditText) findViewById(R.id.edit_text_element);
        this.j = (PipetteView) findViewById(R.id.pipette_view);
        this.p = (FontButton) findViewById(R.id.font_button);
        this.q = (ColorButton) findViewById(R.id.color_button);
        this.v = (PipetteButton) findViewById(R.id.pipette_button);
        this.l = (Group) findViewById(R.id.top_bar_actions_group);
        this.s = (ImageView) findViewById(R.id.button_text_align);
        this.r = (ImageView) findViewById(R.id.button_text_background);
        this.t = (ImageView) findViewById(R.id.button_text_edit_done);
        this.u = (SizeSeekBarView) findViewById(R.id.font_size_seek_bar);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.colors_list);
        this.n = recyclerView;
        recyclerView.setClipToOutline(true);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.fonts_list);
        this.o = recyclerView2;
        recyclerView2.setClipToOutline(true);
        if (Build.VERSION.SDK_INT >= 29) {
            SizeSeekBarView sizeSeekBarView = this.u;
            fyt0.b(sizeSeekBarView == null ? null : sizeSeekBarView, new xka0(this, i2));
        }
        this.k = (ViewGroup) findViewById(R.id.layout_colors_container);
        this.m = (ViewGroup) findViewById(R.id.layout_fonts_container);
        FontButton fontButton = this.p;
        (fontButton == null ? null : fontButton).setBordersHided(true);
        FontButton fontButton2 = this.p;
        (fontButton2 == null ? null : fontButton2).setOnClickListener(new bd0(this, 16));
        ColorButton colorButton = this.q;
        int i3 = 8;
        (colorButton == null ? null : colorButton).setOnClickListener(new nn9(this, i3));
        PipetteButton pipetteButton = this.v;
        (pipetteButton == null ? null : pipetteButton).setOnClickListener(new tg(this, i3));
        ImageView imageView = this.s;
        (imageView == null ? null : imageView).setOnClickListener(new ug(this, i3));
        ImageView imageView2 = this.r;
        (imageView2 == null ? null : imageView2).setOnClickListener(new vg(this, 9));
        ImageView imageView3 = this.t;
        (imageView3 == null ? null : imageView3).setOnClickListener(new wg(this, 5));
        TextElementEditText textElementEditText = this.i;
        (textElementEditText == null ? null : textElementEditText).addTextChangedListener(new efo0(this));
        TextElementEditText textElementEditText2 = this.i;
        (textElementEditText2 == null ? null : textElementEditText2).setCallback(this);
        SizeSeekBarView sizeSeekBarView2 = this.u;
        (sizeSeekBarView2 == null ? null : sizeSeekBarView2).setListener(this);
        PipetteView pipetteView = this.j;
        (pipetteView == null ? null : pipetteView).setColorSelectionListener(this);
        RecyclerView recyclerView3 = this.n;
        recyclerView3 = recyclerView3 == null ? null : recyclerView3;
        recyclerView3.setItemAnimator(null);
        recyclerView3.setAdapter(concatAdapter);
        recyclerView3.getContext();
        recyclerView3.setLayoutManager(new LinearLayoutManager(0, false));
        RecyclerView recyclerView4 = this.o;
        recyclerView4 = recyclerView4 == null ? null : recyclerView4;
        recyclerView4.setItemAnimator(null);
        recyclerView4.setAdapter(kf10Var);
        recyclerView4.getContext();
        recyclerView4.setLayoutManager(new LinearLayoutManager(0, false));
        kf10Var.c = new qzl0(this, i3);
        jf10Var.c = new h440(this, 23);
        of10Var.c = new lyl0(this, 4);
        ViewGroup viewGroup = this.k;
        ViewGroup viewGroup2 = viewGroup != null ? viewGroup : null;
        qj80.a(viewGroup2, new bfo0(viewGroup2, this));
        setOnKeyListener(this);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // com.vk.photo.editor.markup.view.tools.PipetteView.a
    public final void A(int i) {
        feo0 feo0Var = new feo0(new y8g.c(i), true);
        ?? r3 = this.b;
        r3.invoke(feo0Var);
        r3.invoke(keo0.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // com.vk.photo.editor.markup.view.tools.editor.TextElementEditText.a
    public final void b() {
        this.b.invoke(jeo0.b.a);
        dismiss();
    }

    public final void c(veo0 veo0Var) {
        Object obj;
        veo0.a aVar = veo0Var.d;
        veo0.a aVar2 = veo0Var.e;
        this.g = aVar2;
        wlo0 wlo0Var = veo0Var.c;
        xeo0 xeo0Var = veo0Var.f;
        TextElementEditText textElementEditText = this.i;
        if (textElementEditText == null) {
            textElementEditText = null;
        }
        textElementEditText.setConfig(veo0Var.b.a);
        y5g y5gVar = wlo0Var.e;
        ew5 ew5Var = wlo0Var.c;
        et1 et1Var = wlo0Var.d;
        t4s t4sVar = wlo0Var.b;
        boolean z = y5gVar.e;
        y8g y8gVar = y5gVar.a;
        ArrayList arrayList = xeo0Var.e;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        y8g.c cVar = y8g.a.a;
        y8g.c cVar2 = cVar;
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            y8g.c cVar3 = (y8g.c) it.next();
            if (epx.f(cVar3, y8gVar) && !z) {
                z2 = true;
            }
            if (z2) {
                cVar2 = cVar3;
            }
            arrayList2.add(new jzp0(cVar3, z2));
            it = it;
        }
        this.z.submitList(arrayList2);
        veo0.a.C3885a c3885a = veo0.a.C3885a.a;
        if (!epx.f(aVar2, c3885a) && !(aVar2 instanceof veo0.a.d)) {
            RecyclerView recyclerView = this.n;
            if (recyclerView == null) {
                recyclerView = null;
            }
            lkf0.c(recyclerView, d());
        }
        ColorButton colorButton = this.q;
        if (colorButton == null) {
            colorButton = null;
        }
        if (!z) {
            cVar = cVar2;
        }
        colorButton.setCurrentColor(cVar);
        wpa0 aVar3 = z ? new wpa0.a(y8gVar, ((aVar2 instanceof veo0.a.d) || (aVar2 instanceof veo0.a.b)) ? false : true) : new wpa0.b(false);
        List singletonList = Collections.singletonList(new xzp0(aVar3));
        of10 of10Var = this.A;
        of10Var.submitList(singletonList);
        PipetteButton pipetteButton = this.v;
        if (pipetteButton == null) {
            pipetteButton = null;
        }
        pipetteButton.setState(aVar3);
        veo0.a.c cVar4 = veo0.a.c.a;
        boolean f = epx.f(aVar, cVar4);
        veo0.a.b bVar = veo0.a.b.a;
        if (f && epx.f(aVar2, bVar)) {
            if (z) {
                PipetteButton pipetteButton2 = this.v;
                if (pipetteButton2 == null) {
                    pipetteButton2 = null;
                }
                pipetteButton2.setVisibility(0);
                PipetteButton pipetteButton3 = this.v;
                if (pipetteButton3 == null) {
                    pipetteButton3 = null;
                }
                pipetteButton3.setAlpha(1.0f);
                ColorButton colorButton2 = this.q;
                if (colorButton2 == null) {
                    colorButton2 = null;
                }
                colorButton2.setVisibility(4);
                ColorButton colorButton3 = this.q;
                if (colorButton3 == null) {
                    colorButton3 = null;
                }
                colorButton3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                ColorButton colorButton4 = this.q;
                if (colorButton4 == null) {
                    colorButton4 = null;
                }
                colorButton4.setVisibility(0);
                ColorButton colorButton5 = this.q;
                if (colorButton5 == null) {
                    colorButton5 = null;
                }
                colorButton5.setAlpha(1.0f);
                PipetteButton pipetteButton4 = this.v;
                if (pipetteButton4 == null) {
                    pipetteButton4 = null;
                }
                pipetteButton4.setVisibility(4);
                PipetteButton pipetteButton5 = this.v;
                if (pipetteButton5 == null) {
                    pipetteButton5 = null;
                }
                pipetteButton5.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        PipetteButton pipetteButton6 = this.v;
        if (pipetteButton6 == null) {
            pipetteButton6 = null;
        }
        pipetteButton6.setClickable(z);
        pipetteButton6.setFocusable(z);
        ColorButton colorButton6 = this.q;
        if (colorButton6 == null) {
            colorButton6 = null;
        }
        boolean z3 = !z;
        colorButton6.setClickable(z3);
        colorButton6.setFocusable(z3);
        FontButton fontButton = this.p;
        if (fontButton == null) {
            fontButton = null;
        }
        fontButton.setFontInfo(t4sVar.a);
        FontButton fontButton2 = this.p;
        if (fontButton2 == null) {
            fontButton2 = null;
        }
        fontButton2.setSelected(false);
        List<jio0.a> list = xeo0Var.a;
        ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
        for (jio0.a aVar4 : list) {
            arrayList3.add(new kzp0(aVar4, epx.f(aVar4, t4sVar.a)));
        }
        kf10 kf10Var = this.y;
        kf10Var.submitList(arrayList3);
        if (!epx.f(aVar2, bVar)) {
            RecyclerView recyclerView2 = this.o;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            Iterator<kzp0> it2 = kf10Var.getCurrentList().iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else if (it2.next().b) {
                    break;
                } else {
                    i++;
                }
            }
            lkf0.c(recyclerView2, i);
        }
        SizeSeekBarView sizeSeekBarView = this.u;
        if (sizeSeekBarView == null) {
            sizeSeekBarView = null;
        }
        sizeSeekBarView.setSize(t4sVar.b);
        ImageView imageView = this.s;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageResource(et1Var.b);
        ImageView imageView2 = this.r;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setImageResource(ew5Var.b);
        ImageView imageView3 = this.s;
        if (imageView3 == null) {
            imageView3 = null;
        }
        iut0.t(imageView3, getContext().getString(et1Var.c));
        ImageView imageView4 = this.r;
        if (imageView4 == null) {
            imageView4 = null;
        }
        iut0.t(imageView4, getContext().getString(ew5Var.c));
        boolean z4 = wlo0Var.e.e;
        if (!z4 ? (obj = this.q) == null : (obj = this.v) == null) {
            obj = null;
        }
        if (epx.f(aVar, cVar4) && !(aVar2 instanceof veo0.a.d)) {
            TextElementEditText textElementEditText2 = this.i;
            if (textElementEditText2 == null) {
                textElementEditText2 = null;
            }
            textElementEditText2.requestFocus();
        } else if (epx.f(aVar, c3885a) && epx.f(aVar2, bVar)) {
            PipetteButton pipetteButton7 = this.v;
            if (pipetteButton7 == null) {
                pipetteButton7 = null;
            }
            pipetteButton7.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            fyt0.n(pipetteButton7, z4);
            ColorButton colorButton7 = this.q;
            if (colorButton7 == null) {
                colorButton7 = null;
            }
            colorButton7.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            fyt0.n(colorButton7, !z4);
            l3p.a("TextEditorExpand", new y5m0(4, this, obj));
        } else if (epx.f(aVar, bVar) && epx.f(aVar2, c3885a)) {
            l3p.a("TextEditorExpand", new ju(29, this, obj));
        } else if ((aVar instanceof veo0.a.d) && !(aVar2 instanceof veo0.a.d)) {
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawable(this.w);
            }
            PipetteView pipetteView = this.j;
            if (pipetteView == null) {
                pipetteView = null;
            }
            pipetteView.setSelecting(false);
            PipetteView pipetteView2 = this.j;
            if (pipetteView2 == null) {
                pipetteView2 = null;
            }
            fyt0.h(pipetteView2);
            SizeSeekBarView sizeSeekBarView2 = this.u;
            if (sizeSeekBarView2 == null) {
                sizeSeekBarView2 = null;
            }
            sizeSeekBarView2.setVisibility(0);
            Group group = this.l;
            if (group == null) {
                group = null;
            }
            group.setVisibility(0);
            TextElementEditText textElementEditText3 = this.i;
            if (textElementEditText3 == null) {
                textElementEditText3 = null;
            }
            textElementEditText3.setCursorVisible(true);
            TextElementEditText textElementEditText4 = this.i;
            if (textElementEditText4 == null) {
                textElementEditText4 = null;
            }
            ((InputMethodManager) textElementEditText4.getContext().getSystemService("input_method")).showSoftInput(textElementEditText4, 0);
        }
        if ((aVar instanceof veo0.a.d) || !(aVar2 instanceof veo0.a.d)) {
            return;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(this.x);
        }
        SizeSeekBarView sizeSeekBarView3 = this.u;
        if (sizeSeekBarView3 == null) {
            sizeSeekBarView3 = null;
        }
        fyt0.h(sizeSeekBarView3);
        Group group2 = this.l;
        if (group2 == null) {
            group2 = null;
        }
        fyt0.h(group2);
        TextElementEditText textElementEditText5 = this.i;
        if (textElementEditText5 == null) {
            textElementEditText5 = null;
        }
        textElementEditText5.setCursorVisible(false);
        TextElementEditText textElementEditText6 = this.i;
        if (textElementEditText6 == null) {
            textElementEditText6 = null;
        }
        ((InputMethodManager) textElementEditText6.getContext().getSystemService("input_method")).hideSoftInputFromWindow(textElementEditText6.getWindowToken(), 0);
        PipetteView pipetteView3 = this.j;
        if (pipetteView3 == null) {
            pipetteView3 = null;
        }
        pipetteView3.post(new ou5(this, 14));
        PipetteView pipetteView4 = this.j;
        if (pipetteView4 == null) {
            pipetteView4 = null;
        }
        pipetteView4.c(((veo0.a.d) aVar2).a);
        View view = this.h;
        if (view == null) {
            view = null;
        }
        view.setClickable(false);
        View view2 = this.h;
        if (view2 == null) {
            view2 = null;
        }
        view2.setFocusable(false);
        PipetteView pipetteView5 = this.j;
        if (pipetteView5 == null) {
            pipetteView5 = null;
        }
        wpa0.a aVar5 = new wpa0.a(new y8g.c(pipetteView5.getSelectedColor()), false);
        PipetteButton pipetteButton8 = this.v;
        (pipetteButton8 == null ? null : pipetteButton8).setState(aVar5);
        of10Var.submitList(Collections.singletonList(new xzp0(aVar5)));
    }

    public final int d() {
        Iterator<jzp0> it = this.z.getCurrentList().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().b) {
                break;
            }
            i++;
        }
        int i2 = i + 1;
        RecyclerView recyclerView = this.n;
        if (recyclerView == null) {
            recyclerView = null;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int w = linearLayoutManager.w();
            int s = linearLayoutManager.s();
            if (s == -1 || w == -1 ? i2 == 1 : w - s >= i2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // com.vk.photo.editor.markup.view.tools.SizeSeekBarView.a
    public final void h(float f) {
        this.b.invoke(new heo0(f));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        boolean z = this.g instanceof veo0.a.d;
        ?? r3 = this.b;
        if (z) {
            r3.invoke(keo0.a);
            return true;
        }
        r3.invoke(jeo0.b.a);
        dismiss();
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // com.vk.photo.editor.markup.view.tools.PipetteView.a
    public final void v(int i) {
        this.b.invoke(new feo0(new y8g.c(i), true));
    }

    @Override // com.vk.photo.editor.markup.view.tools.SizeSeekBarView.a
    public final void F() {
    }

    @Override // com.vk.photo.editor.markup.view.tools.SizeSeekBarView.a
    public final void a() {
    }
}
