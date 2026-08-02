package xsna;

import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j1w implements izs {
    public final /* synthetic */ long b;

    public /* synthetic */ j1w(long j) {
        this.b = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        wpp<Long, Dialog> wppVar = ((r480) obj).c;
        return (Dialog) wppVar.c.get(Long.valueOf(this.b));
    }
}
