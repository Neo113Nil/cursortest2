package xsna;

import android.view.View;
import android.widget.LinearLayout;
import com.vk.dto.common.DownloadingState;
import com.vk.music.design.view.download.DownloadingView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.jd50;
import xsna.lc50;

/* compiled from: MusicTrackMenuModalBottomSheet.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad50 extends FunctionReferenceImpl implements izs<jd50.a.C3117a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(jd50.a.C3117a c3117a) {
        jd50.a.C3117a c3117a2 = c3117a;
        hd50 hd50Var = (hd50) this.receiver;
        LinearLayout linearLayout = hd50Var.m;
        View view = hd50Var.e;
        DownloadingState downloadingState = c3117a2.a;
        List<lc50.b> list = c3117a2.b;
        if (list.contains(lc50.b.c.b) && list.contains(lc50.b.C3261b.b) && list.contains(lc50.b.a.b)) {
            int i = 0;
            while (i < linearLayout.getChildCount()) {
                int i2 = i + 1;
                View childAt = linearLayout.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                childAt.setVisibility(0);
                i = i2;
            }
            DownloadingView downloadingView = hd50Var.n;
            bi40 a = di40.a(downloadingState);
            int i3 = DownloadingView.m;
            downloadingView.a(a, true);
            hd50Var.o.setText(downloadingState instanceof DownloadingState.NotLoaded ? view.getContext().getString(R.string.music_track_menu_download) : downloadingState instanceof DownloadingState.Downloaded ? view.getContext().getString(R.string.music_track_menu_downloaded) : downloadingState instanceof DownloadingState.Downloading ? view.getContext().getString(R.string.music_track_menu_downloading) : "");
        } else {
            int i4 = 0;
            while (i4 < linearLayout.getChildCount()) {
                int i5 = i4 + 1;
                View childAt2 = linearLayout.getChildAt(i4);
                if (childAt2 == null) {
                    throw new IndexOutOfBoundsException();
                }
                childAt2.setVisibility((childAt2.equals(hd50Var.r) || childAt2.equals(hd50Var.q)) ? 0 : 8);
                i4 = i5;
            }
        }
        return s3q0.a;
    }
}
