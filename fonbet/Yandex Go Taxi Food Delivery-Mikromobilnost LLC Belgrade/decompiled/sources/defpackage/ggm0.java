package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class ggm0 implements hgm0 {
    public final dna a;
    public final RecyclerView b;
    public final TextInputLayout c;
    public final TextView d;
    public final TextView e;

    public ggm0(dna dnaVar) {
        this.a = dnaVar;
        this.b = (RecyclerView) dnaVar.b;
        this.c = (TextInputLayout) dnaVar.f;
        this.d = (TextView) dnaVar.e;
        this.e = (TextView) dnaVar.c;
    }

    @Override // defpackage.hgm0
    public final TextView a() {
        return this.e;
    }

    @Override // defpackage.hgm0
    public final TextView c() {
        return this.d;
    }

    @Override // defpackage.hgm0
    public final RecyclerView f() {
        return this.b;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return (LinearLayout) this.a.d;
    }

    @Override // defpackage.hgm0
    public final /* bridge */ /* synthetic */ ImageView i() {
        return null;
    }

    @Override // defpackage.hgm0
    public final TextInputLayout n() {
        return this.c;
    }
}
