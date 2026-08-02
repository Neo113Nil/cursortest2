package xsna;

import android.media.MediaFormat;
import android.util.SparseArray;
import com.vk.media.pipeline.codec.CodecDrainer;
import com.vk.media.pipeline.codec.CodecFeeder;
import java.util.function.Function;
import xsna.hzf;
import xsna.ppa0;

/* compiled from: DecoderController.kt */
/* loaded from: classes3.dex */
public final class f8l<D extends hzf> {
    public final ppa0.a a;
    public final f100 b;
    public final String c;
    public final Function<MediaFormat, D> d;
    public final SparseArray<f8l<D>.a<D>> e = new SparseArray<>();

    /* compiled from: DecoderController.kt */
    public final class a<D extends hzf> {
        public final D a;
        public final CodecFeeder<D> b;
        public final CodecDrainer<D> c;

        public a(f8l f8lVar, k0h0 k0h0Var, D d) {
            this.a = d;
            ppa0.a aVar = f8lVar.a;
            k0h0Var.getClass();
            this.b = new CodecFeeder<>(d, 10L, aVar, f8lVar.b);
            this.c = new CodecDrainer<>(k0h0Var.m(), d, aVar, f8lVar.b);
        }
    }

    public f8l(ppa0.a aVar, f100 f100Var, String str, Function function) {
        this.a = aVar;
        this.b = f100Var;
        this.c = str;
        this.d = function;
    }

    public final f8l<D>.a<D> a(k0h0 k0h0Var) {
        MediaFormat format = k0h0Var.getFormat();
        if (format == null) {
            throw new IllegalArgumentException("using raw items with decoder");
        }
        f8l<D>.a<D> aVar = new a<>(this, k0h0Var, this.d.apply(format));
        this.e.put(k0h0Var.m(), aVar);
        return aVar;
    }

    public final boolean b() {
        SparseArray<f8l<D>.a<D>> sparseArray = this.e;
        int size = sparseArray.size();
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                if (sparseArray.valueAt(i).c.b()) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        SparseArray<f8l<D>.a<D>> sparseArray = this.e;
        int size = sparseArray.size();
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                if (sparseArray.valueAt(i).b.e.a.e) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [D extends xsna.hzf, xsna.hzf] */
    public final void d() {
        f100 f100Var = this.b;
        if (f100Var != null) {
            f100Var.d(this.c, "release");
        }
        SparseArray<f8l<D>.a<D>> sparseArray = this.e;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.valueAt(i).a.c();
        }
        sparseArray.clear();
    }

    public final void e(izs<? super CodecDrainer<D>, s3q0> izsVar) {
        SparseArray<f8l<D>.a<D>> sparseArray = this.e;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            f8l<D>.a<D> valueAt = sparseArray.valueAt(i);
            CodecDrainer codecDrainer = valueAt.c;
            if (!codecDrainer.b()) {
                valueAt.b.b(new gb(12, izsVar, valueAt));
            }
            if (!codecDrainer.b()) {
                izsVar.invoke(codecDrainer);
            }
        }
    }
}
