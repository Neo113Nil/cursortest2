package xsna;

import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.common.posting.attachments.AttachmentsNewsEntry;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.s1c0;

/* compiled from: AttachmentAdapterChangerOld.kt */
/* loaded from: classes4.dex */
public final class r64 implements o64 {
    public final qcc0 a;
    public final vou b;
    public final mh c;
    public final ndc0 d;
    public final a2o e;
    public final s1c0 f = new s1c0.a().a();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public b4d0 i;
    public final i2c0 j;

    public r64(qcc0 qcc0Var, vou vouVar, mh mhVar, ndc0 ndc0Var, a2o a2oVar) {
        this.a = qcc0Var;
        this.b = vouVar;
        this.c = mhVar;
        this.d = ndc0Var;
        this.e = a2oVar;
        this.j = new i2c0(new ph60(a2oVar), a2oVar);
    }

    public static boolean c(Attachment attachment) {
        if ((attachment instanceof PendingPhotoAttachment) || (attachment instanceof PendingVideoAttachment)) {
            return true;
        }
        if (((attachment instanceof PhotoAttachment) && !(attachment instanceof AlbumAttachment)) || (attachment instanceof VideoAttachment)) {
            return true;
        }
        if (!(attachment instanceof DocumentAttachment)) {
            return false;
        }
        DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
        return documentAttachment.Ib() && !documentAttachment.x5();
    }

    public final void a(int i, boolean z) {
        u1c0 u1c0Var;
        qcc0 qcc0Var = this.a;
        u1c0 u1c0Var2 = (u1c0) qcc0Var.c.c(i);
        int i2 = z ? 46 : 238;
        int i3 = z ? 238 : 46;
        if (u1c0Var2.c == i2) {
            if (u1c0Var2 instanceof k5i) {
                k5i k5iVar = (k5i) u1c0Var2;
                NewsEntry newsEntry = k5iVar.a;
                u1c0Var = new k5i(newsEntry, newsEntry, i3, k5iVar.q, k5iVar.r);
            } else if (u1c0Var2 instanceof r74) {
                r74 r74Var = (r74) u1c0Var2;
                NewsEntry newsEntry2 = r74Var.a;
                u1c0Var = new r74(i3, r74Var.q, newsEntry2, newsEntry2);
            } else {
                u1c0Var = null;
            }
            if (u1c0Var != null) {
                qcc0Var.J0(i, u1c0Var);
            }
        }
    }

