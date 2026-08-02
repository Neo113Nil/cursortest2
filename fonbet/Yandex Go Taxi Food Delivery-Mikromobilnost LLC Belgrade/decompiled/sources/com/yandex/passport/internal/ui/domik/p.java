package com.yandex.passport.internal.ui.domik;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.ui.domik.relogin.ReloginFragment;
import com.yandex.passport.internal.ui.social.SocialFragment;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Callable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ q b;
    public final /* synthetic */ ModernAccount c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;

    public /* synthetic */ p(q qVar, SocialConfiguration socialConfiguration, boolean z, ModernAccount modernAccount) {
        this.b = qVar;
        this.x = socialConfiguration;
        this.w = z;
        this.c = modernAccount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (r8 != false) goto L21;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        boolean booleanValue;
        int i = this.a;
        boolean z = this.w;
        boolean z2 = true;
        ModernAccount modernAccount = this.c;
        Object obj = this.x;
        q qVar = this.b;
        switch (i) {
            case 0:
                SocialConfiguration socialConfiguration = (SocialConfiguration) obj;
                com.yandex.passport.internal.ui.social.n nVar = SocialFragment.Companion;
                AuthTrack b = c.b(AuthTrack.Companion, qVar.c);
                if (z) {
                    com.yandex.passport.internal.flags.j jVar = qVar.b;
                    int i2 = com.yandex.passport.internal.flags.k.a[socialConfiguration.getProviderCode().ordinal()];
                    if (i2 == 1) {
                        booleanValue = ((Boolean) jVar.b(com.yandex.passport.internal.flags.q.n)).booleanValue();
                        break;
                    } else if (i2 == 2) {
                        booleanValue = ((Boolean) jVar.b(com.yandex.passport.internal.flags.q.m)).booleanValue();
                        break;
                    } else if (i2 == 3) {
                        booleanValue = ((Boolean) jVar.b(com.yandex.passport.internal.flags.q.l)).booleanValue();
                        break;
                    } else {
                        booleanValue = true;
                        break;
                    }
                }
                z2 = false;
                nVar.getClass();
                return com.yandex.passport.internal.ui.social.n.a(b, socialConfiguration, z2, modernAccount);
            default:
                return ReloginFragment.newInstance(c.b(AuthTrack.Companion, qVar.c).withLogin((String) obj, false).withRelogin(modernAccount).withAllowMagicLink(true), z);
        }
    }

    public /* synthetic */ p(q qVar, String str, ModernAccount modernAccount, boolean z) {
        this.b = qVar;
        this.x = str;
        this.c = modernAccount;
        this.w = z;
    }
}
