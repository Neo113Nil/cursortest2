package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import defpackage.eb10;

/* loaded from: classes10.dex */
public final class c extends eb10 {
    public final /* synthetic */ ResultReceiver e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, ResultReceiver resultReceiver) {
        super(str);
        this.e = resultReceiver;
    }

    @Override // defpackage.eb10
    public final void c() {
        int i = this.d & 2;
        ResultReceiver resultReceiver = this.e;
        if (i != 0) {
            resultReceiver.send(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM, null);
        resultReceiver.send(0, bundle);
    }
}
