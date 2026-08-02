package xsna;

import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.an50;

/* compiled from: BookingRecordCompletedScreenStore.kt */
/* loaded from: classes18.dex */
public final class qu7 implements mu7, mm50<lu7, nt7, qt7> {
    public final /* synthetic */ mm50<lu7, nt7, qt7> b;
    public final /* synthetic */ BookingScreenParams c;

    /* compiled from: BookingRecordCompletedScreenStore.kt */
    public static final /* synthetic */ class a implements omf0, g0t {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            if ((obj instanceof omf0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, ku7.class, "<init>", "<init>()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // xsna.gzs
        public final Object invoke() {
            return new ku7();
        }
    }

    public qu7(final BookingScreenParams bookingScreenParams, final zu7 zu7Var) {
        this.c = bookingScreenParams;
        this.b = new ql50((aqw) null, 7).a(an50.a.a(new nu7(), new wb0() { // from class: xsna.ou7
            @Override // xsna.izs
            /* renamed from: j */
            public final qj50 invoke(sj50 sj50Var) {
                return new ot7(BookingScreenParams.this, sj50Var);
            }
        }, a.b, new t5o0() { // from class: xsna.pu7
            @Override // xsna.izs
            /* renamed from: m */
            public final mn50 invoke(nn50 nn50Var) {
                return new uu7(zu7Var, bookingScreenParams, nn50Var);
            }
        }));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super lu7, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super qt7, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(nt7 nt7Var) {
        this.b.b(nt7Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final /* bridge */ /* synthetic */ lu7 e() {
        return null;
    }

    @Override // xsna.mm50
    public final lu7 getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.mu7
    public final BookingScreenParams k() {
        return this.c;
    }
}
