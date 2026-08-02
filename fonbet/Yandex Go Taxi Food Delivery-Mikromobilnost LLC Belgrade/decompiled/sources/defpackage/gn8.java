package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.payment.sdk.cardscanner.TargetView;

/* loaded from: classes2.dex */
public final class gn8 implements zo31 {
    public final ConstraintLayout a;
    public final PreviewView b;
    public final TargetView c;
    public final TextView d;

    public gn8(ConstraintLayout constraintLayout, PreviewView previewView, TargetView targetView, TextView textView) {
        this.a = constraintLayout;
        this.b = previewView;
        this.c = targetView;
        this.d = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
