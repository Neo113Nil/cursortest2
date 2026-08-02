package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.design.view.sidecontrols.ClipFeedSideControlsStatic;
import com.vk.clips.editor.voiceover.impl.ClipsEditorVoiceOverAudioRecorder;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.playlists.folders.root.ClipsPlaylistsFoldersRootFragment;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.a;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridOwnerClipsListFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.ui.image.VKImageController;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Peer;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.groups.WarningNotification;
import com.vk.im.ui.components.msg_send.recording.AudioRecordOverlay;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.story.api.di.StoriesComponent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.ukj0;
import xsna.uvd;
import xsna.wyc;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class s1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [android.os.Parcelable] */
    @Override // xsna.gzs
    public final Object invoke() {
        am9 K3;
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        int i2 = 1;
        int i3 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((wh50) obj).setValue(Boolean.TRUE);
                return s3q0.a;
            case 1:
                ((zak0) ((z40) obj).e).setValue(Boolean.valueOf(!r4.c()));
                return s3q0.a;
            case 2:
                ImageView imageView = (ImageView) ((VKImageController) obj).getView();
                imageView.setLayoutParams(cpy.a(-1, -1, 0, 0, 0, 0, 60));
                return imageView;
            case 3:
                int i4 = AlbumDetailsFragment.p0;
                return ((AlbumDetailsFragment) obj).ho().i3();
            case 4:
                int i5 = AlbumsFragment.j0;
                return (SharingComponent) m7m.d((AlbumsFragment) obj).a(fpf0.a(SharingComponent.class));
            case 5:
                return ((wco0) obj).L();
            case 6:
                int i6 = AppChannelFragment.l1;
                io.reactivex.rxjava3.subjects.d O0 = io.reactivex.rxjava3.subjects.d.O0(WarningNotification.NONE);
                io.reactivex.rxjava3.subjects.d<Group> dVar = ((AppChannelFragment) obj).no().b;
                dVar.getClass();
                new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).U(new d22(new z13(i3), i2)).subscribe(O0);
                return O0;
            case 7:
                AudioRecordOverlay audioRecordOverlay = (AudioRecordOverlay) obj;
                int i7 = AudioRecordOverlay.w;
                View rootView = audioRecordOverlay.getRootView();
                int i8 = audioRecordOverlay.t;
                View findViewById = rootView.findViewById(i8);
                if (findViewById == null) {
                    com.vk.metrics.eventtracking.b.a.q(new IllegalStateException(lhg.a(i8, "Can't find target view with id ")));
                }
                return findViewById;
            case 8:
                return ((StoryEditorComponent) ((k7m) m7m.f((u440) obj)).a(fpf0.a(StoryEditorComponent.class))).H8();
            case 9:
                j96 j96Var = (j96) obj;
                return new xjm0(j96Var.getStickersDrawingView(), (b96) j96Var.f.invoke());
            case 10:
                return new bqz0(((oh6) obj).j);
            case 11:
                return ((BookingEditScreenState.InfoBlock) ((mtk0) obj).getValue()).d;
            case 12:
                CameraUIView cameraUIView = (CameraUIView) obj;
                float f = CameraUIView.w1;
                bm9 presenter = cameraUIView.getPresenter();
                if (presenter != null && (K3 = presenter.K3()) != null) {
                    Context context = cameraUIView.getContext();
                    StoryPublishEvent storyPublishEvent = StoryPublishEvent.CAMERA_ACCESS_AUTHORIZED;
                    bm9 presenter2 = cameraUIView.getPresenter();
                    K3.e(context, storyPublishEvent, presenter2 != null ? presenter2.c4() : null);
                }
                return s3q0.a;
            case 13:
                return (oul0) ((PropertyReference0Impl) obj).get();
            case 14:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                int i9 = ChannelFragment.a1;
                alm almVar = new alm(channelFragment.V0, channelFragment.V, channelFragment.U.u, null);
                almVar.c(channelFragment.getLifecycle());
                return almVar;
            case 15:
                int i10 = ChatClipsReplyFragment.T;
                Bundle requireArguments = ((ChatClipsReplyFragment) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("owner_id", Peer.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable3 = requireArguments.getParcelable("owner_id");
                    parcelable = (Peer) (parcelable3 instanceof Peer ? parcelable3 : null);
                }
                Peer peer = (Peer) parcelable;
                return peer == null ? Peer.Unknown.e : peer;
            case 16:
                com.vk.im.ui.components.msg_list.a aVar = ((ChatFragment) obj).H0;
                if (aVar == null) {
                    aVar = null;
                }
                Dialog f2 = aVar.O0.f();
                if (f2 != null) {
                    return Boolean.valueOf(f2.Ic());
                }
                return null;
            case 17:
                return ((StoriesComponent) ((k7m) m7m.f((qkc) obj)).a(fpf0.a(StoriesComponent.class))).w();
            case 18:
                jmc jmcVar = (jmc) obj;
                LinearLayout linearLayout = jmcVar.b;
                ykj0 controlsUseCases = jmcVar.getControlsUseCases();
                xkj0 sideControlsFactory = jmcVar.getSideControlsFactory();
                byg0 customSideControlsConfig = jmcVar.getCustomSideControlsConfig();
                if (customSideControlsConfig == null) {
                    com.vk.clips.design.view.sidecontrols.b bVar = new com.vk.clips.design.view.sidecontrols.b(linearLayout);
                    xr8 a = bVar.a(sideControlsFactory.l1(), controlsUseCases.e(), ClipFeedSideControlsStatic.LIKES);
                    xr8 a2 = bVar.a(sideControlsFactory.c1(), controlsUseCases.d(), ClipFeedSideControlsStatic.COMMENTS);
                    xr8 a3 = bVar.a(sideControlsFactory.c(), controlsUseCases.b(), ClipFeedSideControlsStatic.SHARE);
                    xr8 a4 = bVar.a(sideControlsFactory.a(), controlsUseCases.c(), ClipFeedSideControlsStatic.FAVORITES);
                    bVar.c(pki0.a(linearLayout.getContext()));
                    return new wyc(a, bVar.a(sideControlsFactory.b(), controlsUseCases.a(), ClipFeedSideControlsStatic.DISLIKES), a2, a3, a4, bVar.a(sideControlsFactory.d(), controlsUseCases.f(), ClipFeedSideControlsStatic.MORE));
                }
                com.vk.clips.design.view.sidecontrols.b bVar2 = new com.vk.clips.design.view.sidecontrols.b(linearLayout);
                xr8 xr8Var = null;
                xr8 xr8Var2 = null;
                xr8 xr8Var3 = null;
                xr8 xr8Var4 = null;
                xr8 xr8Var5 = null;
                xr8 xr8Var6 = null;
                for (ukj0 ukj0Var : customSideControlsConfig.a) {
                    if (ukj0Var instanceof ukj0.e) {
                        xr8Var = wyc.a.a(((ukj0.e) ukj0Var).a, sideControlsFactory.l1(), ClipFeedSideControlsStatic.LIKES, controlsUseCases.e(), bVar2);
                    } else if (ukj0Var instanceof ukj0.c) {
                        xr8Var2 = wyc.a.a(((ukj0.c) ukj0Var).a, sideControlsFactory.b(), ClipFeedSideControlsStatic.DISLIKES, controlsUseCases.a(), bVar2);
                    } else if (ukj0Var instanceof ukj0.a) {
                        xr8Var3 = wyc.a.a(((ukj0.a) ukj0Var).a, sideControlsFactory.c1(), ClipFeedSideControlsStatic.COMMENTS, controlsUseCases.d(), bVar2);
                    } else if (ukj0Var instanceof ukj0.d) {
                        xr8Var5 = wyc.a.a(((ukj0.d) ukj0Var).a, sideControlsFactory.a(), ClipFeedSideControlsStatic.FAVORITES, controlsUseCases.c(), bVar2);
                    } else if (ukj0Var instanceof ukj0.f) {
                        xr8Var6 = wyc.a.a(((ukj0.f) ukj0Var).a, sideControlsFactory.d(), ClipFeedSideControlsStatic.MORE, controlsUseCases.f(), bVar2);
                    } else if (ukj0Var instanceof ukj0.g) {
                        bVar2.c(pki0.a(linearLayout.getContext()));
                    } else if (ukj0Var instanceof ukj0.h) {
                        xr8Var4 = wyc.a.a(((ukj0.h) ukj0Var).a, sideControlsFactory.c(), ClipFeedSideControlsStatic.SHARE, controlsUseCases.b(), bVar2);
                    } else if (!(ukj0Var instanceof ukj0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return new wyc(xr8Var, xr8Var2, xr8Var3, xr8Var4, xr8Var5, xr8Var6);
            case 19:
                ((lrc) obj).b = null;
                return s3q0.a;
            case 20:
                SdkClipVideoFile sdkClipVideoFile = ((m0d) obj).a;
                ClipVideoFileAdapter copy = sdkClipVideoFile.copy();
                CharSequence U6 = sdkClipVideoFile.U6();
                ClipVideoFile clipVideoFile = copy.m;
                clipVideoFile.U1 = U6;
                clipVideoFile.V1 = sdkClipVideoFile.L5();
                clipVideoFile.W1 = sdkClipVideoFile.S6();
                return copy;
            case 21:
                return ((CameraClipsComponent) ((jpd) obj).e.i.getValue()).c4();
            case 22:
                return new uvd.a((ClipsUploadSdkUploaderComponent) obj);
            case 23:
                return Float.valueOf(((eyd) obj).c.getState().g.b);
            case 24:
                com.vk.clips.editor.voiceover.impl.a aVar2 = (com.vk.clips.editor.voiceover.impl.a) obj;
                ClipsEditorVoiceOverAudioRecorder clipsEditorVoiceOverAudioRecorder = new ClipsEditorVoiceOverAudioRecorder(aVar2.a);
                clipsEditorVoiceOverAudioRecorder.c = new od3(aVar2, 9);
                clipsEditorVoiceOverAudioRecorder.d = new u40(aVar2, 16);
                return clipsEditorVoiceOverAudioRecorder;
            case 25:
                qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                return (BridgeComponent) m7m.d((ClipsGridFragment) obj).a(fpf0.a(BridgeComponent.class));
            case 26:
                int i11 = ClipsGridOwnerClipsListFragment.o0;
                return Boolean.valueOf(((ClipsGridOwnerClipsListFragment) obj).requireArguments().getBoolean("ClipsGridListFragment.force_dark_theme_for_placeholder", false));
            case 27:
                ClipsPlaylistPickerFragment clipsPlaylistPickerFragment = (ClipsPlaylistPickerFragment) obj;
                int i12 = ClipsPlaylistPickerFragment.V;
                clipsPlaylistPickerFragment.getClass();
                xn50.a.c(clipsPlaylistPickerFragment, a.C0631a.b);
                return s3q0.a;
            case 28:
                ClipsPlaylistsFoldersRootFragment.a aVar3 = ClipsPlaylistsFoldersRootFragment.S;
                return ((ClipsPlaylistsComponent) ((k7m) m7m.f((ClipsPlaylistsFoldersRootFragment) obj)).mo408a(fpf0.a(ClipsPlaylistsComponent.class))).e();
            default:
                return new aie(((ClipsViewerComponentImpl) obj).a.Re());
        }
    }
}
