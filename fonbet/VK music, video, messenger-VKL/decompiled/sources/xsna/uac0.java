package xsna;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.VKViewPager;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Poster;
import com.vk.newsfeed.api.posting.dto.PosterBackground;
import com.vk.newsfeed.api.posting.dto.PosterConfigCategory;
import com.vk.newsfeed.api.posting.dto.PosterSettings;
import com.vk.newsfeed.common.views.poster.PosterEditText;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PosterPostingView.kt */
/* loaded from: classes4.dex */
public final class uac0 implements rac0, View.OnClickListener {
    public tac0 b;
    public final z9c0 c = new z9c0();
    public FrameLayout d;
    public PosterEditText e;
    public TextView f;
    public VKViewPager g;
    public ViewPropertyAnimator h;
    public boolean i;

    /* compiled from: PosterPostingView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Poster.Constants constants;
            tac0 tac0Var = uac0.this.b;
            if (tac0Var != null) {
                qdc0 qdc0Var = tac0Var.b;
                rac0 rac0Var = tac0Var.c;
                ucp.i(editable);
                q420 q420Var = tac0Var.d;
                boolean z = (q420Var == null ? null : q420Var).n;
                if (q420Var == null) {
                    q420Var = null;
                }
                q420Var.afterTextChanged(editable);
                if (z) {
                    return;
                }
                int length = rac0Var.F5().length();
                PosterSettings posterSettings = tac0Var.f;
                if (length > ((posterSettings == null || (constants = posterSettings.c) == null) ? 160 : constants.b)) {
                    qdc0Var.qh();
                    return;
                }
                CharSequence F5 = rac0Var.F5();
                int i = 0;
                for (int i2 = 0; i2 < F5.length(); i2++) {
                    if (F5.charAt(i2) == '\n') {
                        i++;
                    }
                }
                if (i > 3) {
                    qdc0Var.qh();
                }
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            tac0 tac0Var = uac0.this.b;
            if (tac0Var != null) {
                q420 q420Var = tac0Var.d;
                if (q420Var == null) {
                    q420Var = null;
                }
                q420Var.getClass();
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            tac0 tac0Var = uac0.this.b;
            if (tac0Var != null) {
                qdc0 qdc0Var = tac0Var.b;
                if (charSequence == null) {
                    return;
                }
                qdc0Var.Al();
                dvu dvuVar = tac0Var.e;
                if (dvuVar != null) {
                    dvuVar.onTextChanged(charSequence, i, i2, i3);
                }
                q420 q420Var = tac0Var.d;
                if (q420Var == null) {
                    q420Var = null;
                }
                q420Var.onTextChanged(charSequence, i, i2, i3);
            }
        }
    }

    @Override // xsna.rac0
    public final void E5(int i) {
        PosterEditText posterEditText = this.e;
        if (posterEditText != null) {
            posterEditText.setHintTextColor(i);
        }
    }

    @Override // xsna.rac0
    public final CharSequence F5() {
        Editable text;
        PosterEditText posterEditText = this.e;
        return (posterEditText == null || (text = posterEditText.getText()) == null) ? "" : text;
    }

    @Override // xsna.rac0
    public final void Hd(Poster.Constants constants) {
        PosterEditText posterEditText = this.e;
        if (posterEditText != null) {
            posterEditText.setConstants(constants);
        }
    }

    @Override // xsna.rac0
    public final void U4(int i, UserId userId, boolean z) {
        this.i = z;
        z9c0 z9c0Var = this.c;
        Iterator it = z9c0Var.b.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            PosterBackground posterBackground = (PosterBackground) it.next();
            if (posterBackground.b == i && epx.f(posterBackground.c, userId)) {
                break;
            } else {
                i2++;
            }
        }
        int size = (z9c0Var.b.size() * 50) + i2;
        VKViewPager vKViewPager = this.g;
        boolean z2 = Math.abs((vKViewPager != null ? vKViewPager.getCurrentItem() : 0) - size) < 3;
        VKViewPager vKViewPager2 = this.g;
        if (vKViewPager2 != null) {
            vKViewPager2.setCurrentItem(size, z2);
        }
    }

    @Override // xsna.rac0
    public final void Vi(PosterBackground posterBackground) {
        z9c0 z9c0Var = this.c;
        ArrayList arrayList = z9c0Var.b;
        PosterBackground posterBackground2 = (PosterBackground) j5g.b0(0, arrayList);
        if (posterBackground2 == null || !posterBackground2.zb()) {
            arrayList.add(0, posterBackground);
        } else {
            arrayList.set(0, posterBackground);
        }
        z9c0Var.notifyDataSetChanged();
    }

    @Override // xsna.rac0
    public final int Zj() {
        return an10.b(this.e.getTextSize());
    }

    @Override // xsna.rac0
    public final void clearFocus() {
        PosterEditText posterEditText = this.e;
        if (posterEditText != null) {
            posterEditText.clearFocus();
        }
    }

    @Override // xsna.rac0
    public final void d1(int i) {
        PosterEditText posterEditText = this.e;
        if (posterEditText != null) {
            posterEditText.setTextColor(i);
        }
    }

    @Override // xsna.jk6
    public final void d3(View view) {
        this.d = (FrameLayout) view.findViewById(R.id.posting_poster_layout);
        PosterEditText posterEditText = (PosterEditText) view.findViewById(R.id.posting_poster_edit_text);
        VKViewPager vKViewPager = null;
        if (posterEditText != null) {
            posterEditText.setSelectionChangeListener(this.b);
            posterEditText.addTextChangedListener(new a());
        } else {
            posterEditText = null;
        }
        this.e = posterEditText;
        TextView textView = (TextView) view.findViewById(R.id.posting_poster_mode_button);
        if (textView != null) {
            textView.setOnClickListener(this);
        } else {
            textView = null;
        }
        this.f = textView;
        VKViewPager vKViewPager2 = (VKViewPager) view.findViewById(R.id.posting_poster_background_pager);
        if (vKViewPager2 != null) {
            vKViewPager2.setAdapter(this.c);
            vKViewPager2.addOnPageChangeListener(new b());
            vKViewPager2.addOnLayoutChangeListener(new bf6(this, 1));
            vKViewPager2.setPageMargin(iah0.a(4));
            vKViewPager = vKViewPager2;
        }
        this.g = vKViewPager;
        tac0 tac0Var = this.b;
        if (tac0Var != null) {
            tac0Var.onStart();
        }
    }

    @Override // xsna.rac0
    public final void di(List<PosterBackground> list) {
        z9c0 z9c0Var = this.c;
        ArrayList arrayList = z9c0Var.b;
        arrayList.clear();
        arrayList.addAll(list);
        z9c0Var.notifyDataSetChanged();
        VKViewPager vKViewPager = this.g;
        int size = (z9c0Var.b.size() * 50) + (vKViewPager != null ? vKViewPager.getCurrentItem() : 0);
        VKViewPager vKViewPager2 = this.g;
        if (vKViewPager2 != null) {
            vKViewPager2.setCurrentItem(size, false);
        }
    }

    @Override // xsna.rac0
    public final Context getContext() {
        return this.e.getContext();
    }

    @Override // xsna.hng0
    public final void h4(float f, float f2) {
        VKViewPager vKViewPager = this.g;
        if (vKViewPager != null) {
            for (int i = 0; i < vKViewPager.getChildCount(); i++) {
                View childAt = vKViewPager.getChildAt(i);
                bac0 bac0Var = childAt instanceof bac0 ? (bac0) childAt : null;
                if (bac0Var != null) {
                    bac0Var.a(-f, -f2);
                }
            }
        }
    }

    @Override // xsna.rac0
    public final void ih(UserId userId, String str) {
        z9c0 z9c0Var = this.c;
        z9c0Var.c = userId;
        TextView textView = z9c0Var.e.get();
        if (textView != null) {
            bwt0.p0(textView, str.length() > 0);
        }
        TextView textView2 = z9c0Var.e.get();
        if (textView2 != null) {
            textView2.setText(str);
        }
        z9c0Var.d = str;
    }

    @Override // xsna.rac0
    public final void k() {
        mhy.j(this.e);
    }

    @Override // xsna.rac0
    public final EditText l0() {
        return this.e;
    }

    @Override // xsna.rac0
    public final void m8() {
        this.c.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tac0 tac0Var;
        List<PosterConfigCategory> list;
        PosterConfigCategory posterConfigCategory;
        String str;
        List<PosterConfigCategory> list2;
        PosterConfigCategory posterConfigCategory2;
        List<PosterConfigCategory> list3;
        List<PosterConfigCategory> list4;
        List<PosterConfigCategory> list5;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf == null || valueOf.intValue() != R.id.posting_poster_mode_button || (tac0Var = this.b) == null) {
            return;
        }
        PosterSettings posterSettings = tac0Var.f;
        int i = -1;
        if (posterSettings != null && (list5 = posterSettings.b) != null) {
            Iterator<PosterConfigCategory> it = list5.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = it.next().b;
                PosterConfigCategory posterConfigCategory3 = tac0Var.o;
                if (epx.f(str2, posterConfigCategory3 != null ? posterConfigCategory3.b : null)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        int i3 = i + 1;
        PosterSettings posterSettings2 = tac0Var.f;
        int size = i3 % ((posterSettings2 == null || (list4 = posterSettings2.b) == null) ? 1 : list4.size());
        PosterSettings posterSettings3 = tac0Var.f;
        if (posterSettings3 == null || (list = posterSettings3.b) == null || (posterConfigCategory = (PosterConfigCategory) j5g.b0(size, list)) == null) {
            return;
        }
        tac0Var.z(posterConfigCategory);
        PosterSettings posterSettings4 = tac0Var.f;
        int size2 = (posterSettings4 == null || (list3 = posterSettings4.b) == null) ? 0 : list3.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            PosterSettings posterSettings5 = tac0Var.f;
            if (posterSettings5 != null && (list2 = posterSettings5.b) != null && (posterConfigCategory2 = (PosterConfigCategory) j5g.b0(i5, list2)) != null) {
                if (posterConfigCategory.equals(posterConfigCategory2)) {
                    break;
                } else {
                    i4 += posterConfigCategory2.d.size() + (((!epx.f(posterConfigCategory2.b, "image") || tac0Var.q == null) && tac0Var.m == null) ? 0 : 1);
                }
            }
        }
        String str3 = posterConfigCategory.b;
        xac0 xac0Var = tac0Var.n;
        if (xac0Var == null || (str = xac0Var.g) == null) {
            str = "";
        }
        tac0Var.b.Dg(i4, str3, str);
    }

    @Override // xsna.jk6
    public final void onDestroyView() {
        this.f = null;
        this.d = null;
        this.e = null;
        this.g = null;
    }

    @Override // xsna.rac0
    public final void q2(int i) {
        PosterEditText posterEditText = this.e;
        if (posterEditText != null) {
            posterEditText.setSelection(i);
        }
    }

    @Override // xsna.rac0
    public final void setText(CharSequence charSequence) {
        PosterEditText posterEditText = this.e;
        if (posterEditText != null) {
            posterEditText.setText(charSequence);
        }
    }

    @Override // xsna.rac0
    public final int t1() {
        PosterEditText posterEditText = this.e;
        if (posterEditText != null) {
            return posterEditText.getSelectionStart();
        }
        return 0;
    }

    @Override // xsna.rac0
    public final void vi(String str) {
        TextView textView = this.f;
        if (textView != null) {
            textView.setText(str);
            bwt0.p0(textView, !(str.length() == 0));
        }
    }

    @Override // xsna.rac0
    public final void w() {
        PosterEditText posterEditText = this.e;
        if (posterEditText != null) {
            posterEditText.requestFocus();
        }
    }

    @Override // xsna.rac0
    public final void xe(String str) {
        Editable text;
        PosterEditText posterEditText = this.e;
        int selectionStart = posterEditText != null ? posterEditText.getSelectionStart() : -1;
        if (selectionStart == -1) {
            selectionStart = 0;
        }
        PosterEditText posterEditText2 = this.e;
        if (posterEditText2 == null || (text = posterEditText2.getText()) == null) {
            return;
        }
        text.insert(selectionStart, "@");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // xsna.rac0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zj(boolean z, kor korVar) {
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout != null && (animate = frameLayout.animate()) != null && (duration = animate.setDuration(200L)) != null) {
            ViewPropertyAnimator alpha = duration.alpha(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (alpha != null) {
                viewPropertyAnimator = alpha.setListener(new vac0(z, this, korVar));
                this.h = viewPropertyAnimator;
                if (viewPropertyAnimator == null) {
                    viewPropertyAnimator.start();
                    return;
                }
                return;
            }
        }
        viewPropertyAnimator = null;
        this.h = viewPropertyAnimator;
        if (viewPropertyAnimator == null) {
        }
    }

    /* compiled from: PosterPostingView.kt */
    public static final class b implements ViewPager.j {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            xac0 xac0Var;
            uac0 uac0Var = uac0.this;
            if (uac0Var.i) {
                ArrayList arrayList = uac0Var.c.b;
                PosterBackground posterBackground = (PosterBackground) j5g.b0(i % arrayList.size(), arrayList);
                if (posterBackground != null) {
                    tac0 tac0Var = uac0Var.b;
                    int i2 = posterBackground.b;
                    List<xac0> list = tac0Var.g;
                    if (list != null) {
                        Iterator<xac0> it = list.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i3 = -1;
                                break;
                            } else if (it.next().a == i2) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        List<xac0> list2 = tac0Var.g;
                        if (list2 != null && (xac0Var = (xac0) j5g.b0(i3, list2)) != null) {
                            qac0.l7(tac0Var, xac0Var, 2, 2);
                            tac0Var.b.Da(xac0Var);
                        }
                    }
                }
            }
            uac0Var.i = true;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
        }
    }

    @Override // xsna.hng0
    public final void A1(float f, float f2) {
    }
}
