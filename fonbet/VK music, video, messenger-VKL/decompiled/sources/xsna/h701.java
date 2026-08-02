package xsna;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Iterator;
import java.util.List;
import xsna.f5o0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class h701 {
    public final o100 a;
    public final String b;

    @Nullable
    public h001 c;
    public final List d;

    public h701(String str) {
        o0a.b(str);
        this.b = str;
        this.a = new o100("MediaControlChannel", null);
        this.d = dez0.b();
    }

    public final void a(yzz0 yzz0Var) {
        this.d.add(yzz0Var);
    }

    public final void b(final long j, String str) throws IllegalStateException {
        Object[] objArr = {str, null};
        o100 o100Var = this.a;
        o100Var.getClass();
        String str2 = o100Var.a;
        if (!Build.TYPE.equals("user") && o100Var.b && Log.isLoggable(str2, 2)) {
            o100Var.c("Sending text message: %s to: %s", objArr);
        }
        final h001 h001Var = this.c;
        if (h001Var == null) {
            Log.e(str2, o100Var.c("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        ho01 ho01Var = h001Var.a;
        if (ho01Var == null) {
            throw new IllegalStateException("Device is not connected");
        }
        a401 a401Var = (a401) ho01Var;
        String str3 = this.b;
        o0a.b(str3);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str.length() > 524288) {
            a401.w.c("Message send failed. Message exceeds maximum size", new Object[0]);
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        f5o0.a a = f5o0.a();
        a.a = new rvu(a401Var, str3, str);
        a.e = 8405;
        a401Var.doWrite(a.a()).addOnFailureListener(new OnFailureListener() { // from class: xsna.f001
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                int g = exc instanceof ApiException ? ((ApiException) exc).g() : 13;
                Iterator it = h001.this.c.c.d.iterator();
                while (it.hasNext()) {
                    ((yzz0) it.next()).d(j, g, null);
                }
            }
        });
    }

    public final long c() {
        h001 h001Var = this.c;
        if (h001Var != null) {
            return h001Var.b.getAndIncrement();
        }
        o100 o100Var = this.a;
        Log.e(o100Var.a, o100Var.c("Attempt to generate requestId without a sink", new Object[0]));
        return 0L;
    }
}
