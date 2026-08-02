package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.markup.view.tools.button.ColorButton;

/* compiled from: View.kt */
/* loaded from: classes4.dex */
public final class xio implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ wio c;

    public xio(View view, wio wioVar) {
        this.b = view;
        this.c = wioVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wio wioVar = this.c;
        ViewGroup viewGroup = wioVar.m;
        if (viewGroup != null) {
            RecyclerView recyclerView = wioVar.l;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f2 = -(recyclerView != null ? recyclerView.getWidth() : 0.0f);
            ColorButton colorButton = wioVar.h;
            if (colorButton != null) {
                f = colorButton.getWidth();
            }
            viewGroup.setTranslationX(f2 + f);
        }
    }
}
