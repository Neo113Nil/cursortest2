package xsna;

import com.vk.api.photos.PhotosGetAlbums;
import com.vk.im.ui.components.theme_chooser.c;
import java.util.List;
import xsna.l5v0;
import xsna.ltd0;
import xsna.s9u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i630 implements io.reactivex.rxjava3.functions.l, s9u.d, io.reactivex.rxjava3.functions.m, m6o {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i630(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.s9u.d
    public void a() {
        ((yv50) this.c).t();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((np5) this.c).invoke(obj);
            case 1:
                return (List) ((w7u) this.c).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.b0) ((np5) this.c).invoke(obj);
            case 3:
                return (List) ((f6w) this.c).invoke(obj);
            case 4:
            case 7:
            case 12:
            case 20:
            default:
                return (Boolean) ((r45) this.c).invoke(obj);
            case 5:
                return (x960) ((f6w) this.c).invoke(obj);
            case 6:
                return (bfr) ((w7u) this.c).invoke(obj);
            case 8:
                return ((qi00) this.c).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.t) ((w7u) this.c).invoke(obj);
            case 10:
                return (PhotosGetAlbums.a) ((k170) this.c).invoke(obj);
            case 11:
                return (ltd0.d) ((f6w) this.c).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.b0) ((xvi0) this.c).invoke(obj);
            case 14:
                return (s3q0) ((f6w) this.c).invoke(obj);
            case 15:
                return (c.AbstractC1159c) ((n7b0) this.c).invoke(obj);
            case 16:
                return (List) ((n7b0) this.c).invoke(obj);
            case 17:
                return (bwq0) ((agk) this.c).invoke(obj);
            case 18:
                return (String) ((pmp0) this.c).invoke(obj);
            case 19:
                return (sfs0) ((pmp0) this.c).invoke(obj);
            case 21:
                return (l5v0.a.b) ((pmp0) this.c).invoke(obj);
            case 22:
                return (txm0) ((owa) this.c).invoke(obj);
            case 23:
                return (n6n0) ((l9v0) this.c).invoke(obj);
            case 24:
                return (Boolean) ((l9v0) this.c).invoke(obj);
        }
    }

    @Override // xsna.m6o
    public double b(double d) {
        pjp0 pjp0Var = (pjp0) this.c;
        float[] fArr = h8g.a;
        return h8g.d(pjp0Var, d);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 7:
                return ((Boolean) ((f6w) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((pmp0) this.c).invoke(obj)).booleanValue();
        }
    }
}
