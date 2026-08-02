package xsna;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.bridges.ImageViewer;
import com.vk.core.files.ExternalDirType;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.pending.PendingDocumentAttachment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: DocumentThumbnailHolder.kt */
/* loaded from: classes4.dex */
public final class iun extends ufw<DocumentAttachment> implements View.OnClickListener {
    public static final /* synthetic */ int K = 0;
    public final FrescoImageView E;
    public final TextView F;
    public final StringBuilder G;
    public mun H;
    public ImageViewer.c<?> I;
    public e6o J;

    /* compiled from: DocumentThumbnailHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Boolean> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.gzs
        public final Boolean invoke() {
            return (Boolean) ((mcy) this.receiver).get();
        }
    }

    /* compiled from: DocumentThumbnailHolder.kt */
    public static final /* synthetic */ class b extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            iun iunVar = (iun) this.receiver;
            int i = iun.K;
            return Boolean.valueOf(iunVar.t);
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            iun iunVar = (iun) this.receiver;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = iun.K;
            iunVar.t = booleanValue;
        }
    }

    public iun(ViewGroup viewGroup, boolean z) {
        super(R.layout.attach_doc_thumb, viewGroup);
        FrescoImageView frescoImageView = (FrescoImageView) this.itemView.findViewById(R.id.att_doc_thumb);
        this.E = frescoImageView;
        this.F = (TextView) this.itemView.findViewById(R.id.att_doc_title);
        this.G = new StringBuilder();
        frescoImageView.setIgnoreTrafficSaverPredicate(new a(0, new b(this, iun.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0));
        dek0.b(frescoImageView, null, null, 6);
        View.OnClickListener onClickListener = this.J;
        if (onClickListener == null) {
            bpn0 bpn0Var = jjc.a;
            onClickListener = new q01(this, 2);
        }
        this.itemView.setOnClickListener(onClickListener);
        frescoImageView.setWithImageDownscale(z);
        if (!z) {
            frescoImageView.setFadeDuration(0);
        }
        frescoImageView.setPlaceholder(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o a2 = s6oVar.a(this, s6oVar.e);
        this.J = a2;
        this.itemView.setOnClickListener(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013a  */
    @Override // xsna.m56
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T6(Attachment attachment) {
        DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
        mun munVar = this.H;
        StringBuilder sb = this.G;
        FrescoImageView frescoImageView = this.E;
        TextView textView = this.F;
        if (munVar != null) {
            sb.setLength(0);
            boolean z = munVar.d;
            String str = munVar.c;
            if (z) {
                sr10 sr10Var = dy2.a;
                if (sr10Var != null ? sr10Var.h() : true) {
                    if (str != null) {
                        sb.append(str);
                    }
                    textView.setText(sb);
                    View view = this.itemView;
                    sb.setLength(0);
                    sb.append(v6(R.string.attach_document));
                    sb.append(' ');
                    sb.append(textView.getText());
                    view.setContentDescription(sb);
                    frescoImageView.setIgnoreTrafficSaverPredicate(new rjd(0, new jun(this, iun.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0, 1));
                    frescoImageView.setLocalImage(munVar.f);
                    frescoImageView.setRemoteImage((List<? extends fxj0>) munVar.g);
                    return;
                }
            }
            String s6 = dun.s6(munVar.e, this.itemView.getResources());
            if (str != null && str.length() != 0) {
                sb.append(str);
                sb.append(" · ");
            }
            sb.append(s6);
            textView.setText(sb);
            View view2 = this.itemView;
            sb.setLength(0);
            sb.append(v6(R.string.attach_document));
            sb.append(' ');
            sb.append(textView.getText());
            view2.setContentDescription(sb);
            frescoImageView.setIgnoreTrafficSaverPredicate(new rjd(0, new jun(this, iun.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0, 1));
            frescoImageView.setLocalImage(munVar.f);
            frescoImageView.setRemoteImage((List<? extends fxj0>) munVar.g);
            return;
        }
        sb.setLength(0);
        String str2 = documentAttachment.i;
        if ("gif".equals(str2)) {
            sr10 sr10Var2 = dy2.a;
            if (sr10Var2 != null ? sr10Var2.h() : true) {
                sb.append(str2.toUpperCase(Locale.ROOT));
                textView.setText(sb);
                View view3 = this.itemView;
                sb.setLength(0);
                sb.append(v6(R.string.attach_document));
                sb.append(' ');
                sb.append(textView.getText());
                view3.setContentDescription(sb);
                frescoImageView.setIgnoreTrafficSaverPredicate(new kun(0, new lun(0, this, iun.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0, 0));
                if (!(documentAttachment instanceof PendingDocumentAttachment)) {
                    frescoImageView.setLocalImage(new ImageSize(documentAttachment.h, documentAttachment.l, documentAttachment.m, null, (char) 0, false, 56, null));
                    frescoImageView.setRemoteImage((fxj0) null);
                    return;
                } else {
                    frescoImageView.setLocalImage((fxj0) null);
                    Image image = documentAttachment.s;
                    frescoImageView.setRemoteImage((List<? extends fxj0>) (image != null ? image.b : null));
                    return;
                }
            }
        }
        String s62 = dun.s6(documentAttachment.n, this.itemView.getResources());
        if (str2 != null && str2.length() != 0) {
            sb.append(str2.toUpperCase(Locale.ROOT));
            sb.append(" · ");
        }
        sb.append(s62);
        textView.setText(sb);
        View view32 = this.itemView;
        sb.setLength(0);
        sb.append(v6(R.string.attach_document));
        sb.append(' ');
        sb.append(textView.getText());
        view32.setContentDescription(sb);
        frescoImageView.setIgnoreTrafficSaverPredicate(new kun(0, new lun(0, this, iun.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0, 0));
        if (!(documentAttachment instanceof PendingDocumentAttachment)) {
        }
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        DocumentAttachment documentAttachment = (DocumentAttachment) this.C;
        if (documentAttachment == null || (str = documentAttachment.g) == null || str.length() == 0) {
            return;
        }
        PostInteract postInteract = this.w;
        if (postInteract != null) {
            postInteract.zb(PostInteract.Type.open_photo);
        }
        if (documentAttachment.Ib()) {
            ArrayList<AttachmentWithMedia> arrayList = new ArrayList<>(10);
            int X6 = X6(arrayList);
            Activity h = e3m.h(this.itemView.getContext());
            if (h != null) {
                this.I = ImageViewer.f(myc0.d(), X6, arrayList, h, new c(documentAttachment, this, X6), null, null, null, false, null, false, 4080);
                return;
            }
            return;
        }
        if (brm0.B(documentAttachment.g, "http", false)) {
            Uri parse = Uri.parse(documentAttachment.g);
            DownloadManager.Request request = new DownloadManager.Request(parse);
            String lastPathSegment = parse.getLastPathSegment();
            seq seqVar = com.vk.core.files.a.b;
            Context context = e43.a;
            ExternalDirType externalDirType = ExternalDirType.DOWNLOADS;
            seqVar.getClass();
            request.setDestinationUri(seq.c(context, lastPathSegment, externalDirType));
            request.setNotificationVisibility(1);
            request.allowScanningByMediaScanner();
            Object systemService = this.itemView.getContext().getSystemService("download");
            DownloadManager downloadManager = systemService instanceof DownloadManager ? (DownloadManager) systemService : null;
            if (downloadManager != null) {
                downloadManager.enqueue(request);
            }
        }
    }

    /* compiled from: DocumentThumbnailHolder.kt */
    public static final class c implements ImageViewer.a {
        public final yg5 a;
        public final boolean b;
        public final /* synthetic */ DocumentAttachment c;
        public final /* synthetic */ iun d;
        public final /* synthetic */ int e;

        public c(DocumentAttachment documentAttachment, iun iunVar, int i) {
            this.c = documentAttachment;
            this.d = iunVar;
            this.e = i;
            yg5 yg5Var = documentAttachment.t;
            this.a = yg5Var;
            this.b = yg5Var != null ? yg5Var.isPlaying() : false;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
            yg5 yg5Var = this.a;
            if (yg5Var != null) {
                yg5Var.pause();
            }
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            View c;
            iun iunVar = this.d;
            anw anwVar = iunVar.D;
            if (anwVar != null && (c = anwVar.c(i)) != null) {
                return c;
            }
            if (i == this.e) {
                return iunVar.E;
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
            anw anwVar = this.d.D;
            if (anwVar != null) {
                anwVar.e(i);
            }
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            iun iunVar = this.d;
            anw anwVar = iunVar.D;
            if (anwVar != null) {
                return anwVar.g();
            }
            Object parent = iunVar.itemView.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                return bwt0.F(view);
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            String a;
            anw anwVar = this.d.D;
            if (anwVar != null && (a = anwVar.a(i)) != null) {
                return a;
            }
            if (i == this.e) {
                return this.c.f;
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            yg5 yg5Var;
            if (!this.b || (yg5Var = this.a) == null) {
                return;
            }
            yg5Var.play();
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            anw anwVar = this.d.D;
            if (anwVar != null) {
                return anwVar.b();
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }
}
