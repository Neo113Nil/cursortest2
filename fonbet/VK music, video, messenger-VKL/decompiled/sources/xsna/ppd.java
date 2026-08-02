package xsna;

import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.tile.VkTile;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.co20;
import xsna.mbf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ppd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ppd(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkTile.f aVar;
        float f;
        int i = this.b;
        Size size = null;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(new mbf.b.C3332b((zoa) obj));
                return s3q0.a;
            case 1:
                ((Integer) obj).intValue();
                if (izsVar != null) {
                    izsVar.invoke(null);
                }
                return s3q0.a;
            default:
                VkTile vkTile = (VkTile) obj;
                izsVar.invoke(vkTile);
                co20 co20Var = co20.a;
                vkTile.setSelected(co20.n());
                int i2 = 0;
                vkTile.setMinimumWidth(0);
                kg50 kg50Var = co20.p;
                kg50 kg50Var2 = co20.m;
                int i3 = co20.e.$EnumSwitchMapping$2[co20.k().ordinal()];
                if (i3 == 1) {
                    Size size2 = null;
                    c.b bVar = new c.b(new gko(co20.m((co20.c) ((zak0) co20.i).getValue())));
                    odu0 odu0Var = new odu0();
                    co20.b l = co20.l();
                    int[] iArr = co20.e.$EnumSwitchMapping$0;
                    int i4 = iArr[l.ordinal()];
                    if (i4 == 1) {
                        vak0 vak0Var = (vak0) kg50Var2;
                        size2 = new Size((int) hbh0.a(vkTile.getContext(), vak0Var.getFloatValue()), (int) hbh0.a(vkTile.getContext(), vak0Var.getFloatValue()));
                    } else if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i5 = iArr[co20.l().ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = (int) hbh0.a(vkTile.getContext(), ((vak0) kg50Var).getFloatValue());
                    }
                    aVar = new VkTile.f.a(bVar, size2, odu0Var, null, i2, 20);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c.b bVar2 = new c.b(new gko(co20.m((co20.c) ((zak0) co20.i).getValue())));
                    co20.b l2 = co20.l();
                    int[] iArr2 = co20.e.$EnumSwitchMapping$0;
                    int i6 = iArr2[l2.ordinal()];
                    if (i6 == 1) {
                        size = new Size((int) hbh0.a(vkTile.getContext(), ((vak0) kg50Var2).getFloatValue()), (int) hbh0.a(vkTile.getContext(), ((vak0) co20.n).getFloatValue()));
                    } else if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i7 = iArr2[co20.l().ordinal()];
                    if (i7 == 1) {
                        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else {
                        if (i7 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f = ((vak0) co20.o).getFloatValue();
                    }
                    float f2 = f;
                    int i8 = iArr2[co20.l().ordinal()];
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = (int) hbh0.a(vkTile.getContext(), ((vak0) kg50Var).getFloatValue());
                    }
                    aVar = new VkTile.f.b(bVar2, size, f2, null, i2, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                }
                vkTile.setVisualContent(aVar);
                vkTile.setRemovable(((Boolean) ((zak0) co20.j).getValue()).booleanValue());
                vkTile.setSelected(co20.n());
                return s3q0.a;
        }
    }
}
