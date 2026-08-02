package xsna;

import android.widget.SeekBar;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: CompositeSeekBarListener.kt */
@ozl
/* loaded from: classes8.dex */
public final class lui implements SeekBar.OnSeekBarChangeListener {
    public final LinkedHashSet b = new LinkedHashSet();

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onProgressChanged(seekBar, i, z);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onStopTrackingTouch(seekBar);
        }
    }
}
