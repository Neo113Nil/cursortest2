package xsna;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class hoz0 extends roz0 {
    public final /* synthetic */ Intent b;
    public final /* synthetic */ GoogleApiActivity c;

    public hoz0(Intent intent, GoogleApiActivity googleApiActivity) {
        this.b = intent;
        this.c = googleApiActivity;
    }

    @Override // xsna.roz0
    public final void a() {
        Intent intent = this.b;
        if (intent != null) {
            this.c.startActivityForResult(intent, 2);
        }
    }
}
