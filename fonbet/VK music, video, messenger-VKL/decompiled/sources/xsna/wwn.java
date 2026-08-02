package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;

/* compiled from: DonutBannerComposeView.kt */
/* loaded from: classes5.dex */
public final class wwn {
    public static final p3u a(q3u q3uVar, androidx.compose.runtime.a aVar) {
        us2 a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1353723187, 0, -1, "com.vk.profile.community.impl.ui.view.toUiModel (DonutBannerComposeView.kt:87)");
        }
        String str = q3uVar.a;
        ws9 ws9Var = q3uVar.c;
        String str2 = q3uVar.b;
        DonutPriceTemplate donutPriceTemplate = ws9Var.b;
        if (donutPriceTemplate == null) {
            aVar.K(975625262);
            aVar.j();
            a = null;
        } else {
            aVar.K(447113779);
            a = z1o.a(donutPriceTemplate, fdi.F(aVar), aVar, 0);
            aVar.j();
        }
        if (a == null) {
            aVar.K(447117000);
            a = ws2.b(ws9Var.a, aVar, 0);
            aVar.j();
        } else {
            aVar.K(447113156);
            aVar.j();
        }
        p3u p3uVar = new p3u(str, str2, new vs9(ws9Var.c, a));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return p3uVar;
    }

    public static final swm0 b(twm0 twm0Var, androidx.compose.runtime.a aVar) {
        us2 a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-555885331, 0, -1, "com.vk.profile.community.impl.ui.view.toUiModel (DonutBannerComposeView.kt:76)");
        }
        String str = twm0Var.a;
        ws9 ws9Var = twm0Var.c;
        com.vk.donut.design.compose.banner.c cVar = twm0Var.b;
        DonutPriceTemplate donutPriceTemplate = ws9Var.b;
        if (donutPriceTemplate == null) {
            aVar.K(1014193166);
            aVar.j();
            a = null;
        } else {
            aVar.K(-1629852077);
            a = z1o.a(donutPriceTemplate, fdi.F(aVar), aVar, 0);
            aVar.j();
        }
        if (a == null) {
            aVar.K(-1629848856);
            a = ws2.b(ws9Var.a, aVar, 0);
            aVar.j();
        } else {
            aVar.K(-1629852700);
            aVar.j();
        }
        swm0 swm0Var = new swm0(str, cVar, new vs9(ws9Var.c, a));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return swm0Var;
    }
}
