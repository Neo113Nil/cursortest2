package xsna;

import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

/* compiled from: BackgroundHolder.java */
/* loaded from: classes7.dex */
public final class kw5 extends vif0<Integer> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kw5(@NonNull ViewGroup viewGroup) {
        super(r0);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        linearLayout.setClickable(true);
        linearLayout.setImportantForAccessibility(2);
    }

    @Override // xsna.vif0
    public final void i6(Integer num) {
        this.itemView.setBackgroundResource(num.intValue());
    }
}
