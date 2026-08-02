package defpackage;

import com.yandex.go.eboks.objects.ui.EboksObjectsOverlayPresenter$attachView$$inlined$safeCollectIn$1;
import com.yandex.go.eboks.objects.ui.EboksObjectsUiActionInteractor$listenUiAction$$inlined$flatMapLatest$1;
import com.yandex.go.eboks.objects.ui.EboksObjectsUiActionInteractor$listenUiAction$$inlined$withPreviousEmit$1;
import com.yandex.go.eboks.objects.ui.a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.j0;

/* loaded from: classes12.dex */
public final class khn extends h55 {
    public final /* synthetic */ int D;
    public final h3y E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ khn(h3y h3yVar, int i) {
        super(null);
        this.D = i;
        this.E = h3yVar;
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        switch (this.D) {
            case 0:
                yhn yhnVar = (yhn) this.E.get();
                a aVar = yhnVar.x;
                xhn xhnVar = new xhn(yhnVar);
                aVar.Bg(xhnVar);
                vin vinVar = aVar.y;
                g X = e.X(new mth(new j0(null, vinVar.e.c(), new EboksObjectsUiActionInteractor$listenUiAction$$inlined$withPreviousEmit$1(3, null)), 6), new EboksObjectsUiActionInteractor$listenUiAction$$inlined$flatMapLatest$1(null, vinVar));
                vinVar.a.getClass();
                tje.N(aVar.Jg(), null, null, new EboksObjectsOverlayPresenter$attachView$$inlined$safeCollectIn$1(e.F(X, uyj.a), null, xhnVar), 3);
                ((gh00) ((ah00) yhnVar.b)).e(yhnVar.C);
                break;
        }
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        switch (this.D) {
            case 0:
                yhn yhnVar = (yhn) this.E.get();
                yhnVar.x.Cg();
                ((gh00) ((ah00) yhnVar.b)).u(yhnVar.C);
                hz40 hz40Var = yhnVar.z;
                Object[] objArr = hz40Var.c;
                long[] jArr = hz40Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ((xm00) objArr[(i << 3) + i3]).d();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                            }
                        }
                        if (i != length) {
                            i++;
                        }
                    }
                }
                hz40Var.h();
                yhnVar.A.h();
                yhnVar.y.clear();
                break;
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.D) {
            case 1:
                ((hcc0) ((gcc0) this.E.get())).a();
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        switch (this.D) {
            case 1:
                h3y h3yVar = this.E;
                ((hcc0) ((gcc0) h3yVar.get())).a();
                ((hcc0) ((gcc0) h3yVar.get())).b((xl80) obj, new r75(2, this));
                break;
        }
    }
}
