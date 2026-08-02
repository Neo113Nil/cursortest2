package xsna;

import android.app.Activity;
import androidx.compose.runtime.a;
import com.vk.content.design.view.photo.tags.PhotoTagsPreviewView;
import com.vk.dto.photo.Photo;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class doi implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ doi(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = a.C0011a.a;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                wh50 wh50Var = (wh50) obj5;
                k1i0 k1i0Var = (k1i0) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(k1i0Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1037898398, intValue, -1, "com.vk.core.compose.component.ComposableSingletons$VkSecondaryTabRowKt.lambda$948881064.<anonymous>.<anonymous> (VkSecondaryTabRow.kt:660)");
                    }
                    boolean z = ((Number) wh50Var.getValue()).intValue() == 0;
                    Object x = aVar.x();
                    if (x == obj4) {
                        x = new xmi(1, wh50Var);
                        aVar.R(x);
                    }
                    int i2 = ((intValue << 12) & 57344) | Tensorflow.FRAME_WIDTH;
                    k1i0Var.b(z, (gzs) x, joi.k, null, aVar, i2, 8);
                    boolean z2 = ((Number) wh50Var.getValue()).intValue() == 1;
                    Object x2 = aVar.x();
                    if (x2 == obj4) {
                        x2 = new ymi(1, wh50Var);
                        aVar.R(x2);
                    }
                    k1i0Var.b(z2, (gzs) x2, joi.l, null, aVar, i2, 8);
                    boolean z3 = ((Number) wh50Var.getValue()).intValue() == 2;
                    Object x3 = aVar.x();
                    if (x3 == obj4) {
                        x3 = new h3(2, wh50Var);
                        aVar.R(x3);
                    }
                    k1i0Var.b(z3, (gzs) x3, joi.m, null, aVar, i2, 8);
                    boolean z4 = ((Number) wh50Var.getValue()).intValue() == 3;
                    Object x4 = aVar.x();
                    if (x4 == obj4) {
                        x4 = new hoi(0, wh50Var);
                        aVar.R(x4);
                    }
                    k1i0Var.b(z4, (gzs) x4, joi.n, null, aVar, i2, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                vs9 vs9Var = (vs9) obj5;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-557005620, intValue2, -1, "com.vk.donut.design.compose.banner.CardContainerActionButton.<anonymous> (DonutBanner.kt:768)");
                    }
                    us2 us2Var = vs9Var.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.h0;
                    boolean J = aVar2.J(vs9Var);
                    Object x5 = aVar2.x();
                    if (J || x5 == obj4) {
                        x5 = new nfj(vs9Var, 13);
                        aVar2.R(x5);
                    }
                    yqv0.d(us2Var, egi0.b(q630.a.a, false, (izs) x5), 0L, 0, null, 0, false, 0, null, null, frv0Var, aVar2, 0, 0, 8188);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                return myc0.d().e(((Integer) obj).intValue(), (List) obj2, (Activity) obj3, ((m680) obj5).b(), null, null, false, null);
            default:
                PhotoTagsPreviewView photoTagsPreviewView = (PhotoTagsPreviewView) obj5;
                Photo photo = (Photo) obj;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                int i3 = PhotoTagsPreviewView.k;
                if (photo == null) {
                    return null;
                }
                return photo.Fb(photoTagsPreviewView.h, false).d.d;
        }
    }
}
