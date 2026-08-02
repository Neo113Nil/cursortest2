package defpackage;

import com.yandex.go.design.compose.check.CheckSize;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.uicomponents.a;
import com.yx360.design.BrandTheme;

/* loaded from: classes11.dex */
public final /* synthetic */ class fgb implements wls {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ fgb(int i, sls slsVar, CharSequence charSequence, boolean z, boolean z2) {
        this.b = z;
        this.x = charSequence;
        this.c = z2;
        this.y = slsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.w;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                xkb1.b(this.b, (f530) obj4, (CheckSize) obj3, this.c, (fid) obj, O, this.w);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                mtm.a(this.b, (BrandTheme) obj4, (wls) obj3, this.c, (fid) obj, O2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                a.a((f530) obj4, (Character) obj3, this.b, this.c, (fid) obj, O3);
                break;
            default:
                ((Integer) obj2).getClass();
                int O4 = vng.O(i2 | 1);
                csb1.d(this.b, (CharSequence) obj4, this.c, (sls) obj3, (fid) obj, O4);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ fgb(f530 f530Var, Character ch, boolean z, boolean z2, int i) {
        this.x = f530Var;
        this.y = ch;
        this.b = z;
        this.c = z2;
        this.w = i;
    }

    public /* synthetic */ fgb(boolean z, f530 f530Var, CheckSize checkSize, boolean z2, int i, int i2) {
        this.b = z;
        this.x = f530Var;
        this.y = checkSize;
        this.c = z2;
        this.w = i2;
    }

    public /* synthetic */ fgb(boolean z, BrandTheme brandTheme, wls wlsVar, boolean z2, int i) {
        this.b = z;
        this.x = brandTheme;
        this.y = wlsVar;
        this.c = z2;
        this.w = i;
    }
}
