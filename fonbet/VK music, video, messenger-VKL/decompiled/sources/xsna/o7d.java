package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.DataLoadState;
import com.vk.clips.sdk.shared.item.clip.state.OwnerRightState;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.dto.common.ClipVideoFile;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import xsna.n0x;
import xsna.qnd;

/* compiled from: ClipMainOverlayPreviewFactoryImpl.kt */
/* loaded from: classes17.dex */
public final class o7d implements n7d {
    public final zof a;
    public final xod b;
    public final xne c;
    public final qwe d;
    public final ClipsViewersSdkComponentImpl e;

    public o7d(zof zofVar, ibr0 ibr0Var, xne xneVar, qwe qweVar, ClipsViewersSdkComponentImpl clipsViewersSdkComponentImpl) {
        this.a = zofVar;
        this.b = ibr0Var;
        this.c = xneVar;
        this.d = qweVar;
        this.e = clipsViewersSdkComponentImpl;
    }

    @Override // xsna.n7d
    public final View a(Context context, ClipVideoFile clipVideoFile) {
        ClipFeedTab.TopVideo topVideo = new ClipFeedTab.TopVideo(null, null, null, null, null, 31, null);
        rhh0 rhh0Var = new rhh0(this.d);
        ClipsViewersSdkComponentImpl clipsViewersSdkComponentImpl = this.e;
        njd njdVar = new njd(topVideo, this.c, rhh0Var, clipsViewersSdkComponentImpl.Ef(), this.a);
        n0d n0dVar = new n0d(context, new z6e(njdVar), new e0a(clipsViewersSdkComponentImpl.h()), new s0d(this.b), yof.a.getSTUB());
        f1d f1dVar = new f1d(njdVar, clipsViewersSdkComponentImpl.Df(), topVideo, this.c, this.a, new lf00(new rf(19), e3m.a(R.dimen.clip_owner_avatar_height, context)), qnd.a.a);
        View inflate = LayoutInflater.from(context).inflate(R.layout.fullscreen_clip_main_overlay, (ViewGroup) null);
        m0d a = n0dVar.a(new ClipVideoFileAdapter(clipVideoFile), null);
        j4b0 j4b0Var = new j4b0(false, false, false, false, false, false, false);
        umc umcVar = new umc(true, false, false);
        mfj0 mfj0Var = new mfj0(false, false, false, null);
        fc60 fc60Var = new fc60(false);
        iw.a.getClass();
        mf00 mf00Var = new mf00(true, a, j4b0Var, mfj0Var, fc60Var, umcVar, false, false, false, false, new ny(true, true, null, iw.b, iw.c), EmptyList.b, OwnerRightState.NONE, n0x.a.a, false, new t16(false, DataLoadState.POSITION_NOT_REACHED, null, null), rpp0.d);
        e1d e1dVar = new e1d(inflate, 0, null, this.a);
        w11 w11Var = new w11(10);
        new i1d(e1dVar, w11Var, clipsViewersSdkComponentImpl.Df(), clipsViewersSdkComponentImpl.o()).d(f1dVar.a(mf00Var));
        inflate.setImportantForAccessibility(4);
        return inflate;
    }
}
