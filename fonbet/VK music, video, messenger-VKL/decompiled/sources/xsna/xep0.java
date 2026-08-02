package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.video.ui.discovery.minimizable.dialog.about.g;
import java.util.List;
import xsna.a2x0;
import xsna.jhw0;
import xsna.sx40;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xep0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ xep0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((sx40) obj) instanceof sx40.y);
            case 1:
                return s3q0.a;
            case 2:
                return s3q0.a;
            case 3:
                return new g.a(((tj50.a) obj).a(com.vk.video.ui.discovery.minimizable.dialog.about.d.b, ao8.d));
            case 4:
                return ((com.vk.video.ui.discovery.minimizable.q) obj).f;
            case 5:
                return (UsersUserFullDto) j5g.Y((List) obj);
            case 6:
                return (GroupsGroupFullDto) j5g.Y((List) obj);
            case 7:
                return new l7w0((ViewGroup) obj);
            case 8:
                jhw0.b bVar = (jhw0.b) obj;
                return Boolean.valueOf((bVar.e instanceof jhw0.a.b) && ((bVar.d instanceof jhw0.f.d) || (bVar.f instanceof jhw0.d.c)));
            default:
                return a2x0.b.a;
        }
    }
}
