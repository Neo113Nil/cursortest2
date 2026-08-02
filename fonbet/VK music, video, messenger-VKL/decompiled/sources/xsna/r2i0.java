package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class r2i0 implements izs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Intent d;
    public final /* synthetic */ int e;

    public /* synthetic */ r2i0(Context context, int i, Intent intent, int i2) {
        this.b = context;
        this.c = i;
        this.d = intent;
        this.e = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.e;
        boolean z = (33554432 & i) != 0;
        int i2 = Build.VERSION.SDK_INT;
        Intent intent = this.d;
        if (i2 >= 34 && nax.a(intent) && z) {
            i |= C.DEFAULT_MUXED_BUFFER_SIZE;
        }
        return PendingIntent.getBroadcast(this.b, this.c, intent, i);
    }
}
