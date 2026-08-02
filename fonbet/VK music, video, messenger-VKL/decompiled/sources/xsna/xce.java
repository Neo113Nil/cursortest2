package xsna;

import android.app.Activity;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vkontakte.android.R;
import java.util.List;
import xsna.gnd;
import xsna.idh0;
import xsna.tok0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class xce implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xce(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ClipsGridDraftsListFragment clipsGridDraftsListFragment = (ClipsGridDraftsListFragment) obj5;
                Activity activity = (Activity) obj4;
                tce tceVar = (tce) obj3;
                int i2 = ClipsGridDraftsListFragment.l0;
                dw20 dw20Var = clipsGridDraftsListFragment.i0;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                clipsGridDraftsListFragment.i0 = null;
                bfs0.c(activity, null, R.string.delete_draft_confirm, rdi.p(activity, new com.vk.movika.sdk.android.defaultplayer.interactive.a(clipsGridDraftsListFragment, 23)), new n0(10, clipsGridDraftsListFragment, tceVar.a));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(7);
                j2k.e(I, (androidx.compose.runtime.a) obj, (gzs) obj5, (gzs) obj4, (q630) obj3);
                break;
            case 2:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                ((Integer) obj2).getClass();
                int I2 = ne7.I(1);
                r6l.h(I2, aVar, (List) obj5, (izs) obj3, (wzs) obj4);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((vly) obj5).a((foj0) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 4:
                u890 u890Var = (u890) obj5;
                tok0.a aVar2 = (tok0.a) obj4;
                a.e eVar = (a.e) obj3;
                azl azlVar = (azl) obj;
                o6j o6jVar = (o6j) obj2;
                if (o6j.i(o6jVar.a) == Integer.MAX_VALUE) {
                    xzw.a("LazyVerticalStaggeredGrid's width should be bound by parent.");
                }
                LayoutDirection layoutDirection = LayoutDirection.Ltr;
                int i3 = o6j.i(o6jVar.a) - azlVar.r0(s200.r(u890Var, layoutDirection) + s200.s(u890Var, layoutDirection));
                int[] a = aVar2.a(azlVar, i3, azlVar.r0(eVar.a()));
                int[] iArr = new int[a.length];
                eVar.b(azlVar, i3, a, layoutDirection, iArr);
                break;
            case 5:
                ((Integer) obj2).getClass();
                de00.d((gnd.a) obj5, (izs) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ich0.d((idh0.a) obj5, (izs) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xce(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
