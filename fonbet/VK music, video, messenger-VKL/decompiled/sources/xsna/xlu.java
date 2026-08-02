package xsna;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.picker.GroupPickerActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import xsna.ext0;

/* compiled from: GroupPickerView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public final class xlu extends ScrollView implements ext0 {
    public static final Object t;
    public boolean b;
    public ext0.a c;
    public final ViewGroup d;
    public final TextView e;
    public final View f;
    public final View g;
    public final ViewAnimator h;
    public final tlu i;
    public final View j;
    public final View k;
    public TextView l;
    public TextView m;
    public List<Target> n;
    public final ViewAnimator o;
    public final jsk p;
    public final n14 q;
    public View r;
    public View s;

    /* compiled from: GroupPickerView.kt */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            xlu xluVar = xlu.this;
            xluVar.getViewTreeObserver().removeOnPreDrawListener(this);
            xluVar.b();
            return false;
        }
    }

    static {
        iah0.a(8);
        t = new Object();
    }

    public xlu(GroupPickerActivity groupPickerActivity) {
        super(groupPickerActivity, null, 0);
        this.n = new ArrayList(0);
        setFillViewport(true);
        View.inflate(groupPickerActivity, R.layout.layout_group_picker_view, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.group_picker_bottom_sheet);
        this.d = viewGroup;
        int a2 = iah0.a(512);
        if (getResources().getDisplayMetrics().widthPixels > a2) {
            viewGroup.getLayoutParams().width = a2;
        }
        this.f = findViewById(R.id.group_picker_content_layout);
        this.e = (TextView) findViewById(R.id.group_picker_title);
        this.g = findViewById(R.id.group_picker_content);
        this.h = (ViewAnimator) findViewById(R.id.group_picker_content_animator);
        tlu tluVar = new tlu(this);
        this.i = tluVar;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.group_picker_targets_recycler);
        recyclerView.setAdapter(tluVar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        this.p = new jsk(this, 1);
        findViewById(R.id.group_picker_retry_button).setOnClickListener(new d27(this, 3));
        View findViewById = findViewById(R.id.group_picker_touch_outside);
        this.j = findViewById;
        findViewById.setOnClickListener(new z1q(this, 1));
        this.k = findViewById(R.id.group_picker_clickable_layout);
        this.o = (ViewAnimator) findViewById(R.id.group_picker_footer_animator);
        this.q = new n14(this, 3);
    }

    @Override // xsna.ext0
    public final void D0(int i) {
        this.i.notifyItemChanged(i);
    }

    @Override // xsna.ext0
    public final void I1() {
        this.o.setVisibility(8);
    }

    @Override // xsna.ext0
    public final void Qd() {
        ViewAnimator viewAnimator = this.o;
        viewAnimator.setDisplayedChild(0);
        viewAnimator.setVisibility(0);
        if (this.r == null) {
            View findViewById = findViewById(R.id.group_picker_cancel_button);
            this.r = findViewById;
            findViewById.setOnClickListener(this.p);
        }
    }

    @Override // xsna.ext0
    public final int S1(Target target) {
        Iterator<T> it = this.n.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (target == ((Target) it.next())) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @Override // xsna.ext0
    public final void Tj() {
        ViewGroup viewGroup = this.d;
        View view = this.j;
        viewGroup.removeView(view);
        viewGroup.addView(view);
        this.f.setBackgroundColor(b6g.a(R.attr.vk_ui_background_content, getContext()));
    }

    @Override // xsna.ify.a
    public final void Y0() {
        ViewGroup viewGroup = this.d;
        viewGroup.setTranslationY(-ify.d(3, null));
        awt0.t(viewGroup, new foi(this, 10));
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        int i = ify.a;
        ify.g(this);
        boolean d = getPresenter().d();
        View view = this.f;
        this.d.animate().translationY(d ? -view.getHeight() : view.getHeight()).setDuration(195L).setInterpolator(qq2.g).withLayer().withEndAction(new x52(this, 6)).start();
        if (getPresenter().f() != 0) {
            int u = iah0.u();
            View view2 = this.j;
            view2.setMinimumHeight(u);
            view2.setAlpha(1.0f);
            view2.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(100L).withLayer().start();
        }
    }

    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        boolean d = getPresenter().d();
        View view = this.f;
        int height = d ? -view.getHeight() : view.getHeight();
        ViewGroup viewGroup = this.d;
        viewGroup.setTranslationY(height);
        viewGroup.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(225L).setInterpolator(qq2.f).setListener(new vlu(this)).withLayer().start();
        if (getPresenter().f() != 0) {
            int u = iah0.u();
            View view2 = this.j;
            view2.setMinimumHeight(u);
            view2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view2.animate().alpha(1.0f).setDuration(100L).withLayer().start();
        }
    }

    @Override // xsna.ext0
    public final void e0() {
        owi.a(t, 300L, new maj(this, 21));
    }

    @Override // xsna.ext0
    public final void f0() {
        owi.b(t);
        boolean isEmpty = this.n.isEmpty();
        ViewAnimator viewAnimator = this.h;
        if (isEmpty) {
            viewAnimator.setDisplayedChild(2);
        } else {
            viewAnimator.setDisplayedChild(0);
        }
    }

    @Override // xsna.ext0
    public final void g0() {
        owi.b(t);
        this.h.setDisplayedChild(3);
    }

    @Override // xsna.ext0
    public ext0.a getPresenter() {
        return this.c;
    }

    @Override // xsna.ext0
    public List<Target> getTargets() {
        return this.n;
    }

    @Override // xsna.ext0
    public final void h0(boolean z) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (isAttachedToWindow()) {
            b();
        } else {
            getViewTreeObserver().addOnPreDrawListener(new a());
        }
    }

    @Override // xsna.ext0
    public final void hide() {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (isAttachedToWindow()) {
            a();
        } else {
            getViewTreeObserver().addOnPreDrawListener(new wlu(this));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = ify.a;
        ify.a(this);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.d.clearAnimation();
        int i = ify.a;
        ify.g(this);
        super.onDetachedFromWindow();
    }

    @Override // xsna.ext0
    public void setEmptyText(String str) {
        if (this.l == null) {
            this.l = (TextView) findViewById(R.id.group_picker_empty_text);
        }
        this.l.setText(str);
    }

    @Override // xsna.ext0
    public void setErrorMessage(String str) {
        if (this.m == null) {
            this.m = (TextView) findViewById(R.id.group_picker_error_text);
        }
        this.m.setText(str);
    }

    public void setPresenter(ext0.a aVar) {
        this.c = aVar;
        if (getPresenter().f() != 0) {
            boolean d = getPresenter().d();
            View view = this.k;
            if (d) {
                f4m.y(getPresenter().f(), view);
            } else {
                f4m.v(getPresenter().f(), view);
            }
            view.setOnClickListener(new la(this, 7));
            this.j.setBackgroundResource(R.color.vk_black_alpha35);
        }
    }

    @Override // xsna.ext0
    @SuppressLint({"NotifyDataSetChanged"})
    public void setTargets(List<Target> list) {
        this.n = list;
        this.i.notifyDataSetChanged();
    }

    @Override // xsna.ext0
    public final void u0(String str, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = this.e;
        if (isEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    @Override // xsna.ext0
    public final void ve() {
        ViewAnimator viewAnimator = this.o;
        viewAnimator.setDisplayedChild(1);
        viewAnimator.setVisibility(0);
        if (this.s == null) {
            View findViewById = findViewById(R.id.group_picker_pick_button);
            this.s = findViewById;
            findViewById.setOnClickListener(this.q);
        }
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        ViewGroup viewGroup = this.d;
        viewGroup.setTranslationY(i);
        awt0.t(viewGroup, new n1i(this, 15));
    }

    public View getView() {
        return this;
    }
}
