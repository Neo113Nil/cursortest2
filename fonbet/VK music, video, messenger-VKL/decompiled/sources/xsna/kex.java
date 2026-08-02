package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.tlo0;

/* compiled from: InterestingStoriesBlockLayout.kt */
/* loaded from: classes6.dex */
public final class kex extends LinearLayout {
    public final LinkedHashSet b;
    public ValueAnimator c;
    public a d;
    public final qdx e;
    public final RecyclerView f;

    /* compiled from: InterestingStoriesBlockLayout.kt */
    public interface a {
        void a();

        void b(String str, kex kexVar);

        void c(String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kex(Context context) {
        super(context, null, 0);
        this.b = new LinkedHashSet();
        qdx qdxVar = new qdx(new i1m0());
        qdxVar.c = new x50(22);
        qdxVar.c = new b5h(this, 25);
        this.e = qdxVar;
        VkGroupHeader vkGroupHeader = new VkGroupHeader(context, null, 6);
        vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
        vkGroupHeader.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.stories_interesting_block_header_title), null, null, null, 0, 510));
        VkGroupHeader.Right.a.b bVar = new VkGroupHeader.Right.a.b(new w8q(this, 14), new tlo0.f(R.string.stories_interesting_block_close_accessibility));
        vkGroupHeader.setId(R.id.profile_discover_block_close_button);
        s3q0 s3q0Var = s3q0.a;
        vkGroupHeader.setRight(new VkGroupHeader.Right(null, 0 == true ? 1 : 0, bVar, 3));
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.profile_discover_block_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(qdxVar);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.addItemDecoration(new cfx());
        recyclerView.addOnScrollListener(new mex(this));
        this.f = recyclerView;
        setOrientation(1);
        setOutlineProvider(new s0w0(iah0.a(20), 6));
        setClipToOutline(true);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setBackgroundColor(dhr0.Y(R.attr.vk_ui_background_content, context));
        setPadding(0, 0, 0, iah0.a(8));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = iah0.a(6);
        addView(vkGroupHeader, layoutParams);
        addView(recyclerView);
    }

    public static final void a(kex kexVar) {
        dfx dfxVar;
        a aVar;
        LinkedHashSet linkedHashSet = kexVar.b;
        RecyclerView recyclerView = kexVar.f;
        if (recyclerView.getWidth() == 0 || !recyclerView.isLaidOut()) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int s = linearLayoutManager.s();
        int w = linearLayoutManager.w();
        if (s == -1 || w == -1) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (s > intValue || intValue > w) {
                it.remove();
            }
        }
        if (s > w) {
            return;
        }
        while (true) {
            if (linkedHashSet.add(Integer.valueOf(s)) && (dfxVar = (dfx) j5g.b0(s, kexVar.e.getCurrentList())) != null && (aVar = kexVar.d) != null) {
                aVar.c(dfxVar.a);
            }
            if (s == w) {
                return;
            } else {
                s++;
            }
        }
    }

    public final void setData(List<dfx> list) {
        qdx qdxVar = this.e;
        final boolean isEmpty = qdxVar.getCurrentList().isEmpty();
        final boolean isEmpty2 = list.isEmpty();
        qdxVar.submitList(list, new Runnable() { // from class: xsna.hex
            @Override // java.lang.Runnable
            public final void run() {
                boolean z = isEmpty;
                boolean z2 = isEmpty2;
                kex kexVar = this;
                if (z != z2) {
                    ValueAnimator valueAnimator = kexVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z2) {
                        ValueAnimator ofInt = ValueAnimator.ofInt(kexVar.getHeight(), 0);
                        ofInt.addUpdateListener(new jex(kexVar, 0));
                        kexVar.c = ofInt;
                    } else {
                        kexVar.setVisibility(0);
                        kexVar.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        kexVar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, kexVar.getMeasuredHeight());
                        ofInt2.addUpdateListener(new iex(kexVar, 0));
                        ofInt2.addListener(new lex(kexVar));
                        kexVar.c = ofInt2;
                    }
                    ValueAnimator valueAnimator2 = kexVar.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.setDuration(300L);
                        valueAnimator2.setInterpolator(new DecelerateInterpolator());
                        valueAnimator2.start();
                    }
                }
                kexVar.f.scrollToPosition(0);
            }
        });
    }

    public final void setOnClickListener(a aVar) {
        this.d = aVar;
    }
}
