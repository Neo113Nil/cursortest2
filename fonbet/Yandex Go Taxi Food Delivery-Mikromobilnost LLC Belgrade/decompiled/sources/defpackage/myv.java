package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.bricks.BrickSlotView;
import com.yandex.dsl.views.layouts.FrameLayoutBuilder;

/* loaded from: classes15.dex */
public final /* synthetic */ class myv implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayoutBuilder b;

    public /* synthetic */ myv(FrameLayoutBuilder frameLayoutBuilder, int i) {
        this.a = i;
        this.b = frameLayoutBuilder;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        FrameLayoutBuilder frameLayoutBuilder = this.b;
        switch (i) {
            case 0:
                ViewGroup.LayoutParams generateLayoutParams = frameLayoutBuilder.generateLayoutParams(-2, -2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) generateLayoutParams;
                layoutParams.width = -1;
                layoutParams.height = -2;
                ((BrickSlotView) obj).setLayoutParams(generateLayoutParams);
                break;
            case 1:
                ViewGroup.LayoutParams generateLayoutParams2 = frameLayoutBuilder.generateLayoutParams(-2, -2);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) generateLayoutParams2;
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                ((View) obj).setLayoutParams(generateLayoutParams2);
                break;
            default:
                ViewGroup.LayoutParams generateLayoutParams3 = frameLayoutBuilder.generateLayoutParams(-2, -2);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) generateLayoutParams3;
                layoutParams3.width = 0;
                layoutParams3.height = 0;
                ((View) obj).setLayoutParams(generateLayoutParams3);
                break;
        }
        return zy11Var;
    }
}
