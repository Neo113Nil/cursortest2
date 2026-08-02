package xsna;

import android.content.Context;
import com.vk.clips.design.view.timeline.MultiVideoTimelineView;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.log.L;
import com.vk.superapp.miniapps.picker.AppsPickerFragment;
import com.vk.toggle.debug.BaseDebugTogglesFragment;
import com.vk.topics.impl.fragments.BoardTopicsFragment;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class jv implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                fw fwVar = (fw) obj2;
                Context context = fwVar.a.i0.getContext();
                cmf0.d(context, fwVar.a.i0.getWindow(), j03.g(context, (Throwable) obj, R.string.error), false, iah0.a(88), true);
                break;
            case 1:
                ((com.vk.movika.sdk.base.observable.q) obj2).invoke(obj);
                break;
            case 2:
                ((defpackage.m) obj2).invoke(obj);
                break;
            case 3:
                ((ku1) obj2).invoke(obj);
                break;
            case 4:
                bpn0 bpn0Var = AppsPickerFragment.V;
                ((com.vk.movika.sdk.base.observable.q) obj2).invoke(obj);
                break;
            case 5:
                ((ku1) obj2).invoke(obj);
                break;
            case 6:
                int i2 = BaseDebugTogglesFragment.X;
                ((com.vk.movika.sdk.base.observable.q) obj2).invoke(obj);
                break;
            case 7:
                int i3 = BoardTopicsFragment.S0;
                ((jj7) obj2).invoke(obj);
                break;
            case 8:
                qh8 qh8Var = (qh8) obj2;
                qh8Var.getClass();
                L.i((Throwable) obj);
                qh8Var.C = null;
                break;
            case 9:
                ((yo8) obj2).invoke(obj);
                break;
            case 10:
                ((n9b) obj2).invoke(obj);
                break;
            case 11:
                ((com.vk.movika.sdk.base.observable.q) obj2).invoke(obj);
                break;
            case 12:
                ((com.vk.movika.sdk.base.observable.q) obj2).invoke(obj);
                break;
            case 13:
                ((com.vk.movika.sdk.base.observable.q) obj2).invoke(obj);
                break;
            case 14:
                ClipsFavoritesFoldersPickerFragment.a aVar = ClipsFavoritesFoldersPickerFragment.V;
                ((j5) obj2).invoke(obj);
                break;
            case 15:
                int i4 = ClipsGridDraftsListFragment.l0;
                ((bx9) obj2).invoke(obj);
                break;
            case 16:
                ((uw4) obj2).invoke(obj);
                break;
            case 17:
                ((dfg) obj2).invoke(obj);
                break;
            case 18:
                ((dwg) obj2).invoke(obj);
                break;
            case 19:
                ((dwg) obj2).invoke(obj);
                break;
            case 20:
                ((ku1) obj2).invoke(obj);
                break;
            case 21:
                int i5 = FriendsImportFragment.a0;
                ((wh1) obj2).invoke(obj);
                break;
            case 22:
                ((dwg) obj2).invoke(obj);
                break;
            case 23:
                ((wh1) obj2).invoke(obj);
                break;
            case 24:
                ((dwg) obj2).invoke(obj);
                break;
            case 25:
                ((dwg) obj2).invoke(obj);
                break;
            case 26:
                ((o010) obj2).invoke(obj);
                break;
            case 27:
                int i6 = MultiVideoTimelineView.y0;
                ((ku1) obj2).invoke(obj);
                break;
            default:
                ((o010) obj2).invoke(obj);
                break;
        }
    }
}
