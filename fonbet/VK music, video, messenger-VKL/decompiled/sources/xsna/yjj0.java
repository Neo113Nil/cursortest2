package xsna;

import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ShowcaseSectionOpenPerfTracker.kt */
/* loaded from: classes16.dex */
public final class yjj0 implements tjj0 {
    public Long a;
    public String b;
    public boolean c;

    public static boolean b(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        return ((adapter != null ? adapter.getItemCount() : 0) > 0) && (recyclerView.getChildCount() != 0);
    }

    @Override // xsna.tjj0
    public final void a(final UIBlockList uIBlockList, final RecyclerView recyclerView) {
        Long l;
        if (this.c) {
            return;
        }
        if (epx.f(this.b, uIBlockList.c) && (l = this.a) != null) {
            final long longValue = l.longValue();
            if (recyclerView == null) {
                return;
            }
            recyclerView.post(new Runnable() { // from class: xsna.ujj0
                /* JADX WARN: Type inference failed for: r0v11, types: [T, xsna.wjj0] */
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    yjj0 yjj0Var = yjj0.this;
                    if (yjj0Var.c) {
                        return;
                    }
                    RecyclerView recyclerView2 = recyclerView;
                    if (recyclerView2.isAttachedToWindow()) {
                        UIBlockList uIBlockList2 = uIBlockList;
                        if (epx.f(yjj0Var.b, uIBlockList2.c)) {
                            UIBlock uIBlock = (UIBlock) j5g.a0(uIBlockList2.y);
                            if (uIBlock == null || (str = uIBlock.f) == null) {
                                str = "Unknown section url";
                            }
                            String str2 = str;
                            boolean b = yjj0.b(recyclerView2);
                            long j = longValue;
                            if (b) {
                                yjj0Var.c(j, str2);
                                return;
                            }
                            vjj0 vjj0Var = new vjj0(yjj0Var, uIBlockList2, j, str2);
                            if (recyclerView2.isAttachedToWindow()) {
                                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                xjj0 xjj0Var = new xjj0(recyclerView2, ref$ObjectRef, yjj0Var, vjj0Var);
                                ref$ObjectRef.element = new wjj0(recyclerView2, xjj0Var);
                                recyclerView2.getViewTreeObserver().addOnPreDrawListener(xjj0Var);
                                T t = ref$ObjectRef.element;
                                recyclerView2.addOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                            }
                        }
                    }
                }
            });
        }
    }

    public final void c(long j, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.c = true;
        this.a = null;
        this.b = null;
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.SHOWCASE_SECTION_OPEN_DURATION.h(), null, String.valueOf(elapsedRealtime), null, str, null, "OLD CATALOG SHOWCASE SECTION OPEN DURATION", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -86, 3, null);
        l5mVar.q();
    }
}
