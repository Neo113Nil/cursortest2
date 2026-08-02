package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.market.dto.MarketAddAlbumResponseDto;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.clips.editor.templates.impl.player.a;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.debug.ui.dev.DebugMockApiResponsesFragment;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.dto.common.Image;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.log.L;
import com.vk.media.player.PlayerError;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.json.JSONArray;
import xsna.bzp0;
import xsna.ihz;
import xsna.jza0;
import xsna.ngl;
import xsna.pqc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pi0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.g, ClipsStickersView.c, a.h, Preference.c, r580, ngl.a, ihz.a, t4d0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pi0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.t4d0
    public void a(MediaStoreEntry mediaStoreEntry) {
        gmj gmjVar = ((PhotoVideoAttachActivity) this.c).Z;
        if (gmjVar != null) {
            gmjVar.invoke(mediaStoreEntry);
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.e) ((com.vk.movika.sdk.base.observable.p) this.c).invoke(obj);
            case 1:
            case 5:
            case 8:
            case 10:
            case 13:
            case 15:
            case 16:
            case 17:
            case 20:
            case 21:
            case 22:
            case 25:
            default:
                return (Pair) ((e880) this.c).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.t) ((com.vk.movika.sdk.base.observable.p) this.c).invoke(obj);
            case 3:
                return (w5w0) ((com.vk.movika.sdk.base.observable.p) this.c).invoke(obj);
            case 4:
                return (List) ((qb) this.c).invoke(obj);
            case 6:
                return (m8v) ((com.vk.movika.sdk.base.observable.p) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((com.vk.movika.sdk.base.observable.p) this.c).invoke(obj);
            case 9:
                return (pqc.a) ((qb) this.c).invoke(obj);
            case 11:
                return (Image) ((q60) this.c).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.b0) ((tw4) this.c).invoke(obj);
            case 14:
                return (fde) ((ow4) this.c).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.b0) ((rhm) this.c).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.t) ((f6n) this.c).invoke(obj);
            case 23:
                return (JSONArray) ((qb) this.c).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.b0) ((igh) this.c).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.b0) ((o520) this.c).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.b0) ((zb60) this.c).invoke(obj);
        }
    }

    @Override // com.vk.clips.editor.templates.impl.player.a.h
    public void b(PlayerError playerError, Exception exc) {
        m8f m8fVar = (m8f) this.c;
        if (playerError != PlayerError.ERROR_NETWORK) {
            cvk.w(y8g0.e(gpt0.n(playerError, true)), true);
        } else {
            if (m8fVar.d <= 2) {
                io.reactivex.rxjava3.internal.operators.completable.g f = new io.reactivex.rxjava3.internal.operators.completable.m(new l8f()).f(2L, TimeUnit.SECONDS);
                asu0 asu0Var = asu0.a;
                asu0Var.getClass();
                m8fVar.b.b(hg1.g(new io.reactivex.rxjava3.internal.operators.completable.v(f.q(asu0.k()).o(asu0Var.d()), io.reactivex.rxjava3.internal.functions.a.g), new s4(m8fVar, 25)));
            }
            h03.b(exc);
        }
        L.l("ClipsTemplateEditorVideoViewHandlerImpl", "remove url play error playerError = " + playerError.getDescription() + " e = " + exc);
    }

    @Override // xsna.r580
    public void c(DonutVideoAction donutVideoAction) {
        mzn mznVar = (mzn) this.c;
        if (donutVideoAction != null) {
            mznVar.c.invoke(donutVideoAction);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (Pair) ((kre) this.c).invoke(obj, obj2, obj3);
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        vop vopVar = (vop) this.c;
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.w();
        cop copVar = (cop) vopVar.a;
        if (copVar != null) {
            copVar.v4();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        debugDevSettingsFragment.getClass();
        new DebugMockApiResponsesFragment.a(DebugMockApiResponsesFragment.class, null, null).k(debugDevSettingsFragment.mo2getContext());
        return true;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).v(((fwa0) this.c).o);
    }

    @Override // com.vk.clips.design.view.stikers.ClipsStickersView.c
    public void onClick() {
        ClipsTemplateEditorFragment clipsTemplateEditorFragment = (ClipsTemplateEditorFragment) this.c;
        int i = ClipsTemplateEditorFragment.h0;
        clipsTemplateEditorFragment.eo().l();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((com.vk.movika.sdk.base.observable.p) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        int i = this.b;
        cc5 cc5Var = (cc5) this.c;
        switch (i) {
            case 8:
                return (Pair) cc5Var.invoke(obj, obj2);
            default:
                int i2 = MarketEditAlbumGoodsFragment.c1;
                return (MarketAddAlbumResponseDto) cc5Var.invoke(obj, obj2);
        }
    }
}
