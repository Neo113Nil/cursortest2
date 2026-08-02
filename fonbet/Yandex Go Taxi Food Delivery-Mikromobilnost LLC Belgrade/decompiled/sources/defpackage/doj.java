package defpackage;

import com.yandex.go.design.compose.ratingbar.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class doj implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int w;

    public /* synthetic */ doj(String str, int i, f530 f530Var, int i2) {
        this.a = 3;
        this.c = str;
        this.w = i;
        this.b = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        String str = this.c;
        f530 f530Var = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                th91.a(vng.O(i2 | 1), fidVar, f530Var, str);
                break;
            case 1:
                num.intValue();
                cl91.h(vng.O(i2 | 1), fidVar, f530Var, str);
                break;
            case 2:
                num.getClass();
                a.e(vng.O(i2 | 1), fidVar, f530Var, str);
                break;
            case 3:
                num.getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input.a.a(str, f530Var, fidVar, i2, vng.O(1));
                break;
            default:
                num.getClass();
                ru.yandex.taxi.logistics.sdk.ui.component.text.a.a(vng.O(i2 | 1), fidVar, f530Var, str);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ doj(f530 f530Var, String str, int i, int i2) {
        this.a = i2;
        this.b = f530Var;
        this.c = str;
        this.w = i;
    }
}
