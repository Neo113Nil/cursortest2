package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$ContentType;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.stories.analytics.session.storage.permissions.CallReason;
import com.vk.story.viewer.api.models.Action;
import com.vk.story.viewer.api.models.AttachType;
import com.vk.story.viewer.api.models.Gesture;
import com.vk.storycamera.builder.StoryCameraParams;
import xsna.l5a0;
import xsna.qaa0;

/* compiled from: GalleryFragmentAnalyticsImpl.kt */
/* loaded from: classes15.dex */
public final class r3t implements q3t {
    public final qaa0 a;
    public final anm0 b;
    public final l5a0 c = l5a0.a;
    public StoryCameraParams d;
    public GalleryPickerSourceConfiguration e;

    public r3t(qaa0 qaa0Var, anm0 anm0Var) {
        this.a = qaa0Var;
        this.b = anm0Var;
        nf9 nf9Var = nf9.b;
    }

    @Override // xsna.q3t
    public final void a(long j, boolean z) {
        this.b.B(Action.SEND_MESSAGE, z ? AttachType.VIDEO : AttachType.PHOTO, Gesture.TAP, j);
    }

    @Override // xsna.q3t
    public final void b(long j) {
        this.b.B(Action.SEND_MESSAGE, AttachType.STORY, Gesture.TAP, j);
    }

    @Override // xsna.q3t
    public final void c(long j) {
        this.b.B(Action.OPEN_CAMERA, AttachType.PHOTO, Gesture.TAP, j);
        qaa0 qaa0Var = this.a;
        GalleryPickerSourceConfiguration.EntryPoint entryPoint = qaa0Var.b;
        if (entryPoint == GalleryPickerSourceConfiguration.EntryPoint.PHOTO_FLOW || entryPoint == GalleryPickerSourceConfiguration.EntryPoint.ALBUM) {
            qaa0Var.a.b((entryPoint == null ? -1 : qaa0.a.$EnumSwitchMapping$0[entryPoint.ordinal()]) == 1 ? MobileOfficialAppsConPhotosStat$ContentType.PHOTO : MobileOfficialAppsConPhotosStat$ContentType.ALBUM);
        }
    }

    @Override // xsna.q3t
    public final void d(Uri uri) {
        this.c.getClass();
        l5a0.d.add(uri);
    }

    @Override // xsna.q3t
    public final void e(int i) {
        this.c.getClass();
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("vkm_photo_multi_selection");
        b.b("count", Integer.valueOf(i));
        com.vk.movika.sdk.base.model.n.c(b, l5a0.f, bVar);
    }

    @Override // xsna.q3t
    public final void f(int i, Uri uri, boolean z) {
        this.c.getClass();
        l5a0.b.put(uri, new l5a0.b(z, false, i));
    }

    @Override // xsna.q3t
    public final void g(Uri uri) {
        this.c.getClass();
        l5a0.b.remove(uri);
    }

    public final void h(Context context) {
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = this.e;
        if ((galleryPickerSourceConfiguration != null ? galleryPickerSourceConfiguration.d : null) == GalleryPickerSourceConfiguration.EntryPoint.STORY) {
            nf9 nf9Var = nf9.b;
            nf9.e().d().a(context, CallReason.SET_ACCESS, (r6 & 4) == 0, (r6 & 8) == 0);
            nf9.j(StoryPublishEvent.GALLERY_ACCESS_DENIED, null, null, null, new h6g(this, 19), 30);
        }
    }
}
