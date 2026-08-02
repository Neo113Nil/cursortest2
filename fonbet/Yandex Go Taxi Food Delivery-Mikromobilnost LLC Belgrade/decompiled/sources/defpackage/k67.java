package defpackage;

import java.io.File;

/* loaded from: classes10.dex */
public final class k67 implements q430 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ k67(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.q430
    public final p430 a(Object obj, int i, int i2, mg70 mg70Var) {
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new p430(new lp60(bArr), new kg10(1, bArr, (i67) obj2));
            case 1:
                return new p430(new lp60(obj), new kg10(obj.toString(), (zoy0) obj2));
            case 2:
                File file = (File) obj;
                return new p430(new lp60(file), new g0r(0, file, (h0r) obj2));
            default:
                cit citVar = (cit) obj;
                return new p430(citVar, new mw60((xf7) obj2, citVar));
        }
    }

    @Override // defpackage.q430
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return true;
    }
}
