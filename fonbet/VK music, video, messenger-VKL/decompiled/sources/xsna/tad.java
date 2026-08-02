package xsna;

import android.content.Context;
import android.util.TypedValue;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.NestedScrollableRecyclerView;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipProductAttachesLargeView.kt */
/* loaded from: classes18.dex */
public final class tad extends NestedScrollableRecyclerView {
    public final Object d;
    public izs<? super omc, s3q0> e;
    public izs<? super Integer, s3q0> f;
    public VkBlurContentView g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tad(Context context) {
        super(r0 != null ? new l7s(context, r0.intValue()) : context, null, 0);
        TypedValue typedValue = krv0.a;
        Integer d = krv0.d();
        this.d = msy.a(LazyThreadSafetyMode.NONE, new mh(this, 23));
        this.e = new mo1(11);
        this.f = new qb(12);
        setLayoutManager(new LinearLayoutManager(0, false));
        setAdapter(getClipAdapter());
        setClickable(true);
        setFocusable(true);
        addItemDecoration(new ehk0(iah0.a(4)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final vad getClipAdapter() {
        return (vad) this.d.getValue();
    }

    public final void a(List list, boolean z, j64 j64Var, t35 t35Var, ue0 ue0Var) {
        hfz sbk0Var;
        setPadding(0, j64Var.c, j64Var.b, j64Var.d);
        vad clipAdapter = getClipAdapter();
        List<omc> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (omc omcVar : list2) {
            if (omcVar instanceof vnd0) {
                sbk0Var = new qid0((vnd0) omcVar);
            } else if (omcVar instanceof urv0) {
                sbk0Var = new trv0((urv0) omcVar);
            } else {
                if (!(omcVar instanceof k20)) {
                    throw new NoWhenBranchMatchedException();
                }
                sbk0Var = new sbk0((k20) omcVar);
            }
            arrayList.add(sbk0Var);
        }
        clipAdapter.setItems(arrayList);
        scrollToPosition(0);
        this.e = t35Var;
        this.f = ue0Var;
        setHorizontalFadingEdgeEnabled(z);
        setVerticalFadingEdgeEnabled(false);
        setFadingEdgeLength(iah0.a(28));
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void setupBlurContent(VkBlurContentView vkBlurContentView) {
        if (vkBlurContentView != null && this.g == null) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView.e0 childViewHolder = getChildViewHolder(getChildAt(i));
                if (childViewHolder instanceof xad) {
                    ((xad) childViewHolder).getClass();
                }
            }
            this.g = vkBlurContentView;
        }
    }
}
