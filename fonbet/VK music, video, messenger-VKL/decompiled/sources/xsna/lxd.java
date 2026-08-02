package xsna;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import java.util.List;

/* compiled from: ClipsEditorDiComponentDeps.kt */
/* loaded from: classes16.dex */
public final class lxd {
    public final Object a;
    public Object b;
    public Object c;
    public final Object d;

    public lxd(VideoAutoPlayDelayType videoAutoPlayDelayType) {
        this.a = videoAutoPlayDelayType;
        this.b = new SparseArray();
        this.c = new SparseArray();
        this.d = new SparseArray();
    }

    public void a() {
        ((SparseArray) this.b).clear();
        ((SparseArray) this.c).clear();
        ((SparseArray) this.d).clear();
    }

    public MediaPipelineComponent b() {
        return (MediaPipelineComponent) ((bpn0) this.a).getValue();
    }

    public ViewGroup c() {
        ViewGroup view;
        n9c0 n9c0Var = (n9c0) this.b;
        return (n9c0Var == null || (view = n9c0Var.getView()) == null) ? (FrameLayout) this.d : view;
    }

    public void d(sq60 sq60Var, tc60 tc60Var, String str) {
        SparseArray sparseArray = (SparseArray) this.b;
        sparseArray.clear();
        SparseArray sparseArray2 = (SparseArray) this.c;
        sparseArray2.clear();
        SparseArray sparseArray3 = (SparseArray) this.d;
        sparseArray3.clear();
        List<ol60> list = sq60Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ol60 ol60Var = list.get(i);
            if (ol60Var instanceof z1c0) {
                u1c0 u1c0Var = ((z1c0) ol60Var).h;
                yg5 a = u1c0Var.a();
                if (a != null) {
                    sparseArray.put(i, a);
                }
                String e = u1c0Var.e();
                if (e != null) {
                    sparseArray2.put(i, e);
                }
                String d = u1c0Var.d();
                if (d != null) {
                    sparseArray3.put(i, d);
                }
            }
        }
        ei5 ei5Var = ei5.h;
        ei5 ei5Var2 = new ei5(sparseArray, sparseArray2, sparseArray3, ei5Var.d, list.size(), str, (VideoAutoPlayDelayType) this.a);
        cqp cqpVar = tc60Var.d;
        if (cqpVar == null || ei5Var2.equals((ei5) cqpVar.e)) {
            return;
        }
        cqpVar.e = ei5Var2;
        ((fr20) cqpVar.c).invoke();
    }

    public lxd(l7m l7mVar, String str) {
        this.a = new bpn0(new jxd(l7mVar, 0));
        this.b = new bpn0(new c53(l7mVar, 1));
        this.c = new bpn0(new kxd(l7mVar, 0));
        this.d = new bpn0(new gd0(7, l7mVar, str));
    }

    public lxd(sc0 sc0Var, Context context) {
        this.a = sc0Var;
        this.d = new FrameLayout(context);
    }
}
