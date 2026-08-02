package xsna;

import android.app.Activity;
import com.vk.clips.download.api.di.ClipsDownloadComponent;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ClipsDownload.kt */
/* loaded from: classes17.dex */
public final class ird extends ckd {
    public final ClipsDownloadComponent b;
    public final ile c;

    public ird(sua suaVar, ClipsDownloadComponent clipsDownloadComponent, ile ileVar) {
        super(ClipsBottomSheetOptions.DOWNLOAD.ordinal());
        this.b = clipsDownloadComponent;
        this.c = ileVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        VideoFile A = k15.A(ikdVar.a);
        if (g620.f().c(A)) {
            ClipsDownloadComponent clipsDownloadComponent = this.b;
            if (clipsDownloadComponent.Q5().b(A)) {
                return c(activity, clipsDownloadComponent.Q5().c(A) ? ModalActionSheetListItem.Appearance.Default : ModalActionSheetListItem.Appearance.TintedDisable);
            }
            return null;
        }
        boolean z = gpt0.D(A) && !fxc0.B().s().k(A);
        if (z && gpt0.x(A)) {
            return c(activity, ModalActionSheetListItem.Appearance.Default);
        }
        if (z) {
            return c(activity, ModalActionSheetListItem.Appearance.Disabled);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [T, androidx.appcompat.app.d] */
    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        VideoFile A = k15.A(ikdVar.a);
        sih0 sih0Var = ikdVar.h;
        if (sih0Var != null) {
            sih0Var.a(ClipsBottomSheetOptions.DOWNLOAD);
        }
        if (ci90.h(ikdVar)) {
            ClipsDownloadComponent clipsDownloadComponent = this.b;
            if (clipsDownloadComponent.Q5().c(A)) {
                hrc.c(clipsDownloadComponent.Gc(), activity, (ClipVideoFile) A, ikdVar.i, new sh3(9, this, ikdVar), 8);
                return;
            } else {
                clipsDownloadComponent.Q5().a(bwt0.u(activity), A);
                return;
            }
        }
        if (gpt0.x(A)) {
            g7s0.e(fxc0.B(), activity, A, null, ikdVar.i, null, 116);
        } else {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = bfs0.b(activity, A, rdi.p(activity, new hrd(ref$ObjectRef, 0)));
        }
    }

    public final ModalActionSheetListItem c(Activity activity, ModalActionSheetListItem.Appearance appearance) {
        return new ModalActionSheetListItem(this.a, appearance, activity.getString(R.string.video_download), null, null, R.drawable.vk_icon_download_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }
}
