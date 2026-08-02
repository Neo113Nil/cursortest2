package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: MusicAudioPlaylistSnippetTrackItem.kt */
/* loaded from: classes18.dex */
public final class ua40 extends ConstraintLayout {
    public final AppCompatImageView t;
    public final AppCompatTextView u;
    public final AppCompatImageView v;
    public final AppCompatTextView w;

    public ua40(Context context) {
        super(context, null, 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.music_playlist_snippet_item_pause_state_btn);
        this.t = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.music_playlist_snippet_item_title);
        appCompatTextView.setTextSize(1, 16.0f);
        jno0.c(appCompatTextView, R.attr.vk_ui_text_muted);
        appCompatTextView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setIncludeFontPadding(false);
        this.u = appCompatTextView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.music_explicit);
        Context context2 = appCompatImageView2.getContext();
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context2);
        if (a != null) {
            omw.c(R.attr.vk_ui_icon_tertiary, a, appCompatImageView2);
        }
        this.v = appCompatImageView2;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R.id.music_playlist_snippet_item_subtitle);
        appCompatTextView2.setTextSize(1, 14.0f);
        jno0.c(appCompatTextView2, R.attr.vk_ui_text_secondary);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setIncludeFontPadding(false);
        this.w = appCompatTextView2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, cn70.b(52)));
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(R.drawable.music_selectable_bg_corner_0, this);
        ConstraintLayout.b bVar = new ConstraintLayout.b(cn70.b(36), -2);
        bVar.t = 0;
        bVar.i = 0;
        bVar.l = 0;
        s3q0 s3q0Var = s3q0.a;
        addView(appCompatImageView, bVar);
        f4m.s(cn70.b(12), appCompatImageView);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.W = true;
        bVar2.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar2.k = R.id.music_playlist_snippet_item_subtitle;
        bVar2.u = R.id.music_explicit;
        bVar2.s = R.id.music_playlist_snippet_item_pause_state_btn;
        bVar2.i = 0;
        bVar2.J = 2;
        bVar2.K = 2;
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = cn70.b(1);
        addView(appCompatTextView, bVar2);
        f4m.s(cn70.b(9), appCompatTextView);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.v = 0;
        bVar3.s = R.id.music_playlist_snippet_item_title;
        bVar3.l = R.id.music_playlist_snippet_item_title;
        addView(appCompatImageView2, bVar3);
        f4m.s(cn70.b(3), appCompatImageView2);
        f4m.q(cn70.b(1), appCompatImageView2);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        bVar4.W = true;
        bVar4.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar4.j = R.id.music_playlist_snippet_item_title;
        bVar4.t = R.id.music_playlist_snippet_item_title;
        bVar4.v = 0;
        bVar4.l = 0;
        bVar4.K = 2;
        ((ViewGroup.MarginLayoutParams) bVar4).topMargin = cn70.b(1);
        addView(appCompatTextView2, bVar4);
        f4m.r(cn70.b(12), appCompatTextView2);
    }

    public final AppCompatImageView getActionView() {
        return this.t;
    }

    public final AppCompatImageView getExplicitView() {
        return this.v;
    }

    public final AppCompatTextView getSubtitleView() {
        return this.w;
    }

    public final AppCompatTextView getTitleView() {
        return this.u;
    }
}
