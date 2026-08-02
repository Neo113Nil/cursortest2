package defpackage;

import android.graphics.Canvas;
import com.ybsdk.feature.divkit.api.ui.SafeYbDivView;

/* loaded from: classes3.dex */
public final /* synthetic */ class hpl0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SafeYbDivView b;
    public final /* synthetic */ Canvas c;

    public /* synthetic */ hpl0(SafeYbDivView safeYbDivView, Canvas canvas, int i) {
        this.a = i;
        this.b = safeYbDivView;
        this.c = canvas;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 dispatchDraw$lambda$3;
        zy11 draw$lambda$2;
        int i = this.a;
        Canvas canvas = this.c;
        SafeYbDivView safeYbDivView = this.b;
        switch (i) {
            case 0:
                dispatchDraw$lambda$3 = SafeYbDivView.dispatchDraw$lambda$3(safeYbDivView, canvas);
                return dispatchDraw$lambda$3;
            default:
                draw$lambda$2 = SafeYbDivView.draw$lambda$2(safeYbDivView, canvas);
                return draw$lambda$2;
        }
    }
}
