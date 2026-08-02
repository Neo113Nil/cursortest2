package xsna;

import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.video.ui.upload.impl.attachedclips.presentation.fragment.AttachedClipsFragmentInternalComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a54 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ a54(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                AttachedClipsFragmentInternalComponent.a aVar = AttachedClipsFragmentInternalComponent.e;
                AttachedClipsState attachedClipsState = (AttachedClipsState) gzsVar.invoke();
                if (attachedClipsState == null) {
                    break;
                }
                break;
            case 1:
                gzsVar.invoke();
                break;
            default:
                gzsVar.invoke();
                break;
        }
        return s3q0.a;
    }
}
