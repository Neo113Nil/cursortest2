package defpackage;

import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.tips.ui.TipItemUiState$ItemType;

/* loaded from: classes14.dex */
public final class jfz0 extends pkz0 {
    public final TipsType e;
    public final String f;
    public final TipItemUiState$ItemType g;
    public final String h;

    public jfz0(TipsType tipsType, String str, String str2, boolean z, TipItemUiState$ItemType tipItemUiState$ItemType, String str3, rqb1 rqb1Var) {
        super(str, z, rqb1Var, lkz0.a);
        this.e = tipsType;
        this.f = str2;
        this.g = tipItemUiState$ItemType;
        this.h = str3;
    }

    @Override // defpackage.pkz0
    public final String a() {
        String str = this.h;
        return (str == null || str.length() == 0) ? this.a : g8e.p(this.f, " ", str);
    }
}
