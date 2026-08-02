package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class fgm0 implements hgm0 {
    public final rm a;
    public final RecyclerView b;
    public final TextInputLayout c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;

    public fgm0(rm rmVar) {
        this.a = rmVar;
        this.b = (RecyclerView) rmVar.d;
        this.c = (TextInputLayout) rmVar.g;
        this.d = (TextView) rmVar.f;
        this.e = (TextView) rmVar.e;
        this.f = (ImageView) rmVar.c;
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
        return (ConstraintLayout) this.a.b;
    }

    @Override // defpackage.hgm0
    public final ImageView i() {
        return this.f;
    }

    @Override // defpackage.hgm0
    public final TextInputLayout n() {
        return this.c;
    }
}
