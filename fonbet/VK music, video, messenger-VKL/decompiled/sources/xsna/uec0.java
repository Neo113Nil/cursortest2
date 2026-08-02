package xsna;

import android.content.Context;
import android.content.Intent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uec0 implements io.reactivex.rxjava3.functions.a {
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        Intent putExtra = new Intent("draft").putExtra("type", "draftRemoved");
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        cuz.a(context).c(putExtra);
    }
}
