package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class mgm0 implements ngm0 {
    public final /* synthetic */ int a = 0;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final zo31 g;

    public mgm0(rm rmVar) {
        this.g = rmVar;
        this.b = (TextView) rmVar.f;
        this.c = (TextView) rmVar.c;
        this.d = (ImageView) rmVar.e;
        this.e = (TextView) rmVar.g;
        this.f = (TextView) rmVar.d;
    }

    @Override // defpackage.ngm0
    public final TextView g() {
        int i = this.a;
        return this.b;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        zo31 zo31Var = this.g;
        switch (i) {
            case 0:
                return (ConstraintLayout) ((rm) zo31Var).b;
            default:
                return (LinearLayout) ((rm) zo31Var).b;
        }
    }

    @Override // defpackage.ngm0
    public final TextView j() {
        int i = this.a;
        return this.e;
    }

    @Override // defpackage.ngm0
    public final TextView k() {
        int i = this.a;
        return this.c;
    }

    @Override // defpackage.ngm0
    public final TextView l() {
        int i = this.a;
        return this.f;
    }

    @Override // defpackage.ngm0
    public final ImageView m() {
        int i = this.a;
        return this.d;
    }

    public mgm0(rm rmVar, byte b) {
        this.g = rmVar;
        this.b = (TextView) rmVar.f;
        this.c = (TextView) rmVar.c;
        this.d = (ImageView) rmVar.e;
        this.e = (TextView) rmVar.g;
        this.f = (TextView) rmVar.d;
    }
}
