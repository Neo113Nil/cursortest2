package xsna;

import com.vk.bridges.ImageViewer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.s1c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class h7h implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h7h(List list, sdv sdvVar, ArrayList arrayList, a160 a160Var, ImageViewer.c cVar) {
        this.c = list;
        this.d = sdvVar;
        this.e = arrayList;
        this.f = a160Var;
        this.g = cVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<? extends r74> list;
        s1c0 s1c0Var;
        xah0 xah0Var;
        switch (this.b) {
            case 0:
                j7h j7hVar = (j7h) this.c;
                oap<ExtendedCommunityProfile, ? extends Group> oapVar = (oap) this.d;
                String str = (String) this.e;
                AdminLeaveAction adminLeaveAction = (AdminLeaveAction) this.g;
                String str2 = (String) this.f;
                ((Integer) obj).intValue();
                j7hVar.d(oapVar, str, adminLeaveAction, str2);
                break;
            default:
                List list2 = (List) this.c;
                sdv sdvVar = (sdv) this.d;
                List list3 = (List) this.e;
                a160 a160Var = (a160) this.f;
                ImageViewer.c cVar = (ImageViewer.c) this.g;
                VKList vKList = (VKList) obj;
                ArrayList arrayList = new ArrayList(c5g.u(vKList, 10));
                Iterator<T> it = vKList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new PhotoAttachment((Photo) it.next()));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    list2.add(new EntryAttachment((PhotoAttachment) it2.next(), null, null, null, 14, null));
                }
                a160 a160Var2 = sdvVar.G;
                if (a160Var2 == null) {
                    list = EmptyList.b;
                } else {
                    NewsEntry newsEntry = a160Var2.b;
                    NewsEntry newsEntry2 = a160Var2.a;
                    new a6a0();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    a160 a160Var3 = sdvVar.G;
                    s1c0 s1c0Var2 = a160Var3 != null ? a160Var3.n : null;
                    boolean z = s1c0Var2 != null ? s1c0Var2.H : true;
                    s1c0.a aVar = new s1c0.a();
                    aVar.j = false;
                    aVar.l = true;
                    aVar.H = z;
                    a160 a160Var4 = sdvVar.G;
                    if (a160Var4 != null && (s1c0Var = a160Var4.n) != null && (xah0Var = s1c0Var.q) != null) {
                        aVar.s = xah0Var;
                    }
                    s1c0 a = aVar.a();
                    int i = 0;
                    for (int size = arrayList.size(); i < size; size = size) {
                        ArrayList arrayList3 = arrayList2;
                        List list4 = list2;
                        s1c0 s1c0Var3 = a;
                        r74 c = a6a0.c(new vp10(newsEntry2, newsEntry, (PhotoAttachment) arrayList.get(i), 50, arrayList3.size(), EmptyList.b, a.q));
                        c.l = a160Var2.l;
                        c.n = s1c0Var3;
                        arrayList3.add(c);
                        i++;
                        a = s1c0Var3;
                        arrayList2 = arrayList3;
                        list2 = list4;
                    }
                    list = arrayList2;
                }
                List list5 = list2;
                if (list3 != null) {
                    list3.addAll(list);
                }
                sdvVar.N.n0(list);
                sdvVar.b7(list, false);
                if (vKList.isEmpty()) {
                    sdvVar.E.setTotalCount(Integer.valueOf(list5.size()));
                    a160Var.g = Integer.valueOf(list5.size());
                }
                if (cVar != null) {
                    cVar.c(arrayList);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ h7h(j7h j7hVar, oap oapVar, String str, AdminLeaveAction adminLeaveAction, String str2) {
        this.c = j7hVar;
        this.d = oapVar;
        this.e = str;
        this.g = adminLeaveAction;
        this.f = str2;
    }
}
