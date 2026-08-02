package xsna;

import androidx.fragment.app.Fragment;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragment;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class boc0 extends FunctionReferenceImpl implements izs<gvz, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(gvz gvzVar) {
        gvz gvzVar2 = gvzVar;
        enc0 enc0Var = (enc0) this.receiver;
        List<MediaPickerState.Tab> list = enc0.q0;
        enc0Var.getClass();
        Integer j = p4g.j(MediaPickerState.Tab.LocalAlbum, enc0.q0);
        if (j != null) {
            int intValue = j.intValue();
            ahc0 ahc0Var = enc0Var.V;
            if (ahc0Var != null) {
                Fragment F0 = ahc0Var.F0(intValue);
                if (F0 instanceof LocalMediaPickerFragment) {
                    ((LocalMediaPickerFragment) F0).fo(gvzVar2);
                } else if (F0 instanceof LocalMediaPickerFragmentOld) {
                    ((LocalMediaPickerFragmentOld) F0).eo(gvzVar2);
                } else {
                    ahc0Var.y = j;
                    ahc0Var.x = gvzVar2;
                }
            }
        }
        return s3q0.a;
    }
}
