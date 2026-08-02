package xsna;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.vk.dto.common.id.UserId;
import xsna.h1p0;

/* compiled from: TogglesAdapter.kt */
/* loaded from: classes6.dex */
public final class i1p0 implements wzs<DialogInterface, CharSequence, s3q0> {
    public final /* synthetic */ h1p0.b b;

    public i1p0(h1p0.b bVar) {
        this.b = bVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(DialogInterface dialogInterface, CharSequence charSequence) {
        DialogInterface dialogInterface2 = dialogInterface;
        String obj = drm0.p0(charSequence.toString()).toString();
        if (TextUtils.isDigitsOnly(obj)) {
            h1p0.b bVar = this.b;
            d0r0 d0r0Var = bVar.l;
            UserId userId = new UserId(Long.parseLong(obj));
            d0r0Var.getClass();
            itg0.b(bVar.itemView, hg1.l(new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new uhk(d0r0Var, 2)), new k6c0(new q7a0(8, d0r0Var, userId), 10))).q(io.reactivex.rxjava3.schedulers.a.a()).o(io.reactivex.rxjava3.android.schedulers.a.b()), bVar.itemView.getContext(), 62).subscribe(new bum(bVar, 2), new fl30(new wo40(20), 28)));
            dialogInterface2.dismiss();
        } else {
            cvk.w("User id can only contains digits", false);
        }
        return s3q0.a;
    }
}
