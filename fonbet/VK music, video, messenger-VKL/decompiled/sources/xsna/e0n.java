package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.tool.view.disableable.DisableableFrameLayout;

/* compiled from: DisableableViewUtils.kt */
/* loaded from: classes17.dex */
public final class e0n {
    public static final View a(int i, ViewGroup viewGroup, boolean z) {
        Context context = viewGroup.getContext();
        if (!z) {
            return LayoutInflater.from(context).inflate(i, viewGroup, false);
        }
        DisableableFrameLayout disableableFrameLayout = new DisableableFrameLayout(context, null, 6, 0);
        disableableFrameLayout.addView(LayoutInflater.from(context).inflate(i, (ViewGroup) disableableFrameLayout, false));
        if (viewGroup instanceof RecyclerView) {
            disableableFrameLayout.setLayoutParams(new RecyclerView.p(-1, -2));
        }
        return disableableFrameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(View view, boolean z) {
        c0n c0nVar = view instanceof c0n ? (c0n) view : null;
        if (c0nVar != null) {
            c0nVar.setTouchEnabled(z);
        }
        view.setAlpha(z ? 1.0f : 0.5f);
    }
}
