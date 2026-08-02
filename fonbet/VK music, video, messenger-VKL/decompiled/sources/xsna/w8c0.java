package xsna;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import xsna.l7v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class w8c0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w8c0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Activity activity;
        switch (this.b) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.c;
                List list = (List) this.d;
                y8c0 y8c0Var = (y8c0) this.e;
                String str = (String) this.f;
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                    } else if (((ol60) listIterator.previous()).b == 73) {
                        i = listIterator.nextIndex();
                    }
                }
                if (i >= 0) {
                    View childAt = layoutManager != null ? layoutManager.getChildAt(i) : null;
                    View findViewById = childAt != null ? childAt.findViewById(R.id.badges_send_text_view) : null;
                    if (findViewById != null && f4m.h(findViewById) && (activity = (Activity) y8c0Var.i.get()) != null) {
                        Rect C = bwt0.C(findViewById);
                        l7v b = pla.e().b();
                        b.getClass();
                        l7v.b bVar = new l7v.b(str, b, C);
                        bVar.m = 48;
                        bVar.j(activity);
                        break;
                    }
                }
                break;
            default:
                gzs gzsVar = (gzs) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                izs izsVar = (izs) this.e;
                izs izsVar2 = (izs) this.f;
                try {
                    Fragment fragment = (Fragment) gzsVar.invoke();
                    FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.f(0, fragment, UUID.randomUUID().toString(), 1);
                    aVar.m();
                    izsVar.invoke(fragment);
                    break;
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.q(th);
                    izsVar2.invoke(th);
                }
        }
    }
}
