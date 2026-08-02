package defpackage;

import com.yandex.div.core.util.mask.a;
import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes11.dex */
public final class ker extends a {
    public final /* synthetic */ int e = 1;
    public final tls f;

    public ker(tls tlsVar) {
        super(veb0.b);
        this.f = tlsVar;
    }

    @Override // com.yandex.div.core.util.mask.a
    public void a(String str, Integer num) {
        switch (this.e) {
            case 1:
                uly0 c = klb1.c(i(), str);
                int intValue = num.intValue();
                int i = c.b;
                int i2 = intValue - i;
                int i3 = 0;
                if (i2 < 0) {
                    i2 = 0;
                }
                uly0 uly0Var = new uly0(i2, i, c.c);
                String h = h();
                int l = l(uly0Var, str);
                String h2 = h();
                String a = veb0.a(h2);
                if (a.equals(this.a.a)) {
                    a = null;
                }
                if (a != null) {
                    n(new x25(a, veb0.a, this.a.c), false);
                    m(0, null, h2);
                    uly0 c2 = klb1.c(h, h2);
                    int i4 = c2.a + c2.b;
                    int i5 = 0;
                    while (true) {
                        ArrayList arrayList = this.c;
                        if (arrayList == null) {
                            arrayList = null;
                        }
                        if (i3 < arrayList.size() && i5 < i4) {
                            ArrayList arrayList2 = this.c;
                            if (arrayList2 == null) {
                                arrayList2 = null;
                            }
                            int i6 = i3 + 1;
                            if (arrayList2.get(i3) instanceof u25) {
                                i5++;
                            }
                            i3 = i6;
                        }
                    }
                    this.d = f(i3);
                    break;
                } else {
                    int g = g();
                    if (i2 < g) {
                        g = Math.min(f(l), i().length());
                    }
                    this.d = g;
                    break;
                }
                break;
            default:
                super.a(str, num);
                break;
        }
    }

    @Override // com.yandex.div.core.util.mask.a
    public final void j(PatternSyntaxException patternSyntaxException) {
        int i = this.e;
        tls tlsVar = this.f;
        switch (i) {
            case 0:
                tlsVar.invoke(patternSyntaxException);
                break;
            default:
                tlsVar.invoke(patternSyntaxException);
                break;
        }
    }

    @Override // com.yandex.div.core.util.mask.a
    public void k(String str) {
        switch (this.e) {
            case 1:
                String a = veb0.a(str);
                if (a.equals(this.a.a)) {
                    a = null;
                }
                if (a != null) {
                    n(new x25(a, veb0.a, this.a.c), false);
                }
                super.k(str);
                break;
            default:
                super.k(str);
                break;
        }
    }

    public ker(x25 x25Var, tls tlsVar) {
        super(x25Var);
        this.f = tlsVar;
    }
}
