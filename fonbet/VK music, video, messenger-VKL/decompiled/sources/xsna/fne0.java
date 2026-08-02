package xsna;

import android.graphics.Point;
import android.view.View;
import java.util.List;

/* compiled from: QrBordersView.kt */
/* loaded from: classes5.dex */
public abstract class fne0 extends View {
    public izs<? super Integer, s3q0> b;

    public abstract List<Point> getCorners();

    public final izs<Integer, s3q0> getOnQrClicked() {
        return this.b;
    }

    public abstract int getSelectedBarcodeIndex();

    public abstract void setCorners(List<? extends Point> list);

    public final void setOnQrClicked(izs<? super Integer, s3q0> izsVar) {
        this.b = izsVar;
    }

    public abstract void setSelectedBarcodeIndex(int i);
}
