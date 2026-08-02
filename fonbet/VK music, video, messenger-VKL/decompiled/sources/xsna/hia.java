package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.api.sdk.VKApiConfig;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.c;
import com.vk.protect.di.ProtectAppComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class hia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hia(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = false;
        ?? r2 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((DonutVideoComponent) r2.getValue()).wb();
            case 1:
                return new fn30(((j7b) r2).a);
            case 2:
                return on00.f(new Pair(c.C1124c.c, (DialogTheme) ((yol) r2).b.getValue()));
            case 3:
                ProtectAppComponentImpl protectAppComponentImpl = (ProtectAppComponentImpl) r2;
                Context context = protectAppComponentImpl.a.a;
                nwy nwyVar = protectAppComponentImpl.c;
                qcy<Object>[] qcyVarArr2 = ProtectAppComponentImpl.i;
                qcy<Object> qcyVar = qcyVarArr2[0];
                Lazy lazy = (Lazy) nwyVar.c();
                ewy ewyVar = protectAppComponentImpl.h;
                qcy<Object> qcyVar2 = qcyVarArr2[5];
                return new d8e0(context, lazy, (x7e0) ewyVar.c());
            case 4:
                VKApiConfig vKApiConfig = ((l7r0) r2).a;
                return new z1p0(vKApiConfig.x, vKApiConfig.v, vKApiConfig.u, vKApiConfig.w, vKApiConfig.y, 16);
            case 5:
                if (((qks0) r2).a) {
                    VideoFeatures videoFeatures = VideoFeatures.POSTPONED_SNACK;
                    videoFeatures.getClass();
                    z = com.vk.toggle.b.A.a(videoFeatures);
                }
                return Boolean.valueOf(z);
            default:
                rot0 rot0Var = (rot0) r2;
                return LayoutInflater.from(rot0Var.a).inflate(rot0Var.b ? R.layout.video_upload_snackbar : R.layout.video_upload_snackbar_old, (ViewGroup) null);
        }
    }
}
