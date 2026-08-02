package xsna;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.m;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.attachments.StereoRoomAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.common.posting.attachments.AttachmentsNewsEntry;
import com.vk.pending.PendingAudioAttachment;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.GraffitiAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Pair;
import xsna.s1c0;

/* compiled from: AttachmentAdapterChangerNew.kt */
/* loaded from: classes4.dex */
public final class q64 implements o64, s64 {
    public final qcc0 a;
    public final vou b;
    public final mh c;
    public final zbc0 d;
    public final ndc0 e;
    public final a2o f;
    public b4d0 j;
    public final i2c0 k;
    public List<x04> l;
    public final s1c0 g = new s1c0.a().a();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public boolean m = true;

    /* compiled from: AttachmentAdapterChangerNew.kt */
    public final class a extends m.b {
        public final List<u1c0> b;
        public final ArrayList c;

        public a(ListDataSet.ArrayListImpl arrayListImpl, ArrayList arrayList) {
            this.b = arrayListImpl;
            this.c = arrayList;
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areContentsTheSame(int i, int i2) {
            if (!epx.f(((u1c0) this.c.get(i2)).g, "preview_holder")) {
                return true;
            }
            q64 q64Var = q64.this;
            if (!q64Var.m) {
                return true;
            }
            q64Var.m = false;
            return false;
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areItemsTheSame(int i, int i2) {
            return epx.f(this.b.get(i).g, ((u1c0) this.c.get(i2)).g);
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getNewListSize() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getOldListSize() {
            return this.b.size();
        }
    }

    public q64(qcc0 qcc0Var, vou vouVar, mh mhVar, zbc0 zbc0Var, ndc0 ndc0Var, a2o a2oVar) {
        this.a = qcc0Var;
        this.b = vouVar;
        this.c = mhVar;
        this.d = zbc0Var;
        this.e = ndc0Var;
        this.f = a2oVar;
        this.k = new i2c0(new ph60(a2oVar), a2oVar);
    }

    @Override // xsna.s64
    public final void a() {
        List<x04> list = this.l;
        if (list != null) {
            c(this.d.c(this.h), list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01cc, code lost:
    
        if (r7.intValue() < 228) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList) {
        int hashCode;
        String str;
        long j;
        boolean equals;
        boolean z;
        u1c0 u1c0Var;
        CompactAttachmentStyle m;
        Image image;
        ArrayList arrayList2;
        DocumentAttachment documentAttachment;
        qcc0 qcc0Var = this.a;
        ListDataSet.ArrayListImpl<T> arrayListImpl = ((ListDataSet) qcc0Var.c).d;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x04 x04Var = (x04) it.next();
            FragmentActivity fragmentActivity = ((b94) this.c.c).b;
            Attachment attachment = x04Var.a;
            String str2 = x04Var.b;
            ArrayList o = e43.o(attachment);
            int i = com.vkontakte.android.attachments.a.a;
            Collections.sort(o);
            AttachmentsNewsEntry attachmentsNewsEntry = new AttachmentsNewsEntry(o);
            if (attachment instanceof AlbumAttachment) {
                hashCode = ((AlbumAttachment) attachment).h;
            } else if (attachment instanceof PhotoAttachment) {
                hashCode = ((PhotoAttachment) attachment).f;
            } else if (attachment instanceof PendingPhotoAttachment) {
                hashCode = ((PendingPhotoAttachment) attachment).i;
            } else if (attachment instanceof PendingAudioAttachment) {
                hashCode = ((PendingAudioAttachment) attachment).f.b;
            } else if (attachment instanceof AudioAttachment) {
                hashCode = ((AudioAttachment) attachment).f.b;
            } else if (attachment instanceof PendingVideoAttachment) {
                hashCode = ((PendingVideoAttachment) attachment).p;
            } else if (attachment instanceof VideoAttachment) {
                hashCode = ((VideoAttachment) attachment).k.o0();
            } else if (attachment instanceof PendingDocumentAttachment) {
                hashCode = ((PendingDocumentAttachment) attachment).k;
            } else if (attachment instanceof DocumentAttachment) {
                hashCode = ((DocumentAttachment) attachment).k;
            } else if (attachment instanceof PollAttachment) {
                hashCode = ((PollAttachment) attachment).f.b;
            } else if (attachment instanceof GeoAttachment) {
                hashCode = ((GeoAttachment) attachment).k;
            } else if (attachment instanceof ArticleAttachment) {
                hashCode = ((ArticleAttachment) attachment).f.b;
            } else {
                if (attachment instanceof MarketAttachment) {
                    j = ((MarketAttachment) attachment).f.b;
                } else if (attachment instanceof MarketAlbumAttachment) {
                    hashCode = ((MarketAlbumAttachment) attachment).f.b;
                } else if (attachment instanceof NarrativeAttachment) {
                    hashCode = ((NarrativeAttachment) attachment).f.b;
                } else if (attachment instanceof LinkAttachment) {
                    String str3 = ((LinkAttachment) attachment).f.b;
                    if (str3 != null) {
                        hashCode = str3.hashCode();
                    }
                    j = -1;
                } else if (attachment instanceof SnippetAttachment) {
                    SnippetAttachment snippetAttachment = (SnippetAttachment) attachment;
                    if (snippetAttachment.Fb() && (str = snippetAttachment.f.b) != null) {
                        hashCode = str.hashCode();
                    }
                    j = -1;
                } else if (attachment instanceof PodcastAttachment) {
                    hashCode = ((PodcastAttachment) attachment).f.b;
                } else if (attachment instanceof AudioPlaylistAttachment) {
                    hashCode = ((AudioPlaylistAttachment) attachment).f.b;
                } else if (attachment instanceof GraffitiAttachment) {
                    hashCode = ((GraffitiAttachment) attachment).f;
                } else if (attachment instanceof StereoRoomAttachment) {
                    hashCode = ((StereoRoomAttachment) attachment).f.b.hashCode();
                } else {
                    if (attachment instanceof AudioArtistAttachment) {
                        hashCode = ((AudioArtistAttachment) attachment).f.b.hashCode();
                    }
                    j = -1;
                }
                if ((attachment instanceof DocumentAttachment) && !cgc0.a(attachment)) {
                    documentAttachment = (DocumentAttachment) attachment;
                    if (!documentAttachment.x5()) {
                        documentAttachment.h = "";
                    }
                }
                equals = str2.equals("compact");
                String str4 = j + str2;
                z = attachment instanceof SnippetAttachment;
                ndc0 ndc0Var = this.e;
                if (((z || !((SnippetAttachment) attachment).Fb()) && !(attachment instanceof LinkAttachment)) || !ndc0Var.b) {
                    u1c0 u1c0Var2 = (u1c0) j5g.Y(this.k.o(Collections.singletonList(attachment), attachmentsNewsEntry, attachmentsNewsEntry, "", null, this.g));
                    if (equals) {
                        u1c0Var2.g = str4;
                    } else {
                        CompactAttachmentStyle m2 = atv0.m(attachment, fragmentActivity, ndc0Var);
                        if (m2 != null) {
                            u1c0Var = new k5i(u1c0Var2.a, u1c0Var2.b, PsExtractor.AUDIO_STREAM, attachment, m2);
                            u1c0Var.g = str4;
                        } else {
                            u1c0Var2.g = str4;
                        }
                    }
                    u1c0Var = u1c0Var2;
                } else {
                    if (!equals && !(attachment instanceof LinkAttachment) && z) {
                        Photo photo = ((SnippetAttachment) attachment).p;
                        m = null;
                        Integer g = (photo == null || (image = photo.y) == null || (arrayList2 = image.b) == null) ? null : ixj0.g(arrayList2);
                        if (g != null) {
                        }
                    }
                    m = atv0.m(attachment, fragmentActivity, ndc0Var);
                    CompactAttachmentStyle compactAttachmentStyle = m;
                    ArrayList arrayList4 = new ArrayList();
                    List singletonList = Collections.singletonList(attachment);
                    ArrayList arrayList5 = new ArrayList(c5g.u(singletonList, 10));
                    Iterator it2 = singletonList.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(new EntryAttachment((Attachment) it2.next(), compactAttachmentStyle, null, null, 8, null));
                    }
                    this.k.e(arrayList4, arrayList5, attachmentsNewsEntry, attachmentsNewsEntry, null, null, this.g);
                    u1c0Var = (u1c0) j5g.Y(arrayList4);
                    u1c0Var.g = str4;
                }
                arrayList3.add(u1c0Var);
            }
            j = hashCode;
            if (attachment instanceof DocumentAttachment) {
                documentAttachment = (DocumentAttachment) attachment;
                if (!documentAttachment.x5()) {
                }
            }
            equals = str2.equals("compact");
            String str42 = j + str2;
            z = attachment instanceof SnippetAttachment;
            ndc0 ndc0Var2 = this.e;
            if (z) {
            }
            u1c0 u1c0Var22 = (u1c0) j5g.Y(this.k.o(Collections.singletonList(attachment), attachmentsNewsEntry, attachmentsNewsEntry, "", null, this.g));
            if (equals) {
            }
            u1c0Var = u1c0Var22;
            arrayList3.add(u1c0Var);
        }
        ArrayList arrayList6 = new ArrayList(arrayList3);
        arrayList6.add(0, j5g.Y(arrayListImpl));
        m.d a2 = androidx.recyclerview.widget.m.a(new a(arrayListImpl, arrayList6), true);
        arrayListImpl.clear();
        arrayListImpl.addAll(arrayList6);
        a2.b(qcc0Var);
    }

    public final void c(List<x04> list, List<x04> list2) {
        int i;
        ror rorVar;
        List<x04> list3 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            if (!((x04) obj).c) {
                arrayList.add(obj);
            }
        }
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list3.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((x04) it.next()).c && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        if (i == 0) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((x04) obj2).c) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                x04 x04Var = (x04) it2.next();
                b4d0 b4d0Var = this.j;
                if (b4d0Var != null) {
                    b4d0Var.R6(x04Var.a);
                }
                this.m = true;
            }
        }
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((x04) it3.next()).a);
        }
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list3) {
            x04 x04Var2 = (x04) obj3;
            if (x04Var2.c && !list2.contains(x04Var2)) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            x04 x04Var3 = (x04) it4.next();
            Iterator it5 = arrayList3.iterator();
            int i2 = 0;
            while (true) {
                if (!it5.hasNext()) {
                    i2 = -1;
                    break;
                } else if (epx.f((Attachment) it5.next(), x04Var3.a)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                arrayList6.add(Integer.valueOf(i2));
            }
        }
        if (!arrayList6.isEmpty()) {
            b4d0 b4d0Var2 = this.j;
            if (b4d0Var2 != null && (rorVar = b4d0Var2.E.u) != null) {
                ArrayList arrayList7 = new ArrayList();
                qbq qbqVar = rorVar.p;
                if (qbqVar != null) {
                    int size = arrayList6.size();
                    for (int i3 = 0; i3 < size; i3++) {
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
            this.m = true;
        }
        b(arrayList);
    }

    @Override // xsna.o64
    public final boolean d(int i, int i2) {
        if (i != 0 && i2 != 0) {
            b4d0 b4d0Var = this.j;
            int a2 = b4d0Var != null ? b4d0Var.E.a() : 0;
            int i3 = (i + a2) - 1;
            int i4 = (a2 + i2) - 1;
            if (e(i3, i4)) {
                ArrayList arrayList = this.h;
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
        ArrayList arrayList = this.h;
        Attachment attachment2 = (Attachment) j5g.b0(i, arrayList);
        if (attachment2 == null || (attachment = (Attachment) j5g.b0(i2, arrayList)) == null) {
            return false;
        }
        return com.vkontakte.android.attachments.a.a(attachment2, attachment);
    }

    @Override // xsna.o64
    public final void n2(Attachment attachment) {
        b4d0 b4d0Var = this.j;
        if (b4d0Var != null) {
            b4d0Var.R6(attachment);
        }
        zbc0 zbc0Var = this.d;
        ArrayList arrayList = this.h;
        List c = zbc0Var.c(arrayList);
        arrayList.remove(attachment);
        c(zbc0Var.c(arrayList), c);
    }

    @Override // xsna.o64
    public final void o2(b4d0 b4d0Var) {
        this.j = b4d0Var;
    }

    @Override // xsna.o64
    public final void p2(Attachment attachment, Attachment attachment2) {
        ArrayList arrayList = this.h;
        int indexOf = arrayList.indexOf(attachment);
        if (indexOf < 0) {
            return;
        }
        arrayList.remove(indexOf);
        arrayList.add(indexOf, attachment2);
        List c = this.d.c(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : c) {
            if (!((x04) obj).c) {
                arrayList2.add(obj);
            }
        }
        int i = com.vkontakte.android.attachments.a.a;
        if (!(attachment2 instanceof eso0 ? true : attachment2 instanceof DocumentAttachment ? ((DocumentAttachment) attachment2).Ib() : false)) {
            b(arrayList2);
            return;
        }
        uuk uukVar = this.a.c;
        final k9 k9Var = new k9(attachment, 5);
        if (((ListDataSet) uukVar).w(new Predicate() { // from class: xsna.p64
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return ((Boolean) k9.this.invoke(obj2)).booleanValue();
            }
        }) > 0) {
            b(arrayList2);
            return;
        }
        b4d0 b4d0Var = this.j;
        if (b4d0Var != null) {
            b4d0Var.T6(attachment, attachment2);
        }
    }

    @Override // xsna.o64
    public final void q2(List<? extends Attachment> list) {
        zbc0 zbc0Var = this.d;
        ArrayList arrayList = this.h;
        List c = zbc0Var.c(arrayList);
        List c2 = zbc0Var.c(j5g.u0(list, arrayList));
        this.l = c2;
        c(c2, c);
    }

    @Override // xsna.o64
    public final ArrayList r2() {
        return this.i;
    }

    @Override // xsna.o64
    public final void s2(int i, int i2) {
        b4d0 b4d0Var = this.j;
        int a2 = b4d0Var != null ? b4d0Var.E.a() : 0;
        if (i >= a2 || i2 >= a2) {
            return;
        }
        this.b.d(i, i2);
        ArrayList arrayList = this.h;
        Attachment attachment = (Attachment) j5g.b0(i, arrayList);
        if (attachment != null) {
            arrayList.remove(attachment);
            arrayList.add(i2, attachment);
        }
    }

    @Override // xsna.o64
    public final b4d0 t2() {
        return this.j;
    }

    @Override // xsna.o64
    public final ArrayList u() {
        return this.h;
    }
}
