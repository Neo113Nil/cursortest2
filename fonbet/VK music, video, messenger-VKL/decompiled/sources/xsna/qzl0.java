package xsna;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.view.components.cell.VkCell;
import com.vk.im.engine.exceptions.ImEngineIdOutOfBounds;
import com.vk.log.L;
import com.vk.stories.StorySettingsActivity;
import com.vk.stories.design.view.stats.tabs.info.mvi.d;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.i;
import com.vk.superapp.api.dto.story.actions.WebActionSticker;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vk.superapp.navigation.api.data.AppShareType;
import com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity.VideoViewerState;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.arl0;
import xsna.flw0;
import xsna.jio0;
import xsna.jrt0;
import xsna.llw0;
import xsna.nqw0;
import xsna.oem0;
import xsna.pxw0;
import xsna.sgw0;
import xsna.v9w0;
import xsna.wzq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qzl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qzl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.b;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                WebActionSticker webActionSticker = (WebActionSticker) obj2;
                List list = (List) obj;
                if (!list.isEmpty()) {
                    return bo6.a((BaseStickerDto) j5g.Y(list));
                }
                throw new g5l0("Can't find sticker with id = " + webActionSticker.b);
            case 1:
                ((arl0.a) obj2).invoke();
                return s3q0.a;
            case 2:
                ((v76) obj2).getBottomControlPanel().setPrivacy((StoryPrivacyType) obj);
                return s3q0.a;
            case 3:
                StorySettingsActivity storySettingsActivity = (StorySettingsActivity) obj2;
                hsl0 hsl0Var = (hsl0) obj;
                int i4 = StorySettingsActivity.P;
                View findViewById = storySettingsActivity.findViewById(R.id.ll_discover_settings);
                if (findViewById.getVisibility() != 0) {
                    findViewById.setVisibility(0);
                    boolean z = hsl0Var.a;
                    storySettingsActivity.K = z;
                    VkCell vkCell = storySettingsActivity.J;
                    (vkCell != null ? vkCell : null).setRight(StorySettingsActivity.T1(z, new ndm0(storySettingsActivity, z)));
                }
                return s3q0.a;
            case 4:
                ((com.vk.stories.design.view.stats.tabs.info.mvi.b) obj2).T(new d.a(((oem0.a.C3452a) obj).a));
                return s3q0.a;
            case 5:
                ((com.vk.stories.design.view.stats.tabs.viewers.mvi.b) obj2).m.b(new i.c(null, null, tq.h(tlo0.Companion, R.string.story_statistics_viewers_snackbar_error)));
                return s3q0.a;
            case 6:
                return new h9x((0 & 4294967295L) | (((int) ((f12) obj2).f()) << 32));
            case 7:
                SQLiteStatement compileStatement = ((grn0) obj2).a.b().compileStatement("INSERT INTO integer_generator(id) VALUES(NULL)");
                try {
                    long executeInsert = compileStatement.executeInsert();
                    if (executeInsert > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                        throw new ImEngineIdOutOfBounds("Sorry, you have used all ID's range (int).");
                    }
                    compileStatement.close();
                    return Integer.valueOf((int) executeInsert);
                } finally {
                }
            case 8:
                ffo0 ffo0Var = (ffo0) obj2;
                jio0.a aVar = ((kzp0) obj).a;
                RecyclerView recyclerView = ffo0Var.o;
                RecyclerView recyclerView2 = recyclerView != null ? recyclerView : null;
                Iterator<kzp0> it = ffo0Var.y.getCurrentList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                    } else if (!epx.f(aVar, it.next().a)) {
                        i3++;
                    }
                }
                lkf0.d(recyclerView2, i3);
                ffo0Var.b.invoke(new geo0(aVar));
                return s3q0.a;
            case 9:
                ((m3p0) obj2).d.invoke((String) obj);
                return s3q0.a;
            case 10:
                ((wh50) obj2).setValue((String) obj);
                return s3q0.a;
            case 11:
                ((rzq0) obj).b(new wow(((wzq0) obj2).c), wzq0.d.b);
                return s3q0.a;
            case 12:
                ((r3r0) obj2).invoke((oio) obj);
                return s3q0.a;
            case 13:
                utj utjVar = ((qot0) obj2).q;
                if (utjVar != null) {
                    utjVar.b();
                }
                return s3q0.a;
            case 14:
                jrt0.f fVar = (jrt0.f) obj2;
                VideoViewerState videoViewerState = (VideoViewerState) obj;
                xk80 xk80Var = videoViewerState.b;
                if (xk80Var != null) {
                    xk80Var.seekTo(fVar.b);
                }
                return VideoViewerState.a(videoViewerState, null, null, false, 0L, fVar.b, 15);
            case 15:
                uxt0 uxt0Var = (uxt0) obj2;
                Context context = ((ViewGroup) obj).getContext();
                int i5 = uxt0Var.c;
                ClipFeedTab clipFeedTab = uxt0Var.f.a;
                pb pbVar = uxt0Var.b;
                ClipsViewerComponentImpl clipsViewerComponentImpl = uxt0Var.p;
                tvk0 tvk0Var = new tvk0(context, i5, clipFeedTab, pbVar, clipsViewerComponentImpl.pe(), clipsViewerComponentImpl.Mf(), uxt0Var.t, uxt0Var.k, (nvk0) uxt0Var.Y.getValue(), uxt0Var.r, (uvx) uxt0Var.b0.getValue(), uxt0Var.c0);
                tvk0Var.m.b();
                return tvk0Var;
            case 16:
                AppShareType appShareType = (AppShareType) obj;
                try {
                    VkBridgeAnalytics E = ((ggu0) obj2).e.E();
                    if (E != null) {
                        E.k(JsApiMethodType.SHARE.i(), appShareType);
                        s3q0 s3q0Var = s3q0.a;
                    }
                } catch (Throwable unused) {
                }
                return s3q0.a;
            case 17:
                int i6 = s720.q;
                return new s720(bwt0.I(R.layout.ds_context_menu_item, (ViewGroup) obj, false), ((snu0) obj2).e);
            case 18:
                Throwable th = (Throwable) obj;
                ((r9w0) obj2).T(new v9w0.c.a(th));
                h03.b(th);
                return s3q0.a;
            case 19:
                ngw0 ngw0Var = (ngw0) obj2;
                sgw0 sgw0Var = (sgw0) obj;
                int i7 = ngw0.n1;
                if (sgw0Var instanceof sgw0.a) {
                    i = R.string.voip_call_by_phone_error_user_check_label;
                } else {
                    if (!(sgw0Var instanceof sgw0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.voip_call_by_phone_error_create_call_label;
                }
                enj.q(i, 0, ngw0Var.requireContext());
                return s3q0.a;
            case 20:
                ((VoipCallServiceFragment) obj2).S.setItems((List) obj);
                return s3q0.a;
            case 21:
                wkw0 wkw0Var = (wkw0) obj2;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th2;
                    f4z<llw0> f4zVar = wkw0Var.j;
                    int s = vKApiExecutionException.s();
                    if (s == 9 || s == 14) {
                        f4zVar.b(llw0.c.a);
                    } else if (s == 100 || s == 951 || s == 954) {
                        f4zVar.b(llw0.a.a);
                    } else if (s != 9015) {
                        wkw0Var.W(vKApiExecutionException);
                    } else {
                        wkw0Var.T(new flw0.e());
                    }
                } else {
                    wkw0Var.W(th2);
                }
                L.C("VoipJoinToCallByPasswordFeature", th2);
                return s3q0.a;
            case 22:
                int i8 = VoipCreateScheduleCallFragment.S;
                ((VoipCreateScheduleCallFragment) obj2).Q.a(new pxw0.m((ScheduledVideoMuteOption) obj));
                return s3q0.a;
            case 23:
                ((drw0) obj2).d.invoke(nqw0.b.b);
                return s3q0.a;
            default:
                return Boolean.valueOf(((h5y0) obj2).c.isInitialized());
        }
    }
}
