package defpackage;

import android.content.res.ColorStateList;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.ybsdk.core.utils.ext.view.b;

/* loaded from: classes3.dex */
public final class ksz0 extends lsz0 {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ ksz0(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.lsz0
    public final void a(LinearLayoutCompat linearLayoutCompat) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                linearLayoutCompat.setBackgroundTintList(null);
                b.x(i2, linearLayoutCompat);
                break;
            case 1:
                if (linearLayoutCompat.getBackground() == null) {
                    linearLayoutCompat.setBackgroundColor(i2);
                    break;
                } else {
                    linearLayoutCompat.setBackgroundTintList(ColorStateList.valueOf(i2));
                    break;
                }
            default:
                linearLayoutCompat.setBackgroundTintList(null);
                linearLayoutCompat.setBackgroundResource(i2);
                break;
        }
    }
}
