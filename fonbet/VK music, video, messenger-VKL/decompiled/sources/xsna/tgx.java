package xsna;

import com.vk.api.sdk.exceptions.InternalServerErrorOccurredException;
import com.vk.api.sdk.exceptions.VKInternalServerErrorException;
import kotlin.Pair;

/* compiled from: InternalErrorChainCall.kt */
/* loaded from: classes.dex */
public final class tgx<T> extends ara<T> {
    public final String b;
    public final z1p0 c;
    public final ara<T> d;
    public final bpn0 e;

    /* JADX WARN: Multi-variable type inference failed */
    public tgx(l7r0 l7r0Var, String str, z1p0 z1p0Var, ara<? extends T> araVar) {
        super(l7r0Var);
        this.b = str;
        this.c = z1p0Var;
        this.d = araVar;
        this.e = new bpn0(new bg6(this, 3));
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) {
        z1p0 z1p0Var = this.c;
        String str = this.b;
        Pair<Long, String> b = z1p0Var.b(str);
        Pair pair = new Pair(Boolean.valueOf(b.d().longValue() > 0), b.g());
        boolean booleanValue = ((Boolean) pair.d()).booleanValue();
        String str2 = (String) pair.g();
        bpn0 bpn0Var = this.e;
        if (booleanValue) {
            throw new InternalServerErrorOccurredException((String) bpn0Var.getValue(), str, str2);
        }
        try {
            T a = this.d.a(zqaVar);
            vx5 vx5Var = z1p0Var.a;
            if (!vx5Var.a.containsKey(str)) {
                return a;
            }
            vx5Var.a.remove(str);
            return a;
        } catch (VKInternalServerErrorException e) {
            z1p0Var.a(str, "InternalServerError(" + e.d() + ")");
            b(e, (String) bpn0Var.getValue());
            throw e;
        }
    }
}
