package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.abe;
import defpackage.am2;
import defpackage.ftn;
import defpackage.gtn;
import defpackage.j45;
import defpackage.pey;
import defpackage.xwv;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public class EmojiCompatInitializer implements xwv {
    @Override // defpackage.xwv
    public final Object create(Context context) {
        gtn gtnVar = new gtn(new abe(context, 5));
        gtnVar.e = 1;
        ftn.d(gtnVar);
        Lifecycle lifecycle = ((pey) am2.j(context).l()).getLifecycle();
        lifecycle.a(new j45(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // defpackage.xwv
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
