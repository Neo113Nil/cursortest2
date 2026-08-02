package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: RippleContainer.android.kt */
/* loaded from: classes11.dex */
public final class dlg0 extends ViewGroup {
    public final int b;
    public final ArrayList c;
    public final ArrayList d;
    public final sq90 e;
    public int f;

    public dlg0(Context context) {
        super(context);
        this.b = 5;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        this.e = new sq90(2);
        setClipChildren(false);
        glg0 glg0Var = new glg0(context);
        addView(glg0Var);
        arrayList.add(glg0Var);
        arrayList2.add(glg0Var);
        this.f = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
