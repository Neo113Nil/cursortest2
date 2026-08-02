package xsna;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.vk.imageloader.ImageScreenSize;
import com.vk.log.L;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mbv;

/* compiled from: HolidayInteractionView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class jbv extends FunctionReferenceImpl implements izs<mbv.d, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(mbv.d dVar) {
        mbv.d dVar2 = dVar;
        cbv cbvVar = (cbv) this.receiver;
        cbvVar.f.setText(dVar2.c);
        cbvVar.h.setText(dVar2.d);
        cbvVar.i.O0(dVar2.f, ImageScreenSize.SIZE_44DP);
        cbvVar.k.setText(dVar2.e);
        try {
            GradientDrawable gradientDrawable = cbvVar.j;
            if (gradientDrawable != null) {
                gradientDrawable.setColors(new int[]{Color.parseColor(dVar2.a), Color.parseColor(dVar2.b)});
            }
        } catch (IllegalArgumentException e) {
            L.g("Can't parse colors", e);
        }
        return s3q0.a;
    }
}
