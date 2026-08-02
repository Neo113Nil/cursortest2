package xsna;

import android.view.View;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class d6z0 extends View {
    public a b;
    public boolean c;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        void a(boolean z);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = true;
        boolean hasWindowFocus = hasWindowFocus();
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        if (this.c && hasWindowFocus) {
            aVar.a(true);
        } else {
            if (hasWindowFocus) {
                return;
            }
            aVar.a(false);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c = false;
        boolean hasWindowFocus = hasWindowFocus();
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        if (this.c && hasWindowFocus) {
            aVar.a(true);
        } else {
            if (hasWindowFocus) {
                return;
            }
            aVar.a(false);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(1, 1);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        if (this.c && z) {
            aVar.a(true);
        } else {
            if (z) {
                return;
            }
            aVar.a(false);
        }
    }

    public void setStateChangedListener(@Nullable a aVar) {
        this.b = aVar;
    }
}
