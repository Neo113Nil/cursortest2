package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.clips.clipsaudio.data.ActionButtonType;
import com.vk.clips.design.view.camera.ClipsTimerTimeSelectorWrap;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.preference.Preference;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vk.core.view.components.segmented.control.VkSegmentedControl;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.am9;
import xsna.dw20;
import xsna.rpo;
import xsna.tzp0;

/* compiled from: CameraUIPresenter.kt */
/* loaded from: classes16.dex */
public final class wm9 implements ClipsControlsView.a {
    public final /* synthetic */ com.vk.cameraui.impl.a a;

    public wm9(com.vk.cameraui.impl.a aVar) {
        this.a = aVar;
    }

    public final Float a() {
        return this.a.c.b0;
    }

    @Override // com.vk.clips.design.view.camera.controls.ClipsControlsView.a
    public final void c(float f) {
        this.a.c(f);
    }

    @Override // com.vk.clips.design.view.camera.controls.ClipsControlsView.a
    public final void d(boolean z) {
        com.vk.cameraui.impl.a aVar = this.a;
        aVar.i.k = z;
        aVar.b.getPositions().c();
    }

    @Override // com.vk.clips.design.view.camera.controls.ClipsControlsView.a
    public final Boolean e() {
        ClipsEditorMusicInfo clipsEditorMusicInfo = this.a.p0.z.c;
        return Boolean.valueOf((clipsEditorMusicInfo != null ? hxd.d(clipsEditorMusicInfo) : null) != null);
    }

    @Override // com.vk.clips.design.view.camera.controls.ClipsControlsView.a
    public final void f() {
        jpd jpdVar = this.a.p0;
        CameraUIView cameraUIView = jpdVar.c;
        if (!jpdVar.q.isEmpty()) {
            cameraUIView.t0(y8g0.e(R.string.clips_template_change));
            return;
        }
        jpdVar.d().e("clipsDelegate");
        jpdVar.g();
        g620.f().f(cameraUIView.getContext(), SignalingProtocol.KEY_CAMERA);
    }

