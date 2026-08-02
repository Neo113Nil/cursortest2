package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupRedesignCardWithBottomBtnVh;
import com.vk.catalog2.feature.music.configuration.MusicSearchCatalogConfiguration;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.comments.api.di.CommentsComponent;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.im.chat.clips.decoration.impl.di.ImChatClipsDecorationScopedComponentImpl;
import com.vk.im.chat.clips.decoration.impl.di.ImChatClipsDecorationScopedComponentImpl.b;
import com.vk.im.ui.dialogs_list.ImDialogsFragment;
import com.vk.libvideo.live.impl.dialog.LiveVideoDialog;
import com.vk.log.L;
import com.vk.messagetemplates.api.TemplatesComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.toggle.features.VideoFeatures;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.utils.log.LogUploader;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.List;
import java.util.concurrent.ExecutorService;
import xsna.tps0;
import xsna.x6y.a;
import xsna.xn50;
import xsna.z710;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class s1m implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s1m(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                mih0 mih0Var = (mih0) obj;
                if (mih0Var.d() != null) {
                    Integer d = mih0Var.d();
                    if (d == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    r3 = new BaseBadgeHolder.a.C0709a(d.intValue(), R.attr.vk_ui_icon_contrast);
                }
                return r3;
            case 1:
                efm efmVar = ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) obj).e;
                if (efmVar != null) {
                    efmVar.A();
                }
                return s3q0.a;
            case 2:
                return "onMsgEditUpdate: " + ((h980) obj);
            case 3:
                return ((NewsFeedComponent) ((k7m) m7m.c(((sto) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 4:
                return (TextView) ((View) ((i7p) obj).c.getValue()).findViewById(R.id.scheduleHint);
            case 5:
                Object obj2 = ((pop) obj).o;
                ((qop) (obj2 != null ? obj2 : null)).J1();
                return s3q0.a;
            case 6:
                ftp ftpVar = (ftp) obj;
                ftpVar.d.f0(ftpVar.e);
                return s3q0.a;
            case 7:
                return ((NewsFeedComponent) ((k7m) m7m.f((gzp) obj)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 8:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_VALIDATE_MANIFEST;
                videoFeatures.getClass();
                return new nj00(com.vk.toggle.b.A.a(videoFeatures), new gbj((a6q) obj, 8));
            case 9:
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) obj;
                qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
                return faveFeedFragment;
            case 10:
                return "handleInit: config= " + ((mrk0) obj);
            case 11:
                return ((CommentsComponent) ((k7m) m7m.f((com.vk.newsfeed.common.recycler.holders.a) obj)).mo408a(fpf0.a(CommentsComponent.class))).jd();
            case 12:
                return ((com.vk.geo.impl.presentation.b) obj).v.get();
            case 13:
                return ((y4u) obj).e.e7();
            case 14:
                GroupRedesignCardWithBottomBtnVh groupRedesignCardWithBottomBtnVh = (GroupRedesignCardWithBottomBtnVh) obj;
                com.vk.catalog2.common.ui.holders.group.a aVar = groupRedesignCardWithBottomBtnVh.l;
                FullSourceJoinApi p = groupRedesignCardWithBottomBtnVh.p();
                aVar.getClass();
                com.vk.catalog2.common.ui.holders.group.a.d(aVar, true, null, p, 6);
                return s3q0.a;
            case 15:
                fxu fxuVar = (fxu) obj;
                mtk0 mtk0Var = fxuVar.c;
                xvy xvyVar = fxuVar.b;
                Context context = fxuVar.a;
                xuy xuyVar = (xuy) j5g.a0(xvyVar.j().f());
                xuy xuyVar2 = (xuy) j5g.k0(xvyVar.j().f());
                String str = "";
                if (xuyVar == null || xuyVar2 == null) {
                    return "";
                }
                BookingCalendarScreenState.DaySelector.a aVar2 = (BookingCalendarScreenState.DaySelector.a) ((List) mtk0Var.getValue()).get(xuyVar.getIndex());
                BookingCalendarScreenState.DaySelector.a aVar3 = (BookingCalendarScreenState.DaySelector.a) ((List) mtk0Var.getValue()).get(xuyVar2.getIndex());
                int i3 = aVar2.a;
                if (i3 == aVar3.a) {
                    String[] j = enj.j(R.array.booking_month, context);
                    return (i3 < 0 || i3 >= j.length) ? "" : j[i3];
                }
                String[] j2 = enj.j(R.array.booking_month, context);
                String str2 = (i3 < 0 || i3 >= j2.length) ? "" : j2[i3];
                String[] j3 = enj.j(R.array.booking_month, context);
                int i4 = aVar3.a;
                if (i4 >= 0 && i4 < j3.length) {
                    str = j3[i4];
                }
                return context.getString(R.string.booking_calendar_month_join, str2, str);
            case 16:
                qcy<Object>[] qcyVarArr2 = ImChatClipsDecorationScopedComponentImpl.h;
                return ((ImChatClipsDecorationScopedComponentImpl) obj).new b();
            case 17:
                return Boolean.valueOf(o25.b(((ImDialogsFragment) obj).S));
            case 18:
                return new tps0.a(((gex) obj).e, -1, null, 1, iah0.a(12), null, 224);
            case 19:
                return ((x6y) obj).new a();
            case 20:
                whz whzVar = (whz) obj;
                View findViewById = whzVar.getView().findViewById(R.id.overlay);
                bwt0.i0(findViewById, new e2s(whzVar, 7));
                return findViewById;
            case 21:
                return Integer.valueOf(((LiveVideoDialog) obj).i0.getCurrentPosition());
            case 22:
                MainActivity mainActivity = (MainActivity) obj;
                io.reactivex.rxjava3.disposables.c cVar = mainActivity.A;
                if (cVar != null) {
                    cVar.dispose();
                }
                asu0.a.getClass();
                ExecutorService n = asu0.n();
                LogUploader logUploader = LogUploader.a;
                n.execute(new f5m(i2));
                int i5 = 2;
                eiz eizVar = new eiz(mainActivity, i5);
                sr10 sr10Var = dy2.a;
                if (sr10Var != null) {
                    itg0.h(sa30.c(new io.reactivex.rxjava3.internal.operators.single.v(new jw6(sr10Var, i5))), new jjx(eizVar, 4), new hoh(L.a, 5));
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 23:
                return ((gp00) obj).h;
            case 24:
                xn50.a.c(((f910) obj).d, z710.l.b);
                return s3q0.a;
            case 25:
                hk30 hk30Var = (hk30) obj;
                TextPaint textPaint = new TextPaint();
                textPaint.setColor(-16777216);
                com.vk.typography.b.c(textPaint, hk30Var.a, FontFamily.MEDIUM, Float.valueOf(hk30Var.b.b(R.dimen.vkim_msg_part_fwd_title)), TextSizeUnit.PX);
                return textPaint;
            case 26:
                return (TemplatesComponent) ((k7m) m7m.f((kz30) obj)).mo408a(fpf0.a(TemplatesComponent.class));
            case 27:
                return ((MusicCatalogRootVh) obj).t;
            case 28:
                return new ke40(((te40) obj).a);
            default:
                return (b25) ((MusicSearchCatalogConfiguration) obj).N.getValue();
        }
    }
}
