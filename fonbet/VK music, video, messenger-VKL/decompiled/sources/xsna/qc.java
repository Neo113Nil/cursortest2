package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.vk.avatarpicker.BaseAvatarPickerActivity;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.feature.music.ui.holder.AudioBookGenreCatalogRootVh;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.clips.design.view.timeline.ClipsEditorVoiceOverRecordButton;
import com.vk.clips.entrypoints.ui.ClipsEntryPointDraftsFragment;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.hints.HintId;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.ecomm.onlinebooking.impl.main.BookingStartScreenFragment;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.im.chat.clips.decoration.api.di.DialogClipsContextScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.community.api.component.CommunityComponent;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stickers.api.di.StickersComponent;
import com.vkontakte.android.R;
import java.util.List;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import xsna.e8v0;
import xsna.oap;
import xsna.tzp0;
import xsna.u6e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        l7m c;
        Object obj;
        Object parcelable;
        Boolean init$lambda$8;
        Object obj2;
        Object parcelable2;
        Object obj3;
        Object parcelable3;
        boolean z = false;
        switch (this.b) {
            case 0:
                View view = ((uc) this.c).c;
                if (view == null || (c = m7m.c(view)) == null) {
                    return null;
                }
                DonutVideoComponent donutVideoComponent = (DonutVideoComponent) ((k7m) c).a(fpf0.a(DonutVideoComponent.class));
                if (donutVideoComponent != null) {
                    return donutVideoComponent.J();
                }
                return null;
            case 1:
                ((AudioBookGenreCatalogRootVh) this.c).p.d();
                return s3q0.a;
            case 2:
                ((vu4) this.c).D.a();
                return s3q0.a;
            case 3:
                return new nxc0(((dk5) this.c).a);
            case 4:
                BaseAvatarPickerActivity baseAvatarPickerActivity = (BaseAvatarPickerActivity) this.c;
                List<BaseAvatarPickerActivity.ImageSourceAction> list = BaseAvatarPickerActivity.f;
                FragmentManager supportFragmentManager = baseAvatarPickerActivity.getSupportFragmentManager();
                androidx.fragment.app.a b = tk5.b(supportFragmentManager, supportFragmentManager);
                com.vk.avatarpicker.c cVar = new com.vk.avatarpicker.c();
                Bundle bundle = new Bundle();
                bundle.putBoolean("key_without_gif", false);
                cVar.setArguments(bundle);
                b.f(R.id.root_view, cVar, null, 1);
                b.d("gallery");
                b.k(true);
                return s3q0.a;
            case 5:
                ((izs) ((zak0) ((qo7) this.c).b).getValue()).invoke(a.e.c.b);
                return s3q0.a;
            case 6:
                BookingStartScreenFragment bookingStartScreenFragment = (BookingStartScreenFragment) this.c;
                qcy<Object>[] qcyVarArr = BookingStartScreenFragment.S;
                Bundle requireArguments = bookingStartScreenFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("initParams", BookingScreenParams.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable4 = requireArguments.getParcelable("initParams");
                    obj = (BookingScreenParams) (parcelable4 instanceof BookingScreenParams ? parcelable4 : null);
                }
                if (obj != null) {
                    return (BookingScreenParams) obj;
                }
                throw new IllegalStateException("Required value was null.");
            case 7:
                init$lambda$8 = CallAnalyticsInitializer.init$lambda$8((i70) this.c);
                return init$lambda$8;
            case 8:
                return (StickersComponent) ((nmg0) this.c).a(fpf0.a(StickersComponent.class));
            case 9:
                ((gza) this.c).b().e();
                return s3q0.a;
            case 10:
                ChatFragment chatFragment = (ChatFragment) this.c;
                ChatFragment.d dVar = ChatFragment.w1;
                l7m d = m7m.d(chatFragment);
                return ((DialogClipsContextScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), chatFragment.no(), d).a(fpf0.a(DialogClipsContextScopedComponent.class))).z();
            case 11:
                ((bmc) this.c).b.a(ClipItemViewEvent.OwnerClicked.AVATAR);
                return s3q0.a;
            case 12:
                poc pocVar = (poc) this.c;
                tzp0.c.a aVar = poc.l1;
                return Boolean.valueOf(pocVar.requireArguments().getBoolean("force_dark_theme", true));
            case 13:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i = ClipFeedListFragment.a2;
                return clipFeedListFragment.qo().Ff();
            case 14:
                return Boolean.valueOf(!((c9d) this.c).k);
            case 15:
                ClipsEditorVoiceOverRecordButton clipsEditorVoiceOverRecordButton = (ClipsEditorVoiceOverRecordButton) this.c;
                int i2 = ClipsEditorVoiceOverRecordButton.B;
                return clipsEditorVoiceOverRecordButton.findViewById(R.id.clips_editor_voiceover_view_button_record);
            case 16:
                ClipsEntryPointDraftsFragment clipsEntryPointDraftsFragment = (ClipsEntryPointDraftsFragment) this.c;
                int i3 = ClipsEntryPointDraftsFragment.Y;
                m1e Df = clipsEntryPointDraftsFragment.io().Df();
                j5 j5Var = new j5(clipsEntryPointDraftsFragment, 23);
                Df.getClass();
                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                l1e l1eVar = new l1e(j5Var, z ? 1 : 0);
                clipsDraftPersistentStore.getClass();
                ClipsDraftPersistentStore.o(l1eVar);
                return s3q0.a;
            case 17:
                return Boolean.valueOf(u6e.a.a(((l8e) this.c).a) != null);
            case 18:
                ClipsGridDraftsListFragment clipsGridDraftsListFragment = (ClipsGridDraftsListFragment) this.c;
                int i4 = ClipsGridDraftsListFragment.l0;
                return ((ClipsViewerComponent) m7m.d(clipsGridDraftsListFragment).a(fpf0.a(ClipsViewerComponent.class))).gb();
            case 19:
                ClipsInterestsComponentImpl clipsInterestsComponentImpl = (ClipsInterestsComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = ClipsInterestsComponentImpl.o;
                ewy ewyVar = clipsInterestsComponentImpl.m;
                qcy<Object> qcyVar = ClipsInterestsComponentImpl.o[12];
                return new rme((pme) ewyVar.c());
            case 20:
                ClipsStickersView clipsStickersView = (ClipsStickersView) this.c;
                int i5 = ClipsStickersView.Q;
                clipsStickersView.invalidate();
                return s3q0.a;
            case 21:
                ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) this.c;
                String str = ClipsUploadFragmentImpl.a0;
                Bundle arguments = clipsUploadFragmentImpl.getArguments();
                if (arguments != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable3 = arguments.getParcelable("upload_params_sdk", ClipsUploadUiVkNavigator.ClipUploadDataFull.class);
                        obj3 = (Parcelable) parcelable3;
                    } else {
                        Object parcelable5 = arguments.getParcelable("upload_params_sdk");
                        if (!(parcelable5 instanceof ClipsUploadUiVkNavigator.ClipUploadDataFull)) {
                            parcelable5 = null;
                        }
                        obj3 = (ClipsUploadUiVkNavigator.ClipUploadDataFull) parcelable5;
                    }
                    ClipsUploadUiVkNavigator.ClipUploadDataFull clipUploadDataFull = (ClipsUploadUiVkNavigator.ClipUploadDataFull) obj3;
                    if (clipUploadDataFull != null) {
                        return new oap.a(clipUploadDataFull);
                    }
                }
                Bundle arguments2 = clipsUploadFragmentImpl.getArguments();
                if (arguments2 == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = arguments2.getParcelable("upload_params_compact", ClipsUploadUiVkNavigator.ClipUploadDataCompact.class);
                    obj2 = (Parcelable) parcelable2;
                } else {
                    Object parcelable6 = arguments2.getParcelable("upload_params_compact");
                    if (!(parcelable6 instanceof ClipsUploadUiVkNavigator.ClipUploadDataCompact)) {
                        parcelable6 = null;
                    }
                    obj2 = (ClipsUploadUiVkNavigator.ClipUploadDataCompact) parcelable6;
                }
                ClipsUploadUiVkNavigator.ClipUploadDataCompact clipUploadDataCompact = (ClipsUploadUiVkNavigator.ClipUploadDataCompact) obj2;
                if (clipUploadDataCompact != null) {
                    return new oap.b(clipUploadDataCompact);
                }
                return null;
            case 22:
                q7v0 q7v0Var = (q7v0) this.c;
                VkOnboardingCampaign e = q7v0Var.e(HintId.STORIES_AUTO_REPOST_CLIP.getId());
                if (e != null) {
                    q7v0Var.a(e, VkOnboardingType.Highlighter, e8v0.m.b);
                }
                return s3q0.a;
            case 23:
                return (p3p) ((r2g) this.c).e.u();
            case 24:
                nzg nzgVar = (nzg) this.c;
                qcy<Object>[] qcyVarArr3 = nzg.k1;
                return ((CommunityComponent) m7m.d(nzgVar).a(fpf0.a(CommunityComponent.class))).ke();
            case 25:
                ((d4h) this.c).i.invoke(CommunityProfileAction.n.e.i.b);
                return s3q0.a;
            case 26:
                ((cbh) this.c).j.b();
                return s3q0.a;
            case 27:
                bfh bfhVar = (bfh) this.c;
                return new zph(new asg(bfhVar.c, bfhVar.f.e()));
            case 28:
                return new fqh(((lrh) this.c).s());
            default:
                return ((j2j) this.c).itemView.findViewById(R.id.voip_action_group);
        }
    }
}
