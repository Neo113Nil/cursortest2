package xsna;

import android.widget.ImageView;
import com.vk.bridges.ProfileType;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoAlbumVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.libvideo.pip.v2.activity.VideoContainerActivity;
import com.vk.posting.presentation.video.VideoPickerFragment;
import com.vk.splashscreen.api.di.SplashScreenComponent;
import com.vk.superapp.browser.ui.model.PersonalDiscountTransitionFrom;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.ad.a;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.dialog.about.VideoAboutFragment;
import com.vk.voip.ui.qr.ui.VoipQrCodeScannerFragment;
import com.vk.webapp.fragments.VkPayFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import xsna.lne0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class g8n0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g8n0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = true;
        int i2 = 5;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Integer.valueOf(((SuperAppFragment) obj).g0);
            case 1:
                xpn0 xpn0Var = (xpn0) obj;
                xpn0Var.b.c(xpn0Var.i.n);
                return s3q0.a;
            case 2:
                com.vk.core.compose.component.datetime.n nVar = (com.vk.core.compose.component.datetime.n) obj;
                com.vk.core.compose.component.datetime.m mVar = nVar.a;
                InputSelect$State inputSelect$State = (InputSelect$State) ((zak0) nVar.b).getValue();
                return inputSelect$State != null ? inputSelect$State : (!mVar.c() || ((Boolean) nVar.e.getValue()).booleanValue()) ? mVar.a().a ? InputSelect$State.Active : InputSelect$State.Default : InputSelect$State.Error;
            case 3:
                ((com.vk.photo.editor.features.markup.text.a) obj).n = null;
                return s3q0.a;
            case 4:
                ToolbarRedesignVh toolbarRedesignVh = (ToolbarRedesignVh) obj;
                String str = toolbarRedesignVh.m;
                return str == null ? toolbarRedesignVh.b().getString(R.string.video_author_search_hint) : str;
            case 5:
                Boolean bool = (Boolean) ((mtk0) obj).getValue();
                bool.booleanValue();
                return bool;
            case 6:
                ((kfr0) obj).a(PersonalDiscountTransitionFrom.FROM_SNACK_BAR);
                return Boolean.TRUE;
            case 7:
                return VideoAboutFragment.fo((VideoAboutFragment) obj);
            case 8:
                ((com.vk.video.ad.e) obj).b.invoke(a.d.b);
                return s3q0.a;
            case 9:
                VideoAlbumVh videoAlbumVh = (VideoAlbumVh) obj;
                if (videoAlbumVh.f.c0() != ProfileType.RELATED) {
                    ((vqs0) videoAlbumVh.F.getValue()).getClass();
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                int i3 = VideoCatalogFragment.l0;
                return (SplashScreenComponent) m7m.d((VideoCatalogFragment) obj).mo408a(fpf0.a(SplashScreenComponent.class));
            case 11:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) obj;
                int i4 = VideoCatalogRootVh.M0;
                if (videoCatalogRootVh.k0().c0() != ProfileType.RELATED) {
                    ((vqs0) videoCatalogRootVh.D.getValue()).getClass();
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                int i5 = VideoContainerActivity.B;
                return ((VideoContainerActivity) obj).getWindow();
            case 13:
                int i6 = VideoPickerFragment.V;
                z1h0 parentFragment = ((VideoPickerFragment) obj).getParentFragment();
                gia0 gia0Var = parentFragment instanceof gia0 ? (gia0) parentFragment : null;
                if (gia0Var != null) {
                    gia0Var.kh();
                }
                return s3q0.a;
            case 14:
                com.vk.video.profile.presentation.c cVar = (com.vk.video.profile.presentation.c) obj;
                return new e8t0(cVar.A, cVar.k, cVar.f, new o7t0(), new u6t0(), cVar.l, new ud8(cVar, 12), cVar.e);
            case 15:
                ggu0 ggu0Var = (ggu0) obj;
                return new ihu0(ggu0Var, (z380) ggu0Var.F.getValue(), ggu0Var.d, ggu0Var.c, ggu0Var.e, new dbj0(ggu0Var, 20), new vpj0(ggu0Var, 22), new tvs0(ggu0Var, i2));
            case 16:
                DateTimePickerState dateTimePickerState = (DateTimePickerState) obj;
                dateTimePickerState.getClass();
                ((zak0) dateTimePickerState.k).setValue(DateTimePickerState.DialogState.Closed.b);
                return s3q0.a;
            case 17:
                int i7 = VkPayFragment.g0;
                return new xuv0(new ivs0((VkPayFragment) obj, i2));
            case 18:
                return new bzb0(((lcw0) obj).a.requireContext());
            case 19:
                int i8 = VoipQrCodeScannerFragment.W;
                ((VoipQrCodeScannerFragment) obj).S.onNext(lne0.c.a);
                return s3q0.a;
            default:
                int i9 = WriteBar.h0;
                return (ImageView) ((WriteBar) obj).findViewById(R.id.writebar_record_audio);
        }
    }
}
