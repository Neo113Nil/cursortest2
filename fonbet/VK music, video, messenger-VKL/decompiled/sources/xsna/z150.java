package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.core.view.components.cell.VkCell;
import com.vk.music.design.view.download.DownloadingView;
import com.vkontakte.android.R;

/* compiled from: MusicPlaylistCellVh.kt */
/* loaded from: classes16.dex */
public final class z150 implements VkCell.d {
    public final wt30 a;
    public final hvz b;
    public final DownloadingView c;
    public final View d;
    public final ImageView e;
    public final LinearLayout f;

    public z150(Context context, boolean z, wt30 wt30Var, hvz hvzVar) {
        this.a = wt30Var;
        this.b = hvzVar;
        DownloadingView downloadingView = new DownloadingView(context, null, 6);
        downloadingView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        float f = 16;
        bwt0.m0(iah0.a(f), iah0.a(f), downloadingView);
        abg0 abg0Var = dhr0.t;
        downloadingView.setTint(abg0Var.c(R.attr.vk_ui_track_buffer));
        downloadingView.setDownloadingTint(abg0Var.c(R.attr.vk_ui_track_buffer));
        downloadingView.setDownloadedIcon(R.drawable.vk_icon_arrow_down_circle_16);
        downloadingView.setNotLoadedIcon(R.drawable.vk_icon_download_outline_16);
        downloadingView.b = z;
        downloadingView.setOnClickListener(new f9(this, 11));
        downloadingView.setVisibility(8);
        this.c = downloadingView;
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        float f2 = 4;
        bwt0.m0(iah0.a(f2), iah0.a(f2), view);
        view.setVisibility(8);
        this.d = view;
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.playlist_menu);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        bwt0.m0(iah0.a(f), iah0.a(f), imageView);
        imageView.setImageDrawable(abg0Var.a(R.drawable.vk_icon_more_vertical_16));
        imageView.setColorFilter(abg0Var.c(R.attr.vk_ui_icon_secondary));
        imageView.setContentDescription(context.getString(R.string.music_talkback_more));
        imageView.setOnClickListener(new dd6(this, 8));
        this.e = imageView;
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        a.setGravity(17);
        a.setLayoutParams(layoutParams);
        a.addView(downloadingView);
        a.addView(view);
        a.addView(imageView);
        this.f = a;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        a250 a250Var = fVar instanceof a250 ? (a250) fVar : null;
        if (a250Var != null) {
            boolean z = a250Var.b;
            View view = this.d;
            DownloadingView downloadingView = this.c;
            if (z) {
                downloadingView.a(di40.a(a250Var.a.H), false);
                awt0.u(view, downloadingView.getVisibility() == 0);
            } else {
                f4m.j(downloadingView);
                f4m.j(view);
            }
            awt0.u(this.e, a250Var.c);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.f;
    }
}
