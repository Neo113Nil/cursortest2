package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.internal.LegacyExtraData;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.stash.Stash;

/* loaded from: classes8.dex */
public final class e {
    public final g a;
    public final n b;
    public final c0 c;
    public final com.yandex.passport.internal.flags.j d;
    public final com.yandex.passport.internal.network.mappers.h e;

    public e(g gVar, n nVar, c0 c0Var, com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.network.mappers.h hVar) {
        this.a = gVar;
        this.b = nVar;
        this.c = c0Var;
        this.d = jVar;
        this.e = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0060 A[Catch: all -> 0x0037, FailedToAddAccountException -> 0x003e, TRY_LEAVE, TryCatch #6 {FailedToAddAccountException -> 0x003e, all -> 0x0037, blocks: (B:18:0x002a, B:20:0x0030, B:23:0x0056, B:45:0x0060, B:47:0x0042), top: B:17:0x002a }] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.yandex.passport.internal.AccountRow] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ModernAccount a(ModernAccount modernAccount, com.yandex.passport.internal.analytics.m mVar, boolean z) {
        ModernAccount modernAccount2;
        ModernAccount b;
        Stash c;
        Stash stash;
        ModernAccount copy$default;
        ModernAccount modernAccount3;
        String str;
        String str2 = mVar.a;
        n nVar = this.b;
        com.yandex.passport.internal.b b2 = nVar.b(true);
        ModernAccount a = com.yandex.passport.common.permission.b.a(b2.a, null, modernAccount.getUid(), modernAccount.getAccountName(), b2.b);
        com.yandex.passport.internal.network.mappers.h hVar = this.e;
        c0 c0Var = this.c;
        g gVar = this.a;
        try {
            try {
                if (a != 0) {
                    try {
                        b = hVar.b(a);
                    } catch (FailedToAddAccountException unused) {
                        a = modernAccount;
                    } catch (Throwable th) {
                        th = th;
                        modernAccount2 = modernAccount;
                    }
                    try {
                        if (b != null) {
                            c = b.getStash();
                            if (c == null) {
                            }
                            String str3 = a.name;
                            stash = modernAccount.getStash();
                            if (stash != null) {
                                c = c.plus(stash);
                            }
                            copy$default = ModernAccount.copy$default(modernAccount, str3, null, null, null, null, c, 30, null);
                            modernAccount3 = modernAccount;
                            gVar.g(copy$default, mVar, z);
                            str = "update";
                            gVar.b(copy$default.getUid());
                        }
                        copy$default = ModernAccount.copy$default(modernAccount, str3, null, null, null, null, c, 30, null);
                        modernAccount3 = modernAccount;
                        gVar.g(copy$default, mVar, z);
                        str = "update";
                        gVar.b(copy$default.getUid());
                    } catch (FailedToAddAccountException unused2) {
                        a = modernAccount;
                        if (!((Boolean) this.d.b(com.yandex.passport.internal.flags.q.B)).booleanValue()) {
                            throw new FailedToAddAccountException();
                        }
                        gVar.f(hVar.a(a), a.getUid());
                        c0Var.h(a.getUid().getValue(), str2, "add_local_success");
                        return a;
                    } catch (Throwable th2) {
                        th = th2;
                        modernAccount2 = modernAccount;
                        c0Var.h(modernAccount2.getUid().getValue(), str2, "add_fail");
                        throw th;
                    }
                    com.yandex.passport.internal.stash.a aVar = Stash.Companion;
                    com.yandex.passport.internal.f fVar = LegacyExtraData.Companion;
                    String str4 = a.legacyExtraDataBody;
                    fVar.getClass();
                    LegacyExtraData f = com.yandex.passport.internal.f.f(str4);
                    aVar.getClass();
                    c = com.yandex.passport.internal.stash.a.c(f);
                    String str32 = a.name;
                    stash = modernAccount.getStash();
                    if (stash != null) {
                    }
                } else {
                    modernAccount3 = modernAccount;
                    if (!gVar.a(modernAccount3, mVar, z).b()) {
                        com.yandex.passport.internal.b b3 = nVar.b(true);
                        if (com.yandex.passport.common.permission.b.a(b3.a, null, modernAccount3.getUid(), modernAccount3.getAccountName(), b3.b) == null) {
                            throw new FailedToAddAccountException();
                        }
                    }
                    str = "add_success";
                    gVar.b(modernAccount3.getUid());
                    copy$default = modernAccount3;
                }
                c0Var.h(modernAccount3.getUid().getValue(), str2, str);
                return copy$default;
            } catch (Throwable th3) {
                th = th3;
                modernAccount2 = a;
            }
        } catch (FailedToAddAccountException unused3) {
        }
    }
}
