package xsna;

import android.content.SharedPreferences;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.video.VideoSave;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vk.newsfeed.common.posting.attachments.AttachmentsNewsEntry;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vk.upload.impl.tasks.VideoUploadTaskNew;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.BookingAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.lu9;

/* compiled from: AttachmentsPostingViewController.kt */
/* loaded from: classes4.dex */
public final class b94 implements jk6, qv9 {
    public final FragmentActivity b;
    public final UserId c;
    public final boolean d;
    public final clc0 e;
    public final jbc0 f;
    public final fhc0 g;
    public final PostingMetricsCreationEntryPoint h;
    public final zbc0 i;
    public final Object j;
    public final io.reactivex.rxjava3.disposables.b k;
    public final LinkedHashSet l;
    public final qcc0 m;
    public RecyclerView n;
    public boolean o;
    public z84 p;
    public final a q;
    public boolean r;
    public final ArrayList s;
    public z84 t;
    public final bpn0 u;

    /* compiled from: AttachmentsPostingViewController.kt */
    public final class a implements bd70<Attachment> {
        public a() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Attachment attachment) {
            Attachment attachment2 = attachment;
            if (i == 120) {
                b94.this.m.C.p2(attachment2, attachment2);
            }
        }
    }

    public b94(FragmentActivity fragmentActivity, UserId userId, shc0 shc0Var, boolean z, clc0 clc0Var, jbc0 jbc0Var, fhc0 fhc0Var, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint, ndc0 ndc0Var, zbc0 zbc0Var) {
        this.b = fragmentActivity;
        this.c = userId;
        this.d = z;
        this.e = clc0Var;
        this.f = jbc0Var;
        this.g = fhc0Var;
        this.h = postingMetricsCreationEntryPoint;
        this.i = zbc0Var;
        Lazy a2 = msy.a(LazyThreadSafetyMode.NONE, new hh1(this, 4));
        this.j = a2;
        vou vouVar = new vou(this);
        pn0 pn0Var = new pn0(this, shc0Var);
        this.k = new io.reactivex.rxjava3.disposables.b();
        this.l = new LinkedHashSet();
        qcc0 qcc0Var = new qcc0(vouVar, pn0Var, new z4(this, 6), new mh(this, 8), z ? zbc0Var : null, new defpackage.e(this, 6), new defpackage.f(this, 1), new c94(this), new wb7(zbc0Var), z, ndc0Var, (a2o) a2.getValue());
        u1c0 u1c0Var = new u1c0(5, new AttachmentsNewsEntry(EmptyList.b));
        if (z) {
            u1c0Var.g = "preview_holder";
        }
        qcc0Var.x0(u1c0Var);
        this.m = qcc0Var;
        this.q = new a();
        this.s = new ArrayList();
        this.u = new bpn0(new defpackage.g(this, 7));
    }

    @Override // xsna.qv9
    public final void b(boolean z) {
        pv9 pv9Var;
        b4d0 t2 = this.m.C.t2();
        if (t2 == null || (pv9Var = t2.O) == null) {
            return;
        }
        pv9Var.setVisibleSwitcherGridCarousel(z);
    }

    @Override // xsna.qv9
    public final void c(boolean z) {
        pv9 pv9Var;
        b4d0 t2 = this.m.C.t2();
        if (t2 == null || (pv9Var = t2.O) == null) {
            return;
        }
        pv9Var.a(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(List<? extends Attachment> list) {
        PreviewRatio previewRatio;
        Object next;
        List<? extends Attachment> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Attachment attachment = (Attachment) it.next();
            if (attachment instanceof GeoAttachment) {
                GeoAttachment geoAttachment = (GeoAttachment) attachment;
                String str = geoAttachment.h;
                geoAttachment.l = (str == null || str.length() == 0) ? 1 : 2;
                this.o = true;
            }
        }
        ArrayList arrayList = new ArrayList(list);
        int i = com.vkontakte.android.attachments.a.a;
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Attachment attachment2 = (Attachment) next2;
            if (attachment2 instanceof PendingPhotoAttachment) {
                PendingPhotoAttachment pendingPhotoAttachment = (PendingPhotoAttachment) attachment2;
                if (pendingPhotoAttachment.g != 0 && pendingPhotoAttachment.h != 0) {
                }
            }
            arrayList2.add(next2);
        }
        this.m.C.q2(arrayList2);
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Attachment attachment3 = (Attachment) it3.next();
            if (attachment3 instanceof ju90) {
                l((ju90) attachment3);
            }
        }
        z84 z84Var = this.p;
        if (z84Var != null) {
            qdc0 qdc0Var = z84Var.b;
            b94 b94Var = z84Var.c;
            if (z84Var.o) {
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    z84Var.x((Attachment) it4.next());
                }
            }
            lu9 lu9Var = z84Var.p;
            if (lu9Var != null) {
                int i2 = b94Var.i();
                j5d0 j5d0Var = lu9Var.b;
                lu9Var.n = i2;
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it5 = list2.iterator();
                while (true) {
                    previewRatio = null;
                    r14 = null;
                    r14 = null;
                    lu9.a aVar = null;
                    previewRatio = null;
                    previewRatio = null;
                    previewRatio = null;
                    previewRatio = null;
                    if (!it5.hasNext()) {
                        break;
                    }
                    Attachment attachment4 = (Attachment) it5.next();
                    if (!(attachment4 instanceof AlbumAttachment)) {
                        if (attachment4 instanceof PhotoAttachment) {
                            aVar = new lu9.a(((PhotoAttachment) attachment4).E0());
                        } else if (attachment4 instanceof PendingPhotoAttachment) {
                            PendingPhotoAttachment pendingPhotoAttachment2 = (PendingPhotoAttachment) attachment4;
                            aVar = new lu9.a(pendingPhotoAttachment2.g / pendingPhotoAttachment2.h);
                        } else if (attachment4 instanceof DocumentAttachment) {
                            Boolean b = lu9Var.d.b((DocumentAttachment) attachment4);
                            if (b != null ? b.booleanValue() : false) {
                                aVar = new lu9.a(fdi.u(attachment4));
                            }
                        }
                    }
                    if (aVar != null) {
                        arrayList3.add(aVar);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    lu9Var.a.h1(i2 > 1 && !lu9Var.g);
                    if (lu9Var.e == null) {
                        PreviewRatio b2 = j5d0Var.b(((lu9.a) j5g.Y(arrayList3)).a);
                        lu9Var.m = lu9.c(b2);
                        lu9Var.b(b2);
                        thk thkVar = lu9Var.k;
                        if (thkVar != null) {
                            thkVar.e = b2;
                        }
                        lu9Var.l = b2;
                    }
                    lu9Var.d();
                    thk thkVar2 = lu9Var.k;
                    if (thkVar2 != null) {
                        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                        Iterator it6 = arrayList3.iterator();
                        while (it6.hasNext()) {
                            arrayList4.add(j5d0Var.a(((lu9.a) it6.next()).a));
                        }
                        ArrayList arrayList5 = thkVar2.k;
                        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList4, 10));
                        Iterator it7 = arrayList4.iterator();
                        while (it7.hasNext()) {
                            PreviewRatio previewRatio2 = (PreviewRatio) it7.next();
                            arrayList6.add(Float.valueOf(previewRatio2.b() / previewRatio2.a()));
                        }
                        arrayList5.addAll(arrayList6);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it8 = arrayList5.iterator();
                        while (it8.hasNext()) {
                            Object next3 = it8.next();
                            Float valueOf = Float.valueOf(((Number) next3).floatValue());
                            Object obj = linkedHashMap.get(valueOf);
                            if (obj == null) {
                                obj = new ArrayList();
                                linkedHashMap.put(valueOf, obj);
                            }
                            ((List) obj).add(next3);
                        }
                        Iterator it9 = linkedHashMap.entrySet().iterator();
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (it9.hasNext()) {
                                int size = ((List) ((Map.Entry) next).getValue()).size();
                                do {
                                    Object next4 = it9.next();
                                    int size2 = ((List) ((Map.Entry) next4).getValue()).size();
                                    if (size < size2) {
                                        next = next4;
                                        size = size2;
                                    }
                                } while (it9.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry != null) {
                            if (arrayList5.size() <= 2) {
                                entry = null;
                            }
                            if (entry != null) {
                                if ((((List) entry.getValue()).size() * 100) / arrayList5.size() <= 50) {
                                    entry = null;
                                }
                                if (entry != null) {
                                    PreviewRatio a2 = thkVar2.c.a(((Number) entry.getKey()).floatValue());
                                    if (a2 != null && !a2.c()) {
                                        previewRatio = a2;
                                    }
                                }
                            }
                        }
                        PreviewRatio previewRatio3 = thkVar2.e;
                        if (previewRatio != null && previewRatio3 != null && !previewRatio.equals(previewRatio3)) {
                            SharedPreferences sharedPreferences = thkVar2.b;
                            h7v h7vVar = thkVar2.a;
                            int i3 = thkVar2.h;
                            int i4 = thkVar2.i;
                            if (!thkVar2.j && i4 < i3 && h7vVar.a(thkVar2.f)) {
                                thkVar2.j = true;
                                int i5 = i4 + 1;
                                if (i5 >= i3) {
                                    Hint hint = thkVar2.g;
                                    if (hint != null) {
                                        h7vVar.s(hint);
                                    }
                                    qaj0.c(sharedPreferences, "current_times_tooltip", 0);
                                } else {
                                    qaj0.c(sharedPreferences, "current_times_tooltip", Integer.valueOf(i5));
                                }
                                thkVar2.d.invoke(previewRatio);
                            }
                        }
                    }
                }
            }
            z84Var.n.a(b94Var.i());
            Iterator it10 = z84Var.q.iterator();
            while (it10.hasNext()) {
                ((c84) it10.next()).b(list);
            }
            qdc0Var.Ca();
            qdc0Var.Na();
        }
    }

    @Override // xsna.jk6
    public final void d3(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.posting_attachments_recycler_view);
        qcc0 qcc0Var = this.m;
        recyclerView.setAdapter(qcc0Var);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setNestedScrollingEnabled(false);
        new androidx.recyclerview.widget.r(new u84(qcc0Var)).l(recyclerView);
        recyclerView.addItemDecoration(new l2c0());
        this.n = recyclerView;
        if (this.d) {
            this.k.b(new io.reactivex.rxjava3.internal.operators.observable.z(this.e.a(), new lz(new tb(this, 10), 4)).subscribe(new ph3(new mz(this, 4), 1), new iu1(new com.vk.movika.sdk.base.observable.i(3), 4)));
        }
        ce60.b.getClass();
        p870.f().b(120, this.q);
        z84 z84Var = this.t;
        if (z84Var != null) {
            z84Var.onStart();
        }
    }

    public final void f(List<? extends Attachment> list) {
        if (!this.d) {
            d(list);
            return;
        }
        boolean z = this.r;
        ArrayList arrayList = this.s;
        if (!z) {
            arrayList.add(list);
        } else {
            d(list);
            arrayList.clear();
        }
    }

    public final List<Attachment> h() {
        return this.m.C.u();
    }

    public final int i() {
        qcc0 qcc0Var = this.m;
        ArrayList u = qcc0Var.C.u();
        int i = 0;
        if (u != null && u.isEmpty()) {
            return 0;
        }
        Iterator it = u.iterator();
        while (it.hasNext()) {
            if (qcc0Var.x.b((Attachment) it.next()) && (i = i + 1) < 0) {
                e43.s();
                throw null;
            }
        }
        return i;
    }

    public final boolean j() {
        List<Attachment> h = h();
        if (h != null && h.isEmpty()) {
            return false;
        }
        Iterator<T> it = h.iterator();
        while (it.hasNext()) {
            if (((Attachment) it.next()) instanceof ju90) {
                return true;
            }
        }
        return false;
    }

    public final void l(ju90<?> ju90Var) {
        com.vk.upload.impl.b bVar;
        boolean z = ju90Var instanceof PendingDocumentAttachment;
        UserId userId = this.c;
        if (z) {
            bVar = new com.vk.upload.impl.tasks.i(((PendingDocumentAttachment) ju90Var).g, userId, true, false);
        } else if (ju90Var instanceof PendingPhotoAttachment) {
            bVar = new com.vk.upload.impl.tasks.x(((PendingPhotoAttachment) ju90Var).f, userId);
        } else if (ju90Var instanceof PendingVideoAttachment) {
            PendingVideoAttachment pendingVideoAttachment = (PendingVideoAttachment) ju90Var;
            bVar = new VideoUploadTaskNew(pendingVideoAttachment.k.w9().Ab(VideoUrl.EXTERNAL_URL), pendingVideoAttachment.k.getTitle(), pendingVideoAttachment.k.j1(), VideoSave.Target.POST, this.c, "AttachmentsPostingViewController", null, true, null, null, null, null, null, null, 0L, null, false, false, false, 524096);
        } else {
            com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
            StringBuilder sb = new StringBuilder();
            new d94(0, ju90Var, qjg.class, "className", "className(Ljava/lang/Object;)Ljava/lang/String;", 1, 0);
            sb.append(d94.class.getCanonicalName());
            sb.append(" isn't supported");
            bVar2.a(new IllegalArgumentException(sb.toString()));
            bVar = null;
        }
        if (bVar != null) {
            bVar.h.getClass();
            int h = com.vk.upload.impl.a.h(bVar, (f94) this.u.getValue());
            ju90Var.O3(h);
            z84 z84Var = this.p;
            if (z84Var != null) {
                z84Var.a4(ju90Var, h);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void m(Attachment attachment) {
        this.m.C.n2(attachment);
        if (attachment instanceof GeoAttachment) {
            this.o = false;
        } else if (attachment instanceof PhotoAttachment) {
            this.l.remove(((PhotoAttachment) attachment).Hb());
        }
        z84 z84Var = this.p;
        if (z84Var != null) {
            qdc0 qdc0Var = z84Var.b;
            if (z84Var.o && (attachment instanceof PhotoAttachment)) {
                ((Map) z84Var.k.getValue()).remove(((PhotoAttachment) attachment).Hb());
            }
            Iterator it = z84Var.q.iterator();
            while (it.hasNext()) {
                ((c84) it.next()).a(attachment);
            }
            qdc0Var.Ca();
            qdc0Var.Na();
            z84Var.e.o(attachment, z84Var.i);
            if (attachment instanceof BookingAttachment) {
                qdc0Var.Di();
            }
        }
        if (attachment instanceof ju90) {
            com.vk.upload.impl.a.b(((ju90) attachment).S(), null);
        }
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        this.f.g();
    }

    @Override // xsna.jk6
    public final void onDestroyView() {
        ce60.b.getClass();
        p870.f().g(this.q);
        for (Parcelable parcelable : h()) {
            if (parcelable instanceof ju90) {
                com.vk.upload.impl.a.b(((ju90) parcelable).S(), null);
            }
        }
        this.k.e();
        z84 z84Var = this.t;
        if (z84Var != null) {
            z84Var.onStop();
        }
        this.n = null;
    }
}
