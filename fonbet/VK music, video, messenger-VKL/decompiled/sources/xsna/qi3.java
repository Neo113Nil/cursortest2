package xsna;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.Ad;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.theme_chooser.e;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.bbv0;
import xsna.ej3;
import xsna.jpo0;
import xsna.xn50;
import xsna.y8b;

/* compiled from: ArchiveReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class qi3 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ej3 ej3Var = (ej3) obj;
                ((ti3) this.receiver).getClass();
                ej3.a aVar = ej3Var.c;
                VKList<Photo> vKList = aVar.a;
                if (vKList == null) {
                    return null;
                }
                nzo.i(vKList, aVar.d);
                ArrayList arrayList = new ArrayList(c5g.u(vKList, 10));
                for (Photo photo : vKList) {
                    arrayList.add(new y7a0(photo, ej3Var.e ? Boolean.valueOf(aVar.b.contains(photo)) : null, false, photo.Ib()));
                }
                return arrayList;
            case 1:
                MusicTrack musicTrack = (MusicTrack) obj;
                nt4 nt4Var = (nt4) this.receiver;
                int i = nt4.U;
                AudioPlaylistAttachment audioPlaylistAttachment = (AudioPlaylistAttachment) nt4Var.C;
                if (audioPlaylistAttachment != null) {
                    if (nt4Var.N) {
                        cvk.u(R.string.music_playlist_interation_forbidden, false);
                    } else {
                        nt4Var.D.f0(Ad.d);
                        feb0 feb0Var = nt4Var.O;
                        Playlist playlist = audioPlaylistAttachment.f;
                        feb0Var.a.N0(new lqk0(feb0.a(playlist), musicTrack, playlist.y, MusicPlaybackLaunchContext.Fb(audioPlaylistAttachment.g).Db(playlist), 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1008));
                        nt4Var.X6(audioPlaylistAttachment);
                        hd60.a().r1(nt4Var.t6());
                    }
                }
                return s3q0.a;
            case 2:
                return ((afa) this.receiver).a((CatalogSectionResponseObjectDto) obj);
            case 3:
                m8b.X0((m8b) this.receiver, (List) obj);
                return s3q0.a;
            case 4:
                sxp sxpVar = (sxp) obj;
                ((mxb) this.receiver).getClass();
                if (sxpVar instanceof z680) {
                    return y8b.b.a;
                }
                if (sxpVar instanceof y680) {
                    return y8b.a.a;
                }
                throw new IllegalArgumentException("Cannot convert event " + sxpVar);
            case 5:
                xyb xybVar = (xyb) this.receiver;
                zyb zybVar = xybVar.q;
                xybVar.q = zyb.a(zybVar, zybVar.a.Ab((ProfilesInfo) obj), false, false, null, false, null, 1918);
                xybVar.X0();
                azb azbVar = xybVar.A;
                if (azbVar != null) {
                    xybVar.a1(azbVar);
                }
                return s3q0.a;
            case 6:
                wmd wmdVar = (wmd) this.receiver;
                wmdVar.getClass();
                xn50.a.c(wmdVar, (vmd) obj);
                return s3q0.a;
            case 7:
                ((iqf) this.receiver).T((ttf) obj);
                return s3q0.a;
            case 8:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
                int i2 = ClipsWrapperFragment.Q0;
                clipsWrapperFragment.getClass();
                clipsWrapperFragment.go(new o9(11, (ypf) obj, clipsWrapperFragment));
                return s3q0.a;
            case 9:
                ((io.reactivex.rxjava3.subjects.f) this.receiver).onNext((s39) obj);
                return s3q0.a;
            case 10:
                ((myz) this.receiver).T((com.vk.search.params.impl.presentation.modal.location.mvi.model.a) obj);
                return s3q0.a;
            case 11:
                Throwable th = (Throwable) obj;
                nma0 nma0Var = (nma0) this.receiver;
                mma0 mma0Var = nma0Var.e;
                mma0Var.un();
                mma0Var.xn(R.string.vk_common_network_error);
                io.reactivex.rxjava3.disposables.c cVar = nma0Var.l;
                if (cVar != null) {
                    nma0Var.k.a(cVar);
                }
                nma0Var.l = null;
                mma0Var.yn();
                bbv0.g.getClass();
                bbv0.a.c(th);
                return s3q0.a;
            case 12:
                L.i((Throwable) obj);
                return s3q0.a;
            case 13:
                com.vk.im.ui.components.theme_chooser.e eVar = (com.vk.im.ui.components.theme_chooser.e) obj;
                com.vk.im.ui.components.theme_chooser.b bVar = (com.vk.im.ui.components.theme_chooser.b) this.receiver;
                bVar.getClass();
                if (epx.f(eVar, e.b.a)) {
                    bVar.b1(new d220(22));
                } else {
                    int i3 = 2;
                    if (epx.f(eVar, e.d.a)) {
                        bVar.b1(new yml0(i3));
                    } else if (eVar instanceof e.a) {
                        mw5 mw5Var = ((e.a) eVar).a;
                        if (mw5Var instanceof p4t) {
                            View view = bVar.g;
                            Object context = view != null ? view.getContext() : null;
                            FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                            if (fragmentActivity != null) {
                                w2t w2tVar = (w2t) bVar.s.getValue();
                                w2tVar.getClass();
                                io.reactivex.rxjava3.internal.operators.observable.l2 r0 = new io.reactivex.rxjava3.internal.operators.observable.q(new u2t(w2tVar, fragmentActivity)).r0(w2tVar.c);
                                int i4 = 23;
                                bVar.I0(r0.subscribe(new n1r(new m360(bVar, i4), 27), new eiy(new t2b0(1, L.a, L.class, Logger.METHOD_W, "w(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0, 1), i4)));
                            }
                        } else {
                            bVar.b1(new zkj0(4, bVar, mw5Var.a()));
                        }
                    } else if (eVar instanceof e.c) {
                        bVar.b1(new cjk(((e.c) eVar).a.a, 1));
                    } else {
                        if (!(eVar instanceof e.C1161e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jpo0 jpo0Var = ((e.C1161e) eVar).a;
                        if (jpo0Var instanceof jpo0.a) {
                            jpo0.a aVar2 = (jpo0.a) jpo0Var;
                            if (aVar2 instanceof jpo0.a.c) {
                                bVar.b1(new wgc(bVar, aVar2.a));
                            } else {
                                bVar.b1(new ehm0(bVar, i3));
                            }
                        } else {
                            bVar.b1(new wgc(bVar, jpo0Var.a));
                        }
                    }
                }
                return s3q0.a;
            default:
                ((hzw0) this.receiver).T((kzw0) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi3(Object obj, int i) {
        super(1, obj, ti3.class, "mapToPhotoFlowItems", "mapToPhotoFlowItems(Lcom/vk/photos/root/archive/domain/ArchiveState;)Ljava/util/List;", 0);
        this.b = i;
        switch (i) {
            case 12:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
