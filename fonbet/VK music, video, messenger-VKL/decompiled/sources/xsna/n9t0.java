package xsna;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.vmoji.character.VmojiCharacterFragment;
import com.vk.voip.api.id.CallId;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c9t0;
import xsna.e6w0;
import xsna.mox0;
import xsna.qtk0;
import xsna.spw0;
import xsna.tra0;
import xsna.tww0;
import xsna.zh8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class n9t0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n9t0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                c9t0 c9t0Var = (c9t0) obj;
                ((o9t0) obj2).getClass();
                if (c9t0Var instanceof c9t0.a) {
                    return new u8t0(((c9t0.a) c9t0Var).e);
                }
                if (!(c9t0Var instanceof c9t0.e)) {
                    if (c9t0Var instanceof c9t0.c) {
                        return new u8t0(false);
                    }
                    if (c9t0Var instanceof c9t0.d) {
                        return new u8t0(false);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c9t0.e eVar = (c9t0.e) c9t0Var;
                qtk0<List<u490>> qtk0Var = eVar.d;
                if (qtk0Var instanceof qtk0.b) {
                    return new u8t0(false);
                }
                if (qtk0Var instanceof qtk0.a) {
                    return new u8t0(eVar.k);
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                ((tra0.a) obj).q((tra0) obj2, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 2:
                ((VmojiCharacterFragment.c) obj2).invoke(e6w0.o.b);
                return s3q0.a;
            case 3:
                return mjw0.e((mjw0) obj2);
            case 4:
                akw0 akw0Var = (akw0) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ViewGroup viewGroup = akw0Var.d;
                ViewParent parent = viewGroup.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 == null) {
                    viewGroup2 = viewGroup;
                }
                mk5 mk5Var = new mk5();
                mk5Var.g(0);
                zmp0.a(viewGroup2, mk5Var);
                bwt0.p0(viewGroup, booleanValue);
                if (booleanValue) {
                    yh8 yh8Var = new yh8(akw0Var.a);
                    ViewGroup viewGroup3 = yh8Var.a;
                    viewGroup.addView(viewGroup3);
                    io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.i0(akw0Var.c.c().a0(asu0.a.d()).U(new cyh0(new jz30(akw0Var), 9)), new d810(new n1g0(15), 17)).subscribe(new eeh0(new ukv0(yh8Var, 4), 19));
                    io.reactivex.rxjava3.disposables.b bVar = akw0Var.h;
                    bVar.b(subscribe);
                    yh8Var.a();
                    xx40 xx40Var = new xx40(new n9m0(akw0Var, 25), 20);
                    io.reactivex.rxjava3.subjects.f<zh8> fVar = yh8Var.p;
                    int i2 = 23;
                    int i3 = 3;
                    bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar.U(xx40Var), new uxb0(new ow60(i2), 18)).subscribe(new k5j0(new whw0(akw0Var, i3), i2)));
                    yh8Var.a();
                    int i4 = 2;
                    bVar.b(fVar.b0(zh8.b.class).subscribe(new onm0(new biw0(akw0Var, i4), 14)));
                    yh8Var.a();
                    bVar.b(fVar.b0(zh8.c.class).subscribe(new vks0(new mdm0(akw0Var, 28), i3)));
                    r0u0.a(viewGroup3, new v1g(akw0Var, i4));
                    akw0Var.f = yh8Var;
                } else {
                    akw0Var.a();
                }
                return s3q0.a;
            case 5:
                ((kpw0) obj2).T((spw0.d.b) obj);
                return s3q0.a;
            case 6:
                int i5 = qtw0.l1;
                ((qtw0) obj2).getFeature().C((ptw0) obj);
                return s3q0.a;
            case 7:
                ((pww0) obj2).T(tww0.l.b.b);
                return s3q0.a;
            case 8:
                w5w0 w5w0Var = (w5w0) obj2;
                String str = new String((byte[]) obj, emb.b);
                com.vk.voip.ui.c.b.getClass();
                CallId b = com.vk.voip.ui.c.r.b();
                if (b == null) {
                    b = CallId.e;
                }
                return new s5x0(b, str, w5w0Var.getWidth(), w5w0Var.getHeight(), true);
            default:
                hox0 hox0Var = (hox0) obj2;
                mox0.a.AbstractC3359a abstractC3359a = (mox0.a.AbstractC3359a) obj;
                if (abstractC3359a instanceof mox0.a.AbstractC3359a.b) {
                    ArrayList arrayList = ((mox0.a.AbstractC3359a.b) abstractC3359a).a;
                    rnx0 rnx0Var = hox0Var.j;
                    if (rnx0Var == null) {
                        rnx0Var = null;
                    }
                    rnx0Var.setItems(arrayList);
                    RecyclerView recyclerView = hox0Var.i;
                    (recyclerView != null ? recyclerView : null).suppressLayout(true);
                } else {
                    if (!(abstractC3359a instanceof mox0.a.AbstractC3359a.C3360a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ArrayList arrayList2 = ((mox0.a.AbstractC3359a.C3360a) abstractC3359a).a;
                    rnx0 rnx0Var2 = hox0Var.j;
                    if (rnx0Var2 == null) {
                        rnx0Var2 = null;
                    }
                    rnx0Var2.setItems(arrayList2);
                    RecyclerView recyclerView2 = hox0Var.i;
                    (recyclerView2 != null ? recyclerView2 : null).suppressLayout(false);
                }
                return s3q0.a;
        }
    }
}
