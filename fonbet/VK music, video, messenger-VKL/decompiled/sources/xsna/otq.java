package xsna;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: FcmBroadcastProcessor.java */
/* loaded from: classes13.dex */
public final class otq {
    public static final Object c = new Object();
    public static nux0 d;
    public final Context a;
    public final ddk b = new ddk();

    public otq(Context context) {
        this.a = context;
    }

    public static Task<Integer> a(Context context, final Intent intent, boolean z) {
        nux0 nux0Var;
        synchronized (c) {
            try {
                if (d == null) {
                    d = new nux0(context);
                }
                nux0Var = d;
            } finally {
            }
        }
        if (!z) {
            return nux0Var.m(intent).continueWith(new ddk(), new io.reactivex.rxjava3.internal.operators.observable.q1(23));
        }
        if (kri0.a().c(context)) {
            synchronized (v8x0.b) {
                try {
                    v8x0.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        v8x0.c.a(v8x0.a);
                    }
                    nux0Var.m(intent).addOnCompleteListener(new OnCompleteListener() { // from class: xsna.n8x0
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
                            v8x0.b(intent);
                        }
                    });
                } finally {
                }
            }
        } else {
            nux0Var.m(intent);
        }
        return Tasks.forResult(-1);
    }

    public final Task<Integer> b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.a;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return a(context, intent, z2);
        }
        mtq mtqVar = new mtq(0, context, intent);
        ddk ddkVar = this.b;
        return Tasks.call(ddkVar, mtqVar).continueWithTask(ddkVar, new Continuation() { // from class: xsna.ntq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return ((Integer) task.getResult()).intValue() != 402 ? task : otq.a(context, intent, z2).continueWith(new ddk(), new en(21));
            }
        });
    }
}
