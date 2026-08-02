package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.vk.voip.call_effects.beauty.BeautyFilterIntensity;
import com.vkontakte.android.R;
import xsna.aw6;

/* compiled from: BeautySettingsView.kt */
@SuppressLint({"InflateParams"})
/* loaded from: classes7.dex */
public final class gw6 {
    public final io.reactivex.rxjava3.subjects.f<aw6> a;
    public final TextView b;
    public final SeekBar c;
    public final View d;

    public gw6(Context context, ViewGroup viewGroup) {
        LayoutInflater from = LayoutInflater.from(context);
        this.a = new io.reactivex.rxjava3.subjects.f<>();
        View inflate = from.inflate(R.layout.voip_beauty_settings, viewGroup, false);
        this.d = inflate;
        bwt0.i0(inflate.findViewById(R.id.back), new n40(this, 9));
        bwt0.i0(inflate.findViewById(R.id.voip_beauty_intensity_save), new qm1(this, 6));
        this.b = (TextView) inflate.findViewById(R.id.intensity_value);
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.intensity_seek_bar);
        this.c = seekBar;
        seekBar.setOnSeekBarChangeListener(new a());
    }

    /* compiled from: BeautySettingsView.kt */
    public static final class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            BeautyFilterIntensity beautyFilterIntensity;
            if (z) {
                BeautyFilterIntensity[] values = BeautyFilterIntensity.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        beautyFilterIntensity = null;
                        break;
                    }
                    beautyFilterIntensity = values[i2];
                    if (beautyFilterIntensity.j() == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (beautyFilterIntensity == null) {
                    return;
                }
                gw6.this.a.onNext(new aw6.d(beautyFilterIntensity));
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
