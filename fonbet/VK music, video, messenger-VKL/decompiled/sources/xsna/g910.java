package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.products_multipicker.api.MarketMultiPickerSource;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MarketMultipickerInputParams.kt */
/* loaded from: classes18.dex */
public final class g910 {
    public final List<MultipickerProduct> a;
    public final int b;
    public final String c;
    public final UserId d;
    public final boolean e;
    public final izs<List<MultipickerProduct>, s3q0> f;
    public final int g;
    public final boolean h;
    public final Integer i;
    public final MarketMultiPickerSource j;
    public final gzs<s3q0> k;
    public final gzs<s3q0> l;
    public final izs<na10, s3q0> m;
    public final izs<String, s3q0> n;

    public g910(ArrayList arrayList, int i, String str, UserId userId, izs izsVar, int i2, Integer num, MarketMultiPickerSource marketMultiPickerSource, gzs gzsVar, gzs gzsVar2, ux40 ux40Var, izs izsVar2, int i3) {
        List list = (i3 & 1) != 0 ? EmptyList.b : arrayList;
        int i4 = (i3 & 2) != 0 ? 10 : i;
        String str2 = (i3 & 4) != 0 ? null : str;
        UserId userId2 = (i3 & 8) != 0 ? null : userId;
        boolean z = (i3 & 16) == 0;
        int i5 = (i3 & 64) != 0 ? -1 : i2;
        boolean z2 = (i3 & 128) == 0;
        Integer num2 = (i3 & 256) != 0 ? null : num;
        MarketMultiPickerSource marketMultiPickerSource2 = (i3 & 512) != 0 ? null : marketMultiPickerSource;
        gzs gzsVar3 = (i3 & 1024) != 0 ? null : gzsVar;
        gzs gzsVar4 = (i3 & 2048) != 0 ? null : gzsVar2;
        ux40 ux40Var2 = (i3 & 4096) != 0 ? null : ux40Var;
        izs izsVar3 = (i3 & 8192) == 0 ? izsVar2 : null;
        this.a = list;
        this.b = i4;
        this.c = str2;
        this.d = userId2;
        this.e = z;
        this.f = izsVar;
        this.g = i5;
        this.h = z2;
        this.i = num2;
        this.j = marketMultiPickerSource2;
        this.k = gzsVar3;
        this.l = gzsVar4;
        this.m = ux40Var2;
        this.n = izsVar3;
    }
}
