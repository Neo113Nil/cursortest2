package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.zzcr;

/* loaded from: classes11.dex */
public final class ji91 extends gp91 {
    public final /* synthetic */ int x;
    public final /* synthetic */ e y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji91(e eVar, Object obj, int i) {
        super(eVar, true);
        this.x = i;
        this.z = obj;
        this.y = eVar;
    }

    @Override // defpackage.gp91
    public final void a() {
        switch (this.x) {
            case 0:
                zzcr zzcrVar = this.y.f;
                cvw.l(zzcrVar);
                zzcrVar.setUserProperty("fcm", "_ln", ObjectWrapper.wrap(this.z), true, this.a);
                break;
            case 1:
                zzcr zzcrVar2 = this.y.f;
                cvw.l(zzcrVar2);
                zzcrVar2.setConditionalUserProperty((Bundle) this.z, this.a);
                break;
            default:
                zzcr zzcrVar3 = this.y.f;
                cvw.l(zzcrVar3);
                zzcrVar3.setSgtmDebugInfo((Intent) this.z);
                break;
        }
    }
}
