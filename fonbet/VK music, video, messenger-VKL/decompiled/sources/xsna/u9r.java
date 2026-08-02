package xsna;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.base.Document;
import com.vk.attachpicker.base.metrics.AttachPickerTechMetricsSession;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.AttachmentType;
import com.vk.newsfeed.api.posting.attachments.PendingDocumentAttachmentWrapper;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.pending.PendingDocumentAttachment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: FilePickerBottomSheet.kt */
/* loaded from: classes4.dex */
public final class u9r extends com.google.android.material.bottomsheet.c implements w8i, j34 {
    public View A;
    public View B;
    public BottomSheetBehavior<View> C;
    public w9r z;
    public final bpn0 y = new bpn0(new zqf(this, 22));
    public final Object D = msy.a(LazyThreadSafetyMode.NONE, new wv0(15));

    public final void Fn(com.google.android.material.bottomsheet.b bVar, boolean z) {
        this.A = bVar.findViewById(R.id.coordinator);
        View findViewById = bVar.findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            BottomSheetBehavior<View> L = BottomSheetBehavior.L(findViewById);
            L.K = true;
            L.T(false);
            L.V(true);
            L.U(0.1f);
            L.D(new t9r(this));
            if (!z) {
                findViewById.post(new vb(L, 9));
            }
            this.C = L;
            f4m.n(-1, findViewById);
        } else {
            findViewById = null;
        }
        this.B = findViewById;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void Gn(Configuration configuration, float f) {
        View view;
        if (configuration.orientation != 2) {
            View view2 = this.A;
            if ((view2 != null ? view2.getBackground() : null) == null || (view = this.A) == null) {
                return;
            }
            view.setBackground(null);
            return;
        }
        View view3 = this.A;
        if (view3 != null) {
            ColorDrawable colorDrawable = (ColorDrawable) this.D.getValue();
            colorDrawable.setAlpha(f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : Math.round(Math.min(1.0f, f) * 0.5f * 255));
            view3.setBackground(colorDrawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    @Override // xsna.j34
    public final void V2(Intent intent) {
        AttachPickerTechMetricsSession attachPickerTechMetricsSession;
        Collection collection;
        w9r w9rVar;
        Parcelable parcelable;
        Object parcelableExtra;
        FileDto fileDto = null;
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("attachPickerTechMetrics", AttachPickerTechMetricsSession.class);
                parcelable = (Parcelable) parcelableExtra;
            } else {
                Parcelable parcelableExtra2 = intent.getParcelableExtra("attachPickerTechMetrics");
                if (!(parcelableExtra2 instanceof AttachPickerTechMetricsSession)) {
                    parcelableExtra2 = null;
                }
                parcelable = (AttachPickerTechMetricsSession) parcelableExtra2;
            }
            attachPickerTechMetricsSession = (AttachPickerTechMetricsSession) parcelable;
        } else {
            attachPickerTechMetricsSession = null;
        }
        w9r w9rVar2 = this.z;
        if (w9rVar2 != null) {
            w9rVar2.ne(attachPickerTechMetricsSession != null ? attachPickerTechMetricsSession.b : null, attachPickerTechMetricsSession != null ? attachPickerTechMetricsSession.c : null);
        }
        ArrayList parcelableArrayListExtra = intent != null ? Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("mDocuments", Document.class) : intent.getParcelableArrayListExtra("mDocuments") : null;
        ArrayList parcelableArrayListExtra2 = intent != null ? Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("documents", PendingDocumentAttachment.class) : intent.getParcelableArrayListExtra("documents") : null;
        if (parcelableArrayListExtra2 == null || parcelableArrayListExtra2.isEmpty()) {
            collection = EmptyList.b;
        } else {
            collection = new ArrayList(c5g.u(parcelableArrayListExtra2, 10));
            Iterator it = parcelableArrayListExtra2.iterator();
            while (it.hasNext()) {
                collection.add(new PendingDocumentAttachmentWrapper((PendingDocumentAttachment) it.next()));
            }
        }
        if ((parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) && collection.isEmpty()) {
            BottomSheetBehavior<View> bottomSheetBehavior = this.C;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.X(5);
                return;
            }
            return;
        }
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            Document document = (Document) parcelableArrayListExtra.get(0);
            if (epx.f(document.m, "gif")) {
                fileDto = new FileDto.Gif(document.b, document.l, null, document.g, document.h, document.o, null, new DocumentAttachment(document), document.g, 64, null);
            } else {
                int i = document.b;
                String str = document.l;
                long j = document.g;
                fileDto = new FileDto.Doc(i, str, null, j, document.h, document.o, null, j, 64, null);
            }
        } else if (!collection.isEmpty()) {
            PendingDocumentAttachmentWrapper pendingDocumentAttachmentWrapper = (PendingDocumentAttachmentWrapper) collection.get(0);
            UploadDto.UploadStep.Idle idle = UploadDto.UploadStep.Idle.b;
            PendingDocumentAttachment pendingDocumentAttachment = pendingDocumentAttachmentWrapper.v;
            UploadDto.UploadState uploadState = new UploadDto.UploadState(idle, pendingDocumentAttachment.g, pendingDocumentAttachment.v, 0, 0, AttachmentType.DOCUMENT, null, false, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, null);
            int i2 = pendingDocumentAttachmentWrapper.k;
            String str2 = pendingDocumentAttachmentWrapper.f;
            Integer valueOf = Integer.valueOf(R.string.picker_loading);
            long j2 = pendingDocumentAttachmentWrapper.n;
            fileDto = new FileDto.Doc(i2, str2, valueOf, j2, pendingDocumentAttachmentWrapper.o, pendingDocumentAttachmentWrapper.j, uploadState, j2);
        }
        if (fileDto != null && (w9rVar = this.z) != null) {
            w9rVar.Wg(fileDto);
        }
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.C;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.X(5);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Gn(configuration, 1.0f);
    }

    @Override // com.google.android.material.bottomsheet.c, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        yn.setContentView(R.layout.file_picker_wrapper);
        Window window = yn.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        if (bundle == null) {
            final com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) yn;
            yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.s9r
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    FragmentImpl b;
                    u9r u9rVar = u9r.this;
                    u9rVar.Fn(bVar, false);
                    if (u9rVar.getChildFragmentManager().T()) {
                        return;
                    }
                    b = ((tun) u9rVar.y.getValue()).b(null, 1, 1, true, true, true, (r11 & 64) == 0);
                    FragmentManager childFragmentManager = u9rVar.getChildFragmentManager();
                    childFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                    aVar.g(R.id.file_picker_container, b, null);
                    aVar.k(false);
                }
            });
            return yn;
        }
        Fn((com.google.android.material.bottomsheet.b) yn, true);
        if (this.z == null) {
            z1h0 parentFragment = getParentFragment();
            this.z = parentFragment instanceof w9r ? (w9r) parentFragment : null;
        }
        return yn;
    }
}
