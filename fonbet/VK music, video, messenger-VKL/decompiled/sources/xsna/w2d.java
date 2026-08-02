package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.wch0;

/* compiled from: ClipItemScreenSpinnerRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class w2d {
    public final Context a;
    public final u6d b;
    public final pb c;
    public y2d d;

    public w2d(Context context, u6d u6dVar, pb pbVar) {
        this.a = context;
        this.b = u6dVar;
        this.c = pbVar;
    }

    public final y2d a() {
        y2d y2dVar = this.d;
        if (y2dVar == null) {
            y2dVar = new y2d(this.a);
        }
        this.d = y2dVar;
        return y2dVar;
    }

    public final void b(wch0 wch0Var) {
        SpinnerState spinnerState;
        if (!(wch0Var instanceof wch0.b)) {
            if (!(wch0Var instanceof wch0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.d != null) {
                ViewParent parent = a().getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(a());
                    return;
                }
                return;
            }
            return;
        }
        Window a = this.c.a();
        if (a == null) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) a.getDecorView();
        if (a().getParent() == null) {
            viewGroup2.addView(a(), -1, -1);
        }
        wch0.b bVar = (wch0.b) wch0Var;
        if (bVar instanceof wch0.b.a) {
            a().setOnCancelClick(new gy0(this, 20));
            return;
        }
        if (!(bVar instanceof wch0.b.C3927b)) {
            throw new NoWhenBranchMatchedException();
        }
        wch0.b.C3927b c3927b = (wch0.b.C3927b) wch0Var;
        boolean z = c3927b.b;
        boolean z2 = c3927b.a;
        int i = (z2 && z) ? R.string.clip_is_pinned : (z2 || !z) ? (!z2 || z) ? R.string.clip_is_not_unpinned : R.string.clip_is_not_pinned : R.string.clip_is_unpinned;
        y2d a2 = a();
        if (z) {
            spinnerState = SpinnerState.Done;
        } else {
            a().setCustomContentIcon(Integer.valueOf(R.drawable.vk_icon_cancel_circle_36));
            spinnerState = SpinnerState.Custom;
        }
        a2.setState(spinnerState);
        a().setSubtitle(Integer.valueOf(i));
        a().setOnCancelClick(new eu1(this, 18));
        a().setOnFinalStateShown(new q(this, 17));
    }
}
