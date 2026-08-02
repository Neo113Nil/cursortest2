package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class lo70 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lo70(VideoAutoPlay videoAutoPlay, boolean z, qjo0 qjo0Var) {
        this.b = 2;
        this.d = videoAutoPlay;
        this.c = z;
        this.e = qjo0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [xsna.po70] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                b.InterfaceC2004b interfaceC2004b = (b.InterfaceC2004b) this.d;
                final Conversation conversation = (Conversation) this.e;
                final AddParticipantsResult addParticipantsResult = (AddParticipantsResult) obj;
                if (!addParticipantsResult.getBannedParticipantIds().isEmpty()) {
                    Collection<ParticipantId> bannedParticipantIds = addParticipantsResult.getBannedParticipantIds();
                    ArrayList arrayList = new ArrayList(c5g.u(bannedParticipantIds, 10));
                    Iterator<T> it = bannedParticipantIds.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new UserId(Long.parseLong(((ParticipantId) it.next()).id)));
                    }
                    if (OKVoipEngine.b.isMeCreatorOrAdmin()) {
                        final boolean z = this.c;
                        interfaceC2004b.a(arrayList, new gzs() { // from class: xsna.po70
                            @Override // xsna.gzs
                            public final Object invoke() {
                                Conversation.addParticipants$default(Conversation.this, addParticipantsResult.getBannedParticipantIds(), Boolean.TRUE, z, null, null, 24, null);
                                return s3q0.a;
                            }
                        });
                    } else {
                        interfaceC2004b.a(arrayList, null);
                    }
                } else if (!addParticipantsResult.getAccepted().isEmpty()) {
                    Collection<ParticipantId> rejectedParticipantsIds = addParticipantsResult.getRejectedParticipantsIds();
                    ArrayList arrayList2 = new ArrayList(c5g.u(rejectedParticipantsIds, 10));
                    Iterator<T> it2 = rejectedParticipantsIds.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new UserId(Long.parseLong(((ParticipantId) it2.next()).id)));
                    }
                    interfaceC2004b.b(arrayList2);
                }
                break;
            case 1:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                cVar.r(!r3.b);
                cVar.q(cVar.k() + cVar.i());
                ((k6i0) this.e).g.invoke(((AlbumsRepository.a) obj).a, Boolean.valueOf(this.c));
                break;
            case 2:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.d;
                qjo0 qjo0Var = (qjo0) this.e;
                VideoAutoPlay.e eVar = (VideoAutoPlay.e) obj;
                VideoFile videoFile = eVar.a;
                m7q m7qVar = eVar.b;
                videoAutoPlay.N(videoFile);
                videoAutoPlay.C1(m7q.a(m7qVar, null, null, null, 0, false, this.c, null, 0L, null, null, false, 134152191));
                if (((d3b0) qjo0Var.invoke()) != null) {
                    videoAutoPlay.D1(VideoAutoPlay.AutoPlayState.PAUSED_WEAK);
                } else if (videoAutoPlay.x != VideoAutoPlay.AutoPlayState.PLAY) {
                    videoAutoPlay.k1();
                }
                break;
            default:
                w6w0 w6w0Var = (w6w0) this.d;
                StickerStockItem I = w6w0Var.b.I(((VmojiStickerPackPreviewModel) this.e).b);
                if (I != null) {
                    w6w0Var.b.V0(I, this.c, new zh3(10));
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lo70(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }
}
