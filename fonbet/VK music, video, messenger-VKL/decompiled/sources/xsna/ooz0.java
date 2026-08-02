package xsna;

import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class ooz0 extends roz0 {
    public final /* synthetic */ Intent b;
    public final /* synthetic */ t4z c;

    public ooz0(Intent intent, t4z t4zVar) {
        this.b = intent;
        this.c = t4zVar;
    }

    @Override // xsna.roz0
    public final void a() {
        Intent intent = this.b;
        if (intent != null) {
            this.c.startActivityForResult(intent, 2);
        }
    }
}
