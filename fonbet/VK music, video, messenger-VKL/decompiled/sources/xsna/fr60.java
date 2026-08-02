package xsna;

import android.content.Context;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ikv0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fr60 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fr60(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                kr60 kr60Var = (kr60) this.c;
                kr60Var.c(new yo60.h(new NewsfeedExternalAction.c.e0((Post) this.d)));
                kr60Var.c(new yo60.g.c(R.string.post_removed_from_archive));
                break;
            case 1:
                Videos videos = (Videos) this.c;
                Context context = (Context) this.d;
                ce60.b.getClass();
                p870.f().e(153, videos);
                ArrayList<EntryAttachment> arrayList = videos.o;
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((EntryAttachment) it.next()).b);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof VideoAttachment) {
                            arrayList3.add(next);
                        }
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        wjs0.a(new fyr0(((VideoAttachment) it3.next()).k));
                    }
                }
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = ikv0.c.f.a;
                aVar.u = new ikv0.d(context.getString(R.string.wall_removed_from_main_clip), (String) null, (ikv0.d.a) null, 6);
                aVar.n();
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                hwp0 hwp0Var = (hwp0) this.d;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) ref$ObjectRef.element;
                if (cVar != null) {
                    hwp0Var.g.a(cVar);
                    break;
                }
                break;
        }
    }
}