    public final void b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.g;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!c((Attachment) next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (c((Attachment) it2.next())) {
                    f(arrayList);
                    return;
                }
            }
        }
        if (arrayList.size() > 1) {
            f(arrayList);
            return;
        }
        qcc0 qcc0Var = this.a;
        uuk uukVar = qcc0Var.c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Attachment attachment = (Attachment) it3.next();
            Iterator it4 = ((ListDataSet) uukVar).d.iterator();
            int i = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i = -1;
                    break;
                }
                u1c0 u1c0Var = (u1c0) it4.next();
                r74 r74Var = u1c0Var instanceof r74 ? (r74) u1c0Var : null;
                if (epx.f(r74Var != null ? r74Var.q : null, attachment)) {
                    break;
                } else {
                    i++;
                }
            }
            if (!(attachment instanceof DocumentAttachment) || !((DocumentAttachment) attachment).x5()) {
                if (i != -1) {
                    u1c0 u1c0Var2 = (u1c0) uukVar.c(i);
                    if (u1c0Var2 instanceof k5i) {
                        k5i k5iVar = (k5i) u1c0Var2;
                        qcc0Var.J0(i, (u1c0) j5g.b0(0, this.j.o(Collections.singletonList(attachment), k5iVar.a, k5iVar.b, "", null, this.f)));
                    }
                }
            }
        }
    }

    @Override // xsna.o64
    public final boolean d(int i, int i2) {
        if (i != 0 && i2 != 0) {
            b4d0 b4d0Var = this.i;
            int a = b4d0Var != null ? b4d0Var.E.a() : 0;
            int i3 = (i + a) - 1;
            int i4 = (a + i2) - 1;
            if (e(i3, i4)) {
                ArrayList arrayList = this.g;
                arrayList.add(i4, (Attachment) arrayList.remove(i3));
                this.a.A0(i, i2);
                return true;
            }
        }
        return false;
    }

    @Override // xsna.o64
    public final boolean e(int i, int i2) {
        Attachment attachment;
        ArrayList arrayList = this.g;
        Attachment attachment2 = (Attachment) j5g.b0(i, arrayList);
        if (attachment2 == null || (attachment = (Attachment) j5g.b0(i2, arrayList)) == null) {
            return false;
        }
        return com.vkontakte.android.attachments.a.a(attachment2, attachment);
    }

    public final void f(ArrayList arrayList) {
        int i;
        CompactAttachmentStyle m;
        qcc0 qcc0Var = this.a;
        uuk uukVar = qcc0Var.c;
        FragmentActivity fragmentActivity = ((b94) this.c.c).b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Attachment attachment = (Attachment) it.next();
            Iterator it2 = ((ListDataSet) uukVar).d.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                u1c0 u1c0Var = (u1c0) it2.next();
                r74 r74Var = u1c0Var instanceof r74 ? (r74) u1c0Var : null;
                if (epx.f(r74Var != null ? r74Var.q : null, attachment)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            if (i != -1) {
                u1c0 u1c0Var2 = (u1c0) uukVar.c(i);
                if (!(u1c0Var2 instanceof k5i) && (m = atv0.m(attachment, fragmentActivity, this.d)) != null) {
                    qcc0Var.J0(i, new k5i(u1c0Var2.a, u1c0Var2.b, PsExtractor.AUDIO_STREAM, attachment, m));
                }
            }
        }
    }

    @Override // xsna.o64
    public final void n2(Attachment attachment) {
        List list;
        boolean c = c(attachment);
        qcc0 qcc0Var = this.a;
        if (c) {
            b4d0 b4d0Var = this.i;
            if (b4d0Var != null) {
                b4d0Var.R6(attachment);
            }
        } else {
            Iterator it = ((ListDataSet) qcc0Var.c).d.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                u1c0 u1c0Var = (u1c0) it.next();
                r74 r74Var = u1c0Var instanceof r74 ? (r74) u1c0Var : null;
                Attachment attachment2 = r74Var != null ? r74Var.q : null;
                if (attachment2 != null) {
                    list = Collections.singletonList(attachment2);
                } else {
                    w84 w84Var = u1c0Var instanceof w84 ? (w84) u1c0Var : null;
                    if (w84Var == null || (list = w84Var.q) == null) {
                        list = EmptyList.b;
                    }
                }
                if (list.contains(attachment)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                qcc0Var.D0(i);
            }
            if (attachment instanceof ju90) {
                g5g.D(this.h, true, new w5(attachment, 6));
            }
        }
        ArrayList arrayList = this.g;
        arrayList.remove(attachment);
        if (arrayList.size() == 1) {
            int itemCount = qcc0Var.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                a(i2, false);
            }
        }
        b();
    }

    @Override // xsna.o64
    public final void o2(b4d0 b4d0Var) {
        this.i = b4d0Var;
    }

    @Override // xsna.o64
    public final void p2(Attachment attachment, Attachment attachment2) {
        ArrayList arrayList = this.g;
        int indexOf = arrayList.indexOf(attachment);
        if (indexOf < 0) {
            return;
        }
        if (!c(attachment2)) {
            n2(attachment);
            q2(Collections.singletonList(attachment2));
            return;
        }
        arrayList.remove(indexOf);
        arrayList.add(indexOf, attachment2);
        b4d0 b4d0Var = this.i;
        if (b4d0Var != null) {
            b4d0Var.T6(attachment, attachment2);
        }
    }

    @Override // xsna.o64
    public final void q2(List<? extends Attachment> list) {
        int i;
        CompactAttachmentStyle m;
        int size;
        List<? extends Attachment> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (c((Attachment) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.g;
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            i = 0;
            while (it.hasNext()) {
                if (c((Attachment) it.next()) && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        boolean isEmpty = arrayList.isEmpty();
        qcc0 qcc0Var = this.a;
        if (!isEmpty) {
            b4d0 b4d0Var = this.i;
            int a = b4d0Var != null ? b4d0Var.E.a() : 0;
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Attachment attachment = (Attachment) it2.next();
                int b = com.vkontakte.android.attachments.a.b(attachment, arrayList2);
                arrayList2.add(b, attachment);
                arrayList3.add(new Pair(attachment, Integer.valueOf(b)));
            }
            if (a == 0) {
                ArrayList arrayList4 = new ArrayList(arrayList);
                int i2 = com.vkontakte.android.attachments.a.a;
                Collections.sort(arrayList4);
                AttachmentsNewsEntry attachmentsNewsEntry = new AttachmentsNewsEntry(arrayList4);
                u1c0 u1c0Var = (u1c0) j5g.b0(0, this.j.o(arrayList4, attachmentsNewsEntry, attachmentsNewsEntry, "", null, this.f));
                if (u1c0Var != null) {
                    qcc0Var.J0(0, u1c0Var);
                }
                size = arrayList4.size();
            } else {
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (c((Attachment) next)) {
                        arrayList5.add(next);
                    }
                }
                b4d0 b4d0Var2 = this.i;
                if (b4d0Var2 != null) {
                    ArrayList arrayList6 = new ArrayList(c5g.u(arrayList3, 10));
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        arrayList6.add(Integer.valueOf(((Number) ((Pair) it4.next()).j()).intValue()));
                    }
                    ror rorVar = b4d0Var2.E.u;
                    if (rorVar != null) {
                        ArrayList arrayList7 = new ArrayList();
                        qbq qbqVar = rorVar.p;
                        if (qbqVar != null) {
                            int size2 = arrayList6.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                int intValue = ((Number) arrayList6.get(i3)).intValue();
                                de6 f = qbqVar.f(qbqVar.c(intValue), rorVar);
                                if (f != null) {
                                    qbqVar.e(f, intValue);
                                    arrayList7.add(new Pair(f.b, Integer.valueOf(intValue)));
                                }
                            }
                        }
                        rorVar.c(arrayList7);
                    }
                }
                size = arrayList5.size();
            }
            i = size;
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj2 : list2) {
            if (!c((Attachment) obj2)) {
                arrayList8.add(obj2);
            }
        }
        if (!arrayList8.isEmpty()) {
            Iterator it5 = arrayList8.iterator();
            while (it5.hasNext()) {
                Attachment attachment2 = (Attachment) it5.next();
                int b2 = com.vkontakte.android.attachments.a.b(attachment2, arrayList2);
                arrayList2.add(b2, attachment2);
                List<? extends Attachment> singletonList = Collections.singletonList(attachment2);
                AttachmentsNewsEntry attachmentsNewsEntry2 = new AttachmentsNewsEntry(singletonList);
                u1c0 u1c0Var2 = (u1c0) j5g.b0(0, this.j.o(singletonList, attachmentsNewsEntry2, attachmentsNewsEntry2, "", null, this.f));
                if (u1c0Var2 != null) {
                    k5i k5iVar = ((attachment2 instanceof DocumentAttachment) && ((DocumentAttachment) attachment2).x5() && (m = atv0.m(attachment2, ((b94) this.c.c).b, this.d)) != null) ? new k5i(u1c0Var2.a, u1c0Var2.b, PsExtractor.AUDIO_STREAM, attachment2, m) : null;
                    if (k5iVar != null) {
                        u1c0Var2 = k5iVar;
                    }
                    qcc0Var.z0((b2 - i) + 1, u1c0Var2);
                }
            }
        }
        if (arrayList2.size() > 1) {
            int itemCount = qcc0Var.getItemCount();
            for (int i4 = 0; i4 < itemCount; i4++) {
                a(i4, true);
            }
        }
        b();
    }

    @Override // xsna.o64
    public final ArrayList r2() {
        return this.h;
    }

    @Override // xsna.o64
    public final void s2(int i, int i2) {
        b4d0 b4d0Var = this.i;
        int a = b4d0Var != null ? b4d0Var.E.a() : 0;
        if (i >= a || i2 >= a) {
            return;
        }
        this.b.d(i, i2);
        ArrayList arrayList = this.g;
        Attachment attachment = (Attachment) j5g.b0(i, arrayList);
        if (attachment != null) {
            arrayList.remove(attachment);
            arrayList.add(i2, attachment);
        }
    }

    @Override // xsna.o64
    public final b4d0 t2() {
        return this.i;
    }

    @Override // xsna.o64
    public final ArrayList u() {
        return this.g;
    }
}
