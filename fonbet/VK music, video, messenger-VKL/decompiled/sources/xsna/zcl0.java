package xsna;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.dto.hints.HintId;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.rlottie.RLottieDrawable;
import com.vk.toggle.features.StoriesFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: StickersState.java */
/* loaded from: classes15.dex */
public final class zcl0 {
    public static final zcl0 e = new zcl0();
    public final CopyOnWriteArrayList<nov> a;
    public int b;

    @Nullable
    public rkc c;

    @Nullable
    public u4 d;

    public zcl0() {
        this.a = new CopyOnWriteArrayList<>();
        this.b = -1;
        this.d = null;
    }

    public static boolean x(@NonNull nov novVar, int i) {
        q500 o = novVar.getCommons().o();
        return (o == null || o.f((long) i)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@NonNull nov novVar) {
        u4 u4Var = this.d;
        if (u4Var != null) {
            kl9 kl9Var = (kl9) u4Var.b;
            h7v h7vVar = kl9Var.b;
            HintId hintId = HintId.STORIES_REPOST_REDESIGN_ONBOARDING;
            if (h7vVar.m(hintId) && ((novVar instanceof z7c0) || (novVar instanceof lba0) || (novVar instanceof r4g0))) {
                StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
                storiesFeatures.getClass();
                if (!com.vk.toggle.b.A.a(storiesFeatures)) {
                    kl9Var.b.b(hintId.getId());
                    kl9Var.a.getStickersState().d = null;
                    View view = novVar instanceof View ? (View) novVar : null;
                    if (view != null) {
                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                        if (view.isLaidOut()) {
                            kl9.c(kl9Var);
                            kl9.a(kl9Var, novVar);
                            kl9.b(kl9Var);
                        } else {
                            view.addOnLayoutChangeListener(new jl9(kl9Var, novVar));
                        }
                    }
                }
            }
        }
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.a;
        int size = copyOnWriteArrayList.size();
        int i = 0;
        if (!copyOnWriteArrayList.isEmpty() && novVar.getStickerLayerType() >= copyOnWriteArrayList.get(0).getStickerLayerType()) {
            if (novVar.getStickerLayerType() >= copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1).getStickerLayerType()) {
                size = copyOnWriteArrayList.size();
            } else {
                while (i != copyOnWriteArrayList.size()) {
                    if (novVar.getStickerLayerType() >= copyOnWriteArrayList.get(i).getStickerLayerType()) {
                        i++;
                    }
                }
            }
            copyOnWriteArrayList.add(size, novVar);
        }
        size = i;
        copyOnWriteArrayList.add(size, novVar);
    }

    public final void b(List<? extends nov> list) {
        Iterator<? extends nov> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void c(int i) {
        if (i >= 0) {
            CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.a;
            if (copyOnWriteArrayList.size() <= i) {
                return;
            }
            nov novVar = copyOnWriteArrayList.get(i);
            if (!(novVar instanceof d7g0)) {
                copyOnWriteArrayList.remove(i);
                a(novVar);
            }
            Iterator<nov> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                nov next = it.next();
                if (next instanceof yjm0) {
                    copyOnWriteArrayList.remove(next);
                    a(next);
                }
            }
        }
    }

    public final void d(Canvas canvas, int i, boolean z) {
        int i2 = 0;
        while (true) {
            CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.a;
            if (i2 == copyOnWriteArrayList.size()) {
                return;
            }
            nov novVar = copyOnWriteArrayList.get(i2);
            novVar.setTimestampMsValue(this.b);
            if (!novVar.getInEditMode() && !x(novVar, this.b) && ((!(novVar instanceof yv5) && !(novVar instanceof qx5)) || !z)) {
                boolean z2 = i != -1 && (novVar instanceof vov);
                if (z2) {
                    ((vov) novVar).setPreviewMode(i);
                }
                novVar.F0(canvas, true);
                if (z2) {
                    ((vov) novVar).setPreviewMode(-1);
                }
            }
            i2++;
        }
    }

    @Nullable
    public final qx5 e() {
        return (qx5) h(new oi40(19));
    }

    @Nullable
    public final dh9 f() {
        return (dh9) h(new per(28));
    }

