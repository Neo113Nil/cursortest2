package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.account.dto.AccountMarkActualizeEmailActionDto;
import com.vk.clips.playlists.folders.root.ClipsPlaylistsFoldersRootFragment;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.VideoAlbum;
import com.vk.dto.common.id.UserId;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ybp;

/* compiled from: ChannelMessagesLinkLongClickHandler.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class i3b extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        FragmentActivity fragmentActivity;
        int i;
        switch (this.b) {
            case 0:
                d3b.a((d3b) this.receiver);
                break;
            case 1:
                ((i9b) this.receiver).g();
                break;
            case 2:
                ((ClipsPlaylistsFoldersRootFragment) this.receiver).dismiss();
                break;
            case 3:
                ((d3h) this.receiver).c.n();
                break;
            case 4:
                ubp ubpVar = (ubp) this.receiver;
                UserId userId = ubpVar.c;
                ubpVar.e.e();
                ubpVar.i = null;
                ubpVar.h = null;
                if (!ubpVar.j && ((fragmentActivity = ubpVar.a) == null || !fragmentActivity.isChangingConfigurations())) {
                    if (ubpVar.f) {
                        ubpVar.a().c(userId);
                    } else {
                        ubpVar.a().b(userId);
                    }
                    AccountMarkActualizeEmailActionDto accountMarkActualizeEmailActionDto = AccountMarkActualizeEmailActionDto.CLOSE;
                    ufx ufxVar = new ufx("account.markActualizeEmail", new ir(0), new qr(0));
                    ufx.k(ufxVar, "action", accountMarkActualizeEmailActionDto.i(), 0, 12);
                    bx2 e = e370.e(ufxVar);
                    e.n = ubpVar.b;
                    e.o = null;
                    bug0.c(rdx0.p(e).subscribe(new z97(new io3(16), 2), new pbp(new fj1(23), 0)));
                    ubpVar.d.invoke(ybp.a.a);
                }
                ubpVar.a().h(userId);
                break;
            default:
                VideoAlbumEditorFragment videoAlbumEditorFragment = (VideoAlbumEditorFragment) this.receiver;
                VkInputSelect vkInputSelect = videoAlbumEditorFragment.b0;
                String valueOf = String.valueOf(vkInputSelect != null ? vkInputSelect.getText() : null);
                VideoAlbum videoAlbum = videoAlbumEditorFragment.g0;
                if (videoAlbum == null && videoAlbumEditorFragment.f0 == null) {
                    UserId userId2 = videoAlbumEditorFragment.h0;
                    String zb = videoAlbumEditorFragment.a0.zb();
                    zzr0 zzr0Var = new zzr0("video.addAlbum", 0);
                    if (userId2.b < 0) {
                        zzr0Var.F(fkq0.e(userId2), "group_id");
                    }
                    zzr0Var.K("title", valueOf);
                    zzr0Var.K("privacy", zb);
                    jx2 jx2Var = new jx2(zzr0Var, new z0s0(videoAlbumEditorFragment, valueOf, videoAlbumEditorFragment.getActivity()));
                    jx2Var.g = videoAlbumEditorFragment.getActivity();
                    jx2Var.a();
                } else {
                    if (videoAlbum != null) {
                        i = videoAlbum.b;
                    } else {
                        com.vk.dto.video.VideoAlbum videoAlbum2 = videoAlbumEditorFragment.f0;
                        if (videoAlbum2 != null) {
                            i = videoAlbum2.b;
                        }
                    }
                    UserId userId3 = videoAlbumEditorFragment.h0;
                    String zb2 = videoAlbumEditorFragment.a0.zb();
                    nis0 nis0Var = new nis0("video.editAlbum");
                    if (userId3.b < 0) {
                        nis0Var.F(fkq0.e(userId3), "group_id");
                    }
                    nis0Var.K("title", valueOf);
                    nis0Var.K("privacy", zb2);
                    nis0Var.C(i, "album_id");
                    jx2 jx2Var2 = new jx2(nis0Var, new a1s0(videoAlbumEditorFragment, valueOf, videoAlbumEditorFragment.getActivity()));
                    jx2Var2.g = videoAlbumEditorFragment.getActivity();
                    jx2Var2.a();
                }
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3b(Object obj, int i) {
        super(0, obj, i9b.class, "archiveChannel", "archiveChannel()V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(0, obj, d3h.class, "handleLiveVideosReload", "handleLiveVideosReload()V", 0);
                break;
            case 4:
            default:
                break;
            case 5:
                super(0, obj, VideoAlbumEditorFragment.class, "onDone", "onDone()V", 0);
                break;
        }
    }
}
