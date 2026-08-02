package xsna;

import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import java.util.AbstractList;
import java.util.List;
import ru.ok.gleffects.dto.UserInfo;

/* compiled from: CameraUIPresenter.kt */
/* loaded from: classes16.dex */
public final class vm9 implements g530, sdc0, l4m0 {
    public final /* synthetic */ int b;
    public Object c;

    public /* synthetic */ vm9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.g530
    public void H2() {
        b2c0 b2c0Var = (b2c0) this.c;
        AbstractList abstractList = ((ListDataSet) b2c0Var.c).d;
        for (int i = 0; i < abstractList.size(); i++) {
            if (b2c0.K0(((u1c0) abstractList.get(i)).c)) {
                b2c0Var.notifyItemChanged(i);
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.l4m0
    public void Y() {
        ((m4m0) this.c).c.o5().h();
    }

    @Override // xsna.l4m0
    public void a() {
        L.l("Can't removeCurrentHashtag without sticker");
    }

    @Override // xsna.l4m0
    public void b(v4m0 v4m0Var) {
        m4m0 m4m0Var = (m4m0) this.c;
        m4m0Var.a.f(v4m0Var);
        m4m0Var.b.f();
        m4m0Var.c.o5().e();
    }

    @Override // xsna.l4m0
    public void c(t4m0 t4m0Var) {
        L.l("You can't update sticker without sticker");
    }

    public void d(List list) {
        zd9 camera1View = ((com.vk.cameraui.impl.a) this.c).b.getCamera1View();
        if (camera1View != null) {
            mk9 mk9Var = ((mo9) camera1View.getCameraPreview()).g;
            mk9Var.getClass();
            mk9Var.d(new cc3(1, mk9Var, list));
        }
    }

    public void e(List list) {
        zd9 camera1View = ((com.vk.cameraui.impl.a) this.c).b.getCamera1View();
        if (camera1View != null) {
            mk9 mk9Var = ((mo9) camera1View.getCameraPreview()).g;
            mk9Var.getClass();
            mk9Var.d(new ii4(2, mk9Var, list));
        }
    }

    public void f(UserInfo userInfo) {
        zd9 camera1View = ((com.vk.cameraui.impl.a) this.c).b.getCamera1View();
        if (camera1View != null) {
            mk9 mk9Var = ((mo9) camera1View.getCameraPreview()).g;
            mk9Var.getClass();
            mk9Var.d(new zv4(2, mk9Var, userInfo));
        }
    }

    public void g(ClipsEditorInputData clipsEditorInputData) {
        ((com.vk.cameraui.impl.a) this.c).h0(clipsEditorInputData);
    }

    public boolean h(int i) {
        if (i < 0) {
            return false;
        }
        Character[] chArr = (Character[]) this.c;
        return i <= chArr.length - 1 && chArr[i] != null;
    }

    public void i(int i) {
        if (i < 0 || i > ((Character[]) this.c).length - 1) {
            throw new IllegalArgumentException(lhg.a(i, "Passed position goes beyond text boundaries: position = "));
        }
    }

    @Override // xsna.sdc0
    public void q0() {
        e3j0 e3j0Var = ((f3j0) this.c).o;
        if (e3j0Var != null) {
            e3j0Var.b.q0();
        }
    }

    public String toString() {
        switch (this.b) {
            case 1:
                return j5g.g0(rl3.I((Character[]) this.c), "", null, null, 0, null, 62);
            default:
                return super.toString();
        }
    }

    @Override // xsna.sdc0
    public void y0() {
        e3j0 e3j0Var = ((f3j0) this.c).o;
        if (e3j0Var != null) {
            e3j0Var.b.y0();
        }
    }

    public vm9(int i) {
        this.b = i;
        switch (i) {
            case 2:
                break;
            default:
                this.c = new Character[6];
                break;
        }
    }

    @Override // xsna.g530
    public void g3() {
    }
}
