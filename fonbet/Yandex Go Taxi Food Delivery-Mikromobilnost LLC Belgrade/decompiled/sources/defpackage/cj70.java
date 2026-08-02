package defpackage;

import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.zone.dto.objects.ItemFill$LinearGradient;
import com.yandex.go.zone.dto.objects.ItemFill$Solid;
import com.yandex.go.zone.dto.objects.OrderButtonStyleDto;
import com.yandex.go.zone.dto.objects.m2;
import com.yandex.go.zone.dto.objects.n2;
import defpackage.fes0;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public final class cj70 {
    public final pdc a;
    public final yp2 b;
    public ItemFill$LinearGradient c;
    public ni70 d;

    public cj70(pdc pdcVar, yp2 yp2Var) {
        this.a = pdcVar;
        this.b = yp2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bj70 a(OrderButtonStyleDto orderButtonStyleDto) {
        pi70 oi70Var;
        kdc i;
        if (orderButtonStyleDto != null) {
            String str = orderButtonStyleDto.a;
            n2 n2Var = orderButtonStyleDto.b;
            boolean z = n2Var instanceof ItemFill$LinearGradient;
            yp2 yp2Var = this.b;
            pdc pdcVar = this.a;
            if (z) {
                ItemFill$LinearGradient itemFill$LinearGradient = (ItemFill$LinearGradient) n2Var;
                List list = itemFill$LinearGradient.a;
                List list2 = itemFill$LinearGradient.b;
                if (!list.isEmpty() && list.size() == list2.size()) {
                    if (jl40.l(this.c, itemFill$LinearGradient)) {
                        oi70Var = this.d;
                    } else {
                        int[] iArr = new int[list.size()];
                        int i2 = 0;
                        for (Object obj : list) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                scc.m();
                                throw null;
                            }
                            Integer S = q5z.S((String) obj);
                            if (S != null) {
                                iArr[i2] = S.intValue();
                                i2 = i3;
                            }
                        }
                        final fes0 fes0Var = new fes0(iArr, a.G0(list2), itemFill$LinearGradient.c);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: ru.yandex.taxi.orderbutton.base.mappers.OrderButtonStyleMapper$convertLinearGradient$2
                            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                            public Shader resize(int width, int height) {
                                fes0.this.a(width, height);
                                return fes0.this.b();
                            }
                        });
                        this.c = itemFill$LinearGradient;
                        ni70 ni70Var = new ni70(shapeDrawable);
                        this.d = ni70Var;
                        oi70Var = ni70Var;
                    }
                    if (oi70Var != null && (i = ((ufu) pdcVar).i(str)) != null) {
                        return new bj70(oi70Var, i, yp2Var.a(str, AppColor$Palette.TextOnControl));
                    }
                }
                oi70Var = null;
                if (oi70Var != null) {
                    return new bj70(oi70Var, i, yp2Var.a(str, AppColor$Palette.TextOnControl));
                }
            } else {
                if (n2Var instanceof ItemFill$Solid) {
                    String str2 = ((ItemFill$Solid) n2Var).a;
                    kdc e = ((ufu) pdcVar).e(str2);
                    if (e != null) {
                        oi70Var = new oi70(e, yp2Var.a(str2, AppColor$Palette.Control));
                        if (oi70Var != null) {
                        }
                    }
                } else if (!jl40.l(n2Var, m2.INSTANCE)) {
                    w511.b();
                    return null;
                }
                oi70Var = null;
                if (oi70Var != null) {
                }
            }
        }
        return null;
    }
}
