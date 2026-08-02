package xsna;

import android.os.Parcelable;
import androidx.recyclerview.widget.m;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.attachments.StereoRoomAttachment;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.common.posting.attachments.AttachmentsNewsEntry;
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
import xsna.s1c0;

/* compiled from: DefaultAttachmentAdapterChanger.kt */
/* loaded from: classes4.dex */
public final class val {
    public final pcc0 a;
    public final x64 b;
    public final ybc0 c;
    public final a2o d;
    public final s1c0 e = new s1c0.a().a();
    public final ArrayList f = new ArrayList();
    public a4d0 g;
    public final i2c0 h;
    public List<x04> i;
    public boolean j;

    /* compiled from: DefaultAttachmentAdapterChanger.kt */
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
            val valVar = val.this;
            if (!valVar.j) {
                return true;
            }
            valVar.j = false;
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

    public val(pcc0 pcc0Var, x64 x64Var, ybc0 ybc0Var, a2o a2oVar) {
        this.a = pcc0Var;
        this.b = x64Var;
        this.c = ybc0Var;
        this.d = a2oVar;
        new ArrayList();
        this.h = new i2c0(new pll(a2oVar), a2oVar);
        this.j = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(List<x04> list, List<x04> list2) {
        int i;
        int hashCode;
        String str;
        long j;
        boolean z;
        String str2;
        u1c0 u1c0Var;
        qor qorVar;
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
                a4d0 a4d0Var = this.g;
                if (a4d0Var != null) {
                    a4d0Var.R6(x04Var.a);
                }
                this.j = true;
            }
        }
        ArrayList arrayList3 = this.f;
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
            a4d0 a4d0Var2 = this.g;
            if (a4d0Var2 != null && (qorVar = a4d0Var2.G.n) != null) {
                qorVar.k(arrayList6);
            }
            this.j = true;
        }
        pcc0 pcc0Var = this.a;
        ListDataSet.ArrayListImpl<T> arrayListImpl = ((ListDataSet) pcc0Var.c).d;
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            x04 x04Var4 = (x04) it6.next();
            Parcelable parcelable = x04Var4.a;
            AttachmentsNewsEntry attachmentsNewsEntry = new AttachmentsNewsEntry(Collections.singletonList(parcelable));
            if (parcelable instanceof AlbumAttachment) {
                hashCode = ((AlbumAttachment) parcelable).h;
            } else if (parcelable instanceof PhotoAttachment) {
                hashCode = ((PhotoAttachment) parcelable).f;
            } else if (parcelable instanceof AudioAttachment) {
                hashCode = ((AudioAttachment) parcelable).f.b;
            } else if (parcelable instanceof VideoAttachment) {
                hashCode = ((VideoAttachment) parcelable).k.o0();
            } else if (parcelable instanceof cvz) {
                hashCode = ((cvz) parcelable).M3().ba().getId();
            } else if (parcelable instanceof DocumentAttachment) {
                hashCode = ((DocumentAttachment) parcelable).k;
            } else if (parcelable instanceof PollAttachment) {
                hashCode = ((PollAttachment) parcelable).f.b;
            } else if (parcelable instanceof GeoAttachment) {
                hashCode = ((GeoAttachment) parcelable).k;
            } else if (parcelable instanceof ArticleAttachment) {
                hashCode = ((ArticleAttachment) parcelable).f.b;
            } else {
                if (parcelable instanceof MarketAttachment) {
                    j = ((MarketAttachment) parcelable).f.b;
                } else if (parcelable instanceof MarketAlbumAttachment) {
                    hashCode = ((MarketAlbumAttachment) parcelable).f.b;
                } else if (parcelable instanceof NarrativeAttachment) {
                    hashCode = ((NarrativeAttachment) parcelable).f.b;
                } else if (parcelable instanceof LinkAttachment) {
                    String str3 = ((LinkAttachment) parcelable).f.b;
                    if (str3 != null) {
                        hashCode = str3.hashCode();
                    }
                    j = -1;
                } else if (parcelable instanceof SnippetAttachment) {
                    SnippetAttachment snippetAttachment = (SnippetAttachment) parcelable;
                    if (snippetAttachment.Fb() && (str = snippetAttachment.f.b) != null) {
                        hashCode = str.hashCode();
                    }
                    j = -1;
                } else if (parcelable instanceof PodcastAttachment) {
                    hashCode = ((PodcastAttachment) parcelable).f.b;
                } else if (parcelable instanceof AudioPlaylistAttachment) {
                    hashCode = ((AudioPlaylistAttachment) parcelable).f.b;
                } else if (parcelable instanceof GraffitiAttachment) {
                    hashCode = ((GraffitiAttachment) parcelable).f;
                } else if (parcelable instanceof StereoRoomAttachment) {
                    hashCode = ((StereoRoomAttachment) parcelable).f.b.hashCode();
                } else {
                    if (parcelable instanceof AudioArtistAttachment) {
                        hashCode = ((AudioArtistAttachment) parcelable).f.b.hashCode();
                    }
                    j = -1;
                }
                z = parcelable instanceof DocumentAttachment;
                if (z) {
                    List<String> list4 = bgc0.a;
                    if (!(parcelable == null ? false : bgc0.a.contains(((DocumentAttachment) parcelable).i))) {
                        DocumentAttachment documentAttachment = (DocumentAttachment) parcelable;
                        if (!documentAttachment.x5()) {
                            documentAttachment.h = "";
                        }
                    }
                }
                str2 = j + x04Var4.b;
                if ((!(parcelable instanceof SnippetAttachment) && ((SnippetAttachment) parcelable).Fb()) || (parcelable instanceof LinkAttachment)) {
                    ArrayList arrayList8 = new ArrayList();
                    List singletonList = Collections.singletonList(parcelable);
                    ArrayList arrayList9 = new ArrayList(c5g.u(singletonList, 10));
                    Iterator it7 = singletonList.iterator();
                    while (it7.hasNext()) {
                        arrayList9.add(new EntryAttachment((Attachment) it7.next(), null, null, null, 8, null));
                    }
                    this.h.e(arrayList8, arrayList9, attachmentsNewsEntry, attachmentsNewsEntry, null, null, this.e);
                    u1c0Var = (u1c0) j5g.Y(arrayList8);
                    u1c0Var.g = str2;
                } else if (z || !((DocumentAttachment) parcelable).x5()) {
                    u1c0Var = (u1c0) j5g.Y(this.h.o(Collections.singletonList(parcelable), attachmentsNewsEntry, attachmentsNewsEntry, "", null, this.e));
                    u1c0Var.g = str2;
                } else {
                    u1c0Var = (u1c0) j5g.Y(this.h.o(Collections.singletonList(parcelable), attachmentsNewsEntry, attachmentsNewsEntry, "", null, this.e));
                    u1c0Var.g = str2;
                    if (u1c0Var.c != 7) {
                        u1c0Var = lbs.c(u1c0Var, null, null, 7, 3);
                    }
                }
                arrayList7.add(u1c0Var);
            }
            j = hashCode;
            z = parcelable instanceof DocumentAttachment;
            if (z) {
            }
            str2 = j + x04Var4.b;
            if (!(parcelable instanceof SnippetAttachment)) {
            }
            if (z) {
            }
            u1c0Var = (u1c0) j5g.Y(this.h.o(Collections.singletonList(parcelable), attachmentsNewsEntry, attachmentsNewsEntry, "", null, this.e));
            u1c0Var.g = str2;
            arrayList7.add(u1c0Var);
        }
        ArrayList arrayList10 = new ArrayList(arrayList7);
        if (!arrayListImpl.isEmpty()) {
            arrayList10.add(0, j5g.Y(arrayListImpl));
        }
        m.d a2 = androidx.recyclerview.widget.m.a(new a(arrayListImpl, arrayList10), true);
        arrayListImpl.clear();
        arrayListImpl.addAll(arrayList10);
        a2.b(pcc0Var);
    }
}
