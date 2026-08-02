package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: EdgeToEdge.kt */
/* loaded from: classes11.dex */
public final class kyo extends View {
    public final /* synthetic */ jyo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyo(jyo jyoVar, Context context) {
        super(context);
        this.b = jyoVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        this.b.run();
    }
}
