package one.video.calls.sdk_private;

import java.time.Instant;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;
import xsna.cey0;
import xsna.eey0;
import xsna.jly0;
import xsna.s620;

/* compiled from: NewRenoCongestionController.java */
/* loaded from: classes8.dex */
public final class ax extends cey0 {
    public long d;
    public Instant e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewRenoCongestionController.java */
    public static final class a {
        public static final a a;
        public static final a b;
        private static final /* synthetic */ a[] c;

        static {
            a aVar = new a("SlowStart", 0);
            a = aVar;
            a aVar2 = new a("CongestionAvoidance", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    @Override // xsna.cey0
    public final synchronized void a(List<? extends jly0> list) {
        try {
            boolean z = this.b - this.a <= 3;
            super.a(list);
            Stream<R> map = list.stream().filter(new s620(this, 4)).map(new eey0());
            if (z) {
                long j = this.b;
                map.forEach(new Consumer() { // from class: xsna.fey0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        one.video.calls.sdk_private.ax axVar = one.video.calls.sdk_private.ax.this;
                        tly0 tly0Var = (tly0) obj;
                        if (axVar.b < axVar.d) {
                            axVar.b += tly0Var.q();
                        } else {
                            axVar.b = ((1200 * tly0Var.q()) / axVar.b) + axVar.b;
                        }
                    }
                });
                if (this.b != j) {
                    Objects.toString(this.b < this.d ? a.a : a.b);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
