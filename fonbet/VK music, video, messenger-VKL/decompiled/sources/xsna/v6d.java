package xsna;

import android.os.Parcelable;
import android.view.View;
import com.facebook.soloader.MinElf;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.feed.design.view.newsfeed.banner.VkFeedLegoBanner;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.music.podcast.impl.ui.list.PodcastEpisodesListFragment;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.photo.editor.ivm.EditorMessage;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;
import xsna.mem;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class v6d implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v6d(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DialogHeaderController.b bVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((w6d) obj).e.a(ClipItemViewEvent.d.b);
                break;
            case 1:
                n3g n3gVar = ((r2g) obj).c;
                n2k0 n2k0Var = ((com.vk.photo.editor.ivm.collage.c) ((b8f0) n3gVar.j()).b.getValue()).h;
                if (n2k0Var != null) {
                    com.vk.photo.editor.ivm.d dVar = n3gVar.b;
                    if (dVar == null) {
                        dVar = null;
                    }
                    bc0 i2 = n3g.i(dVar);
                    if (i2 != null) {
                        n3gVar.m(null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap(i2.g.a);
                        linkedHashMap.remove(n2k0Var);
                        com.vk.photo.editor.ivm.d dVar2 = n3gVar.b;
                        if (dVar2 == null) {
                            dVar2 = null;
                        }
                        dVar2.a(new EditorMessage.i(w1g.a(i2, null, null, null, null, null, new g2g(linkedHashMap), null, 191), EditorMessage.Source.UserInput, 4));
                        c5p c5pVar = n3gVar.f;
                        (c5pVar != null ? c5pVar : null).b(CollageStatEvent.m.a);
                        break;
                    }
                }
                break;
            case 2:
                mem.a aVar = ((sem) obj).l;
                if (aVar != null && (bVar = mem.this.t) != null) {
                    DialogHeaderController.this.m(EmptyList.b);
                    break;
                }
                break;
            case 3:
                com.google.android.material.datepicker.g gVar = (com.google.android.material.datepicker.g) obj;
                gVar.X.setEnabled(gVar.Dn().j8());
                gVar.V.toggle();
                gVar.K = gVar.K == 1 ? 0 : 1;
                gVar.In(gVar.V);
                gVar.Gn();
                break;
            case 4:
                do30 do30Var = (do30) obj;
                pk30 pk30Var = do30Var.m;
                eo30 eo30Var = do30Var.l;
                Msg msg = eo30Var != null ? eo30Var.q : null;
                com.vk.im.engine.models.messages.a aVar2 = eo30Var != null ? eo30Var.g : null;
                Parcelable parcelable = eo30Var != null ? eo30Var.s : null;
                AttachAudioMsg attachAudioMsg = parcelable instanceof AttachAudioMsg ? (AttachAudioMsg) parcelable : null;
                if (pk30Var != null && msg != null && aVar2 != null && attachAudioMsg != null) {
                    pk30Var.l(msg, aVar2, attachAudioMsg);
                    break;
                }
                break;
            case 5:
                gzs<s3q0> onClose = ((m870) obj).getOnClose();
                if (onClose != null) {
                    onClose.invoke();
                    break;
                }
                break;
            case 6:
                PodcastEpisodesListFragment podcastEpisodesListFragment = (PodcastEpisodesListFragment) obj;
                int i3 = PodcastEpisodesListFragment.d0;
                ghb0 ghb0Var = (ghb0) podcastEpisodesListFragment.S;
                if (ghb0Var != null) {
                    ((o0r0) podcastEpisodesListFragment.b0.getValue()).m(view.getContext(), ghb0Var.q(), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    break;
                }
                break;
            case 7:
                int i4 = VkFeedLegoBanner.F;
                ((gzs) obj).invoke();
                break;
            default:
                tyv0 tyv0Var = ((com.vk.superapp.verification.account.d) obj).M;
                (tyv0Var != null ? tyv0Var : null).b();
                break;
        }
    }
}
