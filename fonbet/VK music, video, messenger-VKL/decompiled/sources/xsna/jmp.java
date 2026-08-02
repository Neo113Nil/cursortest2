package xsna;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EnhancedView.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class jmp extends FunctionReferenceImpl implements wzs<Float, Boolean, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(Float f, Boolean bool) {
        float f2;
        float floatValue = f.floatValue();
        Boolean bool2 = bool;
        bool2.booleanValue();
        kmp kmpVar = (kmp) this.receiver;
        float f3 = kmp.m;
        kmpVar.getClass();
        float f4 = kmp.m;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        ConstraintLayout constraintLayout = kmpVar.e;
        bVar.i(constraintLayout);
        bVar.p(R.id.photoOriginal, an10.b(kmpVar.l * floatValue));
        bVar.b(constraintLayout);
        float width = floatValue * constraintLayout.getWidth();
        TextView textView = kmpVar.j;
        int right = textView.getRight();
        TextView textView2 = kmpVar.k;
        int left = textView2.getLeft();
        float f5 = right;
        float f6 = 1.0f;
        if (width < f5) {
            f2 = 0.0f;
        } else if (width < f5 + f4) {
            float f7 = width - f5;
            if (f7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f7 = 0.0f;
            }
            f2 = f7 / f4;
        } else {
            f2 = 1.0f;
        }
        textView.setAlpha(f2);
        float f8 = left;
        if (width > f8) {
            f6 = 0.0f;
        } else {
            float f9 = f8 - f4;
            if (width > f9) {
                float f10 = width - f9;
                if (f10 > f4) {
                    f10 = f4;
                }
                f6 = 1.0f - (f10 / f4);
            }
        }
        textView2.setAlpha(f6);
        izs<? super Boolean, s3q0> izsVar = kmpVar.b;
        if (izsVar != null) {
            izsVar.invoke(bool2);
        }
        return s3q0.a;
    }
}
