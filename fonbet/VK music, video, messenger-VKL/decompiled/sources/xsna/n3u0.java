package xsna;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: ViewerScreen.java */
/* loaded from: classes15.dex */
public final class n3u0 extends OrientationEventListener {
    public final /* synthetic */ zlw a;
    public final /* synthetic */ r4p b;
    public final /* synthetic */ com.vk.attachpicker.screen.s c;
    public final /* synthetic */ j34 d;
    public final /* synthetic */ com.vk.attachpicker.screen.p e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3u0(com.vk.attachpicker.screen.p pVar, Context context, zlw zlwVar, r4p r4pVar, com.vk.attachpicker.screen.s sVar, j34 j34Var) {
        super(context);
        this.e = pVar;
        this.a = zlwVar;
        this.b = r4pVar;
        this.c = sVar;
        this.d = j34Var;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        disable();
        this.e.b.post(new sv6(this, this.a, this.b, this.c, this.d));
    }
}
