package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes14.dex */
public final class c361 implements zo31 {
    public final /* synthetic */ int a = 0;
    public final ConstraintLayout b;
    public final View c;

    public c361(ConstraintLayout constraintLayout, View view) {
        this.b = constraintLayout;
        this.c = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }

    public c361(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, View view, AppCompatTextView appCompatTextView2) {
        this.b = constraintLayout;
        this.c = view;
    }
}
