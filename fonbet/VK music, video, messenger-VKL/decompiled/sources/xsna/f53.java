package xsna;

import android.content.Context;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.clips.editor.templates.impl.di.ClipsTemplatesEditorComponentBase;
import com.vk.core.fragments.BottomFragmentHandler;
import com.vk.music.bottomsheets.settings.di.MixSettingsComponentImpl;
import com.vk.music.model.di.AudioModelsComponentImpl;
import com.vk.silentauthbylogin.di.SilentAuthByLoginComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.sessionmanagment.impl.di.SessionManagementComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vk.voip.stereo.api.room.di.VoipStereoComponent;
import com.vkontakte.android.task.di.components.AuthBridgeComponentImpl;
import xsna.bx1;
import xsna.cz40;
import xsna.fu80;
import xsna.fx40;
import xsna.go4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class f53 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f53(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (com.vk.toggle.b.A.a(r0) != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.b;
        boolean z = true;
        ?? r4 = this.c;
        switch (i) {
            case 0:
                j53 j53Var = (j53) r4;
                return m4s.u(j53Var.v, j53Var.H, j53Var.e, j53Var.d, j53Var.t, j53Var.o, j53Var.n(), j53Var.p, j53Var.J, j53Var.I);
            case 1:
                AudioModelsComponentImpl audioModelsComponentImpl = (AudioModelsComponentImpl) r4;
                qcy<Object>[] qcyVarArr = AudioModelsComponentImpl.f;
                fx40.a aVar = new fx40.a(new bx1.a(true, true), null, null, null, 123);
                cz40.b.C2691b c2691b = cz40.b.C2691b.a;
                Context context = e43.a;
                return new ick0(new hx40(c2691b, context != null ? context : null, (otp) null, aVar, (oh6) null, 52), new fck0(new go4.a(2, false), new fu80.a(false, false), 4), audioModelsComponentImpl.b.U2());
            case 2:
                return ((MultiAccountComponent) ((AuthBridgeComponentImpl) r4).c.getValue()).d();
            case 3:
                return ((SilentAuthByLoginComponent) ((p66) r4).k0().a(fpf0.a(SilentAuthByLoginComponent.class))).a();
            case 4:
                qcy<Object>[] qcyVarArr2 = CatalogVideoViewComponentImpl.y;
                return ((BridgeComponent) r4.getValue()).t().b();
            case 5:
                nwy nwyVar = ((ClipsTemplatesEditorComponentBase) r4).a;
                qcy<Object> qcyVar = ClipsTemplatesEditorComponentBase.d[0];
                return new a9f(((Boolean) nwyVar.c()).booleanValue());
            case 6:
                return ((VoipStereoComponent) ((k7m) m7m.f((png) r4)).a(fpf0.a(VoipStereoComponent.class))).a();
            case 7:
                com.vk.core.fragments.b bVar = (com.vk.core.fragments.b) r4;
                if (com.vk.toggle.d.J()) {
                    return new BottomFragmentHandler(bVar.a);
                }
                return null;
            case 8:
                return b6m.b((Context) r4);
            case 9:
                qcy<Object>[] qcyVarArr3 = MixSettingsComponentImpl.c;
                return new s4v0(((MixSettingsComponentImpl) r4).E0());
            case 10:
                qcy<Object>[] qcyVarArr4 = SessionManagementComponentImpl.k;
                return ((fui0) ((SessionManagementComponentImpl) r4).h.getValue()).a;
            case 11:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) r4;
                qcy<Object>[] qcyVarArr5 = StoriesComponentImpl.N;
                return new dsl0(storiesComponentImpl.bf(), storiesComponentImpl.Df(), storiesComponentImpl.w(), storiesComponentImpl.b7(), storiesComponentImpl.Ef());
            case 12:
                qks0 qks0Var = (qks0) r4;
                if (qks0Var.a && qks0Var.k()) {
                    VideoFeatures videoFeatures = VideoFeatures.RELATED_VIDEOS_LOOP;
                    videoFeatures.getClass();
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                qcy<Object>[] qcyVarArr6 = VoipCallComponentImpl.B;
                return new lo80(((VoipCallComponentImpl) r4).La());
        }
    }
}
