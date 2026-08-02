package xsna;

import com.vk.api.external.exceptions.VKWebAuthException;
import com.vk.channels.impl.comments.f;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.ecomm.market.goodpreview.presentation.GoodPreviewFragment;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.mwa;
import xsna.pdg0;
import xsna.sdv;
import xsna.uxd0;
import xsna.xde;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class x8 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((w8) this.c).invoke(obj);
                break;
            case 1:
                ((r46) this.c).k(uxd0.q0.n.a);
                break;
            case 2:
                ((w8) this.c).invoke(obj);
                break;
            case 3:
                ((qd1) this.c).invoke(obj);
                break;
            case 4:
                ((w8) this.c).invoke(obj);
                break;
            case 5:
                ((com.vk.movika.sdk.base.observable.u) this.c).invoke(obj);
                break;
            case 6:
                ((w8) this.c).invoke(obj);
                break;
            case 7:
                ((qd1) this.c).invoke(obj);
                break;
            case 8:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) this.c;
                Pair pair = (Pair) obj;
                int intValue = ((Number) pair.d()).intValue();
                mwa.a aVar = (mwa.a) pair.g();
                f.d dVar = f.d.a;
                bVar.n(dVar);
                bVar.q(new m70(intValue, bVar, aVar));
                bVar.n(f.a.a);
                bVar.n(dVar);
                bVar.n(new f.e(intValue));
                bVar.w(intValue);
                break;
            case 9:
                ((w8) this.c).invoke(obj);
                break;
            case 10:
                ((sd4) this.c).invoke(obj);
                break;
            case 11:
                ((com.vk.movika.sdk.base.observable.u) this.c).invoke(obj);
                break;
            case 12:
                ((xde.a) this.c).invoke(obj);
                break;
            case 13:
                ((ffg) this.c).invoke(obj);
                break;
            case 14:
                ((mre) this.c).invoke(obj);
                break;
            case 15:
                ((frg) this.c).invoke(obj);
                break;
            case 16:
                ((frg) this.c).invoke(obj);
                break;
            case 17:
                psm psmVar = (psm) this.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Set) obj) {
                    Peer peer = (Peer) obj2;
                    peer.getClass();
                    if (peer.Ab(Peer.Type.USER)) {
                        arrayList.add(obj2);
                    }
                }
                pdg0 n = psmVar.m.n(psmVar, new b1r0(arrayList, Source.CACHE));
                Collection A = n instanceof pdg0.b ? rli0.A(new ulp0(rli0.j(rli0.m(new ulp0(new i5g(arrayList), new x2e(n, 10))), new f57(19)), new zj(26))) : EmptyList.b;
                if (!A.isEmpty()) {
                    psmVar.n.getClass();
                    qv20 qv20Var = qv20.c;
                    Collection collection = A;
                    ArrayList arrayList2 = new ArrayList(c5g.u(collection, 10));
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(com.vk.dto.common.a.b((Peer) it.next()));
                    }
                    a1w a1wVar = q1w.a;
                    if (a1wVar == null) {
                        a1wVar = null;
                    }
                    psmVar.u = di6.k(psmVar, new io.reactivex.rxjava3.internal.operators.completable.p(a1wVar.C(qv20Var, new mwt(arrayList2))).g(new tra(psmVar, 3)).q(psmVar.q), null, null, 3);
                    break;
                }
                break;
            case 18:
                ((frg) this.c).invoke(obj);
                break;
            case 19:
                ((qd1) this.c).invoke(obj);
                break;
            case 20:
                ((y89) this.c).invoke(obj);
                break;
            case 21:
                ((com.vk.movika.sdk.base.observable.u) this.c).invoke(obj);
                break;
            case 22:
                xcd xcdVar = (xcd) this.c;
                int i = GoodPreviewFragment.X;
                xcdVar.invoke(obj);
                break;
            case 23:
                ((qgu) this.c).invoke(obj);
                break;
            case 24:
                ((nmu) this.c).invoke(obj);
                break;
            case 25:
                ((sdv.c) this.c).invoke(obj);
                break;
            case 26:
                ((fo6) this.c).invoke(obj);
                break;
            case 27:
                ((frg) this.c).invoke(obj);
                break;
            case 28:
                v1y v1yVar = (v1y) this.c;
                Throwable th = (Throwable) obj;
                Throwable cause = th.getCause();
                if (cause instanceof VKWebAuthException) {
                    xgx0 xgx0Var = xgx0.a;
                    StringBuilder sb = new StringBuilder("auth error: ");
                    VKWebAuthException vKWebAuthException = (VKWebAuthException) cause;
                    sb.append(vKWebAuthException.d());
                    sb.append(' ');
                    sb.append(vKWebAuthException.g());
                    sb.append(' ');
                    sb.append(vKWebAuthException.h());
                    sb.append(' ');
                    sb.append(vKWebAuthException.i());
                    String sb2 = sb.toString();
                    xgx0Var.getClass();
                    xgx0.b(sb2);
                    v1yVar.A(JsApiMethodType.GET_AUTH_TOKEN, VkAppsErrors.c(vKWebAuthException.g(), vKWebAuthException.d(), vKWebAuthException.h()));
                    break;
                } else {
                    xgx0.a.getClass();
                    xgx0.b("auth error: " + th);
                    v1yVar.A(JsApiMethodType.GET_AUTH_TOKEN, VkAppsErrors.c("unknown_error", "", ""));
                    break;
                }
            default:
                ((frg) this.c).invoke(obj);
                break;
        }
    }
}
