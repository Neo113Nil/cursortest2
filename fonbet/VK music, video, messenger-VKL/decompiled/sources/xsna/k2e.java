package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.vk.bridges.ImageViewer;
import com.vk.clips.viewer.impl.feed.view.list.item.controls.side.shares.fast.config.ClipsFastShareConfig$Strategy;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.views.gallery.HorizontalGalleryView;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.f9j0;
import xsna.l2f;
import xsna.q2e;
import xsna.s1c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class k2e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ k2e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<? extends r74> list;
        s1c0 s1c0Var;
        xah0 xah0Var;
        int i = this.b;
        int i2 = 10;
        int i3 = 1;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                q2e q2eVar = (q2e) obj5;
                View view = (View) obj4;
                VideoFile videoFile = (VideoFile) obj3;
                za zaVar = (za) obj2;
                q2e.a aVar = (q2e.a) j5g.b0(((Integer) obj).intValue(), (ArrayList) obj6);
                f9j0 f9j0Var = aVar != null ? aVar.a : null;
                if (f9j0Var instanceof f9j0.c) {
                    Context context = view.getContext();
                    final f9j0.c cVar = (f9j0.c) f9j0Var;
                    ClipsFastShareConfig$Strategy clipsFastShareConfig$Strategy = h2e.a;
                    final t3f t3fVar = q2eVar.b;
                    t3fVar.getClass();
                    io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.q3f
                        @Override // io.reactivex.rxjava3.functions.n
                        public final Object get() {
                            f9j0.c cVar2 = f9j0.c.this;
                            boolean z = cVar2 instanceof f9j0.c.b;
                            t3f t3fVar2 = t3fVar;
                            if (z) {
                                return t3fVar2.b.b(((f9j0.c.b) cVar2).a);
                            }
                            if (!(cVar2 instanceof f9j0.c.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f9j0.c.a aVar2 = (f9j0.c.a) cVar2;
                            if (aVar2 instanceof f9j0.c.a.C2858a) {
                                return t3fVar2.b.a(((f9j0.c.a.C2858a) cVar2).a);
                            }
                            if (aVar2 instanceof f9j0.c.a.b) {
                                return t3fVar2.b.b(((f9j0.c.a.b) cVar2).a);
                            }
                            if (aVar2 instanceof f9j0.c.a.d) {
                                return t3fVar2.b.b(((f9j0.c.a.d) cVar2).a);
                            }
                            if (aVar2 instanceof f9j0.c.a.C2859c) {
                                return t3fVar2.b.a(((f9j0.c.a.C2859c) cVar2).a);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                    }).o(Boolean.TRUE), new rj4(new l2e(q2eVar, cVar, videoFile, 0), 4));
                    l2f.a aVar2 = new l2f.a(context, null, 62, null);
                    zl0 zl0Var = new zl0(new dxh(aVar2, i3), 16);
                    a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    new io.reactivex.rxjava3.internal.operators.completable.w(sVar, zl0Var, lVar, kVar, kVar, kVar, kVar).h(new bi3(aVar2, i3)).i(new i22(new t9e(aVar2, i2), 14)).g(new oa4(aVar2, 2)).subscribe();
                } else if (f9j0Var instanceof f9j0.b) {
                    zaVar.invoke(view);
                } else if (!(f9j0Var instanceof f9j0.a) && f9j0Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                q2eVar.b();
                return s3q0.a;
            case 1:
                List list2 = (List) obj6;
                tdv tdvVar = (tdv) obj5;
                List list3 = (List) obj4;
                a160 a160Var = (a160) obj3;
                ImageViewer.c cVar2 = (ImageViewer.c) obj2;
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
                a160 a160Var2 = tdvVar.G;
                HorizontalGalleryView horizontalGalleryView = tdvVar.F;
                if (a160Var2 == null) {
                    list = EmptyList.b;
                } else {
                    NewsEntry newsEntry = a160Var2.b;
                    NewsEntry newsEntry2 = a160Var2.a;
                    new a6a0();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    s1c0.a aVar3 = new s1c0.a();
                    aVar3.j = false;
                    aVar3.l = true;
                    a160 a160Var3 = tdvVar.G;
                    if (a160Var3 != null && (s1c0Var = a160Var3.n) != null && (xah0Var = s1c0Var.q) != null) {
                        aVar3.s = xah0Var;
                    }
                    s1c0 a = aVar3.a();
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        ArrayList arrayList3 = arrayList2;
                        r74 c = a6a0.c(new vp10(newsEntry2, newsEntry, (PhotoAttachment) arrayList.get(i4), 50, arrayList3.size(), EmptyList.b, a.q));
                        c.l = a160Var2.l;
                        c.n = a;
                        arrayList3.add(c);
                        i4++;
                        arrayList2 = arrayList3;
                    }
                    list = arrayList2;
                }
                if (list3 != null) {
                    list3.addAll(list);
                }
                horizontalGalleryView.b(list, false);
                horizontalGalleryView.h.n0(list);
                if (vKList.isEmpty()) {
                    horizontalGalleryView.setTotalCount(Integer.valueOf(list2.size()));
                    a160Var.g = Integer.valueOf(list2.size());
                }
                if (cVar2 != null) {
                    cVar2.c(arrayList);
                }
                return s3q0.a;
            default:
                VideoAttachment videoAttachment = (VideoAttachment) obj6;
                com.vk.newsfeed.common.recycler.holders.h hVar = (com.vk.newsfeed.common.recycler.holders.h) obj5;
                Activity activity = (Activity) obj4;
                u1c0 u1c0Var = (u1c0) obj3;
                j5i j5iVar = (j5i) obj2;
                VideoFile videoFile2 = (VideoFile) obj;
                if (videoFile2 != null) {
                    videoAttachment.Ob(videoFile2);
                }
                if (videoFile2 != null) {
                    hVar.getClass();
                    com.vk.newsfeed.common.recycler.holders.h.a(activity, u1c0Var, videoAttachment, videoFile2, j5iVar);
                } else {
                    VideoFile videoFile3 = videoAttachment.k;
                    hVar.getClass();
                    com.vk.newsfeed.common.recycler.holders.h.a(activity, u1c0Var, videoAttachment, videoFile3, j5iVar);
                }
                return s3q0.a;
        }
    }
}
