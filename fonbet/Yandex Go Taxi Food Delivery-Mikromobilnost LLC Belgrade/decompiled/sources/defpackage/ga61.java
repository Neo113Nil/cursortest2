package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.core.transfer.utils.UnconditionalWidget;

/* loaded from: classes2.dex */
public final class ga61 implements zo31 {
    public final UnconditionalWidget a;
    public final TextView b;
    public final AppCompatImageView c;

    public ga61(UnconditionalWidget unconditionalWidget, TextView textView, AppCompatImageView appCompatImageView) {
        this.a = unconditionalWidget;
        this.b = textView;
        this.c = appCompatImageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
