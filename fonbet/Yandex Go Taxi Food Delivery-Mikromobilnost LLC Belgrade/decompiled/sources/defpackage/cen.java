package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.eatskit.c;
import ru.yandex.taxi.eatskit.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class cen implements jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ rme b;

    public /* synthetic */ cen(rme rmeVar, int i) {
        this.a = i;
        this.b = rmeVar;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof cen) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof cen) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        rme rmeVar = this.b;
        switch (i) {
            case 0:
                return new FunctionReferenceImpl(3, (c) rmeVar, c.class, "executeJs", "executeJs(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", 0);
            default:
                return new FunctionReferenceImpl(3, (d) rmeVar, d.class, "executeJs", "executeJs(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
