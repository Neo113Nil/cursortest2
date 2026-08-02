package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: MusicAudioAlbumSnippetTrackItemView.kt */
/* loaded from: classes18.dex */
public final class na40 extends FluidHorizontalLayout {
    public final AppCompatImageView g;
    public final AppCompatTextView h;
    public final AppCompatTextView i;
    public final AppCompatImageView j;

    public na40(Context context) {
        super(context, null, 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.music_playlist_snippet_item_pause_state_btn);
        bwt0.p0(appCompatImageView, false);
        this.g = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.music_playlist_snippet_item_position);
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextSize(1, 16.0f);
        jno0.c(appCompatTextView, R.attr.vk_ui_text_secondary);
        appCompatTextView.setIncludeFontPadding(false);
        this.h = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R.id.music_playlist_snippet_item_title);
        appCompatTextView2.setGravity(8388627);
        appCompatTextView2.setTextSize(1, 16.0f);
        jno0.c(appCompatTextView2, R.attr.vk_ui_text_muted);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView2.setIncludeFontPadding(false);
        this.i = appCompatTextView2;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.music_explicit);
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context);
        if (a != null) {
            omw.c(R.attr.vk_ui_icon_tertiary, a, appCompatImageView2);
        }
        this.j = appCompatImageView2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, cn70.b(40)));
        dhr0.h0(R.drawable.music_selectable_bg_corner_0, this);
        f4m.w(cn70.b(16), this);
        h(appCompatImageView);
        h(appCompatTextView);
        FluidHorizontalLayout.a aVar2 = new FluidHorizontalLayout.a(-2, -2);
        aVar2.d = 8388627;
        aVar2.a = true;
        s3q0 s3q0Var = s3q0.a;
        addView(appCompatTextView2, aVar2);
        f4m.s(cn70.b(9), appCompatTextView2);
        FluidHorizontalLayout.a aVar3 = new FluidHorizontalLayout.a(-2, -2);
        aVar3.d = 8388611;
        aVar3.e = true;
        addView(appCompatImageView2, aVar3);
        f4m.s(cn70.b(3), appCompatImageView2);
        f4m.q(cn70.b(1), appCompatImageView2);
    }

    public final AppCompatImageView getActionView() {
        return this.g;
    }

    public final AppCompatImageView getExplicitView() {
        return this.j;
    }

    public final AppCompatTextView getPositionView() {
        return this.h;
    }

    public final AppCompatTextView getTitleView() {
        return this.i;
    }

    public final void h(View view) {
        FluidHorizontalLayout.a aVar = new FluidHorizontalLayout.a(cn70.b(24), -2);
        aVar.d = 8388627;
        s3q0 s3q0Var = s3q0.a;
        addView(view, aVar);
        f4m.s(cn70.b(12), view);
    }
}
