package xsna;

import android.os.Bundle;
import android.view.View;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.im.ui.views.settings.SwitchSettingsView;
import com.vk.photos.root.photoflow.presentation.views.PhotoFlowRecyclerPaginatedView;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.Iterator;
import java.util.List;
import xsna.h8z0;
import xsna.hjz0;
import xsna.phg0;
import xsna.tr20;
import xsna.uon0;
import xsna.xn50;
import xsna.ydz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class or20 implements SwitchSettingsView.b, io.reactivex.rxjava3.functions.l, PhotoFlowRecyclerPaginatedView.a, pcs, io.reactivex.rxjava3.functions.m, uon0.a, h8z0.b, ydz0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ or20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.h8z0.b
    public void a() {
        t6z0 t6z0Var = (t6z0) this.c;
        hjz0.a aVar = t6z0Var.a;
        String str = t6z0Var.l.F;
        yil0.d(aVar);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (Long) ((aq1) this.c).invoke(obj);
            case 2:
                return (s3q0) ((f2s) this.c).invoke(obj);
            case 3:
                return (Playlist) ((ebx) this.c).c;
            case 4:
                return (List) ((pey) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.t) ((qz40) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.t) ((jsg) this.c).invoke(obj);
            case 7:
                return (NewsfeedData) ((pey) this.c).invoke(obj);
            case 8:
                return (jv60) ((qz40) this.c).invoke(obj);
            case 9:
            case 16:
            case 22:
            default:
                return (ke3) ((ai6) this.c).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((zgo) this.c).invoke(obj);
            case 11:
                return (phg0.f) ((qz40) this.c).invoke(obj);
            case 12:
                return (jwk) ((ai6) this.c).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.t) ((qz40) this.c).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.t) ((d7l0) this.c).invoke(obj);
            case 15:
                return (ExtendedUserProfile) ((sx4) this.c).invoke(obj);
            case 17:
                return (VideoNotificationsStatus) ((d7l0) this.c).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.t) ((efr0) this.c).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.t) ((zas0) this.c).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.t) ((com.vk.im.engine.internal.storage.delegates.dialogs.a) this.c).invoke(obj);
            case 21:
                return (List) ((d7l0) this.c).invoke(obj);
            case 23:
                return (tnf0) ((d7l0) this.c).invoke(obj);
            case 24:
                return (Boolean) ((d7l0) this.c).invoke(obj);
        }
    }

    @Override // com.vk.im.ui.views.settings.SwitchSettingsView.b
    public void c(boolean z, boolean z2) {
        pr20 pr20Var = (pr20) this.c;
        if (z2) {
            View view = pr20Var.m;
            if (view == null) {
                view = null;
            }
            view.setVisibility(0);
            SwitchSettingsView switchSettingsView = pr20Var.k;
            (switchSettingsView != null ? switchSettingsView : null).setSwitchEnabled(false);
            xn50.a.c(pr20Var, new tr20.c(z));
        }
    }

    @Override // xsna.uon0.a
    public Object execute() {
        uvx0 uvx0Var = (uvx0) this.c;
        Iterator<sop0> it = uvx0Var.b.u3().iterator();
        while (it.hasNext()) {
            uvx0Var.c.b(it.next(), 1);
        }
        return null;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        VideoCatalogFragment videoCatalogFragment = (VideoCatalogFragment) this.c;
        int i = VideoCatalogFragment.l0;
        videoCatalogFragment.go();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
        }
        return ((Boolean) ((d7l0) this.c).invoke(obj)).booleanValue();
    }

    @Override // xsna.ydz0.b
    public void a(View view, dhz0 dhz0Var) {
        ((eju) this.c).onClick(view);
    }
}
