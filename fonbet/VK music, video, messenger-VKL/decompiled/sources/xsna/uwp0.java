package xsna;

import android.R;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.vk.metrics.exception.UICrashException;
import com.vkontakte.android.VKActivity;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: UICrashReporter.kt */
/* loaded from: classes3.dex */
public final class uwp0 {
    public static final o7j0 a = new o7j0(7);

    public static View a(View view) {
        View a2;
        if (((Boolean) a.invoke(view)).booleanValue()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (-1 < childCount) {
                    View childAt = viewGroup.getChildAt(childCount);
                    a2 = childAt != null ? a(childAt) : null;
                }
            } while (a2 == null);
            return a2;
        }
        return null;
    }

    public static void b(VKActivity vKActivity, Exception exc) {
        e(vKActivity, exc, "setRequestedOrientation", false);
    }

    public static void c(VKActivity vKActivity, Exception exc, KeyEvent keyEvent) {
        e(vKActivity, exc, keyEvent, true);
    }

    public static void d(VKActivity vKActivity, Exception exc, MotionEvent motionEvent) {
        e(vKActivity, exc, motionEvent, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(VKActivity vKActivity, Exception exc, Object obj, boolean z) {
        Object obj2;
        View findViewById;
        String str;
        RecyclerView.a0 a0Var;
        RecyclerView.l itemAnimator;
        RecyclerView.l itemAnimator2;
        RecyclerView.o layoutManager;
        RecyclerView.Adapter adapter;
        Iterator<T> it = vKActivity.getSupportFragmentManager().c.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            Fragment fragment = (Fragment) obj2;
            if (fragment.isVisible() && !fragment.isHidden()) {
                break;
            }
        }
        Fragment fragment2 = (Fragment) obj2;
        List<Fragment> f = vKActivity.getSupportFragmentManager().c.f();
        ArrayList arrayList = new ArrayList(c5g.u(f, 10));
        Iterator<T> it2 = f.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Fragment) it2.next()).getClass().getSimpleName());
        }
        if (fragment2 == null || (findViewById = fragment2.getView()) == null) {
            findViewById = vKActivity.findViewById(R.id.content);
        }
        View a2 = findViewById != null ? a(findViewById) : null;
        RecyclerView recyclerView = a2 instanceof RecyclerView ? (RecyclerView) a2 : null;
        if (z) {
            StringBuilder sb = new StringBuilder("\n            recycler=");
            sb.append(recyclerView);
            sb.append(",\n            adapter=");
            sb.append((recyclerView == null || (adapter = recyclerView.getAdapter()) == null) ? null : adapter.getClass().getSimpleName());
            sb.append(",\n            layoutManager=");
            sb.append((recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) ? null : layoutManager.getClass().getSimpleName());
            sb.append(",\n            itemAnimator=");
            sb.append((recyclerView == null || (itemAnimator2 = recyclerView.getItemAnimator()) == null) ? null : itemAnimator2.getClass().getSimpleName());
            sb.append(",\n            recyclerState=");
            if (recyclerView != null) {
                try {
                    Field declaredField = recyclerView.getClass().getDeclaredField("mState");
                    declaredField.setAccessible(true);
                    a0Var = (RecyclerView.a0) declaredField.get(recyclerView);
                } catch (Throwable unused) {
                }
                sb.append(a0Var);
                sb.append("\n            isComputingLayout=");
                sb.append(recyclerView == null ? Boolean.valueOf(recyclerView.isComputingLayout()) : null);
                sb.append("\n            isAnimating=");
                sb.append(recyclerView == null ? Boolean.valueOf(recyclerView.isAnimating()) : null);
                sb.append("\n            isAnimatorRunning=");
                sb.append((recyclerView != null || (itemAnimator = recyclerView.getItemAnimator()) == null) ? null : Boolean.valueOf(itemAnimator.n()));
                sb.append("\n            isLayoutFrozen=");
                sb.append(recyclerView == null ? Boolean.valueOf(recyclerView.isLayoutFrozen()) : null);
                sb.append("\n        ");
                str = xqm0.g(sb.toString());
            }
            a0Var = null;
            sb.append(a0Var);
            sb.append("\n            isComputingLayout=");
            sb.append(recyclerView == null ? Boolean.valueOf(recyclerView.isComputingLayout()) : null);
            sb.append("\n            isAnimating=");
            sb.append(recyclerView == null ? Boolean.valueOf(recyclerView.isAnimating()) : null);
            sb.append("\n            isAnimatorRunning=");
            sb.append((recyclerView != null || (itemAnimator = recyclerView.getItemAnimator()) == null) ? null : Boolean.valueOf(itemAnimator.n()));
            sb.append("\n            isLayoutFrozen=");
            sb.append(recyclerView == null ? Boolean.valueOf(recyclerView.isLayoutFrozen()) : null);
            sb.append("\n        ");
            str = xqm0.g(sb.toString());
        } else {
            str = "";
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        StringBuilder sb2 = new StringBuilder("\n            crash,\n            event=");
        sb2.append(obj);
        sb2.append(",\n            activity=");
        sb2.append(vKActivity.getClass().getSimpleName());
        sb2.append(",\n            activityState=[isDestroyed=");
        sb2.append(vKActivity.isDestroyed());
        sb2.append(", isFinishing=");
        sb2.append(vKActivity.isFinishing());
        sb2.append("]\n            fragment=");
        sb2.append(fragment2 != null ? fragment2.getClass().getSimpleName() : null);
        sb2.append(",\n            fragments=");
        sb2.append(j5g.g0(arrayList, null, X3.j.d, X3.j.e, 0, null, 57));
        sb2.append(",\n            ");
        sb2.append(str);
        sb2.append("\n                ");
        bVar.q(new UICrashException(xqm0.g(sb2.toString()), exc));
    }
}
