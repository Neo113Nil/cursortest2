package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.yandex.quark.js.event.a;
import com.yandex.quark.js.event.i;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.api.alicekit.directives.platform.utils.TDirective;

/* loaded from: classes8.dex */
public final class l5u implements ifo {
    public final zwf0 a;
    public final zq6 b;
    public final t830 c;
    public volatile quf0 w;

    public l5u(zq6 zq6Var, t830 t830Var, zwf0 zwf0Var) {
        this.a = zwf0Var;
        this.b = zq6Var;
        this.c = t830Var;
    }

    public final void a(String str) {
        this.a.e("HandleDirectiveEventHandler", str);
        this.b.b(new ple(str, 4));
    }

    @Override // defpackage.ifo
    public final boolean c(i iVar) {
        return iVar instanceof a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015c  */
    @Override // defpackage.ifo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(i iVar, ContinuationImpl continuationImpl) {
        syj0 a;
        Object fnjVar;
        syj0 syj0Var;
        jyj0 jyj0Var;
        Object obj;
        zy11 zy11Var = zy11.a;
        qdo qdoVar = (qdo) ((a) iVar).a();
        quf0 quf0Var = this.w;
        if (quf0Var == null) {
            a("Failed to handle directive " + qdoVar.b() + ": directive executor is not provided!");
            return zy11Var;
        }
        png a2 = qdoVar.a();
        t830 t830Var = this.c;
        ProtoAdapter<TDirective> protoAdapter = TDirective.ADAPTER;
        byte[] b = a2.b();
        if (b != null) {
            a = jaa1.a(protoAdapter, b).a(j5u.a);
        } else {
            String a3 = a2.a();
            a = a3 != null ? t830Var.a(TDirective.class, a3).a(k5u.a) : new jyj0(yng.b);
        }
        if (!(a instanceof lyj0)) {
            if (!(a instanceof jyj0)) {
                w511.b();
                return null;
            }
            zng zngVar = (zng) ((jyj0) a).a;
            a("Failed to handle directive " + qdoVar.b() + Extension.COLON_SPACE + zngVar.a());
            return zy11Var;
        }
        TDirective tDirective = (TDirective) ((lyj0) a).a;
        String name = tDirective.getName();
        syj0 a4 = com.yandex.quark.platform.utils.directive.a.a(tDirective, quf0Var.c);
        if (a4 instanceof lyj0) {
            fnjVar = ((lyj0) a4).a;
        } else {
            if (!(a4 instanceof jyj0)) {
                w511.b();
                syj0Var = null;
                jyj0Var = syj0Var instanceof jyj0 ? (jyj0) syj0Var : null;
                if (jyj0Var != null && (obj = jyj0Var.a) != null) {
                    a("Failed to handle directive " + qdoVar.b() + Extension.COLON_SPACE + ((xmj) obj).a());
                }
                return zy11Var;
            }
            fnjVar = new fnj("{}");
        }
        gnj gnjVar = (gnj) fnjVar;
        if (!(gnjVar instanceof enj)) {
            if (!(gnjVar instanceof fnj)) {
                w511.b();
                syj0Var = null;
                if (syj0Var instanceof jyj0) {
                }
                if (jyj0Var != null) {
                    a("Failed to handle directive " + qdoVar.b() + Extension.COLON_SPACE + ((xmj) obj).a());
                }
                return zy11Var;
            }
            quf0Var.b.getClass();
            hnj hnjVar = new hnj(name);
            new jyj0(hnjVar);
            quf0Var.d.e("ProtoSupportedDirectiveExecutor", b64.l("Failed to present web directive ", name, " with binary payload: ", hnjVar.a()));
        }
        nfh nfhVar = quf0Var.a;
        String name2 = tDirective.getName();
        bnj bnjVar = (bnj) nfhVar.a;
        if (!bnjVar.m().contains(new dnj(name2))) {
            syj0Var = ((yv) ((cot) nfhVar.b).b).a(new mo(tDirective.encode()));
            syj0Var.getClass();
            if (!(syj0Var instanceof lyj0)) {
                if (syj0Var instanceof jyj0) {
                    syj0Var = new jyj0(new xmj(((jhg0) ((jyj0) syj0Var).a).b));
                } else {
                    w511.b();
                    syj0Var = null;
                }
            }
            if (syj0Var instanceof jyj0) {
            }
            if (jyj0Var != null) {
            }
            return zy11Var;
        }
        syj0 a5 = com.yandex.quark.platform.utils.directive.a.a(tDirective, (gcx) nfhVar.c);
        if (a5 instanceof lyj0) {
            bnjVar.h(new smj(name2, (gnj) ((lyj0) a5).a));
            syj0Var = q5z.N();
        } else if (a5 instanceof jyj0) {
            syj0Var = new jyj0(new xmj(((wmj) ((jyj0) a5).a).a()));
        } else {
            w511.b();
            syj0Var = null;
        }
        if (syj0Var instanceof jyj0) {
        }
        if (jyj0Var != null) {
        }
        return zy11Var;
    }
}
