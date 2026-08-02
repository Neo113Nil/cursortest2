package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes11.dex */
public final /* synthetic */ class e710 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ e710(MaterialButton materialButton, Drawable drawable, int i) {
        this.a = i;
        this.b = materialButton;
        this.c = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Drawable drawable = this.c;
        MaterialButton materialButton = this.b;
        switch (i) {
            case 0:
                materialButton.lambda$setSecondaryIcon$3(drawable);
                break;
            default:
                materialButton.lambda$setIcon$2(drawable);
                break;
        }
    }
}