    @Nullable
    public final ClickableStickers g(int i, int i2) {
        List<ClickableSticker> b;
        ArrayList arrayList = new ArrayList();
        if (this.c == null) {
            this.c = ((CommonEditorComponent) j6i.b(m7m.f(new ycl0()), CommonEditorComponent.class)).Z1();
        }
        rkc rkcVar = this.c;
        Iterator<nov> it = this.a.iterator();
        while (it.hasNext()) {
            nov next = it.next();
            if (rkcVar.a(next) && (b = rkcVar.b(next)) != null) {
                arrayList.addAll(b);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ClickableStickers(i, i2, arrayList);
    }

    @Nullable
    public final nov h(@NonNull izs<nov, Boolean> izsVar) {
        int i = 0;
        while (true) {
            CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.a;
            if (i == copyOnWriteArrayList.size()) {
                return null;
            }
            if (izsVar.invoke(copyOnWriteArrayList.get(i)).booleanValue()) {
                return copyOnWriteArrayList.get(i);
            }
            i++;
        }
    }

    @Nullable
    public final h7m0 i() {
        return (h7m0) h(new hwi0(5));
    }

    @Nullable
    public final grt0 j() {
        r4g0 k;
        grt0 grt0Var = (grt0) h(new ubj0(3));
        return (grt0Var != null || (k = k()) == null || k.getVideo().u) ? grt0Var : k.getVideo();
    }

    @Nullable
    public final r4g0 k() {
        return (r4g0) h(new byo(28));
    }

    @NonNull
    public final CopyOnWriteArrayList l() {
        return this.a;
    }

    @Nullable
    public final oit0 m() {
        r4g0 k;
        oit0 oit0Var = (oit0) h(new e750(13));
        return (oit0Var != null || (k = k()) == null) ? oit0Var : k.getVideo();
    }

    public final void n(int i, int i2) {
        Iterator<nov> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().w0(i, i2);
        }
    }

    public final boolean o() {
        CopyOnWriteArrayList<nov> copyOnWriteArrayList;
        nov novVar;
        nov novVar2;
        int i = 0;
        while (true) {
            copyOnWriteArrayList = this.a;
            novVar = null;
            if (i == copyOnWriteArrayList.size()) {
                novVar2 = null;
                break;
            }
            if (copyOnWriteArrayList.get(i).z0()) {
                novVar2 = copyOnWriteArrayList.get(i);
                break;
            }
            i++;
        }
        if (novVar2 == null) {
            int i2 = 0;
            while (true) {
                if (i2 == copyOnWriteArrayList.size()) {
                    break;
                }
                if (copyOnWriteArrayList.get(i2).getCommons().o() != null) {
                    novVar = copyOnWriteArrayList.get(i2);
                    break;
                }
                i2++;
            }
            if (novVar == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean p() {
        return e() != null;
    }

    public final boolean q() {
        nov novVar;
        int i = 0;
        while (true) {
            CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.a;
            if (i == copyOnWriteArrayList.size()) {
                novVar = null;
                break;
            }
            if (copyOnWriteArrayList.get(i) instanceof l4g0) {
                novVar = copyOnWriteArrayList.get(i);
                break;
            }
            i++;
        }
        l4g0 l4g0Var = (l4g0) novVar;
        if (l4g0Var instanceof u4g0) {
            return ((u4g0) l4g0Var).getHasMusic();
        }
        r4g0 k = k();
        if (k != null) {
            return k.getVideo().getHasMusic();
        }
        return false;
    }

    public final boolean r() {
        return i() != null;
    }

    public final boolean s() {
        return (((p7c0) h(new eni0(2))) == null && ((z7c0) h(new h2w(29))) == null) ? false : true;
    }

    public final boolean t() {
        CopyOnWriteArrayList<nov> copyOnWriteArrayList;
        nov novVar;
        nov novVar2;
        int i = 0;
        while (true) {
            copyOnWriteArrayList = this.a;
            novVar = null;
            if (i == copyOnWriteArrayList.size()) {
                novVar2 = null;
                break;
            }
            if (copyOnWriteArrayList.get(i) instanceof l4g0) {
                novVar2 = copyOnWriteArrayList.get(i);
                break;
            }
            i++;
        }
        if (((l4g0) novVar2) != null) {
            return true;
        }
        int i2 = 0;
        while (true) {
            if (i2 == copyOnWriteArrayList.size()) {
                break;
            }
            if (copyOnWriteArrayList.get(i2) instanceof g4g0) {
                novVar = copyOnWriteArrayList.get(i2);
                break;
            }
            i2++;
        }
        return (((g4g0) novVar) == null && k() == null) ? false : true;
    }

    public final boolean u() {
        return m() != null;
    }

    public final void v() {
        int i = 0;
        while (true) {
            CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.a;
            if (i == copyOnWriteArrayList.size()) {
                return;
            }
            nov novVar = copyOnWriteArrayList.get(i);
            if (novVar instanceof vps0) {
                ((vps0) novVar).b();
            }
            i++;
        }
    }

    public final void w(nov novVar) {
        this.a.remove(novVar);
        if (novVar instanceof t690) {
            ((RLottieDrawable) ((t690) novVar).h.b).k();
        }
        if (novVar instanceof lo9) {
            ((lo9) novVar).w();
        }
    }

    public zcl0(@NonNull yv5 yv5Var) {
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.a = copyOnWriteArrayList;
        this.b = -1;
        this.d = null;
        copyOnWriteArrayList.add(yv5Var);
    }

    public zcl0(@NonNull List<nov> list) {
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.a = copyOnWriteArrayList;
        this.b = -1;
        this.d = null;
        copyOnWriteArrayList.addAll(list);
    }
}
