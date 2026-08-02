package xsna;

import com.vk.toggle.Features;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EasterEggsComponent.kt */
/* loaded from: classes.dex */
public final class ruo implements w8i {
    public static final bpn0 g = new bpn0(new nb8(3));
    public final bpn0 b = new bpn0(new bia(this, 2));
    public final bpn0 c = new bpn0(new m15(this, 3));
    public final bpn0 d = new bpn0(new cia(this, 1));
    public final bpn0 e = new bpn0(new qb8(2));
    public final bpn0 f = new bpn0(new eia(this, 2));

    /* compiled from: EasterEggsComponent.kt */
    /* loaded from: classes14.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Boolean> {
        public a(Object obj) {
            super(0, obj, ruo.class, "isAvailable", "isAvailable()Z", 0);
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            ruo ruoVar = (ruo) this.receiver;
            bpn0 bpn0Var = ruo.g;
            ruoVar.getClass();
            return Boolean.valueOf(com.vk.toggle.b.A.a(Features.Type.FEATURE_EASTER_EGGS));
        }
    }
}
