package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.clips.SdkNewsMonotheme;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.common.recycler.holders.clips.ClipActionButtonStateRepository;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.Collections;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: ClipOpenDelegate.kt */
/* loaded from: classes4.dex */
public final class p8d implements s0t0 {
    public final Context b;
    public final ClipsRouter c;
    public final zof d;
    public final MutablePropertyReference0Impl e;
    public final ClipActionButtonStateRepository f;
    public final boolean g;

    public p8d(Context context, ClipsRouter clipsRouter, zof zofVar, MutablePropertyReference0Impl mutablePropertyReference0Impl, ClipActionButtonStateRepository clipActionButtonStateRepository, boolean z) {
        this.b = context;
        this.c = clipsRouter;
        this.d = zofVar;
        this.e = mutablePropertyReference0Impl;
        this.f = clipActionButtonStateRepository;
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0039  */
    @Override // xsna.s0t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(fh5 fh5Var) {
        boolean z;
        SdkVideoFile c;
        SdkClipVideoFile sdkClipVideoFile;
        ClipFeedTab.WithPayload.Payload payload;
        ClipFeedTab singleClip;
        zof zofVar;
        SdkNewsMonotheme v1;
        s1c0 s1c0Var = (s1c0) this.e.invoke();
        boolean z2 = false;
        if (!(s1c0Var != null ? s1c0Var.v : false)) {
            if (!(s1c0Var != null ? s1c0Var.w : false)) {
                z = false;
                c = g620.f().e0().c(fh5Var.o);
                ClipFeedOpenAction.ShowActionButton showActionButton = null;
                sdkClipVideoFile = !(c instanceof SdkClipVideoFile) ? (SdkClipVideoFile) c : null;
                if (sdkClipVideoFile != null || (v1 = sdkClipVideoFile.v1()) == null) {
                    String str = z ? "feed_top_similar" : "vk_news_feed_clips_similar";
                    boolean z3 = !z;
                    UserId userId = s1c0Var == null ? s1c0Var.x : null;
                    Set singleton = !z ? EmptySet.b : Collections.singleton(com.vk.clips.sdk.shared.api.routing.models.a.a);
                    if (z) {
                        String i = FullSourceJoinApi.EntryServiceType.FEED.i();
                        payload = i != null ? new ClipFeedTab.WithPayload.Payload(pn00.i(new Pair("entry_service", i))) : null;
                    } else {
                        payload = null;
                    }
                    singleClip = new ClipFeedTab.SingleClip(c, null, str, false, z3, userId, payload, singleton, 10, null);
                } else {
                    singleClip = new ClipFeedTab.NewsMonotheme(v1.b, v1.c, c, null, 8, null);
                }
                if (this.g && z) {
                    zofVar = this.d;
                    if (zofVar.H().isEnabled() && zofVar.H().d() && xg5.a().e(fh5Var.o.I0())) {
                        z2 = true;
                    }
                }
                String r1 = fh5Var.o.r1();
                if (epx.f(s1c0Var == null ? Boolean.valueOf(s1c0Var.u) : null, Boolean.TRUE)) {
                    showActionButton = new ClipFeedOpenAction.ShowActionButton(r1, ((ClipActionButtonStateRepository.State) this.f.a.getOrDefault(r1, ClipActionButtonStateRepository.State.INACTIVE)) == ClipActionButtonStateRepository.State.ACTIVE ? ClipFeedOpenAction.ShowActionButton.State.ACTIVE : ClipFeedOpenAction.ShowActionButton.State.INACTIVE);
                }
                ClipsRouter.b(this.c, this.b, singleClip, fh5Var, null, null, showActionButton, z2, 56);
            }
        }
        z = true;
        c = g620.f().e0().c(fh5Var.o);
        ClipFeedOpenAction.ShowActionButton showActionButton2 = null;
        if (!(c instanceof SdkClipVideoFile)) {
        }
        if (sdkClipVideoFile != null) {
        }
        if (z) {
        }
        boolean z32 = !z;
        if (s1c0Var == null) {
        }
        Set singleton2 = !z ? EmptySet.b : Collections.singleton(com.vk.clips.sdk.shared.api.routing.models.a.a);
        if (z) {
        }
        singleClip = new ClipFeedTab.SingleClip(c, null, str, false, z32, userId, payload, singleton2, 10, null);
        if (this.g) {
            zofVar = this.d;
            if (zofVar.H().isEnabled()) {
                z2 = true;
            }
        }
        String r12 = fh5Var.o.r1();
        if (epx.f(s1c0Var == null ? Boolean.valueOf(s1c0Var.u) : null, Boolean.TRUE)) {
        }
        ClipsRouter.b(this.c, this.b, singleClip, fh5Var, null, null, showActionButton2, z2, 56);
    }
}
