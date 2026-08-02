package xsna;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.vk.voip.ui.dumps.CollectDumpDuration;
import com.vk.voip.ui.view.VoipActionSingleLineView;
import com.vkontakte.android.R;

/* compiled from: CollectDumpViewWrapper.kt */
/* loaded from: classes7.dex */
public final class n4g {
    public final View a;
    public final f4g b;
    public final VoipActionSingleLineView c;
    public final VoipActionSingleLineView d;
    public final TextView e;
    public final AppCompatSeekBar f;
    public final View g;
    public final View h;

    public n4g(View view, f4g f4gVar) {
        this.a = view;
        this.b = f4gVar;
        VoipActionSingleLineView voipActionSingleLineView = (VoipActionSingleLineView) view.findViewById(R.id.dump_audio);
        this.c = voipActionSingleLineView;
        VoipActionSingleLineView voipActionSingleLineView2 = (VoipActionSingleLineView) view.findViewById(R.id.dump_video);
        this.d = voipActionSingleLineView2;
        this.e = (TextView) view.findViewById(R.id.duration_value);
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) view.findViewById(R.id.duration_seek_bar);
        this.f = appCompatSeekBar;
        View findViewById = view.findViewById(R.id.submit);
        this.g = findViewById;
        View findViewById2 = view.findViewById(R.id.submit_local_only);
        this.h = findViewById2;
        appCompatSeekBar.setOnSeekBarChangeListener(new a());
        voipActionSingleLineView.setSwitchListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.k4g
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                f4g f4gVar2 = n4g.this.b;
                f4gVar2.c = j4g.a(f4gVar2.c, z, false, null, false, 14);
                f4gVar2.a();
            }
        });
        voipActionSingleLineView2.setSwitchListener(new l4g(this, 0));
        bwt0.i0(findViewById, new m4g(this, 0));
        bwt0.i0(findViewById2, new wze(this, 2));
    }

    /* compiled from: CollectDumpViewWrapper.kt */
    public static final class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                f4g f4gVar = n4g.this.b;
                f4gVar.getClass();
                if (i < 0 || i > CollectDumpDuration.i().size()) {
                    return;
                }
                f4gVar.c = j4g.a(f4gVar.c, false, false, (CollectDumpDuration) CollectDumpDuration.i().get(i), false, 11);
                f4gVar.a();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
