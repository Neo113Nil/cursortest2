package androidx.media;

import android.support.v4.os.ResultReceiver;
import defpackage.eb10;

/* loaded from: classes10.dex */
public final class e extends eb10 {
    public final /* synthetic */ ResultReceiver e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, ResultReceiver resultReceiver) {
        super(str);
        this.e = resultReceiver;
    }

    @Override // defpackage.eb10
    public final void b() {
        this.e.send(-1, null);
    }

    @Override // defpackage.eb10
    public final void c() {
        this.e.send(0, null);
    }
}
