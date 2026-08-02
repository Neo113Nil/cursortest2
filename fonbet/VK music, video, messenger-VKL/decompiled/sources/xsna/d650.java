package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.music.MusicTrack;
import com.vk.music.snippet.ui.preview.MusicSnippetPreviewProgressView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: MusicSnippetPreviewModalView.kt */
/* loaded from: classes3.dex */
public final class d650 extends LinearLayout {
    public final ThumbsImageView b;
    public final TextView c;
    public final TextView d;
    public final ConstraintLayout e;
    public final View f;
    public final MusicSnippetPreviewProgressView g;
    public k230 h;

    public d650(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.music_snippet_modal_view, (ViewGroup) this, true);
        this.b = (ThumbsImageView) findViewById(R.id.image);
        this.c = (TextView) findViewById(R.id.track_name);
        this.d = (TextView) findViewById(R.id.track_artist);
        this.f = findViewById(R.id.add_to_music_button);
        this.e = (ConstraintLayout) findViewById(R.id.add_to_music_layout);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.snippet_layout);
        this.g = (MusicSnippetPreviewProgressView) findViewById(R.id.progressView);
        setCoverConfiguration(getResources().getConfiguration().orientation);
        setOnClickListener(new qp4(this, 4));
        constraintLayout.setOnClickListener(null);
    }

    private final void setCoverConfiguration(int i) {
        ThumbsImageView thumbsImageView = this.b;
        if (i == 1) {
            if (thumbsImageView != null) {
                thumbsImageView.setVisibility(0);
            }
        } else if (thumbsImageView != null) {
            f4m.j(thumbsImageView);
        }
    }

    public final k230 getSnippetListener() {
        return this.h;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCoverConfiguration(configuration != null ? configuration.orientation : 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Integer.min(iah0.z(getContext()), iah0.p(getContext())), 1073741824), i2);
    }

    public final void setAddButton(MusicTrack musicTrack) {
        this.e.setVisibility(0);
        jjc.g(this.f, new az2(22, this, musicTrack));
    }

    public final void setCover(MusicTrack musicTrack) {
        ThumbsImageView thumbsImageView = this.b;
        if (thumbsImageView == null || !f4m.h(thumbsImageView) || thumbsImageView == null) {
            return;
        }
        thumbsImageView.setThumb(musicTrack.Jb());
        Context context = thumbsImageView.getContext();
        e3m.a aVar = e3m.a;
        thumbsImageView.setOverlayImage(m33.a(R.drawable.player_ad_gradient_16dp, context));
    }

    public final void setSnippetListener(k230 k230Var) {
        this.h = k230Var;
    }

    public final void setTextInfo(MusicTrack musicTrack) {
        String str = musicTrack.d;
        TextView textView = this.c;
        textView.setText(str);
        if (musicTrack.s) {
            Context context = getContext();
            e3m.a aVar = e3m.a;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context), (Drawable) null);
            textView.setCompoundDrawablePadding(iah0.a(4));
        }
        this.d.setText(ob50.a(musicTrack));
    }
}
