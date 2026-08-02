package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final /* synthetic */ class p3a1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public p3a1(j jVar, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.c = atomicReference;
        this.w = str;
        this.x = str2;
        this.b = z;
        Objects.requireNonNull(jVar);
        this.y = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                ((CloudMessagingReceiver) obj).zza((Intent) obj4, (Context) obj3, this.b, (BroadcastReceiver.PendingResult) obj2);
                break;
            default:
                j5b1 j = ((g) ((j) obj2).b).j();
                j.Gg();
                j.Hg();
                j.Ug(new hx61(j, (AtomicReference) obj, (String) obj4, (String) obj3, j.Wg(false), this.b));
                break;
        }
    }

    public /* synthetic */ p3a1(CloudMessagingReceiver cloudMessagingReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.c = cloudMessagingReceiver;
        this.w = intent;
        this.x = context;
        this.b = z;
        this.y = pendingResult;
    }
}
