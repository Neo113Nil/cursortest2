package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.dqe0;
import xsna.iut0;

/* compiled from: BaseCommonQuestionsView.kt */
/* loaded from: classes17.dex */
public abstract class pb6 extends ConstraintLayout {
    public final View A;
    public RecyclerView B;
    public ygy C;
    public izs<? super lpe0, s3q0> t;
    public final VkText u;
    public final VkText v;
    public final RecyclerView w;
    public final FrameLayout x;
    public final Object y;
    public final VkButton z;

    public pb6(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.internal_nps_common_questions, (ViewGroup) this, true);
        this.u = (VkText) findViewById(R.id.internal_nps_step_title);
        this.v = (VkText) findViewById(R.id.internal_nps_title);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.internal_nps_question_content);
        this.w = recyclerView;
        this.x = (FrameLayout) findViewById(R.id.internal_nps_question_content_wrapper);
        this.y = msy.a(LazyThreadSafetyMode.NONE, new ey0(this, 2));
        VkButton vkButton = (VkButton) findViewById(R.id.internal_nps_next_button);
        this.z = vkButton;
        this.A = findViewById(R.id.keyboard_area);
        jjc.g(vkButton, new o43(4, this, context));
        vkButton.setOnTouchListener(new nb6(0));
        ((LinearLayoutManager) recyclerView.getLayoutManager()).l = true;
    }

    public static s3q0 P4(pb6 pb6Var) {
        View l = awt0.l(pb6Var.w, new v7(9));
        if (l != null) {
            l.clearFocus();
        }
        pb6Var.setKeyboardAreaHeight(0);
        mhy.d(pb6Var);
        return s3q0.a;
    }

    public static int V4(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return view.getHeight() + i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAvailableKeyboardAreaHeight() {
        int height = getHeight() - (V4(this.x) + (V4(this.v) + (V4(this.u) + V4(this.z))));
        if (height < 0) {
            return 0;
        }
        return height;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final hqe0 getQuestionsAdapter() {
        return (hqe0) this.y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setKeyboardAreaHeight(int i) {
        View view = this.A;
        if (view.getHeight() == i || view.getLayoutParams() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = i;
        view.setLayoutParams(bVar);
    }

    public final void U4(dqe0.a aVar) {
        RecyclerView recyclerView = this.w;
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(getQuestionsAdapter());
        }
        boolean isEmpty = getQuestionsAdapter().h.isEmpty();
        if (aVar instanceof dqe0.d) {
            hqe0 questionsAdapter = getQuestionsAdapter();
            ArrayList arrayList = ((dqe0.d) aVar).d;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new cgz((wpe0) it.next()));
            }
            questionsAdapter.setItems(arrayList2);
        } else if (aVar instanceof dqe0.e) {
            hqe0 questionsAdapter2 = getQuestionsAdapter();
            ArrayList arrayList3 = ((dqe0.e) aVar).d;
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new dgz((wpe0) it2.next()));
            }
            questionsAdapter2.setItems(arrayList4);
        } else {
            if (!(aVar instanceof dqe0.g)) {
                throw new NoWhenBranchMatchedException();
            }
            dqe0.g gVar = (dqe0.g) aVar;
            getQuestionsAdapter().setItems(Collections.singletonList(new k3x(gVar.d, gVar.e)));
        }
        if (!isEmpty) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            long m = itemAnimator != null ? itemAnimator.m() : 0L;
            if (m != 0) {
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, recyclerView.getHeight()));
                recyclerView.postDelayed(new ii4(1, recyclerView, layoutParams), m);
            }
        }
        this.z.setEnabled(aVar.b());
        r3a r3aVar = (r3a) this;
        r3aVar.getStepTitle().setVisibility(8);
        r3aVar.getTitle().setVisibility(8);
        f4m.t(0, r3aVar.getRecyclerViewWrapper());
    }

    public final izs<lpe0, s3q0> getActionListener() {
        return this.t;
    }

    public abstract List<fqj0<?>> getDelegates();

    public final RecyclerView getRecyclerView() {
        return this.w;
    }

    public final FrameLayout getRecyclerViewWrapper() {
        return this.x;
    }

    public final VkText getStepTitle() {
        return this.u;
    }

    public final VkText getTitle() {
        return this.v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x001a, code lost:
    
        r0 = null;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        View view;
        super.onAttachedToWindow();
        ob6 ob6Var = new ob6(this);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        aqx0.a(this, ob6Var);
        Object parent = getParent();
        if (parent instanceof View) {
            view = (View) parent;
            while (view != null && !(view instanceof RecyclerView)) {
                Object parent2 = view.getParent();
                if (parent2 instanceof View) {
                    view = (View) parent2;
                }
            }
            RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
            this.B = recyclerView;
            this.C = recyclerView != null ? new ygy() : null;
            return;
        }
        view = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ygy ygyVar;
        super.onDetachedFromWindow();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(this, null);
        setKeyboardAreaHeight(0);
        RecyclerView recyclerView = this.B;
        if (recyclerView == null || (ygyVar = this.C) == null) {
            return;
        }
        recyclerView.removeOnScrollListener(ygyVar);
        ygyVar.c = null;
        ygyVar.b = false;
    }

    public final void setActionListener(izs<? super lpe0, s3q0> izsVar) {
        this.t = izsVar;
    }
}
