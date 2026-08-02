package xsna;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MarketMultiPickerPageController.kt */
/* loaded from: classes18.dex */
public final class la10 extends CoordinatorLayout {
    public a A;
    public final RecyclerView B;
    public final VkSpinner C;
    public final ComposeView D;
    public final FrameLayout E;
    public final AppBarLayout F;
    public final GridLayoutManager G;
    public gzs<s3q0> H;
    public final rg50 I;
    public io.reactivex.rxjava3.disposables.c J;
    public vb K;
    public int z;

    /* compiled from: MarketMultiPickerPageController.kt */
    public interface a {

        /* compiled from: MarketMultiPickerPageController.kt */
        /* renamed from: xsna.la10$a$a, reason: collision with other inner class name */
        public static final class C3242a implements a {
            public static final C3242a a = new C3242a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3242a);
            }

            public final int hashCode() {
                return -1186012816;
            }

            public final String toString() {
                return "Disabled";
            }
        }

        /* compiled from: MarketMultiPickerPageController.kt */
        public static final class b implements a {
            public final e910 a;

            public b(e910 e910Var) {
                this.a = e910Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a.equals(((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Enabled(searchListener=" + this.a + ')';
            }
        }
    }

    public la10(Context context) {
        super(context, null, 0);
        this.z = -1;
        this.A = a.C3242a.a;
        this.H = new vi0(25);
        this.I = androidx.compose.runtime.i.a(-1);
        View.inflate(context, R.layout.product_multipicker_view_tab, this);
        VkSpinner vkSpinner = (VkSpinner) findViewById(R.id.progress);
        this.C = vkSpinner;
        f4m.j(vkSpinner);
        ComposeView composeView = (ComposeView) findViewById(R.id.page_placeholder_state_view);
        this.D = composeView;
        composeView.setVisibility(8);
        composeView.setContent(new jai(-867026959, new x78(4, context, this), true));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_market_items);
        this.B = recyclerView;
        this.E = (FrameLayout) findViewById(R.id.market_search_container);
        this.F = (AppBarLayout) findViewById(R.id.market_search_app_bar);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.x = new ka10(this, gridLayoutManager);
        this.G = gridLayoutManager;
        gridLayoutManager.setSpanCount(iah0.s(getContext()) ? 2 : 3);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    public static void J0(la10 la10Var) {
        VkSearchView searchView = la10Var.getSearchView();
        if (searchView != null) {
            searchView.U4();
        }
        la10Var.y0();
    }

    public static io.reactivex.rxjava3.disposables.c K0(VkSearchView vkSearchView, e910 e910Var) {
        io.reactivex.rxjava3.core.q x = d02.x(vkSearchView, 100L);
        asu0 asu0Var = asu0.a;
        return x.a0(asu0Var.d()).r0(asu0Var.d()).subscribe(new pmu(new e810(e910Var, 2), 5));
    }

    private final VkSearchView getSearchView() {
        View childAt = this.E.getChildAt(0);
        if (childAt instanceof VkSearchView) {
            return (VkSearchView) childAt;
        }
        return null;
    }

    private final void setUpSearchState(a aVar) {
        if (aVar instanceof a.b) {
            RecyclerView recyclerView = this.B;
            recyclerView.setHasFixedSize(true);
            recyclerView.setItemAnimator(null);
            final Lazy a2 = msy.a(LazyThreadSafetyMode.NONE, new nwk(this, 17));
            recyclerView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: xsna.ia10
                /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    VkSearchView vkSearchView;
                    if (Math.abs(i2 - i4) <= 0 || (vkSearchView = (VkSearchView) a2.getValue()) == null) {
                        return;
                    }
                    vkSearchView.d0();
                }
            });
            setUpSearchView((a.b) aVar);
            return;
        }
        if (!(aVar instanceof a.C3242a)) {
            throw new NoWhenBranchMatchedException();
        }
        io.reactivex.rxjava3.disposables.c cVar = this.J;
        if (cVar != null) {
            cVar.dispose();
        }
        FrameLayout frameLayout = this.E;
        frameLayout.removeAllViews();
        vb vbVar = this.K;
        if (vbVar != null) {
            frameLayout.removeCallbacks(vbVar);
        }
    }

    private final void setUpSearchView(a.b bVar) {
        io.reactivex.rxjava3.disposables.c cVar = this.J;
        if (cVar != null) {
            cVar.dispose();
        }
        FrameLayout frameLayout = this.E;
        frameLayout.removeAllViews();
        vb vbVar = this.K;
        if (vbVar != null) {
            frameLayout.removeCallbacks(vbVar);
        }
        Context context = getContext();
        VkSearchView vkSearchView = new VkSearchView(context, null, 6, 0);
        vkSearchView.setVoiceActionDelegate(new nrl(context, new acw0(new xim0(vkSearchView, 15)), new o44(0)));
        vkSearchView.setId(R.id.market_picker_search);
        vkSearchView.X4(false);
        vkSearchView.setVoiceInputEnabled(false);
        vkSearchView.setHint(R.string.attach_multipicker_market_search_hint);
        this.J = K0(vkSearchView, bVar.a);
        EditText editView = vkSearchView.getEditView();
        final e910 e910Var = bVar.a;
        editView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.ja10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                la10 la10Var = la10.this;
                if (z) {
                    vb vbVar2 = new vb(e910Var, 12);
                    view.postDelayed(vbVar2, 1000L);
                    la10Var.K = vbVar2;
                    return;
                }
                Runnable runnable = la10Var.K;
                if (runnable != null) {
                    view.removeCallbacks(runnable);
                }
                la10Var.K = null;
            }
        });
        vkSearchView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(vkSearchView);
    }

    public static VkSearchView w0(la10 la10Var) {
        return la10Var.getSearchView();
    }

    public final void L0(int i, boolean z) {
        this.D.setVisibility(z ? 0 : 8);
        ((wak0) this.I).C(i);
        this.B.setVisibility(z ? 8 : 0);
    }

    public final a getSearchState() {
        return this.A;
    }

    public final int getType() {
        return this.z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.A;
        a.b bVar = aVar instanceof a.b ? (a.b) aVar : null;
        if (bVar == null) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.J;
        if (cVar != null) {
            cVar.dispose();
        }
        VkSearchView searchView = getSearchView();
        this.J = searchView != null ? K0(searchView, bVar.a) : null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        io.reactivex.rxjava3.disposables.c cVar = this.J;
        if (cVar != null) {
            cVar.dispose();
        }
        vb vbVar = this.K;
        if (vbVar != null) {
            this.E.removeCallbacks(vbVar);
        }
    }

    public final void setAdapter(i810 i810Var) {
        this.B.setAdapter(i810Var);
    }

    public final void setLoading(boolean z) {
        this.B.setVisibility(!z ? 0 : 8);
        awt0.u(this.C, z);
    }

    public final void setOnScrollListener(RecyclerView.t tVar) {
        this.B.addOnScrollListener(tVar);
    }

    public final void setRepeatButtonAction(gzs<s3q0> gzsVar) {
        this.H = gzsVar;
    }

    public final void setSearchState(a aVar) {
        this.A = aVar;
        setUpSearchState(aVar);
    }

    public final void setType(int i) {
        this.z = i;
    }

    public final void y0() {
        VkSearchView searchView = getSearchView();
        if (searchView != null) {
            searchView.T4();
            searchView.d0();
        }
    }
}
