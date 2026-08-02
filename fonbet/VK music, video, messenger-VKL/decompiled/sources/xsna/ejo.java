package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.markup.view.tools.button.ColorButton;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class ejo implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ djo c;

    public ejo(View view, djo djoVar) {
        this.b = view;
        this.c = djoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        djo djoVar = this.c;
        ViewGroup viewGroup = djoVar.A;
        if (viewGroup != null) {
            RecyclerView recyclerView = djoVar.m;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f2 = -(recyclerView != null ? recyclerView.getWidth() : 0.0f);
            ColorButton colorButton = djoVar.r;
            if (colorButton != null) {
                f = colorButton.getWidth();
            }
            viewGroup.setTranslationX(f2 + f);
        }
    }
}
