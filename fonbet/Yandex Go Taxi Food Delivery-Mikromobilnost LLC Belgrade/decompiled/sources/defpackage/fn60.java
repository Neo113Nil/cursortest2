package defpackage;

import kotlin.jvm.internal.Ref$IntRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final /* synthetic */ class fn60 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ fn60(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.b = i;
        this.x = obj3;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        Object obj = this.x;
        int i2 = this.b;
        Object obj2 = this.w;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                StringBuilder x = unr0.x("Can not interpret the string '", (String) obj3, "' as ");
                x.append(((rm60) ((gn60) obj2).a.get(i2)).b);
                x.append(Extension.COLON_SPACE);
                x.append(((sm60) obj).q());
                return x.toString();
            default:
                return "Expected " + ((duu0) obj3).b + " but got " + ((CharSequence) obj2).subSequence(i2, ((Ref$IntRef) obj).element).toString();
        }
    }
}
