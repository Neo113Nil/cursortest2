package xsna;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.mvp.holder.music.MusicSubsectionFilterButtonVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockRadioStation;
import com.vk.catalog2.feature.music.holders.RadioStationCellVh;
import com.vk.core.ui.themes.VKTheme;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.models.dialogs.DialogThemeImpl;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.instantjobs.InstantJob;
import com.vk.instantjobs.components.appstate.AppState;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.stat.scheme.CommonAudioStat$AudioDomainTapEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenNativeApp;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.mail.libverify.controls.VerificationController;
import xsna.b4;
import xsna.c810;
import xsna.d8a0;
import xsna.dhr0;
import xsna.oap;
import xsna.p2s;
import xsna.r7x;
import xsna.uhw0;
import xsna.zab0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ag1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ag1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d7, code lost:
    
        if (r6.getState() == com.vk.instantjobs.components.appstate.AppState.SUSPENDING) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        MusicAnalyticsInfo.ClickTarget clickTarget;
        String lambda$loginVKConnect$20;
        int i = this.b;
        int i2 = 12;
        int i3 = 6;
        int i4 = 28;
        int i5 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((gg1) obj2).p.b(new i.b.C1484b(((a.j.b.C1480a) ((a.j) obj)).b));
                return s3q0.a;
            case 1:
                JSONObject jSONObject = new JSONObject((String) obj2);
                String string = jSONObject.getString("type");
                int i6 = jSONObject.getInt("id");
                long j = jSONObject.getLong("owner_id");
                g2v.c().getClass();
                Context context = ((qn3) obj).p.getContext();
                UserId userId = new UserId(j);
                int i7 = ReportFragment.a0;
                ReportFragment.a a = ReportFragment.b.a();
                a.K(string);
                a.D(i6);
                a.G(userId);
                a.k(context);
                return s3q0.a;
            case 2:
                q75 q75Var = (q75) obj2;
                q75Var.getClass();
                ydt0 Y = fxc0.B().Y();
                String str = ((b4.c.d) ((b4.c) obj)).a;
                Y.getClass();
                VideoFile videoFile = q75Var.b.e;
                new bjc(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(r1.e.o0()), Long.valueOf(dz5.B(videoFile, videoFile.I0()).b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick(objArr2 == true ? 1 : 0, i5, objArr == true ? 1 : 0), 2)).q();
                return s3q0.a;
            case 3:
                g07 g07Var = (g07) obj2;
                yvj yvjVar = (yvj) obj;
                if (g07Var.b.invoke(BigPlayerBottomSheetValue.Expanded).booleanValue()) {
                    myc0.h(yvjVar, null, null, new b17(g07Var, null), 3);
                }
                return Boolean.TRUE;
            case 4:
                AvatarAction avatarAction = (AvatarAction) obj;
                tsu tsuVar = ((azb) obj2).k;
                if (tsuVar != null) {
                    tsuVar.e(avatarAction);
                }
                return s3q0.a;
            case 5:
                ((r2s) obj2).a.onNext(new p2s.c((yyr) obj));
                return s3q0.a;
            case 6:
                w6x w6xVar = (w6x) obj2;
                r7x r7xVar = (r7x) obj;
                InstantJob instantJob = w6xVar.e;
                Object obj3 = r7xVar.e;
                r93 r93Var = r7xVar.b;
                int l = instantJob.l(obj3);
                int i8 = r7x.c.$EnumSwitchMapping$0[instantJob.p().ordinal()];
                if (i8 != 1) {
                    if (i8 != 2 && i8 != 3) {
                        if (i8 == 4) {
                            r8 = !(r93Var.getState() == AppState.FOREGROUND_UI);
                        } else {
                            if (i8 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            break;
                        }
                    }
                    r8 = true;
                }
                r7xVar.c(new h2s(w6xVar, i3), new f4r(r8, i5));
                if (r7xVar.f(l)) {
                    r7xVar.h(l);
                }
                r7xVar.g();
                return s3q0.a;
            case 7:
                ww50 ww50Var = (ww50) obj2;
                c810.a.b bVar = (c810.a.b) obj;
                if (ww50Var != null) {
                    ww50Var.S(bVar);
                }
                return s3q0.a;
            case 8:
                ((z520) obj2).g((Photo) obj);
                return s3q0.a;
            case 9:
                MusicSubsectionFilterButtonVh musicSubsectionFilterButtonVh = (MusicSubsectionFilterButtonVh) obj2;
                CatalogFilterData catalogFilterData = (CatalogFilterData) obj;
                if (!catalogFilterData.e) {
                    eda edaVar = musicSubsectionFilterButtonVh.b;
                    String str2 = catalogFilterData.b;
                    View view = musicSubsectionFilterButtonVh.c;
                    if (view == null) {
                        view = null;
                    }
                    io.reactivex.rxjava3.disposables.c c = eda.c(edaVar, str2, new oap.a(view.getContext()), null, 12);
                    View view2 = musicSubsectionFilterButtonVh.c;
                    hg1.b(view2 != null ? view2 : null, c);
                }
                return s3q0.a;
            case 10:
                lj50 lj50Var = (lj50) obj;
                qj50 qj50Var = (qj50) ((um50) obj2).f.c;
                if (qj50Var.i(lj50Var)) {
                    qj50Var.p(lj50Var);
                }
                return s3q0.a;
            case 11:
                ((ygp0) obj2).a((one.video.exo.offline.f) obj);
                return s3q0.a;
            case 12:
                ((com.vk.photos.root.photoflow.presentation.j) obj2).e.invoke(new a.g.d((d8a0.a) obj));
                return s3q0.a;
            case 13:
                ((izs) obj2).invoke(((zab0.b) ((zab0) obj)).a);
                return s3q0.a;
            case 14:
                RadioStationCellVh radioStationCellVh = (RadioStationCellVh) obj2;
                com.vk.music.track.a aVar = radioStationCellVh.c;
                UIBlockRadioStation uIBlockRadioStation = (UIBlockRadioStation) ((UIBlock) obj);
                io.reactivex.rxjava3.disposables.g gVar = radioStationCellVh.h;
                RadioStation radioStation = uIBlockRadioStation.y;
                if (radioStation.g) {
                    clickTarget = MusicAnalyticsInfo.ClickTarget.Unsubscribe;
                    gVar.b(itg0.m(a630.h0(aVar, radioStation.b, null, 6)));
                } else {
                    radioStationCellVh.e.N0(RadioStationCellVh.a(uIBlockRadioStation), new CommonAudioStat$AudioDomainTapEvent(CommonAudioStat$AudioDomainTapEvent.Action.ADD, false));
                    MusicAnalyticsInfo.ClickTarget clickTarget2 = MusicAnalyticsInfo.ClickTarget.Subscribe;
                    gVar.b(a630.L1(aVar, radioStation.b, null, 6).subscribe(new hu50(new px30(radioStationCellVh, i4), i2)));
                    clickTarget = clickTarget2;
                }
                radioStationCellVh.d.a(new cfp0(uIBlockRadioStation, new MusicAnalyticsInfo(clickTarget)));
                return s3q0.a;
            case 15:
                dhr0.f fVar = (dhr0.f) obj2;
                SparseIntArray sparseIntArray = new SparseIntArray();
                int f = e3m.f(R.attr.vk_legacy_accent, fVar);
                u4q0 u4q0Var = zik0.a;
                sparseIntArray.put(R.attr.vk_legacy_accent, f);
                sparseIntArray.put(R.attr.vk_legacy_header_tint, e3m.f(R.attr.vk_legacy_header_tint, fVar));
                sparseIntArray.put(R.attr.vk_legacy_header_text, e3m.f(R.attr.vk_legacy_header_text, fVar));
                sparseIntArray.put(R.attr.vk_ui_text_accent, e3m.f(R.attr.vk_ui_text_accent, fVar));
                sparseIntArray.put(R.attr.vk_ui_icon_accent, e3m.f(R.attr.vk_ui_icon_accent, fVar));
                sparseIntArray.put(R.attr.vk_ui_background_accent, e3m.f(R.attr.vk_ui_background_accent, fVar));
                sparseIntArray.put(R.attr.vk_ui_stroke_accent, e3m.f(R.attr.vk_ui_stroke_accent, fVar));
                sparseIntArray.put(R.attr.toolbar_title_textColor, e3m.f(R.attr.toolbar_title_textColor, fVar));
                boolean z = ((VKTheme) obj).b;
                return new DialogThemeImpl(sparseIntArray, Collections.singletonList(jpk0.e(fVar, true, z)), Collections.singletonList(jpk0.e(fVar, false, z)));
            case 16:
                ((com.vk.stories.design.view.stats.tabs.viewers.mvi.b) obj2).W((StoryUserViewer) obj, false);
                return s3q0.a;
            case 17:
                com.vk.superapp.ui.a aVar2 = (com.vk.superapp.ui.a) obj;
                WebAction webAction = ((WebActionOpenNativeApp) ((WebAction) obj2)).e;
                FragmentActivity activity = aVar2.b.getActivity();
                if (webAction != null && activity != null) {
                    com.vk.superapp.ui.a.s2(aVar2, webAction, activity, null, 28);
                }
                return s3q0.a;
            case 18:
                lambda$loginVKConnect$20 = ((VerificationController) obj2).lambda$loginVKConnect$20((String) obj);
                return lambda$loginVKConnect$20;
            case 19:
                ((uhw0.b) obj2).l.e((vhw0) obj);
                return s3q0.a;
            default:
                ((gzs) obj2).invoke();
                dw20 dw20Var = ((kbx0) obj).b;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ ag1(jpk0 jpk0Var, dhr0.f fVar, VKTheme vKTheme) {
        this.b = 15;
        this.c = fVar;
        this.d = vKTheme;
    }
}
