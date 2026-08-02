package defpackage;

import android.content.Context;
import com.ybsdk.feature.autotopup.internal.domain.c;
import com.ybsdk.feature.autotopup.internal.domain.e;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams;
import com.ybsdk.feature.autotopup.internal.presentation.result.b;

/* loaded from: classes3.dex */
public final class bz3 implements xy3 {
    public final w3i a;

    public bz3(w3i w3iVar) {
        this.a = w3iVar;
    }

    public final b a(AutoTopupResultParams autoTopupResultParams) {
        w3i w3iVar = this.a;
        return new b(autoTopupResultParams, (jw3) ((gwf) w3iVar.b).get(), (tfl0) ((gwf) w3iVar.c).get(), (ov3) ((gwf) w3iVar.w).get(), (l04) ((p4) w3iVar.x).get(), (Context) ((gwf) w3iVar.y).get(), (e) ((c4) w3iVar.z).get(), (c) ((p4) w3iVar.A).get(), (ez3) ((xvf0) w3iVar.B).get());
    }
}
