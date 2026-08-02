package xsna;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;

/* compiled from: ClipEditSdkRouter.kt */
/* loaded from: classes17.dex */
public interface xtc {

    /* compiled from: ClipEditSdkRouter.kt */
    public static final class a {
        public final Context a;
        public final FragmentManager b;
        public final f5z c;
        public final boolean d;

        public a(Context context, FragmentManager fragmentManager, f5z f5zVar, boolean z) {
            this.a = context;
            this.b = fragmentManager;
            this.c = f5zVar;
            this.d = z;
        }
    }

    void a(ClipEditSdkItem clipEditSdkItem, a aVar, izs<? super ClipEditSdkItem, s3q0> izsVar, wzs<? super View, ? super izs<? super Boolean, s3q0>, s3q0> wzsVar);
}
