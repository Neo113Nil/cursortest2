package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.api.base.Document;
import com.vk.bridges.ImageViewer;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import xsna.l8r;

/* compiled from: DocumentsUtils.kt */
/* loaded from: classes18.dex */
public final class gvn {
    public static final gvn a = new gvn();

    public static void a(gvn gvnVar, FragmentImpl fragmentImpl, int i, boolean z, int i2, int i3, int i4) {
        boolean z2 = (i4 & 8) != 0 ? true : z;
        int i5 = (i4 & 16) != 0 ? i : i2;
        if ((i4 & 32) != 0) {
            i3 = 111;
        }
        int i6 = i3;
        Context mo2getContext = fragmentImpl.mo2getContext();
        if (mo2getContext != null) {
            Intent h = rwi.d().h().h(mo2getContext, z2, i, i5, i6);
            LayoutInflater.Factory activity = fragmentImpl.getActivity();
            ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
            ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
            if (Y == null || !Y.q(101, h, fragmentImpl)) {
                fragmentImpl.startActivityForResult(h, 101, null);
            }
        }
    }

    public static void b(Context context, Uri uri, com.vk.movika.sdk.android.defaultplayer.interactive.a aVar, String str, String str2) {
        evn evnVar = new evn(context, uri, aVar, str, str2);
        ma maVar = new ma(11, context, aVar);
        if (gz80.a(34)) {
            evnVar.invoke();
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        permissionHelper.d(context, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, evnVar, maVar);
    }

    public static ArrayList c(int i, Intent intent) {
        ArrayList<Uri> parcelableArrayList;
        ArrayList<String> stringArrayListExtra;
        ArrayList arrayList = new ArrayList();
        if (i == 101) {
            Bundle bundleExtra = intent.getBundleExtra("result_attachments");
            if (bundleExtra != null && (parcelableArrayList = bundleExtra.getParcelableArrayList("result_files")) != null) {
                if (parcelableArrayList.isEmpty() || !drm0.D(((Uri) j5g.Y(parcelableArrayList)).toString(), "content://", false)) {
                    Iterator it = parcelableArrayList.iterator();
                    while (it.hasNext()) {
                        Uri uri = (Uri) it.next();
                        if (X3.i.b.equals(uri.getScheme()) || HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(uri.getScheme())) {
                            arrayList.add(d(uri));
                        }
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList(c5g.u(parcelableArrayList, 10));
                    for (Uri uri2 : parcelableArrayList) {
                        Context context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        arrayList2.add(Boolean.valueOf(arrayList.add(d(oeq0.f(uri2, Uri.fromFile(com.vk.core.files.a.i(context, uri2)))))));
                    }
                }
            }
        } else if (i == 103 && (stringArrayListExtra = intent.getStringArrayListExtra("files")) != null) {
            ArrayList arrayList3 = new ArrayList(c5g.u(stringArrayListExtra, 10));
            for (String str : stringArrayListExtra) {
                Serializer.c<PendingDocumentAttachment> cVar = PendingDocumentAttachment.CREATOR;
                Uri parse = Uri.parse(str);
                arrayList3.add(new PendingDocumentAttachment(com.vk.core.files.a.F(parse), str, ((dag0) com.vk.core.files.a.h.getValue()).a(parse), str, UserId.d, com.vk.upload.impl.a.d.getAndIncrement(), com.vk.core.files.a.E(parse)));
            }
            arrayList.addAll(arrayList3);
            return arrayList;
        }
        return arrayList;
    }

    public static PendingDocumentAttachment d(Uri uri) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        l8r.a a2 = l8r.a(context, uri);
        return new PendingDocumentAttachment(a2.a, uri.toString(), a2.b, (a2.d || a2.e) ? uri.toString() : "", UserId.d, com.vk.upload.impl.a.d.getAndIncrement(), a2.c);
    }

    public static void e(Document document, Activity activity, izs izsVar) {
        String str = document.n;
        if (str != null && str.length() != 0) {
            ImageViewer.f(myc0.d(), 0, Collections.singletonList(new DocumentAttachment(document)), activity, new a(document), null, null, null, false, null, false, 4080);
            return;
        }
        if (TextUtils.isEmpty(document.j)) {
            if (izsVar != null) {
                izsVar.invoke(document);
            }
        } else {
            xwk.d().getBrowser().f(activity, null, new LaunchContext(false, false, false, null, null, null, document, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108799), document.j);
        }
    }

    /* compiled from: DocumentsUtils.kt */
    public static final class a implements ImageViewer.a {
        public final /* synthetic */ Document a;

        public a(Document document) {
            this.a = document;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
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
            return this.a.l;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
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
        public final void a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
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
