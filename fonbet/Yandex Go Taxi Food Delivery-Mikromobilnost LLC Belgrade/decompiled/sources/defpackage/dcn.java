package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import ru.yandex.taxi.eatskit.EatsKitHeaderView;

/* loaded from: classes5.dex */
public final class dcn implements zo31 {
    public final EatsKitHeaderView a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final dna d;

    public dcn(EatsKitHeaderView eatsKitHeaderView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, dna dnaVar) {
        this.a = eatsKitHeaderView;
        this.b = appCompatTextView;
        this.c = appCompatTextView2;
        this.d = dnaVar;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
