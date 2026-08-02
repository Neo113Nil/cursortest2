package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.ads.api.di.AdsComponent;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.widget.GalleryRecyclerView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;
import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.music.Thumb;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.cart.impl.cart.ui.emptycart.EmptyCartRootViewHolder;
import com.vk.ecomm.design.view.tile.MarketProductTilePaginatedImagesView;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.web.di.MarketWebComponentImpl;
import com.vk.file_picker.FilePickerFragment;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.importcontacts.impl.presentation.main.fragment.ImportContactsFragment;
import com.vk.libvideo.api.di.OnboardingComponent;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.newsfeed.impl.discover.media.DiscoverMediaTabFragment;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.subscription.api.di.SubscriptionComponent;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import one.video.player.OneVideoPlayer;
import xsna.dzh;
import xsna.e3m;
import xsna.f0p;
import xsna.fss;
import xsna.s1c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class cnh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cnh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        RecyclerView recyclerView;
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((AdsComponent) ((h7m) obj).mo408a(fpf0.a(AdsComponent.class))).Y0();
            case 1:
                ((ryh) obj).b.c(dzh.n.j.a);
                return s3q0.a;
            case 2:
                return ((mtm) obj).c.a(OpenChatListReporter.Span.DIALOGS_ADAPTER_RENDER);
            case 3:
                DiscoverMediaTabFragment discoverMediaTabFragment = (DiscoverMediaTabFragment) obj;
                int i2 = DiscoverMediaTabFragment.t0;
                s1c0.a aVar = new s1c0.a();
                aVar.b = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = discoverMediaTabFragment.mo2getContext();
                aVar.s = sf2Var.a();
                Bundle arguments = discoverMediaTabFragment.getArguments();
                aVar.J = arguments != null && arguments.getBoolean("show_in_lego_theme", false);
                return aVar.a();
            case 4:
                rg50 rg50Var = (rg50) obj;
                rg50Var.C(rg50Var.getIntValue() + 1);
                return s3q0.a;
            case 5:
                f0p.d dVar = ((f0p) obj).L;
                baf0 baf0Var = dVar.t;
                qog0 qog0Var = dVar.u;
                f0p f0pVar = f0p.this;
                i0p i0pVar = f0pVar.B;
                String O0 = i0pVar.O0();
                if (O0 != null) {
                    dVar.b.setThumbs(null);
                    dVar.c.s0(O0);
                    dVar.e.setImageDrawable(qog0Var);
                    dVar.d.setImageDrawable(baf0Var);
                } else {
                    ArrayList arrayList = new ArrayList(f0pVar.I.y0());
                    arrayList.removeAll(i0pVar.L());
                    List<Thumb> I = i0pVar.I(arrayList);
                    if (I.isEmpty()) {
                        dVar.b.getHierarchy().reset();
                        dVar.b.setThumbs(null);
                        dVar.c.setImageDrawable(null);
                        dVar.e.setImageDrawable(null);
                        dVar.d.setImageDrawable(dVar.s);
                    } else {
                        dVar.b.setThumbs(I);
                        dVar.c.setImageDrawable(null);
                        dVar.e.setImageDrawable(qog0Var);
                        dVar.d.setImageDrawable(baf0Var);
                    }
                }
                EditText editText = dVar.g;
                String str = dVar.m;
                if (str == null) {
                    str = i0pVar.getTitle();
                }
                editText.setText(str);
                EditText editText2 = dVar.g;
                editText2.setSelection(editText2.getText().length());
                if (i0pVar.g0()) {
                    bwt0.p0(dVar.h, false);
                    bwt0.p0(dVar.k, false);
                    bwt0.p0(dVar.i, true);
                    bwt0.p0(dVar.j, true);
                    bwt0.p0(dVar.l, true);
                    bwt0.p0(dVar.f, false);
                    if (i0pVar.f0()) {
                        dVar.j.setText(f0pVar.getContext().getString(R.string.music_chat_playlist_owner, i0pVar.A()));
                    } else {
                        dVar.j.setText(i0pVar.A());
                    }
                } else {
                    bwt0.p0(dVar.h, true);
                    bwt0.p0(dVar.k, true);
                    bwt0.p0(dVar.i, false);
                    bwt0.p0(dVar.j, false);
                    bwt0.p0(dVar.l, false);
                    dVar.c();
                    EditText editText3 = dVar.h;
                    String str2 = dVar.n;
                    if (str2 == null) {
                        str2 = i0pVar.getDescription();
                    }
                    editText3.setText(str2);
                }
                return null;
            case 6:
                ((EmptyCartRootViewHolder) obj).t.d();
                return s3q0.a;
            case 7:
                ((EntriesListFragment) obj).d0.s = null;
                return s3q0.a;
            case 8:
                FilePickerFragment filePickerFragment = (FilePickerFragment) obj;
                int i3 = FilePickerFragment.m0;
                File file = filePickerFragment.h0;
                if (file == null) {
                    filePickerFragment.qo();
                } else {
                    filePickerFragment.po(file);
                }
                return s3q0.a;
            case 9:
                cjs cjsVar = (cjs) obj;
                cjsVar.n.a(epx.f(((RequestUserProfile) cjsVar.m).i0, Boolean.FALSE) ? new fss.e((RequestUserProfile) cjsVar.m) : new fss.b.c((RequestUserProfile) cjsVar.m));
                return s3q0.a;
            case 10:
                int i4 = FriendsCleanupFragment.W;
                return ((SubscriptionComponent) obj).T();
            case 11:
                GalleryRecyclerView galleryRecyclerView = ((GalleryFragmentImpl) obj).a0;
                if (galleryRecyclerView != null && (recyclerView = galleryRecyclerView.getRecyclerView()) != null) {
                    recyclerView.scrollToPosition(0);
                }
                return s3q0.a;
            case 12:
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                ((GoodFragment) obj).Ko();
                return s3q0.a;
            case 13:
                return ((y4u) obj).g.C3();
            case 14:
                int i5 = ImportContactsFragment.Q;
                ((ImportContactsFragment) obj).Mf(-1, null);
                return s3q0.a;
            case 15:
                long a = qni0.a();
                hn70 hn70Var = ((com.vk.update.core.a) obj).l;
                qcy<Object> qcyVar = com.vk.update.core.a.m[0];
                hn70Var.b(a);
                return s3q0.a;
            case 16:
                return ((OneVideoPlayer) obj).f();
            case 17:
                return (VkClientMultiAccountComponent) ((k7m) m7m.f((d7y) obj)).a(fpf0.a(VkClientMultiAccountComponent.class));
            case 18:
                return new rkq0((Lazy) obj);
            case 19:
                t210 t210Var = ((MarketProductTilePaginatedImagesView) obj).k;
                if (t210Var != null) {
                    t210Var.invoke();
                }
                return s3q0.a;
            case 20:
                MarketComponent marketComponent = ((MarketWebComponentImpl) obj).a;
                return new o8q0(marketComponent.Ob(), marketComponent.U1());
            case 21:
                return new com.vk.im.ui.views.avatars.b(((com.vk.im.ui.components.viewcontrollers.msg_list_empty.a) obj).a, true);
            case 22:
                Context a2 = ((fo30) obj).a();
                e3m.a aVar2 = e3m.a;
                return Integer.valueOf(a2.getColor(R.color.vk_clear));
            case 23:
                int i6 = MsgViewFragment.i0;
                Bundle arguments2 = ((MsgViewFragment) obj).getArguments();
                if (arguments2 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = arguments2.getParcelable("owner_id", Peer.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        Parcelable parcelable3 = arguments2.getParcelable("owner_id");
                        parcelable = (Peer) (parcelable3 instanceof Peer ? parcelable3 : null);
                    }
                    Peer peer = (Peer) parcelable;
                    if (peer != null) {
                        return peer;
                    }
                }
                return Peer.Unknown.e;
            case 24:
                return ((BridgeComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.b) obj)).a(fpf0.a(BridgeComponent.class))).p();
            case 25:
                DevicePerformanceInfo devicePerformanceInfo = ((MusicHidingToolbarVh) obj).z;
                if (devicePerformanceInfo == null ? ((int) (Runtime.getRuntime().maxMemory() / ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) >= 420 : devicePerformanceInfo.d.h() >= 2) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 26:
                ((rw40) obj).y.stop(32);
                return s3q0.a;
            case 27:
                return (TextView) ((g850) obj).a.findViewById(R.id.nativeads_description);
            case 28:
                ((nx50) obj).getClass();
                return s3q0.a;
            default:
                return ((OnboardingComponent) j6i.b((h7m) ((yx50) obj).C.getValue(), OnboardingComponent.class)).uc();
        }
    }
}
