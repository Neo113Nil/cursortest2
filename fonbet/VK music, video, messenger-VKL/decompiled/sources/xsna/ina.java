package xsna;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.vk.dto.music.MusicTrack;
import xsna.yak;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ina implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ina(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                jna jnaVar = (jna) this.c;
                lna lnaVar = (lna) this.d;
                izs<MusicTrack, s3q0> izsVar = jnaVar.c;
                if (izsVar != null) {
                    izsVar.invoke(lnaVar.a);
                    break;
                }
                break;
            case 1:
                ((zak) this.c).invoke(Integer.valueOf(((yak.a) this.d).getAdapterPosition()));
                break;
            default:
                Snackbar snackbar = (Snackbar) this.c;
                View.OnClickListener onClickListener = (View.OnClickListener) this.d;
                snackbar.getClass();
                onClickListener.onClick(view);
                snackbar.b(1);
                break;
        }
    }
}
