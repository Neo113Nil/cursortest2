package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.item.clip.viewstate.MainOverlayState;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.mih0;

/* compiled from: ClipItemMainOverlayRedesignRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class h1d {
    public final g1d a;
    public final u6d b;
    public MainOverlayState c;
    public MainOverlayState.i d;
    public final rf00 e;
    public final com.vk.clips.sdk.shared.item.common.description.b f;
    public final bmc g;
    public final bv h;
    public final r16 i;
    public final bv j;
    public final h0d k;
    public final qi50 l;

    public h1d(g1d g1dVar, u6d u6dVar, jlh0 jlh0Var, cjh0 cjh0Var, boolean z, VkBlurContentView vkBlurContentView) {
        this.a = g1dVar;
        this.b = u6dVar;
        this.e = new rf00(g1dVar);
        n7 n7Var = new n7(this, 9);
        wf00 wf00Var = new wf00();
        this.f = new com.vk.clips.sdk.shared.item.common.description.b(g1dVar.i, g1dVar.c, n7Var, cjh0Var, null);
        this.g = new bmc(g1dVar.g, u6dVar, z, vkBlurContentView);
        this.h = new bv(g1dVar.l, jlh0Var, wf00Var, new o7(this, 9));
        this.i = new r16(g1dVar.q, u6dVar);
        this.j = new bv(g1dVar.m, jlh0Var, wf00Var, new rf1(this, 11));
        this.k = new h0d(g1dVar.k, u6dVar);
        this.l = new qi50(g1dVar.j);
    }

    public static boolean a(MainOverlayState.c cVar) {
        if (!(cVar instanceof MainOverlayState.c.b)) {
            return false;
        }
        ArrayList arrayList = ((MainOverlayState.c.b) cVar).a;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((mih0) it.next()) instanceof mih0.k) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(MainOverlayState.c cVar) {
        if (!(cVar instanceof MainOverlayState.c.b)) {
            return false;
        }
        ArrayList arrayList = ((MainOverlayState.c.b) cVar).a;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((mih0) it.next()) instanceof mih0.p) {
                return true;
            }
        }
        return false;
    }

    public static void c(RecyclerView recyclerView, MainOverlayState.c cVar) {
        if (cVar instanceof MainOverlayState.c.b) {
            recyclerView.setVisibility(0);
            ((gqc) recyclerView.getAdapter()).setItems(((MainOverlayState.c.b) cVar).a);
        } else {
            if (!(cVar instanceof MainOverlayState.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(recyclerView);
        }
    }
}
