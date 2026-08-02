package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsAccountThemeSelectorView;

/* loaded from: classes3.dex */
public final class c561 implements zo31 {
    public final SavingsAccountThemeSelectorView a;
    public final AppCompatTextView b;
    public final RecyclerView c;
    public final AppCompatTextView d;

    public c561(SavingsAccountThemeSelectorView savingsAccountThemeSelectorView, AppCompatTextView appCompatTextView, RecyclerView recyclerView, AppCompatTextView appCompatTextView2) {
        this.a = savingsAccountThemeSelectorView;
        this.b = appCompatTextView;
        this.c = recyclerView;
        this.d = appCompatTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
