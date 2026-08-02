package xsna;

import android.net.Uri;
import androidx.preference.Preference;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.autoplay.b;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vkontakte.android.fragments.SettingsAccountInnerFragment;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.boq0;
import xsna.gis0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class vtg0 implements io.reactivex.rxjava3.functions.m, Preference.b, io.reactivex.rxjava3.functions.l, SwipeDrawableRefreshLayout.g, io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.b, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vtg0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        SettingsAccountInnerFragment settingsAccountInnerFragment = (SettingsAccountInnerFragment) this.c;
        int i = SettingsAccountInnerFragment.r0;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        io.reactivex.rxjava3.disposables.b bVar = settingsAccountInnerFragment.n0;
        gs gsVar = new gs();
        gsVar.K("name", "no_wall_replies");
        gsVar.K("value", !booleanValue ? "1" : "0");
        gsVar.k = true;
        bVar.b(gsVar.p());
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((com.vk.movika.sdk.base.ui.q0) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 2:
                return (io.reactivex.rxjava3.core.e) ((o7j0) this.c).invoke(obj);
            case 3:
            case 4:
            case 8:
            case 9:
            case 10:
            default:
                return (Boolean) ((o7j0) this.c).invoke(obj);
            case 5:
                return ((boq0.a) this.c).invoke(obj);
            case 6:
                return (hxq0) ((ehm0) this.c).invoke(obj);
            case 7:
                return (Boolean) ((o7j0) this.c).invoke(obj);
            case 11:
                return (GroupsGroupFullDto) ((o7j0) this.c).invoke(obj);
            case 12:
                return (VideoNotificationsStatus) ((o7j0) this.c).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.t) ((fgm0) this.c).invoke(obj);
        }
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        UsableRecyclerPaginatedView usableRecyclerPaginatedView = (UsableRecyclerPaginatedView) this.c;
        gzs<s3q0> gzsVar = usableRecyclerPaginatedView.P;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        gzs<s3q0> gzsVar2 = usableRecyclerPaginatedView.F;
        if (gzsVar2 != null) {
            gzsVar2.invoke();
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        VideoFile videoFile = (VideoFile) this.c;
        final gis0.a aVar = new gis0.a(rVar);
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        final yg5 e = b.C1208b.a().e(videoFile, null);
        e.f0(aVar);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.fis0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                yg5.this.T(aVar);
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 0:
                return ((Boolean) ((brf) this.c).invoke(obj)).booleanValue();
            case 3:
                return ((Boolean) ((ehm0) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((o7j0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 14:
                return (Uri) ((x2) this.c).invoke(obj, obj2);
            default:
                return (VoipActionsFeatureState.n) ((uki) this.c).invoke(obj, obj2);
        }
    }
}
