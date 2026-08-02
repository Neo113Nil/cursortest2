package defpackage;

import android.graphics.Canvas;
import com.ybsdk.widgets.common.PinCodeDotsView;

/* loaded from: classes4.dex */
public final /* synthetic */ class cvb0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Canvas b;
    public final /* synthetic */ float c;
    public final /* synthetic */ PinCodeDotsView w;

    public /* synthetic */ cvb0(Canvas canvas, float f, PinCodeDotsView pinCodeDotsView, int i) {
        this.a = i;
        this.b = canvas;
        this.c = f;
        this.w = pinCodeDotsView;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zy11 drawInflatingDots$lambda$36;
        zy11 drawDeflatingDots$lambda$37;
        int i = this.a;
        int intValue = ((Integer) obj).intValue();
        float floatValue = ((Float) obj2).floatValue();
        float floatValue2 = ((Float) obj3).floatValue();
        switch (i) {
            case 0:
                drawInflatingDots$lambda$36 = PinCodeDotsView.drawInflatingDots$lambda$36(this.b, this.c, this.w, intValue, floatValue, floatValue2);
                return drawInflatingDots$lambda$36;
            default:
                drawDeflatingDots$lambda$37 = PinCodeDotsView.drawDeflatingDots$lambda$37(this.b, this.c, this.w, intValue, floatValue, floatValue2);
                return drawDeflatingDots$lambda$37;
        }
    }
}
