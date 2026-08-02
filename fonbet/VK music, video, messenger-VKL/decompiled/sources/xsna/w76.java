package xsna;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.im.engine.models.SearchMode;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.photo.editor.features.crop.models.params.CropAspectRatioFormat;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.a5u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class w76 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w76(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((k86) this.c).u7((Bitmap) this.d, (avj0) this.e);
                return s3q0.a;
            case 1:
                uik uikVar = (uik) this.c;
                RectF rectF = (RectF) this.d;
                CropAspectRatioFormat cropAspectRatioFormat = (CropAspectRatioFormat) this.e;
                uikVar.e.setRawRect(rectF);
                hfk hfkVar = uikVar.e;
                hfkVar.setContentRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                hfkVar.setContentScale(1.0f);
                uikVar.k = cropAspectRatioFormat;
                hfkVar.setForcedAspectRatio(cropAspectRatioFormat.h());
                jfk jfkVar = uikVar.o;
                if (jfkVar != null) {
                    jfkVar.i();
                }
                sf2 sf2Var = uikVar.j;
                if (sf2Var != null) {
                    ((gik) sf2Var.b).L(true);
                }
                uikVar.m = false;
                hfkVar.getRotatingView().setVisibility(0);
                uikVar.h = null;
                return s3q0.a;
            case 2:
                ((a5u) this.c).a.e().a(((a5u.a) this.d).f, ((k5u) this.e).c);
                return s3q0.a;
            case 3:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.c;
                rw30 rw30Var = (rw30) this.d;
                SearchMode searchMode = (SearchMode) this.e;
                if (!ref$BooleanRef.element) {
                    ref$BooleanRef.element = true;
                    rw30Var.r.post(new kw6(5, rw30Var, searchMode));
                }
                return s3q0.a;
            default:
                ubb0 ubb0Var = (ubb0) this.c;
                UserId userId = (UserId) this.d;
                Playlist playlist = (Playlist) this.e;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + " pid=" + playlist.Ib()});
                }
                return Integer.valueOf(ubb0Var.c.g(String.valueOf(userId.b), playlist.Ib()));
        }
    }
}
