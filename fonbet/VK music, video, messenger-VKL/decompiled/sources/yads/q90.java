package yads;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import xsna.dd6;
import xsna.izs;

/* loaded from: classes10.dex */
public final class q90 {
    public final w40 a;
    public final TextView b;
    public final ProgressBar c;

    public q90(IntegrationInspectorActivity integrationInspectorActivity, ec1 ec1Var, LinearLayoutManager linearLayoutManager, w40 w40Var) {
        this.a = w40Var;
        ImageButton imageButton = (ImageButton) integrationInspectorActivity.findViewById(R$id.toolbar_navigation_button);
        this.b = (TextView) integrationInspectorActivity.findViewById(R$id.toolbar_title);
        this.c = (ProgressBar) integrationInspectorActivity.findViewById(R$id.loading_view);
        RecyclerView recyclerView = (RecyclerView) integrationInspectorActivity.findViewById(R$id.recycler_view);
        a80 a80Var = new a80();
        imageButton.setOnClickListener(new dd6(ec1Var, 14));
        int a = (int) zp3.b(integrationInspectorActivity).a();
        recyclerView.setAdapter(w40Var);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(a80Var);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom() + a);
    }

    public static final void a(izs izsVar, View view) {
        izsVar.invoke(b90.a);
    }
}
