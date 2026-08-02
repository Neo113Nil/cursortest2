package xsna;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import xsna.cm10;
import xsna.v1j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class dac implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ dac(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.b) {
            case 0:
                Chip chip = (Chip) this.c;
                cm10.a<Chip> aVar = chip.k;
                if (aVar != null) {
                    r1c r1cVar = ((q1c) aVar).a;
                    if (!z ? r1cVar.e(chip, r1cVar.e) : r1cVar.a(chip)) {
                        r1cVar.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.j;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    break;
                }
                break;
            default:
                ((lak) this.c).r.invoke(new v1j.s(z));
                break;
        }
    }
}
