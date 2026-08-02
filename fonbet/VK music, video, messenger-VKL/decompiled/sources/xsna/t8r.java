package xsna;

import com.vk.im.ui.utils.recyclerview.LinearLayoutManagerScrollHelper;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import one.video.stat.transport.SequencePosition;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class t8r implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t8r(yi80 yi80Var, boolean z, SequencePosition sequencePosition, UUID uuid) {
        this.d = yi80Var;
        this.c = z;
        this.e = sequencePosition;
        this.f = uuid;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                yi80 yi80Var = (yi80) this.d;
                SequencePosition sequencePosition = (SequencePosition) this.e;
                UUID uuid = (UUID) this.f;
                return "handlePutOneLogEvent: event= " + yi80Var.a + ", force= " + this.c + ", sequencePosition= " + sequencePosition + ", sessionInstanceId= " + uuid;
            default:
                zfh0 zfh0Var = (zfh0) this.d;
                final vm30 vm30Var = (vm30) this.e;
                final String str = (String) this.f;
                zfh0 zfh0Var2 = vm30Var.V;
                LinearLayoutManagerScrollHelper linearLayoutManagerScrollHelper = vm30Var.Y;
                if (!zfh0Var.equals(zfh0Var2) && vm30Var.V != null) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"ChatScrollIssue: instantScrollTo cancel due to pendingScrollParams change"});
                    }
                    return s3q0.a;
                }
                boolean z = zfh0Var instanceof bvx;
                final boolean z2 = this.c;
                if (z) {
                    final bvx bvxVar = (bvx) zfh0Var;
                    final int d = vm30Var.d(bvxVar);
                    if (d >= 0) {
                        zfh0 zfh0Var3 = vm30Var.V;
                        if (zfh0Var3 instanceof bvx) {
                            bvx bvxVar2 = (bvx) zfh0Var3;
                            zfh0Var3 = new bvx(d, bvxVar2.e, bvxVar2.a, bvxVar2.c, bvxVar2.d);
                        }
                        vm30Var.V = zfh0Var3;
                        final boolean z3 = d != bvxVar.b;
                        L.d(new gzs() { // from class: xsna.rm30
                            @Override // xsna.gzs
                            public final Object invoke() {
                                StringBuilder a = vq.a("ChatScrollIssue: internalInstantScrollTo position=", d, '/');
                                a.append(vm30Var.H.f.size() - 1);
                                a.append(", force=");
                                a.append(z3);
                                a.append(", scrollTo=");
                                a.append(bvxVar);
                                a.append(", stop=");
                                a.append(z2);
                                return i5s.a(a, ", chain=", str);
                            }
                        });
                        linearLayoutManagerScrollHelper.c(d, bvxVar.c, z3, z2);
                    } else {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.w, new Object[]{efz.b(bvxVar.a, " not found", new StringBuilder("ChatScrollIssue: internalInstantScrollTo item with id "))});
                        }
                    }
                } else {
                    if (!(zfh0Var instanceof gb20)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final gb20 gb20Var = (gb20) zfh0Var;
                    int d2 = vm30Var.d(gb20Var);
                    Integer valueOf = Integer.valueOf(d2);
                    if (d2 == -1) {
                        valueOf = null;
                    }
                    final int intValue = valueOf != null ? valueOf.intValue() : 0;
                    L.d(new gzs() { // from class: xsna.tm30
                        @Override // xsna.gzs
                        public final Object invoke() {
                            StringBuilder a = vq.a("ChatScrollIssue: internalInstantScrollToMsg position=", intValue, '/');
                            a.append(vm30Var.H.f.size() - 1);
                            a.append(", scrollTo=");
                            a.append(gb20Var);
                            a.append(", stop=");
                            a.append(z2);
                            a.append(", chain=");
                            a.append(str);
                            return a.toString();
                        }
                    });
                    linearLayoutManagerScrollHelper.c(intValue, gb20Var.c, true, z2);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ t8r(zfh0 zfh0Var, vm30 vm30Var, boolean z, String str) {
        this.d = zfh0Var;
        this.e = vm30Var;
        this.c = z;
        this.f = str;
    }
}
