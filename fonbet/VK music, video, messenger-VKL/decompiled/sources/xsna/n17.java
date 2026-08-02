package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n17 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n17(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                x17 x17Var = (x17) this.c;
                sg50 sg50Var = (sg50) this.d;
                i0k0 i0k0Var = (i0k0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1288556368, intValue, -1, "com.vk.music.stickyplayer.presentation.components.SliderPanel.<anonymous> (BigPlayerSeekbar.kt:187)");
                    }
                    w17.c(x17Var, sg50Var, i0k0Var, aVar, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                List list = (List) this.c;
                izs izsVar = (izs) this.d;
                vtu vtuVar = (vtu) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(986749187, intValue2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.PlacePickerEntryPointCell.<anonymous> (PlacePickerEntryPointCell.kt:74)");
                    }
                    aVar2.K(-921802256);
                    Iterator it = list.iterator();
                    int i = 0;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        q630.a aVar3 = q630.a.a;
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (hasNext) {
                            Object next = it.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                e43.t();
                                throw null;
                            }
                            qqa0 qqa0Var = (qqa0) next;
                            String str = qqa0Var.a;
                            boolean o = aVar2.o(i);
                            Object x = aVar2.x();
                            if (o || x == c0012a) {
                                x = new eh4(i, 3);
                                aVar2.R(x);
                            }
                            q630 b = egi0.b(aVar3, true, (izs) x);
                            boolean J = aVar2.J(izsVar) | aVar2.J(qqa0Var) | aVar2.y(vtuVar);
                            Object x2 = aVar2.x();
                            if (J || x2 == c0012a) {
                                x2 = new defpackage.c0(izsVar, qqa0Var, vtuVar, 6);
                                aVar2.R(x2);
                            }
                            k2r.b(0, aVar2, str, (gzs) x2, b);
                            i = i2;
                        } else {
                            aVar2.j();
                            String N = d370.N(R.string.posting_step2_place_search, 0, aVar2);
                            boolean J2 = aVar2.J(list);
                            Object x3 = aVar2.x();
                            if (J2 || x3 == c0012a) {
                                x3 = new zl20(list, 15);
                                aVar2.R(x3);
                            }
                            q630 b2 = egi0.b(aVar3, true, (izs) x3);
                            boolean J3 = aVar2.J(izsVar);
                            Object x4 = aVar2.x();
                            if (J3 || x4 == c0012a) {
                                x4 = new lv7(izsVar, 6);
                                aVar2.R(x4);
                            }
                            k2r.b(0, aVar2, N, (gzs) x4, b2);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        }
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }
}
