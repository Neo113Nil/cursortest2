package xsna;

import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ddz;
import xsna.mcz;

/* compiled from: LinkViewHolder.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class wcz extends FunctionReferenceImpl implements izs<ddz.b, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(ddz.b bVar) {
        ddz.b bVar2 = bVar;
        zcz zczVar = (zcz) this.receiver;
        io.reactivex.rxjava3.subjects.f<mcz> fVar = zczVar.e;
        if (bVar2 instanceof ddz.b.a) {
            zczVar.a();
            ddz.b.a aVar = (ddz.b.a) bVar2;
            zczVar.d(zk70.a(aVar.a).h());
            if (!epx.f(aVar.b, "InvalidateLink")) {
                fVar.onNext(mcz.b.a);
            }
        } else if (epx.f(bVar2, ddz.b.C2724b.a)) {
            zczVar.c();
        } else if (bVar2 instanceof ddz.b.c) {
            if (!((ddz.b.c) bVar2).a) {
                zczVar.a();
                fVar.onNext(mcz.b.a);
            }
        } else {
            if (!(bVar2 instanceof ddz.b.d)) {
                throw new NoWhenBranchMatchedException();
            }
            zczVar.a();
            ddz.b.d dVar = (ddz.b.d) bVar2;
            String str = dVar.a;
            zczVar.q = str;
            TextView textView = zczVar.l;
            if (textView != null) {
                textView.setText(str);
            }
            if (epx.f(dVar.b, "InvalidateLink")) {
                zczVar.d(R.string.voip_call_permissions_update_call_link_done);
            }
        }
        return s3q0.a;
    }
}
