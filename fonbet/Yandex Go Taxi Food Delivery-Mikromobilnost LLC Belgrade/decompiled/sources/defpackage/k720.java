package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.dsl.views.layouts.LinearLayoutBuilder;

/* loaded from: classes15.dex */
public final /* synthetic */ class k720 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinearLayoutBuilder b;

    public /* synthetic */ k720(LinearLayoutBuilder linearLayoutBuilder, int i) {
        this.a = i;
        this.b = linearLayoutBuilder;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        LinearLayoutBuilder linearLayoutBuilder = this.b;
        switch (i) {
            case 0:
                ViewGroup.LayoutParams generateLayoutParams = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) generateLayoutParams;
                layoutParams.width = -1;
                layoutParams.height = kjs0.b(1);
                ((View) obj).setLayoutParams(generateLayoutParams);
                break;
            case 1:
                ViewGroup.LayoutParams generateLayoutParams2 = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) generateLayoutParams2;
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                ((TextView) obj).setLayoutParams(generateLayoutParams2);
                break;
            case 2:
                ViewGroup.LayoutParams generateLayoutParams3 = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) generateLayoutParams3;
                layoutParams3.width = -1;
                layoutParams3.height = -2;
                ((TextView) obj).setLayoutParams(generateLayoutParams3);
                break;
            case 3:
                ViewGroup.LayoutParams generateLayoutParams4 = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) generateLayoutParams4;
                layoutParams4.width = -1;
                layoutParams4.height = -2;
                ((TextView) obj).setLayoutParams(generateLayoutParams4);
                break;
            default:
                ViewGroup.LayoutParams generateLayoutParams5 = linearLayoutBuilder.generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) generateLayoutParams5;
                layoutParams5.width = -1;
                layoutParams5.height = -2;
                ((TextView) obj).setLayoutParams(generateLayoutParams5);
                break;
        }
        return zy11Var;
    }
}
