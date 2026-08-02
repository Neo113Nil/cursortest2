package xsna;

import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import java.util.ArrayList;

/* compiled from: State.kt */
/* loaded from: classes2.dex */
public final class zsk0 {
    public boolean a;
    public ImBgSyncState b;
    public long c;
    public xpp<Dialog> d;
    public ProfilesInfo e;
    public int f;
    public ArrayList g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public z8m l;
    public boolean m;
    public boolean n;
    public boolean o;

    public final Dialog a() {
        return this.d.a();
    }

    public final DialogExt b() {
        return new DialogExt(new ypp(Long.valueOf(this.c), this.d.a(), false), this.e, null, 4, null);
    }

    public final boolean c() {
        return this.c != 0;
    }
}
