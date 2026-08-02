package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.design.inspector.DesignInspectorComponent;
import io.jsonwebtoken.JwtParser;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import xsna.e5x;
import xsna.ppy;

/* compiled from: VKLayoutInflater.kt */
@SuppressLint({"SoonBlockedPrivateApi", "DiscouragedPrivateApi"})
/* loaded from: classes.dex */
public final class gdr0 extends LayoutInflater {
    public static final String[] c = {"android.widget.", "android.webkit.", "android.app."};
    public final bpn0 a;
    public final bpn0 b;

    public gdr0(LayoutInflater layoutInflater, Context context) {
        super(layoutInflater, context);
        this.a = new bpn0(new zf6(this, 14));
        this.b = new bpn0(new ag6(this, 12));
    }

    public final View a(Context context, View view, String str, AttributeSet attributeSet) {
        View onCreateView;
        View createView;
        boolean E = drm0.E(str, JwtParser.SEPARATOR_CHAR);
        if (gz80.a(29) && !E) {
            return onCreateView(context, view, str, attributeSet);
        }
        if (gz80.a(29)) {
            createView = createView(context, str, null, attributeSet);
            return createView;
        }
        LayoutInflater.Factory2 factory2 = (LayoutInflater.Factory2) this.a.getValue();
        if (factory2 != null && (onCreateView = factory2.onCreateView(view, str, context, attributeSet)) != null) {
            return onCreateView;
        }
        Object[] objArr = (Object[]) this.b.getValue();
        if (objArr == null) {
            return null;
        }
        Object obj = objArr[0];
        objArr[0] = context;
        try {
            View onCreateView2 = !E ? onCreateView(view, str, attributeSet) : createView(str, null, attributeSet);
            objArr[0] = obj;
            return onCreateView2;
        } catch (Throwable th) {
            objArr[0] = obj;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View b(String str, Context context, AttributeSet attributeSet) {
        View createView;
        for (int i = 0; i < 3; i++) {
            String str2 = c[i];
            if (context != null) {
                try {
                } catch (ClassNotFoundException unused) {
                    continue;
                }
                if (gz80.a(29)) {
                    createView = createView(context, str, str2, attributeSet);
                    if (createView == null) {
                        return createView;
                    }
                }
            }
            createView = createView(str, str2, attributeSet);
            if (createView == null) {
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        return new gdr0(this, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.LayoutInflater
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        View view;
        ppy.b poll;
        LayoutInflater.Factory2 factory2 = getFactory2();
        FileNotFoundException fileNotFoundException = null;
        vhr0 vhr0Var = factory2 instanceof vhr0 ? (vhr0) factory2 : null;
        if (vhr0Var != null) {
            vhr0Var.d = i;
        }
        e5x.a aVar = e5x.a.a;
        if (!((Boolean) com.vk.core.apps.a.l.getValue()).booleanValue()) {
            aVar = null;
        }
        if (aVar != null) {
            Context context = getContext();
            e5x n = ((DesignInspectorComponent) ((k7m) m7m.f(e5x.a.b)).a(fpf0.a(DesignInspectorComponent.class))).n();
            if (n != null) {
                ((q5x) n).f(i, context);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        ppy.a<Integer, ppy.b> aVar2 = ppy.a;
        Context context2 = getContext();
        int i2 = 0;
        if (!ppy.c && e3m.h(context2) != null) {
            if (ppy.d != ((context2.getResources().getConfiguration().uiMode & 48) == 32)) {
                ppy.a<Integer, ppy.b> aVar3 = ppy.a;
                Object obj = aVar3.a;
                HashMap<Integer, LinkedList<ppy.b>> hashMap = aVar3.b;
                synchronized (obj) {
                    hashMap.clear();
                    s3q0 s3q0Var2 = s3q0.a;
                }
                ppy.b.dispose();
                ppy.c = true;
            } else {
                ppy.a<Integer, ppy.b> aVar4 = ppy.a;
                Integer valueOf = Integer.valueOf(i);
                synchronized (aVar4.a) {
                    LinkedList<ppy.b> linkedList = aVar4.b.get(valueOf);
                    poll = linkedList != null ? linkedList.poll() : null;
                }
                ppy.b bVar = poll;
                if (bVar != null) {
                    View view2 = bVar.a;
                    boolean z2 = bVar.c;
                    if (!bVar.b) {
                        view = ppy.a(context2, view2);
                    } else if (viewGroup != null || !z2) {
                        ViewGroup viewGroup2 = (ViewGroup) view2;
                        ArrayList arrayList = new ArrayList();
                        int childCount = viewGroup2.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            arrayList.add(viewGroup2.getChildAt(i3));
                        }
                        viewGroup2.removeAllViews();
                        if (z2) {
                            if (viewGroup != null) {
                                if (!arrayList.isEmpty()) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        if (ppy.a(context2, (View) it.next()) == null) {
                                        }
                                    }
                                }
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    viewGroup.addView((View) it2.next());
                                }
                                view = viewGroup;
                            }
                        } else if (arrayList.size() == 1) {
                            ppy.a<Integer, ppy.b> aVar5 = ppy.a;
                            view = ppy.a(context2, (View) j5g.Y(arrayList));
                        }
                    }
                    if (view != null && z && viewGroup != view && viewGroup != null) {
                        viewGroup.addView(view, view.getLayoutParams());
                    }
                    if (view == null) {
                        return view;
                    }
                    try {
                        return super.inflate(i, viewGroup, z);
                    } catch (Exception e) {
                        Throwable th = e;
                        while (true) {
                            if (th == null) {
                                break;
                            }
                            if (th.getClass().equals(FileNotFoundException.class)) {
                                fileNotFoundException = (FileNotFoundException) th;
                                break;
                            }
                            if (th.equals(th.getCause())) {
                                break;
                            }
                            th = th.getCause();
                        }
                        if (fileNotFoundException != null) {
                            while (i2 < 40) {
                                Thread.sleep(50L);
                                i2++;
                                try {
                                    View inflate = super.inflate(i, viewGroup, z);
                                    if (inflate != null) {
                                        return inflate;
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            throw e;
                        }
                        throw e;
                    }
                }
            }
        }
        view = null;
        if (view != null) {
            viewGroup.addView(view, view.getLayoutParams());
        }
        if (view == null) {
        }
    }

    @Override // android.view.LayoutInflater
    public final View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        View b = b(str, null, attributeSet);
        return b == null ? super.onCreateView(str, attributeSet) : b;
    }

    @Override // android.view.LayoutInflater
    public final View onCreateView(Context context, View view, String str, AttributeSet attributeSet) throws ClassNotFoundException {
        View b = b(str, context, attributeSet);
        return b == null ? super.onCreateView(context, view, str, attributeSet) : b;
    }
}
