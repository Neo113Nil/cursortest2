package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.base.Document;
import com.vk.attachpicker.impl.AttachActivity;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.bridges.ImageViewer;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.dto.common.VideoFile;
import com.vk.dto.gift.CatalogedGift;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.polls.Poll;
import com.vk.pending.PendingStoryAttachment;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.story.api.media.StoryMediaData;
import com.vk.toggle.features.CoreFeatures;
import com.vk.webapp.fragments.GiftsCatalogFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommonWriteBarBridge.kt */
/* loaded from: classes7.dex */
public final class rng implements u0y0 {
    public final bpn0 a;

    public rng(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }

    @Override // xsna.u0y0
    public final m6r0 a() {
        return q6r0.f();
    }

    @Override // xsna.u0y0
    public final boolean b() {
        return Preference.j().getBoolean("sendByEnter", false);
    }

    @Override // xsna.u0y0
    public final void c(CatalogedGift catalogedGift, ArrayList arrayList, Context context) {
        int i = GiftsCatalogFragment.c0;
        GiftsCatalogFragment.b.b(context, Collections.singletonList(Integer.valueOf(catalogedGift.b.c)), arrayList, null, "sticker_longtap_suggestion", 40);
    }

    @Override // xsna.u0y0
    public final void d(Activity activity, PhotoAlbum photoAlbum) {
        oga0.a((oga0) this.a.getValue(), activity, photoAlbum, null, 28);
    }

    @Override // xsna.u0y0
    public final void e() {
        bzu.c = true;
    }

    @Override // xsna.u0y0
    public final mq4 f() {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        return a1wVar.r().h.a();
    }

    @Override // xsna.u0y0
    public final void g(Activity activity, Document document) {
        gvn.e(document, activity, null);
    }

    @Override // xsna.u0y0
    public final void h(FragmentImpl fragmentImpl, Bundle bundle) {
        CoreFeatures coreFeatures = CoreFeatures.ATTACH_ACTIVITY_DELEGATE;
        coreFeatures.getClass();
        Intent intent = new Intent(fragmentImpl.kn(), (Class<?>) (com.vk.toggle.b.A.a(coreFeatures) ? AttachActivity.class : DeprecatedAttachActivity.class));
        intent.putExtras(bundle);
        LayoutInflater.Factory activity = fragmentImpl.getActivity();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        if (Y == null || !Y.q(yup.TRANSACTION_TOO_LARGE, intent, fragmentImpl)) {
            fragmentImpl.startActivityForResult(intent, yup.TRANSACTION_TOO_LARGE, null);
        }
    }

    @Override // xsna.u0y0
    public final boolean i() {
        return ba3.b();
    }

    @Override // xsna.u0y0
    public final Poll j(int i, Intent intent) {
        if (i == 10009 && intent.hasExtra("poll")) {
            return (Poll) intent.getParcelableExtra("poll");
        }
        return null;
    }

    @Override // xsna.u0y0
    public final void k(Activity activity, String str) {
        maz.c(xwk.d().e(), activity, str, LaunchContext.A, null, null, 24);
    }

    @Override // xsna.u0y0
    public final void l(Context context, VideoFile videoFile) {
        fxc0.B().Y().k(context, videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : true, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
    }

    @Override // xsna.u0y0
    public final List<PendingStoryAttachment> m(Intent intent) {
        List<StoryMediaData> list;
        StoryMultiData storyMultiData = (StoryMultiData) intent.getParcelableExtra("story");
        if (storyMultiData == null || (list = storyMultiData.b) == null) {
            return EmptyList.b;
        }
        List<StoryMediaData> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (StoryMediaData storyMediaData : list2) {
            arrayList.add(new PendingStoryAttachment(storyMediaData, storyMultiData.d, storyMediaData.d));
        }
        return arrayList;
    }

    @Override // xsna.u0y0
    public final ImageViewer.ControlsOptions n() {
        return new ImageViewer.ControlsOptions(false, false, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
    }

    @Override // xsna.u0y0
    public final void o() {
        bzu.c = false;
    }

    @Override // xsna.u0y0
    public final boolean p(Intent intent) {
        return intent.hasExtra("story");
    }
}
