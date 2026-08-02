package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.core.store.entity.core.impl.EntityCacheComponentImpl;
import com.vk.silentauthbylogin.di.SilentAuthByLoginComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.focus.api.VideoFocusComponent;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.R;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o66 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o66(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Long z;
        Boolean q;
        Boolean q2;
        int i = this.b;
        ?? r2 = this.c;
        switch (i) {
            case 0:
                return ((SilentAuthByLoginComponent) ((p66) r2).k0().a(fpf0.a(SilentAuthByLoginComponent.class))).c();
            case 1:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((VideoFocusComponent) r2.getValue()).b();
            case 2:
                png pngVar = (png) r2;
                bp9 bp9Var = pngVar.c;
                com.vk.voip.ui.c.b.getClass();
                return new dp9(bp9Var, com.vk.voip.ui.c.j0(), pngVar.e);
            case 3:
                return dwx0.h((Context) r2);
            case 4:
                Context context = ((geh0) r2).a;
                asu0.a.getClass();
                return new zdh0(asu0.n(), context);
            case 5:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) r2;
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                return new nrl0(storiesComponentImpl.w(), storiesComponentImpl.u5());
            case 6:
                if (!((qks0) r2).a) {
                    return new dsl(0L, false, false, false);
                }
                b.d i2 = com.vk.toggle.b.A.i(VideoFeatures.VIDEO_DEFERRED_DISCOVER_INIT);
                if (i2 != null) {
                    b.d dVar = p1p0.a(i2) ? i2 : null;
                    if (dVar != null) {
                        JSONObject g = dVar.g();
                        boolean z2 = false;
                        boolean booleanValue = (g == null || (q2 = f370.q(g, "awaitPreInflate")) == null) ? false : q2.booleanValue();
                        JSONObject g2 = dVar.g();
                        if (g2 != null && (q = f370.q(g2, "initOnDemand")) != null) {
                            z2 = q.booleanValue();
                        }
                        boolean z3 = z2;
                        JSONObject g3 = dVar.g();
                        return new dsl((g3 == null || (z = f370.z(g3, "fallbackTimeout")) == null) ? 10000L : z.longValue(), true, booleanValue, z3);
                    }
                }
                return new dsl(0L, false, false, false);
            case 7:
                return LayoutInflater.from(((rot0) r2).a).inflate(R.layout.clips_upload_snackbar_failed, (ViewGroup) null);
            case 8:
                return new EntityCacheComponentImpl.a(((jau0) r2).b);
            default:
                qcy<Object>[] qcyVarArr3 = VoipCallComponentImpl.B;
                return new qsw(((VoipCallComponentImpl) r2).ud());
        }
    }
}
