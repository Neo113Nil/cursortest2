package xsna;

import android.content.Context;
import com.vk.api.generated.money.dto.MoneyNspkMemberDto;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.internal.api.GsonHolder;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import xsna.gx8;
import xsna.l9r;

/* compiled from: NspkListFileCache.kt */
/* loaded from: classes.dex */
public final class tm70 implements rm70, gx8.a {
    public final bpn0 b;
    public final bpn0 c = new bpn0(new gb8(this, 4));
    public final AtomicReference<List<MoneyNspkMemberDto>> d = new AtomicReference<>();
    public final String e = "NspkList";
    public final CacheTarget f = CacheTarget.OTHER;

    public tm70(Context context, gx8 gx8Var) {
        this.b = new bpn0(new fb8(context, 6));
        gx8Var.c(this);
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return this.f;
    }

    @Override // xsna.rm70
    public final void b(List<MoneyNspkMemberDto> list) {
        String json = GsonHolder.a().toJson(list);
        kbr a = ((l9r) this.c.getValue()).a("banks_list.json");
        try {
            kf5 kf5Var = new kf5(json, 7);
            l9r.a aVar = (l9r.a) a;
            aVar.g(kf5Var);
            aVar.commit();
            aVar.close();
        } finally {
        }
    }

    @Override // xsna.rm70
    public final boolean c() {
        File file = ((l9r) this.c.getValue()).get("banks_list.json");
        if (file == null || !file.isFile()) {
            return false;
        }
        List<MoneyNspkMemberDto> d = d();
        return !(d == null || d.isEmpty());
    }

    @Override // xsna.rm70
    public final List<MoneyNspkMemberDto> d() {
        return this.d.updateAndGet(new UnaryOperator() { // from class: xsna.sm70
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            
                if (r1.length() > 0) goto L11;
             */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                String str;
                tm70 tm70Var = tm70.this;
                List list = (List) obj;
                if (list != null) {
                    return list;
                }
                try {
                    File file = ((l9r) tm70Var.c.getValue()).get("banks_list.json");
                    if (file != null) {
                        str = nbr.r(file, emb.b);
                    }
                } catch (IOException unused) {
                }
                str = null;
                if (str == null) {
                    return null;
                }
                List A = rli0.A(rli0.t(dz5.i(cqm0.i(str)), new ug8(tm70Var, 11)));
                if (A.isEmpty()) {
                    return null;
                }
                return A;
            }
        });
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        ((l9r) this.c.getValue()).c();
        nbr.l((File) this.b.getValue());
        this.d.set(null);
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return this.e;
    }

    @Override // xsna.gx8.a
    public final long u() {
        return z4g.f((File) this.b.getValue());
    }
}
