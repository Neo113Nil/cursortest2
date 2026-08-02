package xsna;

import com.ironsource.X3;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import xsna.aq90;

/* compiled from: ResourceFileSystem.kt */
/* loaded from: classes11.dex */
public final class sag0 extends Lambda implements gzs<List<? extends Pair<? extends tar, ? extends aq90>>> {
    final /* synthetic */ rag0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sag0(rag0 rag0Var) {
        super(0);
        this.this$0 = rag0Var;
    }

    @Override // xsna.gzs
    public final List<? extends Pair<? extends tar, ? extends aq90>> invoke() {
        int O;
        Pair pair;
        rag0 rag0Var = this.this$0;
        ClassLoader classLoader = rag0Var.b;
        wby wbyVar = rag0Var.c;
        ArrayList list = Collections.list(classLoader.getResources(""));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Pair pair2 = null;
            if (!it.hasNext()) {
                break;
            }
            URL url = (URL) it.next();
            if (epx.f(url.getProtocol(), X3.i.b)) {
                String str = aq90.c;
                pair2 = new Pair(wbyVar, aq90.a.b(new File(url.toURI())));
            }
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        ArrayList list2 = Collections.list(classLoader.getResources("META-INF/MANIFEST.MF"));
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String url2 = ((URL) it2.next()).toString();
            if (brm0.B(url2, "jar:file:", false) && (O = drm0.O(0, 6, url2, "!")) != -1) {
                String str2 = aq90.c;
                pair = new Pair(l6y0.c(aq90.a.b(new File(URI.create(url2.substring(4, O)))), wbyVar, tag0.i), rag0.e);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        return j5g.u0(arrayList2, arrayList);
    }
}
