package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class jos implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jos(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                los losVar = (los) this.c;
                losVar.b.b(new buz(12, new pe1(25), new uog((kym0) obj, 2)), false);
                break;
            default:
                Throwable th = (Throwable) obj;
                ((rsg0) this.c).getClass();
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.R()) {
                        TreeSet treeSet = new TreeSet();
                        List<VKApiExecutionException> v = vKApiExecutionException.v();
                        if (v != null) {
                            Iterator<T> it = v.iterator();
                            while (it.hasNext()) {
                                treeSet.add(Integer.valueOf(((VKApiExecutionException) it.next()).s()));
                            }
                        }
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
