package xsna;

import com.vk.dto.common.id.UserId;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import kotlin.Pair;
import xsna.xhr0;

/* compiled from: VmojiAvatarImpl.kt */
/* loaded from: classes7.dex */
public final class a6w0 implements w5w0 {
    public final dv3 a;
    public final UserId b;
    public final String c;
    public final int d;
    public final int e;

    public a6w0(dv3 dv3Var, UserId userId, String str, int i, int i2) {
        this.a = dv3Var;
        this.b = userId;
        this.c = str;
        this.d = i;
        this.e = i2;
    }

    @Override // xsna.w5w0
    public final io.reactivex.rxjava3.core.x<byte[]> a() {
        final n8w0 n8w0Var = (n8w0) ((bpn0) this.a.b).getValue();
        n8w0Var.getClass();
        StringBuilder sb = new StringBuilder();
        final UserId userId = this.b;
        sb.append(userId);
        sb.append("->");
        final String str = this.c;
        sb.append(str);
        final String a = xhr0.a.a(sb.toString());
        return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.m8w0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                n8w0 n8w0Var2 = n8w0.this;
                LinkedHashMap linkedHashMap = n8w0Var2.b;
                String str2 = a;
                io.reactivex.rxjava3.core.x xVar = (io.reactivex.rxjava3.core.x) linkedHashMap.get(str2);
                if (xVar != null) {
                    return xVar;
                }
                io.reactivex.rxjava3.internal.operators.single.a aVar = new io.reactivex.rxjava3.internal.operators.single.a(new io.reactivex.rxjava3.internal.operators.single.v(new ksj(n8w0Var2, userId, str, str2.concat(".bin"), str2, 1)).q((io.reactivex.rxjava3.core.w) n8w0Var2.c.getValue()));
                Pair pair = new Pair(str2, aVar);
                linkedHashMap.put(pair.i(), pair.j());
                return aVar;
            }
        }).q(asu0.a.d()), new ggj0(new zos(15), 9));
    }

    @Override // xsna.w5w0
    public final String b() {
        return this.c;
    }

    @Override // xsna.w5w0
    public final int getHeight() {
        return this.e;
    }

    @Override // xsna.w5w0
    public final int getWidth() {
        return this.d;
    }
}