    @Override // com.vk.clips.design.view.camera.controls.ClipsControlsView.a
    public final void g() {
        jpd jpdVar = this.a.p0;
        if (jpdVar.q.isEmpty()) {
            jpdVar.z.f();
            return;
        }
        jpdVar.c.t0(y8g0.e(R.string.clips_music_change));
        nf9 nf9Var = nf9.b;
        am9.a aVar = new am9.a();
        aVar.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS);
        nf9.b(nf9Var, StoryPublishEvent.FAIL_OPEN_MUSIC_CAMERA, aVar, null, null, true, null, 108).e();
    }

    @Override // com.vk.clips.design.view.camera.controls.ClipsControlsView.a
    public final void h(boolean z) {
        com.vk.media.ok.b bVar;
        zd9 camera1View = this.a.p0.c.getCamera1View();
        if (camera1View == null || (bVar = ((mo9) camera1View.getCameraPreview()).g.B) == null) {
            return;
        }
        bVar.B = z;
        if (bVar.u) {
            bVar.z();
        }
    }

    @Override // com.vk.clips.design.view.camera.controls.ClipsControlsView.a
    public final StoryCameraTarget i() {
        return this.a.c.o;
    }

    @Override // com.vk.clips.design.view.camera.controls.ClipsControlsView.a
    public final void j() {
        atd atdVar = this.a.p0.k;
        CameraUIView cameraUIView = atdVar.b;
        cameraUIView.m();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) LayoutInflater.from(bwt0.u(cameraUIView.getContext())).inflate(R.layout.layout_clips_drafts_dialog, (ViewGroup) null, false);
        int i = (int) (iah0.f().heightPixels * 0.45d);
        RecyclerView recyclerView = (RecyclerView) coordinatorLayout.findViewById(R.id.recycler);
        recyclerView.setAdapter(atdVar.k);
        bwt0.m0(iah0.f().widthPixels, i, recyclerView);
        cpo cpoVar = new cpo(false, 0, 7);
        cpoVar.e = i;
        dw20.b v0 = new dw20.b(bwt0.u(coordinatorLayout.getContext()), new tzp0.c.a(atdVar, true)).c(cpoVar).v0(R.string.clips_drafts_title);
        dhr0.a.getClass();
        atdVar.j = v0.u0(dhr0.u().c).q0(true).D0(coordinatorLayout, false).Z(new zsd(atdVar, 0)).I0(null);
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        d7 d7Var = new d7(atdVar, 25);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(d7Var);
        nsd nsdVar = fvr.c;
        if (nsdVar != null) {
            nsdVar.a();
        } else {
            Preference.F(0L, "clips_draft_prefs", "unseen_drafts_pref");
        }
        atdVar.d.C(0);
    }

    @Override // com.vk.clips.design.view.camera.controls.ClipsControlsView.a
    public final void k() {
        jpd jpdVar = this.a.p0;
        if (!jpdVar.q.isEmpty()) {
            jpdVar.c.t0(y8g0.e(R.string.clips_music_change));
            return;
        }
        rgd rgdVar = jpdVar.z;
        ClipsEditorMusicInfo clipsEditorMusicInfo = rgdVar.c;
        ClipsEditorMusicTrack clipsEditorMusicTrack = clipsEditorMusicInfo != null ? clipsEditorMusicInfo.b : null;
        rgdVar.b.a.m();
        StringBuilder sb = new StringBuilder();
        sb.append(clipsEditorMusicTrack != null ? clipsEditorMusicTrack.f : null);
        sb.append(" - ");
        sb.append(clipsEditorMusicTrack != null ? clipsEditorMusicTrack.d : null);
        ArrayList o = e43.o(new xu20(sb.toString(), null, 0, null, 12));
        List<ActionButtonType> l = e43.l(ActionButtonType.CHANGE, ActionButtonType.TRIM, ActionButtonType.DELETE);
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        for (ActionButtonType actionButtonType : l) {
            arrayList.add(new ModalActionSheetListItem(actionButtonType.ordinal(), actionButtonType == ActionButtonType.DELETE ? ModalActionSheetListItem.Appearance.Negative : ModalActionSheetListItem.Appearance.Default, y8g0.e(actionButtonType.h()), null, null, 0, null, false, false, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED));
        }
        o.addAll(arrayList);
        a.C0785a c0785a = new a.C0785a();
        c0785a.b = o;
        c0785a.c = new r7(rgdVar, 26);
        c0785a.a(rgdVar.a, null);
        nf9 nf9Var = nf9.b;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS;
        StoryPublishEvent storyPublishEvent = StoryPublishEvent.CLICK_TO_AUDIO_TITLE_CAMERA;
        am9.a aVar = new am9.a();
        aVar.j = com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
        nf9.b(nf9Var, storyPublishEvent, aVar, null, null, true, null, 108).e();
    }

    @Override // com.vk.clips.design.view.camera.controls.ClipsControlsView.a
    public final void l() {
        jpd jpdVar = this.a.p0;
        if (jpdVar.i.b - jpdVar.G <= 300) {
            jpdVar.c.t0(y8g0.e(R.string.clips_timer_change));
            return;
        }
        final o9f o9fVar = jpdVar.l;
        CameraUIView cameraUIView = o9fVar.a;
        cameraUIView.m();
        Context context = cameraUIView.getContext();
        dhr0.a.getClass();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(new l7s(context, dhr0.u().c)).inflate(R.layout.layout_clips_timer_dialog_new, (ViewGroup) null, false);
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        ClipsTimerTimeSelectorWrap clipsTimerTimeSelectorWrap = (ClipsTimerTimeSelectorWrap) viewGroup.findViewById(R.id.clips_timer_selector_wrap);
        if (clipsTimerTimeSelectorWrap != null) {
            clipsTimerTimeSelectorWrap.a(new bqz0(o9fVar.b), rect2, o9fVar.d);
        } else {
            clipsTimerTimeSelectorWrap = null;
        }
        View findViewById = viewGroup.findViewById(R.id.clips_timer_set_btn);
        findViewById.setClickable(true);
        findViewById.setEnabled(true);
        findViewById.setSelected(true);
        bwt0.i0(findViewById, new np5(3, o9fVar, clipsTimerTimeSelectorWrap));
        View findViewById2 = viewGroup.findViewById(R.id.clips_timer_reset_btn);
        findViewById2.setClickable(true);
        findViewById2.setEnabled(true);
        findViewById2.setSelected(false);
        bwt0.i0(findViewById2, new dg(o9fVar, 27));
        VkSegmentedControl vkSegmentedControl = (VkSegmentedControl) viewGroup.findViewById(R.id.count_down_selector_control);
        if (vkSegmentedControl != null) {
            vkSegmentedControl.r();
            vkSegmentedControl.setSegmentSize(VkSegmentedControl.SegmentSize.Medium);
            vkSegmentedControl.setCustomTabContent(new i4e(context, 7));
            boolean z = o9fVar.e == 3;
            TabLayout.g p = vkSegmentedControl.p();
            p.q(y8g0.f(R.string.clips_duration_string, "3"));
            p.k(y8g0.c(R.plurals.duration_accessibility_seconds, 3));
            vkSegmentedControl.i(p, z);
            TabLayout.g p2 = vkSegmentedControl.p();
            p2.q(y8g0.f(R.string.clips_duration_string, "10"));
            p2.k(y8g0.c(R.plurals.duration_accessibility_seconds, 10));
            vkSegmentedControl.i(p2, !z);
        } else {
            vkSegmentedControl = null;
        }
        o9fVar.f = vkSegmentedControl;
        if (Build.VERSION.SDK_INT >= 29) {
            View rootView = viewGroup.getRootView();
            if (!rootView.isLaidOut() || rootView.isLayoutRequested()) {
                rootView.addOnLayoutChangeListener(new p9f(rect, rect2));
            } else {
                ArrayList arrayList = new ArrayList();
                f4m.d(rect, rootView);
                arrayList.add(new Rect(rect.left, rect2.top, rect.right, rect2.bottom));
                rootView.setSystemGestureExclusionRects(arrayList);
            }
        }
        qxm0.r(viewGroup);
        cpo cpoVar = new cpo(false, 0, 7);
        cpoVar.e = viewGroup.getMeasuredHeight();
        o9fVar.c = new dw20.b(bwt0.u(viewGroup.getContext()), o9f.g).c(cpoVar).v0(R.string.clips_timer_dialog_title).D0(viewGroup, false).u0(dhr0.u().c).Z(new DialogInterface.OnDismissListener() { // from class: xsna.n9f
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o9f o9fVar2 = o9f.this;
                o9fVar2.a.t();
                o9fVar2.c = null;
                o9fVar2.f = null;
            }
        }).I0(null);
        nf9 nf9Var = nf9.b;
        am9.a aVar = new am9.a();
        aVar.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS);
        nf9.b(nf9Var, StoryPublishEvent.OPEN_TIMER, aVar, null, null, true, null, 108).e();
        kme.a("clips_open_timer");
        jpdVar.b.h.c(StoryPublishEvent.CLIPS_OPEN_TIMER, null);
    }

    @Override // com.vk.clips.design.view.camera.controls.ClipsControlsView.a
    public final boolean m() {
        return this.a.c.y0;
    }

    @Override // com.vk.clips.design.view.camera.controls.ClipsControlsView.a
    public final void n() {
        eqo<rpo> eqoVar = this.a.b.D;
        if (eqoVar != null) {
            eqoVar.d(rpo.a.b);
        }
    }

    @Override // com.vk.clips.design.view.camera.controls.ClipsControlsView.a
    public final void o(boolean z) {
        this.a.t4(z, true);
    }
}
