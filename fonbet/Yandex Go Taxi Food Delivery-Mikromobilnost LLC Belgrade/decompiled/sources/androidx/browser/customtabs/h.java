package androidx.browser.customtabs;

import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;
import defpackage.nl3;
import defpackage.wlf;

/* loaded from: classes10.dex */
public final /* synthetic */ class h implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ CustomTabsService.AnonymousClass1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(CustomTabsService.AnonymousClass1 anonymousClass1, Object obj, int i) {
        this.a = i;
        this.b = anonymousClass1;
        this.c = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.a;
        Object obj = this.c;
        CustomTabsService.AnonymousClass1 anonymousClass1 = this.b;
        switch (i) {
            case 0:
                anonymousClass1.lambda$newSessionInternal$0((wlf) obj);
                break;
            default:
                anonymousClass1.lambda$newAuthTabSession$1((nl3) obj);
                break;
        }
    }
}
