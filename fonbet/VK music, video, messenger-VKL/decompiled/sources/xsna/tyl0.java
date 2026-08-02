package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.uyl0;

/* compiled from: StoryBaseDialog.kt */
/* loaded from: classes16.dex */
public abstract class tyl0<P extends uyl0> extends c1q0 implements vyl0<P>, View.OnClickListener {
    public final View c;
    public final ViewGroup d;
    public final View e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tyl0(View view, boolean z, v3l0 v3l0Var) {
        super((r1 == null || !iah0.o(r1)) ? R.style.StoryFullScreenNoStatusDialog : R.style.StoryDialog, r0, z);
        Context context = view.getContext();
        Context context2 = view.getContext();
        v3l0Var.getClass();
        this.c = view;
        ViewGroup viewGroup = (ViewGroup) view;
        this.d = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.story_dialog_done);
        bwt0.h0(this, findViewById);
        this.e = findViewById;
        b(viewGroup);
        awt0.t(viewGroup, new x2j0(this, 2));
        setContentView(view);
    }

    public View c() {
        return this.d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        uyl0 uyl0Var = (uyl0) getPresenter();
        if (uyl0Var != null) {
            uyl0Var.onStop();
        }
        super.dismiss();
    }

    @Override // xsna.vyl0
    public final void jb(boolean z) {
        View view = this.e;
        view.setEnabled(z);
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    public void onClick(View view) {
        uyl0 uyl0Var;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf == null || valueOf.intValue() != R.id.story_dialog_done || (uyl0Var = (uyl0) getPresenter()) == null) {
            return;
        }
        uyl0Var.k();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        uyl0 uyl0Var = (uyl0) getPresenter();
        if (uyl0Var != null) {
            uyl0Var.onStart();
        }
    }

    public void d() {
    }

    @ozl
    public void b(ViewGroup viewGroup) {
    }
}
