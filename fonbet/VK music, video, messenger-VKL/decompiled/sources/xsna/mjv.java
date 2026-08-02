package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.ArrayDeque;
import xsna.b330;
import xsna.y230;

/* compiled from: HttpGlideUrlLoader.java */
/* loaded from: classes12.dex */
public final class mjv implements b330<e1u, InputStream> {
    public static final ht80<Integer> b = ht80.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    @Nullable
    public final y230<e1u, e1u> a;

    /* compiled from: HttpGlideUrlLoader.java */
    public static class a implements c330<e1u, InputStream> {
        public final y230<e1u, e1u> a = new y230<>();

        @Override // xsna.c330
        @NonNull
        public final b330<e1u, InputStream> d(j540 j540Var) {
            return new mjv(this.a);
        }
    }

    public mjv(@Nullable y230<e1u, e1u> y230Var) {
        this.a = y230Var;
    }

    @Override // xsna.b330
    public final b330.a<InputStream> a(@NonNull e1u e1uVar, int i, int i2, @NonNull au80 au80Var) {
        e1u e1uVar2 = e1uVar;
        y230<e1u, e1u> y230Var = this.a;
        if (y230Var != null) {
            x230 x230Var = y230Var.a;
            y230.a a2 = y230.a.a(e1uVar2);
            Object a3 = x230Var.a(a2);
            ArrayDeque arrayDeque = y230.a.b;
            synchronized (arrayDeque) {
                arrayDeque.offer(a2);
            }
            e1u e1uVar3 = (e1u) a3;
            if (e1uVar3 == null) {
                x230Var.d(y230.a.a(e1uVar2), e1uVar2);
            } else {
                e1uVar2 = e1uVar3;
            }
        }
        return new b330.a<>(e1uVar2, new ykv(e1uVar2, ((Integer) au80Var.c(b)).intValue()));
    }

    @Override // xsna.b330
    public final /* bridge */ /* synthetic */ boolean b(@NonNull e1u e1uVar) {
        return true;
    }
}
