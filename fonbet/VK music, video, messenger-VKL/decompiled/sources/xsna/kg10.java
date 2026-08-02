package xsna;

import com.vk.dto.masks.Mask;
import com.vk.log.L;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.kg10;

/* compiled from: MaskAnalyticsDelegate.kt */
/* loaded from: classes7.dex */
public final class kg10 {
    public final bpn0 a = new bpn0(new d14(15));
    public final upj b = new upj();
    public Mask c;
    public long d;
    public final io.reactivex.rxjava3.subjects.f<b> e;
    public final io.reactivex.rxjava3.disposables.c f;

    /* compiled from: MaskAnalyticsDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<b, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b bVar) {
            final b bVar2 = bVar;
            final kg10 kg10Var = (kg10) this.receiver;
            kg10Var.getClass();
            a201.b().b().a().g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.jg10
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    kg10.b bVar3 = kg10.b.this;
                    boolean z = bVar3 instanceof kg10.b.C3179b;
                    kg10 kg10Var2 = kg10Var;
                    if (!z) {
                        if (bVar3 instanceof kg10.b.a) {
                            kg10Var2.a();
                            return;
                        }
                        return;
                    }
                    kg10Var2.getClass();
                    Mask mask = ((kg10.b.C3179b) bVar3).a;
                    kg10Var2.a();
                    ((pvw0) kg10Var2.a.getValue()).G(mask.d, mask.e);
                    kg10Var2.b.getClass();
                    kg10Var2.d = System.currentTimeMillis();
                    kg10Var2.c = mask;
                }
            }).i(new bqs(new lg10(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 7));
            return s3q0.a;
        }
    }

    /* compiled from: MaskAnalyticsDelegate.kt */
    public interface b {

        /* compiled from: MaskAnalyticsDelegate.kt */
        public static final class a implements b {
            public static final a a = new a();
        }

        /* compiled from: MaskAnalyticsDelegate.kt */
        /* renamed from: xsna.kg10$b$b, reason: collision with other inner class name */
        public static final class C3179b implements b {
            public final Mask a;

            public C3179b(Mask mask) {
                this.a = mask;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3179b) && epx.f(this.a, ((C3179b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "StartMaskUsage(mask=" + this.a + ')';
            }
        }
    }

    public kg10() {
        io.reactivex.rxjava3.subjects.f<b> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.e = fVar;
        this.f = fVar.a0(asu0.a.d()).subscribe(new rkz(new a(1, this, kg10.class, "applyEvent", "applyEvent(Lcom/vk/voip/ui/delegate/camera/MaskAnalyticsDelegate$Event;)V", 0), 3));
    }

    public final void a() {
        Mask mask = this.c;
        if (mask == null) {
            return;
        }
        this.b.getClass();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - this.d);
        ((pvw0) this.a.getValue()).x(mask.e, seconds, mask.d);
        this.c = null;
    }
}
