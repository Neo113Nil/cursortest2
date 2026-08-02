package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.core.view.mediapicker.views.FastScrollerView;
import com.vk.core.view.mediapicker.views.MediaPickerRecyclerView;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import xsna.tna0;

/* compiled from: MediaPickerPinchGestureHelper.kt */
/* loaded from: classes17.dex */
public final class iu10 implements tna0.a {
    public final VkMediaPicker.f b;
    public final tna0 c = new tna0(this);
    public boolean d = true;
    public final hu10 e = new View.OnTouchListener() { // from class: xsna.hu10
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ViewParent parent;
            iu10 iu10Var = iu10.this;
            if (!iu10Var.d || !iu10Var.c.a(motionEvent) || (parent = view.getParent()) == null) {
                return false;
            }
            parent.requestDisallowInterceptTouchEvent(true);
            return false;
        }
    };
    public float f = 1.0f;
    public int g = 3;

    /* JADX WARN: Type inference failed for: r1v3, types: [xsna.hu10] */
    public iu10(VkMediaPicker.f fVar) {
        this.b = fVar;
    }

    @Override // xsna.tna0.a
    public final void W(float f, float f2, float f3, float f4, float f5) {
        int i;
        View view;
        int i2;
        float f6 = this.f * f3;
        this.f = f6;
        if (f6 > 1.35f && (i2 = this.g) > 1) {
            this.g = i2 - 1;
        } else if (f6 >= 0.85f || (i = this.g) >= 5) {
            return;
        } else {
            this.g = i + 1;
        }
        this.f = 1.0f;
        int i3 = this.g;
        VkMediaPicker.f fVar = this.b;
        VkMediaPicker vkMediaPicker = VkMediaPicker.this;
        vkMediaPicker.m = i3;
        RecyclerView.o layoutManager = vkMediaPicker.b.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.setSpanCount(i3);
        }
        FastScrollerView fastScrollerView = vkMediaPicker.g;
        fastScrollerView.f.postDelayed(new ou5(fastScrollerView, 5), 500L);
        WeakReference<View> weakReference = fVar.a;
        if (weakReference != null && (view = weakReference.get()) != null) {
            MediaPickerRecyclerView mediaPickerRecyclerView = vkMediaPicker.b;
            int childLayoutPosition = mediaPickerRecyclerView.getChildLayoutPosition(view);
            int height = (mediaPickerRecyclerView.getHeight() - mediaPickerRecyclerView.getHeight()) / 2;
            RecyclerView.o layoutManager2 = mediaPickerRecyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager2 = layoutManager2 instanceof GridLayoutManager ? (GridLayoutManager) layoutManager2 : null;
            if (gridLayoutManager2 != null) {
                gridLayoutManager2.K(childLayoutPosition, height);
            }
        }
        vkMediaPicker.f();
        gt10 gt10Var = vkMediaPicker.h;
        if (gt10Var != null) {
            gt10Var.O0();
        }
    }

    @Override // xsna.tna0.a
    public final void a(float f, float f2, float f3, float f4) {
        float f5 = f + f3;
        float f6 = 2;
        Pair<Float, Float> pair = new Pair<>(Float.valueOf(f5 / f6), Float.valueOf((f2 + f4) / f6));
        VkMediaPicker.f fVar = this.b;
        fVar.a(pair);
        VkMediaPicker.this.n = false;
    }

    @Override // xsna.tna0.a
    public final void m() {
        this.f = 1.0f;
        VkMediaPicker.f fVar = this.b;
        fVar.a(null);
        VkMediaPicker.this.n = true;
    }
}
