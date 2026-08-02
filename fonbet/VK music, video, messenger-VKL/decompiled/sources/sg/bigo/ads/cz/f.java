package sg.bigo.ads.cz;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.core.player.d;

/* loaded from: classes9.dex */
public abstract class f extends FrameLayout implements sg.bigo.ads.ak.a, a {
    private final View.OnClickListener a;

    @Nullable
    protected sg.bigo.ads.dk.c b;

    @NonNull
    protected Context c;

    @NonNull
    protected final sg.bigo.ads.ak.b d;

    @Nullable
    protected final sg.bigo.ads.cp.a e;

    @Nullable
    protected ImageView f;
    public boolean g;
    protected ImageView h;
    protected boolean i;
    private final Runnable j;
    private boolean k;

    public f(@NonNull Context context, @NonNull sg.bigo.ads.ak.b bVar, @Nullable sg.bigo.ads.cp.a aVar) {
        super(context);
        this.g = true;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: sg.bigo.ads.cz.f.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view != null) {
                    switch (view.getId()) {
                        case 200011:
                            f.this.setMute(!r2.c());
                            break;
                        case 200012:
                            f.this.k();
                            break;
                    }
                }
            }
        };
        this.a = onClickListener;
        this.j = new Runnable() { // from class: sg.bigo.ads.cz.f.2
            @Override // java.lang.Runnable
            public final void run() {
                f.this.setPlayOrPauseViewHidden(true);
            }
        };
        this.i = false;
        this.k = true;
        this.c = context;
        this.d = bVar;
        this.e = aVar;
        if (!bVar.c) {
            int b = sg.bigo.ads.common.utils.a.b(context, R.dimen.bigo_ad_volume_padding);
            ImageView imageView = new ImageView(this.c);
            this.f = imageView;
            imageView.setOnClickListener(onClickListener);
            this.f.setPadding(b, b, b, b);
            int b2 = (b * 2) + sg.bigo.ads.common.utils.a.b(this.c, R.dimen.bigo_ad_volume_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b2, b2, 85);
            layoutParams.rightMargin = b;
            layoutParams.bottomMargin = b;
            this.f.setId(200011);
            this.f.setVisibility(0);
            v.a(this.f, this, layoutParams, -1);
        }
        int b3 = sg.bigo.ads.common.utils.a.b(this.c, R.dimen.bigo_ad_replay_size);
        if (aVar != null && aVar.y() == 2 && sg.bigo.ads.ak.b.b() > 0) {
            b3 = sg.bigo.ads.common.utils.f.a(this.c, sg.bigo.ads.ak.b.b());
        }
        ImageView imageView2 = new ImageView(this.c);
        this.h = imageView2;
        imageView2.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.c, R.drawable.bigo_ad_ic_media_play));
        v.a(this.h, this, new FrameLayout.LayoutParams(b3, b3, 17), -1);
        setId(200012);
        setOnClickListener(onClickListener);
    }

    public final void a(String str, Object obj, @Nullable int[] iArr) {
        sg.bigo.ads.dk.c cVar = this.b;
        if (cVar != null) {
            cVar.a(str, obj, iArr);
        }
    }

    public final void b(int i) {
        sg.bigo.ads.cp.a aVar = this.e;
        if (aVar != null) {
            sg.bigo.ads.da.b.a(aVar, i, aVar.aS(), this.e.aU());
        }
    }

    public final void c(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.c, z ? R.drawable.bigo_ad_ic_media_play : R.drawable.bigo_ad_ic_media_pause));
        }
    }

    public final void d(boolean z) {
        sg.bigo.ads.core.player.d dVar;
        sg.bigo.ads.core.player.d dVar2;
        if (z) {
            dVar2 = d.a.a;
            dVar2.a(this);
        } else {
            dVar = d.a.a;
            dVar.b(this);
        }
    }

    public final void e(boolean z) {
        if (this.i) {
            b(9);
        }
        a(z);
    }

    public void k() {
        t();
    }

    public boolean n() {
        return this.k;
    }

    public final boolean o() {
        return this.i;
    }

    public final void p() {
        this.i = false;
    }

    public final void q() {
        if (r()) {
            a();
        }
    }

    public final boolean r() {
        return getPlayStatus() == 2;
    }

    public final void s() {
        this.i = true;
        a();
        b(8);
    }

    public void setNeedPauseWhenVisiblePercentEqual(boolean z) {
        this.g = z;
    }

    public void setOnEventListener(sg.bigo.ads.dk.c cVar) {
        this.b = cVar;
    }

    public void setPlayOrPauseViewHidden(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z ? 8 : 0);
        }
    }

    public void setStatPrepareEventOnce(boolean z) {
        this.k = z;
    }

    public void setVolumeViewHidden(boolean z) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(z ? 4 : 0);
        }
    }

    public final void t() {
        if (e()) {
            if (r()) {
                removeCallbacks(this.j);
                s();
                setPlayOrPauseViewHidden(false);
                c(true);
                return;
            }
            removeCallbacks(this.j);
            e(false);
            this.h.setVisibility(0);
            setPlayOrPauseViewHidden(false);
            c(false);
            postDelayed(this.j, 1500L);
        }
    }

    public final void a(String str, @Nullable int[] iArr) {
        sg.bigo.ads.dk.c cVar = this.b;
        if (cVar != null) {
            cVar.a(str, iArr);
        }
    }

    public final void b(boolean z) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.c, z ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
        }
    }

    public boolean e() {
        return false;
    }

    public void a(boolean z) {
        this.i = false;
    }
}
