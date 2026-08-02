package xsna;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.g;
import com.ironsource.B2;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.video.calls.sdk_private.aF;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class xj3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xj3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList c;
        switch (this.b) {
            case 0:
                RecyclerView.e0 e0Var = (RecyclerView.e0) this.c;
                yj3 yj3Var = (yj3) this.d;
                MotionEvent motionEvent = (MotionEvent) this.e;
                View rootView = e0Var.itemView.getRootView();
                int[] iArr = yj3Var.e;
                Rect rect = yj3Var.d;
                rootView.getLocationOnScreen(iArr);
                MotionEvent motionEvent2 = yj3Var.t;
                int rawX = ((int) (motionEvent2 != null ? motionEvent2.getRawX() : motionEvent.getRawX())) - iArr[0];
                MotionEvent motionEvent3 = yj3Var.t;
                int rawY = ((int) (motionEvent3 != null ? motionEvent3.getRawY() : motionEvent.getRawY())) - iArr[1];
                if ((e0Var instanceof otx0) && ((otx0) e0Var).X1(rect).contains(rawX, rawY)) {
                    yj3Var.s(yj3Var.a(e0Var), (jsx0) e0Var);
                } else {
                    if (e0Var instanceof qsx0) {
                        qsx0 qsx0Var = (qsx0) e0Var;
                        if (qsx0Var.L4() && qsx0Var.u4(rect).contains(rawX, rawY)) {
                            yj3Var.n((jsx0) e0Var);
                        }
                    }
                    yj3Var.m((jsx0) e0Var);
                }
                yj3Var.c();
                yj3Var.b();
                yj3Var.p = false;
                return;
            case 1:
                B2.a((B2) this.c, (View) this.d, (FrameLayout.LayoutParams) this.e);
                return;
            case 2:
                a3s a3sVar = (a3s) this.c;
                StoryOwner storyOwner = (StoryOwner) this.d;
                StoryEntry storyEntry = (StoryEntry) this.e;
                a3sVar.c.b();
                a3sVar.a(storyOwner, a3sVar.a.i0.getContext(), storyEntry.u, new wqb(8, a3sVar, storyOwner));
                return;
            case 3:
                uou uouVar = (uou) this.c;
                String str = (String) this.d;
                nlf0 nlf0Var = (nlf0) this.e;
                uouVar.getClass();
                synchronized (uouVar.a) {
                    c = uouVar.b.c(str);
                }
                ArrayList arrayList = new ArrayList(c);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Group) it.next()).s < 2) {
                        it.remove();
                    }
                }
                l4o0 l4o0Var = (l4o0) nlf0Var.c;
                l4o0Var.k = !l4o0Var.k;
                l4o0Var.g.post(new eo1(7, l4o0Var, l4o0.d(arrayList)));
                return;
            case 4:
                Integer num = (Integer) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                vx90 vx90Var = (vx90) this.e;
                Bundle bundle = new Bundle();
                if (num != null) {
                    bundle.putInt("arg_theme", num.intValue());
                }
                com.vk.permission.d dVar = new com.vk.permission.d();
                dVar.setArguments(bundle);
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                androidx.fragment.app.a b = tk5.b(supportFragmentManager, supportFragmentManager);
                b.f(0, dVar, "PermissionFragmentTag", 1);
                b.m();
                try {
                    vx90Var.invoke(dVar);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                t9l0 t9l0Var = (t9l0) this.c;
                xlo0 xlo0Var = (xlo0) this.d;
                StickersDrawingViewGroup stickersDrawingViewGroup = (StickersDrawingViewGroup) this.e;
                zlo0 currentTextDialog = t9l0Var.a.getCurrentTextDialog();
                if (currentTextDialog == null || !currentTextDialog.isShowing()) {
                    return;
                }
                xlo0Var.setInEditMode(true);
                stickersDrawingViewGroup.invalidate();
                return;
            case 6:
                xop0 xop0Var = (xop0) this.c;
                com.google.firebase.perf.v1.f fVar = (com.google.firebase.perf.v1.f) this.d;
                ApplicationProcessState applicationProcessState = (ApplicationProcessState) this.e;
                g.b n = com.google.firebase.perf.v1.g.n();
                n.c(fVar);
                xop0Var.f(n, applicationProcessState);
                return;
            default:
                ((cny0) this.c).f.a((List) this.d, (aF) this.e);
                return;
        }
    }
}
