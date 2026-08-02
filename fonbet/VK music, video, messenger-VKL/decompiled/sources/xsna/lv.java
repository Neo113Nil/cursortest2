package xsna;

import android.content.DialogInterface;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class lv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((fw) this.c).e.b();
                break;
            case 1:
                VideoProfileFragmentOld.d dVar = ((wlg) this.c).c;
                dVar.invoke(a.e.b);
                dVar.invoke(new a.f(true));
                break;
            default:
                ((gzs) this.c).invoke();
                break;
        }
    }
}
