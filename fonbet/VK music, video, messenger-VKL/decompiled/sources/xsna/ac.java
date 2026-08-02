package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource;
import com.vk.auth.ui.VkAuthTextView;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment.c;
import com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vk.clips.viewer.impl.feed.view.subs.selector.ClipsAutoSubtitlesBottomSheet;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.im.channelcreation.impl.di.ChannelCreationInternalDiComponent;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profilelist.impl.fragments.AbsProfileListTabFragment;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.analytics.internal.upload.DbUploader;
import xsna.bph0;
import xsna.k840;
import xsna.mme;
import xsna.xxd0;
import xsna.z4h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ac implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ac(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        String cachedVersion_delegate$lambda$4$lambda$2;
        Object failure;
        Object obj;
        Object parcelable;
        boolean multiUploadHelper_delegate$lambda$0$0;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        switch (this.b) {
            case 0:
                AbsProfileListTabFragment absProfileListTabFragment = (AbsProfileListTabFragment) this.c;
                int i = AbsProfileListTabFragment.P0;
                Bundle arguments = absProfileListTabFragment.getArguments();
                return Boolean.valueOf(arguments != null ? arguments.getBoolean("with_actions") : false);
            case 1:
                ph phVar = (ph) this.c;
                qcy<Object>[] qcyVarArr = ph.n1;
                phVar.getFeature().C(bph0.d.b);
                return s3q0.a;
            case 2:
                ((kn0) this.c).invoke();
                return s3q0.a;
            case 3:
                return new vh0(((z31) this.c).c, AdRequestEvent.RequestType.BRIDGE);
            case 4:
                jm1 jm1Var = (jm1) this.c;
                return jm1Var.c.inflate(R.layout.albums_empty_view_owner, (ViewGroup) jm1Var, false);
            case 5:
                cachedVersion_delegate$lambda$4$lambda$2 = AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4$lambda$2((ClassNotFoundException) this.c);
                return cachedVersion_delegate$lambda$4$lambda$2;
            case 6:
                return Float.valueOf(((s600) this.c).getProgress());
            case 7:
                com.vk.auth.ui.checkaccess.a aVar = (com.vk.auth.ui.checkaccess.a) this.c;
                VkAuthTextView vkAuthTextView = aVar.i;
                if (vkAuthTextView == null) {
                    vkAuthTextView = null;
                }
                vkAuthTextView.setOnClickListener(new bj6(aVar, z2 ? 1 : 0));
                ImageView imageView = aVar.j;
                if (imageView == null) {
                    imageView = null;
                }
                Context mo2getContext = aVar.mo2getContext();
                imageView.setImageDrawable(mo2getContext != null ? enj.e(R.drawable.vk_icon_info_outline_56, R.attr.vk_ui_accent_blue, mo2getContext) : null);
                TextView textView = aVar.r;
                if (textView == null) {
                    textView = null;
                }
                Context mo2getContext2 = aVar.mo2getContext();
                textView.setText(mo2getContext2 != null ? mo2getContext2.getString(R.string.vk_auth_load_not_enough_parameters) : null);
                TextView textView2 = aVar.s;
                if (textView2 == null) {
                    textView2 = null;
                }
                Context mo2getContext3 = aVar.mo2getContext();
                textView2.setText(mo2getContext3 != null ? mo2getContext3.getString(R.string.vk_auth_load_user_has_neither_password_nor_phone) : null);
                VkAuthTextView vkAuthTextView2 = aVar.i;
                if (vkAuthTextView2 == null) {
                    vkAuthTextView2 = null;
                }
                Context mo2getContext4 = aVar.mo2getContext();
                vkAuthTextView2.setText(mo2getContext4 != null ? mo2getContext4.getString(R.string.vk_auth_phone_bind_phone) : null);
                return s3q0.a;
            case 8:
                rul rulVar = (rul) this.c;
                io.reactivex.rxjava3.internal.operators.observable.f0 K = new io.reactivex.rxjava3.internal.operators.observable.i0((io.reactivex.rxjava3.subjects.d) rulVar.s.getValue(), new com.vk.movika.sdk.base.hooks.f(new dj1(z ? 1 : 0), 2)).K();
                io.reactivex.rxjava3.internal.observers.f fVar = new io.reactivex.rxjava3.internal.observers.f();
                K.subscribe(fVar);
                try {
                    failure = (xxd0) fVar.get(rulVar.a.r().H, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                Object obj2 = failure;
                if (a != null) {
                    fVar.cancel(true);
                    obj2 = xxd0.c.a;
                }
                return io.reactivex.rxjava3.subjects.d.O0((xxd0) obj2);
            case 9:
                ((izs) ((zak0) ((ko7) this.c).d).getValue()).invoke(a.InterfaceC0957a.C0958a.b);
                return s3q0.a;
            case 10:
                return Integer.valueOf(((xvy) this.c).h());
            case 11:
                String str = ((laa) this.c).e;
                return Boolean.valueOf(str != null && drm0.D(str, "kids_section", false));
            case 12:
                ChannelCreationInternalDiComponent channelCreationInternalDiComponent = (ChannelCreationInternalDiComponent) this.c;
                qcy<Object>[] qcyVarArr2 = ChannelCreationInternalDiComponent.j;
                a1w a1wVar = q1w.a;
                return new r6k(a1wVar != null ? a1wVar : null, channelCreationInternalDiComponent.Df());
            case 13:
                ChannelFragment channelFragment = (ChannelFragment) this.c;
                int i2 = ChannelFragment.a1;
                return new lxa(channelFragment.mo(), channelFragment.V);
            case 14:
                return Integer.valueOf(((vad) this.c).h.size());
            case 15:
                ClipsAudioFragment clipsAudioFragment = (ClipsAudioFragment) this.c;
                int i3 = ClipsAudioFragment.Y;
                u2b0 a2 = k840.a.g().a();
                a2.P0(clipsAudioFragment.new c(), false);
                return a2;
            case 16:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                ClipsAutoSubtitlesBottomSheet clipsAutoSubtitlesBottomSheet = (ClipsAutoSubtitlesBottomSheet) ref$ObjectRef.element;
                if (clipsAutoSubtitlesBottomSheet != null) {
                    clipsAutoSubtitlesBottomSheet.dismiss();
                }
                ref$ObjectRef.element = null;
                return s3q0.a;
            case 17:
                return (VkPlaceholder) ((cmd) this.c).findViewById(R.id.error_placeholder);
            case 18:
                return t0e.U4((t0e) this.c);
            case 19:
                ClipsFavoritesFoldersPickerFragment clipsFavoritesFoldersPickerFragment = (ClipsFavoritesFoldersPickerFragment) this.c;
                ClipsFavoritesFoldersPickerFragment.a aVar2 = ClipsFavoritesFoldersPickerFragment.V;
                Bundle requireArguments = clipsFavoritesFoldersPickerFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("params", ClipsFavoritesFoldersPickerParams.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("params");
                    obj = (ClipsFavoritesFoldersPickerParams) (parcelable2 instanceof ClipsFavoritesFoldersPickerParams ? parcelable2 : null);
                }
                if (obj != null) {
                    return (ClipsFavoritesFoldersPickerParams) obj;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 20:
                mme.b bVar = (mme.b) this.c;
                mme.b.a aVar3 = bVar.c;
                ClipsGridFragment.a aVar4 = new ClipsGridFragment.a(new ClipGridParams.OnlyId.Profile(aVar3.c));
                String str2 = bVar.b;
                ClipsWrapperInputArguments.a aVar5 = ClipsWrapperInputArguments.r;
                Bundle bundle = aVar4.j;
                aVar5.getClass();
                bundle.putString("ClipsWrapperFragment.clips_wrapper_id_param", str2);
                bundle.putBoolean("ClipsGridFragment.is_parent_fits_system_windows", false);
                boolean z4 = aVar3.a;
                bundle.putBoolean("ClipsGridFragment.is_owner_grid", z4);
                bundle.putBoolean("ClipsGridFragment.is_owner_camera_button_enabled", z4);
                bundle.putBoolean("ClipsGridFragment.force_dark_theme", true);
                aVar4.w(aVar3.b);
                return aVar4.f();
            case 21:
                return new v2g((r2g) this.c);
            case 22:
                return ((Iterable) this.c).iterator();
            case 23:
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) this.c;
                int i4 = CommunityCheckListFragment.Y;
                return new ovg(new dwg((Object) communityCheckListFragment, (int) (z3 ? 1 : 0)), new xcd(communityCheckListFragment, 6), new CommunityCheckListFragment.b(1, communityCheckListFragment, CommunityCheckListFragment.class, "applyAnalyticsEvent", "applyAnalyticsEvent(Lcom/vk/ecomm/checklist/impl/presentation/feature/CommunityCheckListAnalyticsEvent;)V", 0));
            case 24:
                j5h j5hVar = (j5h) this.c;
                CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType communityMenuActionType = CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.EDIT_ITEM;
                j5hVar.B6(false);
                j5hVar.n.invoke(new CommunityProfileAction.CommunityInternalMenuAction(communityMenuActionType, (z4h.a) j5hVar.m, Integer.valueOf(((wak0) j5hVar.o).getIntValue())));
                return s3q0.a;
            case 25:
                f1i f1iVar = (f1i) this.c;
                f1iVar.k1.invoke(((zak0) f1iVar.j1).getValue());
                f1iVar.dismiss();
                return s3q0.a;
            case 26:
                return (TextView) ((gak) this.c).itemView.findViewById(R.id.voip_session_room_time_preset_item);
            case 27:
                ((xhk) this.c).setVisibility(8);
                return s3q0.a;
            case 28:
                multiUploadHelper_delegate$lambda$0$0 = DbUploader.multiUploadHelper_delegate$lambda$0$0((DbUploader) this.c);
                return Boolean.valueOf(multiUploadHelper_delegate$lambda$0$0);
            default:
                return (n9l) ((com.vk.movika.sdk.base.ui.p0) this.c).c;
        }
    }
}
