package xsna;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import xsna.qik;

/* compiled from: BlurredImagePostingHolder.kt */
/* loaded from: classes4.dex */
public class mh7 extends de6<w9a0> implements blc0 {
    public final boolean k;
    public final nh7 l;
    public final ImageView m;
    public final View n;
    public final TextView o;
    public x64 p;
    public final StringBuilder q;
    public final nwf0 r;
    public final av90 s;

    public mh7(int i, boolean z, qik.a aVar, View view) {
        super(view, i);
        this.k = z;
        nh7 oh7Var = z ? new oh7(aVar, this, view) : new ph7(view);
        this.l = oh7Var;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.wrapper);
        this.m = (ImageView) view.findViewById(R.id.attached_goods_indicator);
        this.n = view.findViewById(R.id.play_button);
        this.o = (TextView) view.findViewById(R.id.att_doc_title);
        this.q = new StringBuilder();
        this.r = new nwf0(frameLayout, new v01(this, 2));
        av90 av90Var = new av90(frameLayout);
        av90Var.b.setOnClickListener(new b6u(1, av90Var, new a06(this, 1)));
        av90Var.a.setOnClickListener(new i1(this, 2));
        this.s = av90Var;
        view.setOnClickListener(this);
        oh7Var.init();
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.r.a(z);
    }

    public final void Y2(boolean z) {
        this.s.c(z);
        f();
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.p = x64Var;
    }

    @Override // xsna.de6
    public final void b(Attachment attachment) {
        ImageView imageView = this.m;
        bwt0.p0(imageView, false);
        View view = this.n;
        bwt0.p0(view, false);
        bwt0.p0(this.o, false);
        boolean z = attachment instanceof PendingPhotoAttachment;
        nh7 nh7Var = this.l;
        if (z) {
            PendingPhotoAttachment pendingPhotoAttachment = (PendingPhotoAttachment) attachment;
            nh7Var.b(new ImageSize(pendingPhotoAttachment.f, pendingPhotoAttachment.g, pendingPhotoAttachment.h, null, (char) 0, false, 56, null));
            return;
        }
        if (attachment instanceof PendingDocumentAttachment) {
            PendingDocumentAttachment pendingDocumentAttachment = (PendingDocumentAttachment) attachment;
            nh7Var.b(new ImageSize(pendingDocumentAttachment.g, pendingDocumentAttachment.l, pendingDocumentAttachment.m, null, (char) 0, false, 56, null));
            e(pendingDocumentAttachment);
            return;
        }
        if (!(attachment instanceof PhotoAttachment)) {
            if (attachment instanceof DocumentAttachment) {
                DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
                Image image = documentAttachment.s;
                nh7Var.c(image != null ? image.b : null);
                e(documentAttachment);
                bwt0.p0(view, documentAttachment.V0());
                return;
            }
            return;
        }
        PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
        Photo photo = photoAttachment.l;
        nh7Var.a(photoAttachment);
        if (this.k) {
            ImageSize imageSize = photo.J;
            if (imageSize == null) {
                ArrayList arrayList = photo.y.b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (ImageSize.j.contains(Character.valueOf(((ImageSize) next).b))) {
                        arrayList2.add(next);
                    }
                }
                nh7Var.c(arrayList2);
            } else {
                nh7Var.c(Collections.singletonList(imageSize));
            }
        } else {
            ArrayList arrayList3 = photo.y.b;
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (ImageSize.j.contains(Character.valueOf(((ImageSize) next2).b))) {
                    arrayList4.add(next2);
                }
            }
            nh7Var.c(arrayList4);
        }
        bwt0.p0(imageView, !photo.x.isEmpty());
    }

    @Override // xsna.de6
    public final /* bridge */ /* synthetic */ void c(w9a0 w9a0Var) {
    }

    public final void e(DocumentAttachment documentAttachment) {
        StringBuilder sb = this.q;
        sb.setLength(0);
        String str = documentAttachment.i;
        if ("gif".equals(str)) {
            sr10 sr10Var = dy2.a;
            if (sr10Var != null ? sr10Var.h() : true) {
                sb.append(str.toUpperCase(Locale.ROOT));
                TextView textView = this.o;
                textView.setText(sb);
                bwt0.p0(textView, true);
            }
        }
        String s6 = dun.s6(documentAttachment.n, this.b.getResources());
        if (str != null && str.length() != 0) {
            sb.append(str.toUpperCase(Locale.ROOT));
            sb.append(" · ");
        }
        sb.append(s6);
        TextView textView2 = this.o;
        textView2.setText(sb);
        bwt0.p0(textView2, true);
    }

    public final void f() {
        av90 av90Var = this.s;
        this.b.setEnabled((av90Var.d || av90Var.c) ? false : true);
    }

    public final void f3(int i, int i2) {
        this.s.b(i, i2);
        f();
    }

    public final void i4(boolean z) {
        this.s.a(true);
        f();
    }

    @Override // xsna.de6, android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var = this.p;
        if (x64Var != null) {
            x64Var.a(this.d);
        } else {
            super.onClick(view);
        }
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
    }
}
