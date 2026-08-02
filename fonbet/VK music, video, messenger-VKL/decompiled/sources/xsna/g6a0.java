package xsna;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import xsna.g760;
import xsna.xn50;

/* compiled from: PhotoEditorDelegate.kt */
/* loaded from: classes4.dex */
public final class g6a0 implements g760.a {
    public final /* synthetic */ i6a0 a;

    public g6a0(i6a0 i6a0Var) {
        this.a = i6a0Var;
    }

    @Override // xsna.g760.a
    public final void V2(Intent intent) {
        Uri uri;
        Parcelable parcelable;
        Object parcelableExtra;
        ArrayList parcelableArrayList;
        boolean[] booleanArray;
        i6a0 i6a0Var = this.a;
        PostingFragment postingFragment = i6a0Var.a;
        ActionsAvailabilityState.Availability availability = null;
        Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_attachments") : null;
        boolean z = false;
        if (bundleExtra != null && (booleanArray = bundleExtra.getBooleanArray("result_video_flags")) != null) {
            z = epx.f(booleanArray.length == 0 ? null : Boolean.valueOf(booleanArray[0]), Boolean.TRUE);
        }
        Uri uri2 = (bundleExtra == null || (parcelableArrayList = bundleExtra.getParcelableArrayList("result_files")) == null) ? null : (Uri) j5g.a0(parcelableArrayList);
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("edited_content_uri", Uri.class);
                parcelable = (Parcelable) parcelableExtra;
            } else {
                Parcelable parcelableExtra2 = intent.getParcelableExtra("edited_content_uri");
                if (!(parcelableExtra2 instanceof Uri)) {
                    parcelableExtra2 = null;
                }
                parcelable = (Uri) parcelableExtra2;
            }
            uri = (Uri) parcelable;
        } else {
            uri = null;
        }
        if (!z && uri != null) {
            uri2 = uri;
        }
        if (uri2 != null && !z) {
            ((ibc0) i6a0Var.b.invoke()).u().p();
        }
        PostingAction.MediaPicker.ReplaceAttachFromUri replaceAttachFromUri = new PostingAction.MediaPicker.ReplaceAttachFromUri(i6a0Var.f, uri2, z);
        if (z) {
            efc0 feature = postingFragment.getFeature();
            if (feature != null) {
                availability = efc0.f0(feature);
            }
        } else {
            efc0 feature2 = postingFragment.getFeature();
            if (feature2 != null) {
                availability = efc0.W(feature2);
            }
        }
        if (availability instanceof ActionsAvailabilityState.Availability.NotAvailable) {
            PostingUserMessage postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b;
            if (postingUserMessage != null) {
                xn50.a.c(postingFragment, new PostingAction.ShowMessage(postingUserMessage, replaceAttachFromUri, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
            }
        } else {
            xn50.a.c(postingFragment, replaceAttachFromUri);
        }
        com.vk.core.simplescreen.a aVar = i6a0Var.d;
        if (aVar != null) {
            aVar.a();
        }
        com.vk.core.simplescreen.a aVar2 = i6a0Var.d;
        if (aVar2 != null) {
            aVar2.dismiss();
        }
    }
}
