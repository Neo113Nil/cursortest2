package xsna;

import android.content.Context;
import android.util.SparseIntArray;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.ugy0;
import xsna.xoy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class aez0 extends LinearLayout {
    public final ajz0 b;
    public final wcz0 c;
    public final x310 d;

    public aez0(Context context, ugy0.a aVar, xoy0.b bVar) {
        super(context);
        ujz0 ujz0Var = new ujz0(context);
        this.d = new x310(bVar, 26);
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = ujz0.v;
        SparseIntArray sparseIntArray = ujz0Var.a;
        int i2 = sparseIntArray.get(i);
        layoutParams.setMargins(i2, i2, i2, i2);
        layoutParams.weight = 1.0f;
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        ajz0 ajz0Var = new ajz0(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        int i3 = sparseIntArray.get(ujz0.m);
        int i4 = sparseIntArray.get(ujz0.g);
        ajz0Var.getActionButton().setPadding(i3, i4, i3, i4);
        ajz0Var.setLayoutParams(layoutParams2);
        this.b = ajz0Var;
        rvy0 rvy0Var = new rvy0(context);
        Button actionButton = ajz0Var.getActionButton();
        int i5 = rvy0.B;
        SparseIntArray sparseIntArray2 = rvy0Var.a;
        actionButton.setBackground(rvy0.b(sparseIntArray.get(r5), sparseIntArray2.get(i5), sparseIntArray2.get(rvy0.A), sparseIntArray2.get(rvy0.C)));
        ajz0Var.getActionButton().setTextColor(sparseIntArray2.get(rvy0.y));
        linearLayout.addView(ajz0Var);
        wcz0 wcz0Var = new wcz0(aVar);
        this.c = wcz0Var;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setAdapter(wcz0Var);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        int i6 = sparseIntArray.get(ujz0.i);
        int i7 = ujz0.n;
        recyclerView.addItemDecoration(new o7z0(i6, sparseIntArray.get(i7)));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, 0, sparseIntArray.get(i7));
        recyclerView.setLayoutParams(layoutParams3);
        addView(linearLayout);
        addView(recyclerView);
    }

    @NonNull
    public ajz0 getAdCardView() {
        return this.b;
    }
}
