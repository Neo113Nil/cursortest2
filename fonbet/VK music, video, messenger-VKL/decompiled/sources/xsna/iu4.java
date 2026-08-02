package xsna;

import com.vk.api.generated.audio.dto.AudioReactionsConfigDto;
import com.vk.catalog2.feature.music.configuration.b;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.dto.music.PlaylistLink;
import com.vk.superapp.multiaccount.api.f;
import com.vk.update.core.a;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import xsna.bfz;
import xsna.bzp0;
import xsna.ngl;
import xsna.ro90;
import xsna.ykb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class iu4 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.b, io.reactivex.rxjava3.functions.m, beg, ngl.a, SwipeDrawableRefreshLayout.g, io.reactivex.rxjava3.functions.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iu4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((e55) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (AudioReactionsConfigDto) ((g54) this.c).invoke(obj);
            case 1:
            case 2:
            case 4:
            case 6:
            case 12:
            default:
                return (Map) ((cww) this.c).invoke(obj);
            case 3:
                return (Pair) ((lq5) this.c).invoke(obj);
            case 5:
                return (List) ((g54) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.o) ((wqb) this.c).invoke(obj);
            case 8:
                return (String) ((izs) this.c).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.b0) ((xcd) this.c).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.t) ((dta) this.c).invoke(obj);
            case 11:
                return (Integer) ((xcd) this.c).invoke(obj);
            case 13:
                return (c0c) ((g54) this.c).invoke(obj);
            case 14:
                return (List) ((q60) this.c).invoke(obj);
            case 15:
                return (JSONArray) ((g54) this.c).invoke(obj);
            case 16:
                return (a.C1935a) ((dwg) this.c).invoke(obj);
            case 17:
                return (bfz.a) ((g54) this.c).invoke(obj);
            case 18:
                return (utk) ((juz) this.c).invoke(obj);
            case 19:
                return (hda) ((ou1) this.c).invoke(obj);
            case 20:
                return (Boolean) ((juz) this.c).invoke(obj);
            case 21:
                return (f.c) ((cww) this.c).invoke(obj);
            case 22:
                return (hda) ((b.e) this.c).invoke(obj);
            case 23:
                return (tt70) ((juz) this.c).invoke(obj);
            case 24:
                return (PlaylistLink) ((gzn) this.c).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.b0) ((ux40) this.c).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.b0) ((xjm) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (ykb0.a) ((lci) this.c).invoke(obj, obj2, obj3);
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        cop copVar = (cop) ((vop) this.c).a;
        if (copVar != null) {
            copVar.ud();
        }
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        ((PastBroadcastsFragment) this.c).R.a(ro90.c.a);
    }

    @Override // xsna.beg
    public void n(boolean z) {
        qh8 qh8Var = (qh8) this.c;
        if (z) {
            qh8Var.u2(true);
        } else {
            qh8Var.x2();
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 2:
                return ((Boolean) ((tb) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((g54) this.c).invoke(obj)).booleanValue();
        }
    }
}
