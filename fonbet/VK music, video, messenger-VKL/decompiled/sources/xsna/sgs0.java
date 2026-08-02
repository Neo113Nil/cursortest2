package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.TemplateDraftData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import xsna.egg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class sgs0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ io.reactivex.rxjava3.core.y c;

    public /* synthetic */ sgs0(io.reactivex.rxjava3.core.y yVar, int i) {
        this.b = i;
        this.c = yVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.onSuccess((rbt0) obj);
                break;
            default:
                ((ClipsDraftPersistentStore) obj).getClass();
                egg0 m = ClipsDraftPersistentStore.m();
                ArrayList arrayList = new ArrayList(c5g.u(m, 10));
                Iterator it = m.iterator();
                while (true) {
                    ListIterator<T> listIterator = ((egg0.a) it).b;
                    if (!listIterator.hasPrevious()) {
                        this.c.onSuccess(arrayList);
                        break;
                    } else {
                        ClipsDraftVk clipsDraftVk = (ClipsDraftVk) listIterator.previous();
                        ClipsDraftCommonData clipsDraftCommonData = clipsDraftVk.b;
                        String str = clipsDraftCommonData.b;
                        int i = clipsDraftCommonData.h;
                        String str2 = clipsDraftCommonData.j;
                        String str3 = clipsDraftCommonData.e;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint a = wrp.a(clipsDraftCommonData.k);
                        TemplateDraftData templateDraftData = clipsDraftVk.c.i;
                        arrayList.add(new tce(str, str4, str2, i, a, templateDraftData != null ? templateDraftData.b : null));
                    }
                }
        }
        return s3q0.a;
    }
}
