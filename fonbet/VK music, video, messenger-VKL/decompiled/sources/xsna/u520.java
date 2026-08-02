package xsna;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.dto.photo.Photo;
import xsna.aa70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class u520 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u520(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                z520 z520Var = (z520) this.c;
                Photo photo = (Photo) this.d;
                io.reactivex.rxjava3.disposables.c subscribe = hg1.m(rsg0.y0(new rea0(photo.e, photo.c), null, null, 3), z520Var.c, 0L, false, 62).subscribe(new o3y(new defpackage.m(21, photo, z520Var), 4), new cw(new s6x(6), 27));
                io.reactivex.rxjava3.disposables.b bVar = z520Var.h;
                (bVar != null ? bVar : null).b(subscribe);
                break;
            default:
                aa70 aa70Var = (aa70) this.c;
                io.reactivex.rxjava3.core.b bVar2 = (io.reactivex.rxjava3.core.b) this.d;
                aa70.a aVar = aa70Var.a;
                if (aVar != null) {
                    c63.c(aVar);
                }
                SharedPreferences.Editor edit = Preference.f("notification_gdpr_dialog").edit();
                edit.putBoolean("dialog_already_shown", true);
                edit.apply();
                bVar2.onComplete();
                break;
        }
    }
}
