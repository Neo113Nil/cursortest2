package xsna;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.components.common.LinkAction;
import com.vk.statistic.DeprecatedStatisticInterface;
import xsna.d4c0;
import xsna.uxv;
import xsna.vbh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class txv implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ txv(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        if (xsna.epx.f(r5, r7 != null ? r7.e : null) == false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [xsna.e5z, xsna.nbh0] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        o2f0 o2f0Var;
        switch (this.b) {
            case 0:
                uxv uxvVar = (uxv) this.c;
                Context context = (Context) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                int i = uxv.a.$EnumSwitchMapping$0[((LinkAction) obj).ordinal()];
                if (i == 2) {
                    uxv.a(context, str2);
                } else if (i == 4) {
                    uxvVar.c.k().e(context, str);
                }
                return s3q0.a;
            case 1:
                f4c0 f4c0Var = (f4c0) this.c;
                l6z l6zVar = (l6z) this.d;
                q6z q6zVar = (q6z) this.e;
                mm1 mm1Var = (mm1) this.f;
                t9x0 t9x0Var = (t9x0) obj;
                c6z c6zVar = l6zVar.a;
                ReactionMeta reactionMeta = l6zVar.c;
                boolean z = l6zVar.b;
                o2f0 o2f0Var2 = c6zVar instanceof o2f0 ? (o2f0) c6zVar : null;
                f4c0Var.c.remove(Long.valueOf(c6zVar.hashCode()));
                d2f0 d2f0Var = f4c0Var.d;
                if (c6zVar instanceof o2f0) {
                    d2f0Var.getClass();
                    o2f0Var = (o2f0) c6zVar;
                } else {
                    o2f0Var = null;
                }
                d2f0Var.getClass();
                d2f0.e(o2f0Var, reactionMeta, t9x0Var);
                int i2 = t9x0Var.b;
                int i3 = t9x0Var.a;
                c6zVar.f(i3);
                if (z && i2 >= 0) {
                    c6zVar.U8(i2);
                }
                if (o2f0Var2 != null) {
                    o2f0Var2.G2();
                }
                boolean z2 = false;
                boolean z3 = c6zVar.J() != q6zVar.i;
                if (o2f0Var2 != null) {
                    Integer valueOf = reactionMeta != null ? Integer.valueOf(reactionMeta.getId()) : null;
                    ItemReactions K = o2f0Var2.K();
                    break;
                }
                z2 = true;
                if (z3 && z2) {
                    f4c0Var.x(l6zVar, mm1Var, null);
                } else {
                    ce60.b.getClass();
                    p870.f().d(102, 100, (NewsEntry) c6zVar);
                    if (z && (c6zVar instanceof DeprecatedStatisticInterface)) {
                        com.vkontakte.android.data.b.o((DeprecatedStatisticInterface) c6zVar, "like_post");
                    }
                    mm1Var.invoke(new d4c0.a(i3, i2, t9x0Var.c, t9x0Var.d));
                }
                return s3q0.a;
            default:
                f5z f5zVar = (f5z) this.c;
                View view = (View) this.d;
                wh50 wh50Var = (wh50) this.e;
                final wh50 wh50Var2 = (wh50) this.f;
                mbh0 mbh0Var = new mbh0(view, wh50Var);
                ?? r2 = new androidx.lifecycle.l() { // from class: xsna.nbh0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.lifecycle.l
                    public final void onStateChanged(f5z f5zVar2, Lifecycle.Event event) {
                        int i4 = vbh0.a.$EnumSwitchMapping$0[event.ordinal()];
                        wh50 wh50Var3 = wh50.this;
                        wh50Var3.setValue(Boolean.valueOf(i4 != 1 ? i4 != 2 ? ((Boolean) wh50Var3.getValue()).booleanValue() : false : true));
                    }
                };
                f5zVar.getLifecycle().addObserver(r2);
                view.getViewTreeObserver().addOnGlobalLayoutListener(mbh0Var);
                return new vbh0.e(f5zVar, r2, view, mbh0Var);
        }
    }
}
