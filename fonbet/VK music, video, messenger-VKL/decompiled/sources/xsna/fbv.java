package xsna;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.vk.log.L;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mbv;

/* compiled from: HolidayInteractionView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class fbv extends FunctionReferenceImpl implements izs<mbv.b.C3335b, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(mbv.b.C3335b c3335b) {
        mbv.b.C3335b c3335b2 = c3335b;
        cbv cbvVar = (cbv) this.receiver;
        cbvVar.b.setText(c3335b2.c);
        cbvVar.d.setText(c3335b2.d);
        try {
            GradientDrawable gradientDrawable = cbvVar.c;
            if (gradientDrawable != null) {
                gradientDrawable.setColors(new int[]{Color.parseColor(c3335b2.a), Color.parseColor(c3335b2.b)});
            }
        } catch (IllegalArgumentException e) {
            L.g("Can't parse colors", e);
        }
        return s3q0.a;
    }
}
