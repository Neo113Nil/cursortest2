package defpackage;

import com.airbnb.lottie.compose.b;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldsz;", "Lj530;", "Lcom/airbnb/lottie/compose/b;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class dsz extends j530 {
    public final int a;
    public final int b;

    public dsz(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.j530
    public final e530 a() {
        b bVar = new b();
        bVar.a = this.a;
        bVar.b = this.b;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsz)) {
            return false;
        }
        dsz dszVar = (dsz) obj;
        return this.a == dszVar.a && this.b == dszVar.b;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        b bVar = (b) e530Var;
        bVar.a = this.a;
        bVar.b = this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "LottieAnimationSizeElement(width=", ", height=", Extension.C_BRAKE);
    }
}
