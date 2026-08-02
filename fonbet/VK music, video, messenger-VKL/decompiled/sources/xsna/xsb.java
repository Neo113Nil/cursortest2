package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xsb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xsb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ftb ftbVar = (ftb) obj;
                ftbVar.j = null;
                ftbVar.e.T();
                break;
            case 1:
                a3t a3tVar = (a3t) obj;
                Context context = e43.a;
                (context != null ? context : null).getContentResolver().unregisterContentObserver(a3tVar);
                break;
            case 2:
                ((ksw) obj).j.run();
                break;
            case 3:
                Playlist playlist = (Playlist) obj;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new u8b0(playlist));
                break;
            default:
                r55 r55Var = r55.a;
                ((l2q) r55.d()).i((UserId) obj);
                break;
        }
    }
}
