package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.SelectionAwareEditText;

/* loaded from: classes4.dex */
public final class i361 implements zo31 {
    public final LoadableInput a;
    public final AppCompatImageButton b;
    public final View c;
    public final SelectionAwareEditText d;
    public final View e;
    public final ProgressBar f;
    public final Space g;
    public final Space h;
    public final AppCompatImageButton i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;

    public i361(LoadableInput loadableInput, AppCompatImageButton appCompatImageButton, View view, SelectionAwareEditText selectionAwareEditText, View view2, ProgressBar progressBar, Space space, Space space2, AppCompatImageButton appCompatImageButton2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.a = loadableInput;
        this.b = appCompatImageButton;
        this.c = view;
        this.d = selectionAwareEditText;
        this.e = view2;
        this.f = progressBar;
        this.g = space;
        this.h = space2;
        this.i = appCompatImageButton2;
        this.j = textView;
        this.k = textView2;
        this.l = textView3;
        this.m = textView4;
        this.n = textView5;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
