package com.yandex.go.taxi.order.details.v1.elements.driver;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import defpackage.a6j;
import defpackage.amh;
import defpackage.avj0;
import defpackage.c6j;
import defpackage.evu0;
import defpackage.f6j;
import defpackage.g92;
import defpackage.jl40;
import defpackage.n4h0;
import defpackage.rol0;
import defpackage.t7s;
import defpackage.tpr;
import defpackage.vng;
import defpackage.y5j;
import defpackage.z5j;
import defpackage.zhm;
import defpackage.zuj0;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes14.dex */
public final class d {
    public final zhm a;
    public final zuj0 b;

    public d(zhm zhmVar, zuj0 zuj0Var) {
        this.a = zhmVar;
        this.b = zuj0Var;
    }

    public final tpr a(TaxiOrder taxiOrder, boolean z, f6j f6jVar, rol0 rol0Var, amh amhVar) {
        a6j y5jVar;
        Drawable t;
        Driver driver = taxiOrder.V().g;
        if (jl40.l(driver, Driver.v) || driver.s) {
            return new g92(2, c6j.a);
        }
        if (amhVar != null) {
            amhVar.invoke();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) driver.n);
        String str = driver.l;
        if (!evu0.J(str) && (t = vng.t(n4h0.ic_details_driver_rating_star, ((avj0) this.b).a)) != null) {
            spannableStringBuilder.append(" ", new CustomImageSpan(t, 2, false, true, null, 20, null), 33);
            spannableStringBuilder.append((CharSequence) str);
        }
        CharSequence k0 = evu0.k0(new SpannedString(spannableStringBuilder));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        String str2 = driver.c;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            str2 = ((Object) String.valueOf(str2.charAt(0)).toUpperCase(Locale.ROOT)) + str2.substring(1);
        }
        spannableStringBuilder2.append((CharSequence) str2);
        spannableStringBuilder2.append((CharSequence) " ");
        spannableStringBuilder2.append((CharSequence) driver.b);
        CharSequence k02 = evu0.k0(new SpannedString(spannableStringBuilder2));
        String a = t7s.a(driver.d);
        if (a == null) {
            a = "";
        }
        List Y = evu0.Y(a, new char[]{160}, 0, 6);
        String X = kotlin.collections.a.X(kotlin.collections.a.A0(Y, 3), " ", null, null, null, 62);
        String str3 = (String) kotlin.collections.a.S(3, Y);
        if (X.length() == 0) {
            y5jVar = z5j.a;
        } else {
            y5jVar = new y5j(X, str3 != null ? str3 : "");
        }
        return new m0(rol0Var, ((e) this.a).c(taxiOrder), new DetailsCardDriverStateMapper$map$1(k0, k02, y5jVar, this, f6jVar, taxiOrder, z, null));
    }
}
