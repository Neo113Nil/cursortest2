package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.movika.api.InteractiveData;
import com.vk.newsfeed.common.views.poster.PosterEditText;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf6 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bf6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.b) {
            case 0:
                ef6 ef6Var = (ef6) this.c;
                ViewGroup u = ef6Var.u();
                InteractiveData interactiveData = ef6Var.j;
                axt0.a(u, interactiveData != null ? interactiveData.a : null);
                break;
            default:
                PosterEditText posterEditText = ((uac0) this.c).e;
                if (posterEditText != null) {
                    posterEditText.c.a(i3 - i);
                    posterEditText.postDelayed(new kv3(posterEditText, 15), 100L);
                    break;
                }
                break;
        }
    }
}
