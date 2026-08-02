package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: EditPublicationDate.kt */
/* loaded from: classes17.dex */
public final class c1p extends ckd {
    public final mkd b;

    public c1p(sua suaVar, mkd mkdVar) {
        super(ClipsBottomSheetOptions.EDIT_PUBLICATION_DATE.ordinal());
        this.b = mkdVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        if (!sdkVideoFile.t0() || !ci90.m(ikdVar) || sdkVideoFile.k1() <= 0) {
            return null;
        }
        return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.video_edit_publication_date), null, null, R.drawable.vk_icon_clock_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [T, xsna.dw20] */
    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        VideoFile A = k15.A(ikdVar.a);
        final Date date = new Date();
        final Date date2 = new Date(TimeUnit.DAYS.toMillis(90L) + date.getTime());
        final Date date3 = new Date(TimeUnit.SECONDS.toMillis(A.k1()));
        final ww5 ww5Var = new ww5(date3, this, A, nkdVar, ikdVar, 1);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final kmu0 kmu0Var = new kmu0(activity, tzp0.a(null, 3));
        kmu0Var.N0();
        kmu0Var.g = true;
        kmu0Var.U0(new jai(842452561, new wzs() { // from class: xsna.y0p
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(842452561, intValue, -1, "com.vk.clips.viewer.impl.feed.view.bottomsheet.actions.EditPublicationDate.onClick.<anonymous>.<anonymous> (EditPublicationDate.kt:72)");
                    }
                    String string = kmu0.this.c.getString(R.string.video_date_picker_title);
                    ww5 ww5Var2 = ww5Var;
                    Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                    eyk.a(string, new u6(17, ww5Var2, ref$ObjectRef2), null, null, date3, date, date2, new z0p(ref$ObjectRef2, 0), new bih(ref$ObjectRef2, 16), aVar, 0, 28);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            }
        }, true));
        ref$ObjectRef.element = kmu0Var.I0("CLIPS_EDIT_PUBLICATION_DATE_MODAL");
    }
}
