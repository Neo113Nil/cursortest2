package xsna;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import java.util.ArrayList;

/* compiled from: MediaViewer.kt */
/* loaded from: classes4.dex */
public final class y020 implements j34 {
    public final /* synthetic */ x020 b;

    public y020(x020 x020Var) {
        this.b = x020Var;
    }

    @Override // xsna.j34
    public final void V2(Intent intent) {
        Uri uri;
        Parcelable parcelable;
        Object parcelableExtra;
        ArrayList parcelableArrayList;
        boolean[] booleanArray;
        x020 x020Var = this.b;
        PostingFragment postingFragment = x020Var.a;
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
        if (intent == null || !intent.hasExtra("ProcessedImage")) {
            com.vk.core.simplescreen.a aVar = x020Var.e;
            if (aVar != null) {
                aVar.a();
            }
            com.vk.core.simplescreen.a aVar2 = x020Var.e;
            if (aVar2 != null) {
                aVar2.dismiss();
                return;
            }
            return;
        }
        if (!z && uri != null) {
            uri2 = uri;
        }
        if (uri2 != null && !z && x020Var.b.j()) {
            ((ibc0) x020Var.c.invoke()).u().p();
        }
        PostingAction.MediaPicker.ReplaceAttachFromUri replaceAttachFromUri = new PostingAction.MediaPicker.ReplaceAttachFromUri(x020Var.j, uri2, z);
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
        x020Var.b(replaceAttachFromUri, availability);
        com.vk.core.simplescreen.a aVar3 = x020Var.e;
        if (aVar3 != null) {
            aVar3.a();
        }
        com.vk.core.simplescreen.a aVar4 = x020Var.e;
        if (aVar4 != null) {
            aVar4.dismiss();
        }
    }
}
