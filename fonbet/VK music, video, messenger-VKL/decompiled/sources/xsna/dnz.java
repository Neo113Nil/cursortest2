package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.preference.Preference;
import com.vk.api.generated.account.dto.AccountGetModelsResponseDto;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.tips.Tooltip;
import com.vk.dto.stickers.StickersRecommendationBlock;
import com.vk.friends.discover.UsersDiscoverPresenter;
import com.vk.photos.legacy.PhotoListFragment;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import xsna.i8a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dnz implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.core.s, PhotoFlowToolbarView.c, io.reactivex.rxjava3.functions.c, Preference.c, Tooltip.c, xlj, i0u0, io.reactivex.rxjava3.functions.d, io.reactivex.rxjava3.core.d {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dnz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.vk.content.design.view.photo.flow.PhotoFlowToolbarView.c
    public void a0() {
        ((z8a0) this.c).e.invoke(i8a0.a.b);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((nyq) obj2).invoke(obj);
            case 1:
            case 3:
            case 6:
            case 7:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 24:
            default:
                return (io.reactivex.rxjava3.core.t) ((wql0) obj2).invoke(obj);
            case 2:
                return (AccountGetModelsResponseDto) ((dkg) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((qw30) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.b0) ((qw30) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((qw30) obj2).invoke(obj);
            case 9:
                return (gtc0) ((qw30) obj2).invoke(obj);
            case 10:
                return (List) ((qw30) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.e) ((ma) obj2).invoke(obj);
            case 17:
                return (StickersRecommendationBlock) ((wql0) obj2).invoke(obj);
            case 21:
                return (UsersDiscoverPresenter.a) ((emh0) obj2).invoke(obj);
            case 22:
                return (Boolean) ((emh0) obj2).invoke(obj);
            case 23:
                VKApplication.a aVar = VKApplication.c;
                return (Boolean) ((wql0) obj2).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.e) ((c220) obj2).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.t) ((csl0) obj2).invoke(obj);
        }
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        ((vtn0) this.c).b();
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.c;
        mpa mpaVar = settingsGeneralFragment.r0;
        if (mpaVar != null) {
            mpaVar.a(new jbs(settingsGeneralFragment));
            settingsGeneralFragment.y0 = true;
        }
        return true;
    }

    @Override // xsna.i0u0
    public View get() {
        return (View) ((WeakReference) this.c).get();
    }

    @Override // xsna.xlj
    public ViewGroup provide() {
        return ((com.vk.photo.editor.features.markup.text.a) this.c).d.getView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, xsna.rkt0] */
    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(final io.reactivex.rxjava3.core.b bVar) {
        final View view = (View) this.c;
        final int i = view.getResources().getConfiguration().orientation;
        final ?? r2 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.rkt0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (view.getResources().getConfiguration().orientation != i) {
                    bVar.onComplete();
                }
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(r2);
        bVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.skt0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(r2);
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                break;
            case 7:
                int i2 = PhotoListFragment.S0;
                ((PhotoListFragment) obj2).getClass();
                if ((obj instanceof nda0) || (obj instanceof dl1)) {
                }
                break;
            case 15:
                int i3 = StreamInfoFragment.S;
                break;
        }
        return ((Boolean) ((wql0) obj2).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        final g5u0 g5u0Var = (g5u0) this.c;
        final dn20 dn20Var = new dn20(rVar, 4);
        g5u0Var.c.add(dn20Var);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.r140
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                g5u0.this.c.remove(dn20Var);
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.d
    public boolean test(Object obj, Object obj2) {
        return ((Boolean) ((whd) this.c).invoke(obj, obj2)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 13:
                return (Pair) ((wzs) this.c).invoke(obj, obj2);
            default:
                return (Pair) ((whd) this.c).invoke(obj, obj2);
        }
    }
}
