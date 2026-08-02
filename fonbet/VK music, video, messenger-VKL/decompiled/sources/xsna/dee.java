package xsna;

import android.content.Context;
import android.view.View;
import com.vk.clips.design.view.component.video.preview.ClipRectanglePreview;
import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.fd;
import xsna.tlo0;

/* compiled from: ClipsGridRectanglePreviewHolder.kt */
/* loaded from: classes17.dex */
public final class dee extends fd {
    public final bpn0 f;
    public final bpn0 g;
    public final Object h;

    public dee(Context context) {
        super(context);
        this.f = new bpn0(new oo(this, 20));
        this.g = new bpn0(new com.vk.movika.sdk.base.logic.interactor.h(this, 20));
        this.h = msy.a(LazyThreadSafetyMode.NONE, new wm1(this, 19));
        iut0.q(this, new cee(this));
    }

    public static s3q0 a(ceq0 ceq0Var, dee deeVar) {
        boolean z = ceq0Var instanceof oaq0;
        if (z && ceq0Var.d()) {
            deeVar.getUploadController().a(((oaq0) ceq0Var).b());
        } else if (z && ceq0Var.c()) {
            deeVar.getUploadController().c(((oaq0) ceq0Var).b());
        } else {
            boolean z2 = ceq0Var instanceof obq0;
            if (z2 && ceq0Var.d()) {
                deeVar.getUploadsInteractor().e(((obq0) ceq0Var).g());
            } else if (z2 && ceq0Var.c()) {
                deeVar.getUploadsInteractor().f(((obq0) ceq0Var).g(), "clips_canceled_by_user_in_my_clips_preview");
            }
        }
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final zof getExperiments() {
        return (zof) this.h.getValue();
    }

    private final eef getUploadController() {
        return (eef) this.g.getValue();
    }

    private final ylf getUploadsInteractor() {
        return (ylf) this.f.getValue();
    }

    public final void b(Image image, Integer num, boolean z, String str, String str2, boolean z2) {
        ClipRectanglePreview.PreviewItem.b bVar;
        if (z) {
            str = getContext().getString(R.string.clips_grid_original_label);
        }
        ClipRectanglePreview clipRectanglePreview = this.c;
        if (image != null) {
            clipRectanglePreview.setBackgroundContent(new ClipRectanglePreview.PreviewItem.a(new fd.b(image)));
        }
        clipRectanglePreview.setPrimaryLabel(str != null ? new ClipRectanglePreview.PreviewItem.b(oq.d(tlo0.Companion, str), 1, new x7g(R.attr.vk_ui_text_contrast), null, null, 248) : null);
        if (str2 != null && str2.length() != 0) {
            bVar = new ClipRectanglePreview.PreviewItem.b(oq.d(tlo0.Companion, str2), 1, new x7g(R.attr.vk_ui_text_contrast), null, null, 248);
        } else if (num != null) {
            tlo0.a aVar = tlo0.Companion;
            int intValue = num.intValue();
            bVar = new ClipRectanglePreview.PreviewItem.b(oq.d(aVar, getExperiments().h() ? uqm0.h(intValue) : uqm0.f(intValue)), 1, new x7g(R.attr.vk_ui_text_contrast), new gko(R.drawable.vk_icon_view_12), new x7g(R.attr.vk_ui_icon_contrast), 224);
        } else {
            bVar = null;
        }
        clipRectanglePreview.setSecondaryLabel(bVar);
        getClipPreview().setMainIcon(null);
        if (z2) {
            getClipPreview().setStartTopIcon(new ClipRectanglePreview.PreviewItem.Icon(new gko(R.drawable.vk_icon_cards_2_shadow_24), new x7g(R.attr.vk_ui_icon_contrast), null, 58));
        } else {
            getClipPreview().setStartTopIcon(null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        getClipPreview().layout(0, 0, i5, i6);
        getClickableContainer().layout(0, 0, i5, i6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.round(size * 1.773109243697479d), 1073741824));
    }

    @Override // xsna.too0
    public final void Ng() {
    }
}
