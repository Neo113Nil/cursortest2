package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.superapp.api.dto.app.catalog.section.AppsCategory;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.qr.ui.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import xsna.it80;
import xsna.jhw0;
import xsna.kzw0;
import xsna.tj50;
import xsna.x7a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lcq0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ lcq0(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
    
        if (r7.b == true) goto L52;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                ClipUploadItem clipUploadItem = (ClipUploadItem) obj;
                ClipUploadItem.b bVar = clipUploadItem instanceof ClipUploadItem.b ? (ClipUploadItem.b) clipUploadItem : null;
                if (bVar != null) {
                    z = true;
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 1:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 2:
                it80.b.getClass();
                return it80.a.a();
            case 3:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                int i = 0;
                for (Object obj2 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    AppsCategory appsCategory = (AppsCategory) obj2;
                    arrayList.add(new x7a.d.b(appsCategory, i, appsCategory.e));
                    i = i2;
                }
                return arrayList;
            case 4:
                return Boolean.valueOf(((WeakReference) obj).get() != null);
            case 5:
                return Boolean.valueOf(((hfz) obj) instanceof AboutVideoItem.c);
            case 6:
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((jhw0.b) obj).f instanceof jhw0.d.a);
            case 8:
                return new a.b(((tj50.a) obj).a(xvw0.b, ao8.d));
            case 9:
                u6x0 u6x0Var = (u6x0) obj;
                return new kzw0.d.b(u6x0Var.b, u6x0Var.c);
            case 10:
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.r.getClass();
                OKVoipEngine.x().g((String) obj);
                return s3q0.a;
            case 11:
                return Boolean.valueOf(brm0.B(((StackTraceElement) obj).getClassName(), "android", false));
            default:
                it80.b.getClass();
                return it80.a.a();
        }
    }
}
