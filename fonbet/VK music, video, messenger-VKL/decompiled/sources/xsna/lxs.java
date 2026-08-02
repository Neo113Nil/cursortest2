package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.compose.component.defaults.UserStackSize;
import com.vk.fullscreenvideo.ControlsState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ikv0;
import xsna.trc0;
import xsna.xcc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lxs implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lxs(ControlsState.a aVar, gzs gzsVar, q630 q630Var, izs izsVar, int i) {
        this.b = 0;
        this.c = aVar;
        this.d = gzsVar;
        this.e = q630Var;
        this.f = izsVar;
    }

    /* JADX WARN: Type inference failed for: r8v21, types: [T, xsna.ikv0] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                qxs.a((ControlsState.a) this.c, (gzs) this.d, (q630) this.e, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
            case 1:
                d64 d64Var = (d64) this.c;
                d64 d64Var2 = (d64) this.d;
                d64 d64Var3 = (d64) this.e;
                d64 d64Var4 = (d64) this.f;
                rj50 rj50Var = (rj50) obj;
                trc0 trc0Var = (trc0) obj2;
                if (trc0Var instanceof trc0.d) {
                    return rj50Var.a(d64Var, trc0Var);
                }
                if (trc0Var instanceof trc0.b) {
                    return rj50Var.a(d64Var2, trc0Var);
                }
                if (trc0Var instanceof trc0.a) {
                    return rj50Var.a(d64Var3, trc0Var);
                }
                if (trc0Var instanceof trc0.c) {
                    return rj50Var.a(d64Var4, trc0Var);
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                ArrayList arrayList = (ArrayList) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                e8j0 e8j0Var = (e8j0) this.e;
                View view = (View) this.f;
                arrayList.add((izs) obj2);
                Context context = e8j0Var.i1;
                ikv0.a aVar = new ikv0.a(bwt0.u(context));
                aVar.u = new ikv0.d(context.getString(h03.a((Throwable) obj) ? R.string.network_error : R.string.download_error), (String) null, (ikv0.d.a) null, 6);
                aVar.e = -1L;
                aVar.l = 80;
                aVar.o = Integer.valueOf(iah0.a(88));
                aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.viewer_retry), new fh1(22, arrayList, ref$ObjectRef));
                ref$ObjectRef.element = aVar.o((ViewGroup) view);
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                hyv0.e((q630) this.e, (UserStackSize) this.c, (xcc.a.AbstractC3993a) this.d, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
        }
    }

    public /* synthetic */ lxs(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ lxs(q630 q630Var, UserStackSize userStackSize, xcc.a.AbstractC3993a abstractC3993a, izs izsVar, int i) {
        this.b = 3;
        this.e = q630Var;
        this.c = userStackSize;
        this.d = abstractC3993a;
        this.f = izsVar;
    }
}
