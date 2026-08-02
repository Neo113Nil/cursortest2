package defpackage;

import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import yads.x91;

/* loaded from: classes4.dex */
public final class mb81 {
    public final z6c a;
    public final TextView b;
    public final ProgressBar c;

    public mb81(IntegrationInspectorActivity integrationInspectorActivity, x91 x91Var, LinearLayoutManager linearLayoutManager, z6c z6cVar) {
        cp81 cp81Var;
        this.a = z6cVar;
        ImageButton imageButton = (ImageButton) integrationInspectorActivity.findViewById(R$id.toolbar_navigation_button);
        this.b = (TextView) integrationInspectorActivity.findViewById(R$id.toolbar_title);
        this.c = (ProgressBar) integrationInspectorActivity.findViewById(R$id.loading_view);
        RecyclerView recyclerView = (RecyclerView) integrationInspectorActivity.findViewById(R$id.recycler_view);
        qh81 qh81Var = new qh81();
        imageButton.setOnClickListener(new aq41(8, x91Var));
        try {
            cp81Var = kma1.b(integrationInspectorActivity);
        } catch (Throwable unused) {
            cp81Var = cp81.g;
        }
        int i = (int) cp81Var.d;
        recyclerView.setAdapter(z6cVar);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(qh81Var);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom() + i);
    }
}
