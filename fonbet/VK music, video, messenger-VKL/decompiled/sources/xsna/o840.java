package xsna;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.vkontakte.android.R;
import xsna.lc50;

/* compiled from: MusicActionSeekBarViewHolder.kt */
/* loaded from: classes3.dex */
public final class o840 extends n840 {
    public final izs<lc50, s3q0> l;
    public final SeekBar m;
    public final ImageView n;
    public final int o;
    public final c p;

    /* compiled from: MusicActionSeekBarViewHolder.kt */
    public static final class c extends ContentObserver {
        public final /* synthetic */ AudioManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AudioManager audioManager, Handler handler) {
            super(handler);
            this.b = audioManager;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            o840 o840Var = o840.this;
            o840Var.m.setProgress(this.b.getStreamVolume(o840Var.o));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o840(View view, AudioManager audioManager, izs<? super lc50, s3q0> izsVar) {
        super(view);
        this.l = izsVar;
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.seekbar);
        this.m = seekBar;
        this.n = (ImageView) view.findViewById(R.id.icon);
        a aVar = new a();
        this.o = 3;
        c cVar = new c(audioManager, i0q0.a());
        this.p = cVar;
        seekBar.setMax(audioManager.getStreamMaxVolume(3));
        seekBar.setProgress(audioManager.getStreamVolume(3));
        seekBar.setOnSeekBarChangeListener(aVar);
        seekBar.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, cVar);
        seekBar.addOnAttachStateChangeListener(new b(seekBar, this));
    }

    @Override // xsna.n840
    public final void V5(tc50 tc50Var) {
        if (tc50Var.b instanceof lc50.c.e) {
            this.n.setImageDrawable(enj.e(tc50Var.c, tc50Var.f, this.itemView.getContext()));
        }
    }

    /* compiled from: MusicActionSeekBarViewHolder.kt */
    public static final class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            o840.this.l.invoke(new lc50.c.e(i));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ SeekBar b;
        public final /* synthetic */ o840 c;

        public b(SeekBar seekBar, o840 o840Var) {
            this.b = seekBar;
            this.c = o840Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            o840 o840Var = this.c;
            o840Var.m.getContext().getContentResolver().unregisterContentObserver(o840Var.p);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
