package xsna;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.clips.attachments.api.publish.links.ClipsLinksAttachEntryParams;
import com.vk.clips.attachments.impl.publish.links.ClipsLinksControllerRootFragment;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.photos.ui.editalbum.domain.g;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.voip.ui.push.AddressedMessageProvider;
import com.vk.voip.ui.push.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import xsna.sdo;
import xsna.tvw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class xt9 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xt9(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((zt9) this.c).v((ImageBlock) this.d, (ConstraintLayout) this.e);
                return s3q0.a;
            case 1:
                ClipsLinksControllerRootFragment clipsLinksControllerRootFragment = (ClipsLinksControllerRootFragment) this.c;
                ClipsLinkAttachment clipsLinkAttachment = (ClipsLinkAttachment) this.d;
                ClipsLinksAttachEntryParams clipsLinksAttachEntryParams = (ClipsLinksAttachEntryParams) this.e;
                clipsLinksControllerRootFragment.O = null;
                Context requireContext = clipsLinksControllerRootFragment.requireContext();
                String str = clipsLinkAttachment.c;
                if (str == null) {
                    str = clipsLinksAttachEntryParams.c;
                }
                String str2 = clipsLinkAttachment.b;
                if (str2 == null) {
                    str2 = clipsLinksAttachEntryParams.b;
                }
                clipsLinksControllerRootFragment.eo(requireContext, new ClipsLinksAttachEntryParams(str2, str, clipsLinksAttachEntryParams.d, clipsLinksAttachEntryParams.e));
                return s3q0.a;
            case 2:
                png pngVar = (png) this.c;
                JSONObject jSONObject = (JSONObject) this.d;
                String str3 = (String) this.e;
                ((tvw0) pngVar.i.getValue()).a(new tvw0.a(jSONObject, str3));
                com.vk.voip.ui.push.a aVar = ((com.vk.voip.ui.push.b) pngVar.g.getValue()).a;
                aVar.c.getClass();
                UserId userId = AddressedMessageProvider.a(str3, jSONObject).b;
                a.C2070a c2070a = aVar.b;
                c2070a.getClass();
                boolean z = false;
                boolean z2 = BuildInfo.s() || (!BuildInfo.t() ? (c2070a.a(userId) && j6i.a().i().c(false)) || (j6i.a().g().i(userId) && j6i.a().g().c(false)) : c2070a.a(userId) && j6i.a().i().c(false));
                boolean b = ((msn) aVar.a.getValue()).b();
                boolean z3 = !b;
                if (z2 && !b) {
                    z = true;
                }
                L.A("IncomingPushFilterImpl", "Got incoming push message of type " + str3 + ", should handle by app: " + z2 + ", should handle by dnd: " + z3);
                if (z) {
                    AddressedMessageProvider.AddressedMessage a = AddressedMessageProvider.a(str3, jSONObject);
                    UserId userId2 = a.b;
                    L.A("IncomingPushHandler", "Handle message from " + str3 + " to user " + userId2);
                    b25 a2 = o25.a();
                    AddressedMessageProvider.AddressedMessage.Type type = a.a;
                    boolean a3 = a2.a(userId2);
                    boolean contains = o25.a().g().contains(userId2);
                    if (!a3 && !BuildInfo.s()) {
                        L.A("IncomingPushHandler", "Ignore inbound notification of type " + type + " to user " + userId2 + ", adressed to inactive user");
                    } else if (!contains) {
                        L.A("IncomingPushHandler", "Ignore inbound notification of type " + type + " to user " + userId2 + ", adressed to unauthorized or unknown user");
                    } else if (type != AddressedMessageProvider.AddressedMessage.Type.CALL) {
                        L.A("IncomingPushHandler", "Ignore inbound notification of type " + type + " to user " + userId2 + ", isCurrentUser=" + a3);
                    } else {
                        JSONObject optJSONObject = jSONObject.optJSONObject("body");
                        if (optJSONObject != null) {
                            com.vk.voip.ui.c.b.getClass();
                            ((ExecutorService) com.vk.voip.ui.c.k.getValue()).submit(new ls80(optJSONObject, userId2, str3));
                        }
                    }
                }
                return s3q0.a;
            case 3:
                izs izsVar = (izs) this.c;
                qdo qdoVar = (qdo) this.d;
                ((wh50) this.e).setValue(Boolean.FALSE);
                izsVar.invoke(new sdo.f(qdoVar.a));
                return s3q0.a;
            case 4:
                PhotoAlbum photoAlbum = (PhotoAlbum) this.c;
                com.vk.photos.ui.editalbum.domain.h hVar = (com.vk.photos.ui.editalbum.domain.h) this.d;
                com.vk.photos.ui.editalbum.domain.c cVar = (com.vk.photos.ui.editalbum.domain.c) this.e;
                if (photoAlbum == null) {
                    com.vk.photos.ui.editalbum.domain.c.i = hVar;
                }
                cVar.g.b(g.d.a);
                return s3q0.a;
            case 5:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) this.c;
                PhotoSmallAdapter photoSmallAdapter = (PhotoSmallAdapter) this.d;
                com.vk.attachpicker.b bVar = (com.vk.attachpicker.b) this.e;
                LinkedHashMap linkedHashMap = galleryFragmentImpl.E0;
                if (linkedHashMap != null) {
                    if (linkedHashMap.isEmpty()) {
                        linkedHashMap = null;
                    }
                    if (linkedHashMap != null) {
                        ArrayList arrayList = ((ListDataSet) photoSmallAdapter.c).d;
                        if (arrayList != null) {
                            Iterator it = arrayList.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i2 = i + 1;
                                if (i < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (!linkedHashMap.isEmpty() && (next instanceof MediaStoreEntry)) {
                                    MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) next;
                                    String lastPathSegment = mediaStoreEntry.f().getLastPathSegment();
                                    if (linkedHashMap.containsKey(lastPathSegment)) {
                                        Integer num = (Integer) linkedHashMap.get(lastPathSegment);
                                        ttp0.c(linkedHashMap).remove(lastPathSegment);
                                        bVar.f(i - photoSmallAdapter.K0(), num, mediaStoreEntry);
                                        if (linkedHashMap.isEmpty()) {
                                            return s3q0.a;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i = i2;
                            }
                        }
                        return s3q0.a;
                    }
                }
                return s3q0.a;
            default:
                one.video.stat2.a aVar2 = (one.video.stat2.a) this.c;
                m7q m7qVar = (m7q) this.d;
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.e;
                StringBuilder sb = new StringBuilder("statSourceUpdated() - isLive changed ");
                sb.append(aVar2.c);
                sb.append(" -> ");
                sb.append(m7qVar.D);
                sb.append(" - isFromOfflineOrOnline changed ");
                m7q m7qVar2 = videoAutoPlay.j0;
                sb.append(m7qVar2 != null ? m7qVar2.r : null);
                sb.append(" -> ");
                m7q m7qVar3 = videoAutoPlay.k0;
                sb.append(m7qVar3 != null ? m7qVar3.r : null);
                sb.append(", generated new vsid ");
                sb.append(videoAutoPlay.K);
                return sb.toString();
        }
    }
}
