package xsna;

import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import xsna.afo;
import xsna.fg00;
import xsna.sst0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class wuh implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wuh(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037 A[SYNTHETIC] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Pair pair;
        boolean z;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((avh) this.c).q6((VideoCardViewState) this.d, (sst0.b) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                weo.g((afo.a) this.c, (dlv0) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 2:
                fg00.a aVar = (fg00.a) obj;
                Iterable iterable = ((en50) this.c).b;
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    Object obj3 = this.d;
                    if (!hasNext) {
                        xy0 xy0Var = new xy0(13, arrayList, this.e);
                        fg00<Input> fg00Var = fg00.this;
                        ac3 ac3Var = new ac3(xy0Var, fg00Var, obj3, 3);
                        fg00Var.c = ac3Var;
                        jd2.a.getClass();
                        jd2.a(ac3Var);
                        break;
                    } else {
                        scr scrVar = (scr) it.next();
                        Object invoke = scrVar.a.invoke(obj3);
                        if (obj2 != null) {
                            sq sqVar = scrVar.b;
                            Object invoke2 = scrVar.a.invoke(obj2);
                            switch (sqVar.b) {
                                case 9:
                                    z = !epx.f(invoke2, invoke);
                                    break;
                                default:
                                    eip eipVar = (eip) invoke2;
                                    eip eipVar2 = (eip) invoke;
                                    if (eipVar.a != eipVar2.a || eipVar.b != eipVar2.b || eipVar.c != eipVar2.c) {
                                        z = true;
                                        break;
                                    } else {
                                        z = false;
                                        break;
                                    }
                                    break;
                            }
                            if (!z) {
                                pair = null;
                                if (pair == null) {
                                    arrayList.add(pair);
                                }
                            }
                        }
                        pair = new Pair(scrVar, invoke);
                        if (pair == null) {
                        }
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((b8i0) this.c).i((p8i0) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wuh(en50 en50Var, Object obj, Object obj2) {
        this.b = 2;
        this.c = en50Var;
        this.d = obj;
        this.e = obj2;
    }
}
