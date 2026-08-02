package defpackage;

import com.google.crypto.tink.internal.TinkBugException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class jz40 {
    public static final jz40 b = new jz40();
    public final AtomicReference a = new AtomicReference(new wsq0(new tsq0()));

    public final lhx a(yuf0 yuf0Var) {
        AtomicReference atomicReference = this.a;
        wsq0 wsq0Var = (wsq0) atomicReference.get();
        wsq0Var.getClass();
        u77 u77Var = (u77) yuf0Var.b;
        if (!wsq0Var.b.containsKey(new usq0(yuf0.class, u77Var))) {
            try {
                return new day(yuf0Var);
            } catch (GeneralSecurityException e) {
                throw new TinkBugException("Creating a LegacyProtoKey failed", e);
            }
        }
        wsq0 wsq0Var2 = (wsq0) atomicReference.get();
        wsq0Var2.getClass();
        usq0 usq0Var = new usq0(yuf0.class, u77Var);
        HashMap hashMap = wsq0Var2.b;
        if (hashMap.containsKey(usq0Var)) {
            return ((qix) hashMap.get(usq0Var)).b.a(yuf0Var);
        }
        yci0.u("No Key Parser for requested key type ", usq0Var, " available");
        return null;
    }

    public final synchronized void b(qix qixVar) {
        tsq0 tsq0Var = new tsq0((wsq0) this.a.get());
        qixVar.getClass();
        usq0 usq0Var = new usq0(yuf0.class, qixVar.a);
        HashMap hashMap = tsq0Var.b;
        if (hashMap.containsKey(usq0Var)) {
            qix qixVar2 = (qix) hashMap.get(usq0Var);
            if (!qixVar2.equals(qixVar) || qixVar != qixVar2) {
                yhl.g(usq0Var, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            hashMap.put(usq0Var, qixVar);
        }
        this.a.set(new wsq0(tsq0Var));
    }

    public final synchronized void c(bjx bjxVar) {
        tsq0 tsq0Var = new tsq0((wsq0) this.a.get());
        vsq0 vsq0Var = new vsq0(bjxVar.a, yuf0.class);
        HashMap hashMap = tsq0Var.a;
        if (hashMap.containsKey(vsq0Var)) {
            bjx bjxVar2 = (bjx) hashMap.get(vsq0Var);
            if (!bjxVar2.equals(bjxVar) || bjxVar != bjxVar2) {
                yhl.g(vsq0Var, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            hashMap.put(vsq0Var, bjxVar);
        }
        this.a.set(new wsq0(tsq0Var));
    }

    public final synchronized void d(ld90 ld90Var) {
        tsq0 tsq0Var = new tsq0((wsq0) this.a.get());
        ld90Var.getClass();
        usq0 usq0Var = new usq0(bvf0.class, ld90Var.a);
        HashMap hashMap = tsq0Var.d;
        if (hashMap.containsKey(usq0Var)) {
            ld90 ld90Var2 = (ld90) hashMap.get(usq0Var);
            if (!ld90Var2.equals(ld90Var) || ld90Var != ld90Var2) {
                yhl.g(usq0Var, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            hashMap.put(usq0Var, ld90Var);
        }
        this.a.set(new wsq0(tsq0Var));
    }

    public final synchronized void e(md90 md90Var) {
        tsq0 tsq0Var = new tsq0((wsq0) this.a.get());
        vsq0 vsq0Var = new vsq0(md90Var.a, bvf0.class);
        HashMap hashMap = tsq0Var.c;
        if (hashMap.containsKey(vsq0Var)) {
            md90 md90Var2 = (md90) hashMap.get(vsq0Var);
            if (!md90Var2.equals(md90Var) || md90Var != md90Var2) {
                yhl.g(vsq0Var, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            hashMap.put(vsq0Var, md90Var);
        }
        this.a.set(new wsq0(tsq0Var));
    }
}
