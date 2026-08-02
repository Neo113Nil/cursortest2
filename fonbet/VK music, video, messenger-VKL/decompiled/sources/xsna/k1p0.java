package xsna;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.vk.toggle.b;
import xsna.h1p0;

/* compiled from: TogglesAdapter.kt */
/* loaded from: classes6.dex */
public final class k1p0 implements wzs<DialogInterface, CharSequence, s3q0> {
    public final /* synthetic */ h1p0.f b;
    public final /* synthetic */ h1p0.e c;

    public k1p0(h1p0.f fVar, h1p0.e eVar) {
        this.b = fVar;
        this.c = eVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(DialogInterface dialogInterface, CharSequence charSequence) {
        DialogInterface dialogInterface2 = dialogInterface;
        CharSequence charSequence2 = charSequence;
        if (!TextUtils.isEmpty(charSequence2)) {
            String obj = charSequence2.toString();
            h1p0.e eVar = this.c;
            b.d dVar = eVar.b;
            dVar.c = obj;
            h1p0.f fVar = this.b;
            fVar.l.c(dVar);
            fVar.W5(eVar);
            fVar.m.a();
        }
        dialogInterface2.dismiss();
        return s3q0.a;
    }
}
