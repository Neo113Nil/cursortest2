package xsna;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* compiled from: AppCompatCheckedTextViewHelper.java */
/* loaded from: classes11.dex */
public final class i23 {

    @NonNull
    public final h23 a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public i23(@NonNull h23 h23Var) {
        this.a = h23Var;
    }

    public final void a() {
        h23 h23Var = this.a;
        Drawable checkMarkDrawable = h23Var.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.d || this.e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.d) {
                    mutate.setTintList(this.b);
                }
                if (this.e) {
                    mutate.setTintMode(this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(h23Var.getDrawableState());
                }
                h23Var.setCheckMarkDrawable(mutate);
            }
        }
    }
}
