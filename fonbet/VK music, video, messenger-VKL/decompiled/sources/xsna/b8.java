package xsna;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.preference.Preference;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.data.VKList;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vkontakte.android.R;
import kotlin.Pair;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.participant.current.CurrentParticipantMediaChangedReporter;
import xsna.eeu0;
import xsna.h7u0;
import xsna.ig3;
import xsna.ihz;
import xsna.jza0;
import xsna.osh;
import xsna.rls;
import xsna.wfu;
import xsna.xkh;
import xsna.y6u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b8 implements io.reactivex.rxjava3.functions.l, SwipeDrawableRefreshLayout.g, PhotoFlowToolbarView.b, CurrentParticipantMediaChangedReporter.Listener, io.reactivex.rxjava3.functions.b, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.g, Preference.c, ihz.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((com.vk.movika.tools.controls.seekbar.l) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((f07) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (osh.a) ((msh) this.c).invoke(obj, obj2, obj3);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        final DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        o2l.a.getClass();
        final int i = com.vk.core.preference.Preference.j().getInt("__dbg_music_ad_banner_test_slot_id", 0);
        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(debugDevSettingsFragment.requireContext()));
        c2801a.b = "Music ad player banner test slot id";
        c2801a.s = new wzs(debugDevSettingsFragment, i) { // from class: xsna.n3l
            public final /* synthetic */ int b;

            {
                this.b = i;
            }

            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                EditText editText = (EditText) obj;
                TextView textView = (TextView) obj2;
                String[] strArr2 = DebugDevSettingsFragment.t0;
                editText.setInputType(2);
                editText.setHint("Slot id");
                int i2 = this.b;
                editText.setText(i2 != 0 ? lhg.a(i2, "") : "");
                editText.addTextChangedListener(new s4l(textView));
                return null;
            }
        };
        c2801a.c(R.string.ok, new y5(debugDevSettingsFragment, 3), true);
        c2801a.g();
        return true;
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        switch (this.b) {
            case 1:
                ((AbsFriendsAndFollowersTabFragment) this.c).U.b(rls.d.a);
                break;
            default:
                CatalogRecyclerPaginatedView.setRefreshDelegate$lambda$0((CatalogRecyclerPaginatedView) this.c);
                break;
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        fwa0 fwa0Var = (fwa0) this.c;
        ((jza0.b) obj).onPlayerStateChanged(fwa0Var.l, fwa0Var.e);
    }

    @Override // com.vk.content.design.view.photo.flow.PhotoFlowToolbarView.b
    public void onClick(View view) {
        ((nj3) this.c).d.invoke(ig3.j.b);
    }

    @Override // ru.ok.android.webrtc.participant.current.CurrentParticipantMediaChangedReporter.Listener
    public void onCurrentUserChanged() {
        ((CallParticipants) this.c).notifyCurrentParticipantChanged();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 11:
                return ((Boolean) ((py) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((nhe) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((a8) obj2).invoke(obj);
            case 1:
            case 3:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 13:
            case 16:
            case 18:
            case 20:
            default:
                int i2 = MarketEditAlbumGoodsFragment.c1;
                return (io.reactivex.rxjava3.core.t) ((ki4) obj2).invoke(obj);
            case 2:
                return (nk60) ((a8) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((a8) obj2).invoke(obj);
            case 5:
                return (VKList) ((py) obj2).invoke(obj);
            case 8:
                return (wy9) ((xv2) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.b0) ((cae) obj2).invoke(obj);
            case 14:
                return (wfu.a) ((py) obj2).invoke(obj);
            case 15:
                return ((xkh.d) obj2).invoke(obj);
            case 17:
                return (Boolean) ((py) obj2).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.b0) ((nhe) obj2).invoke(obj);
            case 21:
                return (ptk) ((py) obj2).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.b0) ((wnr) obj2).invoke(obj);
            case 23:
                int i3 = FriendsSelectionFragment.w0;
                return (String) ((py) obj2).invoke(obj);
            case 24:
                return (Boolean) ((j0r) obj2).invoke(obj);
            case 25:
                return (w73) ((nhe) obj2).invoke(obj);
            case 26:
                return (y6u.e.c) ((h6u) obj2).invoke(obj);
            case 27:
                return (Dialog) ((m1w) obj2).invoke(obj);
            case 28:
                return (io.reactivex.rxjava3.core.b0) ((fju) obj2).invoke(obj);
        }
    }
}
