package xsna;

import android.content.Intent;
import android.os.Parcelable;
import androidx.preference.Preference;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.ui.editalbum.presentation.EditAlbumPrivacyFragment;
import com.vk.voip.ui.assessment.VoipAssessmentActivity;
import com.vkontakte.android.api.DocsGetTypesResult;
import java.util.List;
import java.util.Optional;
import one.video.controls.view.state.Mode;
import one.video.transform.TransformController;
import ru.ok.gl.tf.factory.FaceMorphingFactory;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.DetectionSmoother;
import ru.ok.tensorflow.util.Function2;
import xsna.bu;
import xsna.by1;
import xsna.bzp0;
import xsna.c0e;
import xsna.fit;
import xsna.ihz;
import xsna.ngl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class e10 implements TransformController.d, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, Preference.c, ihz.a, io.reactivex.rxjava3.functions.m, PhotoFlowToolbarView.c, ngl.a, Function2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e10(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.vk.content.design.view.photo.flow.PhotoFlowToolbarView.c
    public void a0() {
        EditAlbumPrivacyFragment editAlbumPrivacyFragment = (EditAlbumPrivacyFragment) this.c;
        int i = EditAlbumPrivacyFragment.X0;
        editAlbumPrivacyFragment.Qo();
        editAlbumPrivacyFragment.Qo();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        DetectionSmoother lambda$create$1;
        switch (this.b) {
            case 16:
                return (ClipsPlaylist) ((dv4) this.c).invoke(obj, obj2);
            default:
                lambda$create$1 = FaceMorphingFactory.lambda$create$1((r11) this.c, (Detection) obj, (Long) obj2);
                return lambda$create$1;
        }
    }

    @Override // one.video.transform.TransformController.d
    public void b(float f) {
        i10 i10Var = (i10) this.c;
        i10Var.c(bu.a.m.a);
        Mode mode = i10Var.c.a;
        Mode mode2 = Mode.SHOW_ZOOM_RATE;
        if (mode != mode2) {
            i10Var.f(mode2, true);
        }
        i10Var.d(i10Var.z.c, true);
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        cpp cppVar = (cpp) ((com.vk.auth.enterphone.a) this.c).a;
        if (cppVar != null) {
            cppVar.xd();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        int i = VoipAssessmentActivity.m;
        Intent intent = new Intent(debugDevSettingsFragment.requireContext(), (Class<?>) VoipAssessmentActivity.class);
        intent.putExtra("VoipAssessmentActivity.Arguments", (Parcelable) null);
        debugDevSettingsFragment.startActivity(intent);
        return true;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).P((androidx.media3.common.a) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((ykm) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ e10(by1.a aVar, androidx.media3.common.a aVar2, n8l n8lVar) {
        this.b = 20;
        this.c = aVar2;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (it80) ((lt0) this.c).invoke(obj);
            case 2:
                return (a21) ((q11) this.c).invoke(obj);
            case 3:
                return (PhotoAlbum) ((a7) this.c).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((qt0) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.b0) ((dp4) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.b0) ((lt0) this.c).invoke(obj);
            case 7:
                return (Boolean) ((lt0) this.c).invoke(obj);
            case 8:
                return (Optional) ((lt0) this.c).invoke(obj);
            case 9:
                return (hda) ((g6a) this.c).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.movika.sdk.base.hooks.p) this.c).invoke(obj);
            case 11:
                return (List) ((lt0) this.c).invoke(obj);
            case 12:
                return (c0e.a) ((yl0) this.c).invoke(obj);
            case 13:
                return (u2e) ((r5e) this.c).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.b0) ((r9e) this.c).invoke(obj);
            case 15:
                return (List) ((z90) this.c).invoke(obj);
            case 16:
            case 19:
            case 20:
            case 21:
            case 24:
            case 25:
            case 26:
            default:
                return (pf3) ((fit.u) this.c).invoke(obj);
            case 17:
                return (List) ((ju) this.c).invoke(obj);
            case 18:
                return (al60) ((ka) this.c).invoke(obj);
            case 22:
                return (h4n) ((l8k) this.c).invoke(obj);
            case 23:
                return (DocsGetTypesResult) ((yl0) this.c).invoke(obj);
            case 27:
                return (qih0) ((l8k) this.c).invoke(obj);
            case 28:
                return (io.reactivex.rxjava3.core.e) ((dp4) this.c).invoke(obj);
        }
    }
}
