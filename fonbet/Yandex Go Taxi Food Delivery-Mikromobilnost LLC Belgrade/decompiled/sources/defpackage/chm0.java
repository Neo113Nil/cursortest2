package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class chm0 implements dhm0 {
    public final /* synthetic */ int a = 0;
    public final ProgressBar b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final zo31 g;

    public chm0(rm rmVar) {
        this.g = rmVar;
        this.b = (ProgressBar) rmVar.g;
        this.c = (TextView) rmVar.c;
        this.d = (TextView) rmVar.f;
        this.e = (TextView) rmVar.d;
        this.f = (TextView) rmVar.e;
    }

    @Override // defpackage.dhm0
    public final TextView a() {
        int i = this.a;
        return this.e;
    }

    @Override // defpackage.dhm0
    public final TextView b() {
        int i = this.a;
        return this.f;
    }

    @Override // defpackage.dhm0
    public final TextView d() {
        int i = this.a;
        return this.d;
    }

    @Override // defpackage.dhm0
    public final ProgressBar e() {
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

    @Override // defpackage.dhm0
    public final TextView h() {
        int i = this.a;
        return this.c;
    }

    public chm0(rm rmVar, byte b) {
        this.g = rmVar;
        this.b = (ProgressBar) rmVar.g;
        this.c = (TextView) rmVar.c;
        this.d = (TextView) rmVar.f;
        this.e = (TextView) rmVar.d;
        this.f = (TextView) rmVar.e;
    }
}
