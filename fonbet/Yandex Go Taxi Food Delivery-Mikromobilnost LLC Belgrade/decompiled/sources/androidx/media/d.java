package androidx.media;

import android.support.v4.os.ResultReceiver;
import defpackage.eb10;

/* loaded from: classes10.dex */
public final class d extends eb10 {
    public final /* synthetic */ ResultReceiver e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, ResultReceiver resultReceiver) {
        super(str);
        this.e = resultReceiver;
    }

    @Override // defpackage.eb10
    public final void c() {
        this.e.send(-1, null);
    }
}
