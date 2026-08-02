package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: GroupHeaderItemDecoration.kt */
/* loaded from: classes2.dex */
public abstract class kku extends RecyclerView.n implements too0 {
    public final Context b;
    public final boolean c = true;
    public final a d = new a();
    public SparseArray<CharSequence> e = new SparseArray<>();
    public final bpn0 f = new bpn0(new tbg(this, 22));
    public final Paint g;

    /* compiled from: GroupHeaderItemDecoration.kt */
    public final class a {
        public int c;
        public final LinkedHashMap<String, VkGroupHeader> a = new LinkedHashMap<>(10, 0.75f, true);
        public final sk3<VkGroupHeader> b = new sk3<>();
        public int d = -1;

        public a() {
        }
    }

    public kku(Context context) {
        this.b = context;
        Paint paint = new Paint(1);
        paint.setColor(e3m.f(R.attr.vk_ui_background_content, context));
        this.g = paint;
    }

    public static void l(VkGroupHeader vkGroupHeader, String str, int i) {
        vkGroupHeader.setTitle(new VkGroupHeader.d(str.toString(), null, null, null, 0, null, 510));
        vkGroupHeader.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        vkGroupHeader.layout(0, 0, vkGroupHeader.getMeasuredWidth(), vkGroupHeader.getMeasuredHeight());
    }

    @Override // xsna.too0
    public final void Ng() {
        this.g.setColor(e3m.f(R.attr.vk_ui_background_content, this.b));
        a aVar = this.d;
        aVar.a.clear();
        aVar.b.clear();
        aVar.d = -1;
    }

    public final SparseArray<CharSequence> b() {
        return this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.setEmpty();
        if (zik0.a(this.e, recyclerView.getChildAdapterPosition(view))) {
            rect.top = ((Number) this.f.getValue()).intValue();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        View view;
        CharSequence charSequence;
        Integer num;
        float f;
        if (recyclerView.getChildCount() == 0) {
            return;
        }
        int childCount = recyclerView.getChildCount() + 1;
        int width = recyclerView.getWidth();
        a aVar = this.d;
        LinkedHashMap<String, VkGroupHeader> linkedHashMap = aVar.a;
        sk3<VkGroupHeader> sk3Var = aVar.b;
        aVar.c = childCount;
        if (width != aVar.d) {
            sk3Var.addAll(linkedHashMap.values());
            linkedHashMap.clear();
            aVar.d = width;
        }
        int childCount2 = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount2) {
            View childAt = recyclerView.getChildAt(i);
            int i2 = i + 1;
            View childAt2 = recyclerView.getChildAt(i2);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            boolean z = this.c;
            if ((z && i == 0) || zik0.a(this.e, childAdapterPosition)) {
                if (z) {
                    int size = this.e.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            view = childAt;
                            charSequence = null;
                            break;
                        }
                        int keyAt = this.e.keyAt(i3);
                        SparseArray<CharSequence> sparseArray = this.e;
                        int i4 = i3 + 1;
                        u4q0 u4q0Var = zik0.a;
                        view = childAt;
                        Integer valueOf = (i4 >= sparseArray.size() || i4 < 0) ? null : Integer.valueOf(sparseArray.keyAt(i4));
                        int intValue = valueOf != null ? valueOf.intValue() : Integer.MAX_VALUE;
                        if (childAdapterPosition >= keyAt && childAdapterPosition < intValue) {
                            charSequence = this.e.valueAt(i3);
                            break;
                        } else {
                            i3 = i4;
                            childAt = view;
                        }
                    }
                } else {
                    charSequence = this.e.get(childAdapterPosition);
                    view = childAt;
                }
                if (charSequence == null) {
                    continue;
                } else {
                    String obj = charSequence.toString();
                    int width2 = recyclerView.getWidth();
                    kku kkuVar = kku.this;
                    LinkedHashMap<String, VkGroupHeader> linkedHashMap2 = aVar.a;
                    VkGroupHeader vkGroupHeader = linkedHashMap2.get(obj);
                    if (vkGroupHeader != null) {
                        num = null;
                    } else {
                        vkGroupHeader = sk3Var.m();
                        if (vkGroupHeader == null) {
                            num = null;
                            vkGroupHeader = new VkGroupHeader(kkuVar.b, null, 6);
                            vkGroupHeader.setSize(VkGroupHeader.Size.Small);
                        } else {
                            num = null;
                        }
                        l(vkGroupHeader, obj, width2);
                        linkedHashMap2.put(obj, vkGroupHeader);
                        while (linkedHashMap2.size() > aVar.c) {
                            Iterator<Map.Entry<String, VkGroupHeader>> it = linkedHashMap2.entrySet().iterator();
                            Map.Entry<String, VkGroupHeader> next = it.next();
                            it.remove();
                            sk3Var.addLast(next.getValue());
                        }
                    }
                    float measuredHeight = vkGroupHeader.getMeasuredHeight();
                    if (!zik0.a(this.e, childAt2 != null ? recyclerView.getChildAdapterPosition(childAt2) : -1) || childAt2 == null) {
                        f = 0.0f;
                    } else {
                        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                        f = Math.min(((layoutManager != null ? Integer.valueOf(layoutManager.getDecoratedTop(childAt2)) : num) != null ? r3.intValue() : 0) - measuredHeight, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    float top = (view.getTop() - measuredHeight) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (z) {
                        top = Math.max(top, f);
                    }
                    int alpha = (int) (view.getAlpha() * 255);
                    Paint paint = this.g;
                    paint.setAlpha(alpha);
                    vkGroupHeader.setAlpha(view.getAlpha());
                    int save = canvas.save();
                    canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, top);
                    try {
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, recyclerView.getWidth(), measuredHeight, paint);
                        vkGroupHeader.draw(canvas);
                    } finally {
                        canvas.restoreToCount(save);
                    }
                }
            }
            i = i2;
        }
    }
}
