package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RadialViewGroup.java */
/* loaded from: classes13.dex */
public class hte0 extends ConstraintLayout {
    public final tn9 t;
    public int u;
    public final MaterialShapeDrawable v;

    public hte0(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void P4() {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R$id.circle_center && !FreeSpaceBox.TYPE.equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R$id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.u * 0.66f) : this.u;
            Iterator it = list.iterator();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                int i3 = R$id.circle_center;
                b.C0021b c0021b = bVar.u(id).e;
                c0021b.A = i3;
                c0021b.B = round;
                c0021b.C = f;
                f += 360.0f / list.size();
            }
        }
        bVar.b(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            tn9 tn9Var = this.t;
            handler.removeCallbacks(tn9Var);
            handler.post(tn9Var);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        P4();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            tn9 tn9Var = this.t;
            handler.removeCallbacks(tn9Var);
            handler.post(tn9Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.v.setFillColor(ColorStateList.valueOf(i));
    }

    public hte0(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R$layout.material_radial_view_group, this);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.v = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new xsf0(0.5f));
        this.v.setFillColor(ColorStateList.valueOf(-1));
        MaterialShapeDrawable materialShapeDrawable2 = this.v;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setBackground(materialShapeDrawable2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadialViewGroup, i, 0);
        this.u = obtainStyledAttributes.getDimensionPixelSize(R$styleable.RadialViewGroup_materialCircleRadius, 0);
        this.t = new tn9(this, 16);
        obtainStyledAttributes.recycle();
    }
}
