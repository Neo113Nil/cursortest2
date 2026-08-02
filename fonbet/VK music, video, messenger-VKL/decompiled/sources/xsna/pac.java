package xsna;

import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$CropEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$PhotoParams;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import xsna.dz40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pac implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pac(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio ratio;
        CropStatEvent.Format format;
        CropStatEvent.Format format2;
        MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio a;
        int i = this.b;
        MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio ratio2 = null;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                yvj yvjVar = (yvj) obj4;
                izs izsVar = (izs) obj3;
                dz40.d.C2771d c2771d = (dz40.d.C2771d) obj2;
                wh50 wh50Var = (wh50) obj;
                if (!jjc.d().a()) {
                    myc0.h(yvjVar, null, null, new cbc(izsVar, c2771d, wh50Var, null), 3);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            default:
                o6a0 o6a0Var = (o6a0) obj4;
                CropStatEvent.j jVar = (CropStatEvent.j) obj3;
                CropStatEvent.c cVar = (CropStatEvent.c) obj2;
                MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent = (MobileOfficialAppsCorePhotoEditorStat$CropEvent) obj;
                MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.MediaType c = o6a0Var.c();
                String a2 = o6a0Var.b.a();
                Integer valueOf = jVar != null ? Integer.valueOf(jVar.c) : null;
                Integer valueOf2 = jVar != null ? Integer.valueOf(jVar.d) : null;
                Integer valueOf3 = jVar != null ? Integer.valueOf(jVar.a) : null;
                if (jVar == null || (format2 = jVar.b) == null || (a = dik.a(format2)) == null) {
                    if (cVar != null && (format = cVar.a) != null) {
                        ratio2 = dik.a(format);
                    }
                    ratio = ratio2;
                } else {
                    ratio = a;
                }
                return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(c, a2, null, null, mobileOfficialAppsCorePhotoEditorStat$CropEvent, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsCorePhotoEditorStat$PhotoParams(null, null, null, null, valueOf3, null, null, null, null, null, null, null, ratio, valueOf2, valueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147454959, null), 32744, null);
        }
    }
}
