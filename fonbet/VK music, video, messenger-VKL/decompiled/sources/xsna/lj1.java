package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.im.engine.internal.storage.delegates.dialogs.DialogWeightDb;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import xsna.f0s;
import xsna.ldm;
import xsna.xlm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class lj1 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lj1(oj1 oj1Var, UserId userId, int i) {
        this.d = userId;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                VKList vKList = (VKList) obj;
                if (!fkq0.d((UserId) this.d) && vKList.i() == 1 && vKList.size() == 1 && ((PhotoAlbum) j5g.Y(vKList)).z == 0 && !((PhotoAlbum) j5g.Y(vKList)).t) {
                    vKList = new VKList();
                }
                return new wia0(vKList, vKList.i(), this.c == 0);
            default:
                pdm pdmVar = (pdm) this.d;
                ldm i = pdmVar.i();
                e0w b = i.b.b();
                String str = i.a.a;
                String str2 = ldm.a.ID.getKey() + " = ?";
                int i2 = this.c;
                if (b.f(str, str2, new Integer[]{Integer.valueOf(i2)}) > 0) {
                    xlm d = pdmVar.d();
                    d.b.b().f(d.a.a, xlm.a.FOLDER_ID.getKey() + " = ?", new Integer[]{Integer.valueOf(i2)});
                    DialogWeightDb dialogWeightDb = pdmVar.d;
                    dialogWeightDb.b.b().f(dialogWeightDb.a.a, DialogWeightDb.Column.FOLDER_ID.getKey() + " = ?", new Integer[]{Integer.valueOf(i2)});
                    f0s l = pdmVar.l();
                    l.b.b().f(l.a.a, f0s.a.FOLDER_ID.getKey() + " = ?", new Integer[]{Integer.valueOf(i2)});
                    rey k = pdmVar.b.I0().k();
                    Iterable iterable = EmptyList.b;
                    String string = k.getString("folders_order");
                    if (string != null) {
                        iterable = f370.J(new JSONArray(string));
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : iterable) {
                        if (((Number) obj2).intValue() != i2) {
                            arrayList.add(obj2);
                        }
                    }
                    pdmVar.q(arrayList);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ lj1(pdm pdmVar, int i) {
        this.d = pdmVar;
        this.c = i;
    }
}
