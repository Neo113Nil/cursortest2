package xsna;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.media.MediaUtils;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.qik;

/* compiled from: ExtendedImagesAdapter.kt */
/* loaded from: classes4.dex */
public final class qbq extends knw {
    public final x64 n;
    public final boolean o;
    public final List<Attachment> p;
    public final lbc0 q;
    public final qik.a r;
    public final wb7 s;
    public final boolean t;
    public ror u;
    public final ArrayList v;
    public final SparseArray<MediaUtils.f> w;

    public qbq(x64 x64Var, List list, lbc0 lbc0Var, qik.a aVar, wb7 wb7Var, boolean z) {
        super(new h170());
        this.n = x64Var;
        this.o = true;
        this.p = list;
        this.q = lbc0Var;
        this.r = aVar;
        this.s = wb7Var;
        this.t = z;
        this.v = new ArrayList();
        this.w = new SparseArray<>();
        this.e = false;
    }

    @Override // xsna.knw, xsna.b6y0
    public final int a() {
        List<Attachment> list = this.p;
        int i = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (this.s.b((Attachment) it.next()) && (i = i + 1) < 0) {
                e43.s();
                throw null;
            }
        }
        return i;
    }

    @Override // xsna.knw, xsna.b6y0
    public final void b(int i, e6y0 e6y0Var) {
        Attachment attachment = (Attachment) j5g.b0(i, this.p);
        boolean z = attachment instanceof PendingDocumentAttachment;
        int i2 = knw.k;
        int i3 = knw.j;
        if (z) {
            PendingDocumentAttachment pendingDocumentAttachment = (PendingDocumentAttachment) attachment;
            int i4 = pendingDocumentAttachment.l;
            if (i4 > 0) {
                i3 = i4;
            }
            e6y0Var.a = i3;
            int i5 = pendingDocumentAttachment.m;
            if (i5 > 0) {
                i2 = i5;
            }
            e6y0Var.b = i2;
            return;
        }
        if (attachment instanceof PendingPhotoAttachment) {
            PendingPhotoAttachment pendingPhotoAttachment = (PendingPhotoAttachment) attachment;
            int i6 = pendingPhotoAttachment.g;
            if (i6 > 0) {
                i3 = i6;
            }
            e6y0Var.a = i3;
            int i7 = pendingPhotoAttachment.h;
            if (i7 > 0) {
                i2 = i7;
            }
            e6y0Var.b = i2;
            return;
        }
        if (attachment instanceof PendingVideoAttachment) {
            PendingVideoAttachment pendingVideoAttachment = (PendingVideoAttachment) attachment;
            j(pendingVideoAttachment.s, pendingVideoAttachment.t, e6y0Var);
            return;
        }
        if (!(attachment instanceof VideoAttachment)) {
            super.b(i, e6y0Var);
            return;
        }
        VideoAttachment videoAttachment = (VideoAttachment) attachment;
        VideoUrlStorage w9 = videoAttachment.k.w9();
        VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
        if (w9.Ab(videoUrl) == null) {
            super.b(i, e6y0Var);
            return;
        }
        if (((Boolean) this.q.invoke()).booleanValue()) {
            j(videoAttachment.getWidth(), videoAttachment.getHeight(), e6y0Var);
            return;
        }
        String Ab = videoAttachment.k.w9().Ab(videoUrl);
        if (Ab == null) {
            return;
        }
        MediaUtils.f fVar = null;
        if (videoAttachment.k.H6()) {
            int intValue = videoAttachment.getId().intValue();
            SparseArray<MediaUtils.f> sparseArray = this.w;
            MediaUtils.f fVar2 = sparseArray.get(intValue);
            if (fVar2 != null) {
                fVar = fVar2;
            } else {
                MediaUtils.f d = MediaUtils.a.d(Ab);
                if (d != null) {
                    sparseArray.put(intValue, d);
                    fVar = d;
                }
            }
        }
        e6y0Var.a = fVar != null ? fVar.a : videoAttachment.getWidth();
        e6y0Var.b = fVar != null ? fVar.b : videoAttachment.getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0032  */
    @Override // xsna.knw, xsna.b6y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(int i) {
        int c;
        Attachment attachment = (Attachment) j5g.b0(i, this.p);
        if (!(attachment instanceof PendingDocumentAttachment)) {
            if (attachment instanceof PendingVideoAttachment) {
                c = 7;
            } else if (!(attachment instanceof PendingPhotoAttachment)) {
                c = attachment instanceof PhotoAttachment ? this.t ? 13 : super.c(i) : super.c(i);
            }
            if (c != 0) {
                if (c == 8) {
                    return 14;
                }
                if (c != 4 && c != 5) {
                    return c;
                }
            }
            return 13;
        }
        c = 14;
        if (c != 0) {
        }
        return 13;
    }

    @Override // xsna.knw
    public final List<Attachment> g() {
        return this.p;
    }

    @Override // xsna.knw, xsna.b6y0
    /* renamed from: i */
    public final de6 f(int i, ViewGroup viewGroup) {
        de6 ev90Var;
        if (i != 7) {
            boolean z = this.t;
            qik.a aVar = this.r;
            if (i == 13) {
                ev90Var = new mh7(13, z, aVar, z ? bwt0.I(R.layout.attach_dragable_image_posting_item, viewGroup, false) : bwt0.I(R.layout.attach_blurred_image_posting_item, viewGroup, false));
            } else if (i != 14) {
                ev90Var = super.f(i, viewGroup);
            } else {
                nu90 nu90Var = new nu90(14, z, aVar, z ? bwt0.I(R.layout.attach_dragable_image_posting_item, viewGroup, false) : bwt0.I(R.layout.attach_blurred_image_posting_item, viewGroup, false));
                nu90Var.Y2(true);
                ev90Var = nu90Var;
            }
        } else {
            ev90Var = new ev90(new com.vk.newsfeed.common.recycler.holders.i(viewGroup, false));
        }
        if (ev90Var == null) {
            return null;
        }
        x64 x64Var = this.n;
        if (x64Var != null && (ev90Var instanceof blc0)) {
            blc0 blc0Var = (blc0) ev90Var;
            blc0Var.D1(true);
            blc0Var.Z1(x64Var);
        }
        if (this.o) {
            this.v.add(ev90Var);
        }
        return ev90Var;
    }

    public final void j(int i, int i2, e6y0 e6y0Var) {
        if (a() == 1) {
            int i3 = iah0.f().widthPixels;
            e6y0Var.a = i3;
            e6y0Var.b = (i3 / 16) * 9;
        } else {
            if (i <= 0) {
                i = knw.l;
            }
            e6y0Var.a = i;
            if (i2 <= 0) {
                i2 = knw.m;
            }
            e6y0Var.b = i2;
        }
    }
}
