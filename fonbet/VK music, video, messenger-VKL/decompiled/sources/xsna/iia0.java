package xsna;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.dto.hints.HintId;
import com.vk.editor.spoiler.tool.domain.stat.SpoilerStatEvent;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.player.StandalonePlayerFragment;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.newsfeed.impl.discover.themed.ThemedFeedToolbarFragment;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.posting.di.PostingComponent;
import com.vk.posting.presentation.root.PickerRootFragment;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import com.vk.settings.impl.presentation.base.fragment.settings.RedesignNotificationSettingsFragment;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import java.io.File;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.a5g0;
import xsna.l7v;
import xsna.mbc0;
import xsna.nyd0.o;
import xsna.qbk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class iia0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iia0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        OperativeEventObserver initialize$lambda$220$lambda$145;
        View childAt;
        File createDataStore$lambda$3;
        int i = this.b;
        SpoilerStatEvent.BlurType blurType = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = PickerRootFragment.W;
                return ((PostingComponent) ((k7m) m7m.f((PickerRootFragment) obj2)).mo408a(fpf0.a(PostingComponent.class))).H6().h();
            case 1:
                rg50 rg50Var = (rg50) obj2;
                rg50Var.C(rg50Var.getIntValue() + 1);
                return s3q0.a;
            case 2:
                return ((BridgeComponent) m7m.d((tma0) obj2).a(fpf0.a(BridgeComponent.class))).p().a();
            case 3:
                ((v020) obj2).a.j0(null);
                return s3q0.a;
            case 4:
                PollEditorFragment pollEditorFragment = (PollEditorFragment) obj2;
                int i3 = PollEditorFragment.X;
                pollEditorFragment.io().c(pollEditorFragment);
                pollEditorFragment.finish();
                return s3q0.a;
            case 5:
                return new cr4((AudioModelsComponent) ((k7m) m7m.f((y1c0) obj2)).a(fpf0.a(AudioModelsComponent.class)));
            case 6:
                return ((y8c0) obj2).c;
            case 7:
                return new mbc0.h((mbc0) obj2);
            case 8:
                return ((PostingComponent) ((k7m) m7m.f((ikc0) obj2)).mo408a(fpf0.a(PostingComponent.class))).H6();
            case 9:
                ((etv0) obj2).b(false);
                return s3q0.a;
            case 10:
                return ((BridgeComponent) ((rkd0) obj2).c.getValue()).t().b();
            case 11:
                return ((nyd0) obj2).new o();
            case 12:
                PublishState.Block block = ((PublishState) obj2).b;
                if (block instanceof PublishState.Upload) {
                    return (PublishState.Upload) block;
                }
                return null;
            case 13:
                ModalAuthHostActivity modalAuthHostActivity = ((QrWithCodeAuthModal) obj2).e;
                if (modalAuthHostActivity != null) {
                    return ((MultiAccountComponent) m7m.a(modalAuthHostActivity).a(fpf0.a(MultiAccountComponent.class))).c();
                }
                throw new IllegalStateException("QrWithCodeAuthModal is not shown");
            case 14:
                return ((ViewGroup) obj2).getContext().getDrawable(R.drawable.vk_icon_star_circle_fill_blue_16);
            case 15:
                RedesignNotificationSettingsFragment.a aVar = RedesignNotificationSettingsFragment.Y;
                Bundle arguments = ((RedesignNotificationSettingsFragment) obj2).getArguments();
                if (arguments == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable("section", NotificationsNotificationSettingsSectionRedesignDto.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = arguments.getParcelable("section");
                    obj = (NotificationsNotificationSettingsSectionRedesignDto) (parcelable2 instanceof NotificationsNotificationSettingsSectionRedesignDto ? parcelable2 : null);
                }
                return (NotificationsNotificationSettingsSectionRedesignDto) obj;
            case 16:
                a5g0 a5g0Var = (a5g0) obj2;
                int i4 = a5g0.k1;
                return new androidx.lifecycle.e0(a5g0Var.getViewModelStore(), new a5g0.g(), a5g0Var instanceof androidx.lifecycle.f ? a5g0Var.getDefaultViewModelCreationExtras() : qbk.a.b);
            case 17:
                initialize$lambda$220$lambda$145 = ServiceProvider.initialize$lambda$220$lambda$145((ServicesRegistry) obj2);
                return initialize$lambda$220$lambda$145;
            case 18:
                return new cfj0((dfj0) obj2);
            case 19:
                hmk0 hmk0Var = (hmk0) obj2;
                dmk0 H = hmk0Var.H();
                v3p v3pVar = hmk0Var.c;
                if (H.b) {
                    blurType = SpoilerStatEvent.BlurType.ONLY_FOR_DONUTS;
                } else if (H.a) {
                    blurType = SpoilerStatEvent.BlurType.FOR_ALL;
                }
                if (blurType != null) {
                    v3pVar.b().b(new SpoilerStatEvent.b(blurType));
                }
                v3pVar.c(true);
                return s3q0.a;
            case 20:
                int i5 = StandalonePlayerFragment.a0;
                return ((PlayerUIComponent) m7m.d((StandalonePlayerFragment) obj2).a(fpf0.a(PlayerUIComponent.class))).Ra();
            case 21:
                Integer num = ((y2l0) obj2).a;
                if (num != null) {
                    return new c3l0(num.intValue());
                }
                return null;
            case 22:
                int i6 = StickersDatabase_Impl.B;
                return new awp0((StickersDatabase_Impl) obj2);
            case 23:
                ((v76) obj2).getBottomControlPanel().f();
                return s3q0.a;
            case 24:
                return (TextView) ((kdm0) obj2).findViewById(R.id.tv_title);
            case 25:
                return ((InfoBridgeComponent) ((k7m) m7m.c(((zim0) obj2).b)).a(fpf0.a(InfoBridgeComponent.class))).t();
            case 26:
                return Float.valueOf(((azl) obj2).I0(kmn0.b));
            case 27:
                ThemedFeedToolbarFragment themedFeedToolbarFragment = (ThemedFeedToolbarFragment) obj2;
                int i7 = ThemedFeedToolbarFragment.a0;
                FragmentActivity activity = themedFeedToolbarFragment.getActivity();
                if (activity != null) {
                    l7v b = pla.e().b();
                    HintId hintId = HintId.INFO_DISCOVER_TOPIC_TAB;
                    if (b.a(hintId.getId())) {
                        TabLayout tabLayout = themedFeedToolbarFragment.W;
                        boolean z = tabLayout != null && tabLayout.getScrollX() == 0;
                        TabLayout tabLayout2 = themedFeedToolbarFragment.W;
                        View childAt2 = tabLayout2 != null ? tabLayout2.getChildAt(0) : null;
                        ViewGroup viewGroup = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
                        if (viewGroup != null && (childAt = viewGroup.getChildAt(1)) != null) {
                            Rect d = w11.d(childAt);
                            if (z && !d.isEmpty() && d.height() == childAt.getHeight()) {
                                l7v b2 = pla.e().b();
                                String id = hintId.getId();
                                b2.getClass();
                                themedFeedToolbarFragment.O = new l7v.b(id, b2, d).j(activity);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 28:
                createDataStore$lambda$3 = UniversalRequestDataStoreProvider.createDataStore$lambda$3((UniversalRequestDataStoreProvider) obj2);
                return createDataStore$lambda$3;
            default:
                return go9.b("Invocation error occurred : ", ((ApiInvocationException) obj2).getMessage());
        }
    }
}
