package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.documents.ui.fragments.DocumentsViewFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dzenarticle.impl.ui.DzenArticleFragment;
import com.vk.ecomm.market.album.MarketEditAlbumGoodVariantsFragment;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.file_picker.FilePickerFragment;
import com.vk.file_picker.external.ExternalFilePickerFragment;
import com.vk.geo.api.data.IconDrawConfig;
import com.vk.geo.impl.di.GeoComponentImpl;
import com.vk.managed_groups.impl.list.ManagedGroupsListFragment;
import com.vk.movika.api.MovikaComponent;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.fragment.impl.MusicArtistCatalogFragment;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.superapp.vksteps.VkStepsBridgeDelegatesFactory;
import com.vk.utils.vectordrawable.EnhancedAnimatedVectorDrawable;
import com.vk.voip.ui.actions.menu.fragments.CallParticipantSettingsFragment;
import com.vk.voip.ui.actions.menu.fragments.NoiseSuppressorModeSelectFragment;
import com.vk.voip.ui.menu.feature.VoipCallMainMenuComponentProvider;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cro;
import xsna.s1c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bfm implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bfm(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [xsna.joq] */
    /* JADX WARN: Type inference failed for: r11v0, types: [xsna.koq] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v1, types: [xsna.ioq] */
    @Override // xsna.gzs
    public final Object invoke() {
        oz50 cVar;
        boolean z;
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                cfm cfmVar = (cfm) obj;
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(cfmVar.f, R.drawable.vk_icon_animated_avd_call_in_progress);
                enhancedAnimatedVectorDrawable.registerAnimationCallback(cqk.b);
                Context context = cfmVar.f;
                com.vk.utils.vectordrawable.a.b(enhancedAnimatedVectorDrawable, "path_1", e3m.f(R.attr.vk_ui_icon_accent_themed, context));
                com.vk.utils.vectordrawable.a.b(enhancedAnimatedVectorDrawable, "path_2", e3m.f(R.attr.vk_ui_accent_green, context));
                return enhancedAnimatedVectorDrawable;
            case 1:
                return ((tgl0) obj).I0().m();
            case 2:
                DocumentsViewFragment documentsViewFragment = (DocumentsViewFragment) obj;
                int i2 = DocumentsViewFragment.x0;
                if (documentsViewFragment.isAdded()) {
                    jbs jbsVar = new jbs(documentsViewFragment);
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (gz80.a(30)) {
                        cVar = new ExternalFilePickerFragment.a();
                        Bundle bundle = cVar.j;
                        bundle.putLong("size_limit", 10737418240L);
                        bundle.putStringArrayList("unavailable_extensions", arrayList);
                    } else {
                        cVar = new FilePickerFragment.c(FilePickerFragment.class, null, null);
                        Bundle bundle2 = cVar.j;
                        bundle2.putLong("size_limit", 10737418240L);
                        bundle2.putStringArrayList("unavailable_extensions", arrayList);
                    }
                    cVar.s(true);
                    cVar.f = false;
                    cVar.i(jbsVar, 103);
                }
                return null;
            case 3:
                rdi.y((ydo) obj, new d0k(6));
                return s3q0.a;
            case 4:
                qcy<Object>[] qcyVarArr = DzenArticleFragment.R;
                ((DzenArticleFragment) obj).fo().b(new cro.i(null, null, null));
                return s3q0.a;
            case 5:
                ((gzs) obj).invoke();
                return s3q0.a;
            case 6:
                final FaveFeedFragment faveFeedFragment = (FaveFeedFragment) obj;
                qcy<Object>[] qcyVarArr2 = FaveFeedFragment.s0;
                return new eoq(faveFeedFragment.go().a, faveFeedFragment.go().a.v, faveFeedFragment.j0, new bin0() { // from class: xsna.ioq
                    @Override // xsna.bin0
                    public final Object get() {
                        qcy<Object>[] qcyVarArr3 = FaveFeedFragment.s0;
                        return FaveFeedFragment.this;
                    }
                }, new bin0() { // from class: xsna.joq
                    @Override // xsna.bin0
                    public final Object get() {
                        return FaveFeedFragment.this.b0;
                    }
                }, new bin0() { // from class: xsna.koq
                    @Override // xsna.bin0
                    public final Object get() {
                        qcy<Object>[] qcyVarArr3 = FaveFeedFragment.s0;
                        return FaveFeedFragment.this.getActivity();
                    }
                });
            case 7:
                return ((androidx.compose.runtime.c) obj).i0();
            case 8:
                return new rpv(((GeoComponentImpl) obj).a, iah0.f().density, dhr0.M() ? IconDrawConfig.z : IconDrawConfig.y, 24);
            case 9:
                return ((y4u) obj).f.F2();
            case 10:
                ((x7u) obj).h6();
                return s3q0.a;
            case 11:
                return ((MovikaComponent) m7m.a(((ibx) obj).s).mo408a(fpf0.a(MovikaComponent.class))).pd();
            case 12:
                return ((l4y) obj).n(VkStepsBridgeDelegatesFactory.DelegateType.STOP_STEPS_PERMISSION);
            case 13:
                Object obj2 = ((r6y) obj).l;
                if (obj2 == null) {
                    return null;
                }
                while (true) {
                    z = obj2 instanceof FragmentActivity;
                    if (!z && (obj2 instanceof ContextWrapper)) {
                        obj2 = ((ContextWrapper) obj2).getBaseContext();
                    }
                }
                return (FragmentActivity) (z ? (Activity) obj2 : null);
            case 14:
                d1z d1zVar = (d1z) obj;
                return new c4k0(new qfj(d1zVar, 15), new w7u(d1zVar, 4));
            case 15:
                return ((whz) obj).getView().findViewById(R.id.load_error_container);
            case 16:
                df00 df00Var = (df00) obj;
                int i3 = 13;
                pvh pvhVar = new pvh(df00Var, i3);
                View view = df00Var.f;
                wk wkVar = df00Var.e;
                if (wkVar != null) {
                    view.removeCallbacks(wkVar);
                }
                wk wkVar2 = new wk(pvhVar, i3);
                df00Var.e = wkVar2;
                view.postDelayed(wkVar2, 600L);
                return s3q0.a;
            case 17:
                int i4 = ManagedGroupsListFragment.X;
                return b6m.d(((ManagedGroupsListFragment) obj).requireContext().getApplicationContext());
            case 18:
                int i5 = MarketEditAlbumGoodVariantsFragment.M0;
                ((MarketEditAlbumGoodVariantsFragment) obj).Fo();
                return s3q0.a;
            case 19:
                return ((cau0) obj).I();
            case 20:
                ((vb20) obj).a.f1();
                return s3q0.a;
            case 21:
                int i6 = MusicArtistCatalogFragment.R;
                Boolean value = ((MusicKidsModeComponent) m7m.d((MusicArtistCatalogFragment) obj).a(fpf0.a(MusicKidsModeComponent.class))).n().isEnabled().getValue();
                value.getClass();
                return value;
            case 22:
                km40 km40Var = (km40) obj;
                km40Var.dismiss();
                km40Var.g1.a.invoke();
                return s3q0.a;
            case 23:
                return Boolean.valueOf(((MusicMyAudiosCatalogRootVh) obj).m.b.b.c(false));
            case 24:
                return ((AdPixelStatsComponent) ((k7m) m7m.f((com.vk.dto.newsfeed.entries.a) obj)).a(fpf0.a(AdPixelStatsComponent.class))).Ed();
            case 25:
                NewsfeedCustomFragment2 newsfeedCustomFragment2 = (NewsfeedCustomFragment2) obj;
                qcy<Object>[] qcyVarArr3 = NewsfeedCustomFragment2.r0;
                s1c0.a aVar = new s1c0.a();
                aVar.b = true;
                aVar.C = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = newsfeedCustomFragment2.i0.get();
                aVar.s = sf2Var.a();
                aVar.H = newsfeedCustomFragment2.eo().i;
                aVar.J = newsfeedCustomFragment2.eo().j;
                return aVar.a();
            case 26:
                u59 u59Var = (u59) obj;
                int i7 = NoiseSuppressorModeSelectFragment.Q;
                CallParticipantSettingsFragment callParticipantSettingsFragment = new CallParticipantSettingsFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("call_main_menu", new VoipCallMainMenuComponentProvider(u59Var));
                callParticipantSettingsFragment.setArguments(bundle3);
                u59Var.c(callParticipantSettingsFragment, true);
                return s3q0.a;
            case 27:
                ((jd80) obj).k.a();
                return s3q0.a;
            case 28:
                return Float.valueOf(((mc90) obj).l());
            default:
                qcy<Object>[] qcyVarArr4 = OrderFragment.Y;
                Bundle requireArguments = ((OrderFragment) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("group_id", UserId.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = requireArguments.getParcelable("group_id");
                    if (!(parcelable3 instanceof UserId)) {
                        parcelable3 = null;
                    }
                    parcelable = (UserId) parcelable3;
                }
                UserId userId = (UserId) parcelable;
                int i8 = requireArguments.getInt("order_id");
                return new gx80(userId, i8 != 0 ? Integer.valueOf(i8) : null, requireArguments.getString("displayed_id"), null, false, false, false, null);
        }
    }
}
