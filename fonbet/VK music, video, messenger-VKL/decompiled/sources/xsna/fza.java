package xsna;

import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachForMediaViewer;
import java.util.ArrayList;
import java.util.List;
import xsna.j5h;
import xsna.k8s;
import xsna.t8s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fza implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fza(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                gza gzaVar = (gza) this.d;
                List<? extends AttachForMediaViewer> list = (List) obj;
                List<? extends AttachForMediaViewer> list2 = (List) obj2;
                arrayList.addAll(0, list);
                arrayList.addAll(list2);
                ImageViewer.c<AttachForMediaViewer> cVar = gzaVar.e;
                if (cVar != null) {
                    cVar.b(list, list2);
                }
                break;
            case 1:
                List list3 = (List) this.c;
                izs izsVar = (izs) this.d;
                ((Integer) obj2).getClass();
                ave.c(ne7.I(1), (androidx.compose.runtime.a) obj, list3, izsVar);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((j5h.e) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                gzs gzsVar = (gzs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                pwl.b(ne7.I(1), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
            default:
                ((Integer) obj2).getClass();
                ((t8s.a) this.c).a((k8s.a) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fza(ArrayList arrayList, gza gzaVar) {
        this.b = 0;
        this.c = arrayList;
        this.d = gzaVar;
    }
}
