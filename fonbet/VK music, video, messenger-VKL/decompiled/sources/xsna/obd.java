package xsna;

import android.content.Context;
import com.vk.clips.design.view.component.video.preview.ClipRectanglePreview;
import com.vk.clips.tool.view.component.video.ClipProgressIndicator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class obd implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ obd(int i, izs izsVar, boolean z) {
        this.c = z;
        this.d = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                ClipRectanglePreview.PreviewItem.c cVar = (ClipRectanglePreview.PreviewItem.c) obj3;
                ClipProgressIndicator clipProgressIndicator = (ClipProgressIndicator) obj2;
                int i2 = ClipRectanglePreview.x;
                if (cVar != null) {
                    Context context = clipProgressIndicator.getContext();
                    int i3 = cVar.a;
                    gzs<s3q0> gzsVar = cVar.g;
                    clipProgressIndicator.setProgressValue(i3);
                    if (!z) {
                        gko gkoVar = cVar.b;
                        clipProgressIndicator.setCancelIconDrawable(gkoVar != null ? gko.b(gkoVar.a, context) : null);
                        cut0 cut0Var = cVar.c;
                        clipProgressIndicator.setCancelIconTintColor(cut0Var != null ? cut0Var.b(context) : 0);
                        cut0 cut0Var2 = cVar.d;
                        clipProgressIndicator.setLayerColor(cut0Var2 != null ? cut0Var2.b(context) : 0);
                        cut0 cut0Var3 = cVar.e;
                        clipProgressIndicator.setLineColor(cut0Var3 != null ? cut0Var3.b(context) : 0);
                        tlo0 tlo0Var = cVar.f;
                        clipProgressIndicator.setContentDescription(tlo0Var != null ? tlo0Var.a(context) : null);
                        jjc.f(gzsVar != null ? new qbd(0, gzsVar) : null, clipProgressIndicator);
                        clipProgressIndicator.setClickable(gzsVar != null);
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                n750.m(ne7.I(1), (androidx.compose.runtime.a) obj, (izs) obj3, z);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ obd(ClipRectanglePreview.PreviewItem.c cVar, boolean z) {
        this.d = cVar;
        this.c = z;
    }
}
