package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.j;
import androidx.compose.foundation.text.contextmenu.provider.a;
import androidx.compose.runtime.f;
import defpackage.aii0;
import defpackage.aly0;
import defpackage.bts;
import defpackage.dms;
import defpackage.fid;
import defpackage.ily0;
import defpackage.je5;
import defpackage.oz40;
import defpackage.sls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes10.dex */
public final class a implements ily0 {
    public final dms a;
    public final j b = new j();
    public final oz40 c = f.j(null);

    public a(dms dmsVar) {
        this.a = dmsVar;
    }

    @Override // defpackage.ily0
    public final Object a(aly0 aly0Var, SuspendLambda suspendLambda) {
        Object b = this.b.b(MutatePriority.Default, new BasicTextContextMenuProvider$showTextContextMenu$2(this, new je5(aly0Var), null), suspendLambda);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }

    public final void b(final sls slsVar, fid fidVar, final int i) {
        final sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(723898654);
        int i2 = (btsVar.k(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            je5 je5Var = (je5) this.c.getValue();
            if (je5Var == null) {
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new wls(this, slsVar, i, i3) { // from class: ie5
                        public final /* synthetic */ int a;
                        public final /* synthetic */ a b;
                        public final /* synthetic */ sls c;

                        {
                            this.a = i3;
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            zy11 zy11Var = zy11.a;
                            sls slsVar3 = this.c;
                            a aVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    aVar.b(slsVar3, fidVar2, vng.O(7));
                                    break;
                                default:
                                    aVar.b(slsVar3, fidVar2, vng.O(7));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            slsVar2 = slsVar;
            this.a.invoke(je5Var, je5Var.a, slsVar2, btsVar, 384);
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new wls(this, slsVar2, i, i4) { // from class: ie5
                public final /* synthetic */ int a;
                public final /* synthetic */ a b;
                public final /* synthetic */ sls c;

                {
                    this.a = i4;
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.a;
                    zy11 zy11Var = zy11.a;
                    sls slsVar3 = this.c;
                    a aVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            aVar.b(slsVar3, fidVar2, vng.O(7));
                            break;
                        default:
                            aVar.b(slsVar3, fidVar2, vng.O(7));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }
}
