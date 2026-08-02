package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.search.params.api.domain.model.education.University;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;
import com.vk.voip.ui.change_name.ui.result.VoipChangeNameResult;
import com.vk.voip.ui.join.directly.withpreview.JoinCallFragment;
import java.util.List;
import one.video.player.RepeatMode;
import ru.ok.android.externcalls.sdk.audio.AdaptersKt;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.media.video.H264Encoder;
import xsna.bzp0;
import xsna.bzx;
import xsna.c8p;
import xsna.ihz;
import xsna.jza0;
import xsna.ngl;
import xsna.xn50;
import xsna.xp50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d9 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.d, Toolbar.h, ClipsStickersView.c, pcs, ngl.a, ihz.a, SimpleVideoView.i, cyo0, io.reactivex.rxjava3.functions.m, cgx {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.cyo0
    public long a() {
        long createTSProvider$lambda$0;
        createTSProvider$lambda$0 = H264Encoder.createTSProvider$lambda$0((H264Encoder) this.c);
        return createTSProvider$lambda$0;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((c9) this.c).invoke(obj);
            case 1:
            case 2:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 15:
            case 17:
            case 19:
            case 20:
            case 25:
            case 27:
            default:
                return (Owner) ((e810) this.c).invoke(obj);
            case 3:
                return (tam0) ((sz) this.c).invoke(obj);
            case 4:
                return (List) ((sm) this.c).invoke(obj);
            case 5:
                return (hda) ((com.vk.movika.sdk.base.observable.q) this.c).invoke(obj);
            case 6:
                return (mib) ((sm) this.c).invoke(obj);
            case 9:
                return (String) ((izs) this.c).invoke(obj);
            case 10:
                return (h6n0) ((sm) this.c).invoke(obj);
            case 14:
                return (ptk) ((oo1) this.c).invoke(obj);
            case 16:
                return (Boolean) ((sm) this.c).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.b0) ((sm) this.c).invoke(obj);
            case 21:
                return (Boolean) ((n9w) this.c).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.b0) ((d410) this.c).invoke(obj);
            case 23:
                return (List) ((n9w) this.c).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.b0) ((hdw) this.c).invoke(obj);
            case 26:
                return (Photo) ((n9w) this.c).invoke(obj);
            case 28:
                return (nov) ((e810) this.c).invoke(obj);
        }
    }

    @Override // com.vk.media.player.video.view.SimpleVideoView.i
    public void b() {
        q7r q7rVar = (q7r) this.c;
        mkm0 mkm0Var = q7rVar.i0;
        mkm0Var.d1();
        StoryEntry currentStory = mkm0Var.getCurrentStory();
        if (currentStory != null && mkm0Var.getDependencies().o.m(currentStory.c)) {
            q7rVar.v.f(RepeatMode.ONE);
            q7rVar.v.b(0L);
            q7rVar.v.e(true);
        } else {
            q7rVar.v.f(RepeatMode.OFF);
            if (mkm0Var.f) {
                return;
            }
            q7rVar.s0.f(SourceTransitionStory.EXPIRED_TIME);
        }
    }

    @Override // xsna.cgx
    public ViewGroup c() {
        return ((xp50.m) ((xp50) this.c)).b;
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        cop copVar = (cop) ((vop) this.c).a;
        if (copVar != null) {
            copVar.m2(cVar.a);
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).onVideoSizeChanged((xgt0) this.c);
    }

    @Override // com.vk.clips.design.view.stikers.ClipsStickersView.c
    public void onClick() {
        x8d b;
        exd presenter = ((t0e) this.c).getPresenter();
        if (presenter == null || (b = presenter.b()) == null) {
            return;
        }
        b.e();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [xsna.j8i, xsna.xwb$a] */
    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        ((xwb) this.c).b.n();
        return true;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        VoipChangeNameResult voipChangeNameResult;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 11:
                c8p.b bVar = c8p.n1;
                q7p feature = ((c8p) obj).getFeature();
                qcy<Object>[] qcyVarArr = ph.n1;
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = bundle.getParcelable("database_result", University.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = bundle.getParcelable("database_result");
                    if (!(parcelable3 instanceof University)) {
                        parcelable3 = null;
                    }
                    parcelable = (University) parcelable3;
                }
                feature.C(new a.l((University) parcelable));
                break;
            default:
                JoinCallFragment joinCallFragment = (JoinCallFragment) obj;
                int i2 = JoinCallFragment.U;
                if (str.hashCode() == 480222762 && str.equals("request_key_change_name") && (voipChangeNameResult = (VoipChangeNameResult) bundle.getParcelable("result_key_change_name")) != null) {
                    xn50.a.c(joinCallFragment, new bzx.d(voipChangeNameResult));
                    break;
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        AdaptersKt.releaseAsyncCompletable$lambda$4((CallsAudioManager) this.c, bVar);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
        }
        return ((Boolean) ((n9w) this.c).invoke(obj)).booleanValue();
    }
}
