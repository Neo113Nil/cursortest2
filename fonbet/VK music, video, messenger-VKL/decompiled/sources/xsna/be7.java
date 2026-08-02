package xsna;

import com.vk.dto.photo.Photo;
import com.vk.feed.blacklist.impl.presentation.blacklist.a;
import com.vk.feed.blacklist.impl.presentation.blacklist.d;
import com.vk.feed.settings.impl.presentation.filtered.tab.b;
import com.vk.feed.settings.impl.presentation.filtered.tab.d;
import com.vk.feed.settings.impl.presentation.filtered.tab.f;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class be7 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ be7(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ke7 ke7Var = (ke7) this.c;
                a.b bVar = (a.b) this.d;
                com.vk.feed.blacklist.impl.presentation.blacklist.b bVar2 = (com.vk.feed.blacklist.impl.presentation.blacklist.b) this.e;
                int i = ke7Var.b + 1;
                int i2 = ke7Var.c + 1;
                ArrayList arrayList = new ArrayList(ke7Var.d);
                arrayList.add(bVar.c, bVar.b);
                bVar2.T(new d.b(arrayList, ke7Var.e, ke7Var.f, i, i2));
                break;
            case 1:
                Photo photo = (Photo) this.c;
                b810 b810Var = (b810) this.d;
                PhotoAttachment photoAttachment = (PhotoAttachment) this.e;
                photo.r = !photo.x.isEmpty();
                photo.l = false;
                b810Var.invoke(photo);
                Photo photo2 = photoAttachment.l;
                if (photo2.c == photo.c) {
                    photo2.x = photo.x;
                    break;
                }
                break;
            default:
                ti60 ti60Var = (ti60) this.c;
                b.c cVar = (b.c) this.d;
                com.vk.feed.settings.impl.presentation.filtered.tab.c cVar2 = (com.vk.feed.settings.impl.presentation.filtered.tab.c) this.e;
                int i3 = ti60Var.b + 1;
                ArrayList arrayList2 = new ArrayList(ti60Var.c);
                arrayList2.add(cVar.d, cVar.c);
                cVar2.V(new f.b.a(cVar2.g, i3));
                cVar2.T(new d.C1063d(arrayList2, i3));
                break;
        }
    }
}
