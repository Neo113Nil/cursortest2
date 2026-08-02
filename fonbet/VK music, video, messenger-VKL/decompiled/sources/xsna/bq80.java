package xsna;

import android.view.View;
import com.vk.writebar.WriteBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bq80 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ bq80(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                gzsVar.invoke();
                break;
            default:
                int i2 = WriteBar.h0;
                gzsVar.invoke();
                break;
        }
    }
}
