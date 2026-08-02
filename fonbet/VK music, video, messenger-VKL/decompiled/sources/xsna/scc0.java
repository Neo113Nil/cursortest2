package xsna;

import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.BookingAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.DonutLinkAttachment;
import com.vkontakte.android.attachments.EventAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MarketLinkAttachment;
import com.vkontakte.android.attachments.MarketMessageOwnerAttachment;
import com.vkontakte.android.attachments.MiniAppAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.fhc0;

/* compiled from: PostingAttachmentsHelper.kt */
/* loaded from: classes4.dex */
public final class scc0 {
    public final ikc0 a;
    public final fhc0.a b;
    public final v6j c;
    public final akc0 d;
    public final px30 e;
    public z84 f;
    public boolean g;
    public boolean h;
    public PostingMetricsCreationEntryPoint i = PostingMetricsCreationEntryPoint.Other;

    /* compiled from: PostingAttachmentsHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachmentType.values().length];
            try {
                iArr[AttachmentType.MESSAGE_TO_BC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachmentType.BOOKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttachmentType.MARKET_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public scc0(ikc0 ikc0Var, fhc0.a aVar, v6j v6jVar, akc0 akc0Var, px30 px30Var) {
        this.a = ikc0Var;
        this.b = aVar;
        this.c = v6jVar;
        this.d = akc0Var;
        this.e = px30Var;
    }

    public static boolean n(scc0 scc0Var) {
        ikc0 ikc0Var = scc0Var.a;
        if (ikc0Var.G6()) {
            return true;
        }
        PostingFragment postingFragment = ikc0Var.c;
        int i = ikc0Var.K;
        postingFragment.getClass();
        postingFragment.lo(postingFragment.getString(i == 1 ? R.string.attachments_limit_one : R.string.attachments_limit, Integer.valueOf(i)));
        return false;
    }

    public final void a(Attachment attachment) {
        boolean z = attachment instanceof GeoAttachment;
        ikc0 ikc0Var = this.a;
        if (!z && !ikc0Var.G6()) {
            PostingFragment postingFragment = ikc0Var.c;
            int i = ikc0Var.K;
            postingFragment.getClass();
            postingFragment.lo(postingFragment.getString(i == 1 ? R.string.attachments_limit_one : R.string.attachments_limit, Integer.valueOf(i)));
            return;
        }
        if (attachment instanceof LinkAttachment) {
            d((LinkAttachment) attachment, false);
        } else {
            boolean z2 = attachment instanceof EventAttachment;
            v6j v6jVar = this.c;
            if (z2) {
                EventAttachment eventAttachment = (EventAttachment) attachment;
                if (ikc0Var.G6() && l()) {
                    v6jVar.d(eventAttachment);
                }
            } else if (attachment instanceof DonutLinkAttachment) {
                DonutLinkAttachment donutLinkAttachment = (DonutLinkAttachment) attachment;
                if (ikc0Var.G6() && l()) {
                    v6jVar.d(donutLinkAttachment);
                }
            } else {
                v6jVar.d(attachment);
            }
        }
        r(Collections.singletonList(attachment), false);
    }

    public final void b(List<? extends Attachment> list) {
        Object obj;
        if (list.isEmpty() || !n(this)) {
            return;
        }
        List<? extends Attachment> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Attachment) obj) instanceof LinkAttachment) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Attachment attachment = (Attachment) obj;
        if (attachment != null) {
            d((LinkAttachment) attachment, true);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (!(((Attachment) obj2) instanceof LinkAttachment)) {
                arrayList.add(obj2);
            }
        }
        this.c.e(arrayList);
    }

    public final void c() {
        this.c.d(new BookingAttachment((String) this.e.invoke(Integer.valueOf(m())), null, 2, null));
    }

    public final void d(LinkAttachment linkAttachment, boolean z) {
        if (this.a.G6() && l()) {
            if (z) {
                r(Collections.singletonList(linkAttachment), false);
            }
            this.c.d(linkAttachment);
        }
    }

    public final void e() {
        this.c.d(new MarketLinkAttachment((String) this.e.invoke(Integer.valueOf(m())), null, 2, null));
    }

    public final void f() {
        MarketMessageOwnerAttachment marketMessageOwnerAttachment = new MarketMessageOwnerAttachment(null, (String) this.e.invoke(Integer.valueOf(m())), 1, null);
        this.c.d(marketMessageOwnerAttachment);
        r(Collections.singletonList(marketMessageOwnerAttachment), false);
    }

    public final void g(List<MusicTrack> list) {
        if (n(this)) {
            List<MusicTrack> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MusicTrack musicTrack = (MusicTrack) it.next();
                    z84 z84Var = this.f;
                    if (epx.f(z84Var != null ? Boolean.valueOf(z84Var.h0(musicTrack)) : null, Boolean.TRUE)) {
                        q();
                        break;
                    }
                }
            }
            List<? extends Attachment> A = rli0.A(new ulp0(rli0.j(new i5g(list2), new xka0(this, 3)), new u620(15)));
            this.c.e(A);
            r(A, false);
        }
    }

    public final void h(PhotoAttachment photoAttachment) {
        Photo photo = photoAttachment.l;
        if (n(this)) {
            z84 z84Var = this.f;
            if (z84Var != null) {
                ArrayList arrayList = (ArrayList) z84Var.u();
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Attachment attachment = (Attachment) it.next();
                        if (attachment instanceof PhotoAttachment) {
                            PhotoAttachment photoAttachment2 = (PhotoAttachment) attachment;
                            if (photoAttachment.f == photoAttachment2.f && epx.f(photoAttachment.g, photoAttachment2.g)) {
                                q();
                                return;
                            }
                        }
                    }
                }
            }
            if ((photo.r && o()) || p()) {
                if (this.h) {
                    f();
                }
                boolean z = this.g;
                ikc0 ikc0Var = this.a;
                if (z) {
                    ikc0Var.a(this.d.a(photo).subscribe(new hu50(new h440(this, 10), 10), new wnt(new ye40(10), 22)));
                }
                ikc0Var.A1(photoAttachment);
            } else {
                this.c.d(photoAttachment);
            }
            r(Collections.singletonList(photoAttachment), false);
        }
    }

    public final void i(List<String> list) {
        if (list.isEmpty() || !n(this)) {
            return;
        }
        ikc0 ikc0Var = this.a;
        if (list.size() + ikc0Var.v7() > ikc0Var.K) {
            PostingFragment postingFragment = ikc0Var.c;
            int i = ikc0Var.K;
            postingFragment.getClass();
            postingFragment.lo(postingFragment.getString(i == 1 ? R.string.attachments_limit_one : R.string.attachments_limit, Integer.valueOf(i)));
            list = list.subList(0, Math.max(ikc0Var.K - ikc0Var.v7(), 0));
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            z84 z84Var = this.f;
            if (!(z84Var != null ? z84Var.i0(str) : false)) {
                arrayList.add(new PendingPhotoAttachment(str));
            }
        }
        this.c.e(arrayList);
        if (p()) {
            f();
        }
    }

    public final void j(VideoFile videoFile) {
        if (n(this)) {
            z84 z84Var = this.f;
            if (z84Var != null ? z84Var.p0(videoFile) : false) {
                q();
                return;
            }
            VideoAttachment videoAttachment = new VideoAttachment(videoFile);
            ActionLink m1 = videoFile.m1();
            if (epx.f(m1 != null ? m1.c : null, "product") && o()) {
                e();
            }
            if (p()) {
                f();
            }
            this.c.d(videoAttachment);
            r(Collections.singletonList(videoAttachment), false);
        }
    }

    public final void k(List<String> list) {
        if (list.isEmpty() || !n(this)) {
            return;
        }
        ikc0 ikc0Var = this.a;
        if (list.size() + ikc0Var.v7() > ikc0Var.K) {
            PostingFragment postingFragment = ikc0Var.c;
            int i = ikc0Var.K;
            postingFragment.getClass();
            postingFragment.lo(postingFragment.getString(i == 1 ? R.string.attachments_limit_one : R.string.attachments_limit, Integer.valueOf(i)));
            list = list.subList(0, Math.max(ikc0Var.K - ikc0Var.v7(), 0));
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            z84 z84Var = this.f;
            PendingVideoAttachment d0 = z84Var != null ? z84Var.d0(str) : null;
            if (d0 != null) {
                arrayList.add(d0);
            }
        }
        this.c.e(arrayList);
        if (p()) {
            f();
        }
    }

    public final boolean l() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        z84 z84Var = this.f;
        if (z84Var != null) {
            ArrayList arrayList = (ArrayList) z84Var.u();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Attachment) it.next()) instanceof LinkAttachment) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        z84 z84Var2 = this.f;
        if (z84Var2 != null) {
            ArrayList arrayList2 = (ArrayList) z84Var2.u();
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (((Attachment) it2.next()) instanceof EventAttachment) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        z2 = false;
        z84 z84Var3 = this.f;
        if (z84Var3 != null) {
            ArrayList arrayList3 = (ArrayList) z84Var3.u();
            if (!arrayList3.isEmpty()) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    if (((Attachment) it3.next()) instanceof MiniAppAttachment) {
                        z3 = true;
                        break;
                    }
                }
            }
        }
        z3 = false;
        z84 z84Var4 = this.f;
        if (z84Var4 != null) {
            ArrayList arrayList4 = (ArrayList) z84Var4.u();
            if (!arrayList4.isEmpty()) {
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    if (((Attachment) it4.next()) instanceof SnippetAttachment) {
                        z4 = true;
                        break;
                    }
                }
            }
        }
        z4 = false;
        z84 z84Var5 = this.f;
        if (z84Var5 != null) {
            ArrayList arrayList5 = (ArrayList) z84Var5.u();
            if (!arrayList5.isEmpty()) {
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    if (((Attachment) it5.next()) instanceof DonutLinkAttachment) {
                        z5 = true;
                        break;
                    }
                }
            }
        }
        z5 = false;
        return (z || z2 || z3 || z4 || z5) ? false : true;
    }

    public final int m() {
        z84 z84Var = this.f;
        return (z84Var == null || !z84Var.b.od()) ? R.string.market_involvement_button : R.string.market_involvement_button_edit;
    }

    public final boolean o() {
        z84 z84Var;
        if (!this.g || (z84Var = this.f) == null) {
            return false;
        }
        List<Attachment> u = z84Var.u();
        if (u.isEmpty()) {
            return true;
        }
        Iterator<T> it = u.iterator();
        while (it.hasNext()) {
            if (((Attachment) it.next()) instanceof f010) {
                return false;
            }
        }
        return true;
    }

    public final boolean p() {
        z84 z84Var;
        if (!this.h || (z84Var = this.f) == null) {
            return false;
        }
        List<Attachment> u = z84Var.u();
        if (u.isEmpty()) {
            return true;
        }
        Iterator<T> it = u.iterator();
        while (it.hasNext()) {
            if (((Attachment) it.next()) instanceof f010) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        this.a.c.mo(R.string.dublicate_attachments_removed);
    }

    public final void r(List<? extends Attachment> list, boolean z) {
        for (Attachment attachment : list) {
            fhc0.a aVar = this.b;
            if (z) {
                if (attachment instanceof VideoAttachment) {
                    aVar.b((VideoAttachment) attachment, this.i);
                } else if (attachment instanceof PhotoAttachment) {
                    aVar.j((PhotoAttachment) attachment, this.i);
                }
            }
            if (attachment instanceof PollAttachment) {
                aVar.f((PollAttachment) attachment, this.i);
            } else if (attachment instanceof DocumentAttachment) {
                aVar.p((DocumentAttachment) attachment, this.i);
            } else if (attachment instanceof AudioPlaylistAttachment) {
                aVar.l((AudioPlaylistAttachment) attachment, this.i);
            } else if (attachment instanceof AudioAttachment) {
                aVar.h((AudioAttachment) attachment, this.i);
            } else if (attachment instanceof AlbumAttachment) {
                aVar.k((AlbumAttachment) attachment, this.i);
            } else if (attachment instanceof ArticleAttachment) {
                aVar.e((ArticleAttachment) attachment, this.i);
            } else if (attachment instanceof PhotoAttachment) {
                aVar.d((PhotoAttachment) attachment, this.i);
            } else if (attachment instanceof VideoAttachment) {
                aVar.i((VideoAttachment) attachment, this.i);
            } else if (attachment instanceof GeoAttachment) {
                aVar.a((GeoAttachment) attachment, this.i);
            } else if (attachment instanceof MarketAttachment) {
                aVar.g((MarketAttachment) attachment, this.i);
            } else if (attachment instanceof LinkAttachment) {
                aVar.c((LinkAttachment) attachment, this.i);
            } else if (attachment instanceof SnippetAttachment) {
                aVar.n((SnippetAttachment) attachment, this.i);
            } else if (attachment instanceof MarketMessageOwnerAttachment) {
                aVar.m((MarketMessageOwnerAttachment) attachment, this.i);
            }
        }
    }
}
