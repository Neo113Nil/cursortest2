package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.TemplateDraftData;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.a;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.profile.community.impl.ui.trust_mark.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import xsna.egg0;
import xsna.vmd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class l1e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ l1e(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((ClipsDraftPersistentStore) obj).getClass();
                egg0 m = ClipsDraftPersistentStore.m();
                ArrayList arrayList = new ArrayList(c5g.u(m, 10));
                Iterator it = m.iterator();
                while (true) {
                    ListIterator<T> listIterator = ((egg0.a) it).b;
                    if (!listIterator.hasPrevious()) {
                        this.c.invoke(j5g.D0(new xx8(3), arrayList));
                        break;
                    } else {
                        ClipsDraftVk clipsDraftVk = (ClipsDraftVk) listIterator.previous();
                        ClipsDraftCommonData clipsDraftCommonData = clipsDraftVk.b;
                        String str = clipsDraftCommonData.b;
                        String str2 = clipsDraftCommonData.j;
                        int i = clipsDraftCommonData.h;
                        TemplateDraftData templateDraftData = clipsDraftVk.c.i;
                        arrayList.add(new ido(str, str2, i, templateDraftData != null ? templateDraftData.b : null));
                    }
                }
            case 1:
                this.c.invoke(new c.f((String) obj));
                break;
            case 2:
                this.c.invoke(new a.c((String) obj));
                break;
            case 3:
                this.c.invoke((List) obj);
                break;
            default:
                this.c.invoke(new vmd.c((String) obj));
                break;
        }
        return s3q0.a;
    }
}
