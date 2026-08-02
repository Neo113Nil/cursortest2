package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;

/* compiled from: ClipsGridSubscriptionHelper.kt */
/* loaded from: classes17.dex */
public final class pee {
    public final o0r0 a;

    public pee(o0r0 o0r0Var) {
        this.a = o0r0Var;
    }

    public final void a(Context context, ClipsGridHeaderEntry.Author author, izs<? super ClipsGridHeaderEntry.Author, s3q0> izsVar) {
        UserId userId = author.a;
        if (userId.b < 0 && author.d) {
            e4h.l(this.a.h0(), context, author.a, new oee(this, author, context, izsVar, 0), null, 24);
            return;
        }
        io.reactivex.rxjava3.disposables.c subscribe = bug0.d(o0r0.i(this.a, userId, author.d, null, false, "clips", 36).a0(io.reactivex.rxjava3.android.schedulers.a.b()), context, null, 6).subscribe(new kl6(new az2(7, (Object) author, (izs) izsVar), 5));
        Context b = gnj.b(context);
        if (b == null) {
            b = context;
        }
        ver0.c(b, subscribe);
    }
}
