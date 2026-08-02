package defpackage;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class ja50 extends DrawerLayout.a {
    public final /* synthetic */ NavigationView a;

    public ja50(NavigationView navigationView) {
        this.a = navigationView;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.a, defpackage.acm
    public final void a(View view) {
        d710 d710Var;
        NavigationView navigationView = this.a;
        if (view == navigationView) {
            d710Var = navigationView.backOrchestrator;
            Objects.requireNonNull(d710Var);
            view.post(new sf30(9, d710Var));
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.a, defpackage.acm
    public final void b(View view) {
        d710 d710Var;
        NavigationView navigationView = this.a;
        if (view == navigationView) {
            d710Var = navigationView.backOrchestrator;
            d710Var.b();
            navigationView.maybeClearCornerSizeAnimationForDrawerLayout();
        }
    }
}
