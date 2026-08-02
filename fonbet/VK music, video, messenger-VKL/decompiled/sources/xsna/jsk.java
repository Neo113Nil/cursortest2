package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.core.preference.Preference;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.id.UserId;
import com.vk.feed.design.view.posting.preview.image.attach.PostingPreviewImage;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.settings.DarkThemeTimetableFragment;
import com.vk.libvideo.ui.VideoHidePollView;
import com.vk.mytarget.report.MyTargetReportFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomToolbarFragment;
import com.vk.photoviewer.PhotoViewer;
import xsna.hcp0;
import xsna.sgh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class jsk implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jsk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionSearchMode uIBlockActionSearchMode;
        UserId userId;
        int i = this.b;
        long j = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                DarkThemeTimetableFragment darkThemeTimetableFragment = (DarkThemeTimetableFragment) obj;
                nyo0 nyo0Var = darkThemeTimetableFragment.P;
                if (nyo0Var == null) {
                    nyo0Var = null;
                }
                nyo0Var.getClass();
                int m = (int) Preference.m(8L, "THEME_TIMETABLE", "HOUR_END");
                nyo0 nyo0Var2 = darkThemeTimetableFragment.P;
                (nyo0Var2 != null ? nyo0Var2 : null).getClass();
                darkThemeTimetableFragment.fo(new f9h(darkThemeTimetableFragment, 2), m, (int) Preference.m(0L, "THEME_TIMETABLE", "MINUTE_END"));
                break;
            case 1:
                ((xlu) obj).getPresenter().h2();
                break;
            case 2:
                com.vk.im.video.g gVar = (com.vk.im.video.g) obj;
                t4w t4wVar = gVar.t;
                if (t4wVar == null) {
                    t4wVar = null;
                }
                if (!t4wVar.W0()) {
                    fh5 fh5Var = gVar.w;
                    (fh5Var != null ? fh5Var : null).u0();
                    break;
                }
                break;
            case 3:
                ((hcp0.c) obj).invoke();
                break;
            case 4:
                wp30 wp30Var = (wp30) obj;
                pk30 pk30Var = wp30Var.i;
                xp30 xp30Var = wp30Var.h;
                Msg msg = xp30Var != null ? xp30Var.n : null;
                Attach attach = xp30Var != null ? xp30Var.p : null;
                if (pk30Var != null && msg != null && attach != null) {
                    pk30Var.M(attach, msg, xp30Var != null ? xp30Var.o : null);
                    break;
                }
                break;
            case 5:
                MyTargetReportFragment myTargetReportFragment = (MyTargetReportFragment) obj;
                int i2 = MyTargetReportFragment.X;
                myTargetReportFragment.jo();
                myTargetReportFragment.finish();
                break;
            case 6:
                int i3 = NewsfeedCustomToolbarFragment.W;
                ((NewsfeedCustomToolbarFragment) obj).go(sgh0.b.a);
                break;
            case 7:
                ((sa) obj).invoke(view);
                break;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!photoViewer.L) {
                    photoViewer.g(true);
                    break;
                } else {
                    photoViewer.i();
                    break;
                }
            case 9:
                ((dw20) obj).hide();
                break;
            case 10:
                int i4 = PostingPreviewImage.z;
                ((gzs) obj).invoke();
                break;
            case 11:
                ym30 ym30Var = vm30.this.t0;
                if (ym30Var != null) {
                    ym30Var.x0();
                    break;
                }
                break;
            case 12:
                ToolbarRedesignVh toolbarRedesignVh = (ToolbarRedesignVh) obj;
                izs<Long, s3q0> izsVar = toolbarRedesignVh.j;
                UIBlockList uIBlockList = toolbarRedesignVh.v;
                if (uIBlockList != null && (uIBlockActionSearchMode = uIBlockList.I) != null && (userId = uIBlockActionSearchMode.g) != null) {
                    j = userId.b;
                }
                izsVar.invoke(Long.valueOf(j));
                break;
            case 13:
                VideoHidePollView videoHidePollView = (VideoHidePollView) obj;
                videoHidePollView.v.invoke(new VideoHidePollView.a.C1250a(0, videoHidePollView.t.getText().toString()));
                videoHidePollView.P4();
                break;
            default:
                Object obj2 = ((ymu0) obj).o;
                ((xmu0) (obj2 != null ? obj2 : null)).e0();
                break;
        }
    }
}
