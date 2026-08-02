package xsna;

import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.profile.community.catalog.api.di.CommunitiesCatalogComponent;
import com.vk.protect.di.ProtectAppComponentImpl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import kotlin.Lazy;
import xsna.eil0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class n03 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n03(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((yx2) obj).b;
            case 1:
                return (PhotoEditorComponent) ((g8m) obj).a(fpf0.a(PhotoEditorComponent.class));
            case 2:
                return new ybs((vbs) obj);
            case 3:
                return ((CommunitiesCatalogComponent) ((LinksBridgeComponentImpl) obj).C.getValue()).a();
            case 4:
                qcy<Object>[] qcyVarArr = ProtectAppComponentImpl.i;
                nwy nwyVar = ((ProtectAppComponentImpl) obj).c;
                qcy<Object> qcyVar = ProtectAppComponentImpl.i[0];
                return new i8e0((Lazy) nwyVar.c());
            default:
                return new eil0.c(((eil0) obj).a);
        }
    }
}
